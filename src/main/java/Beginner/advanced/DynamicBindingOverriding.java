package Beginner.advanced;

class Parent {
    void instanceMethod() {
        System.out.println("Parent's Instance Method");
    }
}

class Child extends Parent {
    @Override
    void instanceMethod() {
        System.out.println("Child's Instance Method");
    }
}

public class DynamicBindingOverriding {
    public static void main(String[] args) {
        Parent obj = new Child(); // Parent reference, Child object
        obj.instanceMethod(); // 🔥 Calls Child's method (Dynamic Binding)
        //OP: Child's Instance Method
    }
}
/*
Instance methods are overridden (Dynamic Binding).
✅ Method is resolved at runtime based on the object type.
Instance methods are resolved based on the actual object type (Child), not the reference type (Parent). Since `obj` is created as `new Child()`, it calls `Child`'s overridden method at runtime (Dynamic Binding).
 */