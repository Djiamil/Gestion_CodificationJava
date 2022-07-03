package models;

public class Responsable extends Personne{

    public Responsable(int id, int nom, int prenom, int email) {
        super(id, nom, prenom, email);
        //TODO Auto-generated constructor stub
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
