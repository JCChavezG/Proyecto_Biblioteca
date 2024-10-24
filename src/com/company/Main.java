package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BibliotecaImp biblio = new BibliotecaImp();

        Scanner ent = new Scanner(System.in);
        int opcion = 0;


        do {
           Libro libro = new Libro();
            Usuario usuario = new Usuario();



            System.out.println("\nSeleccione la opcion a realizar");
            System.out.println("1 Agregar libros");
            System.out.println("2 Listar libros");
            System.out.println("3 Agregar usuarios");
            System.out.println("4 Listar usuarios");
            System.out.println("5 Buscar libros");
            System.out.println("6 Eliminar libro");
            System.out.println("7 Salir \n");

            opcion = ent.nextInt();
            ent.nextLine();

            switch(opcion){
                case 1:
                    System.out.print("Tecelea el titulo del libro: ");
                    libro.setTitulo(ent.nextLine());


                    System.out.print("Tecelea el nombre del autor: ");
                    libro.setAutor(ent.nextLine());


                    System.out.print("Tecelea el ISBN del libro: ");
                    libro.setIsbn(ent.nextLine());

                    System.out.println(biblio.agregarLibro(libro)) ;

                    break;
                case 2:
                    System.out.print("    TITULO     " + "         AUTOR    "+ " ISBN  "+ "\n");
                    biblio.listarLibros();
                    break;

                case 3:
                    System.out.print("Tecelea el Id del usuario: ");
                    usuario.setId(ent.nextLine());

                    System.out.print("Tecelea el nombre del usuario: ");
                    usuario.setNombre(ent.nextLine());


                    System.out.println(biblio.registarUsusario(usuario));
                    break;

                case 4:
                    System.out.println("\n\n"+"ID USUARIO   "+ " NOMBRE USUARIO " );
                    biblio.listarUsuarios();
                    break;

                case 5:
                    System.out.println("Ingresa el titulo del libro a buscar: ");
                    String titulo = ent.nextLine();
                    System.out.println(biblio.encontrarLibro(titulo));

                    break;

                case 6:
                    System.out.println("Teclea el ISBN del libro que desee eliminar: ");
                    String isbn = ent.nextLine();

                    System.out.println(biblio.eliminarLibro(isbn));

                    break;

                case 7:
                    System.out.println("Salir del programa");
                    break;


                    default:

                        System.out.println("Debes seleccionar una de las opciones anteriores");


            }






        }while (opcion != 7);



/*
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();












        usuario.setId("001");
        usuario.setNombre("Juan Carlos");

        usuario1.setId("002");
        usuario1.setNombre("Maria Rodriguez");




        libro.setAutor("Julia navaro");
        libro.setTitulo("Dime quien soy");
        libro.setIsbn("12345");

        libro1.setAutor("ken follet");
        libro1.setTitulo("un mundo sin fin");
        libro1.setIsbn("34567");

      biblio.agregarLibro(libro);
      biblio.agregarLibro(libro1);
      biblio.agregarLibro(libro2);
      biblio.registarUsusario(usuario);
      biblio.registarUsusario(usuario1);
      biblio.registarUsusario(usuario2);

public string deleteById( integer id, status boolean)
    Optional <Departamento> tempdepartamento = departamentoRepository.findById(id);

    if(tempdepartamento.isPresent()){

    departamento departamento = deoartamentoOptional.get();
    depatamento .setIsActive(false);
    departamentoRepository.save(departemnto);
    status = false;

    return "departamento borrado exitosamente";

    }
    else{
    return el departamento no se encuentra";
    }

      */






    }
}
