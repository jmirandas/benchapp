/**
 * 
 */
package com.benchapp.controllers;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.benchapp.dao.DevelopmentCenterDAO;
/**
 * @author eduardo.bran
 *
 */

@Service
@RequestMapping("/DevelopmentCenter/")
public class DevelopmentCenterController {

	@Resource(name = "developmentCenterImplDAO")
	private DevelopmentCenterDAO developmentCenterDAO;

	@RequestMapping(value="List",method = RequestMethod.GET, produces = "application/json")
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ExceptionHandler(NullPointerException.class)
	public @ResponseBody Map<String, String> ListDC(NullPointerException nullPointer)  {
		return developmentCenterDAO.AvanticaDevelopmentCenter();
	}
}
