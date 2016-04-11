package fr.demos;

public class TestCommerce {

	public static void main(String[] args) {
		Livre L1 = new Livre(25.56, 100, "Les aventures d'un poisson d'eau douce dans l'océan...", "REF45867", "Le silure gris", "Jean Piaget", "CEA", "Aventure");
		Livre L2 = new Livre(47.21, 50, "Un meurtre secoue Gotham...", "REF77668", "Grand effroi", "Paul Roux", "Gallimard", "Policier");
		Article A1 = new Article(150, 15, "Un aspirateur", "XP21548");
		
		System.out.println(L1);
		System.out.println(L2);
		
		Panier P1 = new Panier();
		Panier P2 = new Panier();
		
		P1.ajouter(L1);
		P1.ajouter(L2);
		
		System.out.println(P1);
		
		P1.retirer(L1);
		
		System.out.println(P1);
		
		P2.ajouter(L1);
		P2.ajouter(A1);
		
		System.out.println(P2);
	}

}
