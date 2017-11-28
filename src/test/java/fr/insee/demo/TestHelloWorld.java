package fr.insee.demo ;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test Class used to test JSON functions
 * 
 * @author I6VWID
 *
 */
public class TestHelloWorld {

	

	@Test
	public void getJSONArray() {
		
		HelloWorld hello = new HelloWorld("Hey !");
		
		Assert.assertEquals(hello.getMessage(),"Hey !");
		
	}
	


}
