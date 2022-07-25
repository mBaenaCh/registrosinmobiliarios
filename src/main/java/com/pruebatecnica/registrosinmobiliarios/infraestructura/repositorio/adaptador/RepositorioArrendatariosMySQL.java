package com.pruebatecnica.registrosinmobiliarios.infraestructura.repositorio.adaptador;

import com.pruebatecnica.registrosinmobiliarios.dominio.modelo.Id;
import com.pruebatecnica.registrosinmobiliarios.dominio.modelo.Persona;
import com.pruebatecnica.registrosinmobiliarios.dominio.modelo.Propiedad;
import com.pruebatecnica.registrosinmobiliarios.dominio.puerto.RepositorioBusqueda;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class RepositorioArrendatariosMySQL implements RepositorioBusqueda {

    private static final String QUERY_HISTORIAL_PROPIEDADES_ARRENDATARIO =
            "SELECT id_propiedad, nombre_propiedad, direccion, id_persona " +
                    "FROM propiedades " +
                    "INNER JOIN persona " +
                    "ON propiedades.id_persona = persona.id";


    private static final String QUERY_HISTORIAL_ARRENDATARIOS_PROPIEDAD =
            "SELECT id, nombre, apellidos, correo " +
                    "FROM propiedades " +
                    "INNER JOIN persona " +
                    "ON propiedades.id_persona = persona.id " +
                    "WHERE nombre_propiedad = ?";

    private final JdbcTemplate jdbcTemplate;

    //TODO Implementacion rowmappers externa
    private final RowMapper<Persona> arrendatarioRowMapper = (resultSet, rowNum) -> {
        Id id = Id.generarIdConString(resultSet.getString("id"));
        String nombre = resultSet.getString("nombre");
        String apellidos = resultSet.getString("apellidos");
        String correo = resultSet.getString("correo");
        List<Propiedad> historialPropiedades = obtenerHistorialPropiedadesUsuario();
        return new Persona(
                id,
                nombre,
                apellidos,
                correo,
                historialPropiedades
        );
    };

    private final RowMapper<Propiedad> propiedadRowMapper = (resultSet, rowNum) -> {
        Id id = Id.generarIdConString(resultSet.getString("id_propiedad"));
        String nombre = resultSet.getString("nombre_propiedad");
        String direccion = resultSet.getString("direccion");
        Id idArrendatario = Id.generarIdConString(resultSet.getString("id_persona"));

        return new Propiedad(
                id,
                nombre,
                direccion,
                idArrendatario
        );
    };

    public RepositorioArrendatariosMySQL(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    private List<Propiedad> obtenerHistorialPropiedadesUsuario(){
        return jdbcTemplate.query(QUERY_HISTORIAL_PROPIEDADES_ARRENDATARIO, propiedadRowMapper);
    }

    public List<Persona> obtenerArrendatariosPropiedad(String nombrePropiedad){
        return jdbcTemplate.query(QUERY_HISTORIAL_ARRENDATARIOS_PROPIEDAD, arrendatarioRowMapper, nombrePropiedad);
    }

}
