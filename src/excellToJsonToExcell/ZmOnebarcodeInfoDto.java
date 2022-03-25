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
 * File			: ConvertExcelToJsonDto.java
 * Notes		:
 * History		: [NO][Programmer][Description]
 *				: [20220222134157][choji@mcomplus.com][CREATE: Initial Release]
 */
package excellToJsonToExcell;

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
public class ZmOnebarcodeInfoDto {

	private String main_code;
	private String sub_code;
	private String cardcomp_code;

	private String cardcomp_desc;
	private String reg_datetime;
	private String reg_name;
	private String gscaltex_code;
	private String band_min;
	private String band_max;
	public String getMain_code() {
		return main_code;
	}
	public void setMain_code(String main_code) {
		this.main_code = main_code;
	}
	public String getSub_code() {
		return sub_code;
	}
	public void setSub_code(String sub_code) {
		this.sub_code = sub_code;
	}
	public String getCardcomp_code() {
		return cardcomp_code;
	}
	public void setCardcomp_code(String cardcomp_code) {
		this.cardcomp_code = cardcomp_code;
	}
	public String getCardcomp_desc() {
		return cardcomp_desc;
	}
	public void setCardcomp_desc(String cardcomp_desc) {
		this.cardcomp_desc = cardcomp_desc;
	}
	public String getReg_datetime() {
		return reg_datetime;
	}
	public void setReg_datetime(String reg_datetime) {
		this.reg_datetime = reg_datetime;
	}
	public String getReg_name() {
		return reg_name;
	}
	public void setReg_name(String reg_name) {
		this.reg_name = reg_name;
	}
	public String getGscaltex_code() {
		return gscaltex_code;
	}
	public void setGscaltex_code(String gscaltex_code) {
		this.gscaltex_code = gscaltex_code;
	}
	public String getBand_min() {
		return band_min;
	}
	public void setBand_min(String band_min) {
		this.band_min = band_min;
	}
	public String getBand_max() {
		return band_max;
	}
	public void setBand_max(String band_max) {
		this.band_max = band_max;
	}
	@Override
	public String toString() {
		return "ZmOnebarcodeInfoDto [main_code=" + main_code + ", sub_code=" + sub_code + ", cardcomp_code="
				+ cardcomp_code + ", cardcomp_desc=" + cardcomp_desc + ", reg_datetime=" + reg_datetime + ", reg_name="
				+ reg_name + ", gscaltex_code=" + gscaltex_code + ", band_min=" + band_min + ", band_max=" + band_max
				+ "]";
	}
	
	
	

}


