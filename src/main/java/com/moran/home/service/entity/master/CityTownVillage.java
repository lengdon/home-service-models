package com.moran.home.service.entity.master;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.moran.home.service.entity.BaseModel;

@Entity
public class CityTownVillage extends BaseModel{
	private static final long serialVersionUID = 6982349164923306931L;
	
	@Id
	@GeneratedValue
	private int code;
	private String name;

	@ManyToOne
	@JoinColumn(name = "district_id", nullable = false, foreignKey = @ForeignKey(name = "city_dist"))
	private District district;

	CityTownVillage() {
	}

	public CityTownVillage(int code, String name, District district) {
		super();
		this.code = code;
		this.name = name;
		this.district = district;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityTownVillage other = (CityTownVillage) obj;
		if (code != other.code)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City/Town/Village [name=" + name + "]";
	}

}
