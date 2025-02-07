import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num1");
		float num1 = sc.nextFloat();
		System.out.println("enter the num2");
		float num2 =sc.nextFloat();
		System.out.println("enter the operator");
		char op = sc.next().charAt(0);
		
		float res = (op=='+')?num1+num2:
			        (op=='-')?num1-num2:
			        (op=='*')?num1*num2:
			        (op =='/')?num1/num2:
			        (op=='%')?num1%num2:0.000001f;//0.000001 beacuase some unique value which does not match any ans
		
		String output= num1+ " " +op+ " " +num2+ "  = " +res;
		
		if(!(res==0.000001f)){
			System.out.println(output);
		}
			
		
		
	}
}
