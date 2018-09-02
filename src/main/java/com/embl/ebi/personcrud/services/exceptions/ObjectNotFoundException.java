package com.embl.ebi.personcrud.services.exceptions;


/**
 * 
 * @author gabriel.machado
 * Retrieving a proper response if there is no person for that rest call
 *
 */
public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}

	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
