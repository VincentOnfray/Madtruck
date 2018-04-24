package MadTruck.Modele;

import MadTruck.Modele.Motionless.Macadam;

public class Mobile extends Element {
private int X;
private int Y;
private boolean alive;
private Map road;


    public Mobile() {

    }

    public Mobile(char sprite, boolean permeability, boolean alive, int Y, int X, Map road) {

        super(sprite, permeability);
        this.alive = alive;
        this.Y = Y;
        this.X = X;
        this.road = road;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setY(int y) {

        Y = y;
    }

    public void setX(int x) {

        X = x;
    }

    public boolean isAlive() {

        return alive;
    }

    public int getX() {

        return X;
    }

    public int getY() {

        return Y;
    }
    //Fin des getter/setters




    public void moveRight(){
        road.setGrid(this.Y, this.X, new Macadam());
        this.X = this.X+1;
        road.setGrid(this.Y, this.X, this);

    }
    public void moveForth(){
        road.setGrid(this.Y, this.X, new Macadam());
        this.Y = this.Y-1;
        road.setGrid(this.Y, this.X, this);
    }
    public void moveLeft(){
        road.setGrid(this.Y, this.X, new Macadam());
        this.X = this.X-1;
        road.setGrid(this.Y, this.X, this);
    }
    public void moveBack(){
        road.setGrid(this.Y, this.X, new Macadam());
        this.Y = this.Y+1;
        road.setGrid(this.Y, this.X, this);
    }
    //fin des move

public void die(){
        this.alive = false;
}

}
