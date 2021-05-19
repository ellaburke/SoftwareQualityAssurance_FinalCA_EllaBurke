
import java.util.ArrayList;
import java.util.List;

public class StudentGrade {
	
	//Student's Full Name
	String fullName;
	//List of scores
	List<Integer> studentScore = new ArrayList<Integer>();
	//List of scores for particular criterion?
	
	
	//Empty Constructor
	public StudentGrade() {
		super();
		// TODO Auto-generated constructor stub
	}


	//Constructor
	public StudentGrade(String fullName, List<Integer> studentScore) {
		super();
		this.fullName = fullName;
		this.studentScore = studentScore;
	}


	//Getters & Setters
	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public List<Integer> getStudentScore() {
		return studentScore;
	}


	public void setStudentScore(List<Integer> studentScore) {
		this.studentScore = studentScore;
	}
	
	
	
	
	

}
