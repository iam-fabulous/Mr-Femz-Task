import java.util.Scanner;
	public class Collect10Numbers{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
		
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        System.out.println("Program to calculate  smallest, and largest between Ten numbers!");

        for (int count = 0; count < 10; count++) {
            System.out.print("Enter number: ");
            int number = input.nextInt();

            
            
            
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }

                        
        
        System.out.println("The Smallest of the numbers is: " + smallest);
        System.out.println("The Largest of the numbers is: " + largest);

	}
}