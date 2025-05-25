package com.cadasreoDeNinjas.CadastroDeNinjas.Missoes;

public enum Rank {
    A("Fácil",1),
    B("Médio",2),
    C("Moderado",3),
    D("Difícil",5);

    private String descricao;
    private int nivel;

    Rank() {
    }

    Rank(String descricao, int nivel) {
        this.descricao = descricao;
        this.nivel = nivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
