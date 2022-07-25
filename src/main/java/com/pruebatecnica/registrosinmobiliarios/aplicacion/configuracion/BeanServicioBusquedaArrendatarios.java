package com.pruebatecnica.registrosinmobiliarios.aplicacion.configuracion;

import com.pruebatecnica.registrosinmobiliarios.dominio.puerto.RepositorioBusqueda;
import com.pruebatecnica.registrosinmobiliarios.dominio.servicio.ServicioBusquedaArrendatarios;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioBusquedaArrendatarios {

    @Bean
    public ServicioBusquedaArrendatarios servicioBusquedaArrendatarios(RepositorioBusqueda repositorioBusqueda){
        return new ServicioBusquedaArrendatarios(repositorioBusqueda);
    }
}
