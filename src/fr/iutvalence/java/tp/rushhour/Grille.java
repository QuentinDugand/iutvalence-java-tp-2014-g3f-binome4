// TODO déplacer la classe dans un paquetage(fait)
package fr.iutvalence.java.tp.rushhour;
// TODO écrire un commentaire(fait)
/**
 * creation de la grille
 * Grille de 6x6 cases
 * 6 colones numérotées de 1 à 6
 * 6lignes numérotées de 1 à 6
 * Une sortie se trouve à gauche de la case de coordonnée 
 * Voitures de 2x1 cases pré-disposées sur la grille
 * Chaque voiture est caractérisée par sa couleur et sa position de départ (coordonnées des cases) et sa direction (veticale ou horizontale)
 * La voiture de couleur rouge doit être alignée avec la sortie (direction horizontale)
 * Bus de 3x1 cases pré-disposées sur la grille
 * Chaque bus est caractérisée par sa couleur et sa position de départ (coordonnées des cases) et sa direction (veticale ou horizontale)
 * @author dugandq
 *
 */
public class Grille 
{
	static int nbcars;  
    static String[] color;
    static boolean[] horiz; 
    static int[] len;       
    static int[] moveon;    
    
    /**
     * le tableau free est utilisÃ© dans moves pour dÃ©terminer rapidement si la case (i,j) est libre

     */
    static boolean[][] free = new boolean[6][6];

    static void init_free(Etat s) {
}
