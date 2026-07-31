# Ejercicio 07 — Repositorio CRUD sin genericos

## Enunciado
Crear un modelo `Factura`, una interface `FacturaRepositorio` con los metodos `listar()`, `porId(int id)`, `guardar(Factura)` y `eliminar(int id)`, y una implementacion `FacturaRepositorioImpl` que guarde las facturas en un `ArrayList`. Un `Main` que pruebe los cuatro metodos.

## Archivos
| Archivo | Descripcion |
|---|---|
| `Factura.java` | Modelo con `id`, `descripcion`, `importe`, getters y `toString()` |
| `FacturaRepositorio.java` | Interface con el contrato CRUD (sin genericos) |
| `FacturaRepositorioImpl.java` | Implementacion que guarda en un `ArrayList` |
| `Main.java` | Prueba guardar, listar, buscar por id y eliminar |

