/**
 * 
 */
package com.benchapp.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.benchapp.dao.DevelopmentCenterDAO;
import com.benchapp.models.DevelopmentCenter;

/**
 * @author eduardo.bran
 * 
 */

@Controller
@RequestMapping("/DevelopmentCenter/")
public class DevelopmentCenterController {

	@Resource(name = "developmentCenterImplDAO")
	private DevelopmentCenterDAO developmentCenterDAO;

	@RequestMapping(value = "List", method = RequestMethod.GET, produces =  "application/json;charset=utf8")
	@ResponseStatus(value = HttpStatus.OK)
	@ExceptionHandler(NullPointerException.class)
	@ResponseBody
	public Map<String,List<DevelopmentCenter>> ListDC(NullPointerException nullPointer) {
		Map<String,List<DevelopmentCenter>> jsonDevelopmentCenter =  new HashMap<String,List<DevelopmentCenter>>();
		jsonDevelopmentCenter.put("aaData",developmentCenterDAO.AvanticaDevelopmentCenter());
		return jsonDevelopmentCenter;
	}
}
