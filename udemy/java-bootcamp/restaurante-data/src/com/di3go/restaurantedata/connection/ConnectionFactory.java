/**
 * 
 */
package com.di3go.restaurantedata.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Diego Paniagua Lopez.
 * Clase que se encarga de realizar la configuracion, la conexion y habilitar las 
 * transacciones de una base de datos.
 *
 */
public class ConnectionFactory {
	/**
	 * Objeto encargado de mantener la conexion a la base de datos.
	 */
	private static Connection connection;
	/**
	 * Objeto encargado de habilitar y ejecutar sentencias SQL.
	 */
	private static Statement statement;
	/**
	 * Metodo que permite conectarse a la base de datos.
	 * @return {@link Connection} objeto con la informacion de la base de datos conectada | null.
	 * @throws ClassNotFoundException excepcion generada al no cargar el driver de la conexion.
	 * @throws SQLException excepcion en caso de error al realizar la conexion.
	 */
	public static Connection conectar() throws ClassNotFoundException, SQLException {
		//Paso 1: Cargar el driver de conexion.
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Paso 2: Establecer los datos de conexion.
		String url = "jdbc:mysql://localhost:3306/restaurante?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=America/Mexico_City";
		String user = "root";
		String password = "admin";
		
		//Paso 3: Establecer la conexion.
		connection = DriverManager.getConnection(url, user, password);
		
		return connection;
	}
	
	/**
	 * Metodo que permite ejecutar sentencias INSERT, UPDATE y DELETE.
	 * @param sql parametro con la sentencia a ejecutarse.
	 * @return 1 en caso de ser exitoso, 0 en caso de error.
	 * @throws SQLException Excepcion generada en caso de error al ejecutar sentencia sql.
	 */
	public static int ejecutarSentencia(String sql) throws SQLException {
		System.out.println(sql);
		statement = connection.createStatement();
		return statement.executeUpdate(sql);
	}
	
	/**
	 * Metodo que permite ejecutar sentencias SELECT.
	 * @param sql parametro con la sentencia a ejecutarse.
	 * @return {@link ResultSet} objeto con la informacion obtenida de la sentencia select
	 * @throws SQLException Excepcion generada en caso de error al ejecutar sentencia sql.
	 */
	public static ResultSet ejecutarConsulta(String sql) throws SQLException {
		System.out.println(sql);
		statement = connection.createStatement();
		return statement.executeQuery(sql);
	}

	/**
	 * @return the connection
	 */
	public static Connection getConnection() {
		return connection;
	}
	
}
