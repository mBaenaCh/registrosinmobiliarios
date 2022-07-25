package com.pruebatecnica.registrosinmobiliarios.dominio.puerto;

import com.pruebatecnica.registrosinmobiliarios.dominio.modelo.Persona;

import java.util.List;

public interface RepositorioBusqueda {

    List<Persona> obtenerArrendatariosPropiedad(String nombrePropiedad);
    List<Persona> obtenerTodosLosArrendatarios();
}
