import java.util.Scanner;
class EvenOddRemSum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the number");
		int evensum =0;
		int oddsum=0;
		int sum =0;
		int num = sc.nextInt();
		
		
		
		int rem = num%10;
		sum =((rem%2==0)?(evensum=evensum+rem):(oddsum=oddsum+rem));
		num = num/10;
		
		rem = num%10;
		sum =((rem%2==0)?(evensum=evensum+rem):(oddsum=oddsum+rem));
		num = num/10;
		
		rem = num%10;
		sum =((rem%2==0)?(evensum=evensum+rem):(oddsum=oddsum+rem));
		num = num/10;
		
		rem = num%10;
		sum =((rem%2==0)?(evensum=evensum+rem):(oddsum=oddsum+rem));
		
		System.out.println("sum of even digit is" +evensum + "sum of odd digit is " +oddsum);
		
	}
}
