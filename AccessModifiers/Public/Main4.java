package AccessModifiers.Public;

public class Main4 {
    public static void main(String[] args) {
        A4 objA = new A4();
        System.out.println(objA.publicField);  // Access public field
        objA.publicMethod();  // Access public method
    }
}
