package com.pruebatecnica.registrosinmobiliarios.configuracion.jackson;


import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.pruebatecnica.registrosinmobiliarios.configuracion.jackson.codecs.IdParser;
import com.pruebatecnica.registrosinmobiliarios.dominio.modelo.Id;

public class InternalModule  extends SimpleModule {
    private static final String NAME = "InternalModule";

    public InternalModule(){
        super(NAME, Version.unknownVersion());

        addSerializer(Id.class, new IdParser.Serializer());
        addDeserializer(Id.class, new IdParser.Deserializer());
    }
}
