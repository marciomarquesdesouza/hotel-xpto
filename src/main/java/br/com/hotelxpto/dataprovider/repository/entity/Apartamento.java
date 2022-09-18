package br.com.hotelxpto.dataprovider.repository.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_apartamento")
public class Apartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApartamento;
    private String nome;
    private LocalDate dataLiberacao;
    private LocalDate dataReserva;
}
