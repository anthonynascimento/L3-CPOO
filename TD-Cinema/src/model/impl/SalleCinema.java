package model.impl;

import java.lang.String;
import java.util.logging.Logger;

/**
*	Salle de cinéma
*/

public class SalleCinema {

	private static final Logger LOG = Logger.getLogger(SalleCinema.class.getCanonicalName());

	private String film;
	public static final int nbPlaces;
	private double tarif;
	private int nbPlacesVendues;

	public SalleCinema(String film, int nbPlaces, double tarif) {
		this.film = film;
		this.nbPlaces = nbPlaces;
		this.tarif = tarif;
		this.nbPlacesVendues = 0;
	}

	public String getFilm() { return this.film; }
	public double getTarif() { return this.tarif; }
	public int getNbPlaces() { return this.nbPlacesVendues; }

	public void vendrePlace() {
		this.nbPlacesVendues++;
	}

	public double tauxRemplissage() {
		return ((double)this.nbPlacesVendues/(double)this.nbPlaces)*100;
	}

	public double chiffreAffaires() {
		return this.nbPlacesVendues*this.tarif;
	}

	public int nbPlacesDisponibles() { return this.nbPlaces-this.nbPlacesVendues; }

	public void estPleine() {
		if(nbPlacesDisponibles() == 0) LOG.severe("La salle est pleine");
		else LOG.severe("Il reste "+nbPlacesDisponibles()+" places");
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Film projeté : ").append(this.film).append("\n")
				.append("Tarif : ").append(this.tarif).append("€\n")
				.append("Nombre de places : ").append(this.nbPlaces).append("\n")
				.append("Nombre de places disponibles : ").append(nbPlacesDisponibles()).append("\n")
				.append("Taux de remplissage : ").append(tauxRemplissage()).append("\n")
				.append("Chiffre d'affaires : ").append(chiffreAffaires()).append("\n");
		return sb.toString();
	}

}