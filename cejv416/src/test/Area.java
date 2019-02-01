/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
import java.text.NumberFormat;


/**
 *
 * @author PIRUZ
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r, area;
        double pi = Math.PI;
        System.out.println("Radius of circle - ");
        r = sc.nextFloat();
        area = Math.PI *Math.pow(r, 2);
        System.out.println("Area of circle - " + area);
        NumberFormat a = NumberFormat.getNumberInstance();
        a.setMaximumFractionDigits(3);
        String result = a.format(area);
        System.out.println(result);
    }

}
