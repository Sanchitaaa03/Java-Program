import java.util.Scanner;
class SumOfDigitLoop 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dup=num;
		
		int sum=0;
		
		while(num>0){
			
			int rem=num%10;
			sum+=rem;
			num/=10;
			
			
		
		}
		System.out.println("sum of even digit is"+sum);
		System.out.println(dup);
		
			
			
		
	}
}
