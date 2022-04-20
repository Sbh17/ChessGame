import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.constant.ConstantDescs;

public class MyLabel {
    private JLabel pawns;
    private JLabel firstLabel;
    private JLabel secondLabel;
    private int k=0, i, j, state =0;
    private String firstLabelText;
    private Rook Rook = new Rook();
    private Bishop Bishop = new Bishop();
    private Queen Queen = new Queen();
    private Knight Knight = new Knight();
    private Pawn Pawn = new Pawn();
    private King King = new King();

//    Black Team
    // black team sutex
    private static final char BLACK_PAWN = '\u265F';
    private static final char BLACK_ROOK = '\u265C';
    private static final char BLACK_KNIGHT = '\u265E';
    private static final char BLACK_BISHOP = '\u265D';
    private static final char BLACK_QUEEN = '\u265B';
    private static final char BLACK_KING = '\u265A';

//    White Team
    private static final char WHITE_PAWN = '\u2659';
    private static final char WHITE_ROOK = '\u2656';
    private static final char WHITE_KNIGHT = '\u2658';
    private static final char WHITE_BISHOP = '\u2657';
    private static final char WHITE_QUEEN = '\u2655';
    private static final char WHITE_KING = '\u2654';

    public void setLabel(final JPanel pa[][], final JPanel button, String name){
        pawns = new JLabel();
        if (name.equals("BR") || name.equals("BKN") || name.equals("BB") || name.equals("BQ") || name.equals("BK") || name.equals("BP")){
            if (name.equals("BR"))
                pawns.setText(""+BLACK_ROOK);
            else if (name.equals("BKN"))
                pawns.setText(""+BLACK_KNIGHT);
            else if (name.equals("BB"))
                pawns.setText(""+BLACK_BISHOP);
            else if (name.equals("BQ"))
                pawns.setText(""+BLACK_QUEEN);
            else if (name.equals("BK")) {
                pawns.setText("" + BLACK_KING);
            }else if (name.equals("BP")){
                pawns.setText(""+BLACK_PAWN);
            }

            pawns.setBackground(Color.BLACK);
        } else if (name.equals("WR") || name.equals("WKN") || name.equals("WB") || name.equals("WQ") || name.equals("WK") || name.equals("WP")) {
            if (name.equals("WR")) {
                pawns.setText("" + WHITE_ROOK);
            } else if (name.equals("WKN")) {
                pawns.setText("" + WHITE_KNIGHT);
            } else if (name.equals("WB")) {
                pawns.setText("" + WHITE_BISHOP);
            } else if (name.equals("WQ")) {
                pawns.setText("" + WHITE_QUEEN);
            } else if (name.equals("WK")) {
                pawns.setText("" + WHITE_KING);
            } else if (name.equals("WP")) {
                pawns.setText("" + WHITE_PAWN);
            }
            pawns.setBackground(Color.WHITE);
        }else {
            pawns.setText("");
            pawns.setBackground(Color.yellow);
        }

        pawns.setFont(new Font("Serif", Font.PLAIN, 80));
        pawns.setName(name);
        button.add(pawns);

        pawns.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String s = button.getName();
                String[] numbers = s.replaceAll("^\\D+", "").split("\\D+");
                int y = Integer.valueOf(numbers[0]);
                int x = Integer.valueOf(numbers[1]);
                // first click
                if (k == 0) {
                    // chessboard colors reset
                    for (i = 0; i < 8; i++) {
                        for (j = 0; j < 8; j++) {
                            if (pa[i][j].getBackground() == Color.green) {
                                if ((i + j) % 2 == 0) {
                                    pa[i][j].setBackground(Color.white);
                                } else {
                                    pa[i][j].setBackground(Color.LIGHT_GRAY);
                                }
                            }
                        }
                    }

                    firstLabel = (JLabel) e.getSource();
                    firstLabelText = firstLabel.getText();

                    System.out.println("click " + 1 + "  pawn position " + x + "," + y + " " + firstLabelText + " color " + firstLabel.getBackground() + " state " + state);

                    if (state == 0) {
                        if (firstLabel.getName().equals("WR")) {
                            Rook.moveRook(firstLabel.getName(), x, y, pa);
                        } else if (firstLabel.getName().equals("WB")) {
                            Bishop.moveBishop(firstLabel.getName(), x, y, pa);
                        } else if (firstLabel.getName().equals("WQ")) {
                            Queen.moveQueen(firstLabel.getName(), x, y, pa);
                        } else if (firstLabel.getName().equals("WKN")) {
                            Knight.moveKnight(firstLabel.getName(), x, y, pa);
                        } else if (firstLabel.getName().equals("WP")) {
                            Pawn.movePawn(firstLabel.getName(), x, y, pa);
                        } else if (firstLabel.getName().equals("WK")) {
                            King.moveKing(firstLabel.getName(), x, y, pa);
                        }
                    }

                    if (state == 1) {
                        if (firstLabel.getName().equals("BR")) {
                            Rook.moveRook(firstLabel.getName(), x, y, pa);
                        } else if (firstLabel.getName().equals("BB")) {
                            Bishop.moveBishop(firstLabel.getName(), x, y, pa);
                        } else if (firstLabel.getName().equals("BQ")) {
                            Queen.moveQueen(firstLabel.getName(), x, y, pa);
                        } else if (firstLabel.getName().equals("BKN")) {
                            Knight.moveKnight(firstLabel.getName(), x, y, pa);
                        } else if (firstLabel.getName().equals("BP")) {
                            Pawn.movePawn(firstLabel.getName(), x, y, pa);
                        } else if (firstLabel.getName().equals("BK")) {
                            King.moveKing(firstLabel.getName(), x, y, pa);
                        }
                    }

                }

                // second click
                if (k == 1) {
                    secondLabel = (JLabel) e.getSource();
                    // check if the same pawn was clicked twice
                    if (secondLabel != firstLabel) {
                        if (pa[y][x].getBackground().equals(Color.green) ) {
                            CapturedPawns.setCapturedPawn(secondLabel);
                            // replacement of label + name + background
                            secondLabel.setText(firstLabelText);
                            secondLabel.setName(firstLabel.getName());
                            secondLabel.setBackground(firstLabel.getBackground());
                            firstLabel.setText("");
                            firstLabel.setBackground(Color.yellow);
                            firstLabel.setName("");
                            // player switch
                            if (state == 0)
                                state = 1;
                            else
                                state = 0;
                        }
                    }

                    System.out.println("click " + 2 + "  pawn position " + x + "," + y + " " + firstLabelText + " color " + secondLabel.getBackground() + " state " + state);

                    // chessboard colors reset
                    for (i = 0; i < 8; i++) {
                        for (j = 0; j < 8; j++) {
                            if (pa[i][j].getBackground() == Color.green) {
                                if ((i + j) % 2 == 0) {
                                    pa[i][j].setBackground(Color.white);
                                } else {
                                    pa[i][j].setBackground(Color.LIGHT_GRAY);
                                }
                            }

                        }
                    }
                    k = 0;
                    return;
                }

                // if first click != "" will go to second click
                if (firstLabelText != "") {
                    k = 1;
                }
            }
        });
    }
    void func(){
        System.out.printf("Objective Data base connection\n"+ ConstantDescs.DEFAULT_NAME);
    }
}

