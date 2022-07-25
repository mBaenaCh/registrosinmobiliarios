package com.pruebatecnica.registrosinmobiliarios.infraestructura.rest;

import com.pruebatecnica.registrosinmobiliarios.aplicacion.manejadores.ManejadorConsultaArrendatarios;
import com.pruebatecnica.registrosinmobiliarios.dominio.modelo.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/api/arrendatarios")
public class RestBusquerdaArrendatarios {

    private final ManejadorConsultaArrendatarios manejadorConsultaArrendatarios;

    public RestBusquerdaArrendatarios(
            ManejadorConsultaArrendatarios manejadorConsultaArrendatarios
    ){
        this.manejadorConsultaArrendatarios = manejadorConsultaArrendatarios;
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<List<Persona>> consultarArrendatarios(
            @PathVariable("nombre") String nombrePropiedad){
        try{
            if(manejadorConsultaArrendatarios.buscarArrendatarios(nombrePropiedad).isEmpty()){
                return ResponseEntity.status(HttpStatus.OK)
                        .body(Collections.emptyList());
            }
            return ResponseEntity.status(HttpStatus.OK)
                    .body(manejadorConsultaArrendatarios.buscarArrendatarios(nombrePropiedad).get());

        } catch (Exception e){
            System.out.println("Error al obtener la lista de personas asociadas a la propiedad - "+ e.getMessage());
            return ResponseEntity.ok(null);
        }
    }

}
