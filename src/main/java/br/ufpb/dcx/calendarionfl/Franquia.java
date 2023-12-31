package br.ufpb.dcx.calendarionfl;

import java.io.Serializable;
import java.util.*;

public class Franquia implements Serializable {

    private String nome;
    private String cidade;
    private Conferencia conferencia;
    private Divisao divisao;
    private List<Jogo> adversarios;

    public Franquia(String nome, String cidade,
                    Conferencia conferencia, Divisao divisao,
                    List<Jogo> adversarios) {
        this.nome = nome;
        this.cidade = cidade;
        this.conferencia = conferencia;
        this.divisao = divisao;
        this.adversarios = adversarios;
    }

    public Franquia() {
        this("", "", null, null, new LinkedList<>());
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public Conferencia getConferencia() {
        return conferencia;
    }

    public Divisao getDivisao() {
        return divisao;
    }

    public List<Jogo> getAdversarios() {
        return adversarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setConferencia(Conferencia conferencia) {
        this.conferencia = conferencia;
    }

    public void setDivisao(Divisao divisao) {
        this.divisao = divisao;
    }

    public void setAdversarios(List<Jogo> adversarios) {
        this.adversarios = adversarios;
    }

    @Override
    public String toString() {
        return cidade + " " + nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Franquia franquia = (Franquia) o;
        return Objects.equals(nome, franquia.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

}