///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// */
//
//package com.mycompany.classicalmatrixmultiplication;
//
//import java.util.Random;
//
///**
// *
// * @author abano
// */
//public class ClassicalMatrixMultiplication {
//    
//     public static int[][] generateRandomMatrix() { //Creates Random n x n Matrix
//        int[][] matrix = new int[4][4];         //NOTE: [ ][ ] is the input size 
//        Random random = new Random();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = random.nextInt(10); // Generate a random integer between 0 and 9
//            }
//        }
//        return matrix;
//    }
//
//    public static void main(String[] args) {
//        //Declration
//        //int A[][], B[][], C[][];
//        
//        System.out.print("Please enter the Matrix size: ");
//        int mSize = input.nextInt();
//    
//        int[][] matrix_A = generateRandomMatrix();
////                      { { 1, 1, 1, 1 }, //Try this input
////                        { 2, 2, 2, 2 },
////                        { 3, 3, 3, 3 },
////                        { 5, 5, 5, 5 } };
//        System.out.println("Array A =>");
//    printArr(matrix_A);
//        
//    int[][] matrix_B = generateRandomMatrix();
////                      { { 1, 1, 1, 1 },  //Try this input
////                        { 2, 2, 2, 2 },
////                        { 3, 3, 3, 3 },
////                        { 4, 4, 4, 4 } };
// 
//    System.out.println("Array B =>");
//    printArr(matrix_B);
//    
//    int[][] matrix_c= { { 0, 0, 0, 0 },
//                        { 0, 0, 0, 0 },
//                        { 0, 0, 0, 0 },
//                        { 0, 0, 0, 0 } };
//    
//    matrix_c = multiply(matrix_A,matrix_B,matrix_c, 4);
//
//    System.out.println("The Result Matrix=>");    
//        printArr(matrix_c);
//    
//        
//    }
//    
//    public static int[][] multiply(int A[][], int B[][], int C[][], int N){
//    for (int i = 0; i < N; i++)
//    {
//        for (int j = 0; j < N; j++)
//        {
//            C[i][j] = 0;
//            for (int k = 0; k < N; k++)
//            {
//                C[i][j] += A[i][k]*B[k][j];
//            }
//        }
//    }
//    return C;
//    }
//    
//    public static void printArr(int C[][]){
//    for (int i = 0; i < 4; i++)
//        {
//            for (int j = 0; j < 4; j++)
//            {
//                System.out.print(C[i][j] + " ");
//            }
//            System.out.println();
//        }
//        
//    }
//}
