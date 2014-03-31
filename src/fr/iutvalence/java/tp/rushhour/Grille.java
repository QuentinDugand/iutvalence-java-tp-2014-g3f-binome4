// TODO deplacer la classe dans un paquetage(fait)
package fr.iutvalence.java.tp.rushhour;
// TODO ecrire un commentaire(fait)
/**
 * creation de la grille
 * Grille de 6x6 cases
 * 6 colones numerotees de 1 � 6
 * 6lignes numerotees de 1 � 6
 * Une sortie se trouve � gauche de la case de coordonnees 
 * Voitures de 2x1 cases pre-disposees sur la grille
 * Chaque voiture est caracterisees par sa couleur et sa position de d�part (coordonnees des cases) et sa direction (veticale ou horizontale)
 * La voiture de couleur rouge doit �tre alignee avec la sortie (direction horizontale)
 * Bus de 3x1 cases pre-disposees sur la grille
 * Chaque bus est caracterisee par sa couleur et sa position de d�part (coordonnees des cases) et sa direction (veticale ou horizontale)
 * @author dugandq
 *
 */


public class Grille 
{
	public final static int NOMBRE_DE_LIGNES = 6;
    public final static int NOMBRE_DE_COLONNES = 6;
    
    
	private int nombreDeVoitures; 
	
	private Voiture[] voitures;
	
	public Grille(Voiture[] voitures)
	{
		this.voitures = voitures;
		this.nombreDeVoitures = voitures.length;
	}
    
}

