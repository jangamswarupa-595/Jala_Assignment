package AccessModifiers.Private;

public class A1 {
    private String privateField = "Private Field of Class A1";
    private void privateMethod() {
        System.out.println("Private Method of Class A1");
    }

    public void display() {
        System.out.println(privateField);
        privateMethod();
    }
    
}
