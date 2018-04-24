package MadTruck.Modele;

public class Element {

    private char sprite;
    private boolean permeability;



    public Element(char sprite, boolean permeability) {
        this.sprite = sprite;
        this.permeability = permeability;
    }

    public Element() {
    }

    public void setSprite(char sprite) {
        this.sprite = sprite;
    }

    public char getSprite() {

        return sprite;
    }
    public boolean getPermeability() {
        return permeability;
    }

    public void setPermeability(boolean permeability) {
        this.permeability = permeability;
    }
}
