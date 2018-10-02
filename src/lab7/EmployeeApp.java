package lab7;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
         Employee emp1 = new Employee("numtip kheawchan",
                 " 009",
                 "Programmer" ,
                 150000,
                 "numtip@gmail.com"
                  );
          System.out.println(emp1.toString());


          Employee emp2 = new Employee();

          emp2 = inputData (emp2);








    }//main

    private static Employee inputData(Employee emp) {
        Scanner sc = new Scanner( System.in);
        System.out.println( "Enter your name:");
        emp.setName( sc.nextLine());
        System.out.print( "Enter your position:");
        emp.setPosition(sc.nextLine());
        System.out.print( "enter your id:");
        emp.setId(sc.nextLine());
        System.out.print("Enter your Email:");
        emp.setEmail(sc.nextLine());
        System.out.print( "Enter your salary");
        emp.setSalary(sc.nextInt());
        return  emp;
    }
}//class
