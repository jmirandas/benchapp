package com.benchapp.rest;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.core.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.benchapp.controllers.ResourceController;



@RequestMapping("/service/")
@Service("benchAppService")
public class BenchAppService {

	ResourceController resourceController;
	
	@GET
	@RequestMapping(value="List",method = RequestMethod.GET, produces = "application/json")
	public String getBookInXML(@Context ServletContext servletContext) {
		// public List<Book> getBookInXML() {
		// get Spring application context

		ApplicationContext ctx = WebApplicationContextUtils
				.getWebApplicationContext(servletContext);
		resourceController = ctx.getBean("resourceController", ResourceController.class);
		ModelMap model = null;

		return resourceController.ListResourcesOnTheBench(model);

	}	

}