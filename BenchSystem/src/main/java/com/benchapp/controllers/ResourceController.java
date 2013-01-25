/**
 * 
 */
package com.benchapp.controllers;

/**
 * @author eduardo.bran
 *
 */
import java.util.LinkedList;
import java.util.List;

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
import com.benchapp.models.Area;
import com.benchapp.models.FormList;
import com.benchapp.models.ResourceView;


@Controller("resourceController")
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
		System.out.println(resourceView.toString());
		return "ResourcePage";
	}
	@RequestMapping(value="/ResourceProfile/{id}",method = RequestMethod.GET)
	public String ResourceProfile(@PathVariable("id") int id,ModelMap model)
	{
		model.addAttribute("id",id);
		return "ResourceProfile";
	}
	@RequestMapping(value="/List",method = RequestMethod.GET)
	public String ResourceProfile(ModelMap model)
	{
		FormList form = new FormList();
		List<Area> areas =new LinkedList<Area>();
		areas.add(new Area(1,"guana","lol"));
		areas.add(new Area(2,"chepe","troll"));
		form.setAreas(areas);
		model.addAttribute("areas",form);
		return "Lista";
	}
	@RequestMapping(value = "/PostList",method = RequestMethod.POST)
	public String PostList(@ModelAttribute("resourceForm")FormList list, ModelMap model, BindingResult result) {
		if(result.hasErrors())
		{
			return "redirect:/";
		}
		for (Area area : list.getAreas()) {
			System.out.println("id: " + area.getPositionId());
			System.out.println("name: " + area.getName());
			System.out.println("status: " + area.getStatus());
		}
		return "ResourcePage";
	}
}
