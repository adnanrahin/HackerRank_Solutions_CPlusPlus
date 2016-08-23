package encapsulation;

public class StudentGrade {
	
	public double quiz;
	public double midterm;
	public double project;
	public double finalexam;
	
	private String coursenumber;
	
	public StudentGrade(double quiz,double midterm,double project,double finalexam){
		
		this.quiz = quiz;
		this.finalexam = finalexam;
		this.midterm = midterm;
		this.project = project;
		
	}

	public String getCoursenumber() {
		return coursenumber;
	}

	public void setCoursenumber(String coursenumber) {
		this.coursenumber = coursenumber;
	}
	
	public String getGrade(){
		
		double total = quiz+midterm+finalexam+project;
		total = total*0.25;
		
		if(total>90)
			return "A";
		else if (total < 90 && total >80) 
			return "B";
		else if (total < 80 && total >70) 
			return "C";
		else if (total < 70 && total >60) 
			return "D";
		else
			return "FAIL";
		
	}
	
}
