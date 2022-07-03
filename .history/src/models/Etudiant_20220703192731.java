package models;



public class Etudiant extends Personne{
    private int matricule;
    public Etudiant(int id,int matricule, int dateDeNaissances, int telephone, int adresse) {
            super(id);
        this.matricule = matricule;
        this.dateDeNaissances = dateDeNaissances;
        this.telephone = telephone;
        this.adresse = adresse;
    }

    private int dateDeNaissances;
    private int telephone;
    private int adresse;

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public int getDateDeNaissances() {
        return dateDeNaissances;
    }

    public void setDateDeNaissances(int dateDeNaissances) {
        this.dateDeNaissances = dateDeNaissances;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getAdresse() {
        return adresse;
    }

    public void setAdresse(int adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Etudiant [adresse=" + adresse + ", dateDeNaissances=" + dateDeNaissances + ", matricule=" + matricule
                + ", telephone=" + telephone + "]";
    }

}
