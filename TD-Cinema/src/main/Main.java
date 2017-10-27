package main;

import java.util.logging.Logger;

import model.impl.SalleCinema;

public final class Main {
	private static final Logger LOG = Logger.getLogger(Main.class.getCanonicalName());

	public static void main (String[] args) {
		SalleCinema uneSalle = new SalleCinema("VIJAY", 2000, 15.0d);
		System.out.println(uneSalle);
		uneSalle.vendrePlace();
		System.out.println(uneSalle);
	}

}