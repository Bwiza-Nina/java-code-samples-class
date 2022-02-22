package com.funlearning;

import java.io.IOException;
import java.util.*;

public class TicTacToeGame {

    static String[] gameBoard;
    static String turn;

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
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
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
        System.out.println(turn+"'s turn, enter a slot number to place "+turn+" in");
        return null;
        }

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
            
        }
    }

