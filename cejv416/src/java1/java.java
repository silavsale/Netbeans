/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

/**
 *
 * @author PIRUZ
 */
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int a = 5;
        int b = a++;
        System.out.println("a = " + a + ",b =" + b);
        int c = ++a;
        System.out.println("a = " + a + ",c =" + c);
         int d = b++ + ++c;
         System.out.println("d =" + d + ",b =" + b + ",c =" + c);
      
    }
    
}
