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
public class WebGallery1 {

    private ArrayList<Usuario> usuario;

    public WebGallery1() {
        this.usuario = new ArrayList<>();
    }

    public void añadirusuario(Usuario usario) {
        this.usuario.add(usario);
    }

}
