package br.com.hotelxpto.dataprovider.mapper;

import br.com.hotelxpto.dataprovider.repository.entity.Reserva;
import br.com.hotelxpto.service.domain.ReservaDomainResponse;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class ReservaDataProviderDomainMapper {

    public static List<ReservaDomainResponse> toReservaDomain(List<Reserva> reservas){
        List<ReservaDomainResponse> reservasDomainResponse = new ArrayList<>();

        reservas.stream().forEach( reserva -> {
            reservasDomainResponse.add(ReservaDomainResponse.builder()
                    .idCodigo(reserva.getIdCodigo())
                    .dataEntrada(reserva.getDataEntrada())
                    .dataSaida(reserva.getDataSaida())
                    .statusReserva(reserva.getStatusReserva())
                    .build());
            }
        );

        return reservasDomainResponse;
    }

}
