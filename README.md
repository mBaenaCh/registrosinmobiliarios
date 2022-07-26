# Registros inmobiliarios

Proyecto en springboot, con Java 11, que define una API REST para la definicion de servicios que permiten consultar listas de las propiedades guardadas en la base de datos.

Se define un archivo `docker-compose.yml` para definir un componente de base de datos local MySQL y un gestor de base de datos con Adminer. Este archivo define ademas una base de datos por defecto llamada `inmobiliapp`.

Se adjunta un archivo .sql que define la estructura de base de datos, en base al siguiente modelo entidad relacion:

![Modelo entidad relacion](https://i.imgur.com/XbuRVkI.png)

## Estructura proyecto

La cual intenta seguir una arquitectura hexagonal. Orientada al dominio y que permita abstraer ese modelo del dominio a una implmentacion en otras tecnologias o con el uso de otros frameworks o con la conexion a otros motores de bases de datos.

![Arquitectura implementada](https://i.imgur.com/JY24hUJ.png)

```text
registrosinmobiliarios
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


## 
