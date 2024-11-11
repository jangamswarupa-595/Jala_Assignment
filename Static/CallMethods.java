package Static;

public class CallMethods {
   

        public static void staticMethod() {
            System.out.println("Calling a static method.");
        }
    
        public void instanceMethod() {
            System.out.println("Calling an instance method.");
        }
    
        public static void main(String[] args) {
            CallMethods obj = new CallMethods();
            staticMethod();
            obj.instanceMethod();
        }
}

