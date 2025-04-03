import java.util.Scanner;
class DoWhile{
	public static void main(String arg[]){
		Scanner op=new Scanner(System.in);
		char Control=' ';
		int sum=0;
		
		do
		{
			System.out.println("Enter the Number to find the Summation: ");
			int num=op.nextInt();
			sum=sum+num;
			System.out.println("Do you want to continue (Y/N): ");
			Control=op.next().charAt(0);
		}while(Control=='Y');
		System.out.println("Summation of the Number: "+sum);
	}
}
			
		