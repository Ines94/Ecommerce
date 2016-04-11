package fr.demos;

public class Livre extends Article{
	private String titre;
	private String auteur;
	private String editeur;
	private String genre;

/////////Part initialization	
	public Livre(double prixHT, int stock, String description, String reference, String titre, String auteur, String editeur, String genre) {
		super(prixHT, stock, description, reference);
		this.titre=titre;
		this.auteur=auteur;
		this.editeur=editeur;
		this.genre=genre;
	}

/////////Part treatment
	
	
/////////Part utility
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", editeur=" + editeur + ", genre=" + genre
				+ ", toString()=" + super.toString() + "]";
	}
	
	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public String getGenre() {
		return genre;
	}
}
