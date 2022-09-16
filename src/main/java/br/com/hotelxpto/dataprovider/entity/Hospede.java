package br.com.hotelxpto.dataprovider.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Getter
@Table(name = "tb_hospede")
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
