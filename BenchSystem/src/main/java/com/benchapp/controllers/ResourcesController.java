/**
 * 
 */
package com.benchapp.controllers;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.benchapp.dao.ResourceDAO;
import com.benchapp.models.Resources;

/**
 * @author esteban.guevara
 * 
 */
@Controller
@RequestMapping("/Resource/")
public class ResourcesController {
	/**
	 * Inject ResourceDAO from com.benchapp.dao
	 */
	@Resource(name = "resourceImplDAO")
	private ResourceDAO resourceDAO;

	@RequestMapping(value = "List", method = RequestMethod.GET, produces = "application/json;charset=utf8")
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ExceptionHandler(NullPointerException.class)
	@ResponseBody
	public Collection<Resources> ResourcesOnTheBeanch(
			NullPointerException nullPint) {
		return resourceDAO.GetResourcesOnTheBench();
	}

	@RequestMapping(value = "Search/Limitdate/{limitdate}/DevelopmentCenter/{developmentCenter}/Area/{area}", method = RequestMethod.GET, produces = "application/json;charset=utf8")
	@ResponseBody
	public Collection<Resources> FormSearch(
			@PathVariable("limitdate") String limitDate,
			@PathVariable("developmentCenter") String developmenCenter,
			@PathVariable("area") int area) throws CharacterCodingException {
		Charset charset = Charset.forName("ISO-8859-1");
		CharsetDecoder decoder = charset.newDecoder();
		CharsetEncoder encoder = charset.newEncoder();
		CharBuffer uCharBuffer = CharBuffer.wrap(developmenCenter);
		ByteBuffer bbuf = encoder.encode(uCharBuffer);
		CharBuffer cbuf = decoder.decode(bbuf);
		System.out.println(limitDate);
		System.out.println(cbuf.toString());
		System.out.println(area);
		return resourceDAO.GetResourcesOnTheBench(limitDate, developmenCenter,
				area);

	}
}
