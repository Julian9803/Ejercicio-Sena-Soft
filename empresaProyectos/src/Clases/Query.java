/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Query {
    
    String usuario = "root";
    String contra = "julian";
    String Driver = "org.gjt.mm.mysql.Driver";
    String url = "jdbc:mysql://127.0.0.1:3307/proyectos";
        
    Connection conexion = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    public void getConectar(String usuario,String contra,String Driver,String url){
        
        try{
            Class.forName(Driver);
            conexion = DriverManager.getConnection(url, usuario, contra);
            System.out.println("Conecte correctamente");
            
            
        }catch(Exception ex){
            System.out.println("Se encontro el siguiente error conectando: "+ex.getMessage());
            ex.printStackTrace();
        }    
        
    }
    
    public void conectar(){
        
        try{
            Class.forName(Driver);
            conexion = DriverManager.getConnection(url, usuario, contra);
            System.out.println("Conecte correctamente");
            
            
        }catch(Exception ex){
            System.out.println("Se encontro el siguiente error conectando: "+ex.getMessage());
            ex.printStackTrace();
        }               
    }
    
    public void newIntegrante(String Documento,String Nombre,String Apellidos,String fechaNacimiento,String Email,String numeroContacto,String Direccion,String User,String Password,String Rol,int idAdministrador){
        
        conectar();
        
        try{
            
             String sql = "";
                   sql += "insert Integrantes(Documento,Nombre,Apellidos,fechaNacimiento,Email,numeroContacto,Direccion,User,Password,Rol,Administrador_idAdministrador) ";
                   sql += "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
            
            pstm = conexion.prepareStatement(sql);
            pstm.setString(1, Documento);
            pstm.setString(2, Nombre);
            pstm.setString(3, Apellidos);
            pstm.setString(4, fechaNacimiento);
            pstm.setString(5, Email);
            pstm.setString(6, numeroContacto);
            pstm.setString(7, Direccion);
            pstm.setString(8, User);
            pstm.setString(9, Password);
            pstm.setString(10, Rol);
            pstm.setInt(11, idAdministrador);
            
            int rtdo = pstm.executeUpdate();
            
            
            
            if (rtdo == 1){
                JOptionPane.showMessageDialog(null, "Se creo correctamente el registro", "Enhorabuena!!!",JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        }catch(Exception ex){
            System.out.println("Se encontro el siguiente error: "+ex.getMessage());
            ex.printStackTrace();
        }
        
    }
    
    public void updateIntegrante(int idIntegrantes,String Documento,String Nombre,String Apellidos,String fechaNacimiento,String Email,String numeroContacto,String Direccion,String User,String Password){
        
       try{
           
           conectar();
           
            String sql = "";
                   sql += "update integrantes ";
                   sql += "set Documento = ? , ";
                   sql += " Nombre = ? , ";
                   sql += " Apellidos = ? , ";
                   sql += " fechaNacimiento = ? , ";
                   sql += " Email = ? , ";
                   sql += " numeroContacto = ? , ";
                   sql += " Direccion = ? , ";
                   sql += " User = ? , ";
                   sql += " Password = ?  ";
                   sql += "where idIntegrantes = "+idIntegrantes;
                   
            pstm = conexion.prepareStatement(sql);
            
            pstm.setString(1, Documento);
            pstm.setString(2, Nombre);
            pstm.setString(3, Apellidos);
            pstm.setString(4, fechaNacimiento);
            pstm.setString(5, Email);
            pstm.setString(6, numeroContacto);
            pstm.setString(7, Direccion);
            pstm.setString(8, User);
            pstm.setString(9, Password);
            
            int rtdo = pstm.executeUpdate();
            
            if (rtdo == 1){
                JOptionPane.showMessageDialog(null, "Se actualizo el registro correctamente", "Enhorabuena¡¡",JOptionPane.INFORMATION_MESSAGE);
                
            }else {
                JOptionPane.showMessageDialog(null,"NO se pudo actualizar","Error¡¡",JOptionPane.WARNING_MESSAGE);
            }
           
           
       }catch(Exception ex){
           System.out.println("Error al actualixar: "+ex.getMessage());
           ex.printStackTrace();
       }
        
        
    }
    
    public void deleteIntegrante(int idIntegrante){
        
        try{
            
            conectar();
            
            String sql = "";
                   sql += "delete from Integrantes where idIntegrantes = ?" ;
                   
                   
                   
            pstm = conexion.prepareStatement(sql);
            
            pstm.setInt(1, idIntegrante);
            
            int rtdo = pstm.executeUpdate();
            
            if (rtdo == 1){
                JOptionPane.showMessageDialog(null,"Se ELIMINO el registro correctamente","Enhorabuena",JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        }catch(Exception ex){
            System.out.println("Error al eliminar un integrante: "+ex.getMessage());
            ex.printStackTrace();
        }
        
    }
    
    //Proyecto
    
    public void newProyecto(String Titulo, String  Descripcion, String  fechaInicio, String Duracion, String jefeProyecto, int idIntegrantes, int idAdministrador){
        
        try{
            
            conectar();
            
            String sql = "";
                   sql += "insert proyectos(Titulo, Descripcion, fechaInicio, Duracion, jefeProyecto, Integrantes_idIntegrantes, Integrantes_Administrador_idAdministrador) ";
                   sql += "values (?, ?, ?, ?, ?, ?, ?) ";
            
            pstm = conexion.prepareStatement(sql);
            pstm.setString(1, Titulo);
            pstm.setString(2, Descripcion);
            pstm.setString(3, fechaInicio);
            pstm.setString(4, Duracion);
            pstm.setString(5, jefeProyecto);
            pstm.setInt(6, idIntegrantes);
            pstm.setInt(7, idAdministrador);
            
            
            int rtdo = pstm.executeUpdate();
            
            
            
            if (rtdo == 1){
                JOptionPane.showMessageDialog(null, "Se creo correctamente el registro", "Enhorabuena!!!",JOptionPane.INFORMATION_MESSAGE);
            }
            
            
            
            
            
            
        }catch(Exception ex){
            System.out.println("Error al registrar el proyecto: "+ex.getMessage());
            ex.printStackTrace();
        }
        
        
    }
    
    public void updateProyecto(int idProyecto, String Titulo, String  Descripcion, String  fechaInicio, int Duracion, String jefeProyecto, int idIntegrantes, int idAdministrador){
        
        try{
            
            conectar();
            
            String sql = "";
                   sql += "update proyectos ";
                   sql += "set Titulo = ? , ";
                   sql += "Descripcion = ? , ";
                   sql += "fechaInicio = ? , ";
                   sql += "Duracion = ? , ";
                   sql += "jefeProyecto = ? , ";
                   sql += "Integrantes_idIntegrantes = ? , ";
                   sql += "Integrantes_Administrador_idAdministrador = ? ";
                   sql += "where idProyectos = "+idProyecto;
                   
            pstm = conexion.prepareStatement(sql);
            
            pstm.setString(1, Titulo);
            pstm.setString(2, Descripcion);
            pstm.setString(3, fechaInicio);
            pstm.setInt(4, Duracion);
            pstm.setString(5, jefeProyecto);
            pstm.setInt(6, idIntegrantes);
            pstm.setInt(7, idAdministrador);
       
            
            int rtdo = pstm.executeUpdate();
            
            if (rtdo == 1){
                JOptionPane.showMessageDialog(null, "Se actualizo el registro correctamente", "Enhorabuena¡¡",JOptionPane.INFORMATION_MESSAGE);
                
            }else {
                JOptionPane.showMessageDialog(null,"NO se pudo actualizar","Error¡¡",JOptionPane.WARNING_MESSAGE);
            }
            
            
            
        }catch(Exception ex){
            System.out.println("Se encontro el error al actualizar: "+ex.getMessage());
            ex.printStackTrace();
        }
        
        
        
    }
    
    
    
    
}
