package com.QaInfotech.Stepdef;


import org.openqa.selenium.WebElement;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.QaInfotech.PageObjects.AppTest;
import com.QaInfotech.PageObjects.HomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



public class HomePageStepDef extends AppTest {
	private WebElement career;
	private WebElement pause;
	private WebElement play;
	private WebElement email;
	private WebElement about;
	private WebElement service;
	private WebElement verticals;
	private WebElement team;
	private WebElement kncenter;
	private WebElement contact;
	private WebElement news; 
	
	HomePage hp = new HomePage();
	
	@Before
	public void getWebsiteUrl() {
		
		driver.get("https://www.qainfotech.com");
	}
	
	
	
	
	
	
	@Given("^the user is on homepage of the qainfotech website$")
	public void verifyQaInfotechHomepage() {
		
		Assert.assertEquals(true,hp.verifyQaInfoTechWebPageLoaded() );
		
		
	}
//	@Given("^the user is on web browser$")
//		public void verifyWebBrowser() {
//		Assert.assertEquals(true, hp.browserloaded());
//			
//		}
	
	@When("^he/she clicks the \"Careers\" link on topright corner$")
	public void clickCareerlink() {
		career =driver.findElement(By.cssSelector(".right .career_non_home_page"));
		career.click();
		
	}
	@Then("^he/she is navigated to another page dedicated for giving information about careers$")
	public void verifycareerpagenavigation() {
		Assert.assertEquals(true, hp.careerpagenav());
		
	}
	
	@When("^the user clicks on the pause button$")
	public void clickpause() {
		pause=driver.findElement(By.cssSelector(".ls-nav-stop"));
		pause.click();
	}
	@When("^the user clicks on the play button$")
	public void clickplay() {
		play=driver.findElement(By.cssSelector(".ls-nav-start"));
		play.click();
	}
	
	@Then("^he/she  automatically scrolled down to a portion in the page with Heading \"About Us\"$")
	public void scrollabout() {
		Assert.assertEquals(true, hp.scrollaboutnav());
	}
	@Then("^he/she  automatically scrolled down to a portion in the page with Heading \"Verticals\" portion$")
	public void scrollverticals() {
		Assert.assertEquals(true, hp.scrollverticalnav());
	}
	
	@Then("^the images starts moving again in loop$")
    public void verifyplayscreen() {
		Assert.assertEquals(true, hp.verifyplayscreenloaded());
		
	}
	@When("^he/she clicks the \"VERTICALS\" link on topbar containing qainfotech logo on leftmost side$")
	public void clickverticals() {
		verticals=driver.findElement(By.cssSelector(".menu_main .nav-collapse>ul>:nth-child(3)"));
		verticals.click();
	}
	@Then("^he/she  automatically scrolled down to a portion in the page with Heading \"Our Services\"$")
	public void scrollService() {
		Assert.assertEquals(true, hp.verifyscrollservicenav());
	}
	
	@When("^he/she clicks the \"SERVICES\" link on topbar containing qainfotech logo on leftmost side$")
	public void clickservice() {
		service=driver.findElement(By.cssSelector(".menu_main .nav-collapse>ul>:nth-child(2)"));
		service.click();
	}
	@When("^he/she clicks the \"ABOUT\" link on topbar containing qainfotech logo on leftmost side$")
	public void clickAbout() {
		about=driver.findElement(By.cssSelector(".menu_main .nav-collapse>ul>li"));
		about.click();
	}
	
	@When("^he/she clicks the link \"sales@qainfotech.com\" link on topleft corner$")
	public void clickemailink() {
	email=driver.findElement(By.cssSelector(".left .mailtop_topheader"));
	email.click();
	}
	
	@Given("^he/she is able to view a pause button on the image panel$")
	public void verifypausebutton() {
		Assert.assertEquals(true, hp.verifypausebuttonloaded());
		
	}
	@Then("^the image stops there and next image in loop do not come up$")
	public void verifypausescreen() {
	Assert.assertEquals(true,hp.verifyPauseScreenLoop());
	}
	
	@Given("^he/she is able to view a play button on the image panel")
	public void verifyplaybutton() {
		Assert.assertEquals(true, hp.verifyplaybuttonloaded());
	}
	
	@Then("^he/she is able to see a search bar on top right corner of the page$")
	public void verifysearchbar() {
		
		Assert.assertEquals(true,hp.verifysearchbarloaded());
		
	}
	@Then("^he/she is able to view images moving in loop  in image panel of the top section of the page$")
	public void verifyimagepanel() {
		Assert.assertEquals(true, hp.verifyimagepanelloaded());
	}
	
	@Then("^he/she is able to see a blue notepad icon in bottom right corner of the homepage$")
	public void verifyblueicon() {
   Assert.assertEquals(true, hp.verifybluenotepadiconloaded());
	}
	@Then("^the user is able to see \"Sales Enquiry:\" text and contact numbers along with it$")
	public void verifycontactdetails() {
		Assert.assertEquals(true, hp.verifycontactdetailsontop());
	}
    @Then("^he/she  automatically scrolled down to a portion in the page with Heading \"Contact Us\" portion$")
    
	public void scrollcontact() {
    	Assert.assertEquals(true, hp.verifyscrollcontactnav());
	}
	@When("^he/she clicks the \"CONTACT\" link on topbar containing qainfotech logo on leftmost side$")
	public void clickcontact() {
		contact=driver.findElement(By.cssSelector(".menu_main .nav-collapse>ul>:nth-child(7)"));
		contact.click();
	}
		
	@When("^he/she clicks the \"NEWS\" link on topbar containing qainfotech logo on leftmost side$")
	public void clicknews() {
		news=driver.findElement(By.cssSelector(".menu_main .nav-collapse>ul>:nth-child(6)"));
		news.click();
		
	}
	@Then("^he/she  automatically scrolled down to a portion in the page with Heading news portion$")
	public void scrollnews() {
		
		Assert.assertEquals(true, hp.scrollnewsnav());
	}
	@When("^he/she clicks the \"TEAM\" link on topbar containing qainfotech logo on leftmost side$")
	public void clickteam() {
		team=driver.findElement(By.cssSelector(".menu_main .nav-collapse>ul>:nth-child(5)"));
		team.click();
	}
	@Then("^he/she  automatically scrolled down to a portion in the page with Heading \"Meet Our Team\"$")
	public void scrollteam() {
		Assert.assertEquals(true, hp.verifyscrollteamnav());
	}
	@When("^he/she clicks the \"KNOWLEDGE CENTER\" link on topbar containing qainfotech logo on leftmost side$")
	public void clickknowledge() {
		kncenter=driver.findElement(By.cssSelector(".menu_main .nav-collapse>ul>:nth-child(4)"));
		kncenter.click();
		}
	@Then("^he/she  automatically scrolled down to a portion in the page with Heading \"Downloads\"$")
	public void scrollknav() {
		Assert.assertEquals(true, hp.verifyscrollknav());
	}
	
@Then("^he/she is able to go to another page and sees result links containg query term under title\"Search Results for\"$")
public void checksearchlinkavailable() {
	Assert.assertEquals(true, hp.checkavailink());
}
	

@When("^he/she types a available query in that search bar and clicks on search button or press enter$")
	public void typesearchquery() {
		WebElement inputquery = driver.findElement(By.id("s"));
        inputquery.click();
        inputquery.sendKeys("Minesh");
        inputquery.sendKeys(Keys.ENTER);
	}
	
	
	
	
	
	
}
	


