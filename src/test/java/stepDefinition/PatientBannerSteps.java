package stepDefinition;


import org.junit.Assert;
import context.TestContext;
import io.cucumber.java.en.Then;
import pages.PatientBanner;


public class PatientBannerSteps {
	
	TestContext testContext;
	PatientBanner patientBanner;
	
	 public PatientBannerSteps(TestContext context) {
	 testContext = context;
	 patientBanner = testContext.getPageObjectManager().getPatientBannerPage();
	 }
    
	
	@Then("the data of selected patient is shown on ui")
	public void the_data_of_selected_patient_is_shown_on_ui() {
		
	int r =	patientBanner.find_data_on_banner();
	Assert.assertNotEquals(null,r);
		
	}
    
	// Test Case ID = PE_TC002
	@Then("there are {int} tabs including hcc and auc on ui")
	public void there_are_tabs_including_hcc_and_auc_on_ui(int int1) {
		
		
		int n = patientBanner.find_no_of_tabs();
		Assert.assertEquals(int1,n);
		
	
		
	}
	
	//selected patient name is matching with name shown on ui

	@Then("selected patient name is matching with name shown on ui")
	public void selected_patient_name_is_matching_with_name_shown_on_ui() {
		
	String r =	patientBanner.find_name_on_banner();
	System.out.println("Searced patien Name= "+r);
	Assert.assertTrue(r,r.contains("Appointment"));
		
	}
	
}
