package Beginner.OOPS;
class A {
    void show() {
        System.out.println("A");
    }
}

class B {
    void show() {
        System.out.println("B");
    }
}
// ❌ Compilation Error -> Class cannot extend multiple classes

//public class DiamondprblmMultipleInheritance extends A,B{
//}

/*
👉 Why? Because if both A and B have show(), Java won't know which one to inherit — this is the Diamond Problem.
✅ Java Solves This via Interfaces:

💎multiple inheritance, when two parent classes have a method with the same name, and a child inherits both.
❓ Now the child doesn’t know which method to inherit — Parent1 or Parent2?
  This confuses the compiler(ambiguity) — that's the diamond problem.
🔁 Why It’s Called “Diamond”?
      A
     / \
    B   C
     \ /
      D
-D inherits B and C
-B & C inherit A
-If A, B, and C define the same method — which one does D use? ➡️ Diamond Problem.
✅Java doesn’t support multiple inheritance with classes to avoid ambiguity — known as the Diamond Problem — but handles it using interfaces, where conflicts must be explicitly resolved by the class. In interface-✅ No ambiguity — Java forces you to override.
 */