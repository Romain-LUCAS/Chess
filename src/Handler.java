import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Handler extends ActivePiecesList implements ActionListener {
    private static boolean isSelected = false;
    private static Piece pieceSelected = null;
    private boolean clickedAPiece;
    private static Piece previousPiece = null;

    public void actionPerformed(ActionEvent e){
        if(e.getSource() instanceof TileButton ) {
            int x = ((TileButton) e.getSource()).x;
            int y = ((TileButton) e.getSource()).y;
            System.out.println(" Tile return value : x = " + x +","+"y = " + y);
            clickedAPiece = ActivePiecesList.checklistAndTilePos(x,y);

            if (clickedAPiece) {
                pieceSelected = returnPieceAt(x, y);
                if (isSelected && previousPiece != pieceSelected && !(previousPiece.color).equals(pieceSelected.color)) {
                    System.out.println("capture statements");
                    previousPiece.capturePiece(pieceSelected);
                    isSelected = false;
                    previousPiece = null;
                } else {
                    isSelected = true;
                    previousPiece = pieceSelected;
                    System.out.println(pieceSelected + "isSelected");

                }
            }else {
                if (isSelected){
                    ActivePiecesList.movePiece(previousPiece,x,y);
                    isSelected = false;
                    previousPiece = null;
                }
            }

        }

    }
}

