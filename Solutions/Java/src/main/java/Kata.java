import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {

        int[][] board = new int[7][7];
        for (int[] position  : board) {
            Arrays.fill(position, 0);
        }

        if (traveler(0, 0, 1, board)) {
            System.out.println("Location Accepted: " + 0 + " " + 0);
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
    }

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
        return false;
    }

    static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isTraveled(int[][] board) {
        for (int[] row : board) {
            for (int column : row) {
                if (column == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
