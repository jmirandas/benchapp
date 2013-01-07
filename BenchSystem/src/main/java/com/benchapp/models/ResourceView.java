package com.benchapp.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


public class ResourceView {
	
	@NotNull
	@DateTimeFormat(pattern = "yy.MM.dd")
	@Temporal(TemporalType.TIME)
	private Date disponivilityDate;
	
	@NotNull
	@Valid
	private List<DevelopmentCenter> developmnetCenter;
	
	@NotNull
	@Valid
	private List<Area> area;

	/**
	 * @param disponivilityDate
	 * @param developmnetCenter
	 * @param area
	 */
	public ResourceView(Date disponivilityDate,
			List<DevelopmentCenter> developmnetCenter, List<Area> area) {
		super();
		this.disponivilityDate = disponivilityDate;
		this.developmnetCenter = developmnetCenter;
		this.area = area;
	}
	public ResourceView() {
		super();
		this.disponivilityDate = null;
		this.developmnetCenter = null;
		this.area = null;
	}
	/**
	 * @return the disponivilityDate
	 */
	public Date getDisponivilityDate() {
		return disponivilityDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResourceView [disponivilityDate=" + disponivilityDate
				+ ", developmnetCenter=" + developmnetCenter + ", area=" + area
				+ "]";
	}

	/**
	 * @param disponivilityDate the disponivilityDate to set
	 */
	public void setDisponivilityDate(Date disponivilityDate) {
		this.disponivilityDate = disponivilityDate;
	}

	/**
	 * @return the developmnetCenter
	 */
	public List<DevelopmentCenter> getDevelopmnetCenter() {
		return developmnetCenter;
	}

	/**
	 * @param developmnetCenter the developmnetCenter to set
	 */
	public void setDevelopmnetCenter(List<DevelopmentCenter> developmnetCenter) {
		this.developmnetCenter = developmnetCenter;
	}

	/**
	 * @return the area
	 */
	public List<Area> getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(List<Area> area) {
		this.area = area;
	}

}
