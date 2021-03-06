/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.josefelixrestrepo.acw.interfaz;

import colegio.josefelixrestrepo.acw.logica.UsuarioLogica;

/**
 *
 * @author JULIAN RUEDA
 */
public class RegistroUsuarioFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuario
     */
    public RegistroUsuarioFrame(VentanaInicialFrame ventanaInicialFrame) {
        initComponents();
        this.ventanaInicialFrame = ventanaInicialFrame;
        setSize(338, 391);
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

        etiquetaNombres = new javax.swing.JLabel();
        etiquetaApellidos = new javax.swing.JLabel();
        etiquetaEdad = new javax.swing.JLabel();
        etiquetaCorreo = new javax.swing.JLabel();
        etiquetaContraeña = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        campoEdad = new javax.swing.JTextField();
        campoApellidos = new javax.swing.JTextField();
        campoNombres = new javax.swing.JTextField();
        campoCedula = new javax.swing.JTextField();
        etiquetaCedula = new javax.swing.JLabel();
        etiquetaTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        etiquetaUsuario = new javax.swing.JLabel();
        campoUsername = new javax.swing.JTextField();
        etiquetaResultado = new javax.swing.JLabel();
        campoContrasenia = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        etiquetaNombres.setText("Nombres:");
        getContentPane().add(etiquetaNombres);
        etiquetaNombres.setBounds(20, 50, 70, 15);

        etiquetaApellidos.setText("Apellidos:");
        getContentPane().add(etiquetaApellidos);
        etiquetaApellidos.setBounds(20, 80, 70, 15);

        etiquetaEdad.setText("Edad:");
        getContentPane().add(etiquetaEdad);
        etiquetaEdad.setBounds(20, 140, 70, 15);

        etiquetaCorreo.setText("Correo:");
        getContentPane().add(etiquetaCorreo);
        etiquetaCorreo.setBounds(20, 200, 70, 15);

        etiquetaContraeña.setText("Contraseña:");
        getContentPane().add(etiquetaContraeña);
        etiquetaContraeña.setBounds(20, 230, 110, 15);
        getContentPane().add(campoCorreo);
        campoCorreo.setBounds(130, 200, 180, 19);
        getContentPane().add(campoEdad);
        campoEdad.setBounds(130, 140, 180, 19);
        getContentPane().add(campoApellidos);
        campoApellidos.setBounds(130, 80, 180, 20);

        campoNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombresActionPerformed(evt);
            }
        });
        getContentPane().add(campoNombres);
        campoNombres.setBounds(130, 50, 180, 19);
        getContentPane().add(campoCedula);
        campoCedula.setBounds(130, 170, 180, 19);

        etiquetaCedula.setText("Cedula:");
        getContentPane().add(etiquetaCedula);
        etiquetaCedula.setBounds(20, 170, 70, 15);

        etiquetaTelefono.setText("Telefono:");
        getContentPane().add(etiquetaTelefono);
        etiquetaTelefono.setBounds(20, 260, 70, 15);

        campoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(campoTelefono);
        campoTelefono.setBounds(130, 260, 180, 19);

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar);
        botonCancelar.setBounds(20, 300, 110, 25);

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar);
        botonRegistrar.setBounds(200, 300, 110, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Registro usuario");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 0, 200, 40);

        etiquetaUsuario.setText("Usuario:");
        getContentPane().add(etiquetaUsuario);
        etiquetaUsuario.setBounds(20, 110, 70, 15);

        campoUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(campoUsername);
        campoUsername.setBounds(130, 110, 180, 19);
        getContentPane().add(etiquetaResultado);
        etiquetaResultado.setBounds(20, 330, 300, 20);
        getContentPane().add(campoContrasenia);
        campoContrasenia.setBounds(130, 230, 180, 19);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombresActionPerformed

    private void campoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefonoActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        UsuarioLogica logica = new UsuarioLogica();


        String nombre = campoNombres.getText();
        String apellidos = campoApellidos.getText();
        String password = campoContrasenia.getText();
        String confirmarPassword = campoContrasenia.getText();
        String cedula = campoCedula.getText();
        String correo = campoCorreo.getText();
        String telefono = campoTelefono.getText();
        String edad = campoEdad.getText();
        String username = campoUsername.getText();

        String resultado = logica.registrarUsuario(cedula, nombre, apellidos,  edad, correo, username, password, confirmarPassword, telefono);

        if(resultado.equals("OK")){

            campoNombres.setText("");
            campoApellidos.setText("");
            campoContrasenia.setText("");
            campoCedula.setText("");
            campoCorreo.setText("");
            campoEdad.setText("");
            campoTelefono.setText("");
        }
        else
        {
            etiquetaResultado.setText(resultado);
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void campoUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsernameActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.ventanaInicialFrame.setVisible(true);
    }//GEN-LAST:event_botonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    private VentanaInicialFrame ventanaInicialFrame;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JPasswordField campoContrasenia;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoEdad;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JTextField campoUsername;
    private javax.swing.JLabel etiquetaApellidos;
    private javax.swing.JLabel etiquetaCedula;
    private javax.swing.JLabel etiquetaContraeña;
    private javax.swing.JLabel etiquetaCorreo;
    private javax.swing.JLabel etiquetaEdad;
    private javax.swing.JLabel etiquetaNombres;
    private javax.swing.JLabel etiquetaResultado;
    private javax.swing.JLabel etiquetaTelefono;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
