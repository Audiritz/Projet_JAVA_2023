package Vue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Connexion extends JFrame {

    //Elements d'interface pour l'utilisateur
    private JLabel usernameLbl, passwordLbl;
    private JTextField usernameFld;
    private JPasswordField passwordFld;
    private JButton loginBtn;
    private JLabel msgBienvenue;

    //Constructeurs générés par IntelliJ
    /*
    public Connexion() throws HeadlessException {
    }
    public Connexion(GraphicsConfiguration gc) {
        super(gc);
    }
    public Connexion(String title) throws HeadlessException {
        super(title);
    }
    public Connexion(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }*/

    // Creer un evenement listener pour le bouton de connexion
    ActionListener loginBtnListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Il reste a ajouter la logique de validation si jamais le mdp est bon en fonction des BD
            String username = usernameFld.getText();
            char[] password = passwordFld.getPassword();
            // pour verifier si le nom d utilisateur et le mot de passe sont corrects
            if (connexAutorisee(username, password)) {
                // Ouvrir la fenêtre principale de recherche d hotels
                System.out.println("connexion reussie");
                openMainWindow();
                // pour fermer la fenetre de connexion
                dispose();
            } else {
                // affichage d un message d erreur si les info d identification sont fausses
                JOptionPane.showMessageDialog(Connexion.this, "Nom d'utilisateur ou mot de passe invalide.", "Erreur de connexion", JOptionPane.ERROR_MESSAGE);
            }
        }
    };
    //emmene a la page principale
    private void openMainWindow() {

    }
    //booleen pour la logique de validation
    private boolean connexAutorisee(String username, char[] password) {
        {
            /*// ATTENTION IL FAUDRA MODIFIER EN FONCTION DES BD
            if (usernameFld == usernameFld && passwordFld == passwordFld) {
                return true;
            }
            else return false;*/
            return true;
        }
    }

    //Construction de la page de connexion
    public Connexion(){

        //Creation des elements qui seront sur l'interface
        usernameLbl = new JLabel("Nom d'utilisateur :");
        passwordLbl = new JLabel("Mot de passe :");
        usernameFld = new JTextField(20);
        passwordFld = new JPasswordField(20);
        loginBtn = new JButton("Connexion");
        msgBienvenue = new JLabel("Booking vous souhaite la bienvenue sur la page de connexion :");


        //On affiche les elements sur l'interface
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        //Icone pour le champ du mdp
        passwordLbl.setIcon(new ImageIcon("co1.png"));

        msgBienvenue.setBackground(new Color(255, 136, 0, 187));
        msgBienvenue.setFont(new Font("Helvetica", Font.PLAIN, 18));

        //On change les couleurs de fond et la police pour le texte a inserer (username et pswd)
        usernameFld.setBackground(new Color(217, 156, 85));
        passwordFld.setBackground(new Color(217, 156, 85));

        Font font1 = new Font("Arial", Font.PLAIN, 16);

        usernameFld.setFont(font1);
        passwordFld.setFont(font1);

        //on modifie la couleur du bouton
        loginBtn.setBackground(new Color(4, 101, 12));
        loginBtn.setForeground(Color.WHITE);

        //on ajoute tous les elements d'interface utilisateur au panneau appelé panel1
        panel1.add(Box.createRigidArea(new Dimension(0,30)));
        panel1.add(msgBienvenue);
        panel1.add(Box.createRigidArea(new Dimension(0,20)));
        panel1.add(usernameLbl);
        panel1.add(usernameFld);
        panel1.add(Box.createRigidArea(new Dimension(0, 10)));
        panel1.add(passwordLbl);
        panel1.add(passwordFld);
        panel1.add(Box.createRigidArea(new Dimension(0, 20)));
        panel1.add(loginBtn);
        panel1.add(Box.createRigidArea(new Dimension(0, 20)));
        loginBtn.addActionListener(loginBtnListener);

        // ajouter le paneau a la fenetre puis definition de ses proprietes
        this.add(panel1);
        this.setTitle("Booking - Page de connexion");
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }

}
