package lab5;

public class ex5 {
    public static void main(String[] args) {

        String msg1 = " Hallo ";
        //length();
        System.out.println(msg1.length());
        System.out.println("*"+msg1+"*");
        System.out.println("*"+msg1.trim()+"*");


        //compare String
        String msg2 = "MIT421";
        String msg3 = "MIT421";
        String msg4 = "MT MIT421";
        //==
        if (msg2 == msg3)
            System.out.println("Yes");
        else System.out.println("No");
        if (msg3 == msg4)
            System.out.println("Yes");
        else System.out.println( "No");
            //eguals()
        if (msg2.equals(msg3))
            System.out.println("Yes");
        else System.out.println( "No");
        if (msg2.equals(msg4))
            System.out.println("Yes");
        else System.out.println( "No");
        //compareTo()
        if (msg2.compareTo(msg3)==0)
        System.out.println("2 String are equal");
        else if (msg2.compareTo(msg3)>1);
        else
            System.out.println("msg2 less than msg3");



    }//main
}//class
