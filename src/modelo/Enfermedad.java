/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Milton
 */
public class Enfermedad implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nombre;
    private String descripcion;
    private Set<Vacuna> vacunas;

    public Enfermedad() {
    }

    public Enfermedad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.vacunas = new HashSet<>();
    }

    public Enfermedad(Integer id) {
        this.id = id;
    }

    public Enfermedad(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(Set<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }

    @Override
    public String toString() {
        return "Enfermedad{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}
