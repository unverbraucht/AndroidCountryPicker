package com.countrypicker;

/**
 * POJO
 *
 */
public class Country {
	private String code;
	private String name;

	public Country(final String code, final String name) {
		this.code = code;
        this.name = name;
	}

    public Country() { }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}