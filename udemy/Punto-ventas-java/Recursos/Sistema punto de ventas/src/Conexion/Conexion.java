/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;

/**
 *
 * @author AJPDHN
 */
public class Conexion {
     private String db = "punto_de_ventas";
    private String user = "root";
    private String password = "";
    private String urlMysql = "jdbc:mysql://localhost/" + db + "?SslMode=none";
    private String urlSql = "jdbc:sqlserver://localhost:1433;databaseName=" + db 
            + ";integratedSecurity=true;";
    private Connection conn = null;
    
    public Conexion(){
        
    }
}
