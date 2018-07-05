package com.moran.home.service.entity.address;

public class State {
	private int code;
	private int name;
	private Country coutry;

	State() {
	}

	public State(int code, int name, Country coutry) {
		super();
		this.code = code;
		this.name = name;
		this.coutry = coutry;
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

	public Country getCoutry() {
		return coutry;
	}

	public void setCoutry(Country coutry) {
		this.coutry = coutry;
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
		State other = (State) obj;
		if (code != other.code)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [name=" + name + "]";
	}

}
