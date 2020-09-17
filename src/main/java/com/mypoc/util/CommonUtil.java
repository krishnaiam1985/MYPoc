package com.mypoc.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mypoc.model.Address;
/**
 * 
 * @author Krishna
 */
@Component
public class CommonUtil {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	
	/**
	 * 
	 * @param countryName
	 * @return
	 */
	public static Address getStateFullName(String countryName) {
		switch (countryName) {
			case "US":
				Address usAddress = new Address();
				usAddress.setHouse("9728 SININA CIR");
				usAddress.setCity("EAGLE RIVER");
				usAddress.setState("AK");
				usAddress.setStateCode("91577");
				return usAddress;
			case "Canada":
				Address canadaAddress = new Address();
				canadaAddress.setHouse("9728 SININA CIR");
				canadaAddress.setCity("EAGLE RIVER");
				canadaAddress.setState("CA");
				canadaAddress.setStateCode("99529");
				return canadaAddress;
			case "Mexico":
				Address mexicoAddress = new Address();
				mexicoAddress.setHouse("9728 SININA CIR");
				mexicoAddress.setCity("EAGLE RIVER");
				mexicoAddress.setState("FL");
				mexicoAddress.setStateCode("94477");
				return mexicoAddress;
			case "Netherlands":
				Address ndlAddress = new Address();
				ndlAddress.setHouse("9728 SININA CIR");
				ndlAddress.setCity("EAGLE RIVER");
				ndlAddress.setState("NM");
				ndlAddress.setStateCode("99578");
				return ndlAddress;
			default:
				System.out.println("Default>>>");
				;
			}
		return null;
	}
 	
}
