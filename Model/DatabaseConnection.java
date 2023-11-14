import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utilisateurs.Benevole;
import utilisateurs.Demandeur;
import utilisateurs.Valideur;
import utilisateurs.Utilisateur;

public class DatabaseConnection {
    public static Connection getConnection() {
        String url = "jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_020";
        String username = "projet_gei_020";
        String password = "Ahlah6ug";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }       
       

        public static void insertDemandeur(Demandeur demandeur) {
                Connection connection = getConnection();

                if (connection != null) {
                    String insertQuery = "INSERT INTO table_demandeurs (nom, prenom, telephone, mail) VALUES (?, ?, ?, ?)";

                    try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                        preparedStatement.setString(1, demandeur.getNom());
                        preparedStatement.setString(2, demandeur.getPrenom());
                        preparedStatement.setDouble(3, demandeur.getTelephone());
                        preparedStatement.setString(4, demandeur.getMail());

                        int rowsAffected = preparedStatement.executeUpdate();
                        if (rowsAffected > 0) {
                            System.out.println("Demandeur inséré avec succès dans la base de données.");
                        } else {
                            System.out.println("Échec de l'insertion du demandeur dans la base de données.");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                }
            

            public static void insertValideur(Valideur valideur) {
                Connection connection = getConnection();

                if (connection != null) {
                    String insertQuery = "INSERT INTO table_valideurs (nom, prenom, telephone, mail) VALUES (?, ?, ?, ?)";

                    try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                        preparedStatement.setString(1, valideur.getNom());
                        preparedStatement.setString(2, valideur.getPrenom());
                        preparedStatement.setDouble(3, valideur.getTelephone());
                        preparedStatement.setString(4, valideur.getMail());

                        int rowsAffected = preparedStatement.executeUpdate();
                        if (rowsAffected > 0) {
                            System.out.println("Valideur inséré avec succès dans la base de données.");
                        } else {
                            System.out.println("Échec de l'insertion du valideur dans la base de données.");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                }
            

            public static void insertBenevole(Benevole benevole) {
                Connection connection = getConnection();

                if (connection != null) {
                    String insertQuery = "INSERT INTO table_benevole (nom, prenom, telephone, mail) VALUES (?, ?, ?, ?)";

                    try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                        preparedStatement.setString(1, benevole.getNom());
                        preparedStatement.setString(2, benevole.getPrenom());
                        preparedStatement.setDouble(3, benevole.getTelephone());
                        preparedStatement.setString(4, benevole.getMail());

                        int rowsAffected = preparedStatement.executeUpdate();
                        if (rowsAffected > 0) {
                            System.out.println("Benevole inséré avec succès dans la base de données.");
                        } else {
                            System.out.println("Échec de l'insertion du Benevole dans la base de données.");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            

       

        
    }
}
