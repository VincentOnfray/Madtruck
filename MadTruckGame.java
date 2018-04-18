package MadTruck;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MadTruckGame {


    public void build(String FILE, Map road, int LINES, int COLUMNS) throws IOException {
        //"build" permet de charger la carte dans un tableau à double entree

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


                road.grid[l][c] = (char) asci;

                miseenforme.append((char) asci);


                c++;


            }
            l++;
        }
        //System.out.println(miseenforme.toString());

        //System.out.println(road.grid[1][3]);
    }

    public void play(Map road, int LINES, int COLUMNS, int X, int Y, char SPRITE, int FOREVIEW, int BACKVIEW, int DELAY) {


        Truck truck = new Truck(SPRITE, X, Y); //le vehicule
        int nolignemax;
        int L = 0;      //N° Ligne
        int C = 0;      //N° colonne
        short fail = 0; //Indicateur d'echec
        String print;


        while (truck.Y > 0) {
            System.out.print("\n\n\n\n\n\n\n\n");
            print = "";
            L = truck.Y-FOREVIEW;
            if (L<0){L=0;}
            else{ }

            if ( fail != 1 ) {
                truck.Y--;

                //If déterminant la collision ou non
                if ( road.grid[truck.Y][truck.X] == ' ' )
                    {
                    road.grid[truck.Y+1][truck.X] = ' ';
                    road.grid[truck.Y][truck.X] = SPRITE;

                    }

                else
                    {
                    fail = 1;
                    }

                //Charge du tableau dans le stringbuilder "print"
                nolignemax = truck.Y+BACKVIEW; //nolignemax designe le numero de la ligne la plus basse sur l'ecran affichée, le
                if(nolignemax > LINES){nolignemax = LINES;}

                    else{}
                while (L < nolignemax) {

                    C = 0;
                    while (C < COLUMNS) {

                        print = print + road.grid[L][C];

                        C++;
                    }

                    L++;
                }
                System.out.println(print);

            } else if ( truck.Y == 0 ) {
                System.out.println("You won the battle, but not the war");
            } else {
                System.out.println("You Filthy Casual");
                truck.Y = -1;



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
    }

}

