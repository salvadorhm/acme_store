/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.KeyEvent;

/**
 *
 * @author sax
 */
public class ViewItems extends javax.swing.JPanel {

    /**
     * Creates new form ViewItems
     */
    public ViewItems() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpDatos = new javax.swing.JPanel();
        jlId = new javax.swing.JLabel();
        jtfId_producto = new javax.swing.JTextField();
        jlProducto = new javax.swing.JLabel();
        jtfProducto = new javax.swing.JTextField();
        jlExistencias = new javax.swing.JLabel();
        jtfExistencias = new javax.swing.JTextField();
        jlDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jlPrecioCompra = new javax.swing.JLabel();
        jtfPrecioCompra = new javax.swing.JTextField();
        jlPrecioVenta = new javax.swing.JLabel();
        jtfPrecioVenta = new javax.swing.JTextField();
        jpControles = new javax.swing.JPanel();
        jbtnAnterior = new javax.swing.JButton();
        jbtnSiguiente = new javax.swing.JButton();
        jbtnPrimero = new javax.swing.JButton();
        jbtnUltimo = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnAgregar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnBuscar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jpTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtRegistros = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Productos");
        jLabel1.setOpaque(true);

        jpDatos.setBackground(new java.awt.Color(255, 255, 255));

        jlId.setText("ID");

        jtfId_producto.setEditable(false);

        jlProducto.setText("Producto");

        jtfProducto.setEditable(false);
        jtfProducto.setNextFocusableComponent(jtfPrecioCompra);

        jlExistencias.setText("Existencias");

        jtfExistencias.setEditable(false);
        jtfExistencias.setNextFocusableComponent(jtfPrecioVenta);

        jlDescripcion.setText("Descripción");

        jtaDescripcion.setEditable(false);
        jtaDescripcion.setColumns(20);
        jtaDescripcion.setRows(5);
        jScrollPane2.setViewportView(jtaDescripcion);

        jlPrecioCompra.setText("Precio Compra");

        jtfPrecioCompra.setEditable(false);
        jtfPrecioCompra.setNextFocusableComponent(jtfExistencias);

        jlPrecioVenta.setText("Precio Venta");

        jtfPrecioVenta.setEditable(false);
        jtfPrecioVenta.setNextFocusableComponent(jtaDescripcion);

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDescripcion)
                            .addComponent(jlExistencias)
                            .addComponent(jlProducto))
                        .addGap(18, 18, 18)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(jpDatosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfId_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfProducto)
                                        .addComponent(jtfExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(39, 39, 39)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlPrecioCompra)
                            .addComponent(jlPrecioVenta))
                        .addGap(18, 18, 18)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlId))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId)
                    .addComponent(jtfId_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPrecioCompra)
                    .addComponent(jtfPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPrecioVenta)
                    .addComponent(jtfPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlExistencias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescripcion)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpControles.setBackground(new java.awt.Color(255, 255, 255));

        jbtnAnterior.setMnemonic('K');
        jbtnAnterior.setText("<<");
        jbtnAnterior.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnAnterior.setMinimumSize(new java.awt.Dimension(100, 100));

        jbtnSiguiente.setText(">>");
        jbtnSiguiente.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnSiguiente.setMinimumSize(new java.awt.Dimension(100, 100));

        jbtnPrimero.setText("|<");
        jbtnPrimero.setToolTipText("");
        jbtnPrimero.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnPrimero.setMinimumSize(new java.awt.Dimension(100, 100));

        jbtnUltimo.setText(">|");
        jbtnUltimo.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnUltimo.setMinimumSize(new java.awt.Dimension(100, 100));

        jbtnEliminar.setMnemonic('l');
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setToolTipText("");
        jbtnEliminar.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnEliminar.setMinimumSize(new java.awt.Dimension(100, 100));

        jbtnAgregar.setMnemonic('a');
        jbtnAgregar.setText("Agregar");
        jbtnAgregar.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnAgregar.setMinimumSize(new java.awt.Dimension(100, 100));

        jbtnEditar.setMnemonic('e');
        jbtnEditar.setText("Editar");
        jbtnEditar.setToolTipText("");
        jbtnEditar.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnEditar.setMinimumSize(new java.awt.Dimension(100, 100));

        jbtnBuscar.setMnemonic('b');
        jbtnBuscar.setText("Buscar");
        jbtnBuscar.setToolTipText("");
        jbtnBuscar.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnBuscar.setMinimumSize(new java.awt.Dimension(100, 100));

        jbtnCancelar.setMnemonic('c');
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setEnabled(false);
        jbtnCancelar.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnCancelar.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jpControlesLayout = new javax.swing.GroupLayout(jpControles);
        jpControles.setLayout(jpControlesLayout);
        jpControlesLayout.setHorizontalGroup(
            jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jpControlesLayout.setVerticalGroup(
            jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpTabla.setBackground(new java.awt.Color(255, 255, 255));

        jtRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtRegistros.setOpaque(false);
        jtRegistros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtRegistros);

        javax.swing.GroupLayout jpTablaLayout = new javax.swing.GroupLayout(jpTabla);
        jpTabla.setLayout(jpTablaLayout);
        jpTablaLayout.setHorizontalGroup(
            jpTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jpTablaLayout.setVerticalGroup(
            jpTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpControles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton jbtnAgregar;
    public javax.swing.JButton jbtnAnterior;
    public javax.swing.JButton jbtnBuscar;
    public javax.swing.JButton jbtnCancelar;
    public javax.swing.JButton jbtnEditar;
    public javax.swing.JButton jbtnEliminar;
    public javax.swing.JButton jbtnPrimero;
    public javax.swing.JButton jbtnSiguiente;
    public javax.swing.JButton jbtnUltimo;
    private javax.swing.JLabel jlDescripcion;
    private javax.swing.JLabel jlExistencias;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlPrecioCompra;
    private javax.swing.JLabel jlPrecioVenta;
    private javax.swing.JLabel jlProducto;
    private javax.swing.JPanel jpControles;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpTabla;
    public javax.swing.JTable jtRegistros;
    public javax.swing.JTextArea jtaDescripcion;
    public javax.swing.JTextField jtfExistencias;
    public javax.swing.JTextField jtfId_producto;
    public javax.swing.JTextField jtfPrecioCompra;
    public javax.swing.JTextField jtfPrecioVenta;
    public javax.swing.JTextField jtfProducto;
    // End of variables declaration//GEN-END:variables
}