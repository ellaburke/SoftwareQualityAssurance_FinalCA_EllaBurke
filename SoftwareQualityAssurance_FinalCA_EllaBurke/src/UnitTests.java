
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


}
