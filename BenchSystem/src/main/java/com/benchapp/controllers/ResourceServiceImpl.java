package com.benchapp.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.benchapp.dao.AreaDAO;
import com.benchapp.dao.DevelopmentCenterDAO;
import com.benchapp.dao.ResourceDAO;
import com.benchapp.models.ResourceView;

@Service("resourceService")
public class ResourceServiceImpl implements ResourceService{
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
	public ModelMap getALL() {
		ModelMap model = new ModelMap(); 
		model.addAttribute("resourceForm",new ResourceView());
		model.addAttribute("centers", developmentCenterDAO.AvanticaDevelopmentCenter());
		model.addAttribute("areas", areaDAO.getMapArea());
		model.addAttribute("resources",resourceDAO.GetResourcesOnTheBench());
		//return "ResourcePage";
		
		// TODO Auto-generated method stub
		return model;
	}


}