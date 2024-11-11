package Static;

public class InstanceInStatic {
    int instanceVar = 50;

    public static void staticMethod() {
        InstanceInStatic obj = new InstanceInStatic();  
        System.out.println("Instance variable in static method: " + obj.instanceVar);
    }

    public static void main(String[] args) {
        staticMethod();
    }

    
}
