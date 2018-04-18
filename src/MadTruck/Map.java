package MadTruck;

public class Map {
    private char [][] grid;

    public Map(){}

    public Map(int LINES, int COLUMNS){
        this.grid = new char [LINES][COLUMNS];

    }

    public char getGrid(int Y, int X) {
        return grid [Y][X];
    }

    public void setGrid(int Y, int X, char sprite){
        grid[Y][X] = sprite;
    }
}
