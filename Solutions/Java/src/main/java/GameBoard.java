public class GameBoard {
    private int travelNumber = 0;
    private int pointsTraveled = 0;

    //8x8 Board
    private int[][] board;
    private int startRow;
    private int startCol;

    //Knight Movements
    private final int[]  rowTravel = {-2, -2, -1, -1, 2, 2, 1, 1};
    private final int[]  columnTravel = {-1, 1, -2, 2, -1, 1, -2, 2};

    public GameBoard (int boardSize) {
        board = new int[boardSize][boardSize];
    }

    public void setStartPosition(int startRow, int startCol) {
        this.startRow = startRow;
        this.startCol = startCol;
    }

    public void startFromChosenPosition() {
        System.out.println("Attempting Traversal of Point: " + startRow + ", " + startCol);
        if (travel(startRow, startCol)) {
            System.out.println("Travel completed!");
            System.out.println("Position: " + startRow + " " + startCol);
            printBoard();
        } else {
            System.out.println("Travel failed!");
        }
        System.out.println("Points Traveled: " + pointsTraveled);
    }

    public boolean travel(int row, int col) {
        travelNumber++;
        pointsTraveled++;
        //System.out.println(travelNumber);
        board[row][col] = travelNumber;
        //printBoard();
        if (isTraveled()) {
            System.out.println("Board Cleared!");
            return true;
        }
        for (int i = 0; i < rowTravel.length; i++) {
            int newRowPosition = row + rowTravel[i];
            int newColPosition = col + columnTravel[i];

            if (newRowPosition >= 0 && newRowPosition < board.length
                    && newColPosition >= 0 && newColPosition < board[newRowPosition].length) {
                if (board[newRowPosition][newColPosition] == 0) {
                    //System.out.println("Trying movement: " + i + " for travel#: " + travelNumber);
                    if (travel(newRowPosition, newColPosition)) {
                        return true;
                    }
                }
            }
        }
        travelNumber--;
        board[row][col] = 0;
        return false;
    }

    public void printBoard() {
        for (int[] row : board) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private boolean isTraveled() {
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
