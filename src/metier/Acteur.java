package metier;

/**
 * Created by alexandre on 20/01/2015.
 */
public class Acteur {
    private int codeActeur;
    private String prenomActeur;
    private String nomActeur;
    private int anneeNaissance;
    private int anneePremierFilm;

    public Acteur(int theCode, String thePrenom, String theNom, int theNaissance, int theFilm){
        codeActeur = theCode;
        prenomActeur = thePrenom;
        nomActeur = theNom;
        anneeNaissance = theNaissance;
        anneePremierFilm = theFilm;
    }

    public int getCodeActeur() {
        return codeActeur;
    }

    public void setCodeActeur(int codeActeur) {
        this.codeActeur = codeActeur;
    }

    public String getPrenomActeur() {
        return prenomActeur;
    }

    public void setPrenomActeur(String prenomActeur) {
        this.prenomActeur = prenomActeur;
    }

    public String getNomActeur() {
        return nomActeur;
    }

    public void setNomActeur(String nomActeur) {
        this.nomActeur = nomActeur;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public int getAnneePremierFilm() {
        return anneePremierFilm;
    }

    public void setAnneePremierFilm(int anneePremierFilm) {
        this.anneePremierFilm = anneePremierFilm;
    }

    @Override
    public String toString() {
        return "Acteur{" +
                "codeActeur=" + codeActeur +
                ", prenomActeur='" + prenomActeur + '\'' +
                ", nomActeur='" + nomActeur + '\'' +
                ", anneeNaissance=" + anneeNaissance +
                ", anneePremierFilm=" + anneePremierFilm +
                '}';
    }
}
