import java.util.Scanner;
class CalculateBmi 
{
	public static void main(String[] args) 
		
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter weight in pounds");
	    double wt=sc.nextFloat();
		System.out.println("enter height in inches");
		double ht=sc.nextFloat();
		
		//convert wt into kg
		double kgwt=wt*0.45359237;
		
		double meterht= ht*0.0254;
		
		double bmi=(kgwt/(meterht*meterht));
		
		System.out.println("Bmi is" +bmi);
		
		System.out.print(((bmi<18.5)?("UNderwt"):((18.5<bmi && bmi<24.9)?("normal"):((25.0<bmi&& bmi<29.9)?("overwt"):((30.0<bmi && bmi<34.9)?("obese"):("Extremely Obese"))))));
	}
}
