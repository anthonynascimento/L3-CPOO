package model.exceptions;

import java.lang.Exception;

public final class HeuresTravailDepasseException extends Exception {
	
	public HeuresTravailDepasseException(){
		super();
	}
	public HeuresTravailDepasseException(String message) {
		super(message);
	}
}