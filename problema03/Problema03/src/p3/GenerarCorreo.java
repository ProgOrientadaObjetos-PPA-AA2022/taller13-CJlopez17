package p3;

public class GenerarCorreo {
    private Dominio dom;
    private String correo;

    public void establecerDominio(Dominio d){
        dom = d;
    }

    public void establecerCorreo(String l){
        correo = String.format("%s%s", l, obtenerDominio().obtenerDominio());
    }

    public Dominio obtenerDominio(){
        return dom;
    }

    public String obtenerCorreo(){
        return correo;
    }

    @Override
    public String toString(){
        String cadena = String.format("%s%s",
                obtenerCorreo(), obtenerDominio());
        return cadena;
    }
}

