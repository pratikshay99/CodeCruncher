package com.example.demo.controller;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    //  @Autowired   // REQUIRED before Spring 4.3, even with just one constructor, pring 4.3+ → if there's exactly one constructor, Spring implicitly uses it for autowiring, @Autowired becomes optional. If there are multiple constructors, you still must explicitly mark one with @Autowired — the ambiguity rule never went away.
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO dto) {
        return new ResponseEntity<>(employeeService.createEmployee(dto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO dto) {
        return ResponseEntity.ok(employeeService.updateEmployee(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
/**
     Controller → Service → Repository → Entity
                      ↑
             converts Entity to DTO here
                    ↓
    Controller ← Service ← DTO

 Client sends HTTP request
 ↓
 @GetMapping/@PostMapping (Controller) — matches URL + verb
 ↓
 @PathVariable / @RequestBody — pulls data out of the request
 ↓
 Controller calls Service (injected via constructor)
 ↓
 Service (business logic) calls Repository
 ↓
 Repository (JpaRepository) talks to database via Entity
 ↓
 Service converts Entity → DTO
 ↓
 Controller wraps DTO in ResponseEntity with a status code
 ↓
 Client receives JSON response
 */