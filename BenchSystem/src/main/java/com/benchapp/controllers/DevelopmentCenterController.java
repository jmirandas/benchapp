/**
 * 
 */
package com.benchapp.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.benchapp.dao.DevelopmentCenterDAO;
/**
 * @author eduardo.bran
 *
 */

@Controller
@RequestMapping("/welcome")
public class DevelopmentCenterController {

	@Resource(name = "developmentCenterImplDAO")
	private DevelopmentCenterDAO developmentCenterDAO;

	@RequestMapping(method = RequestMethod.GET)
	public String ListDC(ModelMap model)  {
	model.addAttribute("developmentCenter",developmentCenterDAO.AvanticaDevelopmentCenter());
	return "Lista";
	}
}
