class Census 
{
	public static void main(String[] args) 
	{
		long currPop =312032486;
		long seconds= (365*24*60*60)*5;
		long birth=seconds/7;
		long death=seconds/13;
		long imm=seconds/45;
		
		System.out.println("Current Population is:" +currPop);
		
		long newPop=currPop+birth-death+imm;
		
		System.out.println("Population After 5 years is:" +newPop);
		
		
		
		
		
	}
}
