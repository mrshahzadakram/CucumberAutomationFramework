package stepDefinition;

import context.TestContext;
import io.cucumber.java.en.When;
import pages.AUCPage;
import pages.CareGapsPage;
import pages.HCCPage;
import pages.PatientBanner;
import pages.PersiviaLoginPage;

public class TabSelectionSteps {
	
	CareGapsPage careGapsPage;
	HCCPage hccPage;
	PatientBanner patientBanner;
	PersiviaLoginPage loginPage;
	AUCPage aucPage;
	TestContext testContext;
	
	
	 public TabSelectionSteps(TestContext context) {
		 testContext = context;
		 careGapsPage = testContext.getPageObjectManager().getCareGapsPage();
		 hccPage = testContext.getPageObjectManager().getHccPage();
		 patientBanner = testContext.getPageObjectManager().getPatientBannerPage();
		 loginPage = testContext.getPageObjectManager().getpersiviaLoginPage();
		 aucPage = testContext.getPageObjectManager().getAUCPage();
		 
		 }
	 

		
		@When("the user clicks {string} of {string}")
		public void the_user_clicks_of(String clickType,String tabName) 
		{
			// If user has chosen Tab to click
			if(clickType.equalsIgnoreCase("tab"))
			{	
			
				if (tabName.equalsIgnoreCase("hcc"))
				{
					hccPage.click_hcc_tab();
				}
				if (tabName.equalsIgnoreCase("care gaps"))
				{
					careGapsPage.click_careGaps_tab();
				}
				
				if (tabName.equalsIgnoreCase("auc"))
				{
					aucPage.click_auc_tab();
				}
			}
				
				else {
					System.out.println("No Tab found!");
					 }
		 
			 
			
			/*
			// If user has chose a button or icon to click
			if(clickType.equalsIgnoreCase("icon"))
			{	
			
				if (tabName.equalsIgnoreCase(""))
				{
			 
				}
				else if (tabName.equalsIgnoreCase(""))
				{
			 
				}
				else {
					System.out.println("No icon found!");
					 }
		 
			 }
			*/
			
		}

}
