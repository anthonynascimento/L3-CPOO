package model.exceptions;

import java.lang.Exception;

public final class SalaireHoraireInsuffisantException extends Exception {
	
	public SalaireHoraireInsuffisantException() {
		super();
	}
	public SalaireHoraireInsuffisantException(String message) {
		super(message);
	}
}