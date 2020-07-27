package stepDefinition;

import org.junit.Assert;

import context.TestContext;
import io.cucumber.java.en.Then;
import pages.FooterPage;

public class FooterSteps {

	FooterPage footerPage;
	TestContext testContext;
	
	 public FooterSteps(TestContext context) {
		 testContext = context;
		 footerPage = testContext.getPageObjectManager().getFooterPage();
				 
		 }
	 


	
@Then("{int} sections are shown on footer section")
public void columns_are_shown_on_footer_section(int int1) {
	int n = footerPage.find_data_on_footer();
	Assert.assertEquals(int1, n);
   
}

@Then("{string} is first icon of footer")
public void is_first_icon_of_footer(String string) {
 String t = footerPage.get_text_first_icon_text();
 Assert.assertEquals(string, t);
    
}

@Then("{string} is second icon of footer")
public void is_second_icon_of_footer(String string) {
	String t = footerPage.get_text_second_icon_text();
	 Assert.assertEquals(string, t);
    
}
@Then("{string} is third icon of footer")
public void is_third_icon_of_footer(String string) {

	String t = footerPage.get_text_third_icon_text();
	 Assert.assertEquals(string, t);
    
}
@Then("{string} is fourth icon of footer")
public void is_fourth_icon_of_footer(String string) {
	String t = footerPage.get_text_fourth_icon_text();
	 Assert.assertEquals(string, t);
    
}
@Then("{string} is fifth icon of footer")
public void is_fifth_icon_of_footer(String string) {
	String t = footerPage.get_text_fifth_icon_text();
	 Assert.assertEquals(string, t);
    
}
@Then("{string} is sixth icon of footer")
public void is_sixth_icon_of_footer(String string) {
	String t = footerPage.get_text_sixth_icon_text();
	 Assert.assertEquals(string, t);
    
}


}
