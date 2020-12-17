package demo1;

import java.util.Scanner;

public class test1 {


	public static void main(String[] args)  {
		System.out.println("Entre the number of employess to be found");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		sc.nextLine();
		String [] arr=new String[count];
		for(int i=0;i<count;i++){
			if(count<5&&count >0){
		
			System.out.println("Enter the name of employee:"+i);
			String temp= sc.nextLine();
			arr[i]=temp;
			//System.out.println(arr[i]);
			}
			else{
				System.out.println("we dont have that much of employee .Enter the number of employee ");
				count=sc.nextInt();
				sc.nextLine();
				arr=new String[count];
				i--;
			}
			
		}
		sc.close();
		
		ReadExcel rd=new ReadExcel();
		
		String fileName = "C:\\Users\\aniketbh\\Desktop\\Employee.xlsx";
		//rd.readexcel(fileName);
		try{
		rd.findempdetails(arr, fileName);
		}
		catch(MyException e){
			
			
		}
		
		/*
		File file = new File(fileName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook book = null;
		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		if (fileExtensionName.equals(".xlsx")) {
			book = new XSSFWorkbook(inputStream);
		} else if (fileExtensionName.equals(".xls")) {

			book = new HSSFWorkbook(inputStream);

		}
		Sheet sheet = book.getSheetAt(0);

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		for (int i = 0; i < rowCount + 1; i++) {
			Row row = sheet.getRow(i);
			Iterator<Cell> cellitr = row.cellIterator();
			String nam = "STRING";
			String str = "NUMERIC";
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = cellitr.next();
			//	System.out.println(cell.getCellType());
				if (cell.getCellType().toString().equals(nam)) {
					System.out.print(row.getCell(j).getStringCellValue() + "| ");
				} 
				else if (cell.getCellType().toString().equals(str)) {
					System.out.print( "celltype:-"+ cell.getCellType()+(long)(row.getCell(j).getNumericCellValue()) + "| ");
				
				}
			}

			System.out.println("-------");
		}*/ 
	}

}
