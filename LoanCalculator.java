import java.util.Scanner;
class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("     LOAN CALCULATOR   ");
		
		System.out.println();
		
		System.out.println("Enter the Amount");
		float amount = sc.nextFloat();
		
		System.out.println("Enter the Rate Of Intrest (ROI)");
		float roi=sc.nextFloat();
		
		System.out.println("Enter tenture(Months)");
		int months=sc.nextInt();
		
		//Convert from months to year
		String str =(months/12)"."(months%12);
		float con= Float.parseFloat(str);
		
		System.out.println();
		System.out.println("enter months");
		
		
	}
}
