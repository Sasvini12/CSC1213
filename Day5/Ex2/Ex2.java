import java.util.Scanner;
class Ex2{
	public static void main(String args[]){
		Scanner op=new Scanner(System.in);
		int numbers[]=new int[10];
		
		for(int i=0;i<10;i++){
			System.out.print("Enter the number "+(i+1)+":");
		    numbers[i]=op.nextInt();
		}
		for(int i=0;i<10;i++){
	        System.out.print(numbers[i]+"\t");
		}
		System.out.println();
		String days[]={"Monday","Tuesday","Wednesday","Thurseday","Friday","Saturday","Sunday"};
		for(String day:days){
		 System.out.println(day);
	}
	}
}
