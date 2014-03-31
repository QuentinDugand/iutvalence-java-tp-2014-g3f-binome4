package fr.iutvalence.java.tp.rushhour;

public class Voiture {

	/**
	 * La position de l'avant de la voiture
	 */
	private Position positionDeLAvant;

	/**
	 * booléen indi<uant si la voiture est disposée horizontalement (ou
	 * verticalement)
	 */
	private boolean estHorizontale;

	/**
	 * Le nombre de case qu'occupe la voiture
	 */
	private int taille;
	
	private boolean Orientation;
	{
		this.haut = haut();
		this.bas = bas();
		this.gauche = gauche();
		this.droit = droit();
	}

	public Voiture(Position positionDeLAvant, boolean estHorizontal, int taille) {
	
		this.positionDeLAvant = positionDeLAvant;
		this.estHorizontale = estHorizontal;
		this.taille = taille;
	}
	
	public Position obtenirPositionDeLAvant()
	{
		return this.positionDeLAvant;
	}
	
	public boolean estHorizontale()
	{
		return this.estHorizontale;
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
