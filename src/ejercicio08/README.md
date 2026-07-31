# Ejercicio 08 — Repositorio de Cliente con id automatico

## Enunciado
Crear un modelo `Cliente` (id, nombre, email) con id generado automaticamente mediante un contador `static`, una interface `ClienteRepositorio` con `listar()`, `porId(int id)`, `guardar(Cliente)` y `eliminar(int id)`, y una implementacion `ClienteRepoImpl` que guarde los clientes en un `ArrayList`. Un `Main` que pruebe los cuatro metodos.

## Archivos
| Archivo | Descripcion |
|---|---|
| `Cliente.java` | Modelo con id automatico (contador `static`), getters y `toString()` |
| `ClienteRepositorio.java` | Interface con el contrato CRUD (sin genericos) |
| `ClienteRepoImpl.java` | Implementacion que guarda en un `ArrayList` |
| `Main.java` | Prueba guardar, listar, buscar por id y eliminar |
