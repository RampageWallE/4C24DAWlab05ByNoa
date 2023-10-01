/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.*;
import java.util.*;

public class cBaseDatos {
    String driver  = "com.mysql.cj.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
    String usuario = "root";
    String clave   = "";

    private Connection Conectar() {
        try {
            Class.forName(driver);
            Connection xcon = DriverManager.getConnection(url,usuario,clave);
            return xcon;
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }
  
    public boolean Editar(String nombre, String clave, String estado, String codigo) {
        try {
            Connection xcon = this.Conectar();
            String sql = "update t_usuarios set nombre='"+nombre+"', clave='"+clave+"', estado='"+estado+"' where codigo="+codigo+";";
            PreparedStatement ps=xcon.prepareStatement(sql);
            ps.executeUpdate(sql);            
        } catch (SQLException ex ) {
            System.out.println(ex.toString());
        }
        return false;
    }
    public boolean Eliminar(String codigo) {
        try {
            Connection xcon = this.Conectar();
            String sql = "delete from t_usuarios where codigo="+codigo;
            PreparedStatement ps=xcon.prepareStatement(sql);
            ps.executeUpdate(sql);            
        } catch (SQLException ex ) {
            System.out.println(ex.toString());
        }
        return false;
    }
    
}
