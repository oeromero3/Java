/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.integracion.jdbc;

import edu.co.sena.akuavida.integracion.dao.*;
import edu.co.sena.akuavida.integracion.factory.*;
import java.util.Date;
import edu.co.sena.akuavida.integracion.dto.*;
import edu.co.sena.akuavida.integracion.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class FacturaDaoImpl extends AbstractDAO implements FacturaDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT ID_Factura, Fecha, Cuenta_Tipo_Documento, Cuenta_Numero_Documento FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_Factura, Fecha, Cuenta_Tipo_Documento, Cuenta_Numero_Documento ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_Factura = ?, Fecha = ?, Cuenta_Tipo_Documento = ?, Cuenta_Numero_Documento = ? WHERE ID_Factura = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_Factura = ?";

	/** 
	 * Index of column ID_Factura
	 */
	protected static final int COLUMN_ID_FACTURA = 1;

	/** 
	 * Index of column Fecha
	 */
	protected static final int COLUMN_FECHA = 2;

	/** 
	 * Index of column Cuenta_Tipo_Documento
	 */
	protected static final int COLUMN_CUENTA_TIPO_DOCUMENTO = 3;

	/** 
	 * Index of column Cuenta_Numero_Documento
	 */
	protected static final int COLUMN_CUENTA_NUMERO_DOCUMENTO = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column ID_Factura
	 */
	protected static final int PK_COLUMN_ID_FACTURA = 1;

	/** 
	 * Inserts a new row in the factura table.
	 */
	public FacturaPk insert(Factura dto) throws FacturaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT, Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			stmt.setInt( index++, dto.getIdFactura() );
			stmt.setDate(index++, dto.getFecha()==null ? null : new java.sql.Date( dto.getFecha().getTime() ) );
			stmt.setString( index++, dto.getCuentaTipoDocumento() );
			stmt.setString( index++, dto.getCuentaNumeroDocumento() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdFactura( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FacturaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the factura table.
	 */
	public void update(FacturaPk pk, Factura dto) throws FacturaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getIdFactura() );
			stmt.setDate(index++, dto.getFecha()==null ? null : new java.sql.Date( dto.getFecha().getTime() ) );
			stmt.setString( index++, dto.getCuentaTipoDocumento() );
			stmt.setString( index++, dto.getCuentaNumeroDocumento() );
			stmt.setInt( 5, pk.getIdFactura() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FacturaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the factura table.
	 */
	public void delete(FacturaPk pk) throws FacturaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getIdFactura() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FacturaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the factura table that matches the specified primary-key value.
	 */
	public Factura findByPrimaryKey(FacturaPk pk) throws FacturaDaoException
	{
		return findByPrimaryKey( pk.getIdFactura() );
	}

	/** 
	 * Returns all rows from the factura table that match the criteria 'ID_Factura = :idFactura'.
	 */
	public Factura findByPrimaryKey(int idFactura) throws FacturaDaoException
	{
		Factura ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_Factura = ?", new Object[] {  new Integer(idFactura) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the factura table that match the criteria ''.
	 */
	public Factura[] findAll() throws FacturaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_Factura", null );
	}

	/** 
	 * Returns all rows from the factura table that match the criteria 'Cuenta_Tipo_Documento = :cuentaTipoDocumento AND Cuenta_Numero_Documento = :cuentaNumeroDocumento'.
	 */
	public Factura[] findByCuenta(String cuentaTipoDocumento, String cuentaNumeroDocumento) throws FacturaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Cuenta_Tipo_Documento = ? AND Cuenta_Numero_Documento = ?", new Object[] { cuentaTipoDocumento, cuentaNumeroDocumento } );
	}

	/** 
	 * Returns all rows from the factura table that match the criteria 'ID_Factura = :idFactura'.
	 */
	public Factura[] findWhereIdFacturaEquals(int idFactura) throws FacturaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_Factura = ? ORDER BY ID_Factura", new Object[] {  new Integer(idFactura) } );
	}

	/** 
	 * Returns all rows from the factura table that match the criteria 'Fecha = :fecha'.
	 */
	public Factura[] findWhereFechaEquals(Date fecha) throws FacturaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Fecha = ? ORDER BY Fecha", new Object[] { fecha==null ? null : new java.sql.Date( fecha.getTime() ) } );
	}

	/** 
	 * Returns all rows from the factura table that match the criteria 'Cuenta_Tipo_Documento = :cuentaTipoDocumento'.
	 */
	public Factura[] findWhereCuentaTipoDocumentoEquals(String cuentaTipoDocumento) throws FacturaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Cuenta_Tipo_Documento = ? ORDER BY Cuenta_Tipo_Documento", new Object[] { cuentaTipoDocumento } );
	}

	/** 
	 * Returns all rows from the factura table that match the criteria 'Cuenta_Numero_Documento = :cuentaNumeroDocumento'.
	 */
	public Factura[] findWhereCuentaNumeroDocumentoEquals(String cuentaNumeroDocumento) throws FacturaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Cuenta_Numero_Documento = ? ORDER BY Cuenta_Numero_Documento", new Object[] { cuentaNumeroDocumento } );
	}

	/**
	 * Method 'FacturaDaoImpl'
	 * 
	 */
	public FacturaDaoImpl()
	{
	}

	/**
	 * Method 'FacturaDaoImpl'
	 * 
	 * @param userConn
	 */
	public FacturaDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "akuavida.factura";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Factura fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Factura dto = new Factura();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Factura[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Factura dto = new Factura();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Factura ret[] = new Factura[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Factura dto, ResultSet rs) throws SQLException
	{
		dto.setIdFactura( rs.getInt( COLUMN_ID_FACTURA ) );
		dto.setFecha( rs.getDate(COLUMN_FECHA ) );
		dto.setCuentaTipoDocumento( rs.getString( COLUMN_CUENTA_TIPO_DOCUMENTO ) );
		dto.setCuentaNumeroDocumento( rs.getString( COLUMN_CUENTA_NUMERO_DOCUMENTO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Factura dto)
	{
	}

	/** 
	 * Returns all rows from the factura table that match the specified arbitrary SQL statement
	 */
	public Factura[] findByDynamicSelect(String sql, Object[] sqlParams) throws FacturaDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FacturaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the factura table that match the specified arbitrary SQL statement
	 */
	public Factura[] findByDynamicWhere(String sql, Object[] sqlParams) throws FacturaDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FacturaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
