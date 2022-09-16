package br.com.hotelxpto.dataprovider.impl;

import br.com.hotelxpto.dataprovider.mapper.ReservaDataProviderDomainMapper;
import br.com.hotelxpto.dataprovider.repository.ReservaRepository;
import br.com.hotelxpto.service.domain.ReservaDomainResponse;
import br.com.hotelxpto.service.gateway.ReservaDataProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaDataProviderImpl implements ReservaDataProvider {
    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<ReservaDomainResponse> findAll() {

        return ReservaDataProviderDomainMapper.toReservaDomain(reservaRepository.findAll());

    }
}
