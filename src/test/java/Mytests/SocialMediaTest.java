package Mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SocialMediaTest extends BaseTest{
	
	@Test
	public void facebookTest() {
		
		getDriver().get("http://www.facebook.com");
		System.out.println(getDriver().getTitle());
		
		Assert.assertEquals(getDriver().getTitle(), "Facebook - log in or sign up");
	}
	
	@Test
	public void gmailTest() {
		
		getDriver().get("http://www.gmail.com");
		System.out.println(getDriver().getTitle());
		
		Assert.assertEquals(getDriver().getTitle(), "Gmail");
	}
	
	@Test
	public void InstagramTest() {
		
		getDriver().get("http://www.instagram.com");
		System.out.println(getDriver().getTitle());
		
		Assert.assertEquals(getDriver().getTitle(), "Instagram");
	}
	
	
	

}
