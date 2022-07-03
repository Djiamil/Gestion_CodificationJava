package models;

import java.time.LocalDateTime;

public class Etudiant extends Personne{
    private String matricule;
    private LocalDateTime dateDeNaissances;
    private String telephone;
    private String adresse;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public LocalDateTime getDateDeNaissances() {
        return dateDeNaissances;
    }

    public void setDateDeNaissances(LocalDateTime dateDeNaissances) {
        this.dateDeNaissances = dateDeNaissances;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}
