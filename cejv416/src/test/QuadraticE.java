/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author PIRUZ
 */
public class QuadraticE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner num = new Scanner(System.in);
        double a, b, c, D;
        
        System.out.print("a - ");
        a = num.nextDouble();
        System.out.print("b - ");
        b = num.nextDouble();
        System.out.print("c - ");
        c = num.nextDouble();
        D = Math.pow(b,2)-4*a*c;
        double x1, x2;
         x1 =(-b - Math.sqrt(D))/(2*a);
        x2 = (-b + Math.sqrt(D))/(2*a);
        System.out.println("x1 = "  +  x1  + "\nx2 = " +x2);
    }
    
    
}
