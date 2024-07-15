import java.util.Scanner;
	public class SumOfEvenAndOddNumbers{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
		
        int sumOfEvenNumber = 0;
        int sumOfOddNumber = 0;

        System.out.println("Program to calculate  Sum of Even and Odd of Ten numbers!");

        for (int count = 0; count < 10; count++) {
            System.out.print("Enter number: ");
            int number = input.nextInt();

            
            
            
            if (number % 2 == 0 ) {
                sumOfEvenNumber += number;
            }
            if (number % 2 != 0) {
                sumOfOddNumber += number;

            }
        }

                        
        
        System.out.println("The Sum of Even numbers is: " + sumOfEvenNumber);
        System.out.println("The Sum of Odd numbers is: " + sumOfOddNumber);

	}
}