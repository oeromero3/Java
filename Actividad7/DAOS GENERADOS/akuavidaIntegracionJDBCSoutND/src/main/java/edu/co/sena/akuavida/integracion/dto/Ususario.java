/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.integracion.dto;

import edu.co.sena.akuavida.integracion.dao.*;
import edu.co.sena.akuavida.integracion.factory.*;
import edu.co.sena.akuavida.integracion.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Ususario implements Serializable
{
	/** 
	 * This attribute maps to the column idUsusario in the ususario table.
	 */
	protected String idUsusario;

	/** 
	 * This attribute maps to the column password in the ususario table.
	 */
	protected String password;

	/** 
	 * This attribute maps to the column rol in the ususario table.
	 */
	protected String rol;

	/** 
	 * This attribute maps to the column estado in the ususario table.
	 */
	protected String estado;

	/**
	 * Method 'Ususario'
	 * 
	 */
	public Ususario()
	{
	}

	/**
	 * Method 'getIdUsusario'
	 * 
	 * @return String
	 */
	public String getIdUsusario()
	{
		return idUsusario;
	}

	/**
	 * Method 'setIdUsusario'
	 * 
	 * @param idUsusario
	 */
	public void setIdUsusario(String idUsusario)
	{
		this.idUsusario = idUsusario;
	}

	/**
	 * Method 'getPassword'
	 * 
	 * @return String
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Method 'setPassword'
	 * 
	 * @param password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * Method 'getRol'
	 * 
	 * @return String
	 */
	public String getRol()
	{
		return rol;
	}

	/**
	 * Method 'setRol'
	 * 
	 * @param rol
	 */
	public void setRol(String rol)
	{
		this.rol = rol;
	}

	/**
	 * Method 'getEstado'
	 * 
	 * @return String
	 */
	public String getEstado()
	{
		return estado;
	}

	/**
	 * Method 'setEstado'
	 * 
	 * @param estado
	 */
	public void setEstado(String estado)
	{
		this.estado = estado;
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
		
		if (!(_other instanceof Ususario)) {
			return false;
		}
		
		final Ususario _cast = (Ususario) _other;
		if (idUsusario == null ? _cast.idUsusario != idUsusario : !idUsusario.equals( _cast.idUsusario )) {
			return false;
		}
		
		if (password == null ? _cast.password != password : !password.equals( _cast.password )) {
			return false;
		}
		
		if (rol == null ? _cast.rol != rol : !rol.equals( _cast.rol )) {
			return false;
		}
		
		if (estado == null ? _cast.estado != estado : !estado.equals( _cast.estado )) {
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
		
		if (password != null) {
			_hashCode = 29 * _hashCode + password.hashCode();
		}
		
		if (rol != null) {
			_hashCode = 29 * _hashCode + rol.hashCode();
		}
		
		if (estado != null) {
			_hashCode = 29 * _hashCode + estado.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return UsusarioPk
	 */
	public UsusarioPk createPk()
	{
		return new UsusarioPk(idUsusario);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.akuavida.integracion.dto.Ususario: " );
		ret.append( "idUsusario=" + idUsusario );
		ret.append( ", password=" + password );
		ret.append( ", rol=" + rol );
		ret.append( ", estado=" + estado );
		return ret.toString();
	}

}
