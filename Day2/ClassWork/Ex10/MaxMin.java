import java.util.Scanner;
class MaxMin{
	
	public static void main(String args[]){
		Scanner ob=new  Scanner(System.in);
		
		System.out.println("Enter the Number1: ");
		int num1=ob.nextInt();
        
        System.out.println("Enter the Number2: ");
		int num2=ob.nextInt();
		
		System.out.println("The First value is: "+num1);
        System.out.println("The Second value is: "+num2);

	   if(num1>num2)
	    {
			System.out.println("The Maximum number is "+num1);
		}
		else 
		{
		
			System.out.println("The  Maximum number is "+num2);
		}
	}
}