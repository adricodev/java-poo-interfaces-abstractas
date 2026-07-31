# Ejercicios de POO Interfaces, clases abstractas y interfaces repositorio

Ejercicios de Java que voy haciendo mientras aprendo programación orientada a objetos, centrados en **clases abstractas**, **interfaces** y **repositorios**.

## Descripción breve

Estoy estudiando Desarrollo de Aplicaciones Web (DAW) y este repositorio es donde voy guardando los ejercicios de POO que hago por mi cuenta. No son proyectos grandes, sino prácticas pequeñas para entender cada concepto poco a poco.

## Objetivo

Quiero tener una base decente de Java antes de orientarme al backend, sobre todo a Spring Boot. Por eso el repositorio gira en torno a tres pilares: las clases abstractas, las interfaces y los repositorios. Son los conceptos que más se usan a la hora de organizar el código de una aplicación real.

## Conceptos que practico

Los ejercicios actuales cubren:

- Clases abstractas y métodos abstractos
- Interfaces (métodos abstractos, `default` y `static`)
- Herencia
- Polimorfismo
- Composición de interfaces
- Sobrescritura de métodos (`@Override`)
- Uso de `super`
- `instanceof` y casteo de tipos
- Repositorios CRUD
- Colecciones (`ArrayList`)
- Programar contra interfaces


## Herramientas

- **Java**
- **IntelliJ IDEA** para escribir y ejecutar el código
- **Git y GitHub** para practicar control de versiones

## Estructura del proyecto

```
src/
  ejercicio01/   - Clase abstracta (Figura, Circulo, Rectangulo)
  ejercicio02/   - Interface (Volador, Pajaro, Avion)
  ejercicio03/   - Abstracta + interface (MedioPago, Pagable, TarjetaCredito, Paypal)
  ejercicio04/   - Polimorfismo con interfaces
  ejercicio05/   - Composición de interfaces (Encendible, Apagable, Reproducible)
  ejercicio06/   - Interface de notificaciones (CanalNotificacion)
  ejercicio07/   - Repositorio CRUD sin genericos (FacturaRepositorio)
```

Cada carpeta lleva su propio `README.md` con el planteamiento del ejercicio.

## Ejercicios

| Ejercicio | Descripción |
|---|---|
| [Ejercicio 01](src/ejercicio01/README.md) | Crear una clase abstracta `Figura` con método abstracto `calcularArea()`. Implementar `Circulo` y `Rectangulo`. |
| [Ejercicio 02](src/ejercicio02/README.md) | Crear una interface `Volador` con métodos `abstract`, `default` y `static`. Implementar `Pajaro` y `Avion`. |
| [Ejercicio 03](src/ejercicio03/README.md) | Modelar un sistema de pagos combinando clase abstracta `MedioPago` e interface `Pagable`. |
| [Ejercicio 04](src/ejercicio04/README.md) | Crear un método `procesarPago(Pagable)` que funcione con cualquier medio de pago. |
| [Ejercicio 05](src/ejercicio05/README.md) | Crear interfaces `Encendible`, `Apagable`, `Reproducible` y usar `instanceof` para comportamiento condicional. |
| [Ejercicio 06](src/ejercicio06/README.md) | Crear una interface `CanalNotificacion` e implementarla en `NotificacionEmail` y `NotificacionSMS`. |
| [Ejercicio 07](src/ejercicio07/README.md) | Crear un repositorio CRUD `FacturaRepositorio` con interface, implementacion y Main, sin genericos. |

Iré añadiendo más ejercicios según los vaya haciendo.

## Cómo lo estoy aprendiendo

Estos ejercicios son parte de mi proceso de aprendizaje, no proyectos acabados. Los hago pequeños a propósito: prefiero entender bien un concepto antes de pasar al siguiente. A veces me apoyo en herramientas como OpenCode para revisar conceptos o que me corrijan el código, pero intento resolver la mayoría yo mismo.
