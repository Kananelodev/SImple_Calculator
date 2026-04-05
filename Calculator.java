import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Type 'Add' / 'Subtract' / 'Divide' / 'Multiply': ");
        String mode = scanner.next();

        // Ask for numbers once so they are available for any operation
        System.out.print("Enter first number: ");
        int first_num = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second_num = scanner.nextInt();

        // Use .equalsIgnoreCase to handle "add" or "Add"
        if (mode.equalsIgnoreCase("Add")) {
            int total = first_num + second_num;
            System.out.println("Total: " + total);
        } 
        else if (mode.equalsIgnoreCase("Subtract")) {
            int total = first_num - second_num;
            System.out.println("Total: " + total);
        }

        else if (mode.equalsIgnoreCase("Divide")) {
            if (second_num == 0){
                System.out.println("Can't divide by zero");
            }
            else {
                int total = first_num / second_num;
                System.out.println("Total: " + total);
            }
        }

        else if (mode.equalsIgnoreCase("Multiply")) {
            int total = first_num * second_num;
            System.out.println("Total: " + total);
        }
        // You can add Divide and Multiply logic here similarly!
        
        scanner.close();
    }
}
