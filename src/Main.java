import dio.desafios.POO.dominio.Aluno;
import dio.desafios.POO.dominio.Cursos;
import dio.desafios.POO.dominio.Faculdade;
import dio.desafios.POO.dominio.Orientate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Cursos curso1 = new Cursos();
       curso1.setTitulos("Curso de Turismo");
       curso1.setDescriptor("Descrição do Curso de Turismo");
       curso1.setCargHoraria(80);

       Cursos curso2 = new Cursos();
       curso2.setTitulos("Curso de Hotelaria");
       curso2.setDescriptor("Descrição do Curso de Hotelaria");
       curso2.setCargHoraria(40);


        Orientate orientate = new Orientate();
        orientate.setTitulos("Orientação do Curso de Turismo");
        orientate.setDescriptor("Descrição do Curso de Turismo");
        orientate.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(orientate);

        Faculdade faculdade = new Faculdade();
        faculdade.setNome("Curso de Turismo");
        faculdade.setDescriptor("Descrição de disciplina do curso de turismo");
        faculdade.getConteudos().add(curso1);
        faculdade.getConteudos().add(curso2);
        faculdade.getConteudos().add(orientate);

        Aluno alunaIsabel = new Aluno();
        alunaIsabel.setNome("Isabel");
        alunaIsabel.inscreverFaculdade(faculdade);
        System.out.println("Conteudos Inscritos: " + alunaIsabel.getConteudosInscritos());
        alunaIsabel.progredir();
        alunaIsabel.progredir();
        alunaIsabel.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos: " + alunaIsabel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + alunaIsabel.getConteudosConcluidos());
        System.out.println("XP: " + alunaIsabel.calcularTotalxp());

        System.out.println("------");

        Aluno alunaClara = new Aluno();
        alunaClara.setNome("Clara");
        alunaClara.inscreverFaculdade(faculdade);
        System.out.println("Conteudos Inscritos: " + alunaClara.getConteudosInscritos());
        alunaClara.progredir();
        alunaClara.progredir();
        alunaClara.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos: " + alunaClara.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + alunaClara.getConteudosConcluidos());
        System.out.println("XP: " + alunaClara.calcularTotalxp());

        System.out.println("------");


    }
}