package Modele;

public class Chambre {
    private int IDchambre;
    private Hotel monHotel;
    //private toutes les reservation;
    private int numero;
    private float prix;
    private int capacite;

    //constructeur par defaut
    public Chambre(){
        IDchambre=0;
        monHotel=null;
        numero=0;
        prix=0.0F;
        capacite=0;

    }

    //constructeur avec parametres
    public Chambre(int IDchambre, Hotel monHotel, int numero, float prix, int capacite){
        this.IDchambre=IDchambre;
        this.monHotel=monHotel;
        this.numero=numero;
        this.prix=prix;
        this.capacite=capacite;
    }
}
