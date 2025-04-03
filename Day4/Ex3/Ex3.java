import java.util.Scanner;
class Ex3{
	public static void main(String arg[]){
		Scanner op=new Scanner(System.in);
		char Control=' ';
		int EvenCounter=0;
		int OddCounter=0;
		int sumeven=0;
		
		do
		{
			System.out.println("Enter the Number : ");
			int num=op.nextInt();
			if(num%2==0)
		{
			 EvenCounter=EvenCounter+1;
		}
		 else
		 {
			OddCounter=OddCounter+1; 
		 }
			System.out.println("Do you want to continue (Y/N): ");
			Control=op.next().charAt(0);
		}while(Control=='Y'||Control=='y');
			
			System.out.println("Count the Even numbers of Users has Entered is : "+EvenCounter);
			System.out.println("Count the Odd numbers of Users has Entered is : "+OddCounter);
			
	}
}
			
		