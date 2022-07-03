package models;

public class Pavillon {
    private int id;
    private int numero;
    private int nombreEtage;

    public Pavillon(int id, int numero, int nombreEtage) {
        this.id = id;
        this.numero = numero;
        this.nombreEtage = nombreEtage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNombreEtage() {
        return nombreEtage;
    }

    public void setNombreEtage(int nombreEtage) {
        this.nombreEtage = nombreEtage;
    }
}
