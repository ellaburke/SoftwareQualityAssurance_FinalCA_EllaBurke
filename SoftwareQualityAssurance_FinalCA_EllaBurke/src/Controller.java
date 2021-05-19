
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Controller {
	
	//List of All Rubrics
	List<Rubric> rubricList = new ArrayList<Rubric>();
	//List of All Student Grades
	List<StudentGrade> studentGradeList = new ArrayList<StudentGrade>();
	
	//Constructor
	public Controller() {
		
	}
	
	//Create New Rubric, made up of criterion, grades and title
	public Rubric createRubric(String title, List<String> criterion, List<StudentGrade>grades) {
		
		if (criterion != null) {
			if (criterion.size() > 10) {
				System.out.println("Max 10 Criterion");
				return null;
			}
		}
		
		Rubric rubric = new Rubric(title, grades, criterion);
		rubricList.add(rubric);
		return rubric;
		
	}

	
	//Returns List of Rubrics Created 
	public List<Rubric> getAllRubrics() {
		return rubricList;
	}

	// Student Grade can be from 1-5
	public boolean isGradeBetweenOneAndFive(HashMap<String, Integer> grades) {

		for (Integer i : grades.values()) {
			if (i > 5 || i < 1) {
				System.out.println("Grade must be between 1 & 5");
				return false;
			}
		}
		return true;
	}
	
	// Get a specific Rubric by name
	public Rubric getRubricByName(String rubricName) {
		for (Rubric rub : rubricList) {
			if (rub.getRubricTitle().equals(rubricName)) {
				return rub;
			}
		}
		return null;
	}
	
	// Create StudentGrade
	public StudentGrade createStudentGrade(String fullName, HashMap<String, Integer> studentScore) {

		if (!isGradeBetweenOneAndFive(studentScore)) {
			return null;
		}

		StudentGrade studentGrade = new StudentGrade(fullName, studentScore);

		return studentGrade;
	}
	
	// Add Criterion to Rubric
	public ArrayList<String> addCriterionToRubric(String criterion, Rubric rubric) {

		ArrayList<String> criterionList = (ArrayList<String>) rubric.getCriterion();

		if (criterionList.size() < 10) {
			criterionList.add(criterion);
		}

		return criterionList;
	}

}
