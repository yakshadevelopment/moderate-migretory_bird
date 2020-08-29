package java8.mod.migretoryBird;

import static org.junit.Assert.*;
import static java8.mod.migretoryBird.TestUtils.*;
import org.junit.Test;

public class MainTest {

	@Test
public void testCountTotalBirds() throws Exception{
		
		yakshaAssert(currentTest(),Main.countTotalBirds(5)==10?"true":"false",businessTestFile);
		yakshaAssert(currentTest(),Main.countTotalBirds(6)==32?"true":"false",businessTestFile);
		yakshaAssert(currentTest(),Main.countTotalBirds(7)==53?"true":"false",businessTestFile);
	
	}
	
}
