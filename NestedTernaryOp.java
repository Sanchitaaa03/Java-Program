class NestedTernaryOp 
{
	public static void main(String[] args) 
	{
		int a=22;
		int b =50;
		int c =90;
		
		int largest = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println(largest);
		
		int smallest = (a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		System.out.println(smallest);
			
	}
}
