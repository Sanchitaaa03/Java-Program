import java.util.Scanner;
class CalculateTip
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total");
		
		float bill= sc.nextFloat();
		float tipRate= sc.nextFloat();
		
		float grat = gratuity/10; 
		float subtotal = total+grat;
		System.out.println("subtotal "+subtotal);
		
		
		
		
	}
}
