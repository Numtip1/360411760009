package leb2;

import java.util.Scanner;

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        //Fahrenheit
                System.out.print ("Fahrenheit");
                double Fahrenheit = scanner.nextDouble();
                //celsius
        double celsius = (5.0/9.0) * (Fahrenheit -32.0);


        //out put
        System.out.println("celsius is "+celsius);


        // main
    }
}
