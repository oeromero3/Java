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
 * This class represents the primary key of the items_del_carrito table.
 */
public class ItemsDelCarritoPk implements Serializable
{
	protected String productoIdProducto;

	protected String carritoDeComprasIdCarrito;

	/** 
	 * Sets the value of productoIdProducto
	 */
	public void setProductoIdProducto(String productoIdProducto)
	{
		this.productoIdProducto = productoIdProducto;
	}

	/** 
	 * Gets the value of productoIdProducto
	 */
	public String getProductoIdProducto()
	{
		return productoIdProducto;
	}

	/** 
	 * Sets the value of carritoDeComprasIdCarrito
	 */
	public void setCarritoDeComprasIdCarrito(String carritoDeComprasIdCarrito)
	{
		this.carritoDeComprasIdCarrito = carritoDeComprasIdCarrito;
	}

	/** 
	 * Gets the value of carritoDeComprasIdCarrito
	 */
	public String getCarritoDeComprasIdCarrito()
	{
		return carritoDeComprasIdCarrito;
	}

	/**
	 * Method 'ItemsDelCarritoPk'
	 * 
	 */
	public ItemsDelCarritoPk()
	{
	}

	/**
	 * Method 'ItemsDelCarritoPk'
	 * 
	 * @param productoIdProducto
	 * @param carritoDeComprasIdCarrito
	 */
	public ItemsDelCarritoPk(final String productoIdProducto, final String carritoDeComprasIdCarrito)
	{
		this.productoIdProducto = productoIdProducto;
		this.carritoDeComprasIdCarrito = carritoDeComprasIdCarrito;
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
		
		if (!(_other instanceof ItemsDelCarritoPk)) {
			return false;
		}
		
		final ItemsDelCarritoPk _cast = (ItemsDelCarritoPk) _other;
		if (productoIdProducto == null ? _cast.productoIdProducto != productoIdProducto : !productoIdProducto.equals( _cast.productoIdProducto )) {
			return false;
		}
		
		if (carritoDeComprasIdCarrito == null ? _cast.carritoDeComprasIdCarrito != carritoDeComprasIdCarrito : !carritoDeComprasIdCarrito.equals( _cast.carritoDeComprasIdCarrito )) {
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
		if (productoIdProducto != null) {
			_hashCode = 29 * _hashCode + productoIdProducto.hashCode();
		}
		
		if (carritoDeComprasIdCarrito != null) {
			_hashCode = 29 * _hashCode + carritoDeComprasIdCarrito.hashCode();
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
		ret.append( "edu.co.sena.akuavida.integracion.dto.ItemsDelCarritoPk: " );
		ret.append( "productoIdProducto=" + productoIdProducto );
		ret.append( ", carritoDeComprasIdCarrito=" + carritoDeComprasIdCarrito );
		return ret.toString();
	}

}
