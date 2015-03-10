/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.negocio.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.akuavida.integracion.dao.UsusarioDao;
import edu.co.sena.akuavida.integracion.dto.Ususario;
import edu.co.sena.akuavida.integracion.exceptions.UsusarioDaoException;
import edu.co.sena.akuavida.integracion.factory.UsusarioDaoFactory;

public class UsusarioDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findWhereIdUsusarioEquals("");
		// findWherePasswordEquals("");
		// findWhereRolEquals("");
		// findWhereEstadoEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			UsusarioDao _dao = getUsusarioDao();
			Ususario _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdUsusarioEquals'
	 * 
	 * @param idUsusario
	 */
	public static void findWhereIdUsusarioEquals(String idUsusario)
	{
		try {
			UsusarioDao _dao = getUsusarioDao();
			Ususario _result[] = _dao.findWhereIdUsusarioEquals(idUsusario);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWherePasswordEquals'
	 * 
	 * @param password
	 */
	public static void findWherePasswordEquals(String password)
	{
		try {
			UsusarioDao _dao = getUsusarioDao();
			Ususario _result[] = _dao.findWherePasswordEquals(password);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereRolEquals'
	 * 
	 * @param rol
	 */
	public static void findWhereRolEquals(String rol)
	{
		try {
			UsusarioDao _dao = getUsusarioDao();
			Ususario _result[] = _dao.findWhereRolEquals(rol);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereEstadoEquals'
	 * 
	 * @param estado
	 */
	public static void findWhereEstadoEquals(String estado)
	{
		try {
			UsusarioDao _dao = getUsusarioDao();
			Ususario _result[] = _dao.findWhereEstadoEquals(estado);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getUsusarioDao'
	 * 
	 * @return UsusarioDao
	 */
	public static UsusarioDao getUsusarioDao()
	{
		return UsusarioDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Ususario dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdUsusario() );
		buf.append( ", " );
		buf.append( dto.getPassword() );
		buf.append( ", " );
		buf.append( dto.getRol() );
		buf.append( ", " );
		buf.append( dto.getEstado() );
		System.out.println( buf.toString() );
	}

}
