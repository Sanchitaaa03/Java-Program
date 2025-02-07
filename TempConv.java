import java.util.Scanner;
class TempConv 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Temperature in Celsius  "); 
		double celsius= sc.nextDouble();
		
		double fahrenheit=(9.0/5.0)*celsius+32;
		
		System.out.println("temperatue in Celsius" +celsius);
		System.out.println("Converted Temperature in Farhenheit   " +fahrenheit);
		
	}
}
