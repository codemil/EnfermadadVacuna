/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoprueba;

import Dao.DosisAplicadaDao;
import Dao.DosisDao;
import Dao.EnfermedadDao;
import Dao.HistorialDao;
import Dao.PersonaDao;
import Dao.VacunaDao;
import java.util.Date;
import java.util.List;
import java.util.Set;
import modelo.Dosis;
import modelo.DosisAplicada;
import modelo.Enfermedad;
import modelo.Historial;
import modelo.Persona;
import modelo.Vacuna;

/**
 *
 * @author Milton
 */
public class CasoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creación de registro de vacunación
        guardarRegistroDeVacunacion();
//        consultarRegitroVacunacion(202);
//        actualizarRegistroVacunacion();
//        eliminarRegistroVacunacion();
    }

    private static void guardarRegistroDeVacunacion() {
        //Inicialización daos
        PersonaDao personaDao = new PersonaDao();
        VacunaDao vacunaDao = new VacunaDao();
        DosisDao dosisDao = new DosisDao();
        DosisAplicadaDao dosisAplicadaDao = new DosisAplicadaDao();

        //Definición de persona
        Persona persona = new Persona("1234567890", "C", "pepe", "perez", new Date());

        //Definición de historial
        Historial historial = new Historial(new Date());
        //Relación de historial - persona
        historial.setPersona(persona);

        //Relacion de persona - historial
        persona.setHistorial(historial);

        //Guardado de persona
        personaDao.guardar(persona);

        //Definición de vacuna
        Vacuna vacuna = new Vacuna("nombre vacuna", "descripcion vacuna1");

        //Definición de enfermedad
        Enfermedad enfermedad = new Enfermedad("Nombre Enfermedad", "Descripción Enfermedad");

        //Relación de vacuna enfermedad
        vacuna.getEnfermedades().add(enfermedad);

        //Guardado de vacuna
        vacunaDao.guardar(vacuna);

        //Definición de dosis
        Dosis dosis = new Dosis(2, "H", vacuna);

        //Guardado de dosis
        dosisDao.guardar(dosis);

        //Definición de dosis aplicada
        DosisAplicada dosisAplicada = new DosisAplicada(new Date(), dosis, historial);

        //Guardado de dosis aplicada
        dosisAplicadaDao.guardar(dosisAplicada);
    }

    private static void consultarRegitroVacunacion(Integer idPersona) {
        PersonaDao personaDao = new PersonaDao();
        VacunaDao vacunaDao = new VacunaDao();
        DosisDao dosisDao = new DosisDao();
        DosisAplicadaDao dosisAplicadaDao = new DosisAplicadaDao();
        EnfermedadDao enfermedadDao = new EnfermedadDao();

        System.out.println("============ Personas ============");
//        List<Enfermedad> enfermedades = enfermedadDao.obtenerLista();
//        for (Enfermedad enfermedad : enfermedades) {
//            System.out.println(enfermedad);
//            System.out.println(enfermedad.getVacunas());
//            Set<Vacuna> vacunas = enfermedad.getVacunas();
//            for (Vacuna vacuna : vacunas) {
//                System.out.println(vacuna);
//            }
//        }

//        List<Dosis> listaDosis = dosisDao.obtenerLista();
//        for (Dosis dosis : listaDosis) {
//            System.out.println(dosis);
//            Vacuna vacuna = dosis.getVacuna();
//            System.out.println(vacuna);
//            Set<Enfermedad> enfermedades = vacuna.getEnfermedades();
//            for (Enfermedad enfermedad : enfermedades) {
//                System.out.println(enfermedad);
//            }
//        }
        List<DosisAplicada> dosisAplicadas = dosisAplicadaDao.obtenerLista();
        for (DosisAplicada dosisAplicada : dosisAplicadas) {
            System.out.println(dosisAplicada);
            Dosis dosis = dosisAplicada.getDosis();
            System.out.println(dosis);
            Historial historial = dosisAplicada.getHistorial();
            System.out.println(historial);
            Persona persona = historial.getPersona();
            System.out.println(persona);
        }
        System.out.println("================================================");
    }

    private static void actualizarRegistroVacunacion() {
        PersonaDao personaDao = new PersonaDao();
        VacunaDao vacunaDao = new VacunaDao();
        DosisDao dosisDao = new DosisDao();
        DosisAplicadaDao dosisAplicadaDao = new DosisAplicadaDao();
        EnfermedadDao enfermedadDao = new EnfermedadDao();
        HistorialDao historialDao = new HistorialDao();

        Enfermedad enfermedad = enfermedadDao.obtenerPorId(225);
        enfermedad.setDescripcion("actualizada");
        enfermedadDao.actualizar(enfermedad);

        Vacuna vacuna = vacunaDao.obtenerPorId(122);
        vacuna.setDescripcion("actualizada");
        vacunaDao.actualizar(vacuna);

        Dosis dosis = dosisDao.obtenerPorId(5);
        dosis.setUnidadTiempo("H");
        Vacuna vacuna1 = vacunaDao.obtenerPorId(122);
        dosis.setVacuna(vacuna1);
        dosisDao.actualizar(dosis);

        DosisAplicada dosisAplicada = dosisAplicadaDao.obtenerPorId(1);
        dosisAplicada.setFechaAplicacion(new Date());
        Historial historial = historialDao.obtenerPorId(202);
        dosisAplicada.setHistorial(historial);
        dosisAplicadaDao.actualizar(dosisAplicada);

        Historial historial1 = historialDao.obtenerPorId(202);
        historial1.setFechaCreacion(new Date());
        historialDao.actualizar(historial);

        Persona persona = personaDao.obtenerPorId(202);
        persona.setNombres("nombres actualizados");
        personaDao.actualizar(persona);
    }

    private static void eliminarRegistroVacunacion() {
        PersonaDao personaDao = new PersonaDao();
        VacunaDao vacunaDao = new VacunaDao();
        DosisDao dosisDao = new DosisDao();
        DosisAplicadaDao dosisAplicadaDao = new DosisAplicadaDao();
        EnfermedadDao enfermedadDao = new EnfermedadDao();
        HistorialDao historialDao = new HistorialDao();

//        dosisAplicadaDao.eliminar(1);
//        dosisDao.eliminar(5);
//           vacunaDao.eliminar(122);
        personaDao.eliminar(203);

    }
}
