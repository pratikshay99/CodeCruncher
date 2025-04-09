package Beginner.advanced;

import java.io.Serializable;

interface markerInterface {
    // No methods, no fields
}

public class MarkerInterface implements markerInterface {
    // Normal class
}

//🔍 Example: Serializable
class Employee implements Serializable {
    int id;
    String name;
}
/**
 * Here, Employee is marked as Serializable, meaning:
 * The JVM knows it can safely serialize/deserialize objects of this class.
 * No methods needed — just the marker is enough.
 */
/*
A Marker Interface is an interface that has no methods or fields — it’s empty.
Its purpose is to mark a class for some special behavior handled by the JVM or frameworks.
It acts like a "tag" or "marker" to give metadata about the class to the JVM or a framework.
Think of it as putting a label on a class so certain logic can treat it differently.
✅ Popular Marker Interfaces in Java:
Interface	Purpose
Serializable	Marks that the object can be serialized
Cloneable	    Marks that object supports cloning via clone()
Remote	        Marks that object can be used in RMI (Remote Method Invocation)
ThreadSafe-     Mark class as thread-safe (semantic meaning)
(user-defined)

⚠️ Important Notes:
Marker interfaces are handled using instanceof checks or reflection.
Java 5 introduced annotations, which are often used instead of marker interfaces today (e.g., @Override, @FunctionalInterface).

Q: Why use marker interface when you can use annotations?
✅Marker interfaces are type-safe — they can be used in instanceof checks and generic bounds (T extends Serializable).
Annotations offer more flexibility, but they are not types — can't be used with instanceof.
 */