package fr.iutvalence.java.tp.rushhour;

public class Position 
{
	private final int numeroDeLigne;
	private final int numeroDecolonne;
	
	public Position(int numeroDeLigneX, int numeroDecolonneY) 
	{
		this.numeroDeLigne = numeroDeLigneX;
		this.numeroDecolonne = numeroDecolonneY;
	}

	public int getNumeroDeLigne() {
		return numeroDeLigne;
	}

	public int getNumeroDecolonne() {
		return numeroDecolonne;
	}
	
	
	
	

}
