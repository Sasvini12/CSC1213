import java.util.Scanner;
class maxmin{
	public static void main(String args[]){
		Scanner op=new Scanner(System.in);
		int num[]=new int[5];
	for(int i=0;i<5;i++){
		System.out.print("Enter the number "+(i+1)+": ");
		num[i]=op.nextInt();
	}
		int maximum=num[0];
		int minimum=num[0];
		for(int i=0;i<5;i++){
		if(num[i]>maximum){
		maximum=num[i];
		}
		
		if(num[i]<minimum){
		minimum=num[i];
		}
		}
			System.out.println(" Minimum number is: "+minimum);
		   System.out.println("Maximum number is: " +maximum);
		}
}
	
		