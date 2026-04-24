package com.example.bibliotecaduoc.service;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;
// Antes (con ArrayList)
//libroRepository.obtenerLibros();

// Después (con JPA)
//libroRepository.findAll();   es casi lo mismo pero se pone save en lugar de findAll


    public List<Libro> getLibros() {
       // return libroRepository.obtenerLibros();
       return libroRepository.findAll();
    }

    public Libro saveLibro(Libro libro) {
       // return libroRepository.guardar(libro);
         return libroRepository.save(libro);
    }

    public Libro getLibroId(int id) {
         // return libroRepository.buscarPorId(id);
        return libroRepository.findById(id).orElse(null);
    }

    public Libro updateLibro(Libro libro) {
// return libroRepository.actualizar(libro);
         return libroRepository.save(libro);
    }

    public String deleteLibro(int id) {
        //libroRepository.eliminar(id);
        libroRepository.deleteById(id);
        return "producto eliminado";
    }

    // LA ACCIÓN LA HACE EL SERVICE
    public int totalLibros() {
        //return libroRepository.obtenerLibros().size();
        return(int) libroRepository.count();
    }

    // LA ACCIÓN LA HACE EL MODELO
    public int totalLibrosV2() {
        //return libroRepository.totalLibros();
        return(int)libroRepository .count();


    }

public List<Libro> getPorAutor(String autor) {
    return libroRepository.findByAutorContainingIgnoreCase(autor);
}
 

    }

