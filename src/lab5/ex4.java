package lab5;


import java.util.ArrayList;

public class ex4 {
    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        myList.add( "may");
        System.out.println(myList);
        myList.add (" Q ") ;
        myList.add("Mook");
        myList.add("swiss");
        myList.add( "both");
        System.out.println(myList);
        myList.add("j");
        System.out.println(myList);
        //remove
        myList.remove(4);
        System.out.println(myList);
        //indexof ()
        System.out.println( myList.indexOf("tar"));
        //size
        System.out.println( myList.size());
    }//main
}//class
