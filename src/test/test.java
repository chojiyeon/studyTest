/**
 * YOU ARE STRICTLY PROHIBITED TO COPY, DISCLOSE, DISTRIBUTE, MODIFY OR USE THIS PROGRAM
 * IN PART OR AS A WHOLE WITHOUT THE PRIOR WRITTEN CONSENT OF MCOMPLUS.COM.
 * MCOMPLUS.COM OWNS THE INTELLECTUAL PROPERTY RIGHTS IN AND TO THIS PROGRAM.
 * COPYRIGHT (C) 2020 MCOMPLUS.COM ALL RIGHTS RESERVED.
 *
 * 하기 프로그램에 대한 저작권을 포함한 지적재산권은 mcomplus.com에 있으며,
 * mcomplus.com이 명시적으로 허용하지 않는 사용, 복사, 변경 및 제 3자에 의한 공개, 배포는 엄격히 금지되며
 * mcomplus.com의 지적재산권 침해에 해당된다.
 * Copyright (C) 2020 mcomplus.com All Rights Reserved.
 *
 *
 * Program : com.mcomplus.interface
 * Description :
 * Environment : JRE 1.7 or more
 * File : test.java
 * Notes :
 * History : [NO][Programmer][Description]
 * : [20201022113144][choji@mcomplus.com][CREATE: Initial Release]
 */
package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.apache.commons.logging.Log;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//import com.plutozone.util.Datetime;

import kr.co.mcom.util.security.Seed;
import kr.spay.cipher.al.AES256;

/**
 * @version 1.0.0
 * @author choji@mcomplus.com
 *
 * @since 2020-10-22
 * <p>DESCRIPTION:</p>
 * <p>IMPORTANT:</p>
*/
public class test {
	
	
	public static void main(String[] args) {
		List<String> a =new ArrayList<String>();
		Map<String,String> c = new HashMap<String,String>();
		String key2 ="\\(200)";
		
		System.out.println("test: " + key2.contains("\\("));
		c.put(key2, "3");
		
		c.put("200", String.valueOf(Integer.parseInt(c.get(key2).toString())+1));
		c.put("300", "3");
		c.put(key2, String.valueOf(Integer.parseInt(c.get(key2))+1));
		c.forEach((key, value)->{
			System.out.println("map: " +key+ " : " +value);
		});
		if(c.containsKey("200")) c.remove("200");
		
		c.forEach((key, value)->{
			System.out.println("map: " +key+ " : " +value);
		});
		
		
		a.add("a");
		a.add("a");
		a.add("a");
		a.add("a");
		a.add("c");
		
		for(String b: a) {
			if(a.contains("a")) {
				a.remove("a");
				//System.out.println("list: " + b);
			}
			System.out.println("b: " + b);
		}
		
		
	}
	
//	public static void main(String[] args) {
//
//		String a="1";
//		a=getLPad(a,4,"0");
//		System.out.println("a: "+getLPad(a,4,"0"));
//			
//	}
//	public static String getLPad(String str, int size, String strFillText) {
//        for(int i = (str.getBytes()).length; i < size; i++) {
//            str = strFillText + str;
//        }
//        return str;
//    }

	// seed 암호화 복호화 할때 사용
//	public static void main(String[] args) {
//		// TODO 바닐라코
//		//String encryption_key = "MCOMGWSW06402012";
//		//이은철
//		//String data = "f236f8009058a9c8771562338c6a1445a660abd32cc9d2400226382f63679720e5e0ccd33a3f99e184f24545171497e210f0e7de20bf3f6a7f954e9653e778312fb1218b393a85c398f4853a9cbba0752748095756922e3e6f677eecc5e6e675c219f082c983e318d844585dcce28d91722879281893087eb95672271f1aff754b31ed51ad8421b44cca608b358420919bb33b36442940f80c0841c0e796a95cdc2d2c7c255d833018067b961b1ec21ab1a0dbf5146477fd614e272e1d7dc0d4bc82acdb9f1ced4cf1aad64839d801478cc3987847528102dfecc8edbe857c5840b14e2b5bfbcf3f0015d8479e7e9f5e615a309f692f919ddec98f568ca3aaeeeb4f077575b03e5fb95099c23a8465dc38b3a0a5859d66c823ad396c3aa9fba9efb4dbd1d55d36be1880dc5bf5253db7960302a99714eadf6ba910aef01ffbafefb4dbd1d55d36be1880dc5bf5253db72f4b37b38714c6e00a6ebe17db56a3e6b8d194e7dd8d75536b489573069711dc8082406cfd4a2efed9615730a22d43b108003453499f7bee174bbbd2cad9d475a62f0910ab1b3ad0dee421e8a6b99d207aaa7292374724b8bcd6df87d93b73a8e9611df186c51aacde56729cf61e359061d722e7c6c189d9c9f285acad3ebdc8fc3206a291f5fb5063b366ac44aced7a369b062d5633ea39279393236949ae840cb74cb7c088b86569a0f438c7585a010269ea1c33105b0077c1923faf2a685c9f6829f91cef7ec74f260f1460ffabdcc07e626a4eeaca4438d3d3b63bbaf36d6ac4f0403509f3afabb1dce2bb86ecf8e518ba608ac008dd7f7c7252bd513c1870e90ee7e4cd4fd76da827d13a60e25049f2f1e04144b89c7e82dc3a7daa4dc339d110eb31d3c9ae3d64c8c84d87a796403e3c6c7613f0cf553cbc11c0dd5b1389d3da81a1e9458be26fdf41bad6f5e4b6e358a834a265d71a8488be232ab21d75d4e3f1a84dce8f2a3c2e8cecfafbe6bf5e6e8221b3596ed773501b2e4bd17c727a27503a9a771a922542e29dc368e4c9562311cea1be7c76327f00d0906853533954020b33984d3d3631841353343c279db5b1266f80ef23afb83df382bcf1190854233c2c5316cbdff22c59290bac0594d99f7c5422f4d35d8a27c9f96656aabe07e0414a1f299d01e2d3c027aca0a96d6b912a5666e7a1f340e303d32e54fe6d9aaa4dab6a710393af509cb280a0c5dcb046a4d5357618d209eb0eadcd90adc81387cf208aa5b800e6a1aa9e435523376768ba32c5ab3e5642a7920c5b3bf5b5e91b601f81d2d702c2ea0643931919f9c66b71395bf80d11ebfc1ed2b7a664fbe1b30407fd83695f4d52c3b3f565518f71ee6ac890ed5aec17c068c7d5de75d1206d396ae33fe74d58a9573d328c2282f157ed80b1035f52eb0d0c38a3e93265ea6753dc833e66f6c214cef65652de8eb678aff9d221e59d0a6dc71ddd4bd63ad22c8262597fbe56f5a9ac72439b0269ea1c33105b0077c1923faf2a685c9f6829f91cef7ec74f260f1460ffabdcac2ee45a9cabcfe77d9c8fef2be44f176ac4f0403509f3afabb1dce2bb86ecf84061d8ebf9af146d16a5f58b6c58ae18ca64f1274dc88614e4e5ffb67f0e7843de50e1054e42b6c580a582f1d0284f02";
//		//차수현
//		//String data ="pClw03RLb0a8Y65hNLmGfEKETcf87pOLAWHE8uOocNzssJ7ovSW6on0McT1TezWe2ajv0RTE1eZ95wO2P/8PKZInBVV04agbOfOHpbrKCbJSQjnI8aPtBOPbhNKL3tNgvIOqEQIGofkcZhP8nNX/BEvv7z4vgkWS3wv63KdSyhzE0nJHCedZ+tVG985HZKE2CyHs+J+njn47Q0jvqzmzsmAcaQ59QgV3ElIZUzMwj5zBSPLiSp0hctImbYh+Zu/wAWl1jFTyVBT/utUrJMYI0U4Ai21vHRENP5BYDGgMoE85tQgl9GFbhkZExMJQOpzgY++FawyC+7fvu6fGb0AsujnxRliZnWM/b1EyxMWLbwQ=";
//		
//		String errorMessage = "";
//		errorMessage = errorMessage + "<input type =\"text\" name=\"membership_code\" id=\"membership_code\" value=\"655\" /> <br /><br /> <button type=\"submit\">모니터링 중지</button>";
//		System.out.println(errorMessage);
//		
//		String encryption_key = "MCOMGWSW09202012";
//		//String data="d0b5de32c00b892dd37bb3431c361c0d2e4075d7fba86344303161adbc6fafeff2ed8edb79c4263025517a2a73b044778941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c2d2005aa6aceff2b2bf2f08c2c0cb86280f26a79c618c710554eb566ad3e1ad4932921bd865e30bd807283de05a5bd823808543fb4e9a1328b10995cec6ebd39c9591824713177a58730c2a52c3fd04400e7280575263153360cb331e8b4ecd8ab3ff736ad3be6d6a29178a9c49585178941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c66f2d51dadf5ad8a1eff38bd08e5d98a51d7ffce6f13d85f5c393f470f5c48238941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1ce56ef29c61bc37f6e1345ca00c3b744fbad2197d2f3ebf3c89832f578fb520f08941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1cb1ce34503c9969b959537f551f8dfd376a495d252e6c371f1fe6c8cd5f47de28a5063c06481c96fc6d4b56ab888337dda62f77e38b3f87155582d50a00e80fc9570f58cc00c4c7623bd0ab7d651f9d5c88546d666b975afa4d75967e44823b178941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c2c28407ec6ca09412ae220e80925bdcd8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c9faa5e3976b6956421f4c95407e510118941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8941ad581de66859eb3d454bb2b8da1c8ba59cb3a52745f8fba2fa62fea4da20095695817177ce46ae5ed956c9ccb57ba0faab7b1de1f3f09969d750f69ce1d78941ad581de66859eb3d454bb2b8da1cfb6b268bd2408c17af47d2639e17b882cea67b124bdc4bb2312ee4977254a3678941ad581de66859eb3d454bb2b8da1c28629b8d6ca5f0561a7e1c0dfba7e49118279bf8d073d6182a93ae3c9083d21a4fe63d82d1e948b7aaa0f6b7f249b5ba8941ad581de66859eb3d454bb2b8da1c";
//		String data1="1100101 202109131118262021091311182618540902010011    KK08471696";
//		String data = "장우재                        M198802148802141                                                                      021501032851153 N                    06729 서울특별시 서초구 서초동 1340-6                                                                     남강빌딩 10층 엠콤플러스                                                                            1          0                                                                                                    lK7UQqpgGStXNCLVLp6DaaSYb+43GhzKczCJTemr3hnDV1uTmckpl0tLamjS/JgMZ9Xu01P8eyL+HRV18sDKtw==                                                  K                                                 100107|1   1                    |2   1                    |3   0                    |4   0                    |5   0                    |6   0                    |7   0                   ";
//		String encoding = "euc-kr";
//		Seed seed = new Seed(encryption_key);
//		String ss = "1100101 202109131118262021091311182618540902010011    KK08471696";
//		String sampleRequest= "장우재                        M198802148802141                                                                      021501032851153 N                    06729 서울특별시 서초구 서초동 1340-6                                                                     남강빌딩 10층 엠콤플러스                                                                            1          0                                                                                                    lK7UQqpgGStXNCLVLp6DaaSYb+43GhzKczCJTemr3hnDV1uTmckpl0tLamjS/JgMZ9Xu01P8eyL+HRV18sDKtw==                                                  K                                                 100107|1   1                    |2   1                    |3   0                    |4   0                    |5   0                    |6   0                    |7   0                    ";
//		/*
//		 
//		 */
//		
//		
//		String sample_header = "1100101 202109131118262021091311182618540902010011    KK08471696";
//		String sample_body = "c305c5e33974511264f21c5b3357ff52cf66081487554aa0cd8a1f74528059ba9610c2bcefa294ca1028d08930cb1f1a752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b389201654716f31026c2a5462d903ff4ee3035477f03c59dc2fba26c98edab85722602e56251a62e6e03b47de08fd14a7483016e0795d0f4990d96c92ef7b33949312adcf46ae6336cb12899f1a118823752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b39d8e9685b2ad5eaa8515ec31a381bf94510365a8caec457d07163c540d1ed05f752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b3cbbff9bd9811851d81a4688ddd8dfa7aa8f13db36135e988c11545714598a10c752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b371afb1e3f5a2514e5f78f393d56fd2d3b8aed1e581a5a28da881b25361781caa307a1475cdd58d9b18fc569e69386c07da60f22465809be33673fbaf46b32ba485b9434bbc2ada047a0b715deb3dd9c671a713188383ec5b72ec6811ec9850d3752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b3e64bad6e231ada0da676862e6c132c9d752f30e53f9cf6aa6324a4e825a3d7b3752f30e53f9cf6aa6324a4e825a3d7b30b0d74b1d00dd2b6ece4c6244c50f6de752f30e53f9cf6aa6324a4e825a3d7b31d1b5779896a9cd5490d056af950783c9ab17466ad7f1c871af8b6f6b0d58150a8f13db36135e988c11545714598a10c88c4919aee56f9e9848f57fab095f123752f30e53f9cf6aa6324a4e825a3d7b39315d14e1d343eb73c9374269c26aae25a344ff0b75cb555e241e6b6e933e7385aff7c4c9674ce758a87195573415e59c973e7db32d1cc27734d386240038bf5752f30e53f9cf6aa6324a4e825a3d7b3";
//		
//		String encodingString = seed.encodeString(sampleRequest, encoding);
//		System.out.println("encodingString : "+ss+encodingString);
//		
//		String decodeString = seed.decodeString(sample_body, encoding);
//		System.out.println("decodeString : "+sample_header+decodeString);
//	}	
	
	
	
	
	
	//payco&&gs리테일 데이터 복호화
	
//	public static void main(String[] args) {
		//AES256 암호화
//		String xmlToString = "";
//*****************네이버페이
//		AES256 aes;
		//발급 네페 상용
		//String sSecurityKey = "MCOMPLUS10122020mComPlusnAveRpay";
		//네페 개발
//		String sSecurityKey = "MCOMPLUS06092020mComPlusnAveRpay";
		//SKwithAES aes = new SKwithAES(sSecurityKey);
//		aes = new AES256();
//*****************네이버페이
		
//*****************페이코
	//상용: MCOMPLUS11102016
		
//		try {
			//String encData = aes.decode(xmlToString, "UTF-8");
//			String data ="CP2RE6tzxIcV6mvCnOb/Nty+USTt1cbhCFBnAnlcyh00CXpW3KTGoswEETfoJu7+aPw7180/pfP/k1E1ZkymOXCSaB+j883c+umsFEEpEcT7pLZtJwyrNRMuRdzEdrkJITOXBf1CBhJtCOljj1tl25TiLUt4pdKkyvRj3secgVjyy0aMz3HaJ4jki66lHHOHYst4aC2nBKPW6/U0svpDPNk+qidaJVmg3V5cYfAtfBRo32Q876wqMaigF0CABKe7sg+16J5sT+gMAqDNthzmFOij84zQCOLWJkc3lWmcvAY=";
//			String encData = aes.decrypt(sSecurityKey, data);
//			System.out.println("[장애]"+"/" +" 발급(매30분) by ");
//			System.out.println("encData: "+encData);
//		} catch (InvalidKeyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NoSuchAlgorithmException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NoSuchPaddingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InvalidAlgorithmParameterException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalBlockSizeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (BadPaddingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}


