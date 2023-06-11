
package Presentacion;

import Modelo.Clientes;
import Modelo.Insumos;
import Persistencia.ArchivoClientes;
import Persistencia.ArchivoProductos;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroInsumos extends javax.swing.JFrame {

     Insumos insumos;   
     ArrayList<Insumos> listaProductos;
    public RegistroInsumos() {
        listaProductos = new ArrayList<>();
        initComponents();
        cargarArchivo();
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtPrecioProducto = new javax.swing.JTextField();
        btnRegistrat1 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabel2.setText("REGISTRO DE PRODUCTOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardarropa.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/percha.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 70, 50));

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 296, 490, 160));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel4.setText("CODIGO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));
        jPanel2.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 34, 200, -1));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRE DEL PRODUCTO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, -1, -1));
        jPanel2.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 88, 200, -1));

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel6.setText("CATEGORIA");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 126, -1, -1));

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Juegueteria", "Percheros" }));
        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, 200, -1));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel7.setText("PRECIO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, -1, -1));
        jPanel2.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 200, -1));

        btnRegistrat1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnRegistrat1.setText("Registrar");
        btnRegistrat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrat1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 253, 91, -1));

        btnModificar.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 253, 91, -1));

        btnEliminar.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 253, 91, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 80, 40));

        btnVolver.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       VentanaPrincipal h = new VentanaPrincipal();
          h.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrat1ActionPerformed
       agregar();
    }//GEN-LAST:event_btnRegistrat1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArchivoProductos.guardarListaProducto(listaProductos);
         JOptionPane.showMessageDialog(comboCategoria, "EL ARCHIVO SE GUARDO CORRECTAMENTE", "Mensaje",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
                int filaModificar = tablaProductos.getSelectedRow();
                Insumos  c=listaProductos.get(filaModificar); 
                c.setPrecioInsumo(txtPrecioProducto.getText().trim());
                
                listaProductos.set(filaModificar, c);
                pintarTabla();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Fila No Seleccionada", "ERROR", HEIGHT);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaActionPerformed
    
     public void limpiar(){
              txtCodigoProducto.setText("");
              txtPrecioProducto.setText("");
              nombreTxt.setText("");
          }
       
        public void cargarArchivo(){
        listaProductos = ArchivoProductos.leerArchivo();
        pintarTabla();
    }
     public boolean validartabla( String codigo ){
    for(Insumos e1 : listaProductos){
        if(e1.getCodigo().equals(codigo)){
            return true ;  
            }
    }
    return false; 
}
     private void eliminar(){
        try {
            int filaSeleccionada = tablaProductos.getSelectedRow();
            listaProductos.remove(filaSeleccionada);
            pintarTabla();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "FILA NO SELECCIONADA", "ERROR", HEIGHT);
        }
        
    }
     
  
    
    private void agregar(){
        
        try{
            
            String nombre = nombreTxt.getText();
            String codigo = txtCodigoProducto.getText();
            String categoria = comboCategoria.getSelectedItem().toString();
           
            String precio = txtPrecioProducto.getText();
            
            insumos = new Insumos();
            insumos.setNombreInsumo(nombre);
            insumos.setCodigo(codigo);
            insumos.setCategoria(categoria);
            insumos.setPrecioInsumo(precio);
            
            if(validartabla(codigo)){
                JOptionPane.showMessageDialog(comboCategoria, "PRODUCTO YA REGISTRADO", "Mensaje",JOptionPane.ERROR_MESSAGE);
            }else{
                if((Integer.valueOf(precio)<0)||Integer.valueOf(codigo)<0){
                    JOptionPane.showMessageDialog(comboCategoria, "NO SE PUDO REGISTRAR", "Mensaje",JOptionPane.ERROR_MESSAGE);
                }else{
                    listaProductos.add(insumos);
                 JOptionPane.showMessageDialog(comboCategoria, "REGISTRO EXITOSO", "Mensaje",JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
             
                    
            
            
            
            
            
        }catch(Exception e){
            
             JOptionPane.showMessageDialog(comboCategoria, "NO SE PUDO REGISTRAR", "Mensaje",JOptionPane.ERROR_MESSAGE);
            
        }
        
        pintarTabla();
    }
    
    private void pintarTabla(){
        
        
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"Codigo", "Tipo de insumo", "Nombre", "Precio"};
        modelo.setColumnIdentifiers(columnas);
         for (Insumos e1:listaProductos) {
            String[] fila = {e1.getCodigo(), e1.getCategoria(), e1.getNombreInsumo(), e1.getPrecioInsumo()};
            modelo.addRow(fila);
        }
        tablaProductos.setModel(modelo);
        
        
    }
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrat1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables
}
