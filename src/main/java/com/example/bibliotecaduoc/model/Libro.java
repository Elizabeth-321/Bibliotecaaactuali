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
     @Column(name = "fechaPublicacion", nullable = false, length = 20)
    private String fechaPublicacion;
     @Column(name = "autor", nullable = false, length = 20)
    private String autor;







}
