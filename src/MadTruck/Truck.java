package MadTruck;

public class Truck {
    public final char Sprite;
    private int X;
    private int Y;

    public  Truck(char Sprite, int X, int Y){
        this.Sprite = Sprite;
        this.X = X;
        this.Y = Y;

    }

    public Truck(){
        Sprite = 'H';
        X = 0;
        Y = 0;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}
