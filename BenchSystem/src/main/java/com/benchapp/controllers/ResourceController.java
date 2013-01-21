/**
 * 
 */
package com.benchapp.controllers;

/**
 * @author eduardo.bran
 *
 */

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.benchapp.dao.AreaDAO;
import com.benchapp.dao.DevelopmentCenterDAO;
import com.benchapp.dao.ResourceDAO;
import com.benchapp.models.ResourceView;


@Controller
@RequestMapping("/")
public class ResourceController {

	/**
	 * Inject ResourceDAO from com.benchapp.dao
	 */
	@Resource(name = "resourceImplDAO")
	private ResourceDAO resourceDAO;
	/**
	 * Inject AreaDAO from com.benchapp.dao
	 */
	@Resource(name = "areaImplDAO")
	private AreaDAO areaDAO;
	/**
	 * Inject DevelopmentCenterDAO from com.benchapp.dao
	 */
	@Resource(name = "developmentCenterImplDAO")
	private DevelopmentCenterDAO developmentCenterDAO;
	/**
	 * present the list of all resource on the bench nowadays
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String ListResourcesOnTheBench(ModelMap model) {
		model.addAttribute("resourceForm",new ResourceView());
		model.addAttribute("centers", developmentCenterDAO.AvanticaDevelopmentCenter());
		model.addAttribute("areas", areaDAO.getMapArea());
		model.addAttribute("resources",resourceDAO.GetResourcesOnTheBench());
		return "ResourcePage";
	}
	/**
	 * search resource on the bench by a filter
	 */
	@RequestMapping(value = "/search",method = RequestMethod.POST)
	public String Search(@ModelAttribute("resourceForm")ResourceView resourceView, ModelMap model, BindingResult result) {
		if(result.hasErrors())
		{
			return "redirect:/";
		}
		model.addAttribute("resourceForm",resourceView);
		model.addAttribute("centers", developmentCenterDAO.AvanticaDevelopmentCenter());
		model.addAttribute("areas", areaDAO.getMapArea());
		model.addAttribute("resources",resourceDAO.GetResourcesOnTheBench(resourceView.getLimitDate(),resourceView.getCenter(),resourceView.getArea()));
		return "ResourcePage";
	}
	/**
	 * show the profile details about the resource by id
	 */
	@RequestMapping(value = "/ResourceProfile/{id}",method = RequestMethod.GET)
	public 	String ResourceProfile(@PathVariable int id, ModelMap model)
	{
		model.addAttribute("id",id);
		return "ResourceProfile";
	}
}
