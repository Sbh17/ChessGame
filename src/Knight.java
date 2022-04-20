import javax.swing.*;
import java.awt.*;

public class Knight {

    private JPanel pos;

    public Knight(){
        pos = new JPanel();
    }

    public void moveKnight(String name , int x, int y, JPanel pa[][]){

        if (y-1 >=0 && x+2 <8){
            pos = pa[y-1][x+2];
            if (name.equals("WKN")){
                if (((JLabel)pos.getComponent(0)).getBackground() != Color.white){
                    pos.setBackground(Color.green);
                }
            }else if (name.equals("BKN")){
                if (((JLabel)pos.getComponent(0)).getBackground() != Color.BLACK){
                    pos.setBackground(Color.green);
                }
            }
        }

        if (y-2 >= 0 && x+1 < 8){
            pos = pa[y-2][x+1];
            if (name.equals("WKN")){
                if (((JLabel)pos.getComponent(0)).getBackground() != Color.white)
                    pos.setBackground(Color.green);
            }else if (name.equals("BKN")){
                if (((JLabel)pos.getComponent(0)).getBackground() != Color.BLACK)
                    pos.setBackground(Color.green);
            }
        }

        if (y - 2 >= 0 && x - 1 >= 0) {
            pos = pa[y - 2][x - 1];
            if (name.equals("WKN")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
                    pos.setBackground(Color.green);
                }
            } else if (name.equals("BKN")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
                    pos.setBackground(Color.green);
                }
            }
        }

        if (y - 1 >= 0 && x - 2 >= 0) {
            pos = pa[y - 1][x - 2];
            if (name.equals("WKN")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
                    pos.setBackground(Color.green);
                }
            } else if (name.equals("BKN")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
                    pos.setBackground(Color.green);
                }
            }

        }
    }
}
