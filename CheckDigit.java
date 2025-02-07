import java.util.Scanner;
class CheckDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digit");
		char dig = sc.next().charAt(0);
		
			String check =(dig>='0' && dig<='9')?("Is a digit"):("it is not a digit");
			System.out.println(dig+ " " +check);
	}
}
