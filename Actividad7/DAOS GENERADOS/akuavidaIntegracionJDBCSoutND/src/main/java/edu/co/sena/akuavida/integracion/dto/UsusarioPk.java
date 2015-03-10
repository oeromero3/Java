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
 * This class represents the primary key of the ususario table.
 */
public class UsusarioPk implements Serializable
{
	protected String idUsusario;

	/** 
	 * Sets the value of idUsusario
	 */
	public void setIdUsusario(String idUsusario)
	{
		this.idUsusario = idUsusario;
	}

	/** 
	 * Gets the value of idUsusario
	 */
	public String getIdUsusario()
	{
		return idUsusario;
	}

	/**
	 * Method 'UsusarioPk'
	 * 
	 */
	public UsusarioPk()
	{
	}

	/**
	 * Method 'UsusarioPk'
	 * 
	 * @param idUsusario
	 */
	public UsusarioPk(final String idUsusario)
	{
		this.idUsusario = idUsusario;
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
		
		if (!(_other instanceof UsusarioPk)) {
			return false;
		}
		
		final UsusarioPk _cast = (UsusarioPk) _other;
		if (idUsusario == null ? _cast.idUsusario != idUsusario : !idUsusario.equals( _cast.idUsusario )) {
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
		if (idUsusario != null) {
			_hashCode = 29 * _hashCode + idUsusario.hashCode();
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
		ret.append( "edu.co.sena.akuavida.integracion.dto.UsusarioPk: " );
		ret.append( "idUsusario=" + idUsusario );
		return ret.toString();
	}

}
