/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegiojosefelix;

import java.awt.HeadlessException;

/**
 *
 * @author JULIAN RUEDA
 */
public class MenuFrame extends javax.swing.JFrame {

    

    /**
     * Creates new form MenuFrame
     */
    
        public MenuFrame(MenuContactoPanel MenuContactoPanel) {
        initComponents();
        this.MenuContactoPanel = menuContactoPanel;

        setSize(500, 500);
    }

        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicion = new javax.swing.JMenu();
        menuQuienesSomos = new javax.swing.JMenu();
        menuMascotas = new javax.swing.JMenu();
        menuGatos = new javax.swing.JMenuItem();
        menuPerros = new javax.swing.JMenuItem();
        Contacto = new javax.swing.JMenu();
        menuConfiguracion = new javax.swing.JMenu();
        menuConfiguracionUsuario = new javax.swing.JMenuItem();
        menuConfiguracionEmpleado = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        menuInicion.setText("Inicio");
        jMenuBar1.add(menuInicion);

        menuQuienesSomos.setText("¿Quienes somos?");
        jMenuBar1.add(menuQuienesSomos);

        menuMascotas.setText("Mascotas");

        menuGatos.setText("Gatos");
        menuMascotas.add(menuGatos);

        menuPerros.setText("Perros");
        menuMascotas.add(menuPerros);

        jMenuBar1.add(menuMascotas);

        Contacto.setText("Contacto");
        Contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactoActionPerformed(evt);
            }
        });
        jMenuBar1.add(Contacto);

        menuConfiguracion.setText("Acceso");

        menuConfiguracionUsuario.setText("Usuario");
        menuConfiguracion.add(menuConfiguracionUsuario);

        menuConfiguracionEmpleado.setText("Empleado");
        menuConfiguracion.add(menuConfiguracionEmpleado);

        jMenuBar1.add(menuConfiguracion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactoActionPerformed
        // TODO add your handling code here:
                this.setVisible(false);
                this.menuContactoPanel.setVisible(true);

    }//GEN-LAST:event_ContactoActionPerformed
        public static void main(String... args){
        
        MenuFrame menuFrame = new menuFrame();
        menuFrame.setVisible(true);
    }
    public MenuFrame() throws HeadlessException {
    }
    /**
     * @param args the command line arguments
     */
   private MenuContactoPanel menuContactoPanel; 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Contacto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu menuConfiguracion;
    private javax.swing.JMenuItem menuConfiguracionEmpleado;
    private javax.swing.JMenuItem menuConfiguracionUsuario;
    private javax.swing.JMenuItem menuGatos;
    private javax.swing.JMenu menuInicion;
    private javax.swing.JMenu menuMascotas;
    private javax.swing.JMenuItem menuPerros;
    private javax.swing.JMenu menuQuienesSomos;
    // End of variables declaration//GEN-END:variables
}
