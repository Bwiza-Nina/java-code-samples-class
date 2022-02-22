package com.funlearning;

import java.io.IOException;
import java.util.Scanner;

public class TicTacToe {

    static String[] boardOfGame;

    public static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + boardOfGame[0] + " | "
                + boardOfGame[1] + " | " + boardOfGame[2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + boardOfGame[3] + " | "
                + boardOfGame[4] + " | " + boardOfGame[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + boardOfGame[6] + " | "
                + boardOfGame[7] + " | " + boardOfGame[8]
                + " |");
        System.out.println("|---|---|---|");
    }

    public static void updateBoard(int position, int player, char[][] gameBoard) {
        char character;
        if (player == 1) {
            character = 'X';
        } else {
            character = 'O';
        }
        switch (position) {
            case 1:
                gameBoard[0][0] = character;
                printBoard();
                break;
            case 2:
                gameBoard[0][2] = character;
                printBoard();
                break;
            case 3:
                gameBoard[0][4] = character;
                printBoard();
                break;
            case 4:
                gameBoard[1][0] = character;
                printBoard();
                break;
            case 5:
                gameBoard[1][2] = character;
                printBoard();
                break;
            case 6:
                gameBoard[1][4] = character;
                printBoard();
                break;
            case 7:
                gameBoard[2][0] = character;
                printBoard();
                break;
            case 8:
                gameBoard[2][2] = character;
                printBoard();
                break;
            case 9:
                gameBoard[2][4] = character;
                printBoard();
                break;
            default:
                break;
        }
    }

    public static void main(String [] args) throws IOException{
        try{
//            char [][] gameBoard = {
//                    {'_','|','_','|','_'},
//                    {'_','|','_','|','_'},
//                    {' ','|',' ','|',' '}
//            };
            printBoard();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}