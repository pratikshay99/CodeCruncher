package Beginner.basics;

class Counter {
    static int staticCount = 0;  // Shared by all objects
    int instanceCount = 0;       // Separate for each object
    static int sc = 0;  // Shared by all objects
    int ic = 0;       // Separate for each object

    Counter() {
        staticCount++;   // Increases for ALL objects (shared)
        instanceCount++; // Increases only for THIS object
    }

    void display() {
        System.out.println("Static Count: " + staticCount + ", Instance Count: " + instanceCount);
    }

    void increment() {
        sc++;   // Affects ALL objects
        ic++; // Affects only THIS object
        System.out.println("Method Static Count: " + sc + ", Instance Count: " + ic);
    }
}

public class StaticVarVsInstancVar {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        obj1.display();


        Counter obj2 = new Counter();
        obj2.display();

        Counter obj3 = new Counter();
        obj3.display();

        System.out.println("\nFor 2 objects using method level increment\n");
        obj1.increment();
        obj2.increment();
        obj2.increment();
    }
}
/*
Output:
Static Count: 1, Instance Count: 1
Static Count: 2, Instance Count: 1
Static Count: 3, Instance Count: 1

For 2 objects using method level increment

Method Static Count: 1, Instance Count: 1
Method Static Count: 2, Instance Count: 1
Method Static Count: 3, Instance Count: 2
--------------------------------------------------------------------------------------------------
staticCount is shared across all objects, so it keeps increasing.
staticVar (shared) is incremented globally, so it affects all objects.

instanceCount is separate for each object, so it starts from 1 every time a new object is created.
instanceVar (separate) is incremented per object, so obj1 and obj2 have different values.
 */