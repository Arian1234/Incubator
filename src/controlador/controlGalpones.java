/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.conexion;
import modelo.modelGalpones;
import vista.JIFGalpones;
import vista.main;

/**
 *
 * @author ubuntu
 */
public class controlGalpones {
    public static ResultSet consultarGalpones(DefaultTableModel dtm) {
        dtm = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int column) {
                return false;
            }
        };
        //COLUMNAS DE LA TABLA
        dtm.addColumn("###");
        dtm.addColumn("NOMBRE");
        dtm.addColumn("CANT.");
        dtm.addColumn("SEXO");
        dtm.addColumn("RAZA");
        dtm.addColumn("F. NACIMIENTO");
        dtm.addColumn("F. PROD. ESTIM.");
        dtm.addColumn("INICIO PROD.");
        dtm.addColumn("CESE PROD.");
        dtm.addColumn("ANOTACION");
        dtm.addColumn("ESTADO");
        JIFGalpones.jTableGalpones.setModel(dtm);
        try {
            JIFGalpones.jTableGalpones.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(Color.DARK_GRAY, Color.WHITE));
            JIFGalpones.jTableGalpones.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(Color.DARK_GRAY, Color.WHITE));
            JIFGalpones.jTableGalpones.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(Color.DARK_GRAY, Color.WHITE));
            JIFGalpones.jTableGalpones.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(Color.DARK_GRAY, Color.WHITE));
            JIFGalpones.jTableGalpones.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(Color.DARK_GRAY, Color.WHITE));
            JIFGalpones.jTableGalpones.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(Color.DARK_GRAY, Color.WHITE));
            JIFGalpones.jTableGalpones.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(Color.DARK_GRAY, Color.WHITE));
            JIFGalpones.jTableGalpones.getColumnModel().getColumn(8).setHeaderRenderer(new MyRenderer(Color.DARK_GRAY, Color.WHITE));
            JIFGalpones.jTableGalpones.getColumnModel().getColumn(9).setHeaderRenderer(new MyRenderer(Color.DARK_GRAY, Color.WHITE));
            JIFGalpones.jTableGalpones.getColumnModel().getColumn(10).setHeaderRenderer(new MyRenderer(Color.DARK_GRAY, Color.WHITE));
//            Clientes.jTableClientes.getColumnModel().getColumn(3).setMaxWidth(0);
//            Clientes.jTableClientes.getColumnModel().getColumn(3).setMinWidth(0);
//            Clientes.jTableClientes.getColumnModel().getColumn(3).setWidth(0);
//            Clientes.jTableClientes.getColumnModel().getColumn(3).setPreferredWidth(0);
            JIFGalpones.jTableGalpones.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(Color.DARK_GRAY, Color.WHITE));

            
            ResultSet rs = modelGalpones.queryGalpones();
            while (rs.next()) {
                Object[] obj = new Object[11];
                for (int i = 0; i < 11; i++) {
                    obj[i] = rs.getString(i + 1);

                }
                dtm.addRow(obj);
            }
            conexion.close();

        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }  
}
