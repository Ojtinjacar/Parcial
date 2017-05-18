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
public class Comprador extends Usuario {

    private Obra Adquirir;

    public Comprador(String Nombre, String Apellido) {
        super(Nombre, Apellido);
    }

    @Override
    String Registrar_Usuario() {
        return "El comprador " + Nombre + " ha sido registrado";
    }
    
    public void Comprar_Obra(){
        
    }

}
