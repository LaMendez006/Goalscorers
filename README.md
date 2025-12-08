# Goal Scorers

Aplicación desarrollada en Java que analiza los resultados de partidos de futbol desde un CSV para obtener estadisticas básicas.

# Estado del proyecto
```
Lectura de CSV | Completado
Clases modelo (Partido, Seleccion) | Completado
Logica para las estadísticas | Completado
Interfaces graficasn | Pendiente
Pruebas unitarias | Pendiente
Integracion con SonarCloud | Pendiente
```
# Caracteristicas principales

- Carga de un archivo CSV con datos de partidos
- Cálculo de:
 - Partidos ganados, empatados y perdidos
 - Goles marcados
- Busqueda de selecciones por nombre
- Logica organizada en paquetes

# Estructura del Proyecto
```
GoalScorers:.
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
