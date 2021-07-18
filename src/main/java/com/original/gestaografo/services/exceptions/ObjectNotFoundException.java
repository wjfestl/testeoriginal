package com.original.gestaografo.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	private ObjectNotFoundException(String msg, Throwable cause) {
		super (msg, cause);
	}

}
