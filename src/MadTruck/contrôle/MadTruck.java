package MadTruck.contrôle;

import MadTruck.Modele.Map;
import MadTruck.Modele.Truck;
import MadTruck.interact.Fenetre;
import MadTruck.interact.GamePanel;
import MadTruck.interact.Output;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MadTruck {
    private static String FILE = "C:\\Users\\blenn\\Desktop\\eXia\\UE5\\road.txt";
    //private static String FILE = "C:\\Users\\blenn\\Desktop\\eXia\\UE5\\roady.txt";
    private static int LINES = 31;
    private static int COLUMNS = 12;
    private static int XORIGIN = 3;
    private static int YORIGIN = 30;
    private static char SPRITE = '8';
    private static int FOREVIEW = 6;
    private static int BACKVIEW = 2;
    private static int DELAY = 500;



    public static void main(String args[]) throws IOException {
       // JPanel control = new JPanel(new GridBagLayout());


        Map road = new Map(LINES, COLUMNS);
        Truck truck = new Truck(SPRITE, XORIGIN, YORIGIN, road); //le vehicule
        Output output = new Output(); // le systeme d'output






        MadTruckGame Attempt = new MadTruckGame();


        try {

            road.build(FILE, LINES, COLUMNS);
        } catch (IOException e) {
            e.printStackTrace();
        }

        GamePanel game = new GamePanel(road,LINES,COLUMNS);

        game.mapping(road, LINES, COLUMNS);
        Fenetre fenetre = new Fenetre(game);
        Attempt.play(road, truck, output, LINES, COLUMNS, SPRITE, FOREVIEW, BACKVIEW, DELAY, fenetre);



    }
}

