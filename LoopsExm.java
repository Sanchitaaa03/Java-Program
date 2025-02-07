class LoopsExm 
{
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println();
		System.out.println();
		//1 TO 10
		System.out.println("1 TO 10");
		for(int i=1; i<=10;i++)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		//A TO Z
		System.out.println("A TO Z");
		for(char ch='A'; ch<='Z';ch++)
		{
			System.out.print(ch+ " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//Z TO a
		System.out.println("z TO a");
		for(char ch='z'; ch>='a';ch--)
		{
			System.out.print(ch+ " ");
		}
		
		System.out.println();
		System.out.println();
		//0 TO 9 char
		System.out.println("0  TO 9 char");
		for(char ch='0'; ch<='9';ch++)
		{
			System.out.print(ch+ " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//ASCII
		System.out.println("ASCII");
		for(int i=1; i<=127;i++)
		{
			System.out.println(i+ ":" +(char)i);
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(char ch=1;ch<=127;ch++){
			System.out.println(ch+ " "+(ch+0)); //ch*1
		}
	}
}
