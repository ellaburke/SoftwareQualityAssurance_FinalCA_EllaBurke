
import java.util.ArrayList;
import java.util.List;

public class Controller {
	
	//List of All Rubrics
	List<Rubric> rubricList = new ArrayList<Rubric>();
	//List of All Student Grades
	List<StudentGrade> studentGradeList = new ArrayList<StudentGrade>();
	
	//Constructor
	public Controller() {
		
	}
	
	//Create Rubric, made up of criterion, grades and title
	public Rubric createRubric(List<String> criterion, List<StudentGrade>grades,String title) {
		Rubric rubric = new Rubric(title);
		rubric.setCriteria(criterion);
		rubric.setGrades(grades);
		rubricList.add(rubric);
		return rubric;
	}
	//Returns List of Rubrics Created 
	public List<Rubric> getAllRubrics() {
		return rubricList;
	}
	
	
	
	

}
