package Inheritance;

public class Main {
    public static void main(String[] args) {
        // 1. Create object of class A
        A objA = new A();
        objA.methodA1();
        objA.methodA2();
        objA.overriddenMethod();  
        objA.display();  
        System.out.println("\n");

        // 2. Create object of class B
        B objB = new B();
        objB.methodA1();  
        objB.methodA2();  
        objB.methodB1();
        objB.methodB2();
        objB.overriddenMethod(); 
        objB.display();  

        System.out.println("\n");

        // 3. Create object of class C
        C objC = new C();
        objC.methodA1();  
        objC.methodA2();  
        objC.methodB1();  
        objC.methodB2();  
        objC.methodC1();
        objC.methodC2();
        objC.overriddenMethod();  
        objC.display();  

        System.out.println("\n");

        // 4. Runtime Polymorphism: Calling overridden methods using superclass reference
        A objPolymorphismA = new B();
        objPolymorphismA.overriddenMethod();  

        A objPolymorphismB = new C();
        objPolymorphismB.overriddenMethod();  

        // 5. Runtime Polymorphism with Instance Variables
        A objPolyA = new A();
        objPolyA.display();  
        A objPolyB = new B();
        objPolyB.display();  

        A objPolyC = new C();
        objPolyC.display();  
    }
    
}
