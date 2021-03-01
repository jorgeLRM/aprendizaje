/**
 * 
 */
package com.di3go.restaurantedata.dao.impl;

import java.lang.module.ResolutionException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.di3go.restaurantedata.connection.ConnectionFactory;
import com.di3go.restaurantedata.dao.TipoRestauranteDAO;
import com.di3go.restaurantedata.entity.TipoRestaurante;
import com.di3go.restaurantedata.enums.CodigoEnum;
import com.di3go.restaurantedata.myexceptions.RestauranteException;

/**
 * @author Diego Paniagua Lopez.
 * Clase que implementa el CRUD y otros metodos personalizados de transacciones
 * a la base de datos en la tabla tipo_restaurante.
 *
 */
public class TipoRestauranteDAOImpl implements TipoRestauranteDAO {

	@Override
	public int guardar(TipoRestaurante tipoRestaurante) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO tipo_restaurante (descripcion, fechaCreacion, estatus) VALUES('" + tipoRestaurante.getDescripcion() + "', '" + tipoRestaurante.getFechaCreacion() + "', " + tipoRestaurante.isEstatus() + ")";
		
		ConnectionFactory.conectar();
		
		int ejecutado = ConnectionFactory.ejecutarSentencia(sql);
		
		ConnectionFactory.getConnection().close();
		
		return ejecutado;
	}

	@Override
	public int actualizar(TipoRestaurante tipoRestaurante) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE tipo_restaurante SET descripcion = '" + tipoRestaurante.getDescripcion() + "', fechaCreacion = '" + tipoRestaurante.getFechaCreacion() + "', estatus = " + tipoRestaurante.isEstatus() +
					" WHERE idTipoRestaurante = " + tipoRestaurante.getIdTipoRestaurante();
		
		ConnectionFactory.conectar();
		
		int ejecutado = ConnectionFactory.ejecutarSentencia(sql);
		
		ConnectionFactory.getConnection().close();
		
		return ejecutado;
	}

	@Override
	public int eliminar(int idTipoRestaurante) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM tipo_restaurante WHERE idTipoRestaurante = " + idTipoRestaurante ;
	
		ConnectionFactory.conectar();
		
		int ejecutado = ConnectionFactory.ejecutarSentencia(sql);
		
		ConnectionFactory.getConnection().close();
		
		return ejecutado;
	}

	@Override
	public List<TipoRestaurante> consultar() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM tipo_restaurante ORDER BY descripcion";
		
		ConnectionFactory.conectar();
		
		ResultSet rs = ConnectionFactory.ejecutarConsulta(sql);
		
		List<TipoRestaurante> tiposRestaurantes = new ArrayList<TipoRestaurante>();
		
		if (rs != null) {
			while (rs.next()) {
				TipoRestaurante tipoRestaurante = new TipoRestaurante();
				tipoRestaurante.setIdTipoRestaurante(rs.getInt("idTipoDescripcion"));
				tipoRestaurante.setDescripcion(rs.getString("descripcion"));
				tipoRestaurante.setFechaCreacion(rs.getTimestamp("fechaCreacion").toLocalDateTime());
				tipoRestaurante.setEstatus(rs.getBoolean("estatus"));
				
				tiposRestaurantes.add(tipoRestaurante);
			}
		}
		
		return tiposRestaurantes;
	}

	@Override
	public TipoRestaurante consultarPorId(int idTipoRestaurante) throws ClassNotFoundException, SQLException, RestauranteException {
		String sql = "SELECT * FROM tipo_restaurante WHERE idTipoRestaurante = " + idTipoRestaurante + " ORDER BY descripcion";
		
		ConnectionFactory.conectar();
		
		TipoRestaurante tipoRestaurante = null;

		try {
		
			ResultSet rs = ConnectionFactory.ejecutarConsulta(sql);
						
			if (rs != null) {
				if (rs.next()) {
					tipoRestaurante = new TipoRestaurante();
					tipoRestaurante.setIdTipoRestaurante(rs.getInt("idTipoDescripcion"));
					tipoRestaurante.setDescripcion(rs.getString("descripcion"));
					tipoRestaurante.setFechaCreacion(rs.getTimestamp("fechaCreacion").toLocalDateTime());
					tipoRestaurante.setFechaModificacion(rs.getTimestamp("fechaModificacion") != null ? rs.getTimestamp("fechaModificacion").toLocalDateTime() : null);
					tipoRestaurante.setEstatus(rs.getBoolean("estatus"));
					
				}
			}
			
		} catch (Exception e) {
			throw new RestauranteException("Error de sintaxis en la sentencia " + sql, CodigoEnum.SINTAXIS_ERROR_CODE);
		}
		
		return tipoRestaurante;
	}

}
