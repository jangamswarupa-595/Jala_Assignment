package AccessModifiers.Private;

public class Main1 {
   public static void main(String[] args) {
        A1 objA = new A1();
        objA.display();  
        B1 objB = new B1();
        objB.tryAccessPrivateMembers(); 
    }  
}
