package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    public Character[][] board;

    public Board(Character[][] matrix) {
        board = matrix;
    }

    public Boolean isInFavorOfX() {
        boolean xFavored = false;
        char[] middleDiagonal = new char[5];
        int diagonalCounter = 0;
        int xCounter = 0;

        for(int i = 0; i < board.length; i++) {
            for (int k = 0; k < board.length; k++) {
                if (board[i][k] == 'X') {
                    xCounter++;
                }
                if((i == 0 && k == 0) || (i == 0 && k == 2) ||
                        (i == 1 && k == 1) || (i == 2 && k == 0) ||
                        (i == 2 && k == 2)) {
                    middleDiagonal[diagonalCounter] = board[i][k];
                    diagonalCounter++;
                }
            }
            if(xCounter == 3){
                xFavored = true;
            }
            xCounter = 0;
        }

        xCounter = 0;

        for(int k = 0; k < board.length; k++) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][k] == 'X') {
                    xCounter++;
                }
            }
            if (xCounter == 3) {
                xFavored = true;
            }
            xCounter = 0;
        }

        if(middleDiagonal[0] == 'X' &&
                middleDiagonal[2] == 'X' &&
                middleDiagonal[4] == 'X'){
            xFavored = true;
        }else if(middleDiagonal[1] == 'X' &&
                middleDiagonal[2] == 'X' &&
                middleDiagonal[3] == 'X'){
            xFavored = true;
        }

        return xFavored;
    }

    public Boolean isInFavorOfO() {

        boolean oFavored = false;
        char[] middleDiagonal = new char[5];
        int diagonalCounter = 0;
        int oCounter = 0;

        for(int i = 0; i < board.length; i++) {
            for (int k = 0; k < board.length; k++) {
                if (board[i][k] == 'O') {
                    oCounter++;
                }
                if((i == 0 && k == 0) || (i == 0 && k == 2) ||
                        (i == 1 && k == 1) || (i == 2 && k == 0) ||
                        (i == 2 && k == 2)) {
                    middleDiagonal[diagonalCounter] = board[i][k];
                    diagonalCounter++;
                }
            }
            if(oCounter == 3){
                oFavored = true;
            }
            oCounter = 0;
        }

        oCounter = 0;

        for(int k = 0; k < board.length; k++){
            for(int i = 0; i < board.length; i++){
                if(board[i][k] == 'O'){
                    oCounter++;
                }
            }
            if(oCounter == 3){
                oFavored = true;
            }
            oCounter = 0;
        }

        if(middleDiagonal[0] == 'O' &&
                middleDiagonal[2] == 'O' &&
                middleDiagonal[4] == 'O'){
            oFavored = true;
        }else if(middleDiagonal[1] == 'O' &&
                middleDiagonal[2] == 'O' &&
                middleDiagonal[3] == 'O'){
            oFavored = true;
        }

        return oFavored;
    }

    public Boolean isTie() {
        String winner = getWinner();
        if(winner.equals("O") || winner.equals("X")){
            return false;
        }else {
            return true;
        }
    }

    public String getWinner() {

        String winner = "";

        if(isInFavorOfO()){
            winner = "O";
        }else if (isInFavorOfX()){
            winner = "X";
        }

        return winner;
    }

    public int oRowAmount(Character[] row){

        int oCounter = 0;

        for(int i = 0; i < row.length; i++){
            if(row[i] == ')'){
                oCounter++;
            }
        }

        return oCounter;
    }

    public int oColumnAmount(Character[] column) {

        int oCounter = 0;

        for (int i = 0; i < column.length; i++) {
            if (column[i] == 'O') {
                oCounter++;
            }
        }

        return oCounter;
    }

    public int xRowAmount(Character[] row){

        int xCounter = 0;

        for(int i = 0; i < row.length; i++){
            if(row[i] == 'X'){
                xCounter++;
            }
        }

        return xCounter;
    }

    public int xColumnAmount(Character[] column) {

        int xCounter = 0;

        for (int i = 0; i < column.length; i++) {
            if (column[i] == 'X') {
                xCounter++;
            }
        }

        return xCounter;
    }

}
