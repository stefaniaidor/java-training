package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    public static int xPosition;
    public static int yPosition;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        //throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
        try {
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pieces[xCoordinate][yCoordinate] = pawn;
        } catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            pawn.setYCoordinate(-1);
            pawn.setXCoordinate(-1);
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if(xCoordinate <= 7 && yCoordinate <=7 && xCoordinate >= 0 && yCoordinate >= 0)
            return true;
        return false;
    }
}
