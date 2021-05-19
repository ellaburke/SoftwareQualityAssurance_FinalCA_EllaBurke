
import java.util.ArrayList;
import java.util.List;

public class Rubric {
	
	//Max 10 Criteria In Rubric
	//Criterion score from 1-5
	
	//Rubric Object Name
	String rubricTitle;
	//Student Grade Object made up Student's name & score
	List<StudentGrade>grades = new ArrayList<>();
	//Criterion - provides the categories for the specific Rubric
	List<String> criterion = new ArrayList<String>();
	
	
	//Empty Constructor
	public Rubric() {
		super();
		// TODO Auto-generated constructor stub
	}


	//Constructor
	public Rubric(String rubricTitle) {
		super();
		this.rubricTitle = rubricTitle;
	}


	//Getters & Setters
	public String getRubricTitle() {
		return rubricTitle;
	}


	public void setRubricTitle(String rubricTitle) {
		this.rubricTitle = rubricTitle;
	}


	public List<StudentGrade> getGrades() {
		return grades;
	}


	public void setGrades(List<StudentGrade> grades) {
		this.grades = grades;
	}


	public List<String> getCriteria() {
		return criterion;
	}


	public void setCriteria(List<String> criterion) {
		this.criterion = criterion;
	}
	
	
	
	

}
