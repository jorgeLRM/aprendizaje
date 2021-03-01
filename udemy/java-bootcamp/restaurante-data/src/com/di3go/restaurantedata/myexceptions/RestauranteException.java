/**
 * 
 */
package com.di3go.restaurantedata.myexceptions;

import com.di3go.restaurantedata.enums.CodigoEnum;

/**
 * @author Diego Paniagua Lopez.
 * Excepcion personalizada para manipular los errores ocasionados en el proyecto restaurante.
 *
 */
public class RestauranteException extends Exception {
	/**
	 * Codigo de error generado por la excepcion.
	 */
	private int errorCode;
	/**
	 * Constructor default.
	 */
	public RestauranteException() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor sobrecargado que muestra el codigo y mensaje de error.
	 * @param mensaje mensaje a mostrar al usuario.
	 * @param codigoEnum codigo de error de la enumeracion.
	 */
	public RestauranteException(String mensaje, CodigoEnum codigoEnum) {
		super(mensaje);
		this.errorCode = codigoEnum.getCode();
	}
	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
}
