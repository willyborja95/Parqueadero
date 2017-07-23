package Vista;

import BusinessLogic.BLRol;
import Clases.Catalogo;
import Clases.Rol;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IntFrmModificarRol extends javax.swing.JInternalFrame {

    BLRol objBLRol = new BLRol();
    ArrayList<Rol> lstRoles;
    DefaultTableModel mdlTblRoles;
    
    public IntFrmModificarRol() {
        initComponents();
        bloquearCampos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAgregarCatalogo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRoles = new javax.swing.JTable();
        btnGuardarCambios = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        lblBorde = new javax.swing.JLabel();

        pnlAgregarCatalogo.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarCatalogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ADMINISTRACIÓN DE ROLES");
        pnlAgregarCatalogo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 730, -1));

        lblEstado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEstado.setText("Descripción:");
        pnlAgregarCatalogo.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, 20));

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNombre.setText("* Nombre:");
        pnlAgregarCatalogo.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 70, 20));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        pnlAgregarCatalogo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, -1));

        tblRoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblRoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRolesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRoles);

        pnlAgregarCatalogo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 310, 140));

        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });
        pnlAgregarCatalogo.add(btnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 280, 40));

        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        pnlAgregarCatalogo.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 190, -1));

        lblBorde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));
        pnlAgregarCatalogo.add(lblBorde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 680, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgregarCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgregarCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="´Métodos Desarrollados"> 
    public void limpiar(){
        txtNombre.setText("");
        txtDescripcion.setText("");
    }
    
    public boolean verificarCamposCompletos(){
        boolean blnCompleto = false;
        if(!txtNombre.getText().isEmpty()){
            blnCompleto = true;
        }
        return blnCompleto;
    }
    
    public void cargarLstRoles(){
        try {
            lstRoles = objBLRol.consultar();
            cargarTblRoles();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No ha sido posible leer la información de los catálogo de la base de datos. \n"
                        + "Descripción del error:\n"+ex.getMessage(), "Error de lectura", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargarTblRoles(){
        Object columnas[] = {"Rol"};
                Object valores[][] = new Object[lstRoles.size()][columnas.length];
                for (int i = 0; i < lstRoles.size(); i++) {
                    valores[i][0] = lstRoles.get(i).getStrNombre();
                }
                mdlTblRoles = new DefaultTableModel(valores, columnas);
                tblRoles.setModel(mdlTblRoles);
    }
    
    public void bloquearCampos(){
        txtNombre.setEditable(false);
        txtDescripcion.setEditable(false);
        btnGuardarCambios.setEnabled(false);
    }
    
    public void desbloquearCampos(){
        txtNombre.setEditable(true);
        txtDescripcion.setEditable(true);
        btnGuardarCambios.setEnabled(true);
    }
    // </editor-fold> 
    
    private void tblRolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRolesMouseClicked
        txtNombre.setText(lstRoles.get(tblRoles.getSelectedRow()).getStrNombre());
        txtDescripcion.setText(lstRoles.get(tblRoles.getSelectedRow()).getStrDescripcion());
        desbloquearCampos();
    }//GEN-LAST:event_tblRolesMouseClicked

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        if(verificarCamposCompletos()){    
            try {
                int intId = lstRoles.get(tblRoles.getSelectedRow()).getIntId();
                String strNombre = txtNombre.getText().toUpperCase();
                String strDescripcion = txtDescripcion.getText().toUpperCase();
                int intRespuesta = objBLRol.actualizar(new Rol(intId, strNombre, strDescripcion));
                if(intRespuesta<1){
                    JOptionPane.showMessageDialog(null, "El nombre del rol proporcionado ya existe.\n"
                            + "Porfavor, ingrese uno nuevo.", "Nombre de rol repetido", JOptionPane.ERROR_MESSAGE);
                }else{
                    limpiar();
                    cargarLstRoles();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No ha sido posible actualizar la información del rol en la base de datos.\n"
                        + "Descripción del error:\n"+ex.getMessage(), "Error de actualización", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Existen campos obligatorios que no han sido completados. "
                    + "Por favor ingrese todos los valores señalados con *.", "Formulario Incompleto", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if(txtNombre.getText().length()>=45){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBorde;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlAgregarCatalogo;
    private javax.swing.JTable tblRoles;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
