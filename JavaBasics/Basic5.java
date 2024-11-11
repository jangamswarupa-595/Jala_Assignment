public class Basic5 {
    
        
        int value = 10;
    
        public void displayValue() {
            
            int value = 20;
            System.out.println("Local value: " + value); 
            System.out.println("Instance (Global) value: " + this.value); 
        }
    
        public static void main(String[] args) {
            Basic5 example = new Basic5();
            example.displayValue();
        }
    }
    
