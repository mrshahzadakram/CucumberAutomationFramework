package support;

import org.openqa.selenium.WebDriver;

import pages.AUCPage;
import pages.AnalyticsWebPage;
import pages.CareGapsPage;
import pages.FooterPage;
import pages.GlobalSchedulesPage;
import pages.HCCPage;
import pages.PatientBanner;
import pages.PersiviaLoginPage;
import pages.SearchPage;

public class PageObjectManager {
 
		 private WebDriver driver;
		 private PatientBanner patientBannerPage;
		 private PersiviaLoginPage persiviaLoginPage;
		 private CareGapsPage careGapsPage;
		 private SearchPage searchPage;
		 private HCCPage hccPage;
		 private AnalyticsWebPage analyticsWebPage;
		 private FooterPage footerPage;
		 private GlobalSchedulesPage globalSchedulesPage;
		 private AUCPage aucPage;
		
		 public PageObjectManager(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 }
		 
		 
		 public PatientBanner getPatientBannerPage(){
		 
		 return (patientBannerPage == null) ? patientBannerPage = new PatientBanner(driver) : patientBannerPage;
		 
		 }
		 
		 
		 public PersiviaLoginPage getpersiviaLoginPage(){
			 
			 return (persiviaLoginPage == null) ? persiviaLoginPage = new PersiviaLoginPage(driver) : persiviaLoginPage;
			 
			 }
		 
		 public SearchPage getSearchPage(){
			 
			 return (searchPage == null) ? searchPage = new SearchPage(driver) : searchPage;
			 
			 }
		 
		 public CareGapsPage getCareGapsPage(){
			 
			 return (careGapsPage == null) ? careGapsPage = new CareGapsPage(driver) : careGapsPage;
			 
			 }
		 
		 public HCCPage getHccPage(){
			 
			 return (hccPage == null) ? hccPage = new HCCPage(driver) : hccPage;
			 
			 }
		 
		 
public AnalyticsWebPage getAnalyticsWebPage(){
			 
			 return (analyticsWebPage == null) ? analyticsWebPage = new AnalyticsWebPage(driver) : analyticsWebPage;
			 
			 }
public FooterPage getFooterPage(){
			 
			 return (footerPage == null) ? footerPage = new FooterPage(driver) : footerPage;
			 
			 }
public GlobalSchedulesPage getGlobalSchedulesPage(){
	 
	 return (globalSchedulesPage == null) ? globalSchedulesPage = new GlobalSchedulesPage(driver) : globalSchedulesPage;
	 
	 }
public AUCPage getAUCPage(){
	 
	 return (aucPage == null) ? aucPage = new AUCPage(driver) : aucPage;
	 
	 }

}
