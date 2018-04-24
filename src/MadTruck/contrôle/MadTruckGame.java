package MadTruck.contrôle;

import MadTruck.Modele.Map;
import MadTruck.Modele.Truck;
import MadTruck.interact.Fenetre;
import MadTruck.interact.Output;


public class MadTruckGame {

    public void play(Map road, Truck truck, Output output, int LINES, int COLUMNS, char SPRITE, int FOREVIEW, int BACKVIEW, int DELAY, Fenetre fenetre) {
            //"Play" gère la mise à jour du tableau en fonction du temps (inputs non fonctionnels), le scrolling, ainsi que la réussite ou l'echec.



        boolean fail = false; //Indicateur d'echec




        while (truck.getY() > 0) {




            if ( !fail ) {

                //If déterminant la collision ou non
                if ( (road.getGrid(truck.getY()-1,truck.getX())).getPermeability() == true)
                    {
                    truck.moveForth();

                    }

                else {
                    fail = true;
                }
                output.clear();
                output.majAffichage(plafonnage(LINES, truck.getY()+BACKVIEW),plancher(0, truck.getY()-FOREVIEW),LINES,COLUMNS, BACKVIEW, truck, road, fenetre);

                //Charge des lignes que l'on veut afficher dans le stringbuilder "print",
            }


            else {
                output.fail(fenetre);

                truck.setY(-1);



            }


            try {

                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();



            }
        }
        if ( truck.getY() == 0 ) {
            output.victory(fenetre);

        }
        else{

        }

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

