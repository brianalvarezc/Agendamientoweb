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
    private String query_autorizacion = "SELECT autorizacion_Id, autorizacion_Id_Entidad, autorizacion_Id_Paciente, autorizacion_fecha, autorizacion_Estado_Id FROM autorizacion;";
    
    public ArrayList<Autorizacion> consultarAutorizacion(){
        ArrayList<Autorizacion> lista_autorizacion = new ArrayList<>();
        ConexionBD conexion = new ConexionBD();
        ResultSet rs = conexion.ejecutarQuery(query_autorizacion);
        try{
            while(rs.next()){
                int autorizacion_Id = rs.getInt("autorizacion_Id");
                int autorizacion_Id_Entidad = rs.getInt("autorizacion_Id_Entidad");
                int autorizacion_Id_Paciente = rs.getInt("autorizacion_Id_Paciente");
                String autorizacion_fecha = rs.getString("autorizacion_fecha");
                int autorizacion_Estado_Id = rs.getInt("autorizacion_Estado_Id");
                // Crear el objeto con los datos extraidos de la BD
                Autorizacion autorizacion = new Autorizacion(autorizacion_Id, autorizacion_Id_Entidad, autorizacion_Id_Paciente, autorizacion_fecha, autorizacion_Estado_Id);
                lista_autorizacion.add(autorizacion);                
            }
        }
        catch(SQLException ex){
            return null;
        }
        return lista_autorizacion;
    }
            
}
