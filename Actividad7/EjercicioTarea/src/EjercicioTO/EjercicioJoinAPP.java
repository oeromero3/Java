/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ColsutecR
 */
public class EjercicioJoinAPP {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Connection conexion = null;
        Statement sentecia = null;
        ResultSet rs = null;
     
        double totalFac = 0;
        String idFactura = JOptionPane.showInputDialog("Escriba el Id de la factura");
        String sql = "select item.Cantidad, pro.Nombre, item.Costo_Unitario, item.Costo_Total from akuavida.producto pro inner join  akuavida.item item inner join akuavida.pedido ped inner join akuavida.factura fac\n"
                + "on  pro.ID_producto=item.Producto_ID_producto and ped.Factura_ID_Factura=item.Pedido_Factura_ID_Factura and fac.ID_Factura=item.Pedido_Factura_ID_Factura where fac.ID_Factura='" + idFactura + "'";
        System.out.println(sql);

        try {
            String servidor = "jdbc:mysql://localhost/akuavida";
            String usuarioDB = "root";
            String passwordDB = "123456789";
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Buena se conecto");

            sentecia = conexion.createStatement();

            rs = sentecia.executeQuery(sql);

            List<JoinTO> lista1 = new ArrayList();
            

            if (!rs.wasNull()) {
                
                if (!rs.isFirst()) {
                    rs.beforeFirst();
                }
                rs.absolute(2);
                while (rs.next() == true) {

                    JoinTO itemTemp = new JoinTO();

                    itemTemp.setCantidad(rs.getInt("item.Cantidad"));
                    itemTemp.setNombre(rs.getString("pro.Nombre"));
                    itemTemp.setCostoUnitario(rs.getDouble("item.Costo_Unitario"));
                    itemTemp.setCostoTotal(rs.getDouble("item.Costo_Total"));

                    lista1.add(itemTemp);

                }
            } else {
                System.out.println("NO hay datos");

            }
            for (JoinTO lista11 : lista1) {

                System.out.println(lista11.toString());
                totalFac = totalFac + lista11.getCostoTotal();
                

            }
            System.out.println("La columna valor unitario se encuentra en: " +rs.findColumn("item.Costo_Unitario"));
            System.out.println(rs.last());
            System.out.println("La cantidad de registros son: " + rs.getRow());
            System.out.println("El total de la factura es: " + totalFac);
            System.out.println("Cantidad de columnas es: "+ rs.getMetaData().getColumnCount());

        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            //cerrar statemet
            if (sentecia != null) {
                sentecia.close();
                System.out.println("Se cerro el statemet");

            }
            // cerrar el Resulset
            if (rs != null) {
                rs.close();
                System.out.println("Se cerro en ResultSet");
            }

            // cerrar la conexion
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion");

            }

        }

    }

}
