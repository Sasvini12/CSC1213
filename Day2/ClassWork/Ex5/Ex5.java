import java.util.Scanner;
class Ex5{
	public static void main(String arg[]){
		Scanner ob= new Scanner (System.in);
		System.out.println("Enter integer Number: ");
		int num1=ob.nextInt();
		if(num1%2==0)
		{
			System.out.println("The number is Even number");
		}
		else
		{
			System.out.println("The number is Odd number");
		}
	}
}
			