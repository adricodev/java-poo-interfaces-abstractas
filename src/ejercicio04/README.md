# Ejercicio 04 — Polimorfismo con interfaces

## Enunciado
Reutilizando las clases del ejercicio 03, crear un metodo estatico `procesarPago(Pagable medio, double monto)` que acepte cualquier `Pagable`, pague y consulte saldo usando casteo a `MedioPago`.

## Archivos
| Archivo | Descripcion |
|---|---|
| `Pagable.java` | Interface con `pagar()` (copiada del 03) |
| `MedioPago.java` | Clase abstracta con `saldo` y `consultarSaldo()` (copiada del 03) |
| `TarjetaCredito.java` | Igual que en 03 |
| `Paypal.java` | Igual que en 03 |
| `Main.java` | Metodo `procesarPago()` que programa contra la interface y castea a `MedioPago` |


