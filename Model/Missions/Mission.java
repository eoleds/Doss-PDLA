package Missions;

import Missions.TypeMission;

public class Mission {
    private String description;
    private TypeMission type;
    private 

    // Constructeur avec le type de mission en plus de la description
    public Mission(String description, TypeMission type) {
        this.description = description;
        this.type = type;
        
    }

    // Getter pour accéder à la description
    public String getDescription() {
        return description;
    }

    // Setter pour modifier la description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter pour accéder au type de mission
    public TypeMission getType() {
        return type;
    }

    // Setter pour modifier le type de mission
    public void setType(TypeMission type) {
        this.type = type;
    }
}
