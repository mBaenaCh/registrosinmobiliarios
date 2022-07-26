# registrosinmobiliarios

## Estructura proyecto

```text
Marketplace
└───configuracion       Definiciones de beans de configuracion de base de datos, CORS y parseo entidades
│   └───jackson         parseo de clases para su serializacion y deserializacion segun nuestro gusto
│  
|
└───dominio             modelo del dominio
|   └───modelo          entidades asociadas al dominio
|   └───servicios       definicion de funcionalidades
|   └───puerto          puerto para definir implementaciones puntuales
|       
│   
└───aplicacion          Intermediario entre el dominio y sus implementaciones puntuales en infraestructura
│   └───configuracion   definicion de beans de configuracion para la inyeccion de dependencias en los manejadores
|   └───manejadores     
|
|
└───infraestructura     implementaciones puntuales de funcionalidades definidas en el dominio
    └───repositorio     definicion de funcionalidades asociadas al consumo a la base de datos
        └───adaptador   
    └───rest            definicion de servicios REST
│   
└───repository          intermediary class to handle the database connections
```

## REST API

### Servicios expuestos

| Method     | Endpoint | Description     |
| :----:        | :----:   |:---- |
| GET      | /api/propiedades/       | Obtener el nombre de todas las propiedades registradas   |
| GET   | /api/arrendatarios/:nombre        | Obtener arrendatarios asociados al nombre de una propiedad      |

