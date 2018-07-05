package com.moran.home.service.entity.address;

public class District {

	private int code;
	private int name;
	private State state;

	District() {
	}

	public District(int code, int name, State state) {
		super();
		this.code = code;
		this.name = name;
		this.state = state;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
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
