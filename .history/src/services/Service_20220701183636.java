package services;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public class Service implements IService{
    
    private final int TAILLE = 10;
    private Pavillon[] tabPavillon = new Pavillon[TAILLE];
    private Chambre[] tabChambre = new Chambre[TAILLE];
    private Etudiant[] tabEtudiant = new Etudiant[TAILLE];
    private int indexPavillon;
    @Override
    public void addPavillon(models.Pavillon pavillon) {
        // TODO Auto-generated method stub
        if(indexPavillon < TAILLE)
        tabPavillon[indexPavillon] = pavillon;
        indexPavillon++;
        
    }
    @Override
    public void removePavillon(int id) {
        // TODO Auto-generated method stub
        
        
    }
    @Override
    public void listePavillon() {
        // TODO Auto-generated method stub
        for (Pavillon pavillon : tabPavillon) {
            System.out.println(pavillon);
        
        }
        
    }
    @Override
    public void addChambre(models.Chambre chambre) {
        // TODO Auto-generated method stub
        if(indexPavillon < TAILLE){
        tabChambre[indexPavillon] = chambre;
        indexPavillon++;
        
    }
        
    }
    @Override
    public void removeChambre(int id) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void listeChambre() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void addEtudiant(Etudiant Etudiant) {
        // TODO Auto-generated method stub
        if(indexPavillon < TAILLE){
            tabEtudiant[indexPavillon] = Etudiant;
            indexPavillon++;
            
        }
        
    }
    @Override
    public void removeEtudiant(int id) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void listeEtudiant() {
        // TODO Auto-generated method stub

        
        
    }
}
