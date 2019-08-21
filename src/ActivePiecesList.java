public class ActivePiecesList {

    public static Piece[] activePiecesList = new Piece[32];
    private static int z = 0;

    public static void printList(){
        for (int m = 0; m < 32; m++){
            System.out.println(activePiecesList[m]);
        }

    }
    public static boolean  checklistAndTilePos(int x, int y) {

        for (int t = 0; t < 32; t++){
            if (activePiecesList[t].x == x && activePiecesList[t].y == y ) {
                return  true;
            }
        }
        return false;
    }
    public static Piece  returnPieceAt(int x, int y) {
        if (checklistAndTilePos(x,y)){
            for (int t = 0; t < 32; t++){
                if (activePiecesList[t].x == x && activePiecesList[t].y == y ) {
                    return activePiecesList[t];
                }
            }
        }return null;
    }
    public static void movePiece(Piece p, int x, int y){
        p.x = x;
        p.y = y;
        p.assignBounds(x,y);
        p.repaint();
        System.out.println(p + " has been moved" );
        if (p.getClass().getName().equals("Pawn")){
            p.checkPromote();
        }

    }
    public static int returnIndex(Piece p){
        for (int t = 0; t < 32; t++){
            if (activePiecesList[t] == p){
                return t;
            }

        }
        System.out.println("Error in returnIndex");
        return 33;
    }


    public static void add(Piece p){
        System.out.println("--- add piece function");
        if( z < activePiecesList.length) {
            activePiecesList[z] = p;
            System.out.print(p + "piece added at Active Pieces list at index [" + z + "]\n");
            z++;
        }
    }
    public static void remove(int index){
        System.out.println("Piece " + activePiecesList[index] + " removed from Active Pieces list" );
        activePiecesList[index] = new Dummy();
    }
}