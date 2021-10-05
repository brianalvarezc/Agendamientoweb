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
        
    // Atributos
    private int autorizacion_Id;
    private int autorizacion_Id_Entidad;
    private int autorizacion_Id_Paciente;
    private String autorizacion_fecha;
    private int autorizacion_Estado;
    
    // Constructores

    public Autorizacion() {
    }

    public Autorizacion(int autorizacion_Id_Entidad, int autorizacion_Id_Paciente, String autorizacion_fecha, int autorizacion_Estado) {
        this.autorizacion_Id_Entidad = autorizacion_Id_Entidad;
        this.autorizacion_Id_Paciente = autorizacion_Id_Paciente;
        this.autorizacion_fecha = autorizacion_fecha;
        this.autorizacion_Estado = autorizacion_Estado;
    }

    public Autorizacion(int autorizacion_Id, int autorizacion_Id_Entidad, int autorizacion_Id_Paciente, String autorizacion_fecha, int autorizacion_Estado) {
        this.autorizacion_Id = autorizacion_Id;
        this.autorizacion_Id_Entidad = autorizacion_Id_Entidad;
        this.autorizacion_Id_Paciente = autorizacion_Id_Paciente;
        this.autorizacion_fecha = autorizacion_fecha;
        this.autorizacion_Estado = autorizacion_Estado;
    }
    
    
    
}
