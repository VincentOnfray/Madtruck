package MadTruck.interact;

import MadTruck.Modele.Map;

import javax.swing.*;

import java.awt.*;

public class GamePanel extends JPanel {
    JButton button;
    JLabel label;

    public GamePanel(Map road, int LINES, int COLUMNS) {
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        int C;
        int L = 0;
        while (L < LINES) {

            C = 0;
            while (C < COLUMNS) {
                label = new JLabel("");
                //c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = C;
                c.gridy = L;
                this.add(label, c);





                C+= 1;
            }

            L++;
        }


        c.fill = GridBagConstraints.VERTICAL;






    }
    public void mapping(Map road, int LINES, int COLUMNS){
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        int C;
        int L = 0;
        while (L < LINES) {

            C = 0;
            while (C < COLUMNS) {
                label = new JLabel(road.getGrid(L,C).getSprite()+"");
                c.fill = GridBagConstraints.BOTH;
                c.gridx = C;
                c.gridy = L;
                this.add(label, c);
                




                C+= 1;
            }

            L++;
        }


        //c.fill = GridBagConstraints.HORIZONTAL;

    }
}
