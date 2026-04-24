package com.example.bibliotecaduoc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "libros")
public class Libro {

  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "isbn", nullable = false, length = 20)
    private String isbn;

     @Column(name = "titulo", nullable = false, length = 20)
    private String titulo;
     @Column(name = "editorial", nullable = false, length = 20)
    private String editorial;
     @Column(name = "fecha_publicacion", nullable = false, length = 20)
    private String fechaPublicacion;
     @Column(name = "autor", nullable = false, length = 20)
    private String autor;




 // Constructor sin argumentos (requerido por JPA/Hibernate)
    public Libro() {}

    // Constructor completo
    public Libro(int id, String isbn, String titulo, String editorial, String fechaPublicacion,
            String autor) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
    }

    // Getters y Setters (manuales porque Lombok no está funcionando)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}

//hacer una consulta sql 

