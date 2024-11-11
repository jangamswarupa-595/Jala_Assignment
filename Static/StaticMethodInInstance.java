package Static;

public class StaticMethodInInstance {
    
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public void instanceMethod() {
        staticMethod();  // Directly call static method from instance method
    }

    public static void main(String[] args) {
        StaticMethodInInstance obj = new StaticMethodInInstance();
        obj.instanceMethod();
    }
}
