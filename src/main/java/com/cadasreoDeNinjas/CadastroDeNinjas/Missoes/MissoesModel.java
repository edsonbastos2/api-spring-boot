package com.cadasreoDeNinjas.CadastroDeNinjas.Missoes;

import com.cadasreoDeNinjas.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missao")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Rank dificuldade;

    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjaModels;

    public MissoesModel() {
    }

    public MissoesModel(String nome, Rank dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Rank getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Rank dificuldade) {
        this.dificuldade = dificuldade;
    }
}
