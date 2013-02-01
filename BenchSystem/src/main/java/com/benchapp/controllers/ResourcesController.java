/**
 * 
 */
package com.benchapp.controllers;

import java.nio.charset.CharacterCodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.benchapp.dao.ResourceDAO;
import com.benchapp.models.ResourceStoredProcedure;

/**
 * @author esteban.guevara
 * 
 */
@Controller
@RequestMapping("/Resource/")
public class ResourcesController {
	/**
	 * Inject ResourceDAO from com.benchapp.dao
	 */
	@Resource(name = "resourceImplDAO")
	private ResourceDAO resourceDAO;

	@RequestMapping(value = "List", method = RequestMethod.GET, produces = "application/json;charset=utf8")
	@ResponseStatus(value = HttpStatus.OK)
	@ExceptionHandler(NullPointerException.class)
	@ResponseBody
	public ResponseEntity<Map<String,List<ResourceStoredProcedure>>> ResourcesOnTheBeanch(
			NullPointerException nullPint) {
		Map<String,List<ResourceStoredProcedure>> jsonResources =  new HashMap<String,List<ResourceStoredProcedure>>();
		jsonResources.put("aaData",resourceDAO.GetResourcesOnTheBench());
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Access-Control-Allow-Origin", "*");
		responseHeaders.set("Access-Control-Allow-Methods", "GET");
		responseHeaders.set("Access-Control-Allow-Headers", "Content-Type");
		responseHeaders.set("Access-Control-Max-Age", "86400");
		return new ResponseEntity<Map<String,List<ResourceStoredProcedure>>>(
				jsonResources, responseHeaders,
				HttpStatus.OK);

	}

	@RequestMapping(value = "Search/Limitdate/{limitdate}/DevelopmentCenter/{developmentCenter}/Area/{area}", produces = "application/json;charset=utf8")
	@ResponseBody
	public  ResponseEntity<Map<String,List<ResourceStoredProcedure>>> FormSearch(
			@PathVariable("limitdate") String limitDate,
			@PathVariable("developmentCenter") String developmenCenter,
			@PathVariable("area") int area) throws CharacterCodingException {
		Map<String,List<ResourceStoredProcedure>> jsonResources =  new HashMap<String,List<ResourceStoredProcedure>>();
		jsonResources.put("aaData",resourceDAO.GetResourcesOnTheBench(limitDate, developmenCenter,area));
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Access-Control-Allow-Origin", "*");
		responseHeaders.set("Access-Control-Allow-Methods", "GET");
		responseHeaders.set("Access-Control-Allow-Headers", "Content-Type");
		responseHeaders.set("Access-Control-Max-Age", "86400");
		return new ResponseEntity<Map<String,List<ResourceStoredProcedure>>>(
				jsonResources, responseHeaders,
				HttpStatus.OK);
	}
}
