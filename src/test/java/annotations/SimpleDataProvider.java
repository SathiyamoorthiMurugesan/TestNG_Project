package annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleDataProvider {
	
	@Test(dataProvider = "NameAndOffice")
	public void testingDataProvider(String name, String office) {
		System.out.println("Person Name: "+name);
		System.out.println("Office Name: "+office);
	}
	
	@DataProvider
	public Object[] [] NameAndOffice() {
	
		Object[][] data = new Object[2][2];
		
		data[0][0] = "Sathya";
		data[0][1] = "Aon";
		
		data[1][0] = "Sathiyamoorthi";
		data[1][1] = "CTS";
		
		return data;
				
	}

}
