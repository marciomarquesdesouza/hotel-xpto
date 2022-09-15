package br.com.hotelxpto.model;

import br.com.hotelxpto.model.enums.Cargo;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TB_FUNCIONARIO")
public class Funcionario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFuncionario;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Cargo cargo = Cargo.RECEPCIONISTA;

    public Funcionario(String nome) {
        this.nome = nome;
    }
}