package leb2;

import javax.lang.model.element.NestingKind;
import java.io.IOException;

public class Ex2 {

    public static void main(String[] args) throws IOException {

        boolean m = true;
        boolean n =false;
        System.out.println(m);

        int number;
        System.out.println( "Please enter an integer:");
        //System.in.read ();
        number = System.in.read();
        System.out.println(number);
        System.out.print("What is your name");
        String name = String.valueOf(System.in.read());
        System.out.print(name);

    } // main
}
