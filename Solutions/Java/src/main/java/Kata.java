import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {
        //GameBoard gameBoard = new GameBoard();
        int boardSize = 8;
        GameBoard gameBoard = new GameBoard(boardSize);
        gameBoard.setStartPosition(0, 0);
        gameBoard.startFromChosenPosition();
        /*
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                GameBoard gameBoard = new GameBoard(boardSize);
                gameBoard.setStartPosition(i, j);
                gameBoard.startFromChosenPosition();
            }
        }

         */
    }
}


        /*
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                if (traveler(i, j, board)) {
                    System.out.println("Location Accepted: " + i + " " + j);
                }
            }
        }

            */
    /*
    private static boolean traveler(int row, int column, int iteration, int[][] board) {
        board[row][column] = iteration;
        printBoard(board);
        iteration++;
        if (isTraveled(board)) {
            return true;
        }
        int[] rowTravel = {-2, -2, -1, -1, 2, 2, 1, 1};
        int[] columnTravel = {-1, 1, -2, 2, -1, 1, -2, 2};
        for (int i = 0; i < rowTravel.length; i++) {
            if (row + rowTravel[i] < board.length && row + rowTravel[i] >= 0
                    && column + columnTravel[i] < board.length && column + columnTravel[i] >= 0) {
                System.out.println("Testing Movement to:" + rowTravel[i] + " " + columnTravel[i] +
                        "\nIteration: " + iteration);
                if (board[row + rowTravel[i]][column + columnTravel[i]] == 0) {
                    if (traveler(row + rowTravel[i], column + columnTravel[i], iteration, board)) {
                        return true;
                    }
                }
            }
        }
        board[row][column] = 0;
        return false;
    }

     */




