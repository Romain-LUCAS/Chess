import javax.swing.*;

public class Play {
    static Piece p = null;
    static int turn;
    static Board2 board;

    public static void confirm(){
        /*if (checkIllegal())
            MessageDisplay.illegalMove();
            return;
        turn++;
        return;*/
    }

    public static boolean    checkIllegal(Pawn p,int x ,int y ){
        System.out.println("I havent checked");
        return false; // temporary
    }
    public static void addAllPieces(Board2 b){
        p = new Rook(1,1,"White");
        addToGame(p,b);
        p = new Rook(8,1,"White");
        addToGame(p,b);

        p = new Rook(1,8,"Black");
        addToGame(p,b);
        p = new Rook(8,8,"Black");
        addToGame(p,b);

        p = new Knight(2,1,"White");
        addToGame(p,b);
        p = new Knight(7,1,"White");
        addToGame(p,b);

        p = new Knight(2,8,"Black");
        addToGame(p,b);
        p = new Knight(7,8,"Black");
        addToGame(p,b);

        p = new Bishop(3,1,"White");
        addToGame(p,b);
        p = new Bishop(6,1,"White");
        addToGame(p,b);

        p = new Bishop(3,8,"Black");
        addToGame(p,b);
        p = new Bishop(6,8,"Black");
        addToGame(p,b);

        p = new King(4,1,"White");
        addToGame(p,b);
        p = new King(4,8,"Black");
        addToGame(p,b);

        p = new Queen(5,1,"White");
        addToGame(p,b);
        p = new Queen(5,8,"Black");
        addToGame(p,b);

        for(int x = 1; x <= 8; x++ ) {
            p = new Pawn(x, 2,"White");
            addToGame(p,b);

            p = new Pawn(x,7,"Black");
            addToGame(p,b);
        }
    }
    public static void addToGame(Piece p,Board2 b){
        b.add(p,1);

    }

    public static void main(String[] args) {

        board = new Board2();
        addAllPieces(board);
        ActivePiecesList.printList();
        TheFrame myFrame = new TheFrame();
        myFrame.add(board);
        //PiecesIconPanel piecePanel = new PiecesIconPanel();

        myFrame.setVisible(true);









    }
}
