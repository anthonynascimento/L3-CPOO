package model.dec;

public enum Tarif {
	ILL("Tarif illimité"),
	ILL5("Tarif illimité 5"), 
	RED("Tarif réduit"),
	RED5("Tarif réduit 5");
      
	private String nom;	
      
	Tarif(String nom) {  
		 this.nom=nom;
    }  
	
	public String getNom() {
		return this.nom;
	}
}