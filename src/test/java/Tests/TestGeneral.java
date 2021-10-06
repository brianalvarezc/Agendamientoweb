/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import org.testng.Assert;
import Logica.*;
import Persistencia.*;
import org.testng.annotations.Test;
import org.testng.annotations.Ignore;
/**
 *
 * @author AlvarezCuadros
 */
public class TestGeneral {
    
    
    @Test
    public void verificarConexion(){
        ConexionBD conexion = new ConexionBD();
        Assert.assertTrue(conexion.isConectado(), "No hay conexion creada");
        conexion.desconectar();
        Assert.assertFalse(conexion.isConectado(), "No se cerró la conexion");
    }
    
    //@Test
    //En este espacio se coloca el metodo void que verifica que el metodo seleccionado a probar
    
    @Test
    public void verificarConsultaAutorizaciones(){
        AutorizacionDAO dao = new AutorizacionDAO();
        Assert.assertTrue(dao.consultarAutorizacion().size() > 0, "No se cargaron los datos");
        
    }
    
    
}
