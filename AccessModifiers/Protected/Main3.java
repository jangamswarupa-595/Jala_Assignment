package AccessModifiers.Protected;

public class Main3 {
    public static void main(String[] args) {
        A3 objA = new A3();
        System.out.println(objA.protectedField);  
        objA.protectedMethod();  
    }
}
