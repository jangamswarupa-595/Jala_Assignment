package Inheritance;

public class B extends A {
    String classBName = "Class B Variable";
    public void methodB1() {
        System.out.println("Method B1 in Class B");
    }
    public void methodB2() {
        System.out.println("Method B2 in Class B");
    }
    public void overriddenMethod() {
        System.out.println("Overridden Method in Class B");
    }
    public void display() {
        super.display();
        System.out.println(classBName);
    }
    
}
