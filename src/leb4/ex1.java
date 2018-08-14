package leb4;

public class ex1 {
    public  static  void B (String msg){

        System.out.println(msg);
    }//B


    public static void main(String[] args) {

        System.out.println("Hello main.");
        //call A ()
        A ();
        System.out.println("Hello main. 2");
        //call B ()
        B("may");
        //call C ()
       int num = C(10,10); //20
        System.out.println(num);
        System.out.println (C (20,20));


    }//main
    public  static  void  A () {
        //method body
        System.out.println("Hello A .");

    }

    public  static  int C (int x, int y) {
        System.out.println( "Hello c.");
      return  x+y;  //int


    }//C



}//class

