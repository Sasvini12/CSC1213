import java.util.Scanner;
class Ex4{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Alphabet: ");
		char Vowel=ob.next().charAt(0);
		switch (Vowel){
			case 'A': 
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':System.out.println(Vowel+" is a Vowel Alphabet");
                     break;
			default : System.out.println(Vowel+" is not a Vowel Alphabet");
		}
	}
}