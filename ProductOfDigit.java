import java.util.Scanner;
class ProductOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Four Digit Number");
		int num =sc.nextInt();
		
		int prod=1;
		
		
		
		int rem = num%10;
		prod=prod*rem;
		num = num/10;
		
		rem = num%10;
		prod=prod*rem;
		num = num/10;
		
		rem = num%10;
		prod=prod*rem;
		num = num/10;
		
		rem = num%10;
		prod=prod*rem;
		
		System.out.println("sum of digit is" +prod);
		
		
		
		
	}
}
