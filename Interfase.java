package demoMavenProject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Interfase extends JFrame {
    private JTextField champUser;
    private JPasswordField champPassword;
    private JTextField champId;
    private JLabel messageErreur;

    public Interfase() {
        // Configuration de la fenêtre
        setTitle("Formulaire d'Utilisateur");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Étiquettes
        JLabel labelUser = new JLabel("Nom d'utilisateur :");
        JLabel labelPassword = new JLabel("Mot de passe :");
        JLabel labelId = new JLabel("Identifiant :");

        // Champs de texte
        champUser = new JTextField();
        champPassword = new JPasswordField();
        champId = new JTextField();

        // Bouton de soumission
        JButton boutonSoumettre = new JButton("Soumettre");

        // Message d'erreur
        messageErreur = new JLabel("");
        messageErreur.setForeground(Color.RED);

        // Écouteur d'événements pour le bouton Soumettre
        boutonSoumettre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = champUser.getText();
                char[] password = champPassword.getPassword();
                String id = champId.getText();

                if (validerUtilisateur(user, new String(password), id)) {
                    // Redirection vers une page (simulée ici avec une fenêtre d'information)
                    JOptionPane.showMessageDialog(null, "Authentification réussie. Redirection vers la page...");
                } else {
                    // Afficher un message d'erreur
                    messageErreur.setText("Authentification échouée. Vérifiez vos données.");
                }
            }
        });

        // Ajout des composants à la fenêtre
        add(labelUser);
        add(champUser);
        add(labelPassword);
        add(champPassword);
        add(labelId);
        add(champId);
        add(boutonSoumettre);
        add(new JLabel("")); // Espace vide
        add(messageErreur);

        // Affichage de la fenêtre
        setVisible(true);
    }

    private boolean validerUtilisateur(String user, String password, String id) {
        // Ici, vous devriez effectuer la validation dans votre base de données
        // Dans cet exemple, nous supposerons que les données sont correctes si user="user", password="password" et id="123"

        if (user.equals("user") && password.equals("password") && id.equals("123")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Interfase();
            }
        });
    }
}

//Dans cet exemple, nous avons simulé la validation des données en utilisant une méthode validerUtilisateur(). 
//Vous devez remplacer cette méthode par une connexion réelle à votre base de données et effectuer la vérification des données. 
//Si les données sont correctes, vous pouvez rediriger l'utilisateur vers la page souhaitée. Si les données sont incorrectes, un message d'erreur est affiché.
//N'oubliez pas de configurer correctement votre base de données dans votre application