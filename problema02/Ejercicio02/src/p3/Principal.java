/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;
import p2.CalculoMatriculas;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();
        
        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerTarifa();

        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerTarifa();

        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerTarifa();

        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerTarifa();

        ArrayList<CalculoMatriculas> gr = new ArrayList<>();

        gr.add(mcamp);
        gr.add(mcolegio);
        gr.add(mescuela);
        gr.add(mjardin);
        gr.add(mmaternal);
        gr.add(mmaternal2);
        
        tipos.establecerMatriculaCampamento(mcamp);
        tipos.establecerMatriculaColegio(mcolegio);
        System.out.printf("%s\n", tipos);
    }
}
