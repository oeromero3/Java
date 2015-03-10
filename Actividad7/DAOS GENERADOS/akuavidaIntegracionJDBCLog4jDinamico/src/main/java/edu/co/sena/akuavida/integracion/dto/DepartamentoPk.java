/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.integracion.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the departamento table.
 */
public class DepartamentoPk implements Serializable
{
	protected String idDepartamento;

	/** 
	 * Sets the value of idDepartamento
	 */
	public void setIdDepartamento(String idDepartamento)
	{
		this.idDepartamento = idDepartamento;
	}

	/** 
	 * Gets the value of idDepartamento
	 */
	public String getIdDepartamento()
	{
		return idDepartamento;
	}

	/**
	 * Method 'DepartamentoPk'
	 * 
	 */
	public DepartamentoPk()
	{
	}

	/**
	 * Method 'DepartamentoPk'
	 * 
	 * @param idDepartamento
	 */
	public DepartamentoPk(final String idDepartamento)
	{
		this.idDepartamento = idDepartamento;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof DepartamentoPk)) {
			return false;
		}
		
		final DepartamentoPk _cast = (DepartamentoPk) _other;
		if (idDepartamento == null ? _cast.idDepartamento != idDepartamento : !idDepartamento.equals( _cast.idDepartamento )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (idDepartamento != null) {
			_hashCode = 29 * _hashCode + idDepartamento.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.akuavida.integracion.dto.DepartamentoPk: " );
		ret.append( "idDepartamento=" + idDepartamento );
		return ret.toString();
	}

}
