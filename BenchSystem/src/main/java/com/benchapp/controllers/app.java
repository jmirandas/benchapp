package com.benchapp.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class app {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
		String strFecha = "2007-12-25";
		Date fecha = null;
		fecha = formatoDelTexto.parse(strFecha);
		System.out.println(fecha);
	}
}

