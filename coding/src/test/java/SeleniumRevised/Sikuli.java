package SeleniumRevised;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Sikuli {

	@Test
	public void class1() {
		
		String str="abcd";
		Assert.assertEquals(str, "abcd");
	}
	
	@Test
	public void class2() {
		
		String str="abcd";
		Assert.assertEquals(str, "abcde");
	}
}
