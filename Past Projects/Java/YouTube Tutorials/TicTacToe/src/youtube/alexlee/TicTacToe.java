package youtube.alexlee;

import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> computerPositions = new ArrayList<Integer>();

    public static void main(String[] args) {

        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ' , '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number (1-9) to place marker.");
            int playerPos = scan.nextInt();
            System.out.println("You selected: " + playerPos);


            while (playerPositions.contains(playerPos) || computerPositions.contains(playerPos)) {
                System.out.println("Position taken. Enter another (1-9).");
                playerPos = scan.nextInt();
            }

            placePiece(gameBoard, playerPos, "player");

            String result = checkWinner();
            if(result.length() > 0) {
                System.out.println(result);
                if (result.equals("Congratulations, you win!") || result.equals("Sorry! Computer wins!") || result.equals("It's a tie!")) {
                    System.exit(0);
                }
                break;
            }

            Random rand = new Random();
            int compPos = rand.nextInt(9) + 1;
            placePiece(gameBoard, compPos, "computer");
            System.out.println("Computer selected: " + compPos);
            while (playerPositions.contains(compPos) || computerPositions.contains(compPos)) {
                compPos = rand.nextInt(9) + 1;
            }

            printGameBoard(gameBoard);

            result = checkWinner();
            if(result.length() > 0) {
                System.out.println(result);
                if (result.equals("Congratulations, you win!") || result.equals("Sorry! Computer wins!") || result.equals("It's a tie!")) {
                    System.exit(0);
                }
                break;
            }

        }
    }

    private static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static void placePiece(char[][] gameBoard, int pos, String user) {

        char symbol = ' ';

        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else if (user.equals("computer")) {
            symbol = 'O';
            computerPositions.add(pos);
        }

        switch (pos) {
            case 1 -> gameBoard[0][0] = symbol;
            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[2][0] = symbol;
            case 5 -> gameBoard[2][2] = symbol;
            case 6 -> gameBoard[2][4] = symbol;
            case 7 -> gameBoard[4][0] = symbol;
            case 8 -> gameBoard[4][2] = symbol;
            case 9 -> gameBoard[4][4] = symbol;
        }
    }

    public static String checkWinner() {
        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> middleRow = Arrays.asList(4, 5, 6);
        List<Integer> bottomRow = Arrays.asList(7, 8, 9);

        List<Integer> leftCol = Arrays.asList(1, 4, 7);
        List<Integer> middleCol = Arrays.asList(2, 5, 8);
        List<Integer> rightCol = Arrays.asList(3, 6, 9);

        List<Integer> cross1 = Arrays.asList(1, 5, 9);
        List<Integer> cross2 = Arrays.asList(7, 5, 3);

        List<List> winningConditions = new ArrayList<List>();
        winningConditions.add(topRow);
        winningConditions.add(middleRow);
        winningConditions.add(bottomRow);

        winningConditions.add(leftCol);
        winningConditions.add(middleCol);
        winningConditions.add(rightCol);

        winningConditions.add(cross1);
        winningConditions.add(cross2);

        for (List l : winningConditions) {
            if (playerPositions.containsAll(l)) {
                return "Congratulations, you win!";
            } else if (computerPositions.contains(l)) {
                return "Sorry! Computer wins!";
            } else if (playerPositions.size() + computerPositions.size() == 9) {
                return "It's a tie!";
            }
        }

        return "";
    }
}
