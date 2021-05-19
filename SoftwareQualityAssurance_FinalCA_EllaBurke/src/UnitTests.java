
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTests {
	
	//Unit Test Class for carrying out unit tests on Controller class
	
	//Controller Class for Testing
	Controller controller;
	
	//1. Test if Rubric can be created.
	@Test
	public void rubricCreationTest() {
		
	controller = new Controller();
		
	List<String> criterion = new ArrayList<>();
	
	criterion.add(new String("Design"));
	criterion.add(new String("Implementation"));
	criterion.add(new String("Testing"));
	criterion.add(new String("Documentation"));
	
	Rubric rubric = controller.createRubric(criterion, null, "Criterion");
	
	Assertions.assertFalse(controller.getAllRubrics().isEmpty());
	assertEquals(criterion, rubric.getCriteria());
	assertEquals("Criterion", rubric.getRubricTitle());
	
	}

}
