package dio.desafios.POO.dominio;

public abstract class Conteudo {

    protected static final double xp_PADRAO = 10d;

    private String titulos;
    private String descriptor;

    public abstract double calcularXp();


    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }
}
