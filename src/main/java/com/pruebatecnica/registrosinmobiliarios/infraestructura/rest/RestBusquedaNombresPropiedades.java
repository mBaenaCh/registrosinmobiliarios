package com.pruebatecnica.registrosinmobiliarios.infraestructura.rest;

import com.pruebatecnica.registrosinmobiliarios.aplicacion.manejadores.ManejadorConsultaNombrePropiedades;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/propiedades")
public class RestBusquedaNombresPropiedades {
    private final ManejadorConsultaNombrePropiedades manejadorConsultaNombrePropiedades;

    public RestBusquedaNombresPropiedades(ManejadorConsultaNombrePropiedades manejadorConsultaNombrePropiedades){
        this.manejadorConsultaNombrePropiedades = manejadorConsultaNombrePropiedades;
    }

    @GetMapping
    public ResponseEntity<List<String>> consultarPropiedades(){
        try{

            List<String> data = manejadorConsultaNombrePropiedades.buscarNombresPropiedades().get();
            if(data.isEmpty()){
                return ResponseEntity.status(HttpStatus.OK)
                        .body(Collections.emptyList());
            }
            return ResponseEntity.status(HttpStatus.OK)
                    .body(data.stream().distinct().collect(Collectors.toList()));

        }catch(Exception e){
            System.out.println("Error al obtener la lista de propiedades registradas - "+ e.getMessage());
            return ResponseEntity.ok(null);
        }
    }
}
