package Vista;

import BusinessLogic.BLCatalogo;
import Clases.Catalogo;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IntFrmEliminarCatalogo extends javax.swing.JInternalFrame {

    BLCatalogo objBLCatalogo = new BLCatalogo();
    ArrayList<Catalogo> lstCatalogos;
    DefaultTableModel mdlTblCatalogos;
    
    public IntFrmEliminarCatalogo() {
        initComponents();
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
        blnEliminar = new javax.swing.JButton();
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
        pnlAgregarCatalogo.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 60, 20));

        lblCodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCodigo.setText("Código:");
        pnlAgregarCatalogo.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 20));

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNombre.setText("* Nombre:");
        pnlAgregarCatalogo.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 20));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        pnlAgregarCatalogo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 230, -1));

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        pnlAgregarCatalogo.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 230, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Deshabilitado" }));
        cmbEstado.setSelectedIndex(-1);
        pnlAgregarCatalogo.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 230, -1));

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

        pnlAgregarCatalogo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 310, 140));

        blnEliminar.setText("Eliminar");
        blnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blnEliminarActionPerformed(evt);
            }
        });
        pnlAgregarCatalogo.add(blnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 300, 40));

        lblBorde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));
        pnlAgregarCatalogo.add(lblBorde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 710, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAgregarCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgregarCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="´Métodos Desarrollados"> 
    public void limpiar(){
        txtCodigo.setText("");
        txtNombre.setText("");
        cmbEstado.setSelectedIndex(-1);
        bloquearCampos();
    }
    public void cargarLstCatalogos(){
        try {
            lstCatalogos = objBLCatalogo.consultar();
            cargarTblCatalogo();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No ha sido posible leer la información de los catálogo de la base de datos. \n"
                        + "Descripción del error:\n"+ex.getMessage(), "Error de lectura", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargarTblCatalogo(){
        Object columnas[] = {"Nombre", "¿Se encuentra activo?"};
                Object valores[][] = new Object[lstCatalogos.size()][columnas.length];
                for (int i = 0; i < lstCatalogos.size(); i++) {
                    valores[i][0] = lstCatalogos.get(i).getStrNombre();
                    valores[i][1] = lstCatalogos.get(i).isBlnEstado();
                }
                mdlTblCatalogos = new DefaultTableModel(valores, columnas);
                tblCatalogos.setModel(mdlTblCatalogos);
    }
    
    public void bloquearCampos(){
        txtCodigo.setEditable(false);
        txtNombre.setEditable(false);
        cmbEstado.setEnabled(false);
    }
    
    // </editor-fold> 
    
    private void tblCatalogosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCatalogosMouseClicked
        txtCodigo.setText(lstCatalogos.get(tblCatalogos.getSelectedRow()).getStrCodigo());
        txtNombre.setText(lstCatalogos.get(tblCatalogos.getSelectedRow()).getStrNombre());
        if(lstCatalogos.get(tblCatalogos.getSelectedRow()).isBlnEstado()){
            cmbEstado.setSelectedIndex(0);
        }else{
            cmbEstado.setSelectedIndex(1);
        }
    }//GEN-LAST:event_tblCatalogosMouseClicked

    private void blnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blnEliminarActionPerformed
        if(tblCatalogos.getSelectedRow()>=0){
            try {
                int intId = lstCatalogos.get(tblCatalogos.getSelectedRow()).getIntId();
                objBLCatalogo.eliminar(intId);
                limpiar();
                cargarLstCatalogos();
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No ha sido posible eliminar el catálogo solicitado.\n"
                        + "Descripción del error:\n"+ex.getMessage(), "Error de eliminación", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Para eliminar un catálogo, primero seleccionlo en la tabla.", "Seleccione un catálogo", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_blnEliminarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        if(txtCodigo.getText().length()>=5){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if(txtNombre.getText().length()>=45){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blnEliminar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBorde;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlAgregarCatalogo;
    private javax.swing.JTable tblCatalogos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
