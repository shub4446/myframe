package Organization;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import com.crm.generic_utility.Base_class;
import com.crm.generic_utility.Excel_utility;
import com.crm.generic_utility.Java_utility;
import com.crm.generic_utility.validation_utility;
import com.crm.objectrepository.create_organization;
import com.crm.objectrepository.homepage;


public class createorganization extends Base_class {
	@Test(groups = {"reggression Test"})
	public void createorganizationtest() throws EncryptedDocumentException, IOException, InterruptedException  {
		Excel_utility elib=new Excel_utility();
		Java_utility jlib=new Java_utility();
		int ran = jlib.javaran();
		String value=elib.getexcelvalues_book("Sheet1", 0, 0)+ran;
		homepage home = new homepage(driver) ;
		home.Clickorganizatrion();
		create_organization co=new create_organization(driver);
		Thread.sleep(3000);
		co.Clickneworganization();
		Thread.sleep(3000);
		co.feedorgname(value);
		Thread.sleep(3000);
		co.Clicksaveorg();
		validation_utility vu=new validation_utility(driver);
		vu.organizationValid(driver, value);

	}
}

