/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ColsutecR
 */
public class Ejercicio2Cuenta {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;

        String servidor = "jdbc:mysql://localhost/akuavida";
        String usuarioDB = "root";
        String passwordDB = "123456789";

        String b = JOptionPane.showInputDialog("Escriba el tipo de documento ");
        String c = JOptionPane.showInputDialog("Escriba el numero de documento ");
        String sql = "Select * "
                + "FROM akuavida.cuenta cue "
                + "where cue.Tipo_Documento = '" + b + "'"
                + "and " + "cue.Numero_Documento = '" + c + "'"
                + ";";
        System.out.println(sql);
        Cuenta cue1 = new Cuenta();
        try {

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto correctamente");
            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
            System.out.println("_______________");
            rs = sentencia.executeQuery(sql);
            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {

                    cue1.setTipoDocumento(rs.getString("Tipo_Documento"));
                    cue1.setNumeroDocumento(rs.getString("Numero_Documento"));
                    cue1.setPrimerNombre(rs.getString("Primer_Nombre"));
                    cue1.setSegundoNombre(rs.getString("Segundo_Nombre"));
                    cue1.setPrimerApellido(rs.getString("Primer_Apellido"));
                    cue1.setSegundoApellido(rs.getString("Segundo_Apellido"));
                    cue1.setContrasena(rs.getString("Contraseña"));
                    cue1.setCorreo(rs.getString("Correo"));
                    cue1.setDireccion(rs.getString("Direccion"));
                    cue1.setTelefono(rs.getString("Telefono"));
                    cue1.setRool(rs.getString("Rool"));
                    cue1.setActivo(rs.getBoolean("Activo"));
                    cue1.setUsuarioIdUsuario(rs.getString("Ususario_idUsusario"));

                }

                System.out.println(cue1.toString());
            } else {
                System.out.println("No Existen Los Datos");
            }

            System.out.println("_______________");
            boolean resultado = sentencia.execute(sql);
            if (resultado = true) {
                System.out.println("Se pudo ejecutar el programa");
            } else {
                System.out.println("No se pudo ejecutar el programa");
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {

            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro la sentencia correctamente");
            }

            if (!rs.wasNull()) {
                rs.close();
                System.out.println("se cerro el result correctamente");
            }

            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }

        }

    }

}
