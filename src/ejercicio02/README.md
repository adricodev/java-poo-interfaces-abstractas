# Ejercicio 02 — Interface con default y static

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

