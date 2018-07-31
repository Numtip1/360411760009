package leb_3;

public class Quiz1_1 {

    public static void main(String[] args) {

        int count =0;
        int  sum=0;

        for (int x = 500; x < 1000; x++) {
            //ststment for
            if (x % 3 == 0 && x % 6 == 0) {
                System.out.print(x + " ");
                count++;
                sum+=x; //sum = sum+;

            }
            }


            System.out.print("\n of value is"+count);
        System.out.print("the summation is"+sum);
        System.out.print("the averrage vale is"+(sum/count));















    } //main


} //class
