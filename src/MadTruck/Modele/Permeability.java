package MadTruck.Modele;

public enum Permeability {
    BLOCKING,
    PENETRABLE;

    private String nom;

void Permeability(String nom){
    this.nom = nom;
}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}


