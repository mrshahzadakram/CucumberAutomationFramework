package stepDefinition;


import org.junit.Assert;

import context.TestContext;
import io.cucumber.java.en.Then;
import pages.HCCPage;

public class HccSteps {
	
	HCCPage hccPage;
	TestContext testContext;
	
	
	 public HccSteps(TestContext context) {
	 testContext = context;
	 hccPage = testContext.getPageObjectManager().getHccPage();

	 }
	 //---------------------------------------------------------------------
	// Total columns under active problem lists
	 //-------------------------------------------------------------------
	@Then("{int} columns are shown on hcc ui under active problem lists")
	public void columns_are_shown_on_hcc_ui_under_active_problem_lists(int int1) {
		int n = hccPage.find_no_of_columns_of_active_problem_list();
		Assert.assertEquals(int1, n);
	    
	}
	//----------------------------------------------------------------------
	// Verifying text of active problem lists columns
	//----------------------------------------------------------------------
	
	@Then("{string} is first column of active problem lists")
	public void is_first_column_of_active_problem_lists(String string) {
		String actual = hccPage.get_text_of_first_column();
		Assert.assertEquals(string, actual);
	    
	}
	
	@Then("{string} is second column of active problem lists")
	public void is_second_column_of_active_problem_lists(String string) {
		String actual = hccPage.get_text_of_second_column();
		Assert.assertEquals(string, actual);
	    
	}
	
	@Then("{string} is third column of active problem lists")
	public void is_third_column_of_active_problem_lists(String string) {
		String actual = hccPage.get_text_of_third_column();
		Assert.assertEquals(string, actual);
	    
	}
	
	@Then("{string} is fourth column of active problem lists")
	public void is_fourth_column_of_active_problem_lists(String string) {
		String actual = hccPage.get_text_of_fourth_column();
		Assert.assertEquals(string, actual);
	    
	}
	
	  //--------------------------------------------------------------------------
	  // Total columns under dropped codes
	//----------------------------------------------------------------------------
		@Then("{int} columns are shown on hcc ui under active dropped codes")
		public void columns_are_shown_on_hcc_ui_under_dropped_codes(int int1) {
			int n = hccPage.find_no_of_columns_of_dropped_codes();
			Assert.assertEquals(int1, n);
		    
		}
	//--------------------------------------------------------------------------
 	// Verifying text of dropped codes columns
	//--------------------------------------------------------------------------
		@Then("{string} is first column of active dropped codes")
		public void is_first_column_of_active_dropped_codes(String string) {
			String actual = hccPage.get_text_first_column_dropped_codes();
			Assert.assertEquals(string, actual);
		    
		}
		
		@Then("{string} is second column of active dropped codes")
		public void is_second_column_of_active_dropped_codes(String string) {
			String actual = hccPage.get_text_second_column_dropped_codes();
			Assert.assertEquals(string, actual);
		    
		}
		
		@Then("{string} is third column of active dropped codes")
		public void is_third_column_of_active_dropped_codes(String string) {
			String actual = hccPage.get_text_third_column_dropped_codes();
			Assert.assertEquals(string, actual);
		    
		}
		
		@Then("{string} is fourth column of active dropped codes")
		public void is_fourth_column_of_active_dropped_codes(String string) {
			String actual = hccPage.get_text_fourth_column_dropped_codes();
			Assert.assertEquals(string, actual);
		    
		}

}
