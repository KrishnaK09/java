import java.util.Map;

public class statmentex {
    public static void main(String[] str) {

/*  1.
       Write a Java program to calculate grades based on marks. If the mark is 90 or above, the grade is 'A'. If it's between 80 and
      89, the grade is 'B'. For marks between 70 and 79, the grade is 'C'. If the mark is between 60 and 69, the grade is 'D'. Below
        60, it's 'F'.
        */

        int marks = 95;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade C");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
/* 2.
        Create a Java application that classifies age into categories. If the age is less than 13, print "Child". If it's between 13 and 19,
        print "Teenager". For ages between 20 and 59, print "Adult". If the age is 60 or above, print "Senior".*/

        int age =55;

        if (age <13) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }


 /*  3.
      In a theater, the ticket price varies based on the day of the week. Write a Java program that takes the day of the week as
        input and prints the ticket price. Weekdays have a price of $10, Saturday is $15, and Sunday is $12.*/

        String days= "Monday";

        if (days.equals("Saturday")){
            System.out.println("Ticket price : $15");
        }else if (days.equals("Sunday")) {
            System.out.println("Ticket price : $12");
        }else {
            System.out.println("Ticket price : $10");
        }

    }




}
