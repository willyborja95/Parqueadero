package Vista;

public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallaDinamica = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCuentas = new javax.swing.JMenu();
        menuRoles = new javax.swing.JMenu();
        itemAgregarRol = new javax.swing.JMenuItem();
        itemActualizarRol = new javax.swing.JMenuItem();
        itemEliminarRol = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        itemAgregarUsuario = new javax.swing.JMenuItem();
        itemActualizarUsuario = new javax.swing.JMenuItem();
        itemEliminarUsuario = new javax.swing.JMenuItem();
        menuFuncionalidades = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemAgregarAsignacionUsuarioRol = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        itemEliminarAsignacionUsuarioRol = new javax.swing.JMenuItem();
        menuRolFuncionalidad = new javax.swing.JMenu();
        itemAgregarAsignacionRolFuncionalidad = new javax.swing.JMenuItem();
        itemEliminarAsignacionRolFuncionalidad = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuAdministracion = new javax.swing.JMenu();
        itemCatalogo = new javax.swing.JMenu();
        itemAgregarCatalogo = new javax.swing.JMenuItem();
        itemActualizarCatalogo = new javax.swing.JMenuItem();
        itemEliminarCatalogo = new javax.swing.JMenuItem();
        itemItems = new javax.swing.JMenu();
        itemAgregarItem = new javax.swing.JMenuItem();
        itemActualizarItem = new javax.swing.JMenuItem();
        itemEliminarItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout pantallaDinamicaLayout = new javax.swing.GroupLayout(pantallaDinamica);
        pantallaDinamica.setLayout(pantallaDinamicaLayout);
        pantallaDinamicaLayout.setHorizontalGroup(
            pantallaDinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        pantallaDinamicaLayout.setVerticalGroup(
            pantallaDinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(pantallaDinamica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 570));

        jMenu1.setText("Funciones");
        jMenuBar1.add(jMenu1);

        menuCuentas.setText("Cuentas");

        menuRoles.setText("Roles");

        itemAgregarRol.setText("Agregar rol");
        itemAgregarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarRolActionPerformed(evt);
            }
        });
        menuRoles.add(itemAgregarRol);

        itemActualizarRol.setText("Actualizar rol");
        itemActualizarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarRolActionPerformed(evt);
            }
        });
        menuRoles.add(itemActualizarRol);

        itemEliminarRol.setText("Eliminar rol");
        itemEliminarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarRolActionPerformed(evt);
            }
        });
        menuRoles.add(itemEliminarRol);

        menuCuentas.add(menuRoles);

        menuUsuarios.setText("Usuarios");

        itemAgregarUsuario.setText("Agregar usuario");
        itemAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemAgregarUsuario);

        itemActualizarUsuario.setText("Actualizar usuario");
        itemActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemActualizarUsuario);

        itemEliminarUsuario.setText("Eliminar usuario");
        menuUsuarios.add(itemEliminarUsuario);

        menuCuentas.add(menuUsuarios);

        menuFuncionalidades.setText("Funcionalidades");

        jMenuItem4.setText("Agregar funcionalidad");
        menuFuncionalidades.add(jMenuItem4);

        jMenuItem5.setText("Actualizar funcionalidad");
        menuFuncionalidades.add(jMenuItem5);

        jMenuItem6.setText("Eliminar funcionalidad");
        menuFuncionalidades.add(jMenuItem6);

        menuCuentas.add(menuFuncionalidades);
        menuCuentas.add(jSeparator2);

        itemAgregarAsignacionUsuarioRol.setText("Usuario/Rol");

        jMenuItem10.setText("Agregar asignación usuario/rol");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        itemAgregarAsignacionUsuarioRol.add(jMenuItem10);

        itemEliminarAsignacionUsuarioRol.setText("Eliminar asignación usuario/rol");
        itemAgregarAsignacionUsuarioRol.add(itemEliminarAsignacionUsuarioRol);

        menuCuentas.add(itemAgregarAsignacionUsuarioRol);

        menuRolFuncionalidad.setText("Rol/Funcionalidad");

        itemAgregarAsignacionRolFuncionalidad.setText("Agregar asignación rol/funcionalidad");
        menuRolFuncionalidad.add(itemAgregarAsignacionRolFuncionalidad);

        itemEliminarAsignacionRolFuncionalidad.setText("Eliminar asignación rol/funcionalidad");
        menuRolFuncionalidad.add(itemEliminarAsignacionRolFuncionalidad);

        menuCuentas.add(menuRolFuncionalidad);
        menuCuentas.add(jSeparator1);

        jMenuBar1.add(menuCuentas);

        menuAdministracion.setText("Administración");

        itemCatalogo.setText("Catálogo");

        itemAgregarCatalogo.setText("Agregar catálogo");
        itemAgregarCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarCatalogoActionPerformed(evt);
            }
        });
        itemCatalogo.add(itemAgregarCatalogo);

        itemActualizarCatalogo.setText("Actualizar catálogo");
        itemActualizarCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarCatalogoActionPerformed(evt);
            }
        });
        itemCatalogo.add(itemActualizarCatalogo);

        itemEliminarCatalogo.setText("Eliminar catálogo");
        itemEliminarCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarCatalogoActionPerformed(evt);
            }
        });
        itemCatalogo.add(itemEliminarCatalogo);

        menuAdministracion.add(itemCatalogo);

        itemItems.setText("Items");

        itemAgregarItem.setText("Agregar item");
        itemAgregarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarItemActionPerformed(evt);
            }
        });
        itemItems.add(itemAgregarItem);

        itemActualizarItem.setText("Actualizar item");
        itemActualizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarItemActionPerformed(evt);
            }
        });
        itemItems.add(itemActualizarItem);

        itemEliminarItem.setText("Eliminar item");
        itemEliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarItemActionPerformed(evt);
            }
        });
        itemItems.add(itemEliminarItem);

        menuAdministracion.add(itemItems);

        jMenuBar1.add(menuAdministracion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAgregarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarCatalogoActionPerformed
        IntFrmAgregarCatalogo intFrmAgregarCatalogo = new IntFrmAgregarCatalogo();
        pantallaDinamica.add(intFrmAgregarCatalogo);
        intFrmAgregarCatalogo.cargarLstCatalogos();
        intFrmAgregarCatalogo.setVisible(true);
        intFrmAgregarCatalogo.setIconifiable(true);
        intFrmAgregarCatalogo.setClosable(true);
    }//GEN-LAST:event_itemAgregarCatalogoActionPerformed

    private void itemActualizarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarCatalogoActionPerformed
        IntFrmModificarCatalogo intFrmModificarCatalogo = new IntFrmModificarCatalogo();
        pantallaDinamica.add(intFrmModificarCatalogo);
        intFrmModificarCatalogo.cargarLstCatalogos();
        intFrmModificarCatalogo.limpiar();
        intFrmModificarCatalogo.setVisible(true);
        intFrmModificarCatalogo.setIconifiable(true);
        intFrmModificarCatalogo.setClosable(true);
    }//GEN-LAST:event_itemActualizarCatalogoActionPerformed

    private void itemEliminarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarCatalogoActionPerformed
        IntFrmEliminarCatalogo intFrmEliminarCatalogo = new IntFrmEliminarCatalogo();
        pantallaDinamica.add(intFrmEliminarCatalogo);
        intFrmEliminarCatalogo.cargarLstCatalogos();
        intFrmEliminarCatalogo.limpiar();
        intFrmEliminarCatalogo.setVisible(true);
        intFrmEliminarCatalogo.setIconifiable(true);
        intFrmEliminarCatalogo.setClosable(true);
    }//GEN-LAST:event_itemEliminarCatalogoActionPerformed

    private void itemAgregarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarItemActionPerformed
        IntFrmAgregarItem intFrmAgregarItem = new IntFrmAgregarItem();
        pantallaDinamica.add(intFrmAgregarItem);
        intFrmAgregarItem.cargarLstCatalogos();
        intFrmAgregarItem.limpiarFormulario();
        intFrmAgregarItem.setVisible(true);
        intFrmAgregarItem.setIconifiable(true);
        intFrmAgregarItem.setClosable(true);
    }//GEN-LAST:event_itemAgregarItemActionPerformed

    private void itemActualizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarItemActionPerformed
        IntFrmModificarItem intFrmModificarItem = new IntFrmModificarItem();
        pantallaDinamica.add(intFrmModificarItem);
        intFrmModificarItem.cargarLstCatalogos();
        intFrmModificarItem.limpiarFormulario();
        intFrmModificarItem.setVisible(true);
        intFrmModificarItem.setIconifiable(true);
        intFrmModificarItem.setClosable(true);
    }//GEN-LAST:event_itemActualizarItemActionPerformed

    private void itemEliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarItemActionPerformed
        IntFrmEliminarItem intFrmEliminarItem = new IntFrmEliminarItem();
        pantallaDinamica.add(intFrmEliminarItem);
        intFrmEliminarItem.cargarLstCatalogos();
        intFrmEliminarItem.limpiarFormulario();
        intFrmEliminarItem.setVisible(true);
        intFrmEliminarItem.setIconifiable(true);
        intFrmEliminarItem.setClosable(true);
    }//GEN-LAST:event_itemEliminarItemActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void itemAgregarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarRolActionPerformed
        IntFrmAgregarRol intFrmRol = new IntFrmAgregarRol();
        pantallaDinamica.add(intFrmRol);
        intFrmRol.cargarLstRoles();
        intFrmRol.setVisible(true);
        intFrmRol.setIconifiable(true);
        intFrmRol.setClosable(true);
    }//GEN-LAST:event_itemAgregarRolActionPerformed

    private void itemActualizarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarRolActionPerformed
        IntFrmModificarRol intFrmModificarRol = new IntFrmModificarRol();
        pantallaDinamica.add(intFrmModificarRol);
        intFrmModificarRol.cargarLstRoles();
        intFrmModificarRol.setVisible(true);
        intFrmModificarRol.setIconifiable(true);
        intFrmModificarRol.setClosable(true);
    }//GEN-LAST:event_itemActualizarRolActionPerformed

    private void itemActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarUsuarioActionPerformed
        IntFrmModificarUsuario intFrmModificarUsuario = new IntFrmModificarUsuario();
        pantallaDinamica.add(intFrmModificarUsuario);
        intFrmModificarUsuario.setVisible(true);
        intFrmModificarUsuario.setIconifiable(true);
        intFrmModificarUsuario.setClosable(true);
    }//GEN-LAST:event_itemActualizarUsuarioActionPerformed

    private void itemAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarUsuarioActionPerformed
        IntFrmAgregarUsuario intFrmAgregarUsuario = new IntFrmAgregarUsuario();
        pantallaDinamica.add(intFrmAgregarUsuario);
        intFrmAgregarUsuario.setVisible(true);
        intFrmAgregarUsuario.setIconifiable(true);
        intFrmAgregarUsuario.setClosable(true);
    }//GEN-LAST:event_itemAgregarUsuarioActionPerformed

    private void itemEliminarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarRolActionPerformed
        IntFrmEliminarRol intFrmEliminarRol = new IntFrmEliminarRol();
        pantallaDinamica.add(intFrmEliminarRol);
        intFrmEliminarRol.cargarLstRoles();
        intFrmEliminarRol.setVisible(true);
        intFrmEliminarRol.setIconifiable(true);
        intFrmEliminarRol.setClosable(true);
    }//GEN-LAST:event_itemEliminarRolActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemActualizarCatalogo;
    private javax.swing.JMenuItem itemActualizarItem;
    private javax.swing.JMenuItem itemActualizarRol;
    private javax.swing.JMenuItem itemActualizarUsuario;
    private javax.swing.JMenuItem itemAgregarAsignacionRolFuncionalidad;
    private javax.swing.JMenu itemAgregarAsignacionUsuarioRol;
    private javax.swing.JMenuItem itemAgregarCatalogo;
    private javax.swing.JMenuItem itemAgregarItem;
    private javax.swing.JMenuItem itemAgregarRol;
    private javax.swing.JMenuItem itemAgregarUsuario;
    private javax.swing.JMenu itemCatalogo;
    private javax.swing.JMenuItem itemEliminarAsignacionRolFuncionalidad;
    private javax.swing.JMenuItem itemEliminarAsignacionUsuarioRol;
    private javax.swing.JMenuItem itemEliminarCatalogo;
    private javax.swing.JMenuItem itemEliminarItem;
    private javax.swing.JMenuItem itemEliminarRol;
    private javax.swing.JMenuItem itemEliminarUsuario;
    private javax.swing.JMenu itemItems;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menuAdministracion;
    private javax.swing.JMenu menuCuentas;
    private javax.swing.JMenu menuFuncionalidades;
    private javax.swing.JMenu menuRolFuncionalidad;
    private javax.swing.JMenu menuRoles;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JDesktopPane pantallaDinamica;
    // End of variables declaration//GEN-END:variables
}
