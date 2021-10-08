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
    private String paciente_Nombre;
    private String autorizacion_fecha;
    private String estado_Nombre;
    
    // Constructores ////////////////////////////////////////

    public Autorizacion() {
    }

    public Autorizacion(String autorizacion_Nombre_Entidad, String paciente_Nombre, String autorizacion_fecha, String estado_Nombre) {
        this.autorizacion_Nombre_Entidad = autorizacion_Nombre_Entidad;
        this.paciente_Nombre = paciente_Nombre;
        this.autorizacion_fecha = autorizacion_fecha;
        this.estado_Nombre = estado_Nombre;
    }

    public Autorizacion(int autorizacion_Id, String autorizacion_Nombre_Entidad, String paciente_Nombre, String autorizacion_fecha, String estado_Nombre) {
        this.autorizacion_Id = autorizacion_Id;
        this.autorizacion_Nombre_Entidad = autorizacion_Nombre_Entidad;
        this.paciente_Nombre = paciente_Nombre;
        this.autorizacion_fecha = autorizacion_fecha;
        this.estado_Nombre = estado_Nombre;
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

    public String getAutorizacion_paciente_Nombre() {
        return paciente_Nombre;
    }

    public void setAutorizacion_Id_Paciente(String paciente_Nombre) {
        this.paciente_Nombre = paciente_Nombre;
    }

    public String getAutorizacion_fecha() {
        return autorizacion_fecha;
    }

    public void setAutorizacion_fecha(String autorizacion_fecha) {
        this.autorizacion_fecha = autorizacion_fecha;
    }

    public String getAutorizacion_estado_Nombre() {
        return estado_Nombre;
    }

    public void setAutorizacion_Estado_Id(String estado_Nombre) {
        this.estado_Nombre = estado_Nombre;
    }
    
    // Metodos /////////////////////////////////////////
    
    
    
    //////////////////////////////////////////////////////
}
