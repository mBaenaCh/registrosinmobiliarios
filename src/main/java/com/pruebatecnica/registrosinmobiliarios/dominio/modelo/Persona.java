package com.pruebatecnica.registrosinmobiliarios.dominio.modelo;

import java.util.List;

public class Persona {

    private Id id;
    private String nombre;
    private String apellidos;
    private String correo;
    private List<Propiedad> historialPropiedades;

    public Persona() {
    }

    public Persona(Id id, String nombre, String apellidos, String correo, List<Propiedad> historialPropiedades) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.historialPropiedades = historialPropiedades;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
