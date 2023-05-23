package com.ibm.service;

public class StudentNotFoundException extends Exception {

	private static final long serialVersionUID = 5580294540252362771L;

	public StudentNotFoundException() {
		super();
	}

	public StudentNotFoundException(String message) {
		super(message);
	}

}
