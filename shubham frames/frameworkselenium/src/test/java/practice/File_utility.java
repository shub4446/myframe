package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import com.crm.generic_utility.ipathconstant_excel;

public class File_utility {
	

		/**
		 * this method is to login the application
		 * @param key
		 * @return
		 * @author shubham
		 * @throws IOException 
		 */
		public String getpropertykeyvalue(String key) throws IOException {
			//FileInputStream fis=new FileInputStream("./commandata.properties");
			FileInputStream fis= new FileInputStream(ipathconstant_excel.EXCELFILE_PATH_BOOK);
			Properties p=new Properties();
			p.load(fis);
			String value=p.getProperty(key);
			return value;

		}
	}

