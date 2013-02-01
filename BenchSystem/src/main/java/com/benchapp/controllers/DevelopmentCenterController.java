/**
 * 
 */
package com.benchapp.controllers;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

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

	@RequestMapping(value = "List", method = RequestMethod.GET, produces = { "application/json;charset=utf-8" })
	@ResponseStatus(value = HttpStatus.OK)
	@ExceptionHandler(NullPointerException.class)
	@ResponseBody
	public List<DevelopmentCenter> ListDC(
			NullPointerException nullPointer, HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Method", "GET");
		response.setHeader("Access-Control-Allow--Headers", "Content-Type");
		return developmentCenterDAO.AvanticaDevelopmentCenter();
	}
}
