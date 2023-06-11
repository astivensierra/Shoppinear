
package Presentacion;

import Modelo.Clientes ;
import Persistencia.ArchivoClientes;
import Presentacion.RegistroClientes;
import Modelo.Compras;
import Modelo.Facturas;
import Modelo.Insumos;
import Persistencia.ArchivoCompras;
import Persistencia.ArchivoFacturas;
import Persistencia.ArchivoProductos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestorVentas extends javax.swing.JFrame {
        int totalpago=0;
        String tipoInsumo;
         Compras compras; 
         Facturas facturas;
      ArrayList<Compras> listaCompras;
      ArrayList<Facturas> listaFacturas;
    public GestorVentas() {
         listaCompras = new ArrayList<>();
         listaFacturas = new ArrayList<>();
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();
        nombreFactura = new javax.swing.JLabel();
        idfactrura = new javax.swing.JLabel();
        categoriafactura = new javax.swing.JLabel();
        valorCompra = new javax.swing.JLabel();
        cantidadfactura = new javax.swing.JLabel();
        descuentofactura = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        totalfacturatexto = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textoId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        comboTipo1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPreciototal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboCantidad = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Ventas");
        setBackground(new java.awt.Color(234, 102, 154));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel2.setText("VENTA DE PRODUCTOS");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venta.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/factura.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(253, 234, 166));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel8.setText("Nombre: ");

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel9.setText("Identificacion: ");

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel10.setText("Categoria: ");

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel11.setText("Valor de compra: ");

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel12.setText("Cantidad de Prod: ");

        jLabel13.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel13.setText("Descuentos");

        tablaFactura.setBackground(new java.awt.Color(128, 222, 214));
        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaFactura);

        jLabel14.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel14.setText("TOTAL: ");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("FACTURA");

        jButton6.setText("Guardar Factura");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/factura.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(26, 26, 26))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(totalfacturatexto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cantidadfactura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(valorCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(descuentofactura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(57, 57, 57))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(nombreFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(idfactrura, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                            .addComponent(categoriafactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 102, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(98, 98, 98))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(nombreFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idfactrura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoriafactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valorCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cantidadfactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descuentofactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(totalfacturatexto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel4.setText("Identificacion:");

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel5.setText("Tipo de Perchero:");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jugueteria", "Percheros" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        comboTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria", "" }));
        comboTipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipo1ActionPerformed(evt);
            }
        });

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Precio: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Precio Total: ");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel3.setText("Cantidad:");

        comboCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comboCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCantidadActionPerformed(evt);
            }
        });

        jButton3.setText("Habilitar ID");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnGuardar.setText("Registrar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Generar factura");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(comboTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(comboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(textoId, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(jButton3)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreciototal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(comboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreciototal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleDescription("Gestor de Ventas");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaPrincipal h = new VentanaPrincipal();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

      public void cargarArchivo(){
        listaCompras = ArchivoCompras.leerArchivo();
       
        
    }
      public void cargarFactura(){
          
        listaFacturas = ArchivoFacturas.leerArchivo();
          
      }
    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        txtPrecio.setText("0");
        LlenarCombo();

    }//GEN-LAST:event_comboActionPerformed
private void LlenarCombo(){
        ArrayList<Insumos> Lista = Persistencia.ArchivoProductos.leerArchivo();
        comboTipo1.removeAllItems();
        
        if(combo.getSelectedItem().toString().equals("Jugueteria")){
            for (Insumos insumo : Lista) {
                if(insumo.getCategoria().equals("Jugueteria")){
                    comboTipo1.addItem(insumo.getCodigo()+"-"+insumo.getNombreInsumo());
                }
            }
        }else if(combo.getSelectedItem().toString().equals("Percheros")){
            for (Insumos insumo : Lista) {
                if(insumo.getCategoria().equals("Percheros")){
                    comboTipo1.addItem(insumo.getCodigo()+"-"+insumo.getNombreInsumo());
                }
            }
        }
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        comboCantidad.enable();
        if(validarcompra(tipoInsumo)){
          
            sumarcantidad();
             limpiar();
       }else{
            agregarCompra();
             limpiar();
       }

    }//GEN-LAST:event_btnGuardarActionPerformed

    
    
    private void comboTipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipo1ActionPerformed
  
         try {
            String [] cod = comboTipo1.getSelectedItem().toString().split("-");
            Insumos insumo = Persistencia.ArchivoProductos.Buscar(cod[0]);
            if(insumo == null){
                txtPrecio.setText("0");
            }else{
                txtPrecio.setText(""+insumo.getPrecioInsumo());
            }
                
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_comboTipo1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       textoId.setEditable(true);
       txtPrecio.setText("");
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comboCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCantidadActionPerformed
        String precioInsumo = txtPrecio.getText();
        String cantidad = comboCantidad.getSelectedItem().toString();
             RegistroClientes llamada = new RegistroClientes();
             int multiplicacion;
             multiplicacion = (Integer.valueOf(precioInsumo)*Integer.valueOf(cantidad));
             
             
            txtPreciototal.setText(String.valueOf(multiplicacion));
            
    }//GEN-LAST:event_comboCantidadActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     try{
         facturar();
         ArchivoCompras.guardarListaPersona(listaCompras);
         eliminartabla();
         
      }catch(Exception e){ }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        guardarfactura();
        eliminartablafactura();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      eliminar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            
                int filaModificar = tablaDatos.getSelectedRow();
                Compras  c=listaCompras.get(filaModificar); 
                
                c.setCantidad(comboCantidad.getSelectedItem().toString());
                int cantidadnuevo = Integer.valueOf(comboCantidad.getSelectedItem().toString());
                String precioh = c.getPrecioInsumo();
                int nuevovalor = cantidadnuevo*(Integer.valueOf(precioh));
                String nuevovalset = String.valueOf(nuevovalor);
                c.setPrecioCantidad(nuevovalset);
                listaCompras.set(filaModificar, c);
                PintarTabla();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Fila No Seleccionada", "ERROR", HEIGHT);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked
       int filaModificar = tablaDatos.getSelectedRow();
                Compras  c=listaCompras.get(filaModificar); 
                txtPrecio.setText(c.getPrecioInsumo());
    }//GEN-LAST:event_tablaDatosMouseClicked
    
       public void eliminartabla(){
        DefaultTableModel tb = (DefaultTableModel) tablaDatos.getModel();
        int a = tablaDatos.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
        tb.removeRow(tb.getRowCount()-1);
        listaCompras.remove(i);
        } 
       
    }
       public void eliminartablafactura(){
        DefaultTableModel tb = (DefaultTableModel) tablaFactura.getModel();
        int a = tablaFactura.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
        tb.removeRow(tb.getRowCount()-1);
        } 
       
    }
       
       private void eliminar(){
        try {
            int filaSeleccionada = tablaDatos.getSelectedRow();
            listaCompras.remove(filaSeleccionada);
            PintarTabla();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "FILA NO SELECCIONADA", "ERROR", HEIGHT);
        }
        
    }

    
     
    public void agregarCompra(){
        try{
            
             String identificacion = textoId.getText();
             String insumo =  combo.getSelectedItem().toString();
             String insumoTipo =  comboTipo1.getSelectedItem().toString();
             String precioInsumo = txtPrecio.getText();
             String cantidad = comboCantidad.getSelectedItem().toString();
             RegistroClientes llamada = new RegistroClientes();
             int multiplicacion;
             multiplicacion = (Integer.valueOf(precioInsumo)*Integer.valueOf(cantidad));
             
             
            
            String preciocantidad = txtPreciototal.getText();
           
            tipoInsumo = combo.getSelectedItem().toString().trim()+"/"+comboTipo1.getSelectedItem().toString().trim();
                          
            compras = new Compras();
            compras.setIdentificacion(identificacion);
            compras.setInsumo(insumo);
            compras.setInsumoTipo(insumoTipo);
            compras.setPrecioInsumo(precioInsumo);
            compras.setCantidad(cantidad);
            compras.setPrecioCantidad(preciocantidad);
           if(validarcompra(insumoTipo)){
               
              
           }
            
              if(llamada.validartabla(identificacion)){
                  listaCompras.add(compras);
                 
                  
             }else{
                 JOptionPane.showMessageDialog(combo, "CLIENTE NO ENCONTRADO","Mensaje",JOptionPane.ERROR_MESSAGE);
             }
            
        }catch(Exception e){
              JOptionPane.showMessageDialog(combo, "NO SE PUDO REGISTRAR", "Mensaje",JOptionPane.ERROR_MESSAGE);
        }
        PintarTabla();
    }
     public void limpiar(){
              txtPreciototal.setText("");
              txtPrecio.setText("");
             textoId.setEditable(false);
          }

     public void limpiarfactura(){
              nombreFactura.setText("");
              idfactrura.setText("");
              categoriafactura.setText("");
              cantidadfactura.setText("");
              valorCompra.setText("");
              descuentofactura.setText("");
              totalfacturatexto.setText("");
          }
      
     public void PintarTabla(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = { "Tipo Producto", "producto","Precio","Cantidad"," Precio por cantidad"};
        modelo.setColumnIdentifiers(columnas);
        
         for (Compras e1:listaCompras) {
            String[] fila = { e1.getInsumo(), e1.getInsumoTipo(),e1.getPrecioInsumo(),e1.getCantidad(),e1.getPrecioCantidad()};
            modelo.addRow(fila);
        }
        tablaDatos.setModel(modelo);
    }
     
private void llenarTabla(ArrayList<Compras> lista){
        String[] encabezados = {"Productos","Cantidad"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(encabezados);
        
        for(Compras p:lista){
            String[] fila = {p.getInsumoTipo(), p.getCantidad()};
            modelo.addRow(fila);
        }
        
        tablaFactura.setModel(modelo);
    }
     
     public void facturar(){
         int valortotalfactura=0;
          int cantidadtotalproductos=0;
          int valorapagarnuevo=0;
           
         String identificacion= textoId.getText();
         idfactrura.setText(identificacion);
         
         RegistroClientes llamada2 = new RegistroClientes();
          if(listaCompras.size()==0){
              JOptionPane.showMessageDialog(combo, "AGREGAR COMPRAS AL CARRITO","Mensaje",JOptionPane.ERROR_MESSAGE);
          }else{
               
          for(Compras e : listaCompras){
              
              valortotalfactura =valortotalfactura + ( Integer.valueOf(e.getPrecioCantidad()));
              cantidadtotalproductos= cantidadtotalproductos + (Integer.valueOf(e.getCantidad()));
          }
           for(Clientes e1 : llamada2.listaClientes){
            
              
               
               if(e1.getIdentificacion().equals(identificacion)){
                  nombreFactura.setText(e1.getNombre());
                  categoriafactura.setText(e1.getTipoCliente());
             
                  
                  if(e1.getTipoCliente().equals("Mayorista")){
               
                          
                          int descuentoparafacturas=(valortotalfactura*25)/100;
                           valorapagarnuevo = (valortotalfactura-descuentoparafacturas);
                          descuentofactura.setText(String.valueOf(descuentoparafacturas));
                          valorCompra.setText((String.valueOf(valortotalfactura)));

                      
                    }else{
                            if(e1.getTipoCliente()!="Normal"){
                            
                       
                                valorCompra.setText(String.valueOf(valortotalfactura));
                                descuentofactura.setText("0");
                                totalfacturatexto.setText(String.valueOf(valortotalfactura));
                            }
                        }

               }
          }

          cantidadfactura.setText(String.valueOf(cantidadtotalproductos));
          
          llenarTabla(listaCompras);
          }
          
     }
     
       
    public boolean validarcompra( String comboString ){
            
        for(Compras e1 : listaCompras){
        if(e1.getInsumoTipo().equals(comboTipo1.getSelectedItem())){
            return true ;  
          
            }
       
    }
    return false; 
}
    
    public void sumarcantidad(){
         RegistroClientes llamada = new RegistroClientes();
           try{
                
           
                String cantidad = comboCantidad.getSelectedItem().toString();
                String preciototal =txtPreciototal.getText().toString();
                if(llamada.validartabla(tipoInsumo)){
                     JOptionPane.showMessageDialog(combo, "CLIENTE NO ENCONTRADO","Mensaje",JOptionPane.ERROR_MESSAGE);
                
                  }else{
                        if(textoId.getText().equals("")){
                         JOptionPane.showMessageDialog(combo, "CLIENTE NO ENCONTRADO","Mensaje",JOptionPane.ERROR_MESSAGE);
                        }else{
                                int c=0;
                                for(Compras e1 : listaCompras){
                                     if(e1.getInsumoTipo().equals(comboTipo1.getSelectedItem())){
                                     break;
          
               }
        c++;
       
    }
          
           Compras c1=listaCompras.get(c);
           int cantidadtabla = Integer.valueOf(c1.getCantidad());
            int cantidadnueva = Integer.valueOf(cantidad);
           int preciotabla = Integer.valueOf(c1.getPrecioCantidad());
           int precionuevo = Integer.valueOf(preciototal);
           
           int sumaprecio =(precionuevo+preciotabla);
            int suma=(cantidadnueva+cantidadtabla);
                   c1.setCantidad(String.valueOf(suma));
                   c1.setPrecioCantidad(String.valueOf(sumaprecio));
                           listaCompras.set(c, c1);
                           PintarTabla();
                   
                }
                    }
                    
                 
            }catch(Exception e){   
                JOptionPane.showMessageDialog(combo,"NO AGREGADO","Mensaje",JOptionPane.ERROR_MESSAGE);
            }
           
             
              
        }
    
  public void guardarfactura(){
        try{
            if(nombreFactura.getText().equals("")||idfactrura.getText().equals("")||categoriafactura.getText().equals("")||cantidadfactura.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "ERROR, FACTURA NO GENERADA","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                Facturas facturas = new Facturas();
                facturas.setNombrefactura(nombreFactura.getText().trim());
                facturas.setIdfactura(idfactrura.getText().trim());
                facturas.setCategoriadelafactura(categoriafactura.getText().trim());
                facturas.setCantidaddelafactura(cantidadfactura.getText().trim());
                facturas.setValorcantidadfactura(valorCompra.getText().trim());
                facturas.setDescuentodelafactura(descuentofactura.getText().trim());
                facturas.setValortotaldelafactura(totalfacturatexto.getText().trim());
      
      listaFacturas.add(facturas);
        
       new ArchivoFacturas().guardarListaFacturas(listaFacturas);
       JOptionPane.showMessageDialog(rootPane, "La factura se guardo exitosamente");
       limpiarfactura();
            }
         
              }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "ERROR,porfavor llene todas las casillas");
      }
    }
  
     
 

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel cantidadfactura;
    private javax.swing.JLabel categoriafactura;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JComboBox<String> comboCantidad;
    private javax.swing.JComboBox<String> comboTipo1;
    private javax.swing.JLabel descuentofactura;
    private javax.swing.JLabel idfactrura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombreFactura;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTable tablaFactura;
    private javax.swing.JTextField textoId;
    private javax.swing.JLabel totalfacturatexto;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtPreciototal;
    private javax.swing.JLabel valorCompra;
    // End of variables declaration//GEN-END:variables
}
