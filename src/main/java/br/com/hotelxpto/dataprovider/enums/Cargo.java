package br.com.hotelxpto.dataprovider.enums;

import lombok.Getter;

@Getter
public enum Cargo {

    RECEPCIONISTA(1),
    GERENTE(2);

    private int codigo;
    Cargo(int codigo) { this.codigo = codigo; }

}
