package services;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public interface IService {
    public void addPavillon(Pavillon pavillon);
    public void removePavillon(int id);
    public void listePavillon();

    public void addChambre(Chambre chambre);
    public void removeChambre(int id);
    public void listeChambre();

    public void addEtudiant(Etudiant Etudiant);
    public void removeEtudiant(int id);
    public void listeEtudiant();
}