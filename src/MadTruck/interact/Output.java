package MadTruck.interact;

import MadTruck.Modele.Map;
import MadTruck.Modele.Truck;

import javax.swing.*;

public class Output {


    public void majAffichage(int max, int min, int LINES, int COLUMNS, int BACKVIEW, Truck truck, Map road, Fenetre fenetre){
        int C;
        int L = min;
        String print = "";


    while (L < max) {

        C = 0;
        while (C < COLUMNS) {

            print = print + (road.getGrid(L,C)).getSprite();

            C++;
        }
        print = print + '\n';
        L++;
    }
                System.out.println(print);
        //fenetre.setScreen(print);

}

public void clear(){
        //System.out.println("\n\n\n\n\n\n\n\n");
}

    public void fail(Fenetre fenetre) {
        System.out.println("_____@¨\nYou Filthy Casual Crashed\n    ___     ___\n __/__O\\___ |||\n=|_________||||\n   O     O  |||\n---------------");
        //fenetre.setFeed("_____@¨\nYou Filthy Casual Crashed\n    ___     ___\n __/__O\\___ |||\n=|_________||||\n   O     O  |||\n---------------");
    }


public void victory(Fenetre fenetre){
        //fenetre.setFeed("Highwayyyyyy to the DANGERZOOOOONEEEEEEEEE\n      ___     \n   __/__O\\___ \n~~=|_________|\n     O     O\n----------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("Highwayyyyyy to the DANGERZOOOOONEEEEEEEEE\n      ___     \n   __/__O\\___ \n~~=|_________|\n     O     O\n----------------------------------------------------------------------------------------------------------------------------------");
}



        }
