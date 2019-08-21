import javax.swing.*;

public class Piece extends JLabel {

    public int x;
    public int y;
    public boolean isDead;
    String color;

    // constructors
    public Piece () {
        this.x = 0;
        this.y = 0;
        this.color = "White";
        this.isDead = false;
        assignBounds(0,0);
        ActivePiecesList.add(this);
    }
    public Piece (int x, int y){
        this.x = x;
        this.y = y;
        this.color = "White";
        this.isDead = false;
        assignBounds(x,y);
        ActivePiecesList.add(this);
    }
    //Methods
    public String toString(){
        return getClass().getName() + String.format(", Pos x = %s Pos y = %s Color = %s isDead = %b \n", this.x, this.y, this.color,this.isDead );
    }
    public void assignBounds(int x, int y){
        setBounds((x-1) *100,(y-1) *100, 100,100);
    }

    public void moveAnywhere(int x, int y){
        System.out.println("Move anywhere function --");
        this.x = x;
        this.y = y;
        setBounds((this.x-1) *100,(this.y-1) *100, 100,100);
        if (this.getClass().getName().equals("Pawn")){
            this.checkPromote();
        }
    }
    public void capturePiece(Piece pCaptured){
        moveAnywhere(pCaptured.x,pCaptured.y);
        pCaptured.die();

    }
    public void die(){
        int index = ActivePiecesList.returnIndex(this);
        this.x = 0;
        this.y = 0;
        this.setIcon(null);
        this.setBounds(0,0,0,0);


        ActivePiecesList.remove(index); //replaced with dummy automatically

    }

    public void checkPromote(){
        Piece p = null;
        System.out.println("CheckPromote function for item " + this);
        if (this.color.equals("White") && this.y == 8 && this.getClass().getName().equals("Pawn")){
            String[] choices = {"Queen", "Rook", "Bishop", "Knight"};
            ImageIcon whitePawnPromo = new ImageIcon(getClass().getResource("whitePawnPromotion.png"));
            String input = (String) JOptionPane.showInputDialog(null,"Chose a promotion for the pawn","Promotion",JOptionPane.QUESTION_MESSAGE,whitePawnPromo,choices,choices[0]);
            int index = ActivePiecesList.returnIndex(this);

            if (input.equals("Queen")){
                p = new Queen(this.x,this.y,this.color,true);
            }else if (input.equals("Rook")){
                p = new Rook(this.x,this.y,this.color,true);
            }else if (input.equals("Bishop")){
                p = new Bishop(this.x,this.y,this.color,true);
            }else if (input.equals("Knight")) {
                p = new Knight(this.x,this.y,this.color,true);
            }

            ActivePiecesList.activePiecesList[index] = p;
            this.setBounds(0,0,0,0);
            Play.board.add(p,1);

        }else if (this.color.equals("Black") && this.y == 1 && this.getClass().getName().equals("Pawn")) {

            String[] choices = {"Queen", "Rook", "Bishop", "Knight"};
            ImageIcon blackPawnPromo = new ImageIcon(getClass().getResource("blackPawnPromotion.png"));
            String input = (String) JOptionPane.showInputDialog(null, "Chose a promotion for the pawn", "Promotion", JOptionPane.QUESTION_MESSAGE, blackPawnPromo, choices, choices[0]);
            int index = ActivePiecesList.returnIndex(this);

            if (input.equals("Queen")){
                p = new Queen(this.x,this.y,this.color,true);
            }else if (input.equals("Rook")){
                p = new Rook(this.x,this.y,this.color,true);
            }else if (input.equals("Bishop")){
                p = new Bishop(this.x,this.y,this.color,true);
            }else if (input.equals("Knight")) {
                p = new Knight(this.x, this.y, this.color, true);
            }

            ActivePiecesList.activePiecesList[index] = p;
            this.setBounds(0,0,0,0);
            Play.board.add(p,1);
        }
    }
}







