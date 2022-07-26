package com.pruebatecnica.registrosinmobiliarios.aplicacion.configuracion;

import com.pruebatecnica.registrosinmobiliarios.dominio.puerto.RepositorioBusqueda;
import com.pruebatecnica.registrosinmobiliarios.dominio.servicio.ServicioBusquedaNombresPropiedades;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioBusquedaNombresPropiedades {

    @Bean
    public ServicioBusquedaNombresPropiedades servicioBusquedaNombresPropiedades(RepositorioBusqueda repositorioBusqueda){
        return new ServicioBusquedaNombresPropiedades(repositorioBusqueda);
    }
}
