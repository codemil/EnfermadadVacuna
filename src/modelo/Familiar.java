/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Milton
 */
public class Familiar implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Persona padre;
    private Persona hijo;

    public Familiar() {
    }

    public Familiar(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public Persona getHijo() {
        return hijo;
    }

    public void setHijo(Persona hijo) {
        this.hijo = hijo;
    }

    @Override
    public String toString() {
        return "Familiar{" + "id=" + id + ", padre=" + padre + ", hijo=" + hijo + '}';
    }
}
