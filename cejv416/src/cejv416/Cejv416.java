/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cejv416;
import java.util.Scanner;

/**
 *
 * @author PIRUZ
 */
public class Cejv416 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner num = new Scanner(System.in);
       float c, f, result;
       System.out.print("C: ");
       c = num.nextFloat();
       result = (c*9/5)+32;
       System.out.println("F= " + result);
       System.out.print("F: ");
       f = num.nextFloat();
       result = (f-32)*5/9;
       System.out.println("C= " + result);
      
       
       

    }
    
}
