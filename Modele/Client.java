package Modele;

public class Client extends User {
    //private toutes les reservation;
    public Client(int IDuser,String mail,String mdp, String prenom, String nom,int tel){
        super(IDuser, mail, mdp, prenom, nom, tel);
    }
}
