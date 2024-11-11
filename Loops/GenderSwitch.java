package Loops;

public class GenderSwitch {
    public static void main(String[] args) {
        char gender = 'M';

        switch (gender) {
            case 'M':
                System.out.println("Gender: Male");
                break;
            case 'F':
                System.out.println("Gender: Female");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
    
}
