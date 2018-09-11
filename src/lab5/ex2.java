package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner( System.in);
        int [] num = new int [5];
        System.out.println("please , enter integers number:");


        //input
        for (int i =0;i < num.length; i++){
            System.out.print ("enter integer" + (i+1)+":");
            num[i] = scanner .nextInt();

        }

        //output
       // System.out.println("\n Data in Array following:");
        //for (int i =0; i < num.length; i++) {
         //   System.out.print(num [i] +" ");
        //}





         showData (num);
        findmaximum (num);
        findminimum (num);
        findaverrage (num);
        sortingdata (num);
    }//main

    private static void sortingdata(int[] num) {
        Arrays.sort(num);
        System.out.println("เรียงจากน้อยไปมาก:\n");
      showData( num);

    }


    private static void findaverrage(int[] num) {
        int x =0;
        for (int a : num) {
           x += a;
        }
        System.out.println("\nค่าเฉลี่ย" + (x/num.length));


    }//findverrage


    private static void findminimum(int[] num) {
        int max =num [0];
        for (int i =0; i< num.length; i++ ){
            if (max> num [i])
                max = num[i];

        } System.out.println("\nค่าที่น้อยที่สุด"+ max);
    }//findmini



    private static void findmaximum(int[] num) {
        int max =num [0];
        for (int i =0; i< num.length; i++ ){
            if (max< num [i])
                max = num[i];

       } System.out.println("\nค่าที่มากทีสุด"+ max);
    }//findmax




    private static void showData(int[] num) {
        //output2
        for (int val : num) {
            System.out.print(val + " ");

        }
        }














} //class
