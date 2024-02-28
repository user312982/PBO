package org.example;
import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        int rows, column;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        rows = input.nextInt();
        System.out.println("Enter the number of column: ");
        column = input.nextInt();
        int A[][] = new int[rows][column];
        int B[][] = new int[rows][column];
        int C[][] = new int[rows][column];
        System.out.println("Enter element for matrix A: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                A[i][j]=input.nextInt();
            }
        }

        System.out.println("Enter element for matrix B: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                B[i][j]=input.nextInt();
            }
        }

        System.out.println("Sum of Matrix A and B is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(C[i][j]+"\t");
            }
            System.out.print("\n");
        }
        input.close(); // penutup Scanner
    }
}







