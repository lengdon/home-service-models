package com.moran.home.service.entity.master;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.moran.home.service.entity.BaseModel;

@Entity
public class District extends BaseModel {
	private static final long serialVersionUID = -5342061195274688380L;

	@Id
	private int code;
	private String name;

	@ManyToOne
	@JoinColumn(name = "state_id", nullable = false, foreignKey = @ForeignKey(name = "dist_state"))
	private StateProvince stateProvince;

	District() {
	}

	public District(int code, String name, StateProvince stateProvince) {
		super();
		this.code = code;
		this.name = name;
		this.stateProvince = stateProvince;
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

	public StateProvince getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(StateProvince stateProvince) {
		this.stateProvince = stateProvince;
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
		District other = (District) obj;
		if (code != other.code)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [name=" + name + "]";
	}

}
