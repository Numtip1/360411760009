package leb2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {
    public static void main(String[] args) throws IOException {



        // using BuffereadReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print( "What is your name?:");
        String name = reader.readLine();

        System.out.print("how own are you?");
        int age = Integer.parseInt(reader.readLine());

        //weight
        System.out.println("คุณน้ำหนักเท่าไหร่?");
        int weight =Integer.parseInt( (reader.readLine()));


        // output
        System.out.println("Hello,"+name);
        System.out.println("Your are "+age+"years old.");
        System.out.println("น้ำหนักคุณเท่าไหร่"+weight);


    }
}
