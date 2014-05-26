package com.google.code.stackexchange.client.exception;

import java.util.Date;

import com.google.code.stackexchange.client.constant.ErrorCodes;

/**
 * @author Sanjiv.Singh
 * 
 */
public class InvalidAccessTokenException extends StackExchangeApiException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6271751110746617988L;

	/**
	 * Instantiates a new invalid access token exception.
	 */
	public InvalidAccessTokenException() {
		super();
	}

	/**
	 * Instantiates a new invalid access token exception.
	 * 
	 * @param description
	 *            the description
	 */
	public InvalidAccessTokenException(String description) {
		super(description);
	}

	/**
	 * Instantiates a new invalid access token exception.
	 * 
	 * @param cause
	 *            the cause
	 */
	public InvalidAccessTokenException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new invalid access token exception.
	 * 
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public InvalidAccessTokenException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new invalid access token exception.
	 * 
	 * @param description
	 *            the description
	 * @param errorId
	 *            the error Id
	 * @param errorName
	 *            the error Name
	 * @param timestamp
	 *            the timestamp
	 */
	public InvalidAccessTokenException(String description, int errorId,
			String errorName, Date timestamp) {
		super(description, errorId, errorName, timestamp);
	}

	/**
	 * Instantiates a invalid access token exception.
	 * 
	 * @param message
	 *            the message
	 * @param timestamp
	 *            the timestamp
	 */
	public InvalidAccessTokenException(String message, Date timestamp) {
		super(message, ErrorCodes.INVALID_ACCESS_TOKEN, "invalid_access_token", timestamp);
	}

}
