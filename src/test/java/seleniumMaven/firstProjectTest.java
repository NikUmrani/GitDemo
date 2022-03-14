package seleniumMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

import selenium.firstProject;

public class firstProjectTest {
	
	@Test
	public void testLogin1()
	{
		firstProject myFirst=new firstProject();
		Assert.assertEquals(0, myFirst.userLogin("nikhil", "nikhilumrani@1414"));
	}
	
	@Test
	public void testLogin2()
	{
		firstProject myFirst=new firstProject();
		Assert.assertEquals(1, myFirst.userLogin("nikhil", "nikhilumrani1414"));
		
	}

}
