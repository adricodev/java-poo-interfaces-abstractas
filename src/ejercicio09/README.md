# Ejercicio 09 — Repositorio con CRUD completo (incluye actualizar)

## Enunciado
Crear un modelo `Producto` (id automatico, nombre, precio, stock) con setters, una interface `ProductoRepositorio` con `listar()`, `porId(int id)`, `guardar(Producto)`, `actualizar(Producto)` y `eliminar(int id)`, y una implementacion `ProductoRepoImpl` que guarde los productos en un `ArrayList`. Un `Main` que pruebe los cinco metodos.

## Archivos
| Archivo | Descripcion |
|---|---|
| `Producto.java` | Modelo con id automatico (contador `static`), setters, getters y `toString()` |
| `ProductoRepositorio.java` | Interface con el contrato CRUD completo (incluye `actualizar`) |
| `ProductoRepoImpl.java` | Implementacion que guarda en un `ArrayList` |
| `Main.java` | Prueba guardar, listar, actualizar y buscar por id |
