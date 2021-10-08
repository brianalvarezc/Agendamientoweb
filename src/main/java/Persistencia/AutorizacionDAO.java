/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Autorizacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author AlvarezCuadros
 */
public class AutorizacionDAO {
    
    // Instrucciones SQL
    private String query_autorizacion = "SELECT au.autorizacion_Id, e.entidad_Nombre, p.paciente_Nombre, au.autorizacion_fecha, es.estado_Nombre "
                                        + "FROM autorizacion au "
                                        + "JOIN entidad e ON (au.autorizacion_Id_Entidad = e.entidad_Id) "
                                        + "JOIN paciente p ON (au.autorizacion_Id_Paciente = p.paciente_Id) "
                                        + "JOIN estados es ON (au.autorizacion_Estado_Id = es.estado_Id) ;";
    
    public ArrayList<Autorizacion> consultarAutorizacion(){
        ArrayList<Autorizacion> lista_autorizacion = new ArrayList<>();
        ConexionBD conexion = new ConexionBD();
        ResultSet rs = conexion.ejecutarQuery(query_autorizacion);
        try{
            while(rs.next()){
                int autorizacion_Id = rs.getInt("autorizacion_Id");
                String autorizacion_Nombre_Entidad = rs.getString("entidad_Nombre");
                String paciente_Nombre = rs.getString("paciente_Nombre");
                String autorizacion_fecha = rs.getString("autorizacion_fecha");
                String estado_Nombre = rs.getString("estado_Nombre");
                // Crear el objeto con los datos extraidos de la BD
                Autorizacion autorizacion = new Autorizacion(autorizacion_Id, autorizacion_Nombre_Entidad, paciente_Nombre, autorizacion_fecha, estado_Nombre);
                lista_autorizacion.add(autorizacion);                
            }
        }
        catch(SQLException ex){
            return null;
        }
        return lista_autorizacion;
    }
            
}
