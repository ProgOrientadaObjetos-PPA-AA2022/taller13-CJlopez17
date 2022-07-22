/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.DominioGmail;
import p3.GenerarCorreo;
import p3.DominioOutlook;
import p3.DominioYahoo;
import p3.DominioUTPL;
import p3.DominoGobierno;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
        */

        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        ArrayList<Correo> lista = new ArrayList<>();

        DominioGmail dominioG = new DominioGmail();
        dominioG.establecerDominio("gmail.com");

        GenerarCorreo g1 = new GenerarCorreo();
        g1.establecerDominio(dominioG);
        g1.establecerCorreo(dominioG.obtenerDominio());

        Correo c1 = new Correo();
        c1.establecerDominio(dominioG);
        c1.establecerUserName(e.obtenerUserName());
        c1.establecerCorreo();

        lista.add(c1);


        DominioOutlook dominioO = new DominioOutlook();
        dominioO.establecerDominio("hotmail.com");

        GenerarCorreo g2 = new GenerarCorreo();
        g2.establecerDominio(dominioO);
        g2.establecerCorreo(dominioO.obtenerDominio());

        Correo c2 = new Correo();
        c2.establecerDominio(dominioO);
        c2.establecerUserName(e.obtenerUserName());
        c2.establecerCorreo();

        lista.add(c2);


        DominioYahoo dominioY = new DominioYahoo();
        dominioY.establecerDominio("yahoo.com");

        GenerarCorreo g3 = new GenerarCorreo();
        g3.establecerDominio(dominioY);
        g3.establecerCorreo(dominioY.obtenerDominio());

        Correo c3 = new Correo();
        c3.establecerDominio(dominioY);
        c3.establecerUserName(e.obtenerUserName());
        c3.establecerCorreo();

        lista.add(c3);


        DominioUTPL dominioU = new DominioUTPL();
        dominioU.establecerDominio("utpl.edu.ec");

        GenerarCorreo g4 = new GenerarCorreo();
        g4.establecerDominio(dominioU);
        g4.establecerCorreo(dominioU.obtenerDominio());

        Correo c4 = new Correo();
        c4.establecerDominio(dominioU);
        c4.establecerUserName(e.obtenerUserName());
        c4.establecerCorreo();

        lista.add(c4);


        DominoGobierno dominioGo = new DominoGobierno();
        dominioGo.establecerDominio("gob.ec");

        GenerarCorreo g5 = new GenerarCorreo();
        g5.establecerDominio(dominioG);
        g5.establecerCorreo(dominioG.obtenerDominio());

        Correo c5 = new Correo();
        c5.establecerDominio(dominioG);
        c5.establecerUserName(e.obtenerUserName());
        c5.establecerCorreo();

        lista.add(c5);


        e.establecerCorreos(lista);

        System.out.printf("%s\n", e);



    }
    
}
