public class Que4{
	static int factorial(int num){
		int fac=1;
		for(int i=1;i<=num;i++){
			fac=fac*i;
		}
		return fac;
	}
		public static void main(String args[]){
			int result=factorial(5);
			System.out.println(" Factorial is: "+result);
		}
	
}
			
			