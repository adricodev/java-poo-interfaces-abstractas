# Java POO — Interfaces y Clases Abstractas

Proyecto de practica para aprender POO en Java, centrado en **clases abstractas**, **interfaces**, **herencia** y **polimorfismo**.

## Objetivo
Entender la abstraccion en Java antes de avanzar a Spring Boot.

## Progresion

| Ejercicio | Concepto | Estado |
|---|---|---|
| [Ejercicio 01](src/ejercicio01/README.md) | Clase abstracta con metodo abstracto | ✅ |
| [Ejercicio 02](src/ejercicio02/README.md) | Interface con metodos default y static | ✅ |
| [Ejercicio 03](src/ejercicio03/README.md) | Clase abstracta + interface combinadas | ✅ |
| [Ejercicio 04](src/ejercicio04/README.md) | Polimorfismo con interfaces | ✅ |
| [Ejercicio 05](src/ejercicio05/README.md) | Composicion de interfaces | ✅ |

## Estructura

```
src/
  ejercicio01/   - Clase abstracta (Figura, Circulo, Rectangulo)
  ejercicio02/   - Interface (Volador, Pajaro, Avion)
  ejercicio03/   - Abstracta + interface (MedioPago, Pagable, TarjetaCredito, Paypal)
  ejercicio04/   - Polimorfismo (reutiliza clases del 03 con casteo)
  ejercicio05/   - Composicion de interfaces (Encendible, Apagable, Reproducible)
```

## Como ejecutar

```bash
# Compilar todo
javac -d out src/ejercicio01/*.java src/ejercicio02/*.java src/ejercicio03/*.java src/ejercicio04/*.java src/ejercicio05/*.java

# Ejecutar cada ejercicio
java -cp out ejercicio01.Main
java -cp out ejercicio02.Main
java -cp out ejercicio03.Main
java -cp out ejercicio04.Main
java -cp out ejercicio05.Main
```

## Conceptos cubiertos
- Clases abstractas y metodos abstractos
- Interfaces: metodos abstractos, default, static
- Herencia con `extends` e implementacion con `implements`
- Polimorfismo contra interfaces
- Composicion de multiples interfaces
- `instanceof` y casteo
- Sobrescritura de metodos (`@Override`)
- Uso de `super()`

## Siguiente paso
Spring Boot usa interfaces para definir contratos de servicios y repositorios.
Programar contra abstracciones es la base del diseno en capas.
