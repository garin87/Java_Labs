/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsu.Stas.logic;

/**
 * 31.05.2018 Group pois1709v
 *
 * @author Stas Ilyukovich v 1.0
 */
public class logicTaskA {

    /*
    Выведите номера столбцов, все элементы, которых четны. Для каждого
    столбца с отрицательным элементом на главной диагонали вывести его но-
    мер и сумму всех элементов этого столбца.
     */
    public static void task1(int[][] array, int row, int col) {

        int[] a = new int[col];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (array[i][j] % 2 == 1) {
                    a[j] = 1;
                }
            }
        }

        for (int j = 0; j < col; j++) {
            if (a[j] == 0) {
                System.out.print(j + " ");
            }
        }

    }

    /*
    Среди строк заданной матрицы, содержащих только нечетные элементы,
    найти строку с максимальной суммой модулей.
     */
    public static int task2(int[][] array, int row, int col) {
        int sum;
        int max = 0;
        int temp = 0;
        int tempMax = 0;
        int count;
        for (int i = 0; i < row; i++) {
            sum = 0;
            count = 0;
            for (int j = 0; j < col; j++) {

                if (array[i][j] % 2 != 0) {
                    count++;
                    sum += Math.abs(array[i][j]);
                    temp = i + 1;
                } else {
                    break;
                }

            }
            if (count == col) {
                //System.out.print(sum + " ");               
                if (max < sum) {
                    max = sum;
                    tempMax = temp;
                }
            }
        }

        // System.out.print("\n");
        // System.out.print(max + " ");
        // System.out.print("\n");
        // System.out.print(tempMax + " ");
        return tempMax;
    }

    /* 
    Среди столбцов заданной матрицы, содержащих только такие элементы, ко-
    торые по модулю не больше n, найти столбец с минимальным произведе-
    нием элементов.
     */
    public static int task3(int[][] array, int row, int col) {
        int mult;
        int n = 7;
        int min = 1000;
        int temp = 0;
        int tempMin = 0;
        int count;
        for (int j = 0; j < col; j++) {
            mult = 0;
            count = 0;
            for (int i = 0; i < row; i++) {

                if (array[i][j] <= n) {
                    count++;
                    mult = mult * Math.abs(array[i][j]);
                    temp = j + 1;
                } else {
                    break;
                }

            }
            if (count == row) {
                if (min > mult) {
                    min = mult;
                    tempMin = temp;
                }
            }
        }

        return tempMin;
    }

    /* 
    Выведите номера столбцов, элементы каждой из которых образуют моно-
    тонную последовательность (монотонно убывающую или монотонно воз-
    растающую).
     */
    public static void task4(int[][] array, int row, int col) {
        int temp = 0;
        int count;
        int count2;
        for (int j = 0; j < col; j++) {
            count = 0;
            count2 = 0;
            for (int i = 0; i < row - 1; i++) {
                if (array[i][j] <= array[i + 1][j]) {
                    count++;
                    temp = j + 1;
                } else if (array[i][j] >= array[i + 1][j]) {
                    count2++;
                    temp = j + 1;
                } else {
                    break;
                }
            }

            if (count == row - 1 || count2 == row - 1) {
                System.out.print(temp + " ");
            }
        }
    }

    /*
    Найти максимальный среди всех элементов тех строк заданной матрицы, ко-
    торые упорядочены (либо по возрастанию, либо по убыванию).
     */
    public static int task5(int[][] array, int row, int col) {
        int temp = 0;
        int count;
        int count2;
        int sum;
        int max = 0;
        int tempMax = 0;
        for (int j = 0; j < col; j++) {
            count = 0;
            count2 = 0;
            sum = 0;
            for (int i = 0; i < row - 1; i++) {
                if (array[i][j] <= array[i + 1][j]) {
                    count++;
                    temp = j + 1;
                    sum += Math.abs(array[i][j]);
                } else if (array[i][j] >= array[i + 1][j]) {
                    count2++;
                    temp = j + 1;
                    sum += Math.abs(array[i][j]);
                } else {
                    break;
                }
            }

            if (count == row - 1 || count2 == row - 1) {
                System.out.print(temp + " ");

                if (max < sum) {
                    max = sum;
                    tempMax = temp;
                }
            }
        }
        return tempMax;
    }

    /*
    Найти максимальное из чисел, встречающихся в заданной матрице более
    одного раза.
     */
    public static int task8(int[][] array, int row, int col) {

        int temp = 0;
        int max = 0;
        int[] a = new int[100];
        int s = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int q = 0; q < row; q++) {
                    for (int w = 0; w < col; w++) {
                        if (array[i][j] == array[q][w] && (i != q || j != w)) {
                            a[s] = array[i][j];
                            s++;
                            q = row;
                            break;
                        }
                    }
                }
            }
        }

        for (int j = 0; j < s; j++) {
            // System.out.print(a[j] + " ");
            if (max < a[j]) {
                max = a[j];
            }
        }

        // System.out.print("\n");
        // System.out.print(max + " "); 
        return max;
    }

    /*
    Для заданной целочисленной матрицы найти максимум среди сумм элемен-
    тов диагоналей, параллельных главной диагонали матрицы.
     */
    public static int task10(int[][] array, int row, int col) {

        int temp = 1;
        int sum;
        int sum2;
        int max = 0;
        for (int q = 0; q < row; q++) {
            sum = 0;
            sum2 = 0;
            for (int i = 0; i < row; i++) {

                for (int j = 0; j < col; j++) {

                    if (i == j + temp) {
                        sum += array[i][j];
                        //  System.out.print(array[i][j] + " ");
                    }
                    if (i == j - temp) {
                        sum2 += array[i][j];
                        //   System.out.print("( " + array[i][j] + " ) ");
                    }
                }
            }
            temp++;
            if (max < sum) {
                max = sum;
            }
            if (max < sum2) {
                max = sum2;
            }
            // System.out.println( " [" + sum + "] " +" (" + sum2 + ") " );           
        }
        //  System.out.println(max + " ");
        return max;
    }
    
    /*
    Повернуть матрицу на 90 (180, 270) градусов против (по) часовой стрелки.
    */
    
    public static void task11(int[][] array, int row, int col) {

        int[] a = new int[col];
        for (int i = 0; i < row / 2; i++) {

            for (int j =  0; j < (col + 1) / 2; j++) {
                
                  int temp = array[i][j];
                  array[i][j] = array[row - 1 - j][i];
                  array[row - 1 - j][i] = array[row -i -1][row - 1 - j];
                  array[row -i -1][col - 1 - j] = array[j][row - 1 - i];
                  array[j][row - 1 - i] = temp;
            }
            
        }
        
        System.out.print("\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print (array[j][i] + " ");
            }
            System.out.println ();
        }

    }
}
