package Modele;

import javax.swing.*;
import java.sql.*;


    public class Bdd {
        public Connection connexion;
        private Statement statement;
        private ResultSet rs;
        public int id=0;
        public String nom= null;
        public String motDePasse= null;
        public  void loadDatabase() {
            // Chargement du driver
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
            }

            try {
                connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_ece", "root", "");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        public void ajouterUtilisateur(int id, String nom, String motDePasse) {
            //loadDatabase();
        /*
        try {
            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO noms(nom, prenom) VALUES(?, ?);");
            preparedStatement.setString(1, utilisateur.getNom());
            preparedStatement.setString(2, utilisateur.getPrenom());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // récupérer les informations de connexion
        this.id= id;
     this.nom = Acces.getFieldUsername().getText();
    this.motDePasse = new String(Acces.getFieldPassword().getPassword());
    */


            // insérer les informations de connexion dans la table client
            String query = "INSERT INTO client (id, nom, mot_de_passe) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connexion.prepareStatement(query)) {
                statement.setInt(1, id);
                statement.setString(2, nom);
                statement.setString(3, motDePasse);
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Client ajouté avec succès !");
                } else {
                    JOptionPane.showMessageDialog(null, "Erreur lors de l'ajout du client");
                }
            } catch (SQLException e) {
                System.err.println("Erreur SQL: " + e.getMessage() );
            }

        } /* catch(SQLException | InterruptedException  e) { //InterruptedException
        System.err.println("Erreur lors de la connexion à la base de données: " + e.getMessage());
        }*/
    }


