package model.dec;
import model.exceptions.HeuresTravailDepasseException;

public interface EntrepriseItf {
	double salaireHebdo()  throws HeuresTravailDepasseException;
    String getNom();
    double getSalaireBase();
    int getHeuresTravailles();
}