/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.JOptionPane;
import sax.DBConnection;

/**
 *
 * @author zeo
 */
public class ModelLogin {

    private DBConnection conexion;

    private String usernamename = "";
    private String password = "";

    public ModelLogin() {
        conexion = new DBConnection(3306, "localhost", "acme_store", "root", "toor");
    }

    public String getUser() {
        return usernamename;
    }

    public void setUser(String usernamename) {
        this.usernamename = usernamename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {

        /*
        abierto a SQL Injection
         */
//        String sql = "SELECT username, password FROM usuarios where username='" + username + "' and password = '" + password + "';";
//        System.err.println(sql);
//        conexion.executeQuery(sql);

        /*
            Cerrado a SQL injecction
         */
        
        String cool = "SELECT username, password FROM users where username=? and password=?;";
        conexion.prepareStatement(cool);
        conexion.setPreparedStatement(1, getUser());
        conexion.setPreparedStatement(2, getPassword());
        conexion.executePreparedStatement();

        conexion.moveNext();
        setUser(conexion.getString("username"));
        setPassword(conexion.getString("password"));

        if (getUser() != null) {
            JOptionPane.showMessageDialog(null, "Bienvenido " + getUser());
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }
    }

}
