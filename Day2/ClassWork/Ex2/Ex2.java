class Ex2{
	public static void main(String arg[]){
		String Name,Address,DOB,Sex;
		int Age;
		Name=arg[0];
		Address=arg[1];
		DOB=arg[2];
		Sex=arg[3];
		Age=Integer.parseInt(arg[4]);
		
		System.out.println("Name: "+Name+"\n"+"Address: "+Address+"\n"+"Date of Birth: "+DOB+"\n"+"Sex: "+Sex+"\n"+"Age: "+Age);
	}
}