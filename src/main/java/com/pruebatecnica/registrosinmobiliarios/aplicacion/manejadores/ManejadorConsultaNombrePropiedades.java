package com.pruebatecnica.registrosinmobiliarios.aplicacion.manejadores;

import com.pruebatecnica.registrosinmobiliarios.dominio.servicio.ServicioBusquedaNombresPropiedades;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ManejadorConsultaNombrePropiedades {
    private ServicioBusquedaNombresPropiedades servicioBusquedaNombresPropiedades;

    public ManejadorConsultaNombrePropiedades(ServicioBusquedaNombresPropiedades servicioBusquedaNombresPropiedades){
        this.servicioBusquedaNombresPropiedades = servicioBusquedaNombresPropiedades;
    }

    public Optional<List<String>> buscarNombresPropiedades(){
        return servicioBusquedaNombresPropiedades.buscarNombresPropiedades();
    }
}
