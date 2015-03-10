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
import org.apache.log4j.Logger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class UsusarioDaoImpl extends AbstractDAO implements UsusarioDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	protected static final Logger logger = Logger.getLogger( UsusarioDaoImpl.class );

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT idUsusario, password, rol, estado FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idUsusario, password, rol, estado ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idUsusario = ?, password = ?, rol = ?, estado = ? WHERE idUsusario = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idUsusario = ?";

	/** 
	 * Index of column idUsusario
	 */
	protected static final int COLUMN_ID_USUSARIO = 1;

	/** 
	 * Index of column password
	 */
	protected static final int COLUMN_PASSWORD = 2;

	/** 
	 * Index of column rol
	 */
	protected static final int COLUMN_ROL = 3;

	/** 
	 * Index of column estado
	 */
	protected static final int COLUMN_ESTADO = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column idUsusario
	 */
	protected static final int PK_COLUMN_ID_USUSARIO = 1;

	/** 
	 * Inserts a new row in the ususario table.
	 */
	public UsusarioPk insert(Ususario dto) throws UsusarioDaoException
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
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isIdUsusarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "idUsusario" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isPasswordModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "password" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isRolModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "rol" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isEstadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "estado" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdUsusarioModified()) {
				stmt.setString( index++, dto.getIdUsusario() );
			}
		
			if (dto.isPasswordModified()) {
				stmt.setString( index++, dto.getPassword() );
			}
		
			if (dto.isRolModified()) {
				stmt.setString( index++, dto.getRol() );
			}
		
			if (dto.isEstadoModified()) {
				stmt.setString( index++, dto.getEstado() );
			}
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new UsusarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the ususario table.
	 */
	public void update(UsusarioPk pk, Ususario dto) throws UsusarioDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isIdUsusarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "idUsusario=?" );
				modified=true;
			}
		
			if (dto.isPasswordModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "password=?" );
				modified=true;
			}
		
			if (dto.isRolModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "rol=?" );
				modified=true;
			}
		
			if (dto.isEstadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "estado=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE idUsusario=?" );
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdUsusarioModified()) {
				stmt.setString( index++, dto.getIdUsusario() );
			}
		
			if (dto.isPasswordModified()) {
				stmt.setString( index++, dto.getPassword() );
			}
		
			if (dto.isRolModified()) {
				stmt.setString( index++, dto.getRol() );
			}
		
			if (dto.isEstadoModified()) {
				stmt.setString( index++, dto.getEstado() );
			}
		
			stmt.setString( index++, pk.getIdUsusario() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new UsusarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the ususario table.
	 */
	public void delete(UsusarioPk pk) throws UsusarioDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL_DELETE + " with PK: " + pk);
			}
		
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setString( 1, pk.getIdUsusario() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new UsusarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the ususario table that matches the specified primary-key value.
	 */
	public Ususario findByPrimaryKey(UsusarioPk pk) throws UsusarioDaoException
	{
		return findByPrimaryKey( pk.getIdUsusario() );
	}

	/** 
	 * Returns all rows from the ususario table that match the criteria 'idUsusario = :idUsusario'.
	 */
	public Ususario findByPrimaryKey(String idUsusario) throws UsusarioDaoException
	{
		Ususario ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idUsusario = ?", new Object[] { idUsusario } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the ususario table that match the criteria ''.
	 */
	public Ususario[] findAll() throws UsusarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idUsusario", null );
	}

	/** 
	 * Returns all rows from the ususario table that match the criteria 'idUsusario = :idUsusario'.
	 */
	public Ususario[] findWhereIdUsusarioEquals(String idUsusario) throws UsusarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idUsusario = ? ORDER BY idUsusario", new Object[] { idUsusario } );
	}

	/** 
	 * Returns all rows from the ususario table that match the criteria 'password = :password'.
	 */
	public Ususario[] findWherePasswordEquals(String password) throws UsusarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE password = ? ORDER BY password", new Object[] { password } );
	}

	/** 
	 * Returns all rows from the ususario table that match the criteria 'rol = :rol'.
	 */
	public Ususario[] findWhereRolEquals(String rol) throws UsusarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE rol = ? ORDER BY rol", new Object[] { rol } );
	}

	/** 
	 * Returns all rows from the ususario table that match the criteria 'estado = :estado'.
	 */
	public Ususario[] findWhereEstadoEquals(String estado) throws UsusarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE estado = ? ORDER BY estado", new Object[] { estado } );
	}

	/**
	 * Method 'UsusarioDaoImpl'
	 * 
	 */
	public UsusarioDaoImpl()
	{
	}

	/**
	 * Method 'UsusarioDaoImpl'
	 * 
	 * @param userConn
	 */
	public UsusarioDaoImpl(final java.sql.Connection userConn)
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
		return "akuavida.ususario";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Ususario fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Ususario dto = new Ususario();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Ususario[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Ususario dto = new Ususario();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Ususario ret[] = new Ususario[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Ususario dto, ResultSet rs) throws SQLException
	{
		dto.setIdUsusario( rs.getString( COLUMN_ID_USUSARIO ) );
		dto.setPassword( rs.getString( COLUMN_PASSWORD ) );
		dto.setRol( rs.getString( COLUMN_ROL ) );
		dto.setEstado( rs.getString( COLUMN_ESTADO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Ususario dto)
	{
		dto.setIdUsusarioModified( false );
		dto.setPasswordModified( false );
		dto.setRolModified( false );
		dto.setEstadoModified( false );
	}

	/** 
	 * Returns all rows from the ususario table that match the specified arbitrary SQL statement
	 */
	public Ususario[] findByDynamicSelect(String sql, Object[] sqlParams) throws UsusarioDaoException
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
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
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
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new UsusarioDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the ususario table that match the specified arbitrary SQL statement
	 */
	public Ususario[] findByDynamicWhere(String sql, Object[] sqlParams) throws UsusarioDaoException
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
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
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
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new UsusarioDaoException( "Exception: " + _e.getMessage(), _e );
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
