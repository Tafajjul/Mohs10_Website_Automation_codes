package com.mohs10.scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.mohs10.ActionDriver.DataProviders;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

public class HomeTest extends StartBrowser {
	/**
	 * Beginning of About us test scenario
	 */
	// Explore more links present in About us page
	@Test(priority = 1)
	public void ExploreMoreTestCase() throws Exception {
		CommonFuns cf = new CommonFuns();
		cf.ExploreMoreLink1();

		cf.ExploreMoreLink2();

		cf.ExploreMoreLink3();
		cf.ExploreMoreLink4();
		cf.ExploreMoreLink5();
		cf.ExploreMoreLink6();
		cf.ExploreMoreLink7();
		cf.ExploreMoreLink8();
		cf.ExploreMoreLink9();
		cf.ExploreMoreLink10();
	}

	// Expertise section
	 @Test(priority = 2)
	public void ClickOnIconTestCase() throws Exception {
		CommonFuns cf = new CommonFuns();
		cf.ClickPlusMinusIcon();
	}

	// Who we are page in about us dropdown list.
	 @Test(priority = 3)
	public void AboutUsToWhoWeAreTestCase() throws Exception {
		CommonFuns cf = new CommonFuns();
		cf.AboutUsMouseHover();

	}

	// Get in touch form TC
	 @Test(priority = 4, dataProvider = "Sheet1Data", dataProviderClass = DataProviders.class)
	public void GetInTouchFormTestCase(String name, String companyName, String businessEmail, String country,
			String phoneNo, String anyAdditionalNote) throws Exception {
		CommonFuns cf = new CommonFuns();
		cf.GetInTouch(name, companyName, businessEmail, country, phoneNo, anyAdditionalNote);
	}

	/**
	 * End of About us test scenario
	 */
	// Our team in about us dropdown list.
	 @Test(priority = 5)
	public void AboutUsToOurTeamTestCase() throws Exception {
		CommonFuns cf = new CommonFuns();
		cf.AboutUsOurteam();

	}

	/**
	 * Beginning of Service module test scenario
	 */
	// Services module TC
	 @Test(priority = 5, dataProvider = "Sheet1Data", dataProviderClass = DataProviders.class)
	public void ServicesPageTestCase(String name, String companyName, String businessEmail, String country,
			String phoneNo, String anyAdditionalNote) throws Exception {
		CommonFuns cf = new CommonFuns();
		cf.PerformanceTestingSelect();
		cf.GetInTouch(name, companyName, businessEmail, country, phoneNo, anyAdditionalNote);
		cf.FunctionalTestingSelect();
		cf.GetInTouch(name, companyName, businessEmail, country, phoneNo, anyAdditionalNote);
		cf.AInMLtestingSelect();
		cf.GetInTouch(name, companyName, businessEmail, country, phoneNo, anyAdditionalNote);
		cf.SecuritytestingSelect();
		cf.GetInTouch(name, companyName, businessEmail, country, phoneNo, anyAdditionalNote);
		cf.PartnersPage();
		/**
		 * End of Service module test scenario
		 */
	}

	/**
	 * Beginning & end of Product module test scenario
	 */
	// Products module TC
	 @Test(priority = 6, dataProvider = "Sheet1Data", dataProviderClass = DataProviders.class)
	public void ProductsPageTestCase(String name, String companyName, String businessEmail, String country,
			String phoneNo, String anyAdditionalNote) throws Exception {
		CommonFuns cf = new CommonFuns();
		cf.MobileSelect();
		cf.GetInTouch(name, companyName, businessEmail, country, phoneNo, anyAdditionalNote);
		cf.WebSelect();
		cf.GetInTouch(name, companyName, businessEmail, country, phoneNo, anyAdditionalNote);
		cf.APInMicroServicesSelect();
		cf.GetInTouch(name, companyName, businessEmail, country, phoneNo, anyAdditionalNote);
		cf.SaasSelect();
		cf.GetInTouch(name, companyName, businessEmail, country, phoneNo, anyAdditionalNote);

	}

	/**
	 * Beginning & end of Resources>>>blog page test scenario
	 */
	// Resources dropdownlist TC
	 @Test(priority = 7)
	public void ResourcesTestCase() throws Exception {
		CommonFuns cf = new CommonFuns();
		cf.BlogSelect();
		cf.ClickArticle1();
		cf.ClickArticle2();
		cf.ClickArticle3();
		cf.ClickArticle4();
		cf.ClickArticle5();
		cf.ClickArticle6();
	}

}
