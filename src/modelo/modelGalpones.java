/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ubuntu
 */
public class modelGalpones {
private static String nombre;
private static Integer cant;
private static String sexo; 
private static String raza; 
private static String fechanac; 
private static String fechaprod; 
private static String inicioprod; 
private static String fechacese; 
private static String anotacion; 
private static String estado; 
    public static ResultSet queryGalpones() {
        try {

            PreparedStatement pst= conexion.connect().prepareStatement("select * from galpones;");
            
            return pst.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
      ///////////////////////////////////////
    //////////////////////////////////////
    /////////////////////////////////////
    public static String mntoGalpones() {
        try {

            PreparedStatement pst = conexion.connect().prepareStatement("insert into galpones(nombGalpon,cantGalpon,"
                    + "sexoGalpon,"
                    + "razaGalpon,"
                    + "fechaNaciGalpon,"
                    + "fechaProdEstimada,"
                    + "inicioFechaProd,"
                    + "fechaCeseGalpon,"
                    + "anotacionGalpon,"
                    + "estadoGalpon) values(?,?,?,?,?,?,?,?,?,?)");
     pst.setString(1, getNombre());
     pst.setInt(2, getCant());
     pst.setString(3, getSexo());
     pst.setString(4, getRaza());
     pst.setString(5,getFechanac());
     pst.setString(6,getFechaprod());
     pst.setString(7, getInicioprod());
     pst.setString(8,getFechacese());
     pst.setString(9,getAnotacion());
     pst.setString(10,getEstado());
     pst.execute();
     
             return "EJECUTADO CON EXITO.";
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex); 
         return "EJECUTADO SIN EXITO. "+ex;}    }

    /**
     * @return the nombre
     */
    public static String getNombre() {
        return nombre;
    }

    /**
     * @param aNombre the nombre to set
     */
    public static void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * @return the cant
     */
    public static Integer getCant() {
        return cant;
    }

    /**
     * @param aCant the cant to set
     */
    public static void setCant(Integer aCant) {
        cant = aCant;
    }

    /**
     * @return the sexo
     */
    public static String getSexo() {
        return sexo;
    }

    /**
     * @param aSexo the sexo to set
     */
    public static void setSexo(String aSexo) {
        sexo = aSexo;
    }

    /**
     * @return the raza
     */
    public static String getRaza() {
        return raza;
    }

    /**
     * @param aRaza the raza to set
     */
    public static void setRaza(String aRaza) {
        raza = aRaza;
    }

    /**
     * @return the fechanac
     */
    public static String getFechanac() {
        return fechanac;
    }

    /**
     * @param aFechanac the fechanac to set
     */
    public static void setFechanac(String aFechanac) {
        fechanac = aFechanac;
    }

    /**
     * @return the fechaprod
     */
    public static String getFechaprod() {
        return fechaprod;
    }

    /**
     * @param aFechaprod the fechaprod to set
     */
    public static void setFechaprod(String aFechaprod) {
        fechaprod = aFechaprod;
    }

    /**
     * @return the inicioprod
     */
    public static String getInicioprod() {
        return inicioprod;
    }

    /**
     * @param aInicioprod the inicioprod to set
     */
    public static void setInicioprod(String aInicioprod) {
        inicioprod = aInicioprod;
    }

    /**
     * @return the fechacese
     */
    public static String getFechacese() {
        return fechacese;
    }

    /**
     * @param aFechacese the fechacese to set
     */
    public static void setFechacese(String aFechacese) {
        fechacese = aFechacese;
    }

    /**
     * @return the anotacion
     */
    public static String getAnotacion() {
        return anotacion;
    }

    /**
     * @param aAnotacion the anotacion to set
     */
    public static void setAnotacion(String aAnotacion) {
        anotacion = aAnotacion;
    }

    /**
     * @return the estado
     */
    public static String getEstado() {
        return estado;
    }

    /**
     * @param aEstado the estado to set
     */
    public static void setEstado(String aEstado) {
        estado = aEstado;
    }

    
}
