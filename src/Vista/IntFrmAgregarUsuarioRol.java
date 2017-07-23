package Vista;

import BusinessLogic.BLRol;
import BusinessLogic.BLUsuario;
import BusinessLogic.BLUsuarioRol;
import Clases.Rol;
import Clases.Usuario;
import Clases.UsuarioRol;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class IntFrmAgregarUsuarioRol extends javax.swing.JInternalFrame {

    ArrayList<Usuario> lstUsuarios;
    ArrayList<Rol> lstRoles;
    BLRol objBLRol = new BLRol();
    BLUsuario objBLUsuario = new BLUsuario();
    BLUsuarioRol objBLUsuarioRol = new BLUsuarioRol();
    DefaultTableModel mdlTblRoles;
    DefaultTableModel mdlTblUsuarios;
    DefaultTableModel mdlTblUsuariosRoles;
    
    public IntFrmAgregarUsuarioRol() {
        initComponents();
        cargarLstRoles();
        cargarLstUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRoles = new javax.swing.JTable();
        btnAgregarAsignacion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblUsuariosRoles = new javax.swing.JTable();
        lblTablaRoles = new javax.swing.JLabel();
        lblTablaUsuarios = new javax.swing.JLabel();
        lblTablaUsuarios1 = new javax.swing.JLabel();
        lblBorde = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ASIGNACIÓN USUARIO - ROL");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 730, -1));

        tblUsuarios.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
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
        jScrollPane1.setViewportView(tblUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 290, 180));

        tblRoles.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
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
        jScrollPane2.setViewportView(tblRoles);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 290, 180));

        btnAgregarAsignacion.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnAgregarAsignacion.setText("Agregar Asignación");
        btnAgregarAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAsignacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarAsignacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 610, 40));

        tblUsuariosRoles.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        tblUsuariosRoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblUsuariosRoles);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 610, 140));

        lblTablaRoles.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTablaRoles.setForeground(new java.awt.Color(102, 102, 102));
        lblTablaRoles.setText("Tabla roles:");
        jPanel1.add(lblTablaRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 120, 30));

        lblTablaUsuarios.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTablaUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        lblTablaUsuarios.setText("Tabla usuarios:");
        jPanel1.add(lblTablaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 120, 30));

        lblTablaUsuarios1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTablaUsuarios1.setForeground(new java.awt.Color(102, 102, 102));
        lblTablaUsuarios1.setText("Tabla usuarios - roles:");
        jPanel1.add(lblTablaUsuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 170, 30));

        lblBorde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));
        jPanel1.add(lblBorde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 710, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Métodos Desarrollados">  
    public void cargarTblUsuariosRoles(){
        try {
            ArrayList<UsuarioRol> lstUsuariosRoles = objBLUsuarioRol.consultarPorIdUsuario(lstUsuarios.get(tblUsuarios.getSelectedRow()).getIntId());
            ArrayList<Rol> lstRolesAsignados = new ArrayList<Rol>();
            for (int i = 0; i < lstUsuariosRoles.size(); i++) {
                lstRolesAsignados = objBLRol.consultarPorId(lstUsuariosRoles.get(i).getIntIdRol());
            }
            Object columnas[] = {"Rol", "Descripción"};
            Object valores[][] = new Object[lstRolesAsignados.size()][columnas.length];
            for (int i = 0; i < lstRolesAsignados.size(); i++) {
                valores[i][0] = lstRolesAsignados.get(i).getStrNombre();
                valores[i][1] = lstRolesAsignados.get(i).getStrDescripcion();
            }
            mdlTblUsuariosRoles = new DefaultTableModel(valores, columnas);
            tblUsuariosRoles.setModel(mdlTblUsuariosRoles);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IntFrmAgregarUsuarioRol.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IntFrmAgregarUsuarioRol.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // </editor-fold>
    
    private void btnAgregarAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAsignacionActionPerformed
        try {
            objBLUsuarioRol.insertar(new UsuarioRol(lstUsuarios.get(tblUsuarios.getSelectedRow()).getIntId(),
                    lstRoles.get(tblRoles.getSelectedRow()).getIntId()));
            cargarTblUsuariosRoles();
        } catch (SQLException ex) {
            Logger.getLogger(IntFrmAgregarUsuarioRol.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IntFrmAgregarUsuarioRol.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarAsignacionActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Métodos Desarrollados">
    public void cargarLstRoles(){
        try {
            lstRoles = objBLRol.consultar();
            cargarTblRoles();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IntFrmAgregarUsuarioRol.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IntFrmAgregarUsuarioRol.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargarTblRoles(){
        Object columnas[] = {"Nombre", "Descripción"};
        Object valores[][] = new Object[lstRoles.size()][columnas.length];
        for (int i = 0; i < lstRoles.size(); i++) {
            valores[i][0] = lstRoles.get(i).getStrNombre();
            valores[i][1] = lstRoles.get(i).getStrDescripcion();
        }
        mdlTblRoles = new DefaultTableModel(valores, columnas);
        tblRoles.setModel(mdlTblRoles);
    }
    
    public void cargarLstUsuarios(){
        try {
            lstUsuarios = objBLUsuario.consultar();{
            cargarTblUsuarios();
        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IntFrmAgregarUsuarioRol.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IntFrmAgregarUsuarioRol.class.getName()).log(Level.SEVERE, null, ex);
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
    
    // </editor-fold>  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAsignacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBorde;
    private javax.swing.JLabel lblTablaRoles;
    private javax.swing.JLabel lblTablaUsuarios;
    private javax.swing.JLabel lblTablaUsuarios1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblRoles;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTable tblUsuariosRoles;
    // End of variables declaration//GEN-END:variables
}
