package com.mohs10.or;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HomePage {

	// Mosh10 website explore more links
	public static By exploreMore1 = By.xpath("(//span[.='Explore More'])[1]");
	public static By exploreMore2 = By.xpath("(//span[.='Explore More'])[2]");
	public static By exploreMore3 = By.xpath("(//span[.='Explore More'])[3]");
	public static By exploreMore4 = By.xpath("(//span[.='Explore More'])[4]");
	public static By exploreMore5 = By.xpath("(//span[.='Explore More'])[5]");
	public static By exploreMore6 = By.xpath("(//span[.='Explore More'])[6]");
	public static By exploreMore7 = By.xpath("(//span[.='Explore More'])[7]");
	public static By exploreMore8 = By.xpath("(//span[.='Explore More'])[8]");
	public static By exploreMore9 = By.xpath("(//span[.='Explore More'])[9]");
	public static By exploreMore10 = By.xpath("(//span[.='Explore More'])[10]");
	//Mohs10 logo on homepage
	public static By mohs10Logo = By.xpath("(//a[@href='https://mohs10.io/'])[1]");

	// + - icons in our expertise       (//i[@class='fas fa-plus'])[1]  (//i[@class='fas fa-minus'])[1]
	public static By plus1icon = By.xpath("(//span[@aria-hidden='true'])[1]/span/i[@class='fas fa-plus']");
	public static By minus1icon = By.xpath("(//span[@aria-hidden='true'])[1]/span/i[@class='fas fa-minus']");
	public static By plus2icon = By.xpath("(//span[@aria-hidden='true'])[2]/span/i[@class='fas fa-plus']");
	public static By minus2icon = By.xpath("(//span[@aria-hidden='true'])[2]/span/i[@class='fas fa-minus']");
	public static By plus3icon = By.xpath("(//span[@aria-hidden='true'])[3]/span/i[@class='fas fa-plus']");
	public static By minus3icon = By.xpath("(//span[@aria-hidden='true'])[3]/span/i[@class='fas fa-minus']");
	public static By plus4icon = By.xpath("(//span[@aria-hidden='true'])[4]/span/i[@class='fas fa-plus']");
	public static By minus4icon = By.xpath("(//span[@aria-hidden='true'])[4]/span/i[@class='fas fa-minus']");
	
	// About us page
	public static By aboutusModule = By.xpath("(//a[@href='#'])[1]");
	public static By whoWeAre = By.xpath("(//a[.='Who we are'])[1]");
	public static By ourTeam = By.xpath("(//a[.='Our Team'])[1]");
	public static By aboutUsTitle = By.xpath("(//a[.='About us'])[1]");
	
	//our team linkdin icon, youtube, twitter
	public static By ourTeamLnkdn = By.xpath("//a[@href='https://www.linkedin.com/company/mohs10-technologies/mycompany/']");
	public static By ourTeamYoutube = By.xpath("//a[@href='https://www.youtube.com/@mohs10technologies']");
	public static By ourTeamTwitter= By.xpath("//a[@href='https://twitter.com/Mohs10Tech']");
	
	//our team text
	public static By textFoundingTeam = By.xpath("//h2[.='Founding Team']");
	public static By textTechTeam = By.xpath("//h2[.='Tech Team']");
	public static By textSalesNmarketingTeam = By.xpath("//h2[.='Sales & Marketing Team']");
	public static By textSupportTeam = By.xpath("//h2[.='Office Support Team']");
	// get in touch
	public static By getInTouch = By.xpath("//h2[.='Get in touch']");

	// get in touch form
	public static By name = By.xpath("//input[@id='form-field-name']");
	public static By companyName = By.xpath("//input[@id='form-field-field_0fbfb8e']");
	public static By businessEmail = By.xpath("//input[@name='form_fields[email]']");
	public static By country = By.xpath("//input[@name='form_fields[field_6c0986e]']");
	public static By phoneNo = By.xpath("//input[@name='form_fields[field_b0fe699]']");
	public static By anyAdditionalNote = By.xpath("//textarea[@name='form_fields[message]']");
	public static By submit = By.xpath("//span[.='Submit']");
	// Capture message after click on sbmit button
	public static By captureMsg = By.xpath("//div[@role='alert']");

//Services module	 
	public static By servicesDropdown = By.xpath("(//a[@href='#'])[3]");
	public static By performanceTestingSelect = By.xpath("(//a[@href='https://mohs10.io/performance-testing/'])[1]");
	public static By fuctionalTestingSelect = By.xpath("(//a[@href='https://mohs10.io/functional/'])[1]");
	public static By aimlTestingSelect = By.xpath("(//a[@href='https://mohs10.io/ai-ml-testing/'])[1]");
	public static By securityTestingSelect = By.xpath("(//a[@href='https://mohs10.io/security-testing/'])[1]");

//Text of performance testing page		 
	public static By textPerformanceTesting = By.xpath("//h2[.='Performance Testing']");
// Text of functional testing page
	public static By textFunctionalTesting = By.xpath("//h2[.='Functional Testing']");
// Text of AI/ML testing page
	public static By textAIMLTesting = By.xpath("//h2[.='AI/ML Testing']");
// Text of security testing page
	public static By textSecurityTesting = By.xpath("//h2[.='Security Testing']");

//Talk to an expert button	
	public static By talkToAnExpertButton = By.xpath("//span[.='Talk to an Expert']");

//Partners
	public static By partners = By.xpath("(//a[.='Partners'])[1]");
	public static By partnersText = By.xpath("//h3[.='Our Partners']");
	public static By partnersSwipe3 = By.xpath("//div[@class='swiper-pagination swiper-pagination-clickable swiper-pagination-bullets']/span[3]");
//Our Partners link	
	public static By clickSimplyfy3x=By.xpath("//div[@class='elementor-image-carousel swiper-wrapper']/div[9]/a[@href='https://www.simplify3x.com/']");
	public static By clickDeepFactor=By.xpath("//div[@class='elementor-image-carousel swiper-wrapper']/div[10]/a[@href='https://www.deepfactor.io/']");
	//h3[.='Our Partners']
//Product module	
	public static By productDropdown = By.xpath("(//a[@href='#'])[2]");
	public static By mobileSelect = By.xpath("(//a[@href='https://mohs10.io/mobile/'])[1]");
	public static By webSelect = By.xpath("(//a[@href='https://mohs10.io/web/'])[1]");
	public static By apinMicroServicesSelect = By.xpath("(//a[@href='https://mohs10.io/api-micro-services/'])[1]");
	public static By saasSelect = By.xpath("(//a[@href='https://mohs10.io/saas/'])[1]");

// Text of mobile page
	public static By textMobile = By.xpath("//h2[.='Mobile']");
// Text of web page
	public static By textWeb = By.xpath("//h2[.='Web']");
// Text of API & micro-services page
	public static By textAPInMicroservices = By.xpath("//h2[.='API & Micro-Services']");
// Text of SAAS page
	public static By textSAAS = By.xpath("//h2[.='SAAS']");

	//Resources module
	public static By resourcesDropdown = By.xpath("(//a[@href=\"#\"])[4]");
	public static By blogSelect = By.xpath("(//a[@href='https://mohs10.io/blogs/'])[1]");
	public static By blog1 = By.xpath("(//a[@href='https://testautomationforum.com/comprehensive-testing-of-image-based-ai-application/'])[1]");
	public static By blog2 = By.xpath("(//a[@href='https://testautomationforum.com/in-this-age-of-hyper-automation-why-manual-testing-is-still-a-boon-for-enterprise-app-testing-2/'])[1]");
	public static By blog3 = By.xpath("(//a[@href='https://testautomationforum.com/the-top-10-application-security-issues-of-2021-owasp-how-to-test-them/'])[1]");
	public static By blog4 = By.xpath("(//a[@href='https://testautomationforum.com/how-devops-builds-the-future-of-the-software-industry/'])[1]");
	public static By blog5 = By.xpath("(//a[@href='https://testautomationforum.com/enabling-continuous-testing-for-an-e-commerce-application-using-selenium-hybrid-framework/'])[1]");
	public static By blog6 = By.xpath("(//a[@href='https://testautomationforum.com/enabling-100-coverage-for-file-upload-and-download-using-autoit-in-selenium/'])[1]");
//TAF titles	
	public static By tafTitle1 = By.xpath("//h1[.='in-depth testing of AI applications that use images']");
	public static By tafTitle2 = By.xpath("//h1[@class='elementor-heading-title elementor-size-default']");
	public static By tafTitle3 = By.xpath("//h1[@class='elementor-heading-title elementor-size-default']");	
	public static By tafTitle4 = By.xpath("//h1[.='How DevOps builds the future of the software industry?']");
	public static By tafTitle5 = By.xpath("//h1[@class='elementor-heading-title elementor-size-default']");
	public static By tafTitle6 = By.xpath("//h1[@class='elementor-heading-title elementor-size-default']");
	
//Reports in Admin module	
	public static By reportsInAdmin = By.xpath("//a[@href='/admin/Report']");
	public static By startDateReportsInAdmin = By.xpath("//input[@name='startDate']");
	public static By EndDateReportsInAdmin = By.xpath("//input[@name='endDate']");
	public static By DownloadGyneReportsInAdmin = By.xpath("//a[.=' Download Excel For Gynic']");
	public static By DownloadOBSReportsInAdmin = By.xpath("//a[.=' Download Excel OBS']");

	public static By btnShopNow = By.xpath("(//a[@role='button'])[1]");
	public static By btnFindMore = By.xpath("(//a[@role='button'])[2]");
	public static By btnShopNow2 = By.xpath("(//a[@role='button'])[3]");
	public static By btnShopNow3 = By.xpath("(//a[@role='button'])[4]");
	public static By lnkMen = By.xpath("(//a[.='Men'])[1]");
	public static By lnkTshirt = By.xpath("//a[.='DNK Green Tshirt']");
	public static By lnkIncQty = By.xpath("//input[@size='4']");
	public static By lnkColrCng = By.xpath("(//div[.='Aqua'])[1]");
	public static By lnkAddCart = By.xpath("//button[.='Add to cart']");
	public static By lnkHome = By.xpath("(//a[@rel='home'])[1]");

	public static By lnkCart = By.xpath("(//span[@class='ast-count-text'])[1]");

	public static By btnEverything = By.xpath("(//a[.='Everything'])[1]");
	public static By SearchProduct = By.xpath("//input[@type='search']");
	public static By ClkSearch = By.xpath("(//button[@type='submit'])[1]");
	public static By btnNext = By.xpath("//a[@class='next page-numbers']");
	public static By selectDeans = By.xpath("//h2[.='Dark Blue Denim Jeans']");
	public static By Checkoutbtn = By.xpath("(//a[.='Checkout'])[3]");

	// billing details
	public static By Fname = By.xpath("//input[@name='billing_first_name']");
	public static By Lname = By.xpath("//input[@name='billing_last_name']");
	public static By Comname = By.xpath("//input[@name='billing_company']");
	public static By CountryName = By.xpath("(//span[@class='select2-selection__rendered'])[1]");
	public static By CountryValue = By.xpath("//input[@class='select2-search__field']");
	public static By StreetAdd = By.xpath("//input[@name='billing_address_1']");
	public static By CityName = By.xpath("//input[@name='billing_city']");
	public static By StateName = By.xpath("(//span[@class='select2-selection__rendered'])[2]");
	public static By StateValue = By.xpath("//input[@class='select2-search__field']");
	public static By PinCode = By.xpath("//input[@name='billing_postcode']");
	public static By phoneNo1 = By.xpath("//input[@autocomplete='tel']");
	public static By Email = By.xpath("(//input[@type='email'])[1]");
	public static By OrderComments = By.xpath("//textarea[@name='order_comments']");
	public static By PlaceOrder = By.xpath("//button[.='Place order']");

	// subscribe
	public static By SubscribeText = By.xpath("//input[@type='email']");
	public static By clkSubscribe = By.xpath("//button[@name='wpforms[submit]']");

	// Contact Us
	public static By clkContactus = By.xpath("(//a[.='Contact Us'])[1]");
	public static By txtname = By.xpath("//input[@placeholder='NAME']");
	public static By txtSubject = By.xpath("//input[@placeholder='SUBJECT']");
	public static By txtEmail = By.xpath("//input[@placeholder='EMAIL']");
	public static By txtMessage = By.xpath("//textarea[@placeholder='MESSAGE']");
	public static By clkSndMsg = By.xpath("//button[.='Send Message']");

	public static By lnkBooks = By.xpath("//li[@class='inactive']//a[normalize-space()='Books']");
	public static By lnkGiftCards = By.xpath("//li[@class='inactive']//a[normalize-space()='Gift Cards']");

	// cart validation
	public static By krt = By.xpath("//span[@class=\"ast-count-text\"]");

}
