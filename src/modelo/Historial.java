/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Milton
 */
public class Historial implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idPersona;
    private Date fechaCreacion;
    private Persona persona;
    private Set<DosisAplicada> dosisAplicadas;

    public Historial() {
        dosisAplicadas = new HashSet<>();
    }

    public Historial(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Historial(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Set<DosisAplicada> getDosisAplicadas() {
        return dosisAplicadas;
    }

    public void setDosisAplicadas(Set<DosisAplicada> dosisAplicadas) {
        this.dosisAplicadas = dosisAplicadas;
    }

    @Override
    public String toString() {
        return "Historial{" + "idPersona=" + idPersona + ", fechaCreacion=" + fechaCreacion + '}';
    }
}
