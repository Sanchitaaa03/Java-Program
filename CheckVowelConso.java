import java.util.Scanner;
class CheckVowelConso 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Alphabet");
		char ch = Character.toUpperCase(sc.next().charAt(0));
		 
		
		String check = (ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch== 'U')?("enter value is vowel"):("entered value is Consonent");
		System.out.println( ch+ " " + check);
	}
}
