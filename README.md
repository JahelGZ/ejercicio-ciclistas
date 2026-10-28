## Integrantes
- Jahel Alejandro Gutierrez Enriquez
- Alejandro Mosquera Corrales

## Descripción
Programa en Java que representa un equipo de ciclismo conformado por velocistas, escaladores y contrarrelojistas. Cada ciclista tiene un identificador, un nombre, un tiempo acumulado de carrera y atributos propios de su especialidad.

El programa permite agregar ciclistas al equipo, listar sus nombres, calcular el tiempo total de carrera y consultar sus datos mediante un identificador ingresado por consola. El ejercicio aplica herencia, encapsulamiento, clases abstractas y polimorfismo para organizar los distintos tipos de ciclistas.

## Clases
- **Ciclista:** clase abstracta que reúne los datos comunes y define el método para identificar la especialidad.
- **Velocista:** agrega la potencia promedio y la velocidad promedio en sprint.
- **Escalador:** agrega la aceleración promedio en subida y el grado de rampa soportado.
- **Contrarrelojista:** agrega la velocidad máxima.
- **Equipo:** agrupa los ciclistas, suma sus tiempos y permite consultar sus datos.
- **Main:** crea un equipo con datos de ejemplo y permite buscar un ciclista desde la consola.
