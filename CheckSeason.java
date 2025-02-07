import java.util.Scanner;
class CheckSeason 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the mon with starting 3 char");
		String mon = sc.next().toLowerCase();
		
		//String season=(mon== may || mon==feb || mon==mar || mon==apr)?("Summer"):((mon== oct || mon==nov || mon==dec || mon==jan)?("Winter"):((mon==jun || mon==jul|| mon==aug || mon==sep)?("rainy"):("invalid ip")));
		String season=(mon.equals("may") || mon.equals("feb") || mon.equals("mar") || mon.equals("apr"))?("Summer"):((mon.equals("oct") || mon.equals("nov") || mon.equals("dec") || mon.equals("jan"))?("Winter"):((mon.equals("jun") || mon.equals("jul")|| mon.equals("aug") || mon.equals("sep"))?("rainy"):("invalid ip")));
		
		System.out.println(mon+ " " +season);
	}
}
