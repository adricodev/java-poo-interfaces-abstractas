# Ejercicio 02 — Interface con default y static

## Concepto
Interface con metodos `abstract`, `default` y `static`.

## Enunciado
Crear una interface `Volador` con:
- Metodo abstracto `volar()`
- Metodo `default` `aterrizar()` que imprime "Aterrizando..."
- Metodo `static` `tipo()` que devuelve "Soy un volador"

Crear dos clases `Pajaro` y `Avion` que implementen `Volador`.

## Archivos

| Archivo | Descripcion |
|---|---|
| `Volador.java` | Interface con `volar()` abstracto, `aterrizar()` default, `tipo()` static |
| `Pajaro.java` | Implementa `Volador`, solo sobrescribe `volar()` |
| `Avion.java` | Implementa `Volador`, solo sobrescribe `volar()` |
| `Main.java` | Prueba de todas las implementaciones |

## Lo que practica
- Declaracion de interface
- Metodo `abstract` en interface (no necesita la palabra `abstract`, es implicito)
- Metodo `default` con cuerpo, herencia automatica
- Metodo `static` en interface, llamado con `Volador.tipo()`
- `implements` en lugar de `extends`
- Las clases no estan obligadas a sobrescribir metodos `default`

## Preguntas clave
- Cual es la diferencia entre metodo `default` y `abstract` en una interface?
- Puede una clase sobrescribir un metodo `default` si quiere?
- Como se llama un metodo `static` de una interface?
- Una interface puede tener constructores?
