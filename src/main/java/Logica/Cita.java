/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author AlvarezCuadros
 */
public class Cita {
    
    // Atributos ////////////////////////////////////////
    private int cita_Id;
    private String cita_Fecha;
    private String cita_Hora;
    private int cita_Autorizacion_Id;
    private int cita_Entidad_Id;
    private int cita_Paciente_Id;
    private int cita_Medico_Id;
    private int cita_Estado_Id;
    private String cita_Ubicacion;
    private int cita_Consultorio_Id;
    ////////////////////////////////////////////////////////////////////////////////
    // Constructores ////////////////////////////////////////

    public Cita() {
    }

    public Cita(String cita_Fecha, String cita_Hora, int cita_Autorizacion_Id, int cita_Entidad_Id, int cita_Paciente_Id, int cita_Medico_Id, int cita_Estado_Id, String cita_Ubicacion, int cita_Consultorio_Id) {
        this.cita_Fecha = cita_Fecha;
        this.cita_Hora = cita_Hora;
        this.cita_Autorizacion_Id = cita_Autorizacion_Id;
        this.cita_Entidad_Id = cita_Entidad_Id;
        this.cita_Paciente_Id = cita_Paciente_Id;
        this.cita_Medico_Id = cita_Medico_Id;
        this.cita_Estado_Id = cita_Estado_Id;
        this.cita_Ubicacion = cita_Ubicacion;
        this.cita_Consultorio_Id = cita_Consultorio_Id;
    }

    public Cita(int cita_Id, String cita_Fecha, String cita_Hora, int cita_Autorizacion_Id, int cita_Entidad_Id, int cita_Paciente_Id, int cita_Medico_Id, int cita_Estado_Id, String cita_Ubicacion, int cita_Consultorio_Id) {
        this.cita_Id = cita_Id;
        this.cita_Fecha = cita_Fecha;
        this.cita_Hora = cita_Hora;
        this.cita_Autorizacion_Id = cita_Autorizacion_Id;
        this.cita_Entidad_Id = cita_Entidad_Id;
        this.cita_Paciente_Id = cita_Paciente_Id;
        this.cita_Medico_Id = cita_Medico_Id;
        this.cita_Estado_Id = cita_Estado_Id;
        this.cita_Ubicacion = cita_Ubicacion;
        this.cita_Consultorio_Id = cita_Consultorio_Id;
    }
    ////////////////////////////////////////////////////////////////////////////////
    // Metodos Get Y Set////////////////////////////////////////

    public int getCita_Id() {
        return cita_Id;
    }

    public void setCita_Id(int cita_Id) {
        this.cita_Id = cita_Id;
    }

    public String getCita_Fecha() {
        return cita_Fecha;
    }

    public void setCita_Fecha(String cita_Fecha) {
        this.cita_Fecha = cita_Fecha;
    }

    public String getCita_Hora() {
        return cita_Hora;
    }

    public void setCita_Hora(String cita_Hora) {
        this.cita_Hora = cita_Hora;
    }

    public int getCita_Autorizacion_Id() {
        return cita_Autorizacion_Id;
    }

    public void setCita_Autorizacion_Id(int cita_Autorizacion_Id) {
        this.cita_Autorizacion_Id = cita_Autorizacion_Id;
    }

    public int getCita_Entidad_Id() {
        return cita_Entidad_Id;
    }

    public void setCita_Entidad_Id(int cita_Entidad_Id) {
        this.cita_Entidad_Id = cita_Entidad_Id;
    }

    public int getCita_Paciente_Id() {
        return cita_Paciente_Id;
    }

    public void setCita_Paciente_Id(int cita_Paciente_Id) {
        this.cita_Paciente_Id = cita_Paciente_Id;
    }

    public int getCita_Medico_Id() {
        return cita_Medico_Id;
    }

    public void setCita_Medico_Id(int cita_Medico_Id) {
        this.cita_Medico_Id = cita_Medico_Id;
    }

    public int getCita_Estado_Id() {
        return cita_Estado_Id;
    }

    public void setCita_Estado_Id(int cita_Estado_Id) {
        this.cita_Estado_Id = cita_Estado_Id;
    }

    public String getCita_Ubicacion() {
        return cita_Ubicacion;
    }

    public void setCita_Ubicacion(String cita_Ubicacion) {
        this.cita_Ubicacion = cita_Ubicacion;
    }

    public int getCita_Consultorio_Id() {
        return cita_Consultorio_Id;
    }

    public void setCita_Consultorio_Id(int cita_Consultorio_Id) {
        this.cita_Consultorio_Id = cita_Consultorio_Id;
    }
    ////////////////////////////////////////////////////////////////////////////////
    // Metodos de la clase////////////////////////////////////////
    
    
    ////////////////////////////////////////////////////////////////////////////////
}
