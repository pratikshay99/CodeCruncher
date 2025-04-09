package Beginner.OOPS;
class Person implements Cloneable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone(); // shallow copy
    }
}
public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Alice", 30);
        Person p2 = p1.clone();

        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age);
        System.out.println(p1 == p2); // false: different objects
    }
}
/**
 * Object Cloning is the process of creating an exact copy of an existing object with the same field values.
 *Java provides this capability using the clone() method of the Object class.
 * 🧠 Key Requirements to Use Cloning:
 * The class must implement Cloneable interface (a marker interface).
 * You must override the clone() method from Object.
 * Use super.clone() inside clone().
 *
 📌 Shallow vs Deep Cloning
 Type	Description
 Shallow	Copies references of objects (default clone())
 Deep	Clones nested objects as well (manual logic)

 🔥 Tricky Interview Questions:
 Q: What happens if a class does not implement Cloneable but clone() is called?
 A: CloneNotSupportedException is thrown.

 Q: Is Cloneable interface empty? Why?
 A: Yes, it's a marker interface. JVM uses it to check if cloning is allowed.

 Q: Why is clone() method protected in Object class?
 A: To force developers to override it and control cloning behavior.

 Q: How do you implement deep cloning?
 A: Either manually clone nested objects or use serialization.

 Q: Alternatives to clone() in real-world code?
 A: Use copy constructors or libraries like Apache Commons SerializationUtils.clone().

 ✅ Quick Summary:
 Use .clone() when you need a copy of an object.

 Implement Cloneable, override clone(), and call super.clone().

 Be careful: default cloning is shallow, not deep.
 */