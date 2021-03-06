package fr.iutvalence.java.tp.rushhour;

public class Voiture {

	/**
	 * La position de l'avant de la voiture
	 */
	private Position positionDeLAvant;

	/**
	 * booléen indiquant si la voiture est disposée horizontalement (ou
	 * verticalement)
	 */
	private final boolean estHorizontale;
	

	/**
	 * Le nombre de case qu'occupe la voiture
	 */
	private final int taille;
	
	
	public Voiture(Position positionDeLAvant, boolean estHorizontal, int taille, boolean estHorizontale) {
	
		this.positionDeLAvant = positionDeLAvant;
		this.estHorizontale = estHorizontale;
		this.taille = taille;
		
	}
	

	public Position obtenirPositionDeLAvant()
	{
		return this.positionDeLAvant;
	}

	public void deplacer(Position nouvellePositionDeLAvant)
	{
		this.positionDeLAvant = nouvellePositionDeLAvant;
	}
	
	public boolean estHorizontale()
	{
		return this.estHorizontale;
	}
	
	public boolean estVerticale()
	{
		return this.estVerticale();
	}
	
	public int obtenirTaille()
	{
		return this.taille;
	}
	
	public boolean occupePosition(Position position)
	{
		return false;
	}
}
