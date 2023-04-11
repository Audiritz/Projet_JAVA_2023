package Modele;

public class Hotel {
    private int IDhotel;
    //private toutes les chambres;
    private String ville;
    private String adresse;
    private int tel;
    private int nbEtoile;

    //constructeur par defaut

    public Hotel(){
        IDhotel=0;
        ville="";
        adresse="";
        tel=0;
        nbEtoile=0;
    }

    public Hotel(int IDhotel, String ville, String adresse, int tel, int nbEtoile){
        this.IDhotel=IDhotel;
        this.ville=ville;
        this.adresse=adresse;
        this.tel=tel;
        this.nbEtoile=nbEtoile;
    }
}



