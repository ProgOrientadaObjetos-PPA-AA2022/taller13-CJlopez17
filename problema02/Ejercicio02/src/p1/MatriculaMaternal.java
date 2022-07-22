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
public class MatriculaMaternal extends CalculoMatriculas {
    private double tarifa;
    
        @Override
    public void establecerTarifa(){
        // tarifa = costo desayunos + costo almuerzo + costo medico
        tarifa = 50.2 + 40.2 + 80.2;
    }

    @Override
    public double obtenerTarifa(){
        return tarifa;
    }

    @Override
    public String toString() {
        String cadena = String.format("Matricula Maternal: \n" +
                "tarifa: \n%.2f",tarifa);
        return cadena;
    }
}