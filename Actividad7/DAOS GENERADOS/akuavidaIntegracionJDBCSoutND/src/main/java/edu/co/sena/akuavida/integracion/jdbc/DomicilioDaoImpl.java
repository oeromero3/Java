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

public class DomicilioDaoImpl extends AbstractDAO implements DomicilioDao
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
	protected final String SQL_SELECT = "SELECT Municipio_idMunicipio, Cuenta_Tipo_Documento, Cuenta_Numero_Documento, Ciudad, Direccion, Telefono FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( Municipio_idMunicipio, Cuenta_Tipo_Documento, Cuenta_Numero_Documento, Ciudad, Direccion, Telefono ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET Municipio_idMunicipio = ?, Cuenta_Tipo_Documento = ?, Cuenta_Numero_Documento = ?, Ciudad = ?, Direccion = ?, Telefono = ? WHERE Cuenta_Tipo_Documento = ? AND Cuenta_Numero_Documento = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE Cuenta_Tipo_Documento = ? AND Cuenta_Numero_Documento = ?";

	/** 
	 * Index of column Municipio_idMunicipio
	 */
	protected static final int COLUMN_MUNICIPIO_IDMUNICIPIO = 1;

	/** 
	 * Index of column Cuenta_Tipo_Documento
	 */
	protected static final int COLUMN_CUENTA_TIPO_DOCUMENTO = 2;

	/** 
	 * Index of column Cuenta_Numero_Documento
	 */
	protected static final int COLUMN_CUENTA_NUMERO_DOCUMENTO = 3;

	/** 
	 * Index of column Ciudad
	 */
	protected static final int COLUMN_CIUDAD = 4;

	/** 
	 * Index of column Direccion
	 */
	protected static final int COLUMN_DIRECCION = 5;

	/** 
	 * Index of column Telefono
	 */
	protected static final int COLUMN_TELEFONO = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column Cuenta_Tipo_Documento
	 */
	protected static final int PK_COLUMN_CUENTA_TIPO_DOCUMENTO = 1;

	/** 
	 * Index of primary-key column Cuenta_Numero_Documento
	 */
	protected static final int PK_COLUMN_CUENTA_NUMERO_DOCUMENTO = 2;

	/** 
	 * Inserts a new row in the domicilio table.
	 */
	public DomicilioPk insert(Domicilio dto) throws DomicilioDaoException
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
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setString( index++, dto.getMunicipioIdmunicipio() );
			stmt.setString( index++, dto.getCuentaTipoDocumento() );
			stmt.setString( index++, dto.getCuentaNumeroDocumento() );
			stmt.setString( index++, dto.getCiudad() );
			stmt.setString( index++, dto.getDireccion() );
			stmt.setString( index++, dto.getTelefono() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DomicilioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the domicilio table.
	 */
	public void update(DomicilioPk pk, Domicilio dto) throws DomicilioDaoException
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
			stmt.setString( index++, dto.getMunicipioIdmunicipio() );
			stmt.setString( index++, dto.getCuentaTipoDocumento() );
			stmt.setString( index++, dto.getCuentaNumeroDocumento() );
			stmt.setString( index++, dto.getCiudad() );
			stmt.setString( index++, dto.getDireccion() );
			stmt.setString( index++, dto.getTelefono() );
			stmt.setString( 7, pk.getCuentaTipoDocumento() );
			stmt.setString( 8, pk.getCuentaNumeroDocumento() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DomicilioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the domicilio table.
	 */
	public void delete(DomicilioPk pk) throws DomicilioDaoException
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
			stmt.setString( 1, pk.getCuentaTipoDocumento() );
			stmt.setString( 2, pk.getCuentaNumeroDocumento() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DomicilioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the domicilio table that matches the specified primary-key value.
	 */
	public Domicilio findByPrimaryKey(DomicilioPk pk) throws DomicilioDaoException
	{
		return findByPrimaryKey( pk.getCuentaTipoDocumento(), pk.getCuentaNumeroDocumento() );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'Cuenta_Tipo_Documento = :cuentaTipoDocumento AND Cuenta_Numero_Documento = :cuentaNumeroDocumento'.
	 */
	public Domicilio findByPrimaryKey(String cuentaTipoDocumento, String cuentaNumeroDocumento) throws DomicilioDaoException
	{
		Domicilio ret[] = findByDynamicSelect( SQL_SELECT + " WHERE Cuenta_Tipo_Documento = ? AND Cuenta_Numero_Documento = ?", new Object[] { cuentaTipoDocumento, cuentaNumeroDocumento } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria ''.
	 */
	public Domicilio[] findAll() throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY Cuenta_Tipo_Documento, Cuenta_Numero_Documento", null );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'Cuenta_Tipo_Documento = :cuentaTipoDocumento AND Cuenta_Numero_Documento = :cuentaNumeroDocumento'.
	 */
	public Domicilio[] findByCuenta(String cuentaTipoDocumento, String cuentaNumeroDocumento) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Cuenta_Tipo_Documento = ? AND Cuenta_Numero_Documento = ?", new Object[] { cuentaTipoDocumento, cuentaNumeroDocumento } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'Municipio_idMunicipio = :municipioIdmunicipio'.
	 */
	public Domicilio[] findByMunicipio(String municipioIdmunicipio) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Municipio_idMunicipio = ?", new Object[] { municipioIdmunicipio } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'Municipio_idMunicipio = :municipioIdmunicipio'.
	 */
	public Domicilio[] findWhereMunicipioIdmunicipioEquals(String municipioIdmunicipio) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Municipio_idMunicipio = ? ORDER BY Municipio_idMunicipio", new Object[] { municipioIdmunicipio } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'Cuenta_Tipo_Documento = :cuentaTipoDocumento'.
	 */
	public Domicilio[] findWhereCuentaTipoDocumentoEquals(String cuentaTipoDocumento) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Cuenta_Tipo_Documento = ? ORDER BY Cuenta_Tipo_Documento", new Object[] { cuentaTipoDocumento } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'Cuenta_Numero_Documento = :cuentaNumeroDocumento'.
	 */
	public Domicilio[] findWhereCuentaNumeroDocumentoEquals(String cuentaNumeroDocumento) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Cuenta_Numero_Documento = ? ORDER BY Cuenta_Numero_Documento", new Object[] { cuentaNumeroDocumento } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'Ciudad = :ciudad'.
	 */
	public Domicilio[] findWhereCiudadEquals(String ciudad) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Ciudad = ? ORDER BY Ciudad", new Object[] { ciudad } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'Direccion = :direccion'.
	 */
	public Domicilio[] findWhereDireccionEquals(String direccion) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Direccion = ? ORDER BY Direccion", new Object[] { direccion } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'Telefono = :telefono'.
	 */
	public Domicilio[] findWhereTelefonoEquals(String telefono) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Telefono = ? ORDER BY Telefono", new Object[] { telefono } );
	}

	/**
	 * Method 'DomicilioDaoImpl'
	 * 
	 */
	public DomicilioDaoImpl()
	{
	}

	/**
	 * Method 'DomicilioDaoImpl'
	 * 
	 * @param userConn
	 */
	public DomicilioDaoImpl(final java.sql.Connection userConn)
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
		return "akuavida.domicilio";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Domicilio fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Domicilio dto = new Domicilio();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Domicilio[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Domicilio dto = new Domicilio();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Domicilio ret[] = new Domicilio[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Domicilio dto, ResultSet rs) throws SQLException
	{
		dto.setMunicipioIdmunicipio( rs.getString( COLUMN_MUNICIPIO_IDMUNICIPIO ) );
		dto.setCuentaTipoDocumento( rs.getString( COLUMN_CUENTA_TIPO_DOCUMENTO ) );
		dto.setCuentaNumeroDocumento( rs.getString( COLUMN_CUENTA_NUMERO_DOCUMENTO ) );
		dto.setCiudad( rs.getString( COLUMN_CIUDAD ) );
		dto.setDireccion( rs.getString( COLUMN_DIRECCION ) );
		dto.setTelefono( rs.getString( COLUMN_TELEFONO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Domicilio dto)
	{
	}

	/** 
	 * Returns all rows from the domicilio table that match the specified arbitrary SQL statement
	 */
	public Domicilio[] findByDynamicSelect(String sql, Object[] sqlParams) throws DomicilioDaoException
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
			throw new DomicilioDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the domicilio table that match the specified arbitrary SQL statement
	 */
	public Domicilio[] findByDynamicWhere(String sql, Object[] sqlParams) throws DomicilioDaoException
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
			throw new DomicilioDaoException( "Exception: " + _e.getMessage(), _e );
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