import java.util.Scanner; 

public class Methods {
    public static void main(String[] args) {
        findLargestAndSmallest(); 
    }

    public static void findLargestAndSmallest() {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        int largest = num1; 
        int smallest = num1;

        
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

       
        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);

        input.close(); 
    }
}