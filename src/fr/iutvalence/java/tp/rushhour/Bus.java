package fr.iutvalence.java.tp.rushhour;

public class Bus {
	/**
	 * La position de l'avant du bus
	 */
	private Position positionDeLAvant;

	/**
	 * booléen indi<uant si le bus est disposé horizontalement (ou
	 * verticalement)
	 */
	private final boolean estHorizontale;
	

	/**
	 * Le nombre de case qu'occupe le bus
	 */
	private final int taille;
	
	
	public Bus(Position positionDeLAvant, boolean estHorizontal, int taille) {
	
		this.positionDeLAvant = positionDeLAvant;
		this.estHorizontale = estHorizontal;
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
