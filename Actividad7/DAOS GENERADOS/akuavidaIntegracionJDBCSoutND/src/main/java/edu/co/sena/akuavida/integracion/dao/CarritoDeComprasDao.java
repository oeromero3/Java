/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.integracion.dao;

import edu.co.sena.akuavida.integracion.dto.*;
import edu.co.sena.akuavida.integracion.exceptions.*;

public interface CarritoDeComprasDao
{
	/** 
	 * Inserts a new row in the carrito_de_compras table.
	 */
	public CarritoDeComprasPk insert(CarritoDeCompras dto) throws CarritoDeComprasDaoException;

	/** 
	 * Updates a single row in the carrito_de_compras table.
	 */
	public void update(CarritoDeComprasPk pk, CarritoDeCompras dto) throws CarritoDeComprasDaoException;

	/** 
	 * Deletes a single row in the carrito_de_compras table.
	 */
	public void delete(CarritoDeComprasPk pk) throws CarritoDeComprasDaoException;

	/** 
	 * Returns the rows from the carrito_de_compras table that matches the specified primary-key value.
	 */
	public CarritoDeCompras findByPrimaryKey(CarritoDeComprasPk pk) throws CarritoDeComprasDaoException;

	/** 
	 * Returns all rows from the carrito_de_compras table that match the criteria 'ID_Carrito = :idCarrito'.
	 */
	public CarritoDeCompras findByPrimaryKey(String idCarrito) throws CarritoDeComprasDaoException;

	/** 
	 * Returns all rows from the carrito_de_compras table that match the criteria ''.
	 */
	public CarritoDeCompras[] findAll() throws CarritoDeComprasDaoException;

	/** 
	 * Returns all rows from the carrito_de_compras table that match the criteria 'ID_Carrito = :idCarrito'.
	 */
	public CarritoDeCompras[] findWhereIdCarritoEquals(String idCarrito) throws CarritoDeComprasDaoException;

	/** 
	 * Returns all rows from the carrito_de_compras table that match the criteria 'Total = :total'.
	 */
	public CarritoDeCompras[] findWhereTotalEquals(float total) throws CarritoDeComprasDaoException;

	/** 
	 * Returns all rows from the carrito_de_compras table that match the criteria 'Subtotal = :subtotal'.
	 */
	public CarritoDeCompras[] findWhereSubtotalEquals(float subtotal) throws CarritoDeComprasDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the carrito_de_compras table that match the specified arbitrary SQL statement
	 */
	public CarritoDeCompras[] findByDynamicSelect(String sql, Object[] sqlParams) throws CarritoDeComprasDaoException;

	/** 
	 * Returns all rows from the carrito_de_compras table that match the specified arbitrary SQL statement
	 */
	public CarritoDeCompras[] findByDynamicWhere(String sql, Object[] sqlParams) throws CarritoDeComprasDaoException;

}
