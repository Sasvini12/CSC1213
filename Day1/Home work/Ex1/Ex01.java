class Ex01{
	public static void main(String args[]){
		
		//unary operators
		int num=8;
		int p=num++;
		int q=++num;
		int r=num--;
		int s=--num;
	
	System.out.println("The initial value is : "+num);
	System.out.println("The post increment value is: "+p);
	System.out.println("The pre increment value is: "+q);
	System.out.println("The post decrement value is: "+r);
	System.out.println("The pre decrement value is: "+s);
	System.out.println();
	

		//Logical operators
		boolean x=true;
		boolean y=false;
		
		System.out.println("x && y :"+(x && y));
		System.out.println("x || y :"+(x || y));
        System.out.println("!x :"+(!x));
		System.out.println();
		
		//Relational operators
		int num1=25;
		int num2=10;
		int num3=10;
		
		System.out.println("The First number is:"+num1);
		System.out.println("The Second number is:"+num2);
		System.out.println("The Third number is:"+num3);
		
		System.out.println("num1==num2 :"+(num1==num2));
		System.out.println("num1!=num2 :"+(num1!=num2));
		System.out.println("num1<num3 :"+(num1<num3));
		System.out.println("num1<=num2 :"+(num1<=num2));
		System.out.println("num3>num2 :"+(num3>num2));
		System.out.println("num1>=num2 :"+(num1>=num2));
		System.out.println();

		

        //Assignment operators
		int a=13;
		
		System.out.println("The number is :"+a);
		
		System.out.println("a+=4 : "+(a+=4));
		System.out.println("a-=4 : "+(a-=4));
		System.out.println("a*=4 : "+(a*=4));
		System.out.println("a/=4 : "+(a/=4));
		System.out.println("a%=4 : "+(a%=4));
		System.out.println();
		
	    //Ternary operators
		int b=32;
		int c=56;
		int maximum;
		
		maximum=((a>b)?(a>c)?a:c:(b>c)?b:c);
		
		System.out.println("The First number is:"+a);
		System.out.println("The Second number is:"+b);
		System.out.println("The Third number is:"+c);
		
		System.out.println("The maximum number is : "+maximum);

	}
}

		
		


		
		
