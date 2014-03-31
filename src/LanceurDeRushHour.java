import fr.iutvalence.java.tp.rushhour.RushHour;

// TODO déplacer la classe dans un paquetage
// TODO écrire un commentaire
public class LanceurDeRushHour
{
	// TODO écrire un commentaire
	public static void main(String[] argo)
	{
		// TODO corriger les accents
		System.out.println("Creation d'une partie de RushHour");
		RushHour partiedeRushHour = new RushHour();
		System.out.println("Demarrage de la partie");
		partiedeRushHour.jouer();
		System.out.println("Fin de la partie");
	}
}
