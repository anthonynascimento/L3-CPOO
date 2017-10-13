package main;

import model.comptedec.Compte;
import model.comptedec.CompteManip;
import model.comptefactory.CompteFactory;

public final class Main {

	public static void main(String[] args){

		CompteFactory cf = new CompteFactory();

		//Compte c1 = new CompteCourant("John Doe", 1500.0d);
		//CompteManip c1 = cf.creerCompteCourant("John Doe", 1500.0d);
		CompteManip c1 = cf.creerCompteCourant("John Doe");
		//Compte c2 = new CompteCourant("Jack Baueur");
		CompteManip c2 = cf.creerCompteCourant("Jack John");

		c1.deposit(1500.0d);
		double retrait = c1.withdraw(900.0d);
		double nouveauSolde = c2.deposit(100000.0d);
 
		System.out.println(c1);
		System.out.println(c2.toString());

	}
}