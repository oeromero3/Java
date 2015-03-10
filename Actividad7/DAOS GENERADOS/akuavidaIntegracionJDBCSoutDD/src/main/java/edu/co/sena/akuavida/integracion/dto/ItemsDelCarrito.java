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

public class ItemsDelCarrito implements Serializable
{
	/** 
	 * This attribute maps to the column Producto_ID_producto in the items_del_carrito table.
	 */
	protected String productoIdProducto;

	/** 
	 * This attribute represents whether the attribute productoIdProducto has been modified since being read from the database.
	 */
	protected boolean productoIdProductoModified = false;

	/** 
	 * This attribute maps to the column Cantidad in the items_del_carrito table.
	 */
	protected int cantidad;

	/** 
	 * This attribute represents whether the attribute cantidad has been modified since being read from the database.
	 */
	protected boolean cantidadModified = false;

	/** 
	 * This attribute maps to the column Costo_Unitario in the items_del_carrito table.
	 */
	protected float costoUnitario;

	/** 
	 * This attribute represents whether the attribute costoUnitario has been modified since being read from the database.
	 */
	protected boolean costoUnitarioModified = false;

	/** 
	 * This attribute maps to the column Costo_Total in the items_del_carrito table.
	 */
	protected float costoTotal;

	/** 
	 * This attribute represents whether the attribute costoTotal has been modified since being read from the database.
	 */
	protected boolean costoTotalModified = false;

	/** 
	 * This attribute maps to the column Carrito_De_Compras_ID_Carrito in the items_del_carrito table.
	 */
	protected String carritoDeComprasIdCarrito;

	/** 
	 * This attribute represents whether the attribute carritoDeComprasIdCarrito has been modified since being read from the database.
	 */
	protected boolean carritoDeComprasIdCarritoModified = false;

	/**
	 * Method 'ItemsDelCarrito'
	 * 
	 */
	public ItemsDelCarrito()
	{
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
		this.productoIdProductoModified = true;
	}

	/** 
	 * Sets the value of productoIdProductoModified
	 */
	public void setProductoIdProductoModified(boolean productoIdProductoModified)
	{
		this.productoIdProductoModified = productoIdProductoModified;
	}

	/** 
	 * Gets the value of productoIdProductoModified
	 */
	public boolean isProductoIdProductoModified()
	{
		return productoIdProductoModified;
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
		this.cantidadModified = true;
	}

	/** 
	 * Sets the value of cantidadModified
	 */
	public void setCantidadModified(boolean cantidadModified)
	{
		this.cantidadModified = cantidadModified;
	}

	/** 
	 * Gets the value of cantidadModified
	 */
	public boolean isCantidadModified()
	{
		return cantidadModified;
	}

	/**
	 * Method 'getCostoUnitario'
	 * 
	 * @return float
	 */
	public float getCostoUnitario()
	{
		return costoUnitario;
	}

	/**
	 * Method 'setCostoUnitario'
	 * 
	 * @param costoUnitario
	 */
	public void setCostoUnitario(float costoUnitario)
	{
		this.costoUnitario = costoUnitario;
		this.costoUnitarioModified = true;
	}

	/** 
	 * Sets the value of costoUnitarioModified
	 */
	public void setCostoUnitarioModified(boolean costoUnitarioModified)
	{
		this.costoUnitarioModified = costoUnitarioModified;
	}

	/** 
	 * Gets the value of costoUnitarioModified
	 */
	public boolean isCostoUnitarioModified()
	{
		return costoUnitarioModified;
	}

	/**
	 * Method 'getCostoTotal'
	 * 
	 * @return float
	 */
	public float getCostoTotal()
	{
		return costoTotal;
	}

	/**
	 * Method 'setCostoTotal'
	 * 
	 * @param costoTotal
	 */
	public void setCostoTotal(float costoTotal)
	{
		this.costoTotal = costoTotal;
		this.costoTotalModified = true;
	}

	/** 
	 * Sets the value of costoTotalModified
	 */
	public void setCostoTotalModified(boolean costoTotalModified)
	{
		this.costoTotalModified = costoTotalModified;
	}

	/** 
	 * Gets the value of costoTotalModified
	 */
	public boolean isCostoTotalModified()
	{
		return costoTotalModified;
	}

	/**
	 * Method 'getCarritoDeComprasIdCarrito'
	 * 
	 * @return String
	 */
	public String getCarritoDeComprasIdCarrito()
	{
		return carritoDeComprasIdCarrito;
	}

	/**
	 * Method 'setCarritoDeComprasIdCarrito'
	 * 
	 * @param carritoDeComprasIdCarrito
	 */
	public void setCarritoDeComprasIdCarrito(String carritoDeComprasIdCarrito)
	{
		this.carritoDeComprasIdCarrito = carritoDeComprasIdCarrito;
		this.carritoDeComprasIdCarritoModified = true;
	}

	/** 
	 * Sets the value of carritoDeComprasIdCarritoModified
	 */
	public void setCarritoDeComprasIdCarritoModified(boolean carritoDeComprasIdCarritoModified)
	{
		this.carritoDeComprasIdCarritoModified = carritoDeComprasIdCarritoModified;
	}

	/** 
	 * Gets the value of carritoDeComprasIdCarritoModified
	 */
	public boolean isCarritoDeComprasIdCarritoModified()
	{
		return carritoDeComprasIdCarritoModified;
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
		
		if (!(_other instanceof ItemsDelCarrito)) {
			return false;
		}
		
		final ItemsDelCarrito _cast = (ItemsDelCarrito) _other;
		if (productoIdProducto == null ? _cast.productoIdProducto != productoIdProducto : !productoIdProducto.equals( _cast.productoIdProducto )) {
			return false;
		}
		
		if (productoIdProductoModified != _cast.productoIdProductoModified) {
			return false;
		}
		
		if (cantidad != _cast.cantidad) {
			return false;
		}
		
		if (cantidadModified != _cast.cantidadModified) {
			return false;
		}
		
		if (costoUnitario != _cast.costoUnitario) {
			return false;
		}
		
		if (costoUnitarioModified != _cast.costoUnitarioModified) {
			return false;
		}
		
		if (costoTotal != _cast.costoTotal) {
			return false;
		}
		
		if (costoTotalModified != _cast.costoTotalModified) {
			return false;
		}
		
		if (carritoDeComprasIdCarrito == null ? _cast.carritoDeComprasIdCarrito != carritoDeComprasIdCarrito : !carritoDeComprasIdCarrito.equals( _cast.carritoDeComprasIdCarrito )) {
			return false;
		}
		
		if (carritoDeComprasIdCarritoModified != _cast.carritoDeComprasIdCarritoModified) {
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
		
		_hashCode = 29 * _hashCode + (productoIdProductoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + cantidad;
		_hashCode = 29 * _hashCode + (cantidadModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(costoUnitario);
		_hashCode = 29 * _hashCode + (costoUnitarioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(costoTotal);
		_hashCode = 29 * _hashCode + (costoTotalModified ? 1 : 0);
		if (carritoDeComprasIdCarrito != null) {
			_hashCode = 29 * _hashCode + carritoDeComprasIdCarrito.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (carritoDeComprasIdCarritoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ItemsDelCarritoPk
	 */
	public ItemsDelCarritoPk createPk()
	{
		return new ItemsDelCarritoPk(productoIdProducto, carritoDeComprasIdCarrito);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.akuavida.integracion.dto.ItemsDelCarrito: " );
		ret.append( "productoIdProducto=" + productoIdProducto );
		ret.append( ", cantidad=" + cantidad );
		ret.append( ", costoUnitario=" + costoUnitario );
		ret.append( ", costoTotal=" + costoTotal );
		ret.append( ", carritoDeComprasIdCarrito=" + carritoDeComprasIdCarrito );
		return ret.toString();
	}

}
