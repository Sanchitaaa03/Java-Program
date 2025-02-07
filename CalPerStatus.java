import java.util.Scanner;
class CalPerStatus

{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the marks");
		
		float marks= sc.nextFloat();
		
		float per = (marks/600)*100;
		
		String check = ((per>100)?("invalid"):((per<=100 && per>=75)?("A grade with"):((per<=74 && per>=60)?("B grade with"):((per<=59 && per>=35)?(" C grade"):(" Fail")))));
		//(per<=59 && per>=35)?(" C grade"):(" Fail")
		
		System.out.println(check "  " +per);
			
	}
}
