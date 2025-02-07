import java.util.Scanner;
class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" ******* welcome *****");
		System.out.println(" Enter the population");
		int pop = sc.nextInt();
		int bjp=0, cng=0, ss=0, mns=0, aap=0, nota=0;
		
		for(int i=1; i<=pop;i++){
		System.out.println("List of Candidate Parties");
		System.out.println("1.BJP");
		System.out.println("2.SHIVSENA");
		System.out.println("3.MNS");
		System.out.println("4.AAP");
		System.out.println("5.CONGRESS");
		System.out.println("6.NOTA");
		System.out.println("enter the options");
		
		int opt=sc.nextInt();
		
		
		if(opt==1){
			bjp++;
		    System.out.println("Achche din Aayenge"); 
		}
		if(opt==2){
			ss++;
			System.out.println("hum hai asli senaa");
		}
		if(opt==3){
			mns++;
			System.out.println("jai maharashtra");
		}
		if(opt==4){
			aap++;
			System.out.println("mujhe aazad karo");
		}
		if(opt==5){
			cng++;
			System.out.println("Bharat Todo");
		}
		if(opt==1){
			nota++;
			System.out.println("hume nhi dena vote");
		}
		
		if(bjp>=cng && bjp>=ss && bjp>=mns && bjp>=aap && bjp>=nota){
			System.out.println("****BJP WON THE ELECTION WITH" +bjp+ "VOTES****");
			return;
		}
		
		if(cng>=bjp && cng>=ss && cng>=mns && cng>=aap && cng>=nota){
			System.out.println("****CONGRESS WON THE ELECTION WITH" +cng+ "VOTES****");
			return;
		}
		
		if(ss>=bjp && ss>=cng && ss>=mns && ss>=aap && ss>=nota){
			System.out.println("****SHIVSENA WON THE ELECTION WITH" +ss+ "VOTES****");
			return;
			
		}
		
		if(mns>=cng && mns>=ss && mns>=bjp && mns>=aap && mns>=nota){
			System.out.println("****MNS WON THE ELECTION WITH" +mns+ "VOTES****");
			return;
		}
		
		if(aap>=cng && aap>=ss && aap>=mns && aap>=bjp && aap>=nota){
			System.out.println("****AAP WON THE ELECTION WITH" +aap+ "VOTES****");
			return;
		}
		
		if(nota>=cng && nota>=ss && nota>=mns && nota>=aap && nota>=bjp){
			System.out.println("****None of the candidates won" +nota+ "VOTES****");
			return;
		}
		
				

			
		}
		
		

				

	}
}
