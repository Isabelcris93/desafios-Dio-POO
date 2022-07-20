package dio.desafios.POO.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Faculdade {
    private String nome;
    private String descriptor;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private final Set<Aluno> devsInscritos = new HashSet<>();
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();

    public void setNome(String nome) {
        this.nome = nome;
    }




    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }


    public Set<Aluno> getDevsInscritos() {
        return devsInscritos;
    }


    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculdade bootcamp = (Faculdade) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descriptor, bootcamp.descriptor) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descriptor, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
