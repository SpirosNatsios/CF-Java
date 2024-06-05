package gr.aueb.cf.ch9;

import java.util.Scanner;

public class TicTacToeApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isPlaying = true;
        int player = 1;
        String playersSymbol = "X";
        String choice = "";
        String[][] grid = {
                {"7", "8", "9"},
                {"4", "5", "6"},
                {"1", "2", "3"}
        };

        welcomeMessage();
        printGrid(grid);

        while(isPlaying) {
            System.out.printf("Players %s turn \n", player);
            do{
                choice = in.nextLine();
            } while (!checkChoice(grid,choice));

            placeChoice(grid,choice,playersSymbol);
            printGrid(grid);
            if (!checkWinner(grid,playersSymbol)) {
                checkWinner(grid,playersSymbol);
                System.out.println("nikises");
                System.exit(1);
            }


            if (player == 1) {
                player = 2;
                playersSymbol = "O";
                continue;
            }
            player = 1;
            playersSymbol = "X";
        }
    }

    public static boolean checkWinner(String[][] grid, String playersSymbol) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][0].equals(grid[i][j])) {
                    count++;
                    if (count == 3){
                        return false;
                    }
                }

            }
            count = 0;
        }

        return true;
    }

    public static boolean checkChoice(String[][]grid, String choice) {
        for (String[] strings : grid) {
            for (String string : strings) {
                if (string.equals(choice)) {
                    return true;
                }
            }
        }
        System.out.println("Tile is already chosen, pick again");
        printGrid(grid);
        return false;
    }

    public static void placeChoice(String[][] grid, String choice, String playersSymbol) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j].equals(choice)) {
                    grid[i][j] = playersSymbol;
                }
            }
        }
    }

    public static void printGrid(String[][] grid) {
        for (String[] strings : grid) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    public static void welcomeMessage() {
        System.out.println("Tic Tac Toe Game!");
        System.out.println("Player 1 is X");
        System.out.println("Player 2 is O");
        System.out.println();
    }
}
