package Inheritance;

class C extends B {
    String classCName = "Class C Variable";
    public void methodC1() {
        System.out.println("Method C1 in Class C");
    }
    public void methodC2() {
        System.out.println("Method C2 in Class C");
    }
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden Method in Class C");
    }
    public void display() {
        super.display();
        System.out.println(classCName);
    }
}
