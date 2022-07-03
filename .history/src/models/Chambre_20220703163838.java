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

    public int getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public int getNumeroEtage() {
        return numeroEtage;
    }

    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }

    public int getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(int typeChambre) {
        this.typeChambre = typeChambre;
    }
}
