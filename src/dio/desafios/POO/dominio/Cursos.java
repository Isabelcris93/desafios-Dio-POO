package dio.desafios.POO.dominio;

public class Cursos extends Conteudo {
    private int cargHoraria;

    @Override
    public double calcularXp() {
        return xp_PADRAO * cargHoraria;
    }


    public Cursos(){

    }

    public void setCargHoraria(int cargHoraria) {
        this.cargHoraria = cargHoraria;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "titulos='" + getTitulos() + '\'' +
                ", descrição='" + getDescriptor() + '\'' +
                ", cargHoraria=" + cargHoraria +
                '}';
    }


}
