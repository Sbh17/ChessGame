import javax.swing.*;
import java.awt.*;

public class CapturedPawns extends JFrame {

    private JPanel panel;
    private static JPanel panelWhite;
    private static JPanel panelBlack;
    private static JTextArea blackArea;
    private static JTextArea whiteArea;
    private static int blackCount = 0;
    private static int whiteCount = 0;
    private static String player1;
    private static String player2;

    public CapturedPawns(){
        super("Captured Pawns");

        player1 = JOptionPane.showInputDialog(null,"Player 1 enter your name :");
        player2 = JOptionPane.showInputDialog(null,"Player 2 enter your name :");

        JOptionPane.showMessageDialog(null,"Game begins! "+ player1 + "starts the game!");
        setComponents();

        this.setSize(650,450);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

//    My function

    private void setComponents(){
        panel = new JPanel(new BorderLayout());
        panelBlack = new JPanel();
        panelWhite = new JPanel();
        blackArea = new JTextArea();
        whiteArea = new JTextArea();

        blackArea.setBackground(Color.lightGray);
        blackArea.setEditable(false);
        whiteArea.setBackground(Color.lightGray);
        whiteArea.setEditable(false);

        panelBlack.add(blackArea);
        panelWhite.add(whiteArea);
//        work length from north to south ;
        panel.add(panelBlack, BorderLayout.NORTH);
        panel.add(panelWhite, BorderLayout.SOUTH);
        this.add(panel);
    }

    public static void setCapturedPawn(JLabel pawn){
        if (pawn.getBackground().equals(Color.black)) {
            blackCount++;
            System.out.println("count " + blackCount);
            if (blackCount == 9) {
                blackArea.setText(blackArea.getText() + "\n" + "" + pawn.getText());
            } else {
                blackArea.setText((blackArea.getText() + "" + pawn.getText()));
            }
            Font font = blackArea.getFont();
            float size = 80;
            blackArea.setFont(font.deriveFont(size));
            if (pawn.getText() == "\u265A")
                JOptionPane.showMessageDialog(null, "Roua mat!  " + player1 + " wins!");
        } else if (pawn.getBackground().equals(Color.white)) {
            whiteCount++;
            System.out.println("count " + whiteCount);
            if (whiteCount == 9) {
                whiteArea.setText(whiteArea.getText() + "\n" + "" + pawn.getText());
            } else {
                whiteArea.setText((whiteArea.getText() + "" + pawn.getText()));
            }
            Font font = whiteArea.getFont();
            float size = 80;
            whiteArea.setFont(font.deriveFont(size));

            if (pawn.getText() == "\u2654")
                JOptionPane.showMessageDialog(null, "Roua mat!  " + player2 + " wins!");
        }
        if (blackCount == 16) {
            JOptionPane.showMessageDialog(null, player1 + " wins!");
        }
        if (whiteCount == 16) {
            JOptionPane.showMessageDialog(null, player2 + " wins!");
        }
    }
}
