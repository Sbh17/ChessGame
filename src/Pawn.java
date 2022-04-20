import javax.swing.*;
import java.awt.*;

public class Pawn {

    private JPanel pos;
    private int k = 0;

    public Pawn() {
        pos = new JPanel();
    }

    public void movePawn(String name, int x, int y, JPanel pa[][]) {
            if (name.equals("BP")) {
                if (y + 1 < 8 && x + 1 < 8) {
                    pos = pa[y + 1][x + 1];
                    if (pos.getComponent(0).getBackground().equals(Color.white)) {
                        pos.setBackground(Color.green);
                    }
                }

                if (y + 1 < 8 && x - 1 >= 0) {
                    pos = pa[y + 1][x - 1];
                    if (pos.getComponent(0).getBackground().equals(Color.white)) {
                        pos.setBackground(Color.green);
                    }
                }

                if (pa[y][x] == pa[1][x]) {

                    pos = pa[y + 1][x];
                    if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                        pos.setBackground(Color.green);
                    } else {
                        k = 1;
                    }

                    if (k == 0) {
                        pos = pa[y + 2][x];
                        if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                            pos.setBackground(Color.green);
                        }
                    }

                } else {

                    if (y + 1 < 8) {
                        pos = pa[y + 1][x];
                        if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                            pos.setBackground(Color.green);
                        }
                    }

                }

            } else if (name.equals("WP")) {

                if (y - 1 >= 0 && x + 1 < 8) {
                    pos = pa[y - 1][x + 1];
                    if (pos.getComponent(0).getBackground().equals(Color.black)) {
                        pos.setBackground(Color.green);
                    }
                }

                if (y - 1 >= 0 && x - 1 >= 0) {
                    pos = pa[y - 1][x - 1];
                    if (pos.getComponent(0).getBackground().equals(Color.black)) {
                        pos.setBackground(Color.green);
                    }
                }
                if (pa[y][x] == pa[6][x]) {
                    pos = pa[y - 1][x];

                    if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                        pos.setBackground(Color.green);
                    } else {
                        k = 1;
                    }

                    if (k == 0) {
                        pos = pa[y - 2][x];
                        if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                            pos.setBackground(Color.green);
                        }
                    }

                } else {

                    if (k == 0) {
                        if (y - 1 >= 0) {
                            pos = pa[y - 1][x];

                            if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                                pos.setBackground(Color.green);
                            }
                        }
                    }
                }
            }
        }
    }