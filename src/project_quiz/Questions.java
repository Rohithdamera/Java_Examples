package project_quiz;

public class Questions {
	
	private int id;
	private String question;
	private String opt1;
	private String opt2;
	private String answer;
	
	
	
//	public Questions() {
//		super();
//		this.id = id;
//		this.question = question;
//		this.opt1 = opt1;
//		this.opt2 = opt2;
//		this.answer = answer;
//	}
	public Questions(int i, String string, String string2, String string3, String string4) {
		super();
		this.id = id;
		this.question = question;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.answer = answer;
	}
		
	
	


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOpt1() {
		return opt1;
	}
	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}
	public String getOpt2() {
		return opt2;
	}
	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Questions [id=" + id + ", question=" + question + ", opt1=" + opt1 + ", opt2=" + opt2 + ", answer="
				+ answer + "]";
	}
	
	

}
