/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p2.CalculoMatriculas;
import p2.TipoMatricula;

import java.util.Timer;

/**
 *
 * @author reroes
 */
public class MatriculaJardin extends CalculoMatriculas {
    private double tarifa;
    
        @Override
    public void establecerTarifa(){
        // tarifa = costo desayunos + costo libros + costo paseos
        tarifa = 50.2 + 140.2 + 40;
    }

    @Override
    public double obtenerTarifa(){
        return tarifa;
    }

    @Override
    public String toString() {
        String cadena = String.format("Matricula Jardin: \n" +
                "tarifa: \n%.2f",tarifa);
        return cadena;
    }
}
