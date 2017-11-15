package model.impl;

import model.dec.EntrepriseItf;
import model.exceptions.SalaireHoraireInsuffisantException;
import model.exceptions.HeuresTravailDepasseException;
import java.lang.StringBuilder;
import java.util.logging.Logger;

public class Employe implements EntrepriseItf {
	
	private static final Logger LOG = Logger.getLogger(Employe.class.getCanonicalName());

	private String nom;
	private double salaireHoraire;
	private int heuresTravailles;

	public Employe(String nom, double salaireHoraire, int heuresTravailles) {
		this.nom=nom;
		try {
			if (salaireHoraire<13.0d) {
				throw new SalaireHoraireInsuffisantException("Salaire Horaire de base insuffisant, il est actuellement de "+salaireHoraire+" euros");
			}
			else {
				this.salaireHoraire=salaireHoraire;
			}
		} catch(SalaireHoraireInsuffisantException ex) {
			LOG.severe("L'heure de base ne doit pas etre en dessous de 13 euros.");
		}

		try {
			if (heuresTravailles>60) {
				throw new HeuresTravailDepasseException("Heures de travailles dépasses de "+(60-heuresTravailles)+" heures");
			}
			else {
				this.heuresTravailles=heuresTravailles;
			}
		} catch(HeuresTravailDepasseException ex) {
			LOG.severe("On peut pas travailler plus de 60 heures.");
		}
	}

	@Override
	public double salaireHebdo() throws HeuresTravailDepasseException {
		try {
			if (heuresTravailles>60) {
				throw new HeuresTravailDepasseException("Heures de travailles dépasses de "+(60-heuresTravailles)+" heures");
			}
			else if(heuresTravailles>40) {
				return ((1.5*salaireHoraire)*(double)heuresTravailles);
			}
			else {
				return ((double)heuresTravailles*salaireHoraire);
			}
		} catch(HeuresTravailDepasseException ex) {
			LOG.severe("On ne peut pas travailler plus de 60 heures.");
		}
		return 0.0d;
	}

    public String getNom() { return this.nom; }
    public double getSalaireBase() { return this.salaireHoraire; }
    public int getHeuresTravailles() { return this.heuresTravailles; }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(salaireHoraire>13 && heuresTravailles<60) {
			sb.append(this.nom).append(" possède un salaire horaire de ").
        	append(this.salaireHoraire).append(" euros - Nombre d'heures travaillées : ").append(this.heuresTravailles);
        }
       
        return sb.toString();
    }
}