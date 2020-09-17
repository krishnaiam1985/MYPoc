package com.mypoc.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mypoc.model.Address;
import com.mypoc.util.CommonUtil;
/**
 * 
 * @author Krishna
 * 
 */
@RestController
@RequestMapping("${app.context.path}")
public class CountryRandomizerController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private CommonUtil commonUtil;
	
	private Map<String, String> responseMap =null; //new HashMap<>();
	
	@PostMapping(value = "address", produces ={MediaType.APPLICATION_JSON_VALUE})
	public String getRetrievedocumen(@RequestBody String countryName) {
		
		String formattedData="";
		
		Address address=CommonUtil.getStateFullName(countryName);
		String response=address.getHouse()+","+address.getCity()+","+address.getState()+","+address.getStateCode();
		
		try {
			formattedData = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println("formattedData>>"+formattedData);
		return formattedData;
		
		
	}
	
}
