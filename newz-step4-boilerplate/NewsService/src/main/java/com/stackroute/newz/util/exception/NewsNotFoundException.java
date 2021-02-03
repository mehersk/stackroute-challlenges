package com.stackroute.newz.util.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "News not found")
public class NewsNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public NewsNotFoundException(String message) {
		super(message);
	}
}
