import java.util.Scanner;
class Ex1{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the Number: ");
	    int num=ob.nextInt();
		if(num<0)
		{
			System.out.println(" The number is Negative Number: ");
		}
		else if(num>0)
		{
			System.out.println(" The number is Positive Number: ");
		}
		else
		{
			System.out.println(" The number is Zero Number: ");
		}
	}
}