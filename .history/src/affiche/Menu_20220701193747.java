package affiche;

import java.util.Scanner;

import models.Pavillon;
import services.IService;
import services.Service;

public class Menu {
    private int choice;
    Scanner clavier = new Scanner(System.in);
    public void menus(){
        System.out.println("Gestion des pavillons");
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
    
}
