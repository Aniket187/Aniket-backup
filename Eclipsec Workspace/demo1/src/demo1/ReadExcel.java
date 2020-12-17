package demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public void findempdetails(String []name, String fileName) throws MyException {
		String Nameofsheet = "Employee";
		List <String> employeeFoundlist=new ArrayList<String>();
		Sheet sheet1 = sheet(fileName, Nameofsheet);
		Nameofsheet = "Address";
		Sheet sheet2 = sheet(fileName, Nameofsheet);
		 final String stringcelltype = "STRING";
		final String numericelltype = "NUMERIC";
		List<Employee> emplist = new ArrayList<>();
		Map<Integer, Address> addressMap = new HashMap<>();
		Employee emp;
		Address ad;
		if (sheet1 != null) {
			int rowcount = sheet1.getLastRowNum() - sheet1.getFirstRowNum();
			for (int i = 1; i <= rowcount; i++) {
				Row row = sheet1.getRow(i);
				emp = new Employee();
				for (int j = 0; j < row.getLastCellNum(); j++) {

					if (row.getCell(0).getCellType().toString().equals(numericelltype)) {

						emp.setId((int) (row.getCell(0).getNumericCellValue()));
					}
					if (row.getCell(1).getCellType().toString().equals(stringcelltype)) {

						emp.setName((row.getCell(1).getStringCellValue()));
					}
					if (row.getCell(2).getCellType().toString().equals(stringcelltype)) {
						emp.setDesgination(row.getCell(2).getStringCellValue());
					}
					if (row.getCell(3).getCellType().toString().equals(numericelltype)) {
						emp.setSalary((long) row.getCell(3).getNumericCellValue());
					}
					if (row.getCell(4).getCellType().toString().equals(numericelltype)) {
						emp.setAddressId((int) row.getCell(4).getNumericCellValue());
					}
					if (row.getCell(5).getDateCellValue() != null) {
						emp.setjoiningDate((row.getCell(5).getDateCellValue()));
					}
				}
				emplist.add(emp);

			}
		} else {
			System.out.println("Sheet1 not found");
		}
		if (sheet2 != null) {
			int rowcount = sheet2.getLastRowNum() - sheet2.getFirstRowNum();
			for (int i = 1; i < rowcount + 1; i++) {
				Row row = sheet2.getRow(i);
				ad = new Address();
				for (int j = 0; j < row.getLastCellNum(); j++) {
					if (row.getCell(0).getCellType().toString().equals(numericelltype)) {
						ad.setAddressId((int) row.getCell(0).getNumericCellValue());
					}
					if (row.getCell(1).getCellType().toString().equals(stringcelltype)) {
						ad.setState(row.getCell(1).getStringCellValue());

					}
					if (row.getCell(2).getCellType().toString().equals(stringcelltype)) {
						ad.setCity(row.getCell(2).getStringCellValue());

					}
					if (row.getCell(3).getCellType().toString().equals(numericelltype)) {
						ad.setPincode((int) row.getCell(3).getNumericCellValue());
					}
				}

				addressMap.put((int) row.getCell(0).getNumericCellValue(), ad);

			}
		} else {
			System.out.println("sheet2 not found");
		}
		
		System.out.println("ID|Date of Joining|   Name        |Salary  | Location");
		
		for(int i=0;i<name.length;i++){
			for (Employee rs : emplist) {
				if (rs.getName().equals(name[i])) {
					System.out.printf(rs.getId()+" |"+rs.getJoiningDate() + "     | " + rs.getName() + "   |" + rs.getSalary() + " |"
							+ addressMap.get(rs.getAddressId()));
					employeeFoundlist.add(name[i]);
					System.out.println();
					break;
					}
				}	
			}
		List <String> newList= new ArrayList<>(Arrays.asList(name));
		newList.removeAll(employeeFoundlist);
		if(!newList.isEmpty()){
		System.out.println("Employee not found is:"+newList);
		}
			

		}
			

	

	private Sheet sheet(String fileName, String Nameofsheet) {
		File file = new File(fileName);
		FileInputStream inputStream = null;
		Sheet sheet1 = null;
		try {
			if (!file.exists()) {
				throw new MyException("File not found at location");
			}
			inputStream = new FileInputStream(file);
			Workbook book = null;
			String fileExtensionName = fileName.substring(fileName.indexOf("."));

			if (fileExtensionName.equals(".xlsx")) {

				book = new XSSFWorkbook(inputStream);
			} else if (fileExtensionName.equals(".xls")) {

				book = new HSSFWorkbook(inputStream);
			} else {
				try {
					throw new MyException("provide proper file formate i.e xlsx or xls");
				} catch (MyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			sheet1 = book.getSheet(Nameofsheet);

		} catch (MyException | IOException e) {

			System.out.println(e);
		}
		return sheet1;

	}
}
