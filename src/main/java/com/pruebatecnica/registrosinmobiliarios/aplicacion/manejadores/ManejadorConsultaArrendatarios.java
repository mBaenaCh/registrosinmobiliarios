package com.pruebatecnica.registrosinmobiliarios.aplicacion.manejadores;

import com.pruebatecnica.registrosinmobiliarios.dominio.modelo.Persona;
import com.pruebatecnica.registrosinmobiliarios.dominio.servicio.ServicioBusquedaArrendatarios;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Optional;

@Component
public class ManejadorConsultaArrendatarios {

    private final ServicioBusquedaArrendatarios servicioBusquedaArrendatarios;

    public ManejadorConsultaArrendatarios(ServicioBusquedaArrendatarios servicioBusquedaArrendatarios){
        this.servicioBusquedaArrendatarios = servicioBusquedaArrendatarios;
    }

    public Optional<List<Persona>> buscarArrendatarios(String nombrePropiedad){
        return servicioBusquedaArrendatarios.buscarArrendatarios(nombrePropiedad);
    }


}
