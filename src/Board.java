import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    private int i, j;
    private JPanel panel = new JPanel();
    private JPanel buttonPanel,pa[][];
    MyLabel label = new MyLabel();

    public Board(){
        super("Chess");
        panel.setLayout(new GridLayout(8,8));
        pa = new JPanel[8][8];
        for (i=0; i<8; i++){
            for (j=0; j<8 ; j++){
                buttonPanel = new JPanel(new BorderLayout());
                buttonPanel.setName("PANEL" + "_" + i + "." + j);
                pa[i][j] = buttonPanel;

                //chessboard colors setup
                if ((i+j) % 2 == 0){
                    buttonPanel.setBackground(Color.white);
                }else {
                    buttonPanel.setBackground(Color.LIGHT_GRAY);
                }

                if (i == 0){
                    switch (j){
                        case 0:
                        case 7:
                            label.setLabel(pa,buttonPanel, "BR");
                            break;

                        case 1:
                        case 6:
                            label.setLabel(pa,buttonPanel, "BKN");
                            break;

                        case 2:
                        case 5:
                            label.setLabel(pa,buttonPanel, "BB");
                            break;

                        case 3:
                            label.setLabel(pa,buttonPanel,"BQ");
                            break;

                        case 4:
                            label.setLabel(pa,buttonPanel,"BK");
                    }
                }else if (i == 7){
                    switch (j){
                        case 0:
                        case 7:
                            label.setLabel(pa,buttonPanel,"WR");
                            break;

                        case 1:
                        case 6:
                            label.setLabel(pa,buttonPanel,"WKN");
                            break;

                        case 2:
                        case 5:
                            label.setLabel(pa,buttonPanel,"WB");
                            break;

                        case 3:
                            label.setLabel(pa,buttonPanel,"WQ");
                            break;

                        case 4:
                            label.setLabel(pa,buttonPanel,"WK");
                            break;
                    }
                }else if (i == 1){
                    label.setLabel(pa,buttonPanel, "BP");
                }else if (i == 6){
                    label.setLabel(pa,buttonPanel,"WP");
                }else {
                    label.setLabel(pa,buttonPanel,"");
                }

                buttonPanel.setBorder(BorderFactory.createLineBorder(Color.gray));
                panel.add(buttonPanel);
            }
        }
        this.add(panel);
        this.setSize(700,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
}
 // locate resizeAble functionallty;
// black pawn Doesn't show up on my board ;
// Black king show as a pawn not king