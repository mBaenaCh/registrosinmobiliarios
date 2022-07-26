CREATE TABLE 'personas' (
	'id' varchar(255) NOT NULL,
	'nombres' varchar(50),
	'apellidos' varchar(60),
	'correo' varchar(60)
	PRIMARY KEY ('ID')

);

CREATE TABLE 'inmuebles' (
	'id' varchar(255) NOT NULL,
	'nombre' varchar(150),
	'direccion' varchar(150) NOT NULL,
	'persona_id', varchar(255) NOT NULL
	FOREIGN KEY ('persona_id') REFERENCES personas('id')
);


INSERT INTO `persona` (`id`, `nombre`, `apellidos`, `correo`) VALUES
('bfe188c9-acbf-403f-9f95-738414acfbcd',	'Mateo',	'Baena Chavarriaga',	'mateo.baena@hotmail.com'),
('636b1945-fdbe-45fe-8ede-2db8152e2f4c',	'Pepito',	'Perez',	'pepipebe@hotmail.com'),
('8f893531-5d0a-48a9-8c95-1c09a0e36041',	'benjamin',	'mohicano',	'benjmohe@hotmail.com'),
('612bdce2-8c67-4c45-b338-76f4e05fab5a',	'Pedro',	'Vevi',	'pedrvevi@hotmail.com');

INSERT INTO `propiedades` (`id_propiedad`, `nombre_propiedad`, `direccion`, `id_persona`) VALUES
('1b231844-8488-4611-a16b-7ed62a65aead',	'Flores del Castillo, casa 003',	'Carrera 20B #47 - 110',	'612bdce2-8c67-4c45-b338-76f4e05fab5a'),
('676510f8-db93-4878-b23c-04be195a3403',	'Torres de Mayorca Apto 1804',	'Carrera 47 #52 sur - 110',	'636b1945-fdbe-45fe-8ede-2db8152e2f4c'),
('91f0e4cc-0786-400b-a27f-f0609bed4395',	'Edificio Villa Gabriela',	'Carrera 43A #57 sur - 15',	'8f893531-5d0a-48a9-8c95-1c09a0e36041'),
('a6e7a311-45ca-48f3-96d9-09e60c2fd3ec',	'Torres de Mayorca Apto 1804',	'Carrera 47 #52 sur - 110',	'bfe188c9-acbf-403f-9f95-738414acfbcd');