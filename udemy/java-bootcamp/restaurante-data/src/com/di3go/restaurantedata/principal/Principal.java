/**
 * 
 */
package com.di3go.restaurantedata.principal;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import com.di3go.restaurantedata.dao.impl.TipoRestauranteDAOImpl;
import com.di3go.restaurantedata.entity.TipoRestaurante;
import com.di3go.restaurantedata.myexceptions.RestauranteException;

/**
 * @author Diego Paniagua Lopez. Clase principal para probar la conexion a la
 *         base de datos.
 */
public class Principal {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		TipoRestauranteDAOImpl tipoRestauranteDAOImpl = new TipoRestauranteDAOImpl();

//		TipoRestaurante tipoRestaurante = new TipoRestaurante();
//		tipoRestaurante.setDescripcion("Griego");
//		tipoRestaurante.setFechaCreacion(LocalDateTime.now());
//		tipoRestaurante.setEstatus(true);

		// ::::::::: PRUEBA DE INSERT ::::::::::::::

//		try {
//			int guardado = tipoRestauranteDAOImpl.guardar(tipoRestaurante);
//			//Si el tipo de restaurante se guardo en la base de datos.
//			if (guardado > 0) {
//				System.out.println("El tipo de restaurante " + tipoRestaurante.getDescripcion() + " fué guardado exitósamente.");
//			} else {
//				System.err.println("Hubo un error al guardar el tipo de restaurante.");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Error: " + e.getMessage());
//			e.printStackTrace();
//		}

		// :::::::::: PRUEBA DE UPDATE :::::::::::::

//		TipoRestaurante tipoRestaurante = new TipoRestaurante();
//		tipoRestaurante.setIdTipoRestaurante(22); 
//		tipoRestaurante.setDescripcion("Griego");
//		tipoRestaurante.setFechaModificacion(LocalDateTime.now());
//		tipoRestaurante.setEstatus(true);
//		
//		try {
//			int actualizar = tipoRestauranteDAOImpl.guardar(tipoRestaurante);
//			//Si el tipo de restaurante se guardo en la base de datos.
//			if (actualizar > 0) {
//				System.out.println("El tipo de restaurante " + tipoRestaurante.getDescripcion() + " fué actualizado exitósamente.");
//			} else {
//				System.err.println("Hubo un error al actualizar el tipo de restaurante.");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Error: " + e.getMessage());
//			e.printStackTrace();
//		}

		// :::::::::: PRUEBA DE DELETE :::::::::::::

//		TipoRestaurante tipoRestaurante = new TipoRestaurante();
//		tipoRestaurante.setIdTipoRestaurante(22);
//		tipoRestaurante.setDescripcion("Griego");
//
//		try {
//			int eliminado = tipoRestauranteDAOImpl.eliminar(tipoRestaurante.getIdTipoRestaurante());
//			// Si el tipo de restaurante se guardo en la base de datos.
//			if (eliminado > 0) {
//				System.out.println("El tipo de restaurante " + tipoRestaurante.getDescripcion()
//						+ " fué eliminado exitósamente.");
//			} else {
//				System.err.println("Hubo un error al eliminar el tipo de restaurante.");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Error: " + e.getMessage());
//			e.printStackTrace();
//		}
		
		// :::::::::: PRUEBA DE SELECT :::::::::::::

//		try {
//			List<TipoRestaurante> tiposConsultados = tipoRestauranteDAOImpl.consultar();
//			
//			for (TipoRestaurante tipoRestaurante : tiposConsultados) {
//				System.out.println("ID: " + tipoRestaurante.getIdTipoRestaurante());
//				System.out.println("DESCRIPCIÓN: " + tipoRestaurante.getDescripcion());
//				System.out.println("ESTATUS: " + tipoRestaurante.isEstatus() + "\n");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Error: " + e.getMessage());
//			e.printStackTrace();
//		}
		
		// :::::::::: PRUEBA DE SELECT WHERE:::::::::::::

		try {
			TipoRestaurante tipoConsultado = tipoRestauranteDAOImpl.consultarPorId(17);
	
			if (tipoConsultado != null) {
				System.out.println("ID: " + tipoConsultado.getIdTipoRestaurante());
				System.out.println("DESCRIPCIÓN: " + tipoConsultado.getDescripcion());
				System.out.println("ESTATUS: " + tipoConsultado.isEstatus() + "\n");
			} else {
				System.err.println("No se encontró el tipo de restaurante que buscas. :(");
			}
		} catch (ClassNotFoundException | SQLException | RestauranteException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
}
