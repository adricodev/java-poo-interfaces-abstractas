package ejercicio10.interfaces;

import ejercicio10.modelo.Libro;

import java.util.List;

public interface LibroRepositorioCrud {
    List<Libro> listar();
    Libro porId(int id);
    void guardar(Libro libro);
    void actualizar(Libro libro);
    void eliminar(int id);

}
