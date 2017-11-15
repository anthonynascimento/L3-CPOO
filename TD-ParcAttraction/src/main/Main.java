package main;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.Handler;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.text.DecimalFormat;
import java.io.IOException;
import java.util.logging.SimpleFormatter;

import model.impl.ParcAttraction;
import model.dec.Tarif;
import model.exceptions.ParcPleinException;
import model.fact.ParcAttractionFactory;

public final class Main {
    private static final Logger LOG = Logger.getLogger(Main.class.getCanonicalName());

    public static void main (String[] args) {

        ParcAttractionFactory pf = new ParcAttractionFactory();
        ParcAttraction p1 = pf.createParcAttraction("MiageWonderland",180,38.5d,28.5d);
        DecimalFormat df = new java.text.DecimalFormat("0.##");
        
        try {
            p1.vendreBillets(24,Tarif.ILL);
            p1.vendreBillets(19,Tarif.ILL5);
            p1.vendreBillets(32,Tarif.RED);
            p1.vendreBillets(23,Tarif.RED5);
        } catch(ParcPleinException ex) {
            LOG.severe(ex.getMessage());
        } finally {
            System.out.println(p1.toString());    
            System.out.println("Le chiffre d'affaires : "+p1.chiffreAffaires()+" euros.");
            System.out.println("Le taux de remplissage : "+df.format(p1.tauxRemplissage())+"%");
        }
    }
}