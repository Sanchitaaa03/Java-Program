import java .util.Scanner;
class CurrencyConvereter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Currency COnverter");
		
		System.out.println("enter the Amount in in INR");
		float inr= sc.nextInt();
		
		System.out.println("LIST OF CURRENCIES");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println("5. DR");
		System.out.println("6. YEN");
		System.out.println("Enter the Currency : ");
		String curr=sc.next().toUpperCase();
		float conCurr= 0;
		
		
		
		if(curr.equals("USD")){
			conCurr= inr/86.56f;
			System.out.println(inr+ "INR =" + conCurr+" USD");
		}
		else if(curr.equals("EUR")){
			conCurr= inr/90.25f;
			System.out.println(inr+ "INR =" + conCurr+" EUR");
		}
		else if(curr.equals("GBP")){
			conCurr= inr/107.66f;
			System.out.println(inr+ "INR =" + conCurr+" EUR");
		}
		else if(curr.equals("PKR")){
			conCurr= inr/0.31f;
			System.out.println(inr+ "INR =" + conCurr+" EUR");
		}
		else if(curr.equals("DR")){
			conCurr= inr/0.31f;
			System.out.println(inr+ "INR =" + conCurr+" DR");
		}
		else if(curr.equals("YEN")){
			conCurr= inr/0.56f;
			System.out.println(inr+ "INR =" + conCurr+" YEN");
		}
		else{
			System.out.println("invalid");
		}
	}
}
