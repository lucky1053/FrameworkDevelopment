package utilities;

import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class test {
	
	public static void main(String[] args) throws FileNotFoundException {
		TestDataGenerator td = new TestDataGenerator();
		ExcelWriter.createExcel();
	//	TestDataGenerator td = new TestDataGenerator();
		//ExcelWriter.loadData(td);
		
				
		
	/*	 td.generateGender();
		td.generateGender();
		td.generateFirstName();
		td.generateLastName();
		td.generateDOB();
		td.generateMOB();
		td.generateYOB();
		td.generateCompanyName();
		td.generateEmailId();
		td.generatePassword();
		
		*/
		
		
		
		/*Class myclass = td.getClass();
		 Method[] methodList=myclass.getDeclaredMethods();
		 System.out.println("Total No of Methods : "+methodList.length);
		 
		    //Step 4. Class has some other Inbuild methods that return Fields.
 Field[] fieldList=myclass.getDeclaredFields();
		    System.out.println("Total no of Fields : "+fieldList.length);*/
		
		
		   
		   
	}
}
