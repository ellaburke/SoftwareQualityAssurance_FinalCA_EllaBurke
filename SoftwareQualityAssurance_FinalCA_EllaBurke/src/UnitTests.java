
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTests {

	// Unit Test Class for carrying out unit tests on Controller class

	// Controller Class for Testing
	Controller controller;

	// 1. Test if Rubric can be created. - By inserting criterion
	@Test
	public void rubricCreationTest() {

		controller = new Controller();

		List<String> criterion = new ArrayList<>();

		criterion.add(new String("Design"));
		criterion.add(new String("Implementation"));
		criterion.add(new String("Testing"));
		criterion.add(new String("Documentation"));

		Rubric rubric = controller.createRubric("Criterion", criterion, null);

		Assertions.assertFalse(controller.getAllRubrics().isEmpty());
		assertEquals(criterion, rubric.getCriterion());
		assertEquals("Criterion", rubric.getRubricTitle());
		assertEquals(null, rubric.getGrades());

		// Rubric will return null if criterion > 10
		ArrayList<String> criterionTest = new ArrayList<>();

		criterionTest.add(new String("criterion1"));
		criterionTest.add(new String("criterion2"));
		criterionTest.add(new String("criterion3"));
		criterionTest.add(new String("criterion4"));
		criterionTest.add(new String("criterion5"));
		criterionTest.add(new String("criterion6"));
		criterionTest.add(new String("criterion7"));
		criterionTest.add(new String("criterion8"));
		criterionTest.add(new String("criterion9"));
		criterionTest.add(new String("criterion10"));
		criterionTest.add(new String("criterionExtra"));

		Rubric rubricCriterion = controller.createRubric("Test Criterion", criterionTest, null);

		assertEquals(null, rubricCriterion);

	}
	
	//2. Test if Student can be created
	@Test
	public void testCreateStudentGrade() {

		controller = new Controller();

		HashMap<String, Integer> grades = new HashMap<String, Integer>();

		grades.put("Design", 5);
		grades.put("Implementation", 4);
		grades.put("Testing", 3);
		grades.put("Documentation", 2);

		StudentGrade studentGrade = controller.createStudentGrade("Bill Gates", grades);

		assertEquals("Bill Gates", studentGrade.getFullName());
		assertEquals(grades, studentGrade.getStudentScore());

		// Return Null if score is > 5
		HashMap<String, Integer> gradesGreaterThanFive = new HashMap<String, Integer>();

		gradesGreaterThanFive.put("Design", 8);

		StudentGrade studentGradeGreaterThanFive = controller.createStudentGrade("Cheryl Cole", gradesGreaterThanFive);

		assertEquals(null, studentGradeGreaterThanFive);

	}
	
	//3. Test if Criterion can be added to Rubric
	@Test
	public void testAddCriterionToRubric() {

		controller = new Controller();

		ArrayList<String> criterion = new ArrayList<>();

		criterion.add(new String("Design"));
		criterion.add(new String("Implementation"));
		criterion.add(new String("Testing"));
		criterion.add(new String("Documentation"));

		Rubric rubric = controller.createRubric("Software Quality Assurance", criterion, null);

		ArrayList<String> criterionList = controller.addCriterionToRubric("Extra", rubric);

		assertEquals("Extra", criterionList.get(criterionList.size() - 1));

	}
	
	//4. Get Rubric by Name	
	@Test
	public void testGetRubricByName() {

		controller = new Controller();

		Rubric rubricByName = controller.createRubric("SQA", null, null);

		Rubric rubricByNameExists = controller.getRubricByName("SQA");
		
		assertEquals(rubricByName, rubricByNameExists);

		// returns null if rubric does not exist with given name
		Rubric rubricByNameDoesntExist = controller.getRubricByName("Statistics");

		assertEquals(null,rubricByNameDoesntExist);
	}
	
	//5. Get all StudentGrades
	@Test
	public void testGetAllStudentGrades() {

		controller = new Controller();

		ArrayList<String> criterion = new ArrayList<>();

		criterion.add(new String("Design"));
		criterion.add(new String("Implementation"));
		criterion.add(new String("Testing"));
		criterion.add(new String("Documentation"));

		HashMap<String, Integer> grade1 = new HashMap<String, Integer>();
		HashMap<String, Integer> grade2 = new HashMap<String, Integer>();
		HashMap<String, Integer> grade3 = new HashMap<String, Integer>();
		HashMap<String, Integer> grade4 = new HashMap<String, Integer>();

		grade1.put("Design", 5);
		grade2.put("Implementation", 4);
		grade3.put("Design", 3);
		grade4.put("Documentation", 2);

		StudentGrade student1 = controller.createStudentGrade("Student 1", grade1);
		StudentGrade student2 = controller.createStudentGrade("Student 2", grade2);
		StudentGrade student3 = controller.createStudentGrade("Student 3", grade3);
		StudentGrade student4 = controller.createStudentGrade("Student 3", grade4);

		ArrayList<StudentGrade> gradeList = new ArrayList<StudentGrade>();

		gradeList.add(student1);
		gradeList.add(student2);
		gradeList.add(student3);
		gradeList.add(student4);
		
		List<StudentGrade> gradeList1 = controller.getAllStudentGrades();

		
		assertEquals(gradeList,gradeList );
	}
}
