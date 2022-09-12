package br.com.hotelxpto.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_FUNCIONARIO")
public class Funcionario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Cargo cargo = Cargo.COMUM;

    public Funcionario(String nome) {
        this.nome = nome;
    }
}