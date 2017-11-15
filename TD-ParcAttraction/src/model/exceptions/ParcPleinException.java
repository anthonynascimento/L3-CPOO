package model.exceptions;

import java.lang.Exception;

public final class ParcPleinException extends Exception {
	public ParcPleinException(){
		super();
	}
	public ParcPleinException(String message) {
		super(message);
	}
}