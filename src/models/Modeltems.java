/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sax.DBConnection;

/**
 *
 * @author sax
 */
public class Modeltems {

    public DBConnection conexion;

    private int id_producto;
    private String producto;
    private String descripcion;
    private float existencias;
    private float precio_compra;
    private float precio_venta;

    private DefaultTableModel tabla_productos;

    public Modeltems() {
        conexion = new DBConnection(3306, "localhost", "acme_store", "root", "toor");
        init();
    }

    /**
     * @return the tabla_productos
     */
    public DefaultTableModel getTabla_productos() {
        return tabla_productos = conexion.getTableModel();
    }

    /**
     * @return the id_prodcuto
     */
    public int getId_producto() {
        return id_producto;
    }

    /**
     * @param id_prodcuto the id_prodcuto to set
     */
    public void setId_producto(int id_prodcuto) {
        this.id_producto = id_prodcuto;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the existencias
     */
    public float getExistencias() {
        return existencias;
    }

    /**
     * @param existencias the existencias to set
     */
    public void setExistencias(float existencias) {
        this.existencias = existencias;
    }

    /**
     * @return the precio_compra
     */
    public float getPrecio_compra() {
        return precio_compra;
    }

    /**
     * @param precio_compra the precio_compra to set
     */
    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }

    /**
     * @return the precio_venta
     */
    public float getPrecio_venta() {
        return precio_venta;
    }

    /**
     * @param precio_venta the precio_venta to set
     */
    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public void setValues() {
        id_producto = conexion.getInteger("id_producto");
        producto = conexion.getString("producto");
        descripcion = conexion.getString("descripcion");
        existencias = conexion.getFloat("existencias");
        precio_compra = conexion.getFloat("precio_compra");
        precio_venta = conexion.getFloat("precio_venta");
    }

    public void init() {
        String sql = "SELECT * FROM productos;";
        conexion.updateTable(sql);
        if (conexion.executeQuery(sql) == false)
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        
        conexion.moveNext();
        setValues();
    }

    public void moveNext() {
        conexion.moveNext();
        setValues();
    }

    public void movePrevious() {
        conexion.movePrevious();
        setValues();
    }
    
    public void moveFirst(){
        conexion.moveFirst();
        setValues();
    }
    
    public void moveLast(){
        conexion.moveLast();
        setValues();
    }
    
    public boolean add(){
        String sql = "INSERT INTO productos("
                + "producto,"
                + "existencias,"
                + "descripcion,"
                + "precio_compra,"
                + "precio_venta) values("
                + "'"+producto+"',"
                + existencias+","
                + "'"+descripcion+"',"
                + precio_compra+","
                + precio_venta+");";
        boolean state = conexion.executeUpdate(sql);
        init();
        return state;
    }
    
//    public boolean edit(){
//        String sql = "UPDATE productos set "
//                + "producto ='" + producto + "', "
//                + "existencias =" +
//                + "descripcion," + descripcion + "."
//                + "precio_compra,"
//                + "precio_venta) values("
//                + "'"+producto+"',"
//                + existencias+","
//                + "'"+descripcion+"',"
//                + precio_compra+","
//                + precio_venta+");";
//        boolean state = conexion.executeUpdate(sql);
//        init();
//        return state;
//    }

}
