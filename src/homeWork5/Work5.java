package homeWork5;

import java.util.Scanner;
import java.util.Random;

public class Work5 {
    public static void main(String[] args) {
        System.out.println("Задача 1");
         sumArray();
        System.out.println("Задача 2");
        getChessCycle();
        System.out.println("Задача *");
        getSnakeArray();
    }

       public static void sumArray(){
           Scanner scanner = new Scanner(System.in);

           int [][] tabel = new int[3][3];
           for (int rows = 0; rows < 3; rows++) {
               for (int cols = 0; cols < 3; cols++) {
                   tabel[rows][cols] = (int) (Math.random() * 10);
                   System.out.print(tabel[rows][cols] + " ");
               }
               System.out.println();
           }

           System.out.println("Число для суммирования: ");
           int x = scanner.nextInt();
           int sum = 0;
           for (int rows = 0; rows < 3; rows++) {
               for (int cols = 0; cols < 3; cols++) {
                   tabel[rows][cols] += x;
                   sum += tabel[rows][cols];
                   System.out.print(tabel[rows][cols]+ " ");
               }
               System.out.println();
           }
           System.out.println("Сумма элементов: " + sum);
       }
    public static void getChessCycle() {
        char[][] table = new char[8][8];
        for (int rows = 0; rows < table.length; rows++) {
            for (int cols = 0; cols < table[rows].length; cols++) {
                if ((rows + cols) % 2 == 0) {
                    table[rows][cols] = 'W';
                } else {
                    table[rows][cols] = 'B';
                }
                System.out.print(table[rows][cols] + "  ");
            }
            System.out.println();
        }
    }
        public static void getSnakeArray () {
            Scanner inputN = new Scanner(System.in);
            System.out.print("Введите число строк (N): ");
            int n = inputN.nextInt();
            Scanner inputM = new Scanner(System.in);
            System.out.print("Введите число столбцов (M): ");
            int m = inputM.nextInt();
            System.out.println("N = " + inputN + "M = " + inputM);
            int[][] A = new int[n][m];
            int num = 0;
            for (int rows = 0; rows < n; rows++) {
                for (int cols = 0; cols < m; cols++) {
                    if (rows % 2 == 0) {
                        A[rows][cols] = num++;
                    } else {
                        A[rows][m - cols - 1] = num++;
                    }
                }
            }

            for (int rows = 0; rows < n; rows++) {
                for (int cols = 0; cols < m; cols++) {
                    System.out.printf("%3d", A[rows][cols]);
                }
                System.out.println();
            }
        }
    }



