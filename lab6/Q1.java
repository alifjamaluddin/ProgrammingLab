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
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;
import java.io.File;
import java.io.PrintWriter;
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        URL u = new URL("http://www.fsktm.um.edu.my/");
        URLConnection cnn = u.openConnection();
        InputStream stream = cnn.getInputStream();
        Scanner in = new Scanner(stream);   
        File file = new File("index.htm");
            if(file.exists())
                System.out.println("File already existed");
            PrintWriter fileout = new PrintWriter(file);
                while(in.hasNext()){
                    //fileout.print(in.next());
                    fileout.append(in.next());
                }
        }
        catch(IOException e){
            System.out.println("IO Error: " + e.getMessage());
        }
        System.out.println("DONE");
    }
    
}