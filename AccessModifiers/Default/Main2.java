package AccessModifiers.Default;

import AccessModifiers.Default.A2;

public class Main2 {
     public static void main(String[] args) {
        // Create an object of Class A
        A2 objA = new A2();
        
        // Access default fields and methods from the same package
        System.out.println(objA.defaultField);
        objA.defaultMethod();
    }
}
