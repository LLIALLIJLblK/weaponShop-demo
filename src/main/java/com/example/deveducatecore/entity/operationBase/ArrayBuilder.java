package com.example.deveducatecore.entity.operationBase;

public class ArrayBuilder {
    int size = 4;
    int[][] arr;

    public int[][] creatArray() {
        arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = (int) Math.round(Math.random() * 100);
            }
        }
        return arr;
    }

    public void showArray() {
        System.out.println("Show array: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" ");
        }
    }

    public int[][] sortArray() {
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int n = 0; n < size; n++) {
                    for (int m = 0; m < size; m++) {
                        if (arr[i][j] <= arr[n][m]) {
                            temp = arr[i][j];
                            arr[i][j] = arr[n][m];
                            arr[n][m] = temp;
                        }
                    }
                }
            }
        }
        return arr;
    }

    public void showSort() {
        System.out.println("Show sort array: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}
