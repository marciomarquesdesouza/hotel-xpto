package br.com.hotelxpto.dataprovider.repository.entity;

import br.com.hotelxpto.dataprovider.enums.Cargo;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_funcionario")
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