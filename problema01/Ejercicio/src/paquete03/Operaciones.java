package paquete03;

import paquete01.Televisor;

import java.util.ArrayList;

public class Operaciones {

    protected ArrayList<Televisor> lista;
    double totalPrecio;
    double televisoresMasCaros;
    String ListaMarcasT;

    public void establecerListado(ArrayList<Televisor> f){
        lista = f;
    }

    public void establecertotalPrecioTvs() {
        double s = 0;
        for (int i = 0; i < lista.size(); i++) {
            s = s + lista.get(i).obtenerPrecio();
            //System.out.println(s);
        }
        totalPrecio = s;
    }

    public void establecertelevisorMasCaro() {
        televisoresMasCaros = lista.get(0).obtenerPrecio();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).obtenerPrecio()> televisoresMasCaros ){
                televisoresMasCaros = lista.get(i).obtenerPrecio();
            }
        }
    }

    public void establecerlistaMarcasVendidas() {
        String s = "";
        for (int i = 0; i < lista.size(); i++) {
            s = String.format("%s%s\n", s, lista.get(i).obtenerMarca());
        }
        ListaMarcasT = s;
    }

    public ArrayList<Televisor> obtenerListado(){
        return lista;
    }

    public double obtenerTotalPrecio(){
        return totalPrecio;
    }

    public double obtenerTelevisoreMasCaro(){
        return televisoresMasCaros;
    }

    public String obtenerListaMarcaT(){
        return ListaMarcasT;
    }

    @Override
    public String toString() {

        String listado = String.format("");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println();
        }
        listado = String.format("%s\n"
                        + "Total Precios: %s\n"
                        + "Televisor mas Caro:  %s\n"
                        + "Marcas mas Vendidas: %s\n",
                listado, obtenerTotalPrecio(),
                obtenerTelevisoreMasCaro(),
                obtenerListaMarcaT());
        return listado;

    }
}
