import java.util.Scanner;
class Ex5{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=ob.nextInt();
		for(int i=1;i<=num;i++){
			System.out.print(i+"\t");
		}
	}
}