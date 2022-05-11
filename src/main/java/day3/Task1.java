package day3;

import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        /**
         * 2D Array for storing multiplication table
         */
        int[][] table = new int [10][10]; //creating table, choosing table size: [10][10]
        int row = 1 , column = 1;

        /**
         * Using for() to iterate through table and fill in blanks with results.
         */
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                table[i][j] = row * column; //Iterating 0 < 1, so [0][0] inserts 1, 1 < 2 so [0][1] inserts 2.
                column = column+1; //first completing whole column from 1 to 10
            }
            row = row+1;
            column = 1;
        }
        /**
         * for loop creates visual multiplication table.
         */
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(" " + table[i][j] + "\t| "); //after each iteration puts | and makes tab space.
            }
            System.out.print("\n"); //after all j iterations are done, \n starts a new line.
            }

    }
}
