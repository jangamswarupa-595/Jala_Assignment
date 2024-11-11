package Static;

public class StaticInInstance {
    static int staticVar = 100;

    public void instanceMethod() {
        System.out.println("Static variable in instance method: " + staticVar);
    }

    public static void main(String[] args) {
        StaticInInstance obj = new StaticInInstance();
        obj.instanceMethod();
    }
}
