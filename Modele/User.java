package Modele;

public abstract class User {
    protected int IDuser;
    protected String mail;
    protected String mdp;
    protected String prenom;
    protected String nom;
    protected int tel;

    // Constructeur par défaut

    public User(){
        IDuser=0;
        mail="";
        mdp="";
        prenom="";
        nom="";
        tel=0;
    }

    // Constructeur avec paramètres

    public User (int IDuser,String mail,String mdp, String prenom, String nom,int tel){
        this.IDuser=IDuser;
        this.mail=mail;
        this.mdp=mdp;
        this.prenom=prenom;
        this.nom=nom;
        this.tel=tel;
    }


}
