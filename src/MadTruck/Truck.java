package MadTruck;

public class Truck extends Element{
    private int Y;
    private int X;

    public  Truck(char sprite, int Y, int X){
        super(sprite);
        this.Y = Y;
        this.X = X;


    }
    public void setX(int X) {
        this.X = X;
    }

    public void setY(int y) {

        this.Y = y;
    }

    public int getX() {

        return X;
    }

    public int getY() {

        return Y;
    }




}
