/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author Milton
 */
public class DosisAplicada implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private Date fechaAplicacion;
    private Dosis dosis;
    private Historial historial;

    public DosisAplicada() {
    }

    public DosisAplicada(Date fechaAplicacion, Dosis dosis, Historial historial) {
        this.fechaAplicacion = fechaAplicacion;
        this.dosis = dosis;
        this.historial = historial;
    }

    public DosisAplicada(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(Date fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public Dosis getDosis() {
        return dosis;
    }

    public void setDosis(Dosis dosis) {
        this.dosis = dosis;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "DosisAplicada{" + "id=" + id + ", fechaAplicacion=" + fechaAplicacion + '}';
    }
}
