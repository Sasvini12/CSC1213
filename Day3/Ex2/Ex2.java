import java.util.Scanner;
class Ex2{
public static void main(String arg[]){
	Scanner ob=new Scanner (System.in);
	System.out.println("Enter the First Number: ");
	int num1=ob.nextInt();
	System.out.println("Enter the Second Number: ");
	int num2=ob.nextInt();
	System.out.println("Enter the Third Number: ");
	int num3=ob.nextInt();
	
	if((num1>num2)&& (num1>num3))
	{
		System.out.println("Maximum Number is: "+num1);
	}
	else if (num2>num3)
	{
		System.out.println("Maximum Number is: "+num2);
	}
	else
	{
		System.out.println("Maximum Number is: "+num3);
	}
}
}