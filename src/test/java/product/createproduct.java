package product;


import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.generic_utility.Base_class;
import com.crm.generic_utility.Excel_utility;
import com.crm.generic_utility.Java_utility;
import com.crm.generic_utility.validation_utility;
import com.crm.objectrepository.create_product;
import com.crm.objectrepository.homepage;
import com.crm.objectrepository.login_page;

public class createproduct extends Base_class {
	@Test
	public void createproductTEST() throws IOException {
		homepage home=new homepage(driver);
		login_page login = new login_page(driver);
		login.Login("admin", "root");   
		home.Clickproduct();
		create_product cp=new create_product(driver);
		cp.Clickcreateprod();
		Excel_utility elib=new Excel_utility();
		Java_utility jlib = new Java_utility();
		int rannum = jlib.javaran();
		String value = elib.getexcelvalues_book("product_int", 0, 0)+rannum;
		System.out.println(value);
		cp.giveproductfeedname(value);
		cp.Clicksaveproductname();
		validation_utility vu=new validation_utility(driver);
		vu.productValid(driver, value);

	}

}
