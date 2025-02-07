import java.util.Scanner;
class AreaPeriRectangle 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the width of Rectangle");
		float width = sc.nextFloat();
		System.out.print("Enter the width of height");
		float height = sc.nextFloat();
		
		float area = width*height;
		float perimeter= 2*(width+height);
		System.out.println("area of Rectangle is " +area+ "cm^2");
		System.out.println("Perimeter of REctangle is " +perimeter+ "cm^2");
	
		
	}
}
