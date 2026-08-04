# Ejercicio 10 — Repositorio de Libro con CRUD y subpaquetes

## Enunciado
Crear un modelo `Libro` (id automatico, autor, precio) con setters, una interface `LibroRepositorioCrud` con `listar()`, `porId(int id)`, `guardar(Libro)`, `actualizar(Libro)` y `eliminar(int id)`, y una implementacion `LibroRepoImpl` que guarde los libros en un `ArrayList`. Un `Main` que pruebe los cinco metodos.

## Enunciado extra
A partir de este ejercicio se adopta un sistema de subpaquetes para organizar el codigo por capas:

| Subpaquete | Contenido |
|---|---|
| `modelo` | Clases de dominio (datos) |
| `interfaces` | Interfaces / contratos |
| `implementacion` | Clases que implementan los contratos |

## Archivos
| Archivo | Descripcion |
|---|---|
| `modelo/Libro.java` | Modelo con id automatico (contador `static`), setters, getters y `toString()` |
| `interfaces/LibroRepositorioCrud.java` | Interface con el contrato CRUD completo |
| `implementacion/LibroRepoImpl.java` | Implementacion que guarda en un `ArrayList` |
| `Main.java` | Prueba los cinco metodos del CRUD |