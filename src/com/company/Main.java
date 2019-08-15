package com.company;

public class Main {

    public static void main(String[] args) {

       /* int [] a = {12, 23, 1, 3};
        int[] b = new int[5];
        for (int i = 0; i <a.length-1; i++) {
            System.out.println(a[i]);
        }
        for (int i : a) {
            System.out.println("b = " + i);
        }*/
       /* int[][] c = {{1, 2, 3}, {5, 6, 7}};
        System.out.println(c[0][1]);*/

       /* for (int i = 0; i < 10; i++) {
            if (i%2==0)return;
            System.out.println("i = " + i);
        }*/
       /*String strString = "123";
        String strDouble = "123.456";
        int x; double y;
        x = Integer.parseInt(strString);
        y = Double.parseDouble(strDouble);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        strString = String.valueOf(x+1);
        System.out.println("strString = " + strString);
        strDouble = String.valueOf(y - 1);
        System.out.println("strDouble = " + strDouble);
        String str;
        str = "num " + 342;
        System.out.println("str = " + str);
        // Приведение строчного к цифровому и обратно
*//*
        int[] a = {10,23,45,67,34};
       for (int i = 0; i < a.length/2; i++) {
           int temp = a[i];
           a[i] = a[a.length - i - 1];
           a[a.length - i - 1] = temp;
       }
        System.out.println(a[1]);*/
       /* for (int i = a.length-1; i >=0 ; i--) {
            System.out.println("i = " + a[i]);
            System.out.println("a[0] = " + a[0]);

        }
*/
          /*public static void sort (int[]data){
            for (int barrier = data.length - 1; barrier >= 0; barrier++) {
                for (int index = 0; index < barrier; index++) {
                    if (data[index] > data[index + 1]) {
                        data[index] = data[index + 1];
                        data[index+1] = tmp;
                                         }
                }
            }
        }*/
        int[] a = {2, 3, 4, 5, 6, 7,8};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[0]);
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
            System.out.println(a[0]);
            break;
        }
    }
}