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
import java.util.Date;

public class Inventario implements Serializable
{
	/** 
	 * This attribute maps to the column ID_Inventario in the inventario table.
	 */
	protected int idInventario;

	/** 
	 * This attribute maps to the column Cantidad in the inventario table.
	 */
	protected int cantidad;

	/** 
	 * This attribute maps to the column Producto_ID_producto in the inventario table.
	 */
	protected String productoIdProducto;

	/** 
	 * This attribute maps to the column Cantidad_Producto_Comprado in the inventario table.
	 */
	protected float cantidadProductoComprado;

	/** 
	 * This attribute maps to the column Fecha_De_Compra in the inventario table.
	 */
	protected Date fechaDeCompra;

	/**
	 * Method 'Inventario'
	 * 
	 */
	public Inventario()
	{
	}

	/**
	 * Method 'getIdInventario'
	 * 
	 * @return int
	 */
	public int getIdInventario()
	{
		return idInventario;
	}

	/**
	 * Method 'setIdInventario'
	 * 
	 * @param idInventario
	 */
	public void setIdInventario(int idInventario)
	{
		this.idInventario = idInventario;
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
	 * Method 'getProductoIdProducto'
	 * 
	 * @return String
	 */
	public String getProductoIdProducto()
	{
		return productoIdProducto;
	}

	/**
	 * Method 'setProductoIdProducto'
	 * 
	 * @param productoIdProducto
	 */
	public void setProductoIdProducto(String productoIdProducto)
	{
		this.productoIdProducto = productoIdProducto;
	}

	/**
	 * Method 'getCantidadProductoComprado'
	 * 
	 * @return float
	 */
	public float getCantidadProductoComprado()
	{
		return cantidadProductoComprado;
	}

	/**
	 * Method 'setCantidadProductoComprado'
	 * 
	 * @param cantidadProductoComprado
	 */
	public void setCantidadProductoComprado(float cantidadProductoComprado)
	{
		this.cantidadProductoComprado = cantidadProductoComprado;
	}

	/**
	 * Method 'getFechaDeCompra'
	 * 
	 * @return Date
	 */
	public Date getFechaDeCompra()
	{
		return fechaDeCompra;
	}

	/**
	 * Method 'setFechaDeCompra'
	 * 
	 * @param fechaDeCompra
	 */
	public void setFechaDeCompra(Date fechaDeCompra)
	{
		this.fechaDeCompra = fechaDeCompra;
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
		
		if (!(_other instanceof Inventario)) {
			return false;
		}
		
		final Inventario _cast = (Inventario) _other;
		if (idInventario != _cast.idInventario) {
			return false;
		}
		
		if (cantidad != _cast.cantidad) {
			return false;
		}
		
		if (productoIdProducto == null ? _cast.productoIdProducto != productoIdProducto : !productoIdProducto.equals( _cast.productoIdProducto )) {
			return false;
		}
		
		if (cantidadProductoComprado != _cast.cantidadProductoComprado) {
			return false;
		}
		
		if (fechaDeCompra == null ? _cast.fechaDeCompra != fechaDeCompra : !fechaDeCompra.equals( _cast.fechaDeCompra )) {
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
		_hashCode = 29 * _hashCode + idInventario;
		_hashCode = 29 * _hashCode + cantidad;
		if (productoIdProducto != null) {
			_hashCode = 29 * _hashCode + productoIdProducto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(cantidadProductoComprado);
		if (fechaDeCompra != null) {
			_hashCode = 29 * _hashCode + fechaDeCompra.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return InventarioPk
	 */
	public InventarioPk createPk()
	{
		return new InventarioPk(idInventario, productoIdProducto);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.akuavida.integracion.dto.Inventario: " );
		ret.append( "idInventario=" + idInventario );
		ret.append( ", cantidad=" + cantidad );
		ret.append( ", productoIdProducto=" + productoIdProducto );
		ret.append( ", cantidadProductoComprado=" + cantidadProductoComprado );
		ret.append( ", fechaDeCompra=" + fechaDeCompra );
		return ret.toString();
	}

}
