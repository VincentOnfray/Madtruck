package MadTruck;

public class Map {
    private Element [][] grid;


    public Map(){}

    public Map(int LINES, int COLUMNS){
        this.grid = new Element [LINES][COLUMNS];

    }

    public Element getGrid(int Y, int X) {
        return grid [Y][X];
    }

    public void setGrid(int Y, int X, Element element){
        grid[Y][X] = element;
    }
}
