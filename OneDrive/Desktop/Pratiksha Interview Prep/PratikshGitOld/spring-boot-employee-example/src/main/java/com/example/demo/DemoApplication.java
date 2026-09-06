package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //@Componentscan + @Configuration + @EnableAutoConfiguration +
/**
 * When app starts, @SpringBootApplication on main class triggers @ComponentScan (it's bundled inside @SpringBootApplication, along with @Configuration and @EnableAutoConfiguration).
 * @ComponentScan tells Spring: starting from package this main class is in, scan every sub-package & look for any class annotated with @Component or its specializations (@Service, @Repository, @RestController, @Controller)
 * scans only same package or sub-package as DemoApplication), Spring finds them automatically at startup.
 */
//@ComponentScan(basePackages = "com.other.package")//. -> class in a totally different package tree not under your main application's package, Spring won't find it
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
/**
 Step 2: What happens once Spring finds these classes?
 For every class it finds annotated @Component/@Service/@Repository/@RestController, Spring:
 Creates an instance of it (calls the constructor — this is where constructor injection kicks in, pulling in whatever dependencies that constructor needs).
 Stores that instance in a container called the ApplicationContext.
 Whenever some other class needs that type (like EmployeeController needing EmployeeService), Spring pulls the already-created instance from the

 Step 3: Why does "instantiates them once" matter — Bean Scopes
 By default, when Spring creates a bean (say EmployeeServiceImpl), it creates it exactly once for the entire application's lifetime, and every class that needs it gets handed the same shared object. This default behavior is called singleton scope.
 singleton (default — what you're using right now, always, unless you say otherwise)

 Every single HTTP request that comes into your app, no matter how many concurrent users hit /api/employees, all reuse the same instance of EmployeeServiceImpl. This is why you must never store request-specific mutable state as an instance field in a @Service — if two users hit it at the same time, they'd corrupt each other's data, since they share the same object in memory.
 When you'd explicitly reach for this: you basically never need to write @Scope("singleton") — it's implicit. You only think about this when explaining why your services must stay stateless.

 Scope	New instance created	Typical use case
 singleton	Once per application	Stateless services, repositories, controllers — 95% of your beans
 prototype	Every time it's injected/requested	Stateful helper objects, report builders
 request	Once per HTTP request	Per-request tracing/context data
 session	Once per user session	Shopping cart, per-user session state

 Interview line if asked "why are your services stateless?":
 "Spring beans are singleton-scoped by default, meaning one shared instance handles every request concurrently. If I stored request-specific data as instance fields, I'd get race conditions between simultaneous users. So all request data flows through method parameters instead, keeping the bean itself stateless and thread-safe."
Issue: solution below after issue :
 @Service
 public class EmployeeServiceImpl implements EmployeeService {
 private Long lastAccessedId;  // BAD — shared mutable state across all users!

 public EmployeeDTO getEmployeeById(Long id) {
 this.lastAccessedId = id;  // race condition if 2 users call this simultaneously
 }
 }
 Need	Solution
 Just used within one method call, no need to remember after	Local variable (Option 1) — this is 90% of real cases
 Needs to persist per logged-in user, across requests	Session-scoped / HttpSession (Option 2)
 Needs to be shared globally across all users, but safely	Thread-safe object like AtomicLong/ConcurrentHashMap (Option 3)
 */



/**
 "This is a layered CRUD app for managing employees.
 The Controller handles HTTP requests and delegates to the Service layer, which contains the business logic.
 The Service talks to the Repository, which extends Spring Data JPA for database operations — so I get save, find, delete for free without writing SQL.
 I use DTOs to avoid exposing my database entity directly through the API, constructor injection for testability, and a
 global exception handler with @RestControllerAdvice so errors return clean HTTP status codes instead of stack traces."

 Opening line (context):
 "I've built a simple layered CRUD application for managing employees, following standard Spring Boot architecture — Controller, Service, Repository, with clean separation of concerns."

 1. Entity layer
 "This is my Employee entity — it's mapped to a database table using @Entity. The id field is auto-generated using GenerationType.IDENTITY, which means the database handles ID generation, similar to auto-increment in MySQL."

 2. DTO layer
 "I don't expose the entity directly through the API — instead I use a EmployeeDTO. This decouples my internal database structure from what's exposed externally, so if my entity changes, my API contract doesn't necessarily break."

 3. Repository layer
 "For persistence, I extend JpaRepository, which gives me built-in CRUD methods like save, findById, findAll, deleteById — no boilerplate SQL needed. I've also added a custom method findByDepartment to show how Spring Data JPA derives queries from method names."

 4. Service layer
 "The business logic sits in the service layer. I use an interface plus an implementation — EmployeeService and EmployeeServiceImpl — so the controller depends on an abstraction, not a concrete class. That makes it easier to mock in unit tests and keeps things loosely coupled. I use constructor injection here instead of field-level @Autowired, since it's more testable and makes dependencies explicit and immutable."

 5. Controller layer
 "The controller only handles HTTP concerns — it delegates everything to the service. I use proper REST conventions: POST returns 201 Created, DELETE returns 204 No Content, and I use ResponseEntity to control status codes explicitly rather than letting Spring guess."

 6. Exception handling
 "For error handling, instead of scattering try-catch blocks across my controller, I centralize it using @RestControllerAdvice with a custom ResourceNotFoundException. So if an employee isn't found, it automatically returns a clean 404 instead of a stack trace."

 Closing line (shows maturity):
 "This structure keeps each layer testable in isolation — I can unit test the service layer by mocking the repository, and test the controller by mocking the service, without needing a real database."

 If they push further, be ready for these follow-ups:

 "Why interface + impl for service if there's only one implementation?" → "It's a convention for loose coupling and easier mocking; also future-proofs it if I need multiple implementations later, e.g. caching layer."
 "Why constructor injection over field injection?" → "Field injection hides dependencies, makes testing harder without reflection, and doesn't allow marking fields final. Constructor injection also fails fast if a dependency is missing."
 "What if two people update the same employee simultaneously?" → opens door to talk about @Version (optimistic locking) if you want bonus points.
 */