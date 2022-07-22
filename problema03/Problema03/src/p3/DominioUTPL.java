package p3;

public class DominioUTPL implements Dominio {
    private String dominio;

    @Override
    public void establecerDominio(String g) {
        dominio = g;
    }

    @Override
    public String obtenerDominio() {
        return dominio;
    }

    @Override
    public String toString() {
        String cadena = String.format("- UTPL");

        return cadena;
    }
}
