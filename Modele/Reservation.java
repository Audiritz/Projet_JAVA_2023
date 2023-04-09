package Modele;

public class Reservation {
    private int IDreservation;
    private Chambre maChambre;
    private Client monClient;
    //private Date dateD; Creer une classe Date ?
    //private Date dateF;
    private float prixT;
    private int nbPersonne;

    //Constructeur par défaut

    public Reservation(){
        IDreservation=0;
        maChambre=null;
        monClient=null;
        prixT= 0.0F;
        nbPersonne=0;

    } 

    // Constructeur avec paramètres

    public Reservation(int IDreservation,Chambre maChambre,Client monClient,float prixT,int nbPersonne){
        this.IDreservation=IDreservation;
        this.maChambre=maChambre;
        this.monClient=monClient;
        this.prixT=prixT;
        this.nbPersonne=nbPersonne;
    }
}
