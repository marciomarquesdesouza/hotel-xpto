package br.com.hotelxpto.dataprovider.repository;

import br.com.hotelxpto.dataprovider.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}
