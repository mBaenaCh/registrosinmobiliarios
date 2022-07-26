package com.pruebatecnica.registrosinmobiliarios.dominio.servicio;

import com.pruebatecnica.registrosinmobiliarios.dominio.puerto.RepositorioBusqueda;

import java.util.List;
import java.util.Optional;

public class ServicioBusquedaNombresPropiedades {

    private final RepositorioBusqueda repositorioBusqueda;

    public ServicioBusquedaNombresPropiedades(
            RepositorioBusqueda repositorioBusqueda
    ){
        this.repositorioBusqueda = repositorioBusqueda;
    }

    public Optional<List<String>> buscarNombresPropiedades(){
        return Optional.of(repositorioBusqueda.obtenerNombresPropiedades());
    }
}
