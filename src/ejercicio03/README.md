# Ejercicio 03 — Clase abstracta + Interface

## Enunciado
Modelar un sistema de pagos con una clase abstracta `MedioPago` (atributo `saldo`, metodo concreto `consultarSaldo()`) y una interface `Pagable` (metodo `pagar(double monto)`). `TarjetaCredito` y `Paypal` heredan de `MedioPago` e implementan `Pagable`.

## Archivos
| Archivo | Descripcion |
|---|---|
| `MedioPago.java` | Clase abstracta con `saldo` y `consultarSaldo()` concreto |
| `Pagable.java` | Interface con `pagar()` abstracto |
| `TarjetaCredito.java` | Extiende `MedioPago`, implementa `Pagable` |
| `Paypal.java` | Extiende `MedioPago`, implementa `Pagable` |
| `Main.java` | Crea ambos medios de pago y prueba pagos |

## Clave del ejercicio
- El **estado** (`saldo`) va en la clase abstracta (compartido)
- El **contrato** (`pagar()`) va en la interface (cada uno lo implementa distinto)
- Los metodos concretos de la abstracta se heredan, no hace falta redefinirlos

