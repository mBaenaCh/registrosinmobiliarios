package com.pruebatecnica.registrosinmobiliarios.configuracion.jackson.codecs;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.pruebatecnica.registrosinmobiliarios.dominio.modelo.Id;

import java.io.IOException;

public class IdParser {

    public static class Serializer extends JsonSerializer<Id>{

        @Override
        public void serialize(Id value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString(value.toString());
        }
    }

    public static class Deserializer extends JsonDeserializer<Id>{

        @Override
        public Id deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
            return Id.generarIdConString(p.getValueAsString());
        }
    }
}
