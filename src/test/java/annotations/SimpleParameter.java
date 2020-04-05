package annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleParameter {
	
	@Parameters({"name"})
	
	@Test
	
	public void nameTest(String name) {
		System.out.println(name);
	}

}
