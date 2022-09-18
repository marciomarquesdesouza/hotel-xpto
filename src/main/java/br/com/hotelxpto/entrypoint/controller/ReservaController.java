package br.com.hotelxpto.entrypoint.controller;

import br.com.hotelxpto.service.ReservaService;
import br.com.hotelxpto.service.domain.ReservaDomainResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/reserva")
public class ReservaController {
    @Autowired
    private ReservaService service;

    @GetMapping
    public ResponseEntity<List<ReservaDomainResponse>> findAll(){
        List<ReservaDomainResponse> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
