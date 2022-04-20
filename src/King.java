import javax.swing.*;
import java.awt.*;

public class King {
    private JPanel pos;

    public King(){
        pos = new JPanel();
    }

    public void moveKing(String name, int x, int y, JPanel pa[][]) {

        if (x + 1 < 8 && y + 1 < 8) {
            pos = pa[y + 1][x + 1];

            if (name.equals("WK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
                    pos.setBackground(Color.green);
                } }
            else if (name.equals("BK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
                    pos.setBackground(Color.green);
                }
            }

        }
        if (y + 1 < 8) {
            pos = pa[y + 1][x];
            if (name.equals("WK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
                    pos.setBackground(Color.green);
                } }
            else if (name.equals("BK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
                    pos.setBackground(Color.green);
                }
            }
        }
        if (y + 1 < 8 && x - 1 >= 0) {
            pos = pa[y + 1][x - 1];
            if (name.equals("WK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
                    pos.setBackground(Color.green);
                } }
            else if (name.equals("BK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
                    pos.setBackground(Color.green);
                }
            }
        }

        if (x + 1 < 8) {
            pos = pa[y][x + 1];
            if (name.equals("WK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
                    pos.setBackground(Color.green);
                } }
            else if (name.equals("BK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
                    pos.setBackground(Color.green);
                }
            }
        }

        if (x - 1 >= 0) {
            pos = pa[y][x - 1];
            if (name.equals("WK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
                    pos.setBackground(Color.green);
                } }
            else if (name.equals("BK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
                    pos.setBackground(Color.green);
                }
            }
        }

        if (x + 1 < 8 && y - 1 >= 0) {
            pos = pa[y - 1][x + 1];
            if (name.equals("WK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
                    pos.setBackground(Color.green);
                } }
            else if (name.equals("BK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
                    pos.setBackground(Color.green);
                }
            }
        }

        if (x - 1 >= 0 && y - 1 >= 0) {
            pos = pa[y - 1][x - 1];
            if (name.equals("WK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
                    pos.setBackground(Color.green);
                } }
            else if (name.equals("BK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
                    pos.setBackground(Color.green);
                }
            }

        }
        if (y - 1 >= 0) {
            pos = pa[y - 1][x];
            if (name.equals("WK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
                    pos.setBackground(Color.green);
                } }
            else if (name.equals("BK")) {
                if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
                    pos.setBackground(Color.green);
                }
            }
        }
    }
}
