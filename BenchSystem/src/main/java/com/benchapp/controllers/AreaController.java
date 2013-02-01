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

import com.benchapp.dao.AreaDAO;
import com.benchapp.models.Area;

/**
 * @author esteban.guevara
 *
 */
@Controller
@RequestMapping("/Area/")
public class AreaController {
	
	@Resource(name = "areaImplDAO")
	private AreaDAO areaDAO;
	@RequestMapping(value="List",method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
	@ResponseStatus(value = HttpStatus.OK)
	@ExceptionHandler(NullPointerException.class)
	@ResponseBody
	public List<Area> ListDC(NullPointerException nullPointer,HttpServletResponse response)  {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Method", "GET");
		response.setHeader("Access-Control-Allow--Headers", "Content-Type");
		return areaDAO.getMapArea();
	}
}
