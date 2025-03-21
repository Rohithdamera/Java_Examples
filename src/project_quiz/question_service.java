package project_quiz;

public class question_service {
	Questions question[]=new Questions[5];
	
	
	
	public question_service() {
		question[0]=new Questions(1,"you are stupid","yes","definately yes","definately yes");
		question[1]=new Questions(2,"Who are you","human","alien","human");
		question[2]=new Questions(3,"Why are you alive","To sleep","To explore","To explore");
		question[3]=new Questions(4,"why java logo is in coffee picture","Got attracted to coffee","Drank mostly coffe while creating java","Drank mostly coffe while creating java");
		question[4]=new Questions(5,"happy","five","four","five");
		
	}
	
	public void play_quiz() {
		
		System.out.println(question[0].getQuestion());
		
		
		
		for(Questions s:question) {
			System.out.println("question no :"+s.getQuestion());
			System.out.println(s.getOpt1());
			System.out.println(s.getOpt2());
			System.out.println(s);
		}
		
		
		
	}

}
