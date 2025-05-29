package com.cadasreoDeNinjas.CadastroDeNinjas.Missoes;

import com.cadasreoDeNinjas.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_missao")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Rank dificuldade;

    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjaModels = new ArrayList<>();
}
