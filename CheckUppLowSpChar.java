import java.util.Scanner;
class CheckUppLowSpChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("-----enter the Character to check------- ");
		char ch = sc.next().charAt(0);
		
			String check =((ch>='A' && ch <='Z')?("it is in Uppercase"):((ch>='a' && ch<='z')?("it is in lowercase"):((ch>='0' && ch <='z')?("it is a digit"):("it is a Special character"))));
			System.out.println(ch+ " " +check);
	}
}
