import java.util.Scanner;
class CheckUppercase

{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter thr Alphabets : ");
	char alpha = sc.next().charAt(0);
	
	String check = (alpha>= 'A' && alpha <='Z')?("Alphabet is in Uppercase "):("Alphabet is in lowercase");
	
	System.out.println(alpha+ "  " + check);
	
	
		
	
	}
}
