/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WebGallery1 Galeria = new WebGallery1();
        Artista Camilo = new Artista("Camilo", "Gutierrez", "Nada", "MejorU");
        Galeria.añadirusuario(Camilo);
        Camilo.Registrar_Usuario();
        Obra Noche = new Obra("La noche estrellada", "La mejor jeje ", "Abstracta  ", 20000);
        Camilo.AñadirObra(Noche);

    }

}
