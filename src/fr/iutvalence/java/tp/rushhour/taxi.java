package fr.iutvalence.java.tp.rushhour;

private final int taille;


public Taxi(Position positionDeLAvant, int taille) {

	this.positionDeLAvant = positionDeLAvant;
	this.estHorizontale = estHorizontal;
	this.taille = taille;
}


public void deplacer(Position nouvellePositionDeLAvant)
{
	this.positionDeLAvant = nouvellePositionDeLAvant;
}

public boolean estHorizontale()
{
	return this.estHorizontale;
}

public boolean occupePosition(Position position)
{
	return false;
}


