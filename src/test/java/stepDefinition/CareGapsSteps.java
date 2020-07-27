package stepDefinition;


import org.junit.Assert;
import context.TestContext;
import io.cucumber.java.en.Then;
import pages.CareGapsPage;

public class CareGapsSteps {
	
	CareGapsPage careGapsPage;
	TestContext testContext;
	

//    public CareGapsSteps(BaseUtil base) {
//        this.base = base;
//        careGapsPage = base.getPageObjectManager().getCareGapsPage();
//    }
	 public CareGapsSteps(TestContext context) {
	 testContext = context;
	 careGapsPage = testContext.getPageObjectManager().getCareGapsPage();
	

	 }
	
	@Then("{int} columns are shown on ui of care gaps")
	public void columns_are_shown_on_ui_of_care_gaps(int int1) throws ClassNotFoundException {
		   //scenarioDef.createNode(new GherkinKeyword("Then"), "5 columns are shown on ui of care gaps");
		int n = careGapsPage.find_no_of_tabs();
		Assert.assertEquals(int1, n);
	    
	}
	@Then("{string} is first column of care gaps")
	public void is_first_column(String string) throws ClassNotFoundException {
		 
		String actual = careGapsPage.get_text_first_column();
		Assert.assertEquals(string, actual);
	    
	}
	@Then("{string} is second column of care gaps")
	public void is_second_column(String string) throws ClassNotFoundException {
		
		String actual = careGapsPage.get_text_second_column();
		Assert.assertEquals(string, actual);
	}
	@Then("{string} is third column of care gaps")
	public void is_third_column(String string) throws ClassNotFoundException {
		
		String actual = careGapsPage.get_text_third_column();
		Assert.assertEquals(string, actual);
	}
	@Then("{string} is fourth column of care gaps")
	public void is_fourth_column(String string) throws ClassNotFoundException {
		
		String actual = careGapsPage.get_text_fourth_column();
		Assert.assertEquals(string, actual);
	}
	@Then("{string} is fifth column of care gaps")
	public void is_fifth_column(String string) throws ClassNotFoundException {
		
		String actual = careGapsPage.get_text_fifth_column();
		Assert.assertEquals(string, actual);
	}


}
