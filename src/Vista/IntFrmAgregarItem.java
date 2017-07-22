package Vista;

import BusinessLogic.BLCatalogo;
import BusinessLogic.BLItem;
import Clases.Catalogo;
import Clases.Item;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IntFrmAgregarItem extends javax.swing.JInternalFrame {

    BLCatalogo objBLCatalogo = new BLCatalogo();
    BLItem objBLItem = new BLItem();
    ArrayList<Catalogo> lstCatalogos;
    DefaultTableModel mdlTblCatalogos;

    public IntFrmAgregarItem() {
        initComponents();
        tblItems.setRowSelectionAllowed(false);
        limpiarItem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAgregarCatalogo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCatalogos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblBorde = new javax.swing.JLabel();

        pnlAgregarCatalogo.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarCatalogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ADMINISTRACIÓN DE CATÁLOGO DE SISTEMA");
        pnlAgregarCatalogo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 730, -1));

        lblEstado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEstado.setText("* Estado:");
        pnlAgregarCatalogo.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 60, 20));

        lblCodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCodigo.setText("Código:");
        pnlAgregarCatalogo.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 20));

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNombre.setText("* Nombre:");
        pnlAgregarCatalogo.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 70, 20));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        pnlAgregarCatalogo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 230, -1));

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        pnlAgregarCatalogo.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 230, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Deshabilitado" }));
        cmbEstado.setSelectedIndex(-1);
        pnlAgregarCatalogo.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 230, -1));

        tblCatalogos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblCatalogos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCatalogosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCatalogos);

        pnlAgregarCatalogo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 310, 130));

        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblItems);

        pnlAgregarCatalogo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 310, 130));

        lblDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblDescripcion.setText("* Descripcion:");
        pnlAgregarCatalogo.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, 20));

        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        pnlAgregarCatalogo.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 210, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlAgregarCatalogo.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 150, 40));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        pnlAgregarCatalogo.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 150, 40));

        lblBorde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));
        pnlAgregarCatalogo.add(lblBorde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 710, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgregarCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgregarCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="´Métodos Desarrollados"> 
    public void limpiarFormulario(){
        limpiarCatalogo();
        limpiarItem();
        bloquearCamposCatalogo();
        bloquearCamposItem();
    }
    
    public void limpiarCatalogo(){
        txtCodigo.setText("");
        txtNombre.setText("");
        cmbEstado.setSelectedIndex(-1);
    }
    
    public void limpiarItem() {
        txtDescripcion.setText("");
    }

    public void cargarLstCatalogos() {
        try {
            lstCatalogos = objBLCatalogo.consultar();
            cargarTblCatalogo();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No ha sido posible leer la información de los catálogo de la base de datos. \n"
                    + "Descripción del error:\n" + ex.getMessage(), "Error de lectura", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargarTblCatalogo() {
        Object columnas[] = {"Nombre", "¿Se encuentra activo?"};
        Object valores[][] = new Object[lstCatalogos.size()][columnas.length];
        for (int i = 0; i < lstCatalogos.size(); i++) {
            valores[i][0] = lstCatalogos.get(i).getStrNombre();
            valores[i][1] = lstCatalogos.get(i).isBlnEstado();
        }
        mdlTblCatalogos = new DefaultTableModel(valores, columnas);
        tblCatalogos.setModel(mdlTblCatalogos);
    }

    public boolean verificarCamposCompletos() {
        boolean blnCompleto = false;
        if (!txtDescripcion.getText().isEmpty()) {
            blnCompleto = true;
        }
        return blnCompleto;
    }
    
    public void bloquearCamposCatalogo(){
        txtCodigo.setEditable(false);
        txtNombre.setEditable(false);
        cmbEstado.setEnabled(false);
    }
    
    public void desbloquearCamposCatalogo(){
        txtCodigo.setEditable(true);
        txtNombre.setEditable(true);
        cmbEstado.setEnabled(true);
    }
    
    public void bloquearCamposItem(){
        txtDescripcion.setEditable(false);
    }
    
    
    public void desbloquearCamposItem(){
        txtDescripcion.setEditable(true);
    }
    // </editor-fold> 

    private void tblCatalogosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCatalogosMouseClicked
        txtCodigo.setText(lstCatalogos.get(tblCatalogos.getSelectedRow()).getStrCodigo());
        txtNombre.setText(lstCatalogos.get(tblCatalogos.getSelectedRow()).getStrNombre());
        if (lstCatalogos.get(tblCatalogos.getSelectedRow()).isBlnEstado()) {
            cmbEstado.setSelectedIndex(0);
        } else {
            cmbEstado.setSelectedIndex(1);
        }
    }//GEN-LAST:event_tblCatalogosMouseClicked

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        if (txtCodigo.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().length() >= 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void tblItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemsMouseClicked

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if(txtDescripcion.getText().length()>=45){
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (verificarCamposCompletos()) {
            try {
                String strDescripcion = txtDescripcion.getText().toUpperCase();
                objBLItem.insertar(new Item(lstCatalogos.get(tblCatalogos.getSelectedRow()).getIntId(), strDescripcion));
            } catch (SQLException ex) {
                Logger.getLogger(IntFrmAgregarItem.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(IntFrmAgregarItem.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Para agrgar u nuevo item de catálogo, ingrese la descripción del ítem.", 
                    "Formulario Incompleto", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBorde;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlAgregarCatalogo;
    private javax.swing.JTable tblCatalogos;
    private javax.swing.JTable tblItems;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
