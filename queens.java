import java.util.Scanner;

public class queens {
    public static void solveQueens(String[][] board, int n, int num) {
        if (num == n) {
            printBoard(board);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (check(board, n, i, num)) {
                board[num][i] = "q";
                solveQueens(board, n, num + 1);
                board[num][i] = ".";
            }
        }
    }

    public static boolean check(String[][] board, int n, int col, int row) {
        // Checks Columns
        for (int i = 0; i < row; i++)
            if (board[i][col].equals("q")) return false;

        // Check Left Diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j].equals("q")) return false;

        // Check Right Diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++)
            if (board[i][j].equals("q")) return false;

        return true;
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter n: ");
        n = scan.nextInt();

        String[][] board = new String[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = ".";

        solveQueens(board, n, 0);
        scan.close();
    }
}