# Ejercicio 01 — Clase abstracta

## Concepto
Clase abstracta con método abstracto.

## Enunciado
Crear una clase abstracta `Figura` con un atributo `color` y un método abstracto `calcularArea()`.
Crear dos subclases concretas `Circulo` y `Rectangulo` que implementen `calcularArea()`.

## Archivos

| Archivo | Descripcion |
|---|---|
| `Figura.java` | Clase abstracta con `color` y `calcularArea()` abstracto |
| `Circulo.java` | Hereda de `Figura`, implementa `calcularArea()` con PI * r^2 |
| `Rectangulo.java` | Hereda de `Figura`, implementa `calcularArea()` con base * altura |
| `Main.java` | Prueba con polimorfismo |

## Lo que practica
- Declaracion de clase abstracta
- Metodo abstracto y su implementacion en subclases
- Uso de `super()` para llamar al constructor padre
- Sobrescritura de `toString()`
- Polimorfismo: una variable `Figura` puede referirse a `Circulo` o `Rectangulo`

## Preguntas clave
- Por que `Figura` no puede instanciarse directamente?
- Que pasa si una subclase no implementa `calcularArea()`?
- Donde se usa el polimorfismo en el Main?
