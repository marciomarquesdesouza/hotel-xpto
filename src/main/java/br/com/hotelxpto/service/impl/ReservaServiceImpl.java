package br.com.hotelxpto.service.impl;

import br.com.hotelxpto.service.ReservaService;
import br.com.hotelxpto.service.domain.ReservaDomainResponse;
import br.com.hotelxpto.service.gateway.ReservaDataProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {
    @Autowired
    private ReservaDataProvider reservaServiceGateway;

    public List<ReservaDomainResponse> findAll(){
        return reservaServiceGateway.findAll();
    }
}
