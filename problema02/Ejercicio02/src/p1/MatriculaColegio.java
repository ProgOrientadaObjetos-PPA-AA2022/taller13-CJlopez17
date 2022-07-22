/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p2.CalculoMatriculas;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class MatriculaColegio extends CalculoMatriculas {
    private double tarifa;

    @Override
    public void establecerTarifa(){
        // tarifa = costo deportes + costo folletos + 
        //          costo uniformes + costo laboratorios
        tarifa = 150.2 + 140.2 + 240.2 + 300.4;
    }
    @Override
    public double obtenerTarifa(){
        return tarifa;
    }

    @Override
    public String toString() {
        String cadena = String.format("Matricula Colegio: \n" +
                "tarifa: \n%.2f",tarifa);
        return cadena;
    }
}
