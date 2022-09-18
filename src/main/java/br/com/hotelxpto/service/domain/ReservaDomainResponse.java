package br.com.hotelxpto.service.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ReservaDomainResponse {

    private Long idCodigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private int statusReserva;

}
