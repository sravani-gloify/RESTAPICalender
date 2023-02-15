package com.gloify.RestApiCalendar.errors;

public class InvalidRequestException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidRequestException(String exception) {
	    super(exception);
	  }
}
