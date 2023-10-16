public class DatabaseConnection {
    // ...

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

    // Ajoutez des méthodes d'insertion pour les autres sous-classes de la même manière.
}
