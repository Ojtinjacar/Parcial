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
public class Obra {

    private String Nombre;
    private String Descripcion;
    private String Estilo;
    private double valor;

    public Obra(String Nombre, String Descripcion, String Estilo, double valor) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Estilo = Estilo;
        this.valor = valor;
    }

    public Obra() {
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getEstilo() {
        return Estilo;
    }

    public void setEstilo(String Estilo) {
        this.Estilo = Estilo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

}
