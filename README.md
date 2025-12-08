# Goal Scorers

Aplicación desarrollada en Java que analiza los resultados de partidos de futbol desde un CSV para obtener estadisticas básicas.

## Estado del proyecto
```
Lectura de CSV | Completado
Clases modelo (Partido, Seleccion) | Completado
Logica para las estadísticas | Completado
Interfaces graficas | Pendiente
Pruebas unitarias | Pendiente
Integracion con SonarCloud | Pendiente
```
## Caracteristicas principales

- Carga de un archivo CSV con datos de partidos
- Cálculo de:
 - Partidos ganados, empatados y perdidos
 - Goles marcados
- Busqueda de selecciones por nombre
- Logica organizada en paquetes

## Estructura del Proyecto
```
GoalScorers:
│   .gitignore
│   nbactions.xml
│   pom.xml
│   README.md
│
└───src
    ├───main
    │   ├───java
    │   │   └───com
    │   │       └───goalscorers
    │   │           ├───logica
    │   │           │       .gitkeep
    │   │           │       Analizador.java
    │   │           │       DatosCargados.java
    │   │           │
    │   │           ├───modelos
    │   │           │       .gitkeep
    │   │           │       Partido.java
    │   │           │       ResultadoPartido.java
    │   │           │       Seleccion.java
    │   │           │
    │   │           ├───ui
    │   │           │       .gitkeep
    │   │           │
    │   │           └───util
    │   │                   .gitkeep
    │   │                   GestorArchivos.java
    │   │                   Main.java
    │   │
    │   └───resources
    │           application.properties
    │           data.sql
    │           results.csv
    │
    └───test
        └───java
```
## ¿Cómo ejecutar el proyecto?

### Requisitos
- Java (ahorita busco la version)
- Maven (ahorita busco la version)

### Cuando estén las interfaces coloco esta parte

## Formato del CSV

### results.csv
fecha, equipo_local, equipo_visitante, puntuacion_local, puntuacion_visitante, torneo, ciudad, pais, neutral
1872-11-30, Scotland, England, 0, 0, Friendly, Glasgow, Scotland, FALSE
1873-03-08, England, Scotland, 4, 2, Friendly, London, England, FALSE
1874-03-07, Scotland, England, 2, 1, Friendly, Glasgow, Scotland, FALSE
1875-03-06, England, Scotland, 2, 2, Friendly, London, England, FALSE

## Ejemplos de uso

tambien hago esta parte cuando esten las interfaces

## Proximas mejoras

- Implementación de interfaz gráfica con Swing
- Pruebas unitarias con JUnit
- Integración con SonarCloud

## Autores
```
pongan su nombre aca
pongan su nombre aca
Oswaldo Daza
Taller final - Programación Orientada a Objetos
```
