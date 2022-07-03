package affiche;

import java.util.Scanner;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;
import services.IService;
import services.Service;

public class Menu {
    private int choice;
    private int mesmenu;

    Scanner clavier = new Scanner(System.in);

    public void menus(){
        
        System.out.println("    Bienvenue dans notre Menu ");
        System.out.println("1-             Pavillon");
        System.out.println("2-             Chambre");
        System.out.println("3-             Etudiant");
        System.out.println("4-             Quiter");
        choix();
    }
    public void pavillon(){
        
        System.out.println("Gestion des pavillons");
        System.out.println("1-             Ajoutez");
        System.out.println("2-             Listez");
        System.out.println("3-             supprimer");
        System.out.println("4-             Quiter");
        
    }

    public void menusChambre(){
        System.out.println("Gestion des Chambre");
        System.out.println("1-             Ajoutez");
        System.out.println("2-             Listez");
        System.out.println("3-             supprimer");
        System.out.println("4-             Quiter");
    }
    public void menusEtudiant(){
        System.out.println("Gestion des Etudiant");
        System.out.println("1-             Ajoutez");
        System.out.println("2-             Listez");
        System.out.println("3-             supprimer");
        System.out.println("4-             Quiter");
    }
    
    public void choix(){
        IService services = new Service();
        choice = clavier.nextInt();
        switch (choice) {
            case 1:
                pavillon();
                pavillons();
                break;
            case 2:
             menusChambre();
             chambre();
            break;
            case 3:
            menusEtudiant();
            
           break;
            default: menus();
                break;
        }
    }

    public void pavillons(){
        IService services = new Service();
        choice = clavier.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Veillez saisir l'id");
                int id = clavier.nextInt();
                System.out.println("veillez saisir le nombre d'etage");
                int numero = clavier.nextInt();
                System.out.println("veillez saisir le nombre d'etage");
                int nombreEtage = clavier.nextInt();
                Pavillon p = new Pavillon(id,numero,nombreEtage);
                services.addPavillon(p);
                services.listePavillon();
                
                break;
        
            default:
                break;
        }
    }

public void chambre()
{
    IService services = new Service();
    choice = clavier.nextInt();
    switch (choice) {
        case 1:
        System.out.println("Veillez saisir l'id");
        int id = clavier.nextInt();
        System.out.println("veillez saisir le nomero de chambre");
           int numeroChambre = clavier.nextInt();
           System.out.println("veillez saisir le nomero d'etage");
           int numeroEtage = clavier.nextInt();
           System.out.println("veillez saisir le type de chambre");
           int typeChambre = clavier.nextInt();
           Chambre c = new Chambre(id,numeroChambre,numeroEtage,typeChambre);
           services.addChambre(c);
           services.listeChambre();
        break;
        
        default:
            break;
}
}
public void etudiant(){
    IService services= new Service();
    choice = clavier.nextInt();
    switch(choice)
    {
        case 1:
            System.out.println("Veillez saisir l'id de l'etudiant");
            int id= clavier.nextInt();
            System.out.println("veillez saisir le matricule de l'etudiant");
            int matricule = clavier.nextInt();
            System.out.println("Veillez saisir la date de naissance");
            int     dateDeNaissances  = clavier.nextInt();
            System.out.println("Veillez siasir le numero de telephone");
            int telephone = clavier.nextInt();
            System.out.println("Veillez saisir l'adresse");
            int adresse = clavier.nextInt();
            Etudiant e = new Etudiant(id,matricule,dateDeNaissances,telephone,adresse);
            services.addEtudiant(e);
            services.listeEtudiant();
    }
}
}
    

