/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package While;

import java.util.Scanner;


/**
 *
 * @author PIRUZ
 */
public class Exercise16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = 5;
        int countAnswers = 0;

        while (number > 0) {
            //create 2 randmom numbers 
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);
            int a = (int) Math.max(num1, num2);
            int b = (int) Math.min(num1, num2);

            System.out.print("What is " + a + " - " + b + " = ");
            number--;
            int result = sc.nextInt();

            System.out.println(a - b == result ? "True" : "False");

            //Count the right answers
            if (a - b == result) {
                countAnswers++;
            }

        }
        System.out.println("Outside while loop --- Total correct answers: " + countAnswers);

        int totalQ = 5;
        int percentage = ((countAnswers * 100) / totalQ);
//       

        System.out.println("Outside while loop --- Total percentage of correct answers is: " + percentage + "%");

    }
}
