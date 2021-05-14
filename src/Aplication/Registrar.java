/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplication;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Registrar extends javax.swing.JFrame {

    File f = new File("C:\\ProyectoJulioyStiven");
    int ln;
    String Username, Password, Admin;

    /**
     * Creates new form notepad
     */
    public Registrar() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void createFolder() {
        if (!f.exists()) {
           f.mkdirs();
           //f.getParentFile().mkdirs();
        }
    }

    void addData(String usr, String pswd, String Permisos) {
        try {
            RandomAccessFile raf = new RandomAccessFile(f + "\\logins.txt", "rw");
            for (int i = 0; i < ln; i++) {
                raf.readLine();
            }

            raf.writeBytes("\n" + usr + "," + pswd + "," + Permisos);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void CheckData(String usr, String pswd, String privi) {

        try {
            RandomAccessFile raf = new RandomAccessFile(f + "\\logins.txt", "rw");
            String line = raf.readLine();
            Username = line.substring(9);
            Password = raf.readLine().substring(9);

            Admin = raf.readLine().substring(5);

            if (usr.equals(Username) & pswd.equals(Password) & privi.equals(Admin)) {

                JOptionPane.showMessageDialog(null, "Usted Inicio sesion");

                Intermedio Ventana2 = new Intermedio();
                Ventana2.setVisible(true);
                this.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(null, "Usuario y contraseña incorrectos");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*void logic(String usr,String pswd, String privi){
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\logins.txt", "rw");
            for(int i=0;i<ln;i+=4){System.out.println("count "+i);
            
                String forUser = raf.readLine().substring(9);
                String forPswd = raf.readLine().substring(9);
                String forAdmi = raf.readLine().substring(5);
                if(usr.equals(forUser) & pswd.equals(forPswd) & privi.equals(forAdmi)){
                    
                    JOptionPane.showMessageDialog(null, "Usted Inicio sesion");
                    
                    if (forAdmi == "Administrador"){
                        VentanaRegistrarVentas1 Ventana2 = new VentanaRegistrarVentas1();
                        Ventana2.setVisible(true);
                        this.setVisible(false);
                    }
                    else if (forAdmi == "Asesor"){
                        VentanaRegistrarVentas_1 Ventana2 = new VentanaRegistrarVentas_1();
                        Ventana2.setVisible(true);
                        this.setVisible(false);
                    }
                        
                    
                    break;
                }else if(i==(ln-3)){
                    JOptionPane.showMessageDialog(null, "Usuario y contraseña incorrectos");
                    break;
                }
                // if you are using user & passwword without email
                // then dont forget to replace  k<=2 with k=2 below
                for(int k=1;k<=2;k++){
                    raf.readLine();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
    private static Scanner x;

    String filepath = "C:\\ProyectoJulioyStiven\\logins.txt";

    public void verificar(String username, String password, String tipo, String filepath) {
        boolean found = false;
        String TempUsername = "";
        String TempPassword = "";
        String tipotemp = "";

        try {
            x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while (x.hasNext() && !found) {
                TempUsername = x.next();
                TempPassword = x.next();
                tipotemp = x.next();

                if (TempUsername.trim().equals(username.trim()) && TempPassword.trim().equals(password.trim()) && tipotemp.trim().equals(tipo.trim())) {
                    found = true;

                }

            }
            x.close();
            System.out.println(found);
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    void countLines() {
        try {
            ln = 0;
            RandomAccessFile raf = new RandomAccessFile(f + "\\logins.txt", "rw");
            for (int i = 0; raf.readLine() != null; i++) {
                ln++;
            }
            System.out.println("number of lines:" + ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfusr = new javax.swing.JTextField();
        tfpswd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tfmail = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfmail1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("clear all");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 100, 38));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Registrar Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 310, 45));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 112, 44));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 112, 43));

        tfusr.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(tfusr, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 190, 44));

        tfpswd.setBackground(new java.awt.Color(51, 51, 51));
        tfpswd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfpswd.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(tfpswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 150, 190, 43));

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 82, 38));

        tfmail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Asesor" }));
        getContentPane().add(tfmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 120, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/espalda.png"))); // NOI18N
        jLabel11.setText("Atrás");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, new java.awt.Color(153, 153, 153)));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/geometria-3d-3586.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-310, 0, 830, 370));

        tfmail1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmail1ActionPerformed(evt);
            }
        });
        getContentPane().add(tfmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 197, 129, 42));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Clave Admin");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 197, 112, 42));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tfusr.setText("");
        tfpswd.setText("");
        //tfmail.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    public static boolean comprobar(String contra) {

        boolean Largo = false, mayus = false, numero = false, espacio = false, minus = false;
        char controlador;

        if (contra.length() > 4 && contra.length() < 8) {
            for (int i = 0; i < contra.length(); i++) {
                controlador = contra.charAt(i);

                if (mayus == false && mayusculas(controlador)) {
                    mayus = true;
                }
                if (minus == false && minusculas(controlador)) {
                    minus = true;
                }
                if (espacio == false && Espacio(controlador)) {
                    espacio = true;
                }
                if (numero == false && numeros(controlador)) {
                    numero = true;
                }
            }
            if (mayus == true && numero == true && espacio == true && minus == true) {
                Largo = true;
            }
            if (mayus == false) {
                JOptionPane.showMessageDialog(null, "La contraseña no tiene mayusculas");
            }
            if (numero == false) {
                JOptionPane.showMessageDialog(null, "La contraseña no tiene numeros");
            }
            if (espacio == false) {
                JOptionPane.showMessageDialog(null, "La contraseña no tiene caracteres especiales");
            }
            if (minus == false) {
                JOptionPane.showMessageDialog(null, "La contrasela no tiene minusculas");
            }

        } else {
            JOptionPane.showMessageDialog(null, "La contraseña no tiene el tamaño adecuado");
        }
        return Largo;
    }

    public static boolean mayusculas(char S) {

        boolean res = false;
        for (int K = 65; res == false && K <= 90; K++) {
            if (S == K) {
                res = true;
                return res;
            }
        }

        return res;
    }

    public static boolean minusculas(char S) {

        boolean res = false;
        for (int K = 97; res == false && K <= 122; K++) {
            if (S == K) {
                res = true;
                return res;
            }
        }

        return res;

    }

    public static boolean numeros(char S) {

        boolean res = false;
        for (int K = 48; res == false && K <= 57; K++) {
            if (S == K) {
                res = true;
                return res;
            }
        }

        return res;

    }

    public static boolean Espacio(char S) {
        boolean res = false;

        for (int K = 32; res == false && K <= 47; K++) {
            if (S == K) {
                res = true;
                return res;
            }
        }

        if (res == false) {

            for (int K = 58; res == false && K <= 64; K++) {
                if (S == K) {
                    res = true;
                    return res;
                }
            }
            if (res == false) {
                for (int K = 91; res == false && K <= 96; K++) {
                    if (S == K) {
                        res = true;
                        return res;
                    }
                }
                if (res == false) {
                    for (int K = 123; res == false && K <= 126; K++) {
                        if (S == K) {
                            res = true;
                            return res;
                        }
                    }
                }
            }
        }

        return res;
    }

    Login ma = new Login();

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (comprobar(tfpswd.getText())) {
            JOptionPane.showMessageDialog(null, "Contraseña valida");
            createFolder();
            ma.readFile();
            countLines();

            addData(tfusr.getText(), tfpswd.getText(), (String) tfmail.getSelectedItem());
            JOptionPane.showMessageDialog(null, "Datos registrados");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmail1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Intermedio Ventana2 = new Intermedio();
        Ventana2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> tfmail;
    private javax.swing.JTextField tfmail1;
    private javax.swing.JTextField tfpswd;
    private javax.swing.JTextField tfusr;
    // End of variables declaration//GEN-END:variables
}
