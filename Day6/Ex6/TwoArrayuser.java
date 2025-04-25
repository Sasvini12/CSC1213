import java.util.Scanner;
class TwoArrayuser{
	public static void main(String args[]){
		Scanner op=new Scanner(System.in);
		System.out.print("Enter the size of Row: ");
		int size1=op.nextInt();
		System.out.print("Enter the size of Coloum: ");
		int size2=op.nextInt();
		
		int marks[][]=new int [size1][size2];
        System.out.print("Enter the elements: ");
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
             marks[i][j]=op.nextInt();
			}
		}
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
             System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int max=marks[0][0];
		int sum=0;
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				if(max<marks[i][j]){
					max=marks[i][j];
				}
				sum=sum+marks[i][j];
			}
		}
		 System.out.println("The maximum value is: "+max);
		 System.out.println("The Sum is: "+sum);
	}
}
		
				
				
				
		
		
		