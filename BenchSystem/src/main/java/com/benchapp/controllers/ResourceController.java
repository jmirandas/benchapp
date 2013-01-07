/**
 * 
 */
package com.benchapp.controllers;

/**
 * @author eduardo.bran
 *
 */

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.benchapp.dao.AreaDAO;
import com.benchapp.dao.DevelopmentCenterDAO;
import com.benchapp.dao.ResourceDAO;
import com.benchapp.models.ResourceView;


@Controller
@RequestMapping("/")
public class ResourceController {

	@Resource(name = "resourceImplDAO")
	private ResourceDAO resourceDAO;
	
	@Resource(name = "areaImplDAO")
	private AreaDAO areaDAO;
	
	@Resource(name = "developmentCenterImplDAO")
	private DevelopmentCenterDAO developmentCenterDAO;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String ListResources(ModelMap model){
		model.addAttribute("resourceForm",new ResourceView(new Date(),developmentCenterDAO.AvanticaDevelopmentCenter(), areaDAO.getAll("Area")));
		model.addAttribute("resources",resourceDAO.getAll("Resources"));
	return "ResourcePage";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String Search(@RequestParam("DevelopmentCenter") String dc, @RequestParam("Area") int area, ModelMap model) {
		model.addAttribute("resourceForm",new ResourceView(new Date(),developmentCenterDAO.AvanticaDevelopmentCenter(), areaDAO.getAll("Area")));
		model.addAttribute("resources",resourceDAO.Search(dc,area));
		return "ResourcePage";
	}
	

}
