package Static;

public class InstanceMethodInStatic {
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void staticMethod() {
        InstanceMethodInStatic obj = new InstanceMethodInStatic();  // Create an instance to call instance method
        obj.instanceMethod();
    }

    public static void main(String[] args) {
        staticMethod();
    }
}
