# Ejercicio 05 — Composicion de interfaces

## Enunciado
Crear las interfaces `Encendible`, `Apagable` y `Reproducible`. `Televisor` implementa `Encendible` y `Apagable`. `EquipoSonido` implementa las tres. En el Main, crear un metodo `encenderYUsar(Encendible e)` que encienda y, si es `Reproducible`, tambien reproduzca usando `instanceof`.

## Archivos
| Archivo | Descripcion |
|---|---|
| `Encendible.java` | Interface con `encender()` |
| `Apagable.java` | Interface con `apagar()` |
| `Reproducible.java` | Interface con `reproducir()` |
| `Televisor.java` | Implementa `Encendible`, `Apagable` |
| `EquipoSonido.java` | Implementa `Encendible`, `Apagable`, `Reproducible` |
| `Main.java` | Metodo `encenderYUsar()` con `instanceof` |

## Clave del ejercicio
- Una clase implementa varias interfaces separadas por comas
- `instanceof` permite preguntar por el tipo en tiempo de ejecucion
- Interfaces pequenas y especificas (Interface Segregation) frente a una unica interface grande

