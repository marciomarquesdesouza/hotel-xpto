package br.com.hotelxpto.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TB_HOSPEDE")
public class Hospede {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHospede;

    private String nome;

    private String cpf;

    private String rg;

    private String endereco;

    private int numero;

    private String cidade;

    private String estado;

    private int telefone;

    private Date dataNasc;

    private String email;
}
