package delete_product;

import java.io.IOException;
import org.testng.annotations.Test;
import com.crm.generic_utility.Base_class;
import com.crm.generic_utility.Excel_utility;
import com.crm.generic_utility.Java_utility;
import com.crm.generic_utility.Webdriver_utility;
import com.crm.objectrepository.create_product;
import com.crm.objectrepository.homepage;

public class create_delete_productTEST extends Base_class {
	@Test

	public void c_delete_productTest() throws IOException {
		Excel_utility elib=new Excel_utility();
		Java_utility jlib=new Java_utility();
		int rannum = jlib.javaran();
		String value = elib.getexcelvalues_book("Sheet2", 0, 0)+rannum;
		homepage home=new homepage(driver);
		home.Clickproduct();
		create_product cp= new create_product(driver);
		cp.Clickcreateprod();
		cp.giveproductfeedname(value);
		cp.Clicksaveproductname();
		cp.Clickdeleteproduct();
		Webdriver_utility wlib=new Webdriver_utility();
		wlib.switch_to_alert_accept(driver);
		home.Clicksignoutmod();
		home.Clicksignout();
		driver.close();

	}

}
