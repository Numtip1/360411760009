package leb_3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x,y;

        System.out.print("insert number x: ");
         x =scanner.nextInt();
        System.out.print("insert number1 y: ");
         y =scanner.nextInt();

        //test condition
        if (x>y) System.out.println( x+"มากกว่า"+y);
        else System.out.println(y+"มากกว่า"+x);
    }//main
}//class
