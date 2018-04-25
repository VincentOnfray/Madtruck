package MadTruck.interact;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener {
    private JPanel control;
    private GamePanel game;


    public JPanel getControl() {
        return control;
    }

    public GamePanel getGame() {
        return game;
    }

    public Fenetre(GamePanel game){
        this.setTitle("MadTruck");
        this.game = game;
        this.setSize(1000,1000);
        this.setVisible(true);
        this.game.setVisible(true);
        //this.setLayout(new GridBagLayout());
        this.add(game);

        //this.add(game);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }







    @Override
    public void actionPerformed(ActionEvent actionEvent) {


    }
}
