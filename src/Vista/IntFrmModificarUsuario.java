package Vista;

import BusinessLogic.BLCatalogo;
import BusinessLogic.BLItem;
import BusinessLogic.BLUsuario;
import Clases.Catalogo;
import Clases.Item;
import Clases.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IntFrmModificarUsuario extends javax.swing.JInternalFrame {

    ArrayList<Usuario> lstUsuarios;
    BLUsuario objBLUsuario = new BLUsuario();
    DefaultTableModel mdlTblUsuarios;

    public IntFrmModificarUsuario() {
        initComponents();
        cargarLstUsuarios();
        cargarInformacionComponentes();
        limpiar();
        bloquearCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnGuardarCambios = new javax.swing.JButton();
        lblBorde = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ADMINISTRACIÓN DE USUARIOS");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 730, -1));

        lblEstado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEstado.setText("* Estado:");
        jPanel1.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 60, 20));

        lblUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblUsuario.setText("*Usuario:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 100, 60, 20));

        lblPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblPassword.setText("*Password:");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 20));

        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 230, -1));

        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 230, -1));

        jPanel1.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 230, -1));

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUsuarios);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 310, 140));

        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 300, 40));

        lblBorde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));
        jPanel1.add(lblBorde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 710, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Métodos Generados"> 
    public boolean verificarCamposCompletos() {
        boolean blnCompleto = false;
        if (!txtUsuario.getText().isEmpty() && !txtPassword.getText().isEmpty() && cmbEstado.getSelectedIndex() != -1) {
            blnCompleto = true;
        }
        return blnCompleto;
    }

    public void limpiar() {
        txtUsuario.setText("");
        txtPassword.setText("");
        cmbEstado.setSelectedIndex(-1);
    }

    public void cargarInformacionComponentes() {
        try {
            BLCatalogo objBLCatalogo = new BLCatalogo();
            BLItem objBLItem = new BLItem();
            ArrayList<Catalogo> lstCatalogosEncontrados = new ArrayList<Catalogo>();
            lstCatalogosEncontrados = objBLCatalogo.consultarPorNombre("ESTADO");
            if (lstCatalogosEncontrados.get(0).isBlnEstado()) {
                ArrayList <Item> lstItemsEncontrados = objBLItem.consultarPorIdCatalogo(lstCatalogosEncontrados.get(0).getIntId());
                for (Item itemEncontrado : lstItemsEncontrados) {
                    int intId = itemEncontrado.getIntId();
                    int intIdCatologo = itemEncontrado.getIntIdCatalogo();
                    String strDescripcion = itemEncontrado.getStrDescripcion();
                    cmbEstado.addItem(new Item(intId, intIdCatologo, strDescripcion));
                }
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No ha sido posible cargar la infromación de los ítems del combo estado. \n"
                        + "Descripción del error:\n"+ex.getMessage(), "Error de lectura", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargarLstUsuarios(){
        try {
            lstUsuarios = objBLUsuario.consultar();
            cargarTblUsuarios();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No ha sido posible leer la información de los usuarios de la base de datos.\n"
                        + "Descripción del error:\n"+ex.getMessage(), "Error de lectura", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargarTblUsuarios(){
        Object columnas[] = {"Usuario"};
        Object valores[][] = new Object[lstUsuarios.size()][columnas.length];
        for (int i = 0; i < lstUsuarios.size(); i++) {
            valores[i][0] = lstUsuarios.get(i).getStrUsuario();
        }
        mdlTblUsuarios = new DefaultTableModel(valores, columnas);
        tblUsuarios.setModel(mdlTblUsuarios);
    }
    
    public void bloquearCampos(){
        txtUsuario.setEditable(false);
        txtPassword.setEditable(false);
        cmbEstado.setEnabled(false);
        btnGuardarCambios.setEnabled(false);
    }
    
    public void desbloquearCampos(){
        txtUsuario.setEditable(true);
        txtPassword.setEditable(true);
        cmbEstado.setEnabled(true);
        btnGuardarCambios.setEnabled(true);
    }
    // </editor-fold>  

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        if (txtPassword.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        if (txtUsuario.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        desbloquearCampos();
        txtUsuario.setText(lstUsuarios.get(tblUsuarios.getSelectedRow()).getStrUsuario());
        txtPassword.setText(lstUsuarios.get(tblUsuarios.getSelectedRow()).getStrPassword());
        boolean variableEstablecida = false;
        int i = 0;
        while (variableEstablecida == false) {
            if (cmbEstado.getItemAt(i).getIntId() == lstUsuarios.get(tblUsuarios.getSelectedRow()).getIntEstado()) {
                cmbEstado.setSelectedIndex(i);
                variableEstablecida = true;
            }
            i++;
        }
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        if (verificarCamposCompletos()) {
            try {
                int intId = lstUsuarios.get(tblUsuarios.getSelectedRow()).getIntId();
                String strUsuario = txtUsuario.getText().toUpperCase();
                String strPassword = txtPassword.getText().toUpperCase();
                int intEstado = cmbEstado.getItemAt(cmbEstado.getSelectedIndex()).getIntId();
                int intRespuesta = objBLUsuario.actualizar(new Usuario(intId, strUsuario, strPassword, intEstado));
                if (intRespuesta < 1) {
                    JOptionPane.showMessageDialog(null, "El nombre de usuario proporcionado ya existe.\n"
                            + "Porfavor, ingrese uno nuevo.", "Nombre de usuario repetido", JOptionPane.ERROR_MESSAGE);
                } else {
                    limpiar();
                    cargarLstUsuarios();
                    bloquearCampos();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No ha sido posible actualizar la información del usuario en la base de datos.\n"
                        + "Descripción del error:\n" + ex.getMessage(), "Error de actualización", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Existen campos obligatorios que no han sido completados. "
                    + "Por favor ingrese todos los valores señalados con *.", "Formulario Incompleto", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarCambiosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JComboBox<Item> cmbEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBorde;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
