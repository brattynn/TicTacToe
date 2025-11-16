package com.pd;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Let's play Tic-Tac-Toe!");

        //Create a 3 column by 3 row board
        char[][] board = new char[3][3];

        //Initialize board with empty spaces
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;

        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {     //Keeps the game running until gameOver is true
            printBoard(board);  //Function call to print the game board
            System.out.println("Player " + player + " enter: ");

            //Collect user input
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            //Check to see if location user wants to access is already taken
            if (board[row][col] == ' ') {
                //Place the element in the players selected space
                board[row][col] = player;
                gameOver = hasWon(board, player);

                //Handle a game over
                if (gameOver) {
                    System.out.println("Congratulations! Player " + player + " has won the game!");
                }
                else {
//                    if (player == 'X') {    //Handle player switching
//                        player = 'O';
//                    }
//                    else {
//                        player = 'X';
//                    }
                    player = (player == 'X') ? 'O' : 'X';   //Reads as "player equals (if player equals X, then O, otherwise X
                }
            }
            else {
                System.out.println("Invalid move, try again.");
            }

            //Print final board
            printBoard(board);
        }
    }

    //Function for printing the game board
    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | "); //No new line after columns
            }
            System.out.println();   //New line after each row
        }
    }

    //Function for determining if a player has won the game
    public static boolean hasWon(char[][] board, char player) {
        //Check the rows for the same letter
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        //Check the columns for the same letter
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        //Check the diagnals for the same letter
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }
}