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
public class MatriculaCampamento extends CalculoMatriculas {
    private double tarifa;

    @Override
    public void establecerTarifa(){
        // tarifa = costo transporte + costo comida + costo instructores
        tarifa = 100.2 + 30.2 + 90.2;
    }

    @Override
    public double obtenerTarifa(){
        return tarifa;
    }

    @Override
    public String toString() {
        String cadena = String.format("Matricula Campamento: \n" +
                "tarifa: \n%.2f",tarifa);
        return cadena;
    }
}
