package MadTruck.interact;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener {
    private JTextArea screen = new JTextArea();
    private JTextArea feed = new JTextArea();
    private JButton bouton = new JButton("test");


    public void setScreen(String string) {
        this.screen.setText(string);
    }
    public String getScreen(){
        return this.screen.getSelectedText();
    }
    public void setFeed(String string) {
        this.feed.setText(string);
    }
    public String getFeed(){
        return this.feed.getSelectedText();
    }


    public Fenetre(){
        this.setTitle("MadTruck");
        this.setSize(1000,1000);
        //this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.add(screen);
        this.add(feed);
        this.add(bouton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }







    @Override
    public void actionPerformed(ActionEvent actionEvent) {


    }
}
