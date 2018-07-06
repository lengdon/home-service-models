package com.moran.home.service.exceptions;

public class GatewayException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GatewayException() {
	}

	public GatewayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public GatewayException(String message, Throwable cause) {
		super(message, cause);
	}

	public GatewayException(String message) {
		super(message);
	}

	public GatewayException(Throwable cause) {
		super(cause);
	}
}
