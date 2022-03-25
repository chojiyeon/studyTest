/**
 * YOU ARE STRICTLY PROHIBITED TO COPY, DISCLOSE, DISTRIBUTE, MODIFY OR USE THIS PROGRAM
 * IN PART OR AS A WHOLE WITHOUT THE PRIOR WRITTEN CONSENT OF MCOMPLUS.COM.
 * MCOMPLUS.COM OWNS THE INTELLECTUAL PROPERTY RIGHTS IN AND TO THIS PROGRAM.
 * COPYRIGHT (C) 2022 MCOMPLUS.COM ALL RIGHTS RESERVED.
 *
 * 하기 프로그램에 대한 저작권을 포함한 지적재산권은 mcomplus.com에 있으며,
 * mcomplus.com이 명시적으로 허용하지 않는 사용, 복사, 변경 및 제 3자에 의한 공개, 배포는 엄격히 금지되며
 * mcomplus.com의 지적재산권 침해에 해당된다.
 * Copyright (C) 2022 mcomplus.com All Rights Reserved.
 *
 *
 * Program		: test
 * Description	:
 * Environment	: JRE 1.7 or more
 * File			: ConvertExcelToJson.java
 * Notes		:
 * History		: [NO][Programmer][Description]
 *				: [20220222134105][choji@mcomplus.com][CREATE: Initial Release]
 */
package excellToJsonToExcell;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @version 1.0.0
 * @author choji@mcomplus.com
 *
 * @since 2022-02-22
 * <p>DESCRIPTION:</p>
 * <p>IMPORTANT:</p>
*/
/**
 * @author choji
 *
 */
public class ConvertExcelToJson {

	/**
	 * @param args
	 *
	 * @since 2022-02-22
	 *<p>DESCRIPTION:</p>
	 *<p>IMPORTANT:</p>
	 *<p>EXAMPLE:</p>
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ConvertExcelToJsonDto> memberships =readExcelFile("C:/Users/choji/Desktop/json/dev/membership_system_info.xlsx");
		
		memberships.forEach(s -> {
			System.out.println("membership: " + s);
		});
		
		String jsonString = convertObjectsToJsonString(memberships);
		System.out.println("jsonString: " + jsonString);
		
		writeObjectsToJsonFile(memberships, "C:/Users/choji/Desktop/json/dev/membership_system_info.json");
		

	}
	
	private static List<ConvertExcelToJsonDto> readExcelFile(String filePath) {
		System.out.println("filePath: " + filePath);
		try {
			FileInputStream excelFile = new FileInputStream(new File(filePath));
			Workbook workbook = new XSSFWorkbook(excelFile);
			System.out.println("excelFile: " + excelFile);
			System.out.println("workbook: " + workbook);
			//Workbook workbook = WorkbookFactory.create(new File(filePath));
			Sheet sheet = workbook.getSheet("SysInfo");
			System.out.println("sheet: " + sheet);
			//XSSFSheet sheet = workbook.getSheetAt(0);
			
			Iterator<Row> rows = sheet.iterator();
			
			List<ConvertExcelToJsonDto> memberships_1st = new ArrayList<ConvertExcelToJsonDto>();
			int rowNumber = 0;
			while(rows.hasNext()) {
				Row currentRow = rows.next();
				
				if(rowNumber == 0) {
					rowNumber++;
					continue;
				}
				
				Iterator<Cell> cellsInRow = currentRow.iterator();
				
				ConvertExcelToJsonDto mem = new ConvertExcelToJsonDto();
				
				int cellIndex = 0;
				while(cellsInRow.hasNext()) {
					Cell currentCell = cellsInRow.next();
					System.out.println("cellIndex: " + cellIndex);
					
					//onebarcode
//					switch(cellIndex) {
//					case 0:
//						mem.setMain_code(currentCell.getStringCellValue());
//						break;
//					case 1:
//						mem.setSub_code(currentCell.getStringCellValue());
//						break;
//					case 2:
//						mem.setCardcomp_code(currentCell.getStringCellValue());
//						break;
//					case 3:
//						mem.setCardcomp_desc(currentCell.getStringCellValue());
//						break;
//					case 4:
//						mem.setReg_datetime(currentCell.getStringCellValue());
//						break;
//					case 5:
//						mem.setReg_name(currentCell.getStringCellValue());
//						break;
//					case 6:
//						mem.setGscaltex_code(currentCell.getStringCellValue());
//						break;
//					case 7:
//						mem.setBand_min(currentCell.getStringCellValue());
//						break;
//					case 8:
//						mem.setBand_max(currentCell.getStringCellValue());
//						break;
//					
//					}
					
					// cd
//					switch(cellIndex) {
//					case 0:
//						mem.setCategory_code(currentCell.getStringCellValue());
//						break;
//					case 1:
//						mem.setCompany_code(currentCell.getStringCellValue());
//						break;
//					case 2:
//						mem.setMembership_code(currentCell.getStringCellValue());
//						break;
//					case 3:
//						mem.setCategory_name(currentCell.getStringCellValue());
//						break;
//					case 4:
//						mem.setClient_name(currentCell.getStringCellValue());
//						break;
//					case 5:
//						mem.setMembership_name(currentCell.getStringCellValue());
//						break;
//					case 6:
//						mem.setOverrap_yn(currentCell.getStringCellValue());
//						break;
//					case 7:
//						mem.setReg_datetime(currentCell.getStringCellValue());
//						break;
//					case 8:
//						mem.setReg_name(currentCell.getStringCellValue());
//						break;
//					case 9:
//						mem.setUpdate_datetime(currentCell.getStringCellValue());
//						break;
//					case 10:
//						mem.setUpdate_name(currentCell.getStringCellValue());
//						break;
//					case 11:
//						mem.setPayment_yn(currentCell.getStringCellValue());
//						break;
//					case 12:
//						mem.setPayment_maincode(currentCell.getStringCellValue());
//						break;
//					case 13:
//						mem.setPayment_subcode(currentCell.getStringCellValue());
//						break;
//					case 14:
//						mem.setSales_maincode(currentCell.getStringCellValue());
//						break;
//					case 15:
//						mem.setSales_subcode(currentCell.getStringCellValue());
//						break;
//					case 16:
//						mem.setGw_use(currentCell.getStringCellValue());
//						break;
//					}
					
					//system
//					switch(cellIndex) {
//					case 0:
//						mem.setMembership_code(currentCell.getStringCellValue());
//						break;
//					case 1:
//						mem.setExclusive_yn(currentCell.getStringCellValue());
//						break;
//					case 2:
//						mem.setGwproc_desc(currentCell.getStringCellValue());
//						break;
//					case 3:
//						mem.setGwprocdetail_desc(currentCell.getStringCellValue());
//						break;
//					case 4:
//						mem.setEncryption_code(currentCell.getStringCellValue());
//						break;
//					case 5:
//						mem.setEncryption_key1(currentCell.getStringCellValue());
//						break;
//					case 6:
//						mem.setEncryption_key2(currentCell.getStringCellValue());
//						break;
//					case 7:
//						mem.setProtocol_ver(currentCell.getStringCellValue());
//						break;
//					case 8:
//						mem.setPartner_desc(currentCell.getStringCellValue());
//						break;
//					case 9:
//						mem.setDevserver_ip(currentCell.getStringCellValue());
//						break;
//					case 10:
//						mem.setDevserver_port(currentCell.getStringCellValue());
//						break;
//					case 11:
//						mem.setOpserver_ip(currentCell.getStringCellValue());
//						break;
//					case 12:
//						mem.setOpserver_port(currentCell.getStringCellValue());
//						break;
//					case 13:
//						mem.setDevmembership_url(currentCell.getStringCellValue());
//						break;
//					case 14:
//						mem.setOpmembership_url(currentCell.getStringCellValue());
//						break;
//					case 15:
//						mem.setDevpoint_url(currentCell.getStringCellValue());
//						break;
//					case 16:
//						mem.setOppoint_url(currentCell.getStringCellValue());
//						break;
//					case 17:
//						mem.setDevlist_url(currentCell.getStringCellValue());
//						break;
//					case 18:
//						mem.setOplist_url(currentCell.getStringCellValue());
//						break;
//					case 19:
//						mem.setDevpull_url(currentCell.getStringCellValue());
//						break;
//					case 20:
//						mem.setOppull_url(currentCell.getStringCellValue());
//						break;
//					case 21:
//						mem.setReference_desc(currentCell.getStringCellValue());
//						break;
//					case 22:
//						mem.setReg_datetime(currentCell.getStringCellValue());
//						break;
//					case 23:
//						mem.setReg_name(currentCell.getStringCellValue());
//						break;
//					case 24:
//						mem.setUpdate_datetime(currentCell.getStringCellValue());
//						break;
//					case 25:
//						mem.setUpdate_name(currentCell.getStringCellValue());
//						break;
//					case 26:
//						mem.setEncryptionkey_code(currentCell.getStringCellValue());
//						break;
//					case 27:
//						mem.setGwprocdetaildev_desc(currentCell.getStringCellValue());
//						break;
//					case 28:
//						mem.setUse_yn(currentCell.getStringCellValue());
//						break;
//					case 29:
//						mem.setDevonebarcode_url(currentCell.getStringCellValue());
//						break;
//					case 30:
//						mem.setOponebarcode_url(currentCell.getStringCellValue());
//						break;
//					}
					
					//system_info.json
					switch(cellIndex) {
					case 0:
						mem.setMembership_code(currentCell.getStringCellValue());
						break;
					case 1:
						mem.setGwproc_desc(currentCell.getStringCellValue());
						break;
					case 2:
						mem.setGwprocdetail_desc(currentCell.getStringCellValue());
						break;
					case 3:
						mem.setGwprocdetaildev_desc(currentCell.getStringCellValue());
						break;
					case 4:
						mem.setEncryption_code(currentCell.getStringCellValue());
						break;
					case 5:
						mem.setEncryptionkey_code(currentCell.getStringCellValue());
						break;
					case 6:
						mem.setEncryption_key1(currentCell.getStringCellValue());
						break;
					case 7:
						mem.setEncrytionN_key2(currentCell.getStringCellValue());
						break;
					case 8:
						mem.setProtocol_ver(currentCell.getStringCellValue());
						break;
					case 9:
						mem.setPartner_desc(currentCell.getStringCellValue());
						break;
					case 10:
						mem.setDevserver_ip(currentCell.getStringCellValue());
						break;
					case 11:
						mem.setDevserver_port(currentCell.getStringCellValue());
						break;
					case 12:
						mem.setOpserver_ip(currentCell.getStringCellValue());
						break;
					case 13:
						mem.setOpserver_port(currentCell.getStringCellValue());
						break;
					case 14:
						mem.setDevmembership_url(currentCell.getStringCellValue());
						break;
					case 15:
						mem.setOpmembership_url(currentCell.getStringCellValue());
						break;
					case 16:
						mem.setDevpoint_url(currentCell.getStringCellValue());
						break;
					case 17:
						mem.setOppoint_url(currentCell.getStringCellValue());
						break;
					case 18:
						mem.setDevlist_url(currentCell.getStringCellValue());
						break;
					case 19:
						mem.setOplist_url(currentCell.getStringCellValue());
						break;
					case 20:
						mem.setDevpull_url(currentCell.getStringCellValue());
						break;
					case 21:
						mem.setOppull_url(currentCell.getStringCellValue());
						break;
					case 22:
						mem.setDevonebarcode_url(currentCell.getStringCellValue());
						break;
					case 23:
						mem.setOponebarcode_url(currentCell.getStringCellValue());
						break;
					case 24:
						mem.setPayment_yn(currentCell.getStringCellValue());
						break;
					}
					cellIndex++;
				}
				memberships_1st.add(mem);
				
			}
			workbook.close();
			return memberships_1st;
			
		} catch (Exception e) {
			throw new RuntimeException("FAIL! -> message = " + e.getMessage());
		}
	}
	
	private static String convertObjectsToJsonString(List<ConvertExcelToJsonDto> memberships) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "";
		
		try {
			jsonString = mapper.writeValueAsString(memberships);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return jsonString;
	}
	
	private static void writeObjectsToJsonFile(List<ConvertExcelToJsonDto> memberships, String pathFile) {
		ObjectMapper mapper = new ObjectMapper();

		File file = new File(pathFile);
		try {
			// Serialize Java object info JSON file.
			mapper.writeValue(file, memberships);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


