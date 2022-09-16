package br.com.hotelxpto.service.gateway;

import br.com.hotelxpto.service.domain.ReservaDomainResponse;

import java.util.List;

public interface ReservaDataProvider {
    List<ReservaDomainResponse> findAll();
}
