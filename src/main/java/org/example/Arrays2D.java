package org.example;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Arrays2D {
    public static void workingWith2DArrays() {
        //init board using 2d arrays
        char[][] board = new char[3][3];

        //using nested loops to fill out 2d array with '-' char
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        //print
        System.out.println(Arrays.deepToString(board));

    }
}
