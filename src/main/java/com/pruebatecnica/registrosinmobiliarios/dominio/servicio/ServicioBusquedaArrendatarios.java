package com.pruebatecnica.registrosinmobiliarios.dominio.servicio;

import com.pruebatecnica.registrosinmobiliarios.dominio.modelo.Persona;
import com.pruebatecnica.registrosinmobiliarios.dominio.puerto.RepositorioBusqueda;

import java.util.List;
import java.util.Optional;

public class ServicioBusquedaArrendatarios {

    private final RepositorioBusqueda repositorioBusqueda;

    public ServicioBusquedaArrendatarios(RepositorioBusqueda repositorioBusqueda){
        this.repositorioBusqueda = repositorioBusqueda;
    }

    public Optional<List<Persona>> buscarArrendatarios(String nombrePropiedad){
        Optional<List<Persona>> encontrados = Optional.of(
                repositorioBusqueda.obtenerArrendatariosPropiedad(nombrePropiedad)
        );

        return encontrados;
    }

}
