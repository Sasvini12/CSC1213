import java.util.Scanner;
class Ex1{
	public static void main(String arg[]){
		Scanner posi=new Scanner(System.in);
		System.out.println("Enter the Positive number: ");
		int num=posi.nextInt();
		int i=0;
		int sum=0;
		while(i<=num)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("The summation of the number from 1 to "+num+ " is: "+sum);
	}
}
			