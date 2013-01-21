package com.benchapp.models;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


public class ResourceView {
	
	@NotNull
	@DateTimeFormat(pattern = "yy.MM.dd")
	@Temporal(TemporalType.TIME)
	private String limitDate;

	@NotNull
	@Valid
	private String center;

	@NotNull
	@Valid
	private short area;	
	/**
	 * 
	 */
	public ResourceView() {
		super();
		limitDate = null;
		center = null;
		area = 0;
	}

	/**
	 * @param limitDate
	 * @param developmnetCenter
	 * @param area
	 * @param developmnetCenters
	 * @param areas
	 */
	public ResourceView(String limitDate,String DevelopmentCenter, short Area) {
		super();
		this.limitDate = limitDate;
		this.center = DevelopmentCenter;
		this.area = Area;
	}
	/**
	 * @return the limitDate
	 */
	public String getLimitDate() {
		return limitDate;
	}

	/**
	 * @param limitDate the limitDate to set
	 */
	public void setLimitDate(String limitDate) {
		this.limitDate = limitDate;
	}

	/**
	 * @return the developmnetCenter
	 */
	public String getCenter() {
		return center;
	}

	/**
	 * @param developmnetCenter the developmnetCenter to set
	 */
	public void setCenter(String Center) {
		this.center = Center;
	}

	/**
	 * @return the area
	 */
	public short getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(short area) {
		this.area = area;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResourceView [limitDate=" + limitDate + ", center=" + center
				+ ", area=" + area + "]";
	}


}
