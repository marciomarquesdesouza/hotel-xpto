package br.com.hotelxpto.dataprovider.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Getter
@Table(name = "tb_reserva")
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCodigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private int statusReserva;
    @OneToOne
    @JoinColumn(name = "id_hospede")
    private Hospede hospede;
    @OneToOne
    @JoinColumn(name = "id_apartamento")
    private Apartamento codigoApartamento;
}
