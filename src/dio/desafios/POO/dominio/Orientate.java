package dio.desafios.POO.dominio;

import java.time.LocalDate;


public class Orientate extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return xp_PADRAO + 20d;
    }


    public Orientate(){

    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Orientação{" +
                "titulos='" + getTitulos() + '\'' +
                ", descrição='" + getDescriptor()+ '\'' +
                ", data=" + data +
                '}';
    }


}
