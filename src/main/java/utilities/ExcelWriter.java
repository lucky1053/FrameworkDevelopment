package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
	public static void createExcel() throws FileNotFoundException {

		TestDataGenerator td = new TestDataGenerator();
		Class myclass = td.getClass();
		Field[] fieldList = myclass.getDeclaredFields();
		System.out.println("Total no of Fields : " + fieldList.length);

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet spreadsheet = workbook.createSheet(" Registration Info ");

		for (int i = 0; i < fieldList.length; i++) {
			spreadsheet.setColumnWidth(i, 10000);
		}
		Row header = spreadsheet.createRow(0);

		CellStyle headerStyle = workbook.createCellStyle();
		headerStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		XSSFFont font = ((XSSFWorkbook) workbook).createFont();
		font.setFontName("Arial");
		font.setFontHeightInPoints((short) 16);
		font.setBold(true);
		headerStyle.setFont(font);

		Cell headerCell = header.createCell(0);
		headerCell.setCellValue("GENDER");
		headerCell.setCellStyle(headerStyle);

		headerCell = header.createCell(1);
		headerCell.setCellValue("FIRST NAME");
		headerCell.setCellStyle(headerStyle);

		headerCell = header.createCell(2);
		headerCell.setCellValue("LAST NAME");
		headerCell.setCellStyle(headerStyle);

		headerCell = header.createCell(3);
		headerCell.setCellValue("DATE");
		headerCell.setCellStyle(headerStyle);

		headerCell = header.createCell(4);
		headerCell.setCellValue("MONTH");
		headerCell.setCellStyle(headerStyle);

		headerCell = header.createCell(5);
		headerCell.setCellValue("YEAR");
		headerCell.setCellStyle(headerStyle);

		headerCell = header.createCell(6);
		headerCell.setCellValue("COMPANY NAME");
		headerCell.setCellStyle(headerStyle);

		headerCell = header.createCell(7);
		headerCell.setCellValue("EMAIL ID");
		headerCell.setCellStyle(headerStyle);

		headerCell = header.createCell(8);
		headerCell.setCellValue("PASSWORD");
		headerCell.setCellStyle(headerStyle);

		for (int i = 1; i <= 10; i++) {
			Row row = spreadsheet.createRow(i);
			for (int j = 0; j <= 8; j++) {
				Cell cell = row.createCell(j);
				String headerValue = header.getCell(j).getStringCellValue();

				switch (headerValue) {
				case "GENDER":
					cell.setCellValue(td.generateGender());
					break;
				case "FIRST NAME":
					cell.setCellValue(td.generateFirstName());
					break;
				case "LAST NAME":
					cell.setCellValue(td.generateLastName());
					break;
				case "DATE":
					cell.setCellValue(td.generateDOB());
					break;
				case "MONTH":
					cell.setCellValue(td.generateMOB());
					break;
				case "YEAR":
					cell.setCellValue(td.generateYOB());
					break;
				case "COMPANY NAME":
					cell.setCellValue(td.generateCompanyName());
					break;
				case "EMAIL ID":
					cell.setCellValue(td.generateEmailId());
					break;
				case "PASSWORD":
					cell.setCellValue(td.generatePassword());
					break;
				}

			}

		}

		FileOutputStream out = new FileOutputStream(
				new File("E:\\Selenium_Bootcamp\\TestDataExcel\\RegistrationDetails.xlsx"));
		try {
			workbook.write(out);
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			workbook.close();
			out.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("RegistrationDetails.xlsx written successfully");
	}
}
/*
 * public static void loadData(TestDataGenerator td) {
 * 
 * 
 * 
 * }
 */
