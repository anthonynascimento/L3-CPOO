package model.dec;

import model.exceptions.ParcPleinException;
import model.dec.Tarif;

public interface ParcAttractionItf {

	int nbPlacesDispo();
	void vendreBillets(int nb, Tarif tarif) throws ParcPleinException;
	void reinitialiser();
	double chiffreAffaires();
	double tauxRemplissage();

}