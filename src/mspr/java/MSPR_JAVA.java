/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mspr.java;

import java.io.*;

/**
 *
 * @author root
 */
public class MSPR_JAVA {

    /**
     * @param args the command line arguments 
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File dir  = new File("C:\\Users\\rom\\.jenkins\\workspace\\m2\\");
        File[] liste = dir.listFiles();
        for(File item : liste){
            if(item.getName().endsWith(".txt")){
                if(item.getName().equals("liste.txt") == false && item.getName().equals("staff.txt") == false){
                    Sortie_html.Sortie_html("C:\\Users\\rom\\.jenkins\\workspace\\m2\\" + item.getName());
                }
            }
        }
    }
}
