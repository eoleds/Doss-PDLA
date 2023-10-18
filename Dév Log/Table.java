import java.util.*;


public class Table {
private List<Utilisateur> utilisateurs;
private List<Demande> demandes;
private List<Proposition> propositions;


public Table() {
utilisateurs = new ArrayList<>();
demandes = new ArrayList<>();
propositions = new ArrayList<>();
}


public void ajouterUtilisateur (Utilisateur utilisateur) {
utilisateurs.add(utilisateur);
}


public void soumettreDemande (Demande demande){
demandes.add(demande);
}


public void soumettreProposition (Proposition proposition){
propositions.add(proposition);
}


public List<Demande> getDemandes(){
return demandes;
}


public List<Proposition> getPropositions(){
return propositions;
}
}
