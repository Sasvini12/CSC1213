public class Typecasting02{
	public static void main(String args[]){
		int num=5004;
		double doubleNum = (double)num;
		System.out.println("The Value of "+num+" after converting to the double is "+doubleNum);
		int converteInt =(int) doubleNum;
		System.out.println("The Value of "+doubleNum+" after converting to the int again is "+converteInt);
	}
}