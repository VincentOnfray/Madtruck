package MadTruck;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MadTruckGame {


    public void build(String FILE, Map road, int LINES, int COLUMNS) throws IOException {
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


                road.setGrid(l, c, (char)asci);

                miseenforme.append((char) asci);


                c++;


            }
            l++;
        }
        //System.out.println(miseenforme.toString());

        //System.out.println(road.grid[1][3]);
    }

    public void play(Map road, int LINES, int COLUMNS, int X, int Y, char SPRITE, int FOREVIEW, int BACKVIEW, int DELAY) {
            //"Play" gère la mise à jour du tableau en fonction du temps (inputs non fonctionnels), le scrolling, ainsi que la réussite ou l'echec.

        Truck truck = new Truck(SPRITE, X, Y); //le vehicule
        int nolignemax;
        int L = 0;      //N° Ligne
        int C = 0;      //N° colonne
        short fail = 0; //Indicateur d'echec
        String print;


        while (truck.getY() > 0) {
            System.out.print("\n\n\n\n\n\n\n\n");
            print = "";
            L = plancher(0, truck.getY()-FOREVIEW);

            if ( fail != 1 ) {
                truck.setY(truck.getY()-1);

                //If déterminant la collision ou non
                if ( road.getGrid(truck.getY(),truck.getX()) == ' ' )
                    {
                    road.setGrid(truck.getY()+1, truck.getX(),' ');
                    road.setGrid(truck.getY(), truck.getX(),  truck.Sprite);

                    }

                else
                    {
                    fail = 1;
                    }


                //Charge des lignes que l'on veut afficher dans le stringbuilder "print",

                while (L < plafonnage(LINES, truck.getY()+BACKVIEW)) {

                    C = 0;
                    while (C < COLUMNS) {

                        print = print + road.getGrid(L,C);

                        C++;
                    }

                    L++;
                }
                System.out.println(print);

            } else if ( truck.getY() == 0 ) {
                System.out.println("You won the battle, but not the war");
            }
            else {
                System.out.println("You Filthy Casual");
                truck.setY(-1);



            }


            try {

                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();



            }
        }
        //System.out.println(truck.Y);

    }

    private int plafonnage(int MAX, int nb){
        if (nb > MAX){
            return MAX;
        }
        else{
            return nb;
        }
    } //permet de s'assurer que le no de ligne ne passe pas le MAX

    private int plancher(int MIN, int nb){
        if (nb < MIN){
            return MIN;
        }
        else{
            return nb;
        }
    }//permet de s'assurer que le no de ligne ne passe pas le MIN

}

