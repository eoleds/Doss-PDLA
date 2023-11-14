import java.util.*;

import utilisateurs.Benevole;
import utilisateurs.Demandeur;
import utilisateurs.Valideur;
import utilisateurs.Utilisateur;
import Missions.Mission;

public class TableDemProp {
	private List<Utilisateur> utilisateurs;
	private List<Mission> missions;	
	//private List<Proposition> propositions; j'ai fait une seule table des missions et on spécifie si les missions sont des demandes ou prop


public TableDemProp() {
	utilisateurs = new ArrayList<>();
	missions = new ArrayList<>();
	//propositions = new ArrayList<>();
}


public void ajouterUtilisateur (Utilisateur utilisateur) {
utilisateurs.add(utilisateur);
}


public void soumettreMission (Mission mission){
	missions.add(mission);
}


//public void soumettreProposition (Proposition proposition){
//propositions.add(proposition);
//}


public List<Mission> getDemandes(){
	return missions;
}


//public List<Proposition> getPropositions(){
//return propositions;
//}
}
