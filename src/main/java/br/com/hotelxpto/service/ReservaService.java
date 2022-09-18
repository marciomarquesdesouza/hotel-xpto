package br.com.hotelxpto.service;

import br.com.hotelxpto.dataprovider.repository.entity.Reserva;
import br.com.hotelxpto.service.domain.ReservaDomainResponse;

import java.util.List;

public interface ReservaService {
    List<ReservaDomainResponse> findAll();
}
