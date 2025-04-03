class Array{
	public static void main(String arg[]){
		int number[]=new int[10];
		number[0]=21;
		number[1]=34;
		number[2]=45;
		number[3]=12;
		number[4]=23;
		number[5]=56;
		number[6]=78;
		number[7]=35;
		number[8]=22;
		number[9]=80;
		
		for(int i=0;i<number.length;i++){
			System.out.println(number[i]+"\t");
		}
		System.out.println("********************");
		int number2[]={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<number2.length;i++){
		 System.out.println(number2[i]+"\t");
        }
		System.out.println("############################");
		String days[]={"Monday","Tuesday","Wednesday","Thurseday","Friday","Saturday","Sunday"};
		for(String day:days){
			System.out.println(day+"\t");
		}
}
}
			
		
		
		