public class Que3{
	static String checkvotingEligibility(int age){
		if(age>18){
			return "Eligible to vote";
		}
		else{
			return "Not Eligible";
		}
	}
	public static void main(String arg[]){
		
		System.out.println("Output is:"+checkvotingEligibility(34));
		System.out.println("Output is:"+checkvotingEligibility(3));
		System.out.println("Output is:"+checkvotingEligibility(15));
		
	}
}
		