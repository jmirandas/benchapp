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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.benchapp.dao.ResourceImpDAO;


@Controller
@RequestMapping("/")
public class ResourceController {

	@Resource(name = "resourceDAO")
	private ResourceImpDAO resourcedao;
	
	@RequestMapping(method = RequestMethod.GET)
	public String ListResources(ModelMap model)  {
	model.addAttribute("resources",resourcedao.list());
	return "ResourcePage";
	}
	

}
