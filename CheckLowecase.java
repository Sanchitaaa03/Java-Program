import java.util.Scanner;
class  CheckLowecase
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the Alphabet");
		char alpha =sc.next().charAt(0);
		
		String check = (alpha>='a' && alpha <='z')?("Alpha is in lowercase"):("Alpha is is in Uppercase");
		System.out.println(alpha+ " " +check);
		
	}
}
