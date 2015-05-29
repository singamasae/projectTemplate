package com.project.template.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Result {
	private Response response;

	public Response getResponse() {
		return response;
	}

	@XmlElement
	public void setResponse(Response response) {
		this.response = response;
	}

}
