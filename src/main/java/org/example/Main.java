package org.example;

import org.example.tp0.Matrix;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3);
        for (int i = 0; i < matrix.getSize() ; i++){
            for (int j = 0; j < matrix.getSize() ; j++){
                matrix.set(i,j,i+j+1);
            }
        }

        Matrix matrix2 = new Matrix(3);
        for (int i = 0; i < matrix2.getSize() ; i++){
            for (int j = 0; j < matrix2.getSize() ; j++){
                matrix2.set(i,j,i+j);
            }
        }

        System.out.print(matrix.toString());
        System.out.print(matrix2.toString());
        System.out.print(matrix.toString().compareTo(matrix2.toString()));
    }
}