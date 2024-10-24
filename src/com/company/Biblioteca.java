package com.company;

import java.util.List;

public interface Biblioteca {

    String agregarLibro(Libro libro);

    String eliminarLibro(String isbn);

    List<Libro>listarLibros();

    String registarUsusario(Usuario usuario);

    List<Usuario> listarUsuarios();

    String encontrarLibro(String titulo);
}
