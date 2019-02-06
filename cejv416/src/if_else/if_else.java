/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/**
 *
 * @author PIRUZ
 */
public class if_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String province_1 = "AB";
        String province_2 = "BC";
        String province_3 = "MB";
        String province_4 = "NB";
        String province_5 = "NL";
        String province_6 = "NS";
        String province_7 = "NT";
        String province_8 = "NU";
        String province_9 = "ON";
        String province_10 = "PE";
        String province_11 = "QC";
        String province_12 = "SK";
        String province_13 = "YT";
        System.out.print("Please enter your province code:)");
        Scanner sc = new Scanner(System.in);
        String print = sc.next();
        if (province_1.equals(print)) {
            System.out.println("*" + print + "\tAlberta");

        } //         System.out.print("Please enter your province code:)");
        //         Scanner num = new Scanner(System.in);
        //         String print1 = num.next();
        else if (province_2.equals(print)) {
            System.out.println("*" + print + "\tBritish Columbia");
        } else if (province_3.equals(print)) {
            System.out.println("*" + print + "\tManitoba");
        } else if (province_4.equals(print)) {
            System.out.println("*" + print + "\tNew Brunswick");
        } else if (province_5.equals(print)) {
            System.out.println("*" + print + "\tNewfoundland");
        } else if (province_6.equals(print)) {
            System.out.println("*" + print + "\tNova Scotia");
        } else if (province_7.equals(print)) {
            System.out.println("*" + print + "\tNorthwest Territories");
        } else if (province_8.equals(print)) {
            System.out.println("*" + print + "\tNunavut");
        } else if (province_9.equals(print)) {
            System.out.println("*" + print + "\tOntario");
        } else if (province_10.equals(print)) {
            System.out.println("*" + print + "\tPrince Edward Island");
        } else if (province_11.equals(print)) {
            System.out.println("*" + print + "\tQuebec");
        } else if (province_12.equals(print)) {
            System.out.println("*" + print + "\tSaskatchewan");

        } else if (province_13.equals(print)) {
            System.out.println("*" + print + "\tYukon");
        } else {
            System.out.println("Not Found");
        }

    }

}
