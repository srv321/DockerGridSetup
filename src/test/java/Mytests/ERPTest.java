package Mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ERPTest extends BaseTest {
	
	@Test
	public void classicCRMTest() {
		
		getDriver().get("https://classic.crmpro.com");
		System.out.println(getDriver().getTitle());
		
		Assert.assertEquals(getDriver().getTitle(), "CRMPRO Login Screen");
	}
	
	@Test
	public void hubSpotTest() {
		
		getDriver().get("https://app.hubspot.com");
		System.out.println(getDriver().getTitle());
		
		Assert.assertEquals(getDriver().getTitle(), "HubSpot Login");
		
	}

}
