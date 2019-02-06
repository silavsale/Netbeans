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
public class Switch {

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
        
        switch (print)
        {
            case "AB":
         System.out.println("*" + print + "\tAlberta");
                break;
                
             case "BC":
         System.out.println("*" + print + "\tBritish Columbia");
                break; 
                
             case "MB":
         System.out.println("*" + print + "\tManitoba");
                break; 
                
                 case "NB":
         System.out.println("*" + print + "\tNew Brunswick");
                break; 
                
                 case "NL":
         System.out.println("*" + print + "\tNewfoundlandk");
                break;  
                
                case "NS":
         System.out.println("*" + print + "\tNova Scotia");
                break; 
                
                case "NT":
         System.out.println("*" + print + "\tNorthwest Territories");
                break; 
                
                case "NU":
         System.out.println("*" + print + "\tNunavut");
                break; 
                
                 case "ON":
         System.out.println("*" + print + "\tOntario");
                break; 
                
                case "PE":
         System.out.println("*" + print + "\tPrince Edward Island");
                break; 
               
                case "QC":
         System.out.println("*" + print + "\tQuebec");
                break; 
                
                 case "SK":
         System.out.println("*" + print + "\tSaskatchewan");
                break;
                
                 case "YT":
         System.out.println("*" + print + "\tYukon");
                break;
                 default: 
         System.out.println("Not Found");
                
                
                
                
        }
        
        
    }
    
}
