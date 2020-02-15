package TestPackeg;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Chapter3 {
	
	@Parameters({"URL"})
	@Test
	
	public void carloadtest1(String urlname)
	{
		System.out.println("carloadtest1");
		System.out.println(urlname);
	}
	@Test
	public void carloadtest2()
	{
		System.out.println("carloadtest2");
		Assert.assertTrue(false);
	}
	@Test
	public void carloadtest3()
	{
		System.out.println("carloadtest3");
	}

}
