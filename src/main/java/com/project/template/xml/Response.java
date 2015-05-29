package com.project.template.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {
	private String code;
	private String description;

	public String getCode() {
		return code;
	}

	@XmlElement
	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}
}
