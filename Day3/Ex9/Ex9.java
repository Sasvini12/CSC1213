public class Ex9{
	public static void main(String arg[]){
		for(int i=0;i<=3;i++){
			for(int j=0;j<3;j++){
				if(i==2&&j==2){
					continue;
				}
				System.out.println(i+" "+j);
			}
		}
	}
}
	