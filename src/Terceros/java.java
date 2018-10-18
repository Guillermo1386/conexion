/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terceros;

import javax.swing.JOptionPane;
import org.omg.CORBA.Context;
import org.omg.CORBA.ContextList;
import org.omg.CORBA.DomainManager;
import org.omg.CORBA.ExceptionList;
import org.omg.CORBA.NVList;
import org.omg.CORBA.NamedValue;
import org.omg.CORBA.Policy;
import org.omg.CORBA.Request;
import org.omg.CORBA.SetOverrideType;


public class java extends javax.swing.JFrame {

    
    private DefaultTableMode1 modeloTabla;   
    public java() {
        modeloTabla= new DefaultTableMode1(null,getColumn());
        initComponents();
    }
    private String [] getColumn(){
        String columnas[] = new String[]{"Nombre","Apellidos","telefonos"};
    return columnas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btbguardar = new javax.swing.JButton();
        btbeliminar = new javax.swing.JButton();
        btblimpiar = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnconsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btbguardar.setText("Guardar");
        btbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btbguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 113, -1, -1));

        btbeliminar.setText("Eliminar");
        btbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbeliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btbeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 153, -1, -1));

        btblimpiar.setText("Limpiar");
        getContentPane().add(btblimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 203, -1, -1));

        lblnombre.setText("Nombre");
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 121, -1, -1));

        lblapellido.setText("Apellido");
        getContentPane().add(lblapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 161, -1, -1));

        lbltelefono.setText("Telefono");
        getContentPane().add(lbltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 203, -1, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 117, 107, -1));
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 157, 107, -1));
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 207, 104, -1));

        jTable1.setModel(model table);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 35, 570, 150));

        btnconsultar.setText("Consultar");
        getContentPane().add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 239, -1, -1));

        jLabel1.setText("Terceros");
        jLabel1.setDoubleBuffered(true);
        jLabel1.setIconTextGap(6);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 6, 96, 50));

        txtid.setText("id");
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, 45, -1));

        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 77, 107, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbguardarActionPerformed
    Tercero objTercero = new Tercero() {
        @Override
        public boolean insertarTercero(String nombres, String apellidos, String telefonos) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean actualizarTercero(int id, String nombres, String apellidos, String telefonos) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean eliminarTercero(int id) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String consultarTercero(int id) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void shoutdown() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean _is_a(String repositoryIdentifier) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean _is_equivalent(org.omg.CORBA.Object other) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean _non_existent() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int _hash(int maximum) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public org.omg.CORBA.Object _duplicate() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void _release() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public org.omg.CORBA.Object _get_interface_def() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Request _request(String operation) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Request _create_request(Context ctx, String operation, NVList arg_list, NamedValue result) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Request _create_request(Context ctx, String operation, NVList arg_list, NamedValue result, ExceptionList exclist, ContextList ctxlist) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Policy _get_policy(int policy_type) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public DomainManager[] _get_domain_managers() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public org.omg.CORBA.Object _set_policy_override(Policy[] policies, SetOverrideType set_add) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    String nombres = txtnombre.toString();
    String apellido = txtapellido.toString();
    String telefono = txttelefono.toString();
    int id = Integer.parseInt(txtid.toString());
    
    if (id == 0){
        boolean resultado = objTercero.insertarTercero(nombres, apellido, telefono);
        if(resultado == true){
            JOptionPane.showMessageDialog(null, "Se inserto un nuevo registro");
            //cargarTabla();
            
        }else {
            JOptionPane.showMessageDialog(null, "Error al insertar");
        }
    }else{
        boolean resultado = objTercero.actualizarTercero(id, nombres, apellido, telefono);
        if(resultado == true){
            JOptionPane.showInternalMessageDialog(null, "Se actulizo registro");
            //cargarTabla();
        }else {
            JOptionPane.showMessageDialog(null, "Error al actulizar");
        }
              
    }  
    }//GEN-LAST:event_btbguardarActionPerformed

    private void btbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbeliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btbeliminarActionPerformed

  
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
            java.util.logging.Logger.getLogger(java.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(java.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(java.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(java.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new java().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbeliminar;
    private javax.swing.JButton btbguardar;
    private javax.swing.JButton btblimpiar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JLabel txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    private static class awt {

        public awt() {
        }

        private static class EventQueue {

            private static void invokeLater(Runnable runnable) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            public EventQueue() {
            }
        }

        private static class event {

            public event() {
            }

            private static class ActionEvent {

                public ActionEvent() {
                }
            }
        }
    }

    private static class DefaultTableMode1 {

        public DefaultTableMode1() {
        }

        private DefaultTableMode1(Object object, String[] column) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
