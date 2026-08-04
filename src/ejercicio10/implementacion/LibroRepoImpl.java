package ejercicio10.implementacion;

import ejercicio10.interfaces.LibroRepositorioCrud;
import ejercicio10.modelo.Libro;

import java.util.ArrayList;
import java.util.List;

public class LibroRepoImpl implements LibroRepositorioCrud {
    private List<Libro> libros = new ArrayList<>();
    @Override
    public List<Libro> listar() {
        return libros;
    }

    @Override
    public Libro porId(int id) {
        for(Libro libro : libros){
            if(libro.getId() == id)
                return libro;
        }
        return null;
    }


    @Override
    public void guardar(Libro libro) {
        libros.add(libro);

    }

    @Override
    public void actualizar(Libro libro) {
        Libro guardado = porId(libro.getId());
        if(guardado != null){
            guardado.setAutor(libro.getAutor());
            guardado.setPrecio(libro.getPrecio());
        }
    }

    @Override
    public void eliminar(int id) {
        libros.remove(porId(id));
    }
}
