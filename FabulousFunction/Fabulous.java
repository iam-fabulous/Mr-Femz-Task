
public class Factorial{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int factorial = 1;
		System.out.println("Enter number to check Factorial: ");
		int number = input.nextInt();
		for(int count = 1; count <= number; count++){
			factorial *= count - 1;
		}
		System.out.printf("Factorial of %d is: %d",number, factorial);

		

	}
}