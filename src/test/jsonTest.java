/**
 * YOU ARE STRICTLY PROHIBITED TO COPY, DISCLOSE, DISTRIBUTE, MODIFY OR USE THIS PROGRAM
 * IN PART OR AS A WHOLE WITHOUT THE PRIOR WRITTEN CONSENT OF MCOMPLUS.COM.
 * MCOMPLUS.COM OWNS THE INTELLECTUAL PROPERTY RIGHTS IN AND TO THIS PROGRAM.
 * COPYRIGHT (C) 2021 MCOMPLUS.COM ALL RIGHTS RESERVED.
 *
 * 하기 프로그램에 대한 저작권을 포함한 지적재산권은 mcomplus.com에 있으며,
 * mcomplus.com이 명시적으로 허용하지 않는 사용, 복사, 변경 및 제 3자에 의한 공개, 배포는 엄격히 금지되며
 * mcomplus.com의 지적재산권 침해에 해당된다.
 * Copyright (C) 2021 mcomplus.com All Rights Reserved.
 *
 *
 * Program : com.mcomplus.interface
 * Description :
 * Environment : JRE 1.7 or more
 * File : jsonTest.java
 * Notes :
 * History : [NO][Programmer][Description]
 * : [20210706142236][choji@mcomplus.com][CREATE: Initial Release]
 */
package test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @version 1.0.0
 * @author choji@mcomplus.com
 *
 * @since 2021-07-06
 * <p>DESCRIPTION:</p>
 * <p>IMPORTANT:</p>
*/
public class jsonTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String dstString = "{\r\n" + 
				"    \"PARTNERSHIP\": {\r\n" + 
				"        \"Header\": {\r\n" + 
				"            \"ClientName\": \"MEGABOX\",\r\n" + 
				"            \"ResultCount\": 20,\r\n" + 
				"            \"ResultMessage\": \"정상\",\r\n" + 
				"            \"ResultCode\": \"0000\"\r\n" + 
				"        },\r\n" + 
				"        \"Body\": {\r\n" + 
				"            \"SW005_GetPointHistoryEntity\": [\r\n" + 
				"                {\r\n" + 
				"                    \"USE_PLACE\": \"강남\",\r\n" + 
				"                    \"TRANSACTION_NO\": \"1\",\r\n" + 
				"                    \"USE_DAY\": \"2019-11-09\",\r\n" + 
				"                    \"AVAILABLE_POINT\": \"8200\",\r\n" + 
				"                    \"USED_POINT\": \"1600\",\r\n" + 
				"                    \"REMAIN_POINT\": \"8200\",\r\n" + 
				"                    \"TRANSACTION_TYPE\": \"적립\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"USE_PLACE\": \"창동\",\r\n" + 
				"                    \"TRANSACTION_NO\": \"2\",\r\n" + 
				"                    \"USE_DAY\": \"2019-10-21\",\r\n" + 
				"                    \"AVAILABLE_POINT\": \"8200\",\r\n" + 
				"                    \"USED_POINT\": \"800\",\r\n" + 
				"                    \"REMAIN_POINT\": \"8200\",\r\n" + 
				"                    \"TRANSACTION_TYPE\": \"적립\"\r\n" + 
				"                },\r\n" + 
				"            ]\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"";
		JSONObject jobj = new JSONObject();
		JSONParser parser = new JSONParser();
		jobj = (JSONObject) parser.parse(dstString);
	
		JSONObject jobj2 = (JSONObject)jobj.get("PARTNERSHIP");
		JSONObject jobj3 = (JSONObject)jobj2.get("Body");
		JSONArray jobj4 = (JSONArray)jobj3.get("SW005_GetPointHistoryEntity");
		JSONObject jobj5 = (JSONObject)jobj4.get(0);
		//JSONObject jobj6 = (JSONObject)jobj5.get("AVAILABLE_POINT");
	
		String date = (String)jobj5.get("USE_DAY");
		String day = date.replace("-", "");
		
		System.out.println("PARTNERSHIP: "+ jobj.get("PARTNERSHIP"));
		System.out.println("Body: "+ jobj2.get("Body"));
		System.out.println("SW005_GetPointHistoryEntity: "+ jobj3.get("SW005_GetPointHistoryEntity"));
		System.out.println("1g항목: "+ jobj4.get(0));
		System.out.println("AVAILABLE_POINT: "+ jobj5.get("USE_DAY"));
		System.out.println("date: "+ date);
		System.out.println("day: "+ day);
	}

}


