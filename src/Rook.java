import javax.swing.*;
import java.awt.*;

public class Rook {

    private JPanel pos;
    private int i, k = 0;

    public Rook() {
        pos = new JPanel();
    }

    public void moveRook(String name, int x, int y, JPanel pa[][]) {

        for (i = 1; x + i < 8; i++) {
            pos = pa[y][x + i];
            if (name.equals("WR")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                } else if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.black)) {
                    pos.setBackground(Color.green);
                    k = 1;
                } else
                    k = 1;
            } else if (name.equals("BR")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                } else if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.white)) {
                    pos.setBackground(Color.green);
                    k = 1;
                } else
                    k = 1;
            }
            if (k == 1) {
                k = 0;
                break;
            }
        }

        for (i = 1; x - i >= 0; i++) {
            pos = pa[y][x - i];
            if (name.equals("WR")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                } else if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.black)) {
                    pos.setBackground(Color.green);
                    k = 1;
                } else
                    k = 1;
            } else if (name.equals("BR")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                } else if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.white)) {
                    pos.setBackground(Color.green);
                    k = 1;
                } else
                    k = 1;
            }
            if (k == 1) {
                k = 0;
                break;
            }
        }


        for (i = 1; y + i < 8; i++) {
            pos = pa[y + i][x];
            if (name.equals("WR")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                } else if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.black)) {
                    pos.setBackground(Color.green);
                    k = 1;
                } else
                    k = 1;
            } else if (name.equals("BR")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                } else if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.white)) {
                    pos.setBackground(Color.green);
                    k = 1;
                } else
                    k = 1;
            }
            if (k == 1) {
                k = 0;
                break;
            }

        }


        for (i = 1; y - i >= 0; i++) {
            pos = pa[y - i][x];
            if (name.equals("WR")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                } else if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.black)) {
                    pos.setBackground(Color.green);
                    k = 1;
                } else
                    k = 1;
            } else if (name.equals("BR")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                } else if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.white)) {
                    pos.setBackground(Color.green);
                    k = 1;
                } else
                    k = 1;
            }
            if (k == 1) {
                k = 0;
                break;
            }
        }
    }
}
