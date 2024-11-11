package Static;

public class PrintAllVariables {
    static int staticVar1 = 200;
    static int staticVar2 = 300;
    int instanceVar1 = 400;
    int instanceVar2 = 500;

    public static void main(String[] args) {
        PrintAllVariables obj = new PrintAllVariables();

        System.out.println("Static Variables: " + staticVar1 + ", " + staticVar2);
        System.out.println("Instance Variables: " + obj.instanceVar1 + ", " + obj.instanceVar2);
    }
    
}
