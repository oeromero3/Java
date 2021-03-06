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

public class DepartamentoDaoImpl extends AbstractDAO implements DepartamentoDao
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
	protected final String SQL_SELECT = "SELECT idDepartamento, Nombre_Departamento FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idDepartamento, Nombre_Departamento ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idDepartamento = ?, Nombre_Departamento = ? WHERE idDepartamento = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idDepartamento = ?";

	/** 
	 * Index of column idDepartamento
	 */
	protected static final int COLUMN_ID_DEPARTAMENTO = 1;

	/** 
	 * Index of column Nombre_Departamento
	 */
	protected static final int COLUMN_NOMBRE_DEPARTAMENTO = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column idDepartamento
	 */
	protected static final int PK_COLUMN_ID_DEPARTAMENTO = 1;

	/** 
	 * Inserts a new row in the departamento table.
	 */
	public DepartamentoPk insert(Departamento dto) throws DepartamentoDaoException
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
			stmt.setString( index++, dto.getIdDepartamento() );
			stmt.setString( index++, dto.getNombreDepartamento() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DepartamentoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the departamento table.
	 */
	public void update(DepartamentoPk pk, Departamento dto) throws DepartamentoDaoException
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
			stmt.setString( index++, dto.getIdDepartamento() );
			stmt.setString( index++, dto.getNombreDepartamento() );
			stmt.setString( 3, pk.getIdDepartamento() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DepartamentoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the departamento table.
	 */
	public void delete(DepartamentoPk pk) throws DepartamentoDaoException
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
			stmt.setString( 1, pk.getIdDepartamento() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DepartamentoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the departamento table that matches the specified primary-key value.
	 */
	public Departamento findByPrimaryKey(DepartamentoPk pk) throws DepartamentoDaoException
	{
		return findByPrimaryKey( pk.getIdDepartamento() );
	}

	/** 
	 * Returns all rows from the departamento table that match the criteria 'idDepartamento = :idDepartamento'.
	 */
	public Departamento findByPrimaryKey(String idDepartamento) throws DepartamentoDaoException
	{
		Departamento ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idDepartamento = ?", new Object[] { idDepartamento } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the departamento table that match the criteria ''.
	 */
	public Departamento[] findAll() throws DepartamentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idDepartamento", null );
	}

	/** 
	 * Returns all rows from the departamento table that match the criteria 'idDepartamento = :idDepartamento'.
	 */
	public Departamento[] findWhereIdDepartamentoEquals(String idDepartamento) throws DepartamentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idDepartamento = ? ORDER BY idDepartamento", new Object[] { idDepartamento } );
	}

	/** 
	 * Returns all rows from the departamento table that match the criteria 'Nombre_Departamento = :nombreDepartamento'.
	 */
	public Departamento[] findWhereNombreDepartamentoEquals(String nombreDepartamento) throws DepartamentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Nombre_Departamento = ? ORDER BY Nombre_Departamento", new Object[] { nombreDepartamento } );
	}

	/**
	 * Method 'DepartamentoDaoImpl'
	 * 
	 */
	public DepartamentoDaoImpl()
	{
	}

	/**
	 * Method 'DepartamentoDaoImpl'
	 * 
	 * @param userConn
	 */
	public DepartamentoDaoImpl(final java.sql.Connection userConn)
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
		return "akuavida.departamento";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Departamento fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Departamento dto = new Departamento();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Departamento[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Departamento dto = new Departamento();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Departamento ret[] = new Departamento[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Departamento dto, ResultSet rs) throws SQLException
	{
		dto.setIdDepartamento( rs.getString( COLUMN_ID_DEPARTAMENTO ) );
		dto.setNombreDepartamento( rs.getString( COLUMN_NOMBRE_DEPARTAMENTO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Departamento dto)
	{
	}

	/** 
	 * Returns all rows from the departamento table that match the specified arbitrary SQL statement
	 */
	public Departamento[] findByDynamicSelect(String sql, Object[] sqlParams) throws DepartamentoDaoException
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
			throw new DepartamentoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the departamento table that match the specified arbitrary SQL statement
	 */
	public Departamento[] findByDynamicWhere(String sql, Object[] sqlParams) throws DepartamentoDaoException
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
			throw new DepartamentoDaoException( "Exception: " + _e.getMessage(), _e );
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
