/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.integracion.dao;

import java.util.Date;
import edu.co.sena.akuavida.integracion.dto.*;
import edu.co.sena.akuavida.integracion.exceptions.*;

public interface InventarioDao
{
	/** 
	 * Inserts a new row in the inventario table.
	 */
	public InventarioPk insert(Inventario dto) throws InventarioDaoException;

	/** 
	 * Updates a single row in the inventario table.
	 */
	public void update(InventarioPk pk, Inventario dto) throws InventarioDaoException;

	/** 
	 * Deletes a single row in the inventario table.
	 */
	public void delete(InventarioPk pk) throws InventarioDaoException;

	/** 
	 * Returns the rows from the inventario table that matches the specified primary-key value.
	 */
	public Inventario findByPrimaryKey(InventarioPk pk) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'ID_Inventario = :idInventario AND Producto_ID_producto = :productoIdProducto'.
	 */
	public Inventario findByPrimaryKey(int idInventario, String productoIdProducto) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria ''.
	 */
	public Inventario[] findAll() throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Producto_ID_producto = :productoIdProducto'.
	 */
	public Inventario[] findByProducto(String productoIdProducto) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'ID_Inventario = :idInventario'.
	 */
	public Inventario[] findWhereIdInventarioEquals(int idInventario) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Cantidad = :cantidad'.
	 */
	public Inventario[] findWhereCantidadEquals(int cantidad) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Producto_ID_producto = :productoIdProducto'.
	 */
	public Inventario[] findWhereProductoIdProductoEquals(String productoIdProducto) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Cantidad_Producto_Comprado = :cantidadProductoComprado'.
	 */
	public Inventario[] findWhereCantidadProductoCompradoEquals(float cantidadProductoComprado) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Fecha_De_Compra = :fechaDeCompra'.
	 */
	public Inventario[] findWhereFechaDeCompraEquals(Date fechaDeCompra) throws InventarioDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the inventario table that match the specified arbitrary SQL statement
	 */
	public Inventario[] findByDynamicSelect(String sql, Object[] sqlParams) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the specified arbitrary SQL statement
	 */
	public Inventario[] findByDynamicWhere(String sql, Object[] sqlParams) throws InventarioDaoException;

}
