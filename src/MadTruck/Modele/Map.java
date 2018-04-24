package MadTruck.Modele;

import MadTruck.Modele.Motionless.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

    public void build(String FILE, int LINES, int COLUMNS) throws IOException {
        //"build" permet de charger la carte dans un tableau à double entree dans un objet "Map"

        int asci = 0;
        FileReader fr = null;
        StringBuilder miseenforme = new StringBuilder();

        {
            try {
                fr = new FileReader(FILE);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        BufferedReader br = new BufferedReader(fr);
        int l = 0;
        while (l < LINES && asci != -1) {

            int c = 0;


            while (c < COLUMNS) {

                asci = br.read();
                switch ((char)asci) {
                    case '^':
                        this.setGrid(l, c, new HorsPiste());
                        miseenforme.append('^');

                        break;
                    case '|':
                        this.setGrid(l, c, new Ditch());
                        miseenforme.append('|');

                        break;
                    case ' ':
                        this.setGrid(l, c, new Macadam());
                        miseenforme.append(' ');

                        break;
                    case '\\':
                        this.setGrid(l, c, new LeftTurnDitch());
                        miseenforme.append('\\');

                        break;
                    case '/':
                        this.setGrid(l, c, new RightTurnDitch());
                        miseenforme.append('/');

                        break;
                    case 'X':
                        this.setGrid(l, c, new RoadBlock());
                        miseenforme.append('X');
                        break;
                    case '\n':
                        this.setGrid(l, c, new Macadam());
                        miseenforme.append('\n');
                        break;

                    default:
                        this.setGrid(l, c, new Macadam());
                        miseenforme.append('\n');
                }
                miseenforme.toString();











                c++;
            }






            l++;
        }

    }
}
