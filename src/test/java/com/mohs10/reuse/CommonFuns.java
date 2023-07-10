package com.mohs10.reuse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.asn1.cmp.ErrorMsgContent;
import org.etsi.uri.x01903.v13.OCSPRefsType;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.HomePage;

import groovy.time.BaseDuration.From;

public class CommonFuns {

	public Action aDriver;
	public WebDriver driver;
	public Robot r;

	public CommonFuns() throws AWTException {
		aDriver = new Action();
		driver = StartBrowser.driver;
		r = new Robot();

	}

	// Explore more link1
	public void ExploreMoreLink1() throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click Action on: Re-inventing Quality Engineering leveraging Artificial Intelligence");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		aDriver.navigateToApplication("https://mohs10.io");

		aDriver.click(HomePage.exploreMore1, "Re-inventing Quality Engineering leveraging Artificial Intelligence");
		String title = driver.getTitle();
		// WebElement account = driver.findElement(By.xpath("//title[.='Mamatva
		// Admin']"));
		Assert.assertEquals(title, "Who we are - Mohs10 Technologies");
		System.out.println("Validation successful link 1 ");

	}

	// Explore more link2
	public void ExploreMoreLink2() throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click Action on: Who we are - Mohs10 Technologies");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		aDriver.navigateToApplication("https://mohs10.io");

		aDriver.click(HomePage.exploreMore2, "We Are Mohs10!");
		String title = driver.getTitle();
		// WebElement account = driver.findElement(By.xpath("//title[.='Mamatva
		// Admin']"));
		Assert.assertEquals(title, "Who we are - Mohs10 Technologies");
		System.out.println("Validation successful link 2");

	}

	// Explore more link3
	public void ExploreMoreLink3() throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click Action on: AI/ML Quality Engineering");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		aDriver.navigateToApplication("https://mohs10.io");

		aDriver.click(HomePage.exploreMore3, "AI/ML Quality Engineering");
		String title = driver.getTitle();
		// WebElement account = driver.findElement(By.xpath("//title[.='Mamatva
		// Admin']"));
		Assert.assertEquals(title, "AI/ML Testing - Mohs10 Technologies");
		System.out.println("Validation successful link 3");

	}

	// Explore more link4
	public void ExploreMoreLink4() throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click Action on: Functional Quality Engineering");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		aDriver.navigateToApplication("https://mohs10.io");

		aDriver.click(HomePage.exploreMore4, "Functional Quality Engineering");
		String title = driver.getTitle();
		// WebElement account = driver.findElement(By.xpath("//title[.='Mamatva
		// Admin']"));
		Assert.assertEquals(title, "Functional Testing - Mohs10 Technologies");
		System.out.println("Validation successful link 4");

	}

	// Explore more link5
	public void ExploreMoreLink5() throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click Action on: Performance Quality Engineering");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		aDriver.navigateToApplication("https://mohs10.io");

		aDriver.click(HomePage.exploreMore5, "Performance Quality Engineering");
		String title = driver.getTitle();
		// WebElement account = driver.findElement(By.xpath("//title[.='Mamatva
		// Admin']"));
		Assert.assertEquals(title, "Performance Testing - Mohs10 Technologies");
		System.out.println("Validation successful link 5");

	}

	// Explore more link6
	public void ExploreMoreLink6() throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click Action on: Security Quality Engineering");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		aDriver.navigateToApplication("https://mohs10.io");

		aDriver.click(HomePage.exploreMore6, "Security Quality Engineering");
		String title = driver.getTitle();
		// WebElement account = driver.findElement(By.xpath("//title[.='Mamatva
		// Admin']"));
		Assert.assertEquals(title, "Security Testing - Mohs10 Technologies");
		System.out.println("Validation successful link 6");

	}

	// Explore more link7
	public void ExploreMoreLink7() throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click Action on: Mobile Development");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		aDriver.navigateToApplication("https://mohs10.io");

		aDriver.click(HomePage.exploreMore7, "Mobile Development");
		String title = driver.getTitle();
		// WebElement account = driver.findElement(By.xpath("//title[.='Mamatva
		// Admin']"));
		Assert.assertEquals(title, "Mobile - Mohs10 Technologies");
		System.out.println("Validation successful link 7");

	}

	// Explore more link8
	public void ExploreMoreLink8() throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click Action on: Web Development");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		aDriver.navigateToApplication("https://mohs10.io");

		aDriver.click(HomePage.exploreMore8, "Web Development");
		String title = driver.getTitle();
		// WebElement account = driver.findElement(By.xpath("//title[.='Mamatva
		// Admin']"));
		Assert.assertEquals(title, "Web - Mohs10 Technologies");
		System.out.println("Validation successful link 8");

	}

	// Explore more link9
	public void ExploreMoreLink9() throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click Action on: Software-As-A-Service");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		aDriver.navigateToApplication("https://mohs10.io");

		aDriver.click(HomePage.exploreMore9, "Software-As-A-Service");
		String title = driver.getTitle();
		// WebElement account = driver.findElement(By.xpath("//title[.='Mamatva
		// Admin']"));
		Assert.assertEquals(title, "SAAS - Mohs10 Technologies");
		System.out.println("Validation successful link 9");

	}

	// Explore more link10
	public void ExploreMoreLink10() throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click Action on: APIs & Micro-Services");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		aDriver.navigateToApplication("https://mohs10.io");

		aDriver.click(HomePage.exploreMore10, "APIs & Micro-Services");
		String title = driver.getTitle();
		// WebElement account = driver.findElement(By.xpath("//title[.='Mamatva
		// Admin']"));
		Assert.assertEquals(title, "API & Micro-Services - Mohs10 Technologies");
		System.out.println("Validation successful link 10");
		aDriver.click(HomePage.mohs10Logo, "Click on the Mohs10 logo");

	}

	//Click on (+)(-) icons in our expertise section in About us page
	public void ClickPlusMinusIcon() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on (+)(-) icons from our expertise section in About us page");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// aDriver.navigateToApplication("https://mohs10.io");

		WebElement element = driver.findElement(HomePage.plus4icon);

		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, element);
		// JavascriptExecutor ja = (JavascriptExecutor) driver;
		// ja.executeScript("arguments[0].scrollIntoView();",element);
		// ja.executeScript("arguments[0].click();", element);
		/*
		 * WebDriverWait wait=new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.elementToBeClickable(HomePage.plus1icon));
		 */
		aDriver.click(HomePage.minus1icon, "Click on 1st - icon");
		Thread.sleep(750);
		aDriver.click(HomePage.plus1icon, "Click on 1st + icon");
		Thread.sleep(750);
		aDriver.click(HomePage.minus1icon, "Click on 1st - icon");
		aDriver.click(HomePage.plus2icon, "Click on 2st + icon");
		Thread.sleep(750);
		aDriver.click(HomePage.minus2icon, "Click on 2st - icon");
		aDriver.click(HomePage.plus3icon, "Click on 3rd + icon");
		Thread.sleep(750);
		aDriver.click(HomePage.minus3icon, "Click on 3rd - icon");
		aDriver.click(HomePage.plus4icon, "Click on 4th + icon");
		Thread.sleep(750);
		aDriver.click(HomePage.minus4icon, "Click on 4th - icon");

	}

	// About Us >>Who we are
	public void AboutUsMouseHover() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on Who we are from About us dropdown");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// aDriver.navigateToApplication("https://mohs10.io");

		aDriver.click(HomePage.aboutusModule, "About us mouse hover");

		aDriver.click(HomePage.whoWeAre, "Click on who we are");
		String title = driver.getTitle();
		System.out.println("Title of the webpage is " + title);
		Assert.assertEquals(title, "Who we are - Mohs10 Technologies");

	}

	// Get in touch form
	public void GetInTouch(String name, String companyName, String businessEmail, String country, String phoneNo,
			String anyAdditionalNote) throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Get in touch form");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// aDriver.navigateToApplication("https://mohs10.io");

		WebElement element = driver.findElement(HomePage.getInTouch);

		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, element);
		Thread.sleep(3000);
		aDriver.type(HomePage.name, name, "Name textbox in add Admin");
		aDriver.type(HomePage.companyName, companyName, "Company name textbox in Get in touch form");
		aDriver.type(HomePage.businessEmail, businessEmail, "name textbox in Get in touch form");
		aDriver.type(HomePage.country, country, "Country name textbox in Get in touch form");
		aDriver.type(HomePage.phoneNo, phoneNo, "phone no. textbox in Get in touch form");
		aDriver.type(HomePage.anyAdditionalNote, anyAdditionalNote, "name textbox in Get in touch form");
		aDriver.click(HomePage.submit, "Add Admin feature");

		// Validate message after click submit button
		WebElement ele = driver.findElement(HomePage.captureMsg);
		String capture = ele.getText();
		System.out.println("The captured message is: " + capture);

		Assert.assertEquals(capture, "The form was sent successfully.");

		// Scroll to the top of the web page.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
	}

	// About Us >>Our team
	public void AboutUsOurteam() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on Our team from About us dropdownlist");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// aDriver.navigateToApplication("https://mohs10.io");
		// js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		// js.executeScript("window.scrollBy(0,-2500)");
		aDriver.click(HomePage.aboutusModule, "About us mouse hover");

		aDriver.click(HomePage.ourTeam, "Click on our team");
		WebElement text = driver.findElement(HomePage.textFoundingTeam);
		String textFoundingteam = text.getText();
		Assert.assertEquals(textFoundingteam, "Founding Team");
		WebElement text1 = driver.findElement(HomePage.textTechTeam);
		String textTechteam = text1.getText();
		Assert.assertEquals(textTechteam, "Tech Team");
		WebElement text2 = driver.findElement(HomePage.textSalesNmarketingTeam);
		String textSalesteam = text2.getText();
		Assert.assertEquals(textSalesteam, "Sales & Marketing Team");
		WebElement text3 = driver.findElement(HomePage.textSupportTeam);
		String textSupportteam = text3.getText();
		Assert.assertEquals(textSupportteam, "Office Support Team");
		String title = driver.getTitle();

		WebElement lnkdnLink = driver.findElement(HomePage.ourTeamLnkdn);
		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, lnkdnLink);
		aDriver.click(HomePage.ourTeamYoutube, "click on Youtube link");
		Thread.sleep(2000);
		// Switch to Youtube tab
		aDriver.SwitchWindowByTitle(driver, "Mohs10 Technologies - YouTube");
		String titleYoutube = driver.getTitle();
		Assert.assertEquals(titleYoutube, "Mohs10 Technologies - YouTube");

		// Switch to Mohs10 tab
		aDriver.SwitchWindowByTitle(driver, title);
		aDriver.click(HomePage.ourTeamTwitter, "click on twitter link");
		Thread.sleep(2000);
		// Switch to Twitter tab
		aDriver.SwitchWindowByTitle(driver, "Mohs10 Technologies (@Mohs10Tech) / Twitter");
		aDriver.SwitchWindowByTitle(driver, "Log in to Twitter / Twitter");
		// aDriver.switchToNewWindow(driver);

		String titleTwitter = driver.getTitle();
		Assert.assertEquals(titleTwitter, "Log in to Twitter / Twitter");

		// Switch to Mohs10 tab
		aDriver.SwitchWindowByTitle(driver, title);
		aDriver.click(HomePage.ourTeamLnkdn, "click on linkdin link");
		Thread.sleep(2000);
		// Switch to Linkdin tab
		aDriver.SwitchWindowByTitle(driver, "Sign In | LinkedIn");
		aDriver.SwitchWindowByTitle(driver, "Mohs10 Technologies | LinkedIn");

		String titleLinkdin = driver.getTitle();
		Assert.assertEquals(titleLinkdin, "Sign In | LinkedIn");
		// Assert.assertEquals(titleLinkdin, "Mohs10 Technologies | LinkedIn");

		// Switch to Mohs10 tab
		aDriver.SwitchWindowByTitle(driver, title);

	}

	// Service>>>>performance testing select from services dropdown
	public void PerformanceTestingSelect() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest
				.createNode("Click action on perfomance testing from services dropdownlist");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		aDriver.navigateToApplication("https://mohs10.io");
		aDriver.click(HomePage.servicesDropdown, "Services dropdownlist");
		aDriver.click(HomePage.performanceTestingSelect, "Click on perfomance testing from services dropdownlist");
		WebElement element = driver.findElement(HomePage.textPerformanceTesting);
		String text = element.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text, "Performance Testing");

		WebElement ele = driver.findElement(HomePage.talkToAnExpertButton);

		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, ele);
		Thread.sleep(750);
		aDriver.click(HomePage.talkToAnExpertButton, "Talk to an expert button");
		System.out.println("Clicked talked to an expert in performance testing page");
	}

	// Service>>>>Functional testing select from services dropdown
	public void FunctionalTestingSelect() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on perfomance testing from services dropdownlist");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// aDriver.navigateToApplication("https://mohs10.io");

		aDriver.click(HomePage.servicesDropdown, "Services dropdownlist");
		aDriver.click(HomePage.fuctionalTestingSelect, "Click on perfomance testing from services dropdownlist");
		WebElement element = driver.findElement(HomePage.textFunctionalTesting);
		String text = element.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text, "Functional Testing");

		WebElement elem = driver.findElement(HomePage.talkToAnExpertButton);

		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, elem);
		Thread.sleep(3000);
		aDriver.click(HomePage.talkToAnExpertButton, "Talk to an expert button");
		System.out.println("Clicked talked to an expert in functional testing page");
	}

	// Service>>>>AI/ML testing select from services dropdown
	public void AInMLtestingSelect() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on AI/ML testing from services dropdownlist");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// aDriver.navigateToApplication("https://mohs10.io");

		aDriver.click(HomePage.servicesDropdown, "Services dropdownlist");
		aDriver.click(HomePage.aimlTestingSelect, "Click on AI/ML testing from services dropdownlist");
		WebElement element = driver.findElement(HomePage.textAIMLTesting);
		String text = element.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text, "AI/ML Testing");

		WebElement ele = driver.findElement(HomePage.talkToAnExpertButton);

		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, ele);
		Thread.sleep(3000);
		aDriver.click(HomePage.talkToAnExpertButton, "Talk to an expert button");
		System.out.println("Clicked talked to an expert in AI/ML testing page");
	}

	// Service>>>>security testing select from services dropdown
	public void SecuritytestingSelect() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on Security testing from services dropdownlist");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// aDriver.navigateToApplication("https://mohs10.io");
		aDriver.click(HomePage.servicesDropdown, "Services dropdownlist");
		aDriver.click(HomePage.securityTestingSelect, "Click on Security testing from services dropdownlist");

		WebElement element = driver.findElement(HomePage.textSecurityTesting);
		String text = element.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text, "Security Testing");

		WebElement ele = driver.findElement(HomePage.talkToAnExpertButton);

		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, ele);
		Thread.sleep(1000);
		aDriver.click(HomePage.talkToAnExpertButton, "Talk to an expert button");
		System.out.println("Clicked talked to an expert in security testing page");
	}

	// Products>>>>Mobile select from products dropdownlist
	public void MobileSelect() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on mobile from Products dropdownlist");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		aDriver.navigateToApplication("https://mohs10.io");
		aDriver.click(HomePage.productDropdown, "Product dropdownlist");
		aDriver.click(HomePage.mobileSelect, "Click on mobile from Products dropdownlist");
		WebElement element = driver.findElement(HomePage.textMobile);
		String text = element.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text, "Mobile");

		WebElement ele = driver.findElement(HomePage.talkToAnExpertButton);

		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, ele);
		Thread.sleep(1000);
		aDriver.click(HomePage.talkToAnExpertButton, "Talk to an expert button");
		System.out.println("Clicked talked to an expert in Mobile page");
	}

	// Products>>>>Web select from products dropdownlist
	public void WebSelect() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on web from Products dropdownlist");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// aDriver.navigateToApplication("https://mohs10.io");
		aDriver.click(HomePage.productDropdown, "Product dropdownlist");
		aDriver.click(HomePage.webSelect, "Click on web from Products dropdownlist");
		WebElement element = driver.findElement(HomePage.textWeb);
		String text = element.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text, "Web");

		WebElement ele = driver.findElement(HomePage.talkToAnExpertButton);

		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, ele);
		Thread.sleep(1000);
		aDriver.click(HomePage.talkToAnExpertButton, "Talk to an expert button");
		System.out.println("Clicked talked to an expert in web page");
	}

	// Products>>>>API & Micro-services select from products dropdownlist
	public void APInMicroServicesSelect() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on API & Micro-services from Products dropdownlist");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// aDriver.navigateToApplication("https://mohs10.io");
		aDriver.click(HomePage.productDropdown, "Product dropdownlist");
		aDriver.click(HomePage.apinMicroServicesSelect, "Click on API & Micro-services from Products dropdownlist");
		WebElement element = driver.findElement(HomePage.textAPInMicroservices);
		String text = element.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text, "API & Micro-Services");

		WebElement ele = driver.findElement(HomePage.talkToAnExpertButton);

		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, ele);
		Thread.sleep(1000);
		aDriver.click(HomePage.talkToAnExpertButton, "Talk to an expert button");
		System.out.println("Clicked talked to an expert in API & Micro-Services page");
	}

	// Products>>>>SAAS select from products dropdownlist
	public void SaasSelect() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on SAAS from Products dropdownlist");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// aDriver.navigateToApplication("https://mohs10.io");
		aDriver.click(HomePage.productDropdown, "Product dropdownlist");
		aDriver.click(HomePage.saasSelect, "Click on SAAS from Products dropdownlist");
		WebElement element = driver.findElement(HomePage.textSAAS);
		String text = element.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text, "SAAS");

		WebElement ele = driver.findElement(HomePage.talkToAnExpertButton);

		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, ele);
		Thread.sleep(1000);
		aDriver.click(HomePage.talkToAnExpertButton, "Talk to an expert button");
		System.out.println("Clicked talked to an expert in SAAS page");
	}

	// Resources>>>>blog select from resources dropdownlist
	public void BlogSelect() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on blog from Resources dropdownlist");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		aDriver.navigateToApplication("https://mohs10.io");
		aDriver.click(HomePage.resourcesDropdown, "Resources dropdownlist");
		aDriver.click(HomePage.blogSelect, "Click on blog from Resources dropdownlist");
	}

	// Click on 1nd Article
	public void ClickArticle1() throws Exception {
		 StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on Article: In-depth testing of AI applications that use images");
		WebElement ele = driver.findElement(HomePage.blog1);

		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, ele);

		aDriver.mouseHoverByJavaScript(ele);
		Thread.sleep(1000);
		aDriver.JSClick(driver, ele);
		Thread.sleep(1000);
		// aDriver.click(HomePage.blog1, "Click on article 1");
		System.out.println("Clicked on article 1");
		aDriver.SwitchWindowByTitle(driver,
				"Test Automation Forum - in-depth testing of AI applications that use images");
		WebElement element = driver.findElement(HomePage.tafTitle1);
		String text = element.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text, "In-Depth Testing Of AI Applications That Use Images");

		aDriver.SwitchWindowByTitle(driver, "Blogs - Mohs10 Technologies");
	}

	// Click on Article 2
	public void ClickArticle2() throws Exception {
		 StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on Article: In this age of Hyper-Automation why Manual testing is still a boon for enterprise app testing?");
		WebElement ele = driver.findElement(HomePage.blog2);

		// Scroll down to the element
		// aDriver.scrollByVisibilityOfElement(driver, ele);
		// Thread.sleep(3000);
		aDriver.mouseHoverByJavaScript(ele);
		Thread.sleep(1000);
		aDriver.JSClick(driver, ele);
		Thread.sleep(1000);
		System.out.println("Clicked on article 2");
		aDriver.SwitchWindowByTitle(driver,
				"Test Automation Forum - In this age of Hyper-Automation why Manual testing is still a boon for enterprise app testing?");
		WebElement element = driver.findElement(HomePage.tafTitle2);
		String text = element.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text,
				"In This Age Of Hyper-Automation Why Manual Testing Is Still A Boon For Enterprise App Testing?");
		aDriver.SwitchWindowByTitle(driver, "Blogs - Mohs10 Technologies");
	}

	// Click on Article 3
	public void ClickArticle3() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on Article: The Top 10 Application Security Issues of 2021 (OWASP) & how to test them");
		WebElement ele = driver.findElement(HomePage.blog3);

		// Scroll down to the element
		// aDriver.scrollByVisibilityOfElement(driver, ele);

		aDriver.mouseHoverByJavaScript(ele);
		Thread.sleep(1000);
		aDriver.JSClick(driver, ele);
		// aDriver.click(HomePage.blog1, "Click on article 1");
		System.out.println("Clicked on article 3");
		aDriver.SwitchWindowByTitle(driver,
				"Test Automation Forum - The Top 10 Application Security Issues of 2021 (OWASP) & how to test them");
		WebElement element = driver.findElement(HomePage.tafTitle3);
		String text = element.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text, "The Top 10 Application Security Issues Of 2021 (OWASP) & How To Test Them");

		aDriver.SwitchWindowByTitle(driver, "Blogs - Mohs10 Technologies");
	}

	// Click on Article 4
	public void ClickArticle4() throws Exception {
		 StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on Article: How DevOps builds the future of the software industry?");
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(HomePage.blog4);

		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, ele);

		aDriver.mouseHoverByJavaScript(ele);
		Thread.sleep(1000);
		aDriver.JSClick(driver, ele);

		System.out.println("Clicked on article 4");
		aDriver.SwitchWindowByTitle(driver,
				"Test Automation Forum - How DevOps builds the future of the software industry?");
		WebElement element = driver.findElement(HomePage.tafTitle4);
		String text = element.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text, "How DevOps Builds The Future Of The Software Industry?");
		aDriver.SwitchWindowByTitle(driver, "Blogs - Mohs10 Technologies");
	}

	// Click on Article 5
	public void ClickArticle5() throws Exception {
	 StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on Article: Enabling continuous testing for an E-commerce application using Selenium hybrid framework");
		

		WebElement ele = driver.findElement(HomePage.blog5);

		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, ele);

		aDriver.mouseHoverByJavaScript(ele);
		Thread.sleep(1000);
		aDriver.JSClick(driver, ele);
		System.out.println("Clicked on article 5");
		aDriver.SwitchWindowByTitle(driver,
				"Enabling continuous testing for an E-commerce application using Selenium hybrid framework - Test Automation Forum");
		WebElement element = driver.findElement(HomePage.tafTitle5);
		String text = element.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text,
				"Enabling Continuous Testing For An E-Commerce Application Using Selenium Hybrid Framework");
		aDriver.SwitchWindowByTitle(driver, "Blogs - Mohs10 Technologies");
	}

	// Click on Article 6
	public void ClickArticle6() throws Exception {
	 StartBrowser.childTest = StartBrowser.parentTest.createNode("Click action on Article: Enabling 100% coverage for file upload and download using AutoIt in Selenium");

		WebElement ele = driver.findElement(HomePage.blog6);

		// Scroll down to the element
		aDriver.scrollByVisibilityOfElement(driver, ele);

		aDriver.mouseHoverByJavaScript(ele);
		Thread.sleep(1000);
		aDriver.JSClick(driver, ele);

		System.out.println("Clicked on article 6");
		aDriver.SwitchWindowByTitle(driver,
				"Test Automation Forum - Enabling 100% coverage for file upload and download using AutoIt in Selenium");
		WebElement element = driver.findElement(HomePage.tafTitle6);
		String text = element.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text, "Enabling 100% Coverage For File Upload And Download Using AutoIt In Selenium");
		aDriver.SwitchWindowByTitle(driver, "Blogs - Mohs10 Technologies");
	}

	// Partners page text validation
	public void PartnersPage() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Partners page validate");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		aDriver.click(HomePage.partners, "Click on partners module");
		WebElement ourPartners = driver.findElement(HomePage.partnersText);
		String text = ourPartners.getText();
		System.out.println("The captured text is: " + text);
		// Validating text
		Assert.assertEquals(text, "Our Partners");

		aDriver.scrollByVisibilityOfElement(driver, ourPartners);
		aDriver.click(HomePage.partnersSwipe3, "Click on 3rd dot for swipe right");
		aDriver.click(HomePage.clickSimplyfy3x, "Click on 3rd dot for swipe right");
		aDriver.SwitchWindowByTitle(driver, "Simplify3X");
		aDriver.SwitchWindowByTitle(driver, "Partners - Mohs10 Technologies");
		aDriver.click(HomePage.clickDeepFactor, "Click on 3rd dot for swipe right");
		aDriver.SwitchWindowByTitle(driver, "Developer Security Platform | Secure Software Development | Deepfactor");

		aDriver.SwitchWindowByTitle(driver, "Partners - Mohs10 Technologies");
	}

}
