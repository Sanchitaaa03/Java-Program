import java.util.Scanner;
class CheckDivisibleby5nd2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no ");
		int num = sc.nextInt();
		
		String check=  ((num%2==0 && num%5==0)?("num is divisible by 2 & 5"):((num%2==0)?("num divisible by 2"):((num%5==0)?("num divisible by 5"):("num is not divisible by 2 &5"))));
		System.out.println(num+ " " +check);
		
	}
}
