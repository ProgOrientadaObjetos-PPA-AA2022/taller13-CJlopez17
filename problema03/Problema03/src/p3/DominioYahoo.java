package p3;

public class DominioYahoo implements Dominio{
    private String dominio;

    @Override
    public void establecerDominio(String g){
        dominio = g;
    }

    @Override
    public String obtenerDominio(){
        return dominio;
    }

}

