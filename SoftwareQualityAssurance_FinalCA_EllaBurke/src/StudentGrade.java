
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentGrade {
	
	//Student's Full Name
	String fullName;
	//List of scores
	HashMap<String,Integer>studentScore = new HashMap();
	//List of scores for particular criterion?
	
	
	//Empty Constructor
	public StudentGrade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentGrade(String fullName, HashMap<String, Integer> studentScore) {
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

	public HashMap<String, Integer> getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(HashMap<String, Integer> studentScore) {
		this.studentScore = studentScore;
	}

}
