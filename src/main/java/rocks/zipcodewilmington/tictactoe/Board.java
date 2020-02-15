package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {


    public char topLeft;
    public char topMid;
    public char topRight;
    public char midLeft;
    public char midMid;
    public char midRight;
    public char botLeft;
    public char botMid;
    public char botRight;
    public static String winner;

    public Board(Character[][] matrix) {
        topLeft = matrix[0][0];
        topMid = matrix[0][1];
        topRight = matrix[0][2];
        midLeft = matrix[1][0];
        midMid = matrix[1][1];
        midRight = matrix[1][2];
        botLeft = matrix[2][0];
        botMid = matrix[2][1];
        botRight = matrix[2][2];
        winner = "";
    }

    public Boolean isInFavorOfX() {

        if(topLeft == 'X' && topMid == 'X' && topRight == 'X' ||
                midLeft == 'X' && midMid == 'X' && midRight == 'X' ||
                botLeft == 'X' && botMid == 'X' && botRight == 'X' ||
                topLeft == 'X' && midLeft == 'X' && botLeft == 'X' ||
                topMid == 'X' && midMid == 'X' && botMid == 'X' ||
                topRight == 'X' && midRight == 'X' && botRight == 'X' ||
                topLeft == 'X' && midMid == 'X' && botRight == 'X' ||
                topRight == 'X' && midMid == 'X' && botLeft == 'X'){
            return true;
        }else {
            return false;
        }

    }

    public Boolean isInFavorOfO() {

        if(topLeft == 'O' && topMid == 'O' && topRight == 'O' ||
                midLeft == 'O' && midMid == 'O' && midRight == 'O' ||
                botLeft == 'O' && botMid == 'O' && botRight == 'O' ||
                topLeft == 'O' && midLeft == 'O' && botLeft == 'O' ||
                topMid == 'O' && midMid == 'O' && botMid == 'O' ||
                topRight == 'O' && midRight == 'O' && botRight == 'O' ||
                topLeft == 'O' && midMid == 'O' && botRight == 'O' ||
                topRight == 'O' && midMid == 'O' && botLeft == 'O'){
            return true;
        }else {
            return false;
        }
    }

    public Boolean isTie() {
        String winner = getWinner();
        if(winner == ""){
            return true;
        }else {
            return false;
        }
    }

    public String getWinner() {

        if (isInFavorOfO()) {
            winner = "O";
        } else if (isInFavorOfX()) {
            winner = "X";
        }

        return winner;
    }
}
