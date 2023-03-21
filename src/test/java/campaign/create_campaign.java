package campaign;


import java.io.IOException;
import org.testng.annotations.Test;
import com.crm.generic_utility.Base_class;
import com.crm.generic_utility.Excel_utility;
import com.crm.generic_utility.Java_utility;
import com.crm.generic_utility.validation_utility;
import com.crm.objectrepository.create_campaign_pom;
import com.crm.objectrepository.homepage;
import com.crm.objectrepository.login_page;
public class create_campaign extends Base_class{
	
	
	@Test(groups = {"smoke Test","reggressionTest"})
	public void create_campaignTest() throws IOException {
		Excel_utility elib=new Excel_utility();
		homepage home =new homepage(driver);
		login_page login = new login_page(driver);
		login.Login("admin", "root");
		home.Clickmore();
		home.Clickcampaign();
		Java_utility jlib=new Java_utility();
		int incrementer = jlib.javaran();
		String data1 = elib.getexcelvalues_bydataformattor("Sheet1", 0, 0)+incrementer;
		create_campaign_pom cc= new create_campaign_pom(driver);
		cc.ClickCampaigncreation();
		cc.ClickCampaignnamefeed(data1);
		cc.ClickCampaignsavebutton();
		validation_utility vu= new validation_utility(driver);
		vu.campaignValid(driver, data1);
	}	
}