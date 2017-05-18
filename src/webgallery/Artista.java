/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Artista extends Usuario {

    private String Distinciones;
    private String Curriculum;
    private ArrayList<Obra>Agregar;

    public Artista(String Nombre, String Apellido, String Distinciones, String Curriculum) {
        super(Nombre, Apellido);
        this.Curriculum = Curriculum;
        this.Distinciones = Distinciones;
        this.Agregar = new ArrayList<>();
        
    }
    

    @Override
    String Registrar_Usuario() {

        return "El artista " + Nombre + " ha sido registrado";
    }
   
    public void AñadirObra(Obra obra){
        this.Agregar.add(obra);
    }

}
