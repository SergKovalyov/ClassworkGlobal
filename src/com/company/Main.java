package com.company;

public class Main {

    public static void main(String[] args) {
        char ch1, ch2;
        ch1 = 'x';
        ch2 = 88;
        //System.out.println("ch2 = " + ch2);
        /*System.out.println("ch1 = " + ch1);
        ch1++;
        System.out.println("ch1 = " + ch1);
        System.out.println("This is the  \n line with \n break"+"\n"+ ch2);*/
        //System.out.println("4/2="+4/2 == "4/2=2" );

        /*int mousQ = 0;//
        int catWeight = 4500;//kg
        if (mousQ > 0 && catWeight / mousQ < 1000) {
            System.out.println("You can gat a cat");
        }
        else {
            System.out.println("You Don't");
        }*/

        /*int a = -5;
        //int b = a < 0 ? a+35 : a +10;
        //System.out.println("b = " + b);
        if (a < 0){
            a += 35;
        } else a += 10;
        System.out.println("a = " + a);
*/
        //int definedBonus;
       /* int purchaseItem = 4;
        int bonus;
        bonus = purchaseItem > 3 ? 10 : 0;
        //return bonus;
        System.out.println("bonus = " + bonus);*/
       /* int month = 4;
        String season  ;
        if (month == 12 || month==1 || month==2)
           season = "Winter";
        else season = "Wrong month";
        System.out.println("season = " + season);
*/
       /* int[] data = {3, 1, 99, 8};
        for (int stoper = data.length-1 ; stoper > 0 ; stoper--) {
            for (int index = 0; index < stoper ; index++) {
                if (data[index] > data[index + 1]) {
                    int temp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = temp;// присваиваем второй переменной число из временной переменной temp
                }*/
/*
        for (int a = 1, b = 7; a < b; a++, b--) {
            System.out.println(a);

            }*/
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : a) {
            System.out.println("x = " + x);
            sum =sum+x;}
        System.out.println("sum = " + sum);
        }
            }

/*
        System.out.println("data = " + data[0]);
        System.out.println("data = " + data[1]);
        System.out.println("data = " + data[2]);
        System.out.println("data = " + data[3]);

        }
    }

*/



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


//
//        int[] a = {2, 3, 4, 5, 6, 7, 8};
//        reverse(a);
//    }
//
//    private static void reverse(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[0]);
//            int temp = a[i];
//            a[i] = a[a.length - i - 1];
//            a[a.length - i - 1] = temp;
//            System.out.println(a[0]);
//            break;
//        }
        //public static void sort (int[]data){
        /*int[] data = {23, 1, 99, 4};
            for (int barrier = data.length - 1; barrier >= 0; barrier--) {

                for (int index = 0; index <barrier; index++) {
                    if (data[index] > data[index + 1]) {
                        int tmp = data[index];
                        data[index] = data[index + 1];
                        data[index + 1] = tmp;
                    }
                }

            }
        //System.out.println("data = " + data[barrier]);
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);*/

       /* int[] c = {11, 34, 56, 78, 89};
        for (int i = 0; i <c.length/2 ; i++) {
            int temp = c[i];
            c[i]= c[c.length-i-1];
            c[c.length-i-1]=temp;
            System.out.println(c[0]);
            break;*/

       /* int[] a = {45, 2, 9, 1};
        for (int stopper = a.length-1; stopper > 0 ; stopper--) {
            for (int i = 0; i < stopper ; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }

            }

        }
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
*/

       /* int[] b = {4, 5, 6, 7, 8};
        for (int i = 0; i < b.length/2 ; i++) {
            int tmp = b[i];
            b[i] = b[b.length - i - 1];
            b[b.length - i - 1] = tmp;

        }
        System.out.println(b[0]+","+b[1]+","+b[2]+","+b[3]+","+b[4]);
*/
        /*System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);*/

  /*  }
    }
*/
