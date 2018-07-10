package leb2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //input
        //name
        System.out.println("what is your name? :");
        String name = scanner.nextLine();
        System.out.print("How own are you?");
        int age = scanner.nextInt();
        System.out.print("คุณน้ำหนักเท่าไหร่?");
        double weight = scanner.nextDouble();

        // output
        System.out.println("Hello,"+name );
        System.out.println("Your are "+age+"years old.");
        System.out.println("น้ำหนักคุณเท่าไหร่"+weight);


    } //main

}// class

