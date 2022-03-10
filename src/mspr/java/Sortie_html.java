/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mspr.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author root
 */
public class Sortie_html {
    
    /**
     *
     * @param path
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void Sortie_html(String path) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(path));
        String nom = "";
        String poste = "";
        String liste_arme = "";
        String prenom = "";
        String nomfichier = "";
        
        String line = br.readLine();
        nom += line+" ";
        line = br.readLine();
        prenom += line;
        
        poste = br.readLine();
        
        line = br.readLine();
        
        nomfichier = prenom.substring(0,1) + nom;
        
        
        PrintWriter writer = new PrintWriter("../"+nomfichier.toLowerCase()+".html", "UTF-8");
        writer.println("<!DOCTYPE html>\n" +
                            "<html>\n" +
                            "<head>\n" +
                            "<title>Fiche agent</title>\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "\n" +
                            "<h3>"+prenom+" "+nom+ "</h3>\n" +
                            "<br>\n" +
                            "<div style=\"text-align: right;\"><img src=\"CI.jpg\" alt=\"Carte d'identité\"></div>\n" +
                            "<br>\n" +
                            "<br>\n" +
                            "<p>"+poste+"</p>\n" +
                            "<br>\n" +
                            "<br>\n" +
                            "<ul>\n");
        
        while(br.readLine() != null) {
            liste_arme += "        " + "<li>" +br.readLine()+"\n";
        }
        writer.print(liste_arme);
        
        writer.print("</ul>\n" +
                            "\n" +
                            "<br>\n" +
                            "<br>\n" +
                            "<br>\n" +
                            "<br>\n" +
                            "<br>\n" +
                            "<a href=\"index.html\">Accueil</a>\n" +
                            "\n" +
                            "</body>\n" +
                            "</html>");
        
        writer.close();   
    }

}
