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

public class Producto implements Serializable
{
	/** 
	 * This attribute maps to the column ID_producto in the producto table.
	 */
	protected String idProducto;

	/** 
	 * This attribute maps to the column Nombre in the producto table.
	 */
	protected String nombre;

	/** 
	 * This attribute maps to the column Precio in the producto table.
	 */
	protected float precio;

	/** 
	 * This attribute maps to the column Imagen in the producto table.
	 */
	protected byte[] imagen;

	/** 
	 * This attribute maps to the column Descripcion in the producto table.
	 */
	protected String descripcion;

	/** 
	 * This attribute maps to the column Cantidad in the producto table.
	 */
	protected int cantidad;

	/** 
	 * This attribute maps to the column Activo in the producto table.
	 */
	protected short activo;

	/** 
	 * This attribute maps to the column impuesto in the producto table.
	 */
	protected float impuesto;

	/** 
	 * This attribute maps to the column Categorias_ID_Categoria in the producto table.
	 */
	protected int categoriasIdCategoria;

	/**
	 * Method 'Producto'
	 * 
	 */
	public Producto()
	{
	}

	/**
	 * Method 'getIdProducto'
	 * 
	 * @return String
	 */
	public String getIdProducto()
	{
		return idProducto;
	}

	/**
	 * Method 'setIdProducto'
	 * 
	 * @param idProducto
	 */
	public void setIdProducto(String idProducto)
	{
		this.idProducto = idProducto;
	}

	/**
	 * Method 'getNombre'
	 * 
	 * @return String
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'setNombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * Method 'getPrecio'
	 * 
	 * @return float
	 */
	public float getPrecio()
	{
		return precio;
	}

	/**
	 * Method 'setPrecio'
	 * 
	 * @param precio
	 */
	public void setPrecio(float precio)
	{
		this.precio = precio;
	}

	/**
	 * Method 'getImagen'
	 * 
	 * @return byte[]
	 */
	public byte[] getImagen()
	{
		return imagen;
	}

	/**
	 * Method 'setImagen'
	 * 
	 * @param imagen
	 */
	public void setImagen(byte[] imagen)
	{
		this.imagen = imagen;
	}

	/**
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}

	/**
	 * Method 'getCantidad'
	 * 
	 * @return int
	 */
	public int getCantidad()
	{
		return cantidad;
	}

	/**
	 * Method 'setCantidad'
	 * 
	 * @param cantidad
	 */
	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}

	/**
	 * Method 'getActivo'
	 * 
	 * @return short
	 */
	public short getActivo()
	{
		return activo;
	}

	/**
	 * Method 'setActivo'
	 * 
	 * @param activo
	 */
	public void setActivo(short activo)
	{
		this.activo = activo;
	}

	/**
	 * Method 'getImpuesto'
	 * 
	 * @return float
	 */
	public float getImpuesto()
	{
		return impuesto;
	}

	/**
	 * Method 'setImpuesto'
	 * 
	 * @param impuesto
	 */
	public void setImpuesto(float impuesto)
	{
		this.impuesto = impuesto;
	}

	/**
	 * Method 'getCategoriasIdCategoria'
	 * 
	 * @return int
	 */
	public int getCategoriasIdCategoria()
	{
		return categoriasIdCategoria;
	}

	/**
	 * Method 'setCategoriasIdCategoria'
	 * 
	 * @param categoriasIdCategoria
	 */
	public void setCategoriasIdCategoria(int categoriasIdCategoria)
	{
		this.categoriasIdCategoria = categoriasIdCategoria;
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
		
		if (!(_other instanceof Producto)) {
			return false;
		}
		
		final Producto _cast = (Producto) _other;
		if (idProducto == null ? _cast.idProducto != idProducto : !idProducto.equals( _cast.idProducto )) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (precio != _cast.precio) {
			return false;
		}
		
		if (imagen == null ? _cast.imagen != imagen : !imagen.equals( _cast.imagen )) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (cantidad != _cast.cantidad) {
			return false;
		}
		
		if (activo != _cast.activo) {
			return false;
		}
		
		if (impuesto != _cast.impuesto) {
			return false;
		}
		
		if (categoriasIdCategoria != _cast.categoriasIdCategoria) {
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
		if (idProducto != null) {
			_hashCode = 29 * _hashCode + idProducto.hashCode();
		}
		
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(precio);
		if (imagen != null) {
			_hashCode = 29 * _hashCode + imagen.hashCode();
		}
		
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + cantidad;
		_hashCode = 29 * _hashCode + (int) activo;
		_hashCode = 29 * _hashCode + Float.floatToIntBits(impuesto);
		_hashCode = 29 * _hashCode + categoriasIdCategoria;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ProductoPk
	 */
	public ProductoPk createPk()
	{
		return new ProductoPk(idProducto);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.akuavida.integracion.dto.Producto: " );
		ret.append( "idProducto=" + idProducto );
		ret.append( ", nombre=" + nombre );
		ret.append( ", precio=" + precio );
		ret.append( ", imagen=" + imagen );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", cantidad=" + cantidad );
		ret.append( ", activo=" + activo );
		ret.append( ", impuesto=" + impuesto );
		ret.append( ", categoriasIdCategoria=" + categoriasIdCategoria );
		return ret.toString();
	}

}
