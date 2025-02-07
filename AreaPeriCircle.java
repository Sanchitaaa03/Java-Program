import java.util.Scanner;
class AreaPeriCircle

{
	public static void main(String[] args) 
	{
		
		final float pi=22/7;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius");
		float radius=sc.nextFloat();
		
		float area = pi*(radius*radius);
		System.out.println("Area of circle is:" +area+ "cm^2");
		
		float perimeter = 2*pi*radius;
		System.out.println("Perimeter of Circle is:" +perimeter+"cm^2");
		
				

			
			
	}
}
