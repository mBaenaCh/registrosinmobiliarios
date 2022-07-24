package com.pruebatecnica.registrosinmobiliarios.dominio.modelo;

import java.time.LocalDateTime;

public class Propiedad {
    private Id id;
    private String nombre;
    private String direccion;
    private Id idArrendador;

    public Propiedad() {
    }

    public Propiedad(Id id, String nombre, String direccion, Id idArrendador) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.idArrendador = idArrendador;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Id getIdArrendador() {
        return idArrendador;
    }

    public void setIdArrendador(Id idArrendador) {
        this.idArrendador = idArrendador;
    }
}
