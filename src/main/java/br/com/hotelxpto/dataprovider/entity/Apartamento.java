package br.com.hotelxpto.dataprovider.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Getter
@Table(name = "tb_apartamento")
public class Apartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApartamento;
    private String nome;
    private LocalDate dataLiberacao;
    private LocalDate dataReserva;
}
