package p3;

public class DominioOutlook implements Dominio{
    private String dominio;
    @Override
    public void establecerDominio(String w){
        dominio = w;
    }

    @Override
    public String obtenerDominio(){
        return dominio;
    }
}
