import javax.swing.*;
import java.awt.*;

public class Queen {
    private JPanel pos ;
    private int i , k=0;
//    My Constructor

    public Queen() {
        pos = new JPanel();
    }

//    Mixed Function
    public void moveQueen(String name, int x, int y, JPanel pa[][]){
        for (i=0; x+i < 8; i ++){
            pos = pa [y][i+1];
            if (name.equals("WQ")){
                if (((Label)pos.getComponent(0)).getBackground().equals(Color.YELLOW)){
                    pos.setBackground(Color.green);
                }else if (((Label)pos.getComponent(0)).getBackground().equals(Color.BLACK)){
                    pos.setBackground(Color.green);
                    k=1;
                }else
                    k=1;
            }else if (name.equals("BQ")){
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                }
                else if(((JLabel) pos.getComponent(0)).getBackground().equals(Color.white)){
                    pos.setBackground(Color.green);
                    k=1;
                }
                else
                    k=1;
            }
            if(k==1){
                k=0;
                break;
            }
        }

        for (i=1; x-i>=0; i++){
            pos = pa[y][x-i];
            if (name.equals("WQ")){
                if (((JLabel)pos.getComponent(0)).getBackground().equals(Color.YELLOW)){
                    pos.setBackground(Color.green);
                }else if (((JLabel)pos.getComponent(0)).getBackground().equals(Color.black)){
                    pos.setBackground(Color.green);
                    k=1;
                }else
                    k=1;
            }else if (name.equals("BQ")){
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                }
                else if(((JLabel) pos.getComponent(0)).getBackground().equals(Color.white)){
                    pos.setBackground(Color.green);
                    k=1;
                }
                else
                    k=1;
            }
            if (k==1) {
                k = 0;
                break;
            }
        }

        for (i = 1; y+i < 8; i++) {
            pos = pa[y + i][x];
            if (name.equals("WQ")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                }
                else if(((JLabel) pos.getComponent(0)).getBackground().equals(Color.black)){
                    pos.setBackground(Color.green);
                    k=1;
                }
                else
                    k=1;

            } else if (name.equals("BQ")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                }
                else if(((JLabel) pos.getComponent(0)).getBackground().equals(Color.white)){
                    pos.setBackground(Color.green);
                    k=1;
                }
                else k=1;
            }
            if(k==1){
                k=0;
                break;
            }
        }

        for (i = 1; y-i >= 0; i++) {
            pos = pa[y - i][x];
            if (name.equals("WQ")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                }
                else if(((JLabel) pos.getComponent(0)).getBackground().equals(Color.black)){
                    pos.setBackground(Color.green);
                    k=1;
                }
                else
                    k=1;
            }
            else if (name.equals("BQ")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                }
                else if(((JLabel) pos.getComponent(0)).getBackground().equals(Color.white)){
                    pos.setBackground(Color.green);
                    k=1;
                }
                else k=1;                }
            if(k==1){
                k=0;
                break;
            }

        }



        for (i = 1; x+i < 8 && y+i < 8; i++) {
            pos = pa[y + i][x + i];
            if (name.equals("WQ")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                }
                else if(((JLabel) pos.getComponent(0)).getBackground().equals(Color.black)){
                    pos.setBackground(Color.green);
                    k=1;
                }
                else
                    k=1;
            }
            else if (name.equals("BQ")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                }
                else if(((JLabel) pos.getComponent(0)).getBackground().equals(Color.white)){
                    pos.setBackground(Color.green);
                    k=1;
                }
                else
                    k=1;
            }
            if(k==1){
                k=0;
                break;
            }

        }



        for (i = 1; x+i < 8 && y-i >=0; i++) {
            pos = pa[y - i][x + i];
            if (name.equals("WQ")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                }
                else if(((JLabel) pos.getComponent(0)).getBackground().equals(Color.black)){
                    pos.setBackground(Color.green);
                    k=1;
                }
                else
                    k=1;
            }
            else if (name.equals("BQ")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                }
                else if(((JLabel) pos.getComponent(0)).getBackground().equals(Color.white)){
                    pos.setBackground(Color.green);
                    k=1;
                }
                else
                    k=1;
            }
            if(k==1){
                k=0;
                break;
            }

        }


        for (i = 1; y+i < 8 && x-i>=0; i++) {
            pos = pa[y + i][x - i];
            if (name.equals("WQ")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                }
                else if(((JLabel) pos.getComponent(0)).getBackground().equals(Color.black)){
                    pos.setBackground(Color.green);
                    k=1;
                }
                else
                    k=1;
            }
            else if (name.equals("BQ")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                }
                else if(((JLabel) pos.getComponent(0)).getBackground().equals(Color.white)){
                    pos.setBackground(Color.green);
                    k=1;
                }
                else
                    k=1;
            }
            if(k==1){
                k=0;
                break;
            }

        }


        for (i = 1; y-i >= 0 && x-i >=0;  i++) {
            pos = pa[y - i][x - i];
            if (name.equals("WQ")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                }
                else if(((JLabel) pos.getComponent(0)).getBackground().equals(Color.black)){
                    pos.setBackground(Color.green);
                    k=1;
                }
                else
                    k=1;
            } else if (name.equals("BQ")) {
                if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
                    pos.setBackground(Color.green);
                }
                else if(((JLabel) pos.getComponent(0)).getBackground().equals(Color.white)){
                    pos.setBackground(Color.green);
                    k=1;
                }
                else
                    k=1;
            }
            if(k==1){
                k=0;
                break;
            }

        }
    }
}
