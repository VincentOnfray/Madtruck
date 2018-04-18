package MadTruck;

import java.io.IOException;

public class MadTruck {
    private static String FILE = "C:\\Users\\blenn\\Desktop\\eXia\\UE5\\road.txt";
    //private static String FILE = "C:\\Users\\blenn\\Desktop\\eXia\\UE5\\roady.txt";
    private static int LINES = 31;
    private static int COLUMNS = 12;
    private static int XORIGIN = 4;
    private static int YORIGIN = 30;
    private static char SPRITE = '0';
    private static int FOREVIEW = 7;
    private static int BACKVIEW = 5;
    private static int DELAY = 500;


    public static void main(String args[]) throws IOException {
        Map road = new Map(LINES, COLUMNS);

        MadTruckGame Attempt = new MadTruckGame();

        try {
            Attempt.build(FILE, road, LINES, COLUMNS);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Attempt.play(road, LINES, COLUMNS, XORIGIN, YORIGIN, SPRITE, FOREVIEW, BACKVIEW, DELAY);


    }
}

