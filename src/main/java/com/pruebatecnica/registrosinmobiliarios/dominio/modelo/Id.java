package com.pruebatecnica.registrosinmobiliarios.dominio.modelo;

import java.util.Objects;
import java.util.UUID;

//TODO Refactor a Record con java 16+

public class Id{

    private UUID valor;

    public Id(UUID valor){
        Objects.requireNonNull(valor, "El ID no puede ser nulo");

        this.valor = valor;
    }

    public static Id generarId(){
        return new Id(UUID.randomUUID());
    }

    public static Id generarIdConString(String valor){
        return new Id(UUID.fromString(valor));
    }

    @Override
    public String toString(){
        return this.valor.toString();
    }

}
