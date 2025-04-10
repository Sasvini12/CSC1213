import java.util.Scanner;
 class Ex1{
	public static void main(String args[]){
		Scanner op=new Scanner(System.in);
		int[] number=new int[5];
		
		int sum=0;
		for(int i=0;i<5;i++){
		System.out.println("Enter the number: "+(i+1));
		number[i]=op.nextInt();
		sum=sum+number[i];
		}
		
		System.out.println("Sum is: "+sum);
	}
 }	
		
		
		
		
		
		
		