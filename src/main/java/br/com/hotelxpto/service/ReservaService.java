package br.com.hotelxpto.service;

import br.com.hotelxpto.dataprovider.entity.Reserva;
import br.com.hotelxpto.dataprovider.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository repository;

    public List<Reserva> findAll(){
        return repository.findAll();
    }
}
