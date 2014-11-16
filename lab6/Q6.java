/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Alif
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q6 {
    
    public static void main(String[] zzz){
        File file = new File("product.txt");
        File file2 = new File("order.txt");
        try {
            FileInputStream  prod = new FileInputStream(file);
            FileInputStream  ord = new FileInputStream(file2);
            Scanner prodin = new Scanner(prod);
            Scanner ordin = new Scanner(ord);
            String[] product = null;
            String[] order = null;
            //todo: set number of product according to the product text line
            //todo: set number of order according to the order text line
            String[][] productlist = new String[7][4];
            String[][] orderlist = new String[5][3];
            int x=0;
            int y=0;
            
            
            
            while(prodin.hasNextLine()){
                product = prodin.nextLine().split(",");
                
                 for(int i=0;i<product.length;i++){
                     productlist[x][i] = product[i];
                 }
                 x++;
            }
            
             while(ordin.hasNextLine()){
                order = ordin.nextLine().split(",");
                
                 for(int i=0;i<order.length;i++){
                     orderlist[y][i] = order[i];
                 }
                 y++;
            }
             
             
            
            
            System.out.println("OrderID \t ProductID \t OrderQuantiy \t PricePerUnit \t TotalPrice");
            double total = 0;
            for(int a=0;a<y;a++){
                 double priceperunit=0;
                 for(int b=0; b<x;b++){
                     if(orderlist[a][1].equalsIgnoreCase(productlist[b][0]))
                         priceperunit = Double.parseDouble(productlist[b][2]);
                 }
                 double totalprice = priceperunit * Integer.parseInt(orderlist[a][2]);
                 total +=totalprice;
                // System.out.println(orderlist[a][0] + " \t \t" + orderlist[a][1] + " \t\t " + orderlist[a][2] + " \t\t " + priceperunit+ " \t\t " + totalprice );
                 System.out.printf("%s \t\t %s \t\t %s \t\t %.2f \t\t %.2f",orderlist[a][0],orderlist[a][1],orderlist[a][2],priceperunit,totalprice);
                   
                
                    
                System.out.println("");
            }
            
            System.out.println("Total price = RM" + total);
            
           
            
                
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
