package com.funlearning;

import java.io.IOException;
import java.util.*;

public class TicTacToeGame {

    static String[] gameBoard;
    static String turn;

    //to check if the diagonals, rows, or columns match
    static String checkWinner(){
        for(int a=0; a<8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = gameBoard[0] + gameBoard[1] + gameBoard[2];
                    break;
                case 1:
                    line = gameBoard[3] + gameBoard[4] + gameBoard[5];
                    break;
                case 2:
                    line = gameBoard[6] + gameBoard[7] + gameBoard[8];
                    break;
                case 3:
                    line = gameBoard[0] + gameBoard[3] + gameBoard[6];
                    break;
                case 4:
                    line = gameBoard[1] + gameBoard[4] + gameBoard[7];
                    break;
                case 5:
                    line = gameBoard[2] + gameBoard[5] + gameBoard[8];
                    break;
                case 6:
                    line = gameBoard[0] + gameBoard[4] + gameBoard[8];
                    break;
                case 7:
                    line = gameBoard[2] + gameBoard[4] + gameBoard[6];
                    break;
                default:
                    break;
            }
            //if X is the winner
            if (line.equals("XXX")) {
                return "X";
            }
            //if O is the winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }
        for(int a=0; a<9; a++){
            if(Arrays.asList(gameBoard).contains(String.valueOf(a+1))) {
                break;
            }else if(a==8) {
                return "draw";
            }
        }
        //To enter X or O at the exact place on the board
        System.out.println(turn+"'s turn, enter a slot number to place "+turn+" in");
        return null;
        }

        //To print the board
        static void printBoard(){
            System.out.println("|---|---|---|");
            System.out.println("| " + gameBoard[0] + " | "
                    + gameBoard[1] + " | " + gameBoard[2]
                    + " |");
            System.out.println("|-----------|");
            System.out.println("| " + gameBoard[3] + " | "
                    + gameBoard[4] + " | " + gameBoard[5]
                    + " |");
            System.out.println("|-----------|");
            System.out.println("| " + gameBoard[6] + " | "
                    + gameBoard[7] + " | " + gameBoard[8]
                    + " |");
            System.out.println("|---|---|---|");
        }

        public static void main(String[]args) throws IOException{
            Scanner in = new Scanner(System.in);
            gameBoard = new String[9];
            turn = "X";
            String winner = null;

            for(int a=0; a<9; a++){
                gameBoard[a] = String.valueOf(a+1);
            }
            System.out.println("Welcome to 3x3 Tic tac toe!");
            printBoard();

            System.out.println("X will play first. Enter a slot number ro place X in: ");
            while(winner==null){
                //numInput is used to take the number entered by the player
                int numInput;
                //Exception handling
                try{
                   numInput = in.nextInt();
                   if(!(numInput>0 && numInput<=9)){
                       System.out.println("Invalid input; re-enter slot number");
                       continue;
                   }
                }catch(InputMismatchException e){
                    System.out.println("Invalid input, re-enter slot number");
                    continue;
                }

                //to decide who's turn it is
                if (gameBoard[numInput-1].equals(String.valueOf(numInput))){
                    gameBoard[numInput-1] = turn;

                    if(turn.equals("X")){
                        turn = "O";
                    }else{
                        turn = "X";
                    }
                    printBoard();
                    winner = checkWinner();
                }else{
                    System.out.println("Slot already taken, re-enter the slot number");
                }
            }
            //if there is no winner, to logic to decide to do so
            if(winner.equalsIgnoreCase("draw")){
                System.out.println("It is a draw! Thanks for playing");
            }
            //If there is a winner
            else{
                System.out.println("Congratulations! "+winner+"'s have won! Thanks for playing");
            }
        }
    }

