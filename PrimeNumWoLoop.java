import java.util.Scanner;
class PrimeNumWoLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num =sc.nextInt();
		System.out.println((num==2 || num==3 || num==5)?(num+ "is prime"):((num%2 || num%3 || num%5)?(num+ "is not prime"):(num+ "is prime")));
		
	}
}
