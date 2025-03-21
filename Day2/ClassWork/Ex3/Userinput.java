import java.util.Scanner;
class Userinput{
	public static void main(String arg[]){
		String fname;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter your Firstname: ");
		fname =sc.nextLine();
		
		System.out.print("Enter your Lastname: ");
		String lname =sc.next();
		
		System.out.print("Enter your Marks: ");
	    int marks=sc.nextInt();
		
		System.out.println("Enter your Registration No: ");
	    String RegNo=sc.next();
		
		System.out.println("Enter your Age: ");
	    int Age=sc.nextInt();
		
		System.out.println("Enter your Sex: ");
	    char Sex=sc.next().charAt(0);
		
		System.out.println("Enter your Mobile Number: ");
	    long MobileNumber=sc.nextLong();
		
		System.out.println("Enter your GPA: ");
	    double GPA=sc.nextDouble();
		
		System.out.println("Fullname: "+fname+" "+lname+"\n"+"Marks is: "+marks+"\n"+"Your Registration Number : "+RegNo+"\n"+"Your Age: "+Age+"\n"+"Sex: "+Sex+"\n"+"Your Mobile Number: "+MobileNumber+"\n"+"Your GPA : "+GPA);
	}
}
