# Java POO — Interfaces y Clases Abstractas

Proyecto de practica para aprender los fundamentos de la programacion orientada a objetos en Java,
centrado en **clases abstractas**, **interfaces**, **herencia** y **polimorfismo**.

## Objetivo
Entender la abstraccion en Java antes de avanzar a Spring Boot.
Cada ejercicio es incremental y se enfoca en un concepto especifico.

## Progresion

| Ejercicio | Concepto | Estado |
|---|---|---|
| [Ejercicio 01](src/ejercicio01/README.md) | Clase abstracta con metodo abstracto | ✅ |
| [Ejercicio 02](src/ejercicio02/README.md) | Interface con metodos default y static | ✅ |
| Ejercicio 03 | Clase abstracta + interface combinadas | ⬜ |
| Ejercicio 04 | Polimorfismo con interfaces | ⬜ |
| Ejercicio 05 | Composicion de interfaces | ⬜ |

## Estructura del proyecto

```
src/
  ejercicio01/     - Clase abstracta (Figura, Circulo, Rectangulo)
  ejercicio02/     - Interface (Volador, Pajaro, Avion)
```

## Como ejecutar

```bash
# Compilar todo
javac -d out src/ejercicio01/*.java src/ejercicio02/*.java

# Ejecutar ejercicio 01
java -cp out ejercicio01.Main

# Ejecutar ejercicio 02
java -cp out ejercicio02.Main
```

## Conceptos cubiertos
- Clases abstractas y metodos abstractos
- Interfaces: metodos abstractos, default, static
- Herencia con `extends`
- Implementacion con `implements`
- Polimorfismo
- Sobrescritura de metodos (`@Override`)
- Uso de `super()`

## Siguiente paso
Spring Boot usa intensivamente interfaces para definir contratos de servicios
y repositorios. Programar contra abstracciones (interfaces/clases abstractas)
es la base del diseno en capas de las aplicaciones Spring.
