# Goal Scorers

Goal Scorers es una aplicación desarrollada en Java cuyo objetivo es analizar resultados de partidos de fútbol a partir de un archivo CSV. A partir de estos datos, el programa permite obtener estadísticas básicas como victorias, empates, derrotas y goles marcados por cada selección.

## Estado del proyecto
```
Lectura de CSV | Completado
Clases modelo (Partido, Seleccion) | Completado
Logica para las estadísticas | Completado
Interfaces graficas | Pendiente
Pruebas unitarias | Completado
Integracion con SonarCloud | Completado
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
- Java 21 o superior
- Maven 3.9.0 o superior
- Git (si vas a clonar el repositorio)

#### Clonar el repositorio
Abre la consola (CMD o PowerShell) y escribe:
git clone https://github.com/LaMendez006/Goalscorers.git

Entra a la carpeta del proyecto con:
cd GoalScorers

#### Ejecutar la aplicación
Para iniciar el programa, usa:
mvn exec:java

#### Uso de la aplicación
Al iniciar, verás un menú con dos opciones:
- Tabla de Resultados: muestra todos los partidos del CSV en forma de tabla.
- Estadísticas por Selección: permite escribir el nombre de una selección y ver sus victorias, empates, derrotas y goles a favor.

#### Archivo CSV
El archivo results.csv ya está incluido en la carpeta src/main/resources.
La aplicación lo carga automáticamente.
Si quieres usar otro archivo, reemplaza ese CSV por uno nuevo con el mismo formato.

## Formato del CSV

### results.csv
```
fecha, equipo_local, equipo_visitante, puntuacion_local, puntuacion_visitante, torneo, ciudad, pais, neutral
1872-11-30, Scotland, England, 0, 0, Friendly, Glasgow, Scotland, FALSE
1873-03-08, England, Scotland, 4, 2, Friendly, London, England, FALSE
1874-03-07, Scotland, England, 2, 1, Friendly, Glasgow, Scotland, FALSE
1875-03-06, England, Scotland, 2, 2, Friendly, London, England, FALSE
```

## Proximas mejoras

- Implementación de interfaz gráfica con Swing

## Autores
```
pongan su nombre aca
Alejandro Diaz
Oswaldo Daza
Taller final - Programación Orientada a Objetos
```
