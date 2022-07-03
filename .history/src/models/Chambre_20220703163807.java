package models;

public class Chambre {
     
    private int id;
    private int numeroChambre;
    public Chambre(int id, int numeroChambre, int numeroEtage, int typeChambre) {
        this.id = id;
        this.numeroChambre = numeroChambre;
        this.numeroEtage = numeroEtage;
        this.typeChambre = typeChambre;
    }

    private int numeroEtage;
    private int typeChambre;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(String numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public String getNumeroEtage() {
        return numeroEtage;
    }

    public void setNumeroEtage(String numeroEtage) {
        this.numeroEtage = numeroEtage;
    }

    public String getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(String typeChambre) {
        this.typeChambre = typeChambre;
    }
}
