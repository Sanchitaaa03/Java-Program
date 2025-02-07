import java.util.Scanner;
class AreaVolCylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the radius of the cylinder");
		float radius = sc.nextFloat();
		System.out.print("Enter the height of the cylinder");
		float height =sc.nextFloat();
		
		float area =3.14f*radius*radius;
		float volume =area*height;
		
		System.out.println("Area of Cylinder is "+ area+ "cm^2" );
		System.out.println("Volume Of cylinder is "+volume+ "cm^3");
		
		
	}
}
