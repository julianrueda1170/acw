/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.josefelixrestrepo.acw.interfaz;

import colegio.josefelixrestrepo.acw.logica.AdministradorLogica;

/**
 *
 * @author JULIAN RUEDA
 */
public class RegistrarAdministradorFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarAdministradorFrame
     */
    public RegistrarAdministradorFrame(VentanaInicialFrame ventanaInicialFrame) {
        initComponents();
        this.ventanaInicialFrame = ventanaInicialFrame;
        setSize(400, 291);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaUsuario = new javax.swing.JLabel();
        etiquetaPassword = new javax.swing.JLabel();
        etiquetaCorreo = new javax.swing.JLabel();
        etiquetaConfirmarPassword = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        etiquetaResultado = new javax.swing.JLabel();
        campoPassword = new javax.swing.JPasswordField();
        campoConfirmacionPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        etiquetaUsuario.setText("Usuario:");
        getContentPane().add(etiquetaUsuario);
        etiquetaUsuario.setBounds(20, 70, 130, 15);

        etiquetaPassword.setText("Contraseña:");
        getContentPane().add(etiquetaPassword);
        etiquetaPassword.setBounds(20, 130, 100, 15);

        etiquetaCorreo.setText("Correo:");
        getContentPane().add(etiquetaCorreo);
        etiquetaCorreo.setBounds(20, 100, 130, 15);

        etiquetaConfirmarPassword.setText("Confirmar Contraseña:");
        getContentPane().add(etiquetaConfirmarPassword);
        etiquetaConfirmarPassword.setBounds(20, 160, 190, 15);

        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(campoUsuario);
        campoUsuario.setBounds(210, 70, 130, 19);
        getContentPane().add(campoCorreo);
        campoCorreo.setBounds(210, 100, 130, 19);

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar);
        botonRegistrar.setBounds(220, 220, 160, 25);

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar);
        botonCancelar.setBounds(20, 220, 160, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Registro Empleado");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 20, 270, 29);
        getContentPane().add(etiquetaResultado);
        etiquetaResultado.setBounds(20, 190, 360, 20);
        getContentPane().add(campoPassword);
        campoPassword.setBounds(210, 130, 130, 19);
        getContentPane().add(campoConfirmacionPassword);
        campoConfirmacionPassword.setBounds(210, 160, 130, 19);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        AdministradorLogica logica = new AdministradorLogica();

        String usuario = campoUsuario.getText();
        String correo = campoCorreo.getText();
        String password = campoPassword.getText();
        String confirmarPassword = campoConfirmacionPassword.getText();

        String resultado = logica.registrarAdministrador(usuario, password, confirmarPassword, correo);

        if (resultado.equals("OK")) {

            campoConfirmacionPassword.setText("");
            campoCorreo.setText("");
            campoPassword.setText("");
            campoUsuario.setText("");

            etiquetaResultado.setText("Se ha registrado el administrador correctamente !");
        } else {
            etiquetaResultado.setText(resultado);
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.ventanaInicialFrame.setVisible(true);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void campoPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    private VentanaInicialFrame ventanaInicialFrame;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JPasswordField campoConfirmacionPassword;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JPasswordField campoPassword;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel etiquetaConfirmarPassword;
    private javax.swing.JLabel etiquetaCorreo;
    private javax.swing.JLabel etiquetaPassword;
    private javax.swing.JLabel etiquetaResultado;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
