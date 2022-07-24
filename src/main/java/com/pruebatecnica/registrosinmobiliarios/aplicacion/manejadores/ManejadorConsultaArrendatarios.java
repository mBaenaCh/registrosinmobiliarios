package com.pruebatecnica.registrosinmobiliarios.aplicacion.manejadores;

import com.pruebatecnica.registrosinmobiliarios.dominio.modelo.Persona;
import com.pruebatecnica.registrosinmobiliarios.dominio.puerto.RepositorioBusqueda;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManejadorConsultaArrendatarios {

    private RepositorioBusqueda repositorioBusqueda;

    public ManejadorConsultaArrendatarios(RepositorioBusqueda repositorioBusqueda){
        this.repositorioBusqueda = repositorioBusqueda;
    }

    public List<Persona> obtenerArrendatariosPropiedad(String nombrePropiedad){
        return repositorioBusqueda.obtenerArrendatariosPropiedad(nombrePropiedad);
    }

}
