package co.com.template.Repository.Domain;

import java.io.Serializable;

public class StatusDomain implements Serializable{
	
	private static final long serialVersionUID = 5022341805021141326L;

	
	private Object response;
	private String message;

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public StatusDomain() {
	}

	public StatusDomain(Object response, String message) {
		super();
		this.response = response;
		this.message = message;
	}
}
