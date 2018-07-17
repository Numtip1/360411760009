package leb_3;

import java.util.Scanner;

public class BMRcal {


    public static void main(String[] args) {

        char g;
        int a, h;
        double w;

        Scanner scanner = new Scanner(System.in);

        //input

        System.out.println("ระบุเพศชายพิมพ์ (m) หรือหญิงพิมพ์ (f) :");
        g = scanner.next().charAt(0);

        System.out.println("กำหนดให้ h เป็นข้อมูลความสูง :");
        h = scanner.nextInt();


        System.out.println("กำหนดให้ w เป็นข้อมูลน้ำหนัก :");
        w = scanner.nextDouble();

        System.out.println("กำหนดให้ a เป็นข้อมูลอายุ :");
        a = scanner.nextInt();


        double BMR;
        if (g == 'm') {
            BMR = 66 + (13.7 * w) + (5 * h) - (6.8 * a);
        } else {
            BMR = 655 + (9.6 * w) + (1.8 * h) - (4.7 * a);
            System.out.println("Your MBR : " + BMR);
        }


    }//main
}//class
