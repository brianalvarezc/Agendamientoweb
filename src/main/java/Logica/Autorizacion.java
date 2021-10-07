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
public class Autorizacion {
        
    // Atributos ////////////////////////////////////////
    private int autorizacion_Id;
    //private int autorizacion_Id_Entidad;
    private String autorizacion_Nombre_Entidad;
    private int autorizacion_Id_Paciente;
    private String autorizacion_fecha;
    private int autorizacion_Estado_Id;
    
    // Constructores ////////////////////////////////////////

    public Autorizacion() {
    }

    public Autorizacion(String autorizacion_Nombre_Entidad, int autorizacion_Id_Paciente, String autorizacion_fecha, int autorizacion_Estado_Id) {
        this.autorizacion_Nombre_Entidad = autorizacion_Nombre_Entidad;
        this.autorizacion_Id_Paciente = autorizacion_Id_Paciente;
        this.autorizacion_fecha = autorizacion_fecha;
        this.autorizacion_Estado_Id = autorizacion_Estado_Id;
    }

    public Autorizacion(int autorizacion_Id, String autorizacion_Nombre_Entidad, int autorizacion_Id_Paciente, String autorizacion_fecha, int autorizacion_Estado_Id) {
        this.autorizacion_Id = autorizacion_Id;
        this.autorizacion_Nombre_Entidad = autorizacion_Nombre_Entidad;
        this.autorizacion_Id_Paciente = autorizacion_Id_Paciente;
        this.autorizacion_fecha = autorizacion_fecha;
        this.autorizacion_Estado_Id = autorizacion_Estado_Id;
    }
    
    // get y set ////////////////////////////////////////

    public int getAutorizacion_Id() {
        return autorizacion_Id;
    }

    public void setAutorizacion_Id(int autorizacion_Id) {
        this.autorizacion_Id = autorizacion_Id;
    }
    // Cambie _Id_Entidad por _Nombre_Entidad y el tipo de dato
    public String getAutorizacion_Nombre_Entidad() {
        return autorizacion_Nombre_Entidad;
    }

    public void setAutorizacion_Id_Entidad(String autorizacion_Nombre_Entidad) {
        this.autorizacion_Nombre_Entidad = autorizacion_Nombre_Entidad;
    }

    public int getAutorizacion_Id_Paciente() {
        return autorizacion_Id_Paciente;
    }

    public void setAutorizacion_Id_Paciente(int autorizacion_Id_Paciente) {
        this.autorizacion_Id_Paciente = autorizacion_Id_Paciente;
    }

    public String getAutorizacion_fecha() {
        return autorizacion_fecha;
    }

    public void setAutorizacion_fecha(String autorizacion_fecha) {
        this.autorizacion_fecha = autorizacion_fecha;
    }

    public int getAutorizacion_Estado_Id() {
        return autorizacion_Estado_Id;
    }

    public void setAutorizacion_Estado_Id(int autorizacion_Estado_Id) {
        this.autorizacion_Estado_Id = autorizacion_Estado_Id;
    }
    
    // Metodos /////////////////////////////////////////
    
    
    
    //////////////////////////////////////////////////////
}
