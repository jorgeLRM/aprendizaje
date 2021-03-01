/**
 * 
 */
package com.di3go.restaurantedata.dao;

import java.sql.SQLException;
import java.util.List;

import com.di3go.restaurantedata.entity.TipoRestaurante;
import com.di3go.restaurantedata.myexceptions.RestauranteException;

/**
 * @author Diego Paniagua Lopez.
 * Interface que representa el CRUD de transaccion para la tabla de tipo_restaurante.
 */
public interface TipoRestauranteDAO {
	/**
	 * Metodo que permite guardar registros de tipos de restaurantes.
	 * @param tipoRestaurante objeto a guardar.
	 * @return 1 o mas en caso de ser exitoso, 0 en caso de no guardarlo.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	int guardar(TipoRestaurante tipoRestaurante) throws ClassNotFoundException, SQLException;
	/**
	 * Metodo que permite actualizar registros de tipos de restaurantes.
	 * @param tipoRestaurante objeto a actualizar.
	 * @return 1 o mas en caso de ser exitoso, 0 en caso de no actualizarlo.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */	
	int actualizar(TipoRestaurante tipoRestaurante) throws ClassNotFoundException, SQLException;
	/**
	 * Metodo que permite eliminar registros de tipos de restaurantes.
	 * @param idTipoRestaurante identificador del tipo a eliminar.
	 * @return 1 o mas en caso de ser exitoso, 0 en caso de no eliminarlo.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	int eliminar(int idTipoRestaurante) throws ClassNotFoundException, SQLException;
	/**
	 * Metodo que permite consultar los registros de tipos de restaurante.
	 * @return lista de tipos de restaurantes o null.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	List<TipoRestaurante> consultar() throws ClassNotFoundException, SQLException;
	/**
	 * Metodo que permite consultar un registro de tipo de restaurante por identificador.
	 * @param idTipoRestaurante identificador del tipo.
	 * @return tipo de restaurante consultado o null
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws RestauranteException 
	 */
	TipoRestaurante consultarPorId(int idTipoRestaurante) throws ClassNotFoundException, SQLException, RestauranteException;
}
