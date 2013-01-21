package com.benchapp.rest;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.benchapp.controllers.ResourceService;


@Path("/service")
public class BenchAppService{
	
	ResourceService resourceService;
	
	@GET
	@Path("/list")
	@Produces("application/json")
	public ModelMap getBookInJson(@Context ServletContext servletContext) {
		// public List<Book> getBookInXML() {
		// get Spring application context

		ApplicationContext ctx = WebApplicationContextUtils
				.getWebApplicationContext(servletContext);
		resourceService = ctx.getBean("resourceService", ResourceService.class);
	

		return resourceService.getALL();

	}
	
}