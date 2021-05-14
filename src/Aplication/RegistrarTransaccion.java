/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class RegistrarTransaccion extends javax.swing.JFrame {

   
    private ArrayList<Registro>Lis2;
    
    public RegistrarTransaccion() {
        Lis2 = new ArrayList<Registro>();
        initComponents();
        this.setLocationRelativeTo(null);
        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        TxtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setForeground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Direccion", "Telefono", "Alcobas", "Area", "Precio ", "Estado", "Transaccion"
            }
        ));
        Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabla.setEnabled(false);
        Tabla.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 900, 190));

        jButton2.setText("Ejecutar Transaccion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        jButton3.setText("Desocupar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Renta", "Venta" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 150, -1));
        jPanel1.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 170, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrar Transacciones");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 290, 60));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Renta", "Venta", "Compra" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 170, -1));

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 70, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camara-trasera.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/geometria-3d-3586.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-16, -1, 940, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String Opcion;
        long modificar2;
        double modificar3;
        Registro aux;
        
        try {
            
            Opcion = (String) jComboBox1.getSelectedItem();
            
            if ((String) Opcion == "Renta"){
                
                
                int res = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la propiedad a rentar \n Favor coloque el numero en la lista"));
                aux = Lis2.get(res-1);
            
                if (aux.getEstado().equalsIgnoreCase("Desocupado")){
                
                modificar2 = Long.parseLong(JOptionPane.showInputDialog("Ingrese el Telefono del inquilino"));
                aux.setTelefono(modificar2);
            
                
                    modificar3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la Renta"));
                    aux.setCompra(modificar3);
                    aux.setTransaccion("Renta");
                    aux.setEstdo("Rentado");
                    guardar();
                    MostrarDatos();
                    countLines();
                    AgregarNovedad(aux.getDireccion().toString(), aux.getCompra(), aux.getEstado(), aux.getTransaccion());
                }
                else {
                    JOptionPane.showMessageDialog(null, "La propiedad debe estar desocupada para hacer una transaccion con ella");
                }
                
                
            }
            else if ((String) Opcion == "Venta"){
                int res = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la propiedad a vender \n Favor coloque el numero en la lista"));
                aux = Lis2.get(res-1);
            
                if (aux.getEstado().equalsIgnoreCase("Desocupado")){
                
                    modificar2 = Long.parseLong(JOptionPane.showInputDialog("Ingrese el Telefono del comprador"));
                    aux.setTelefono(modificar2);
            
                    modificar3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la venta"));
                    double temp = aux.getCompra() * 0.15;
                
                    aux.setCompra(modificar3 + temp);
                    aux.setTransaccion("Venta");
                    aux.setEstdo("Vendido");
                    guardar();
                    MostrarDatos();
                    countLines();
                    AgregarNovedad(aux.getDireccion().toString(), aux.getCompra(), aux.getEstado(), aux.getTransaccion());
            
                    }
                }
         
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        

        if (!TxtBuscar.getText().isEmpty()){
            Registro aux = null;
            String str = TxtBuscar.getText();
            
            
            if ((String)jComboBox2.getSelectedItem() == "Venta" ){
                for (int j = 0; j < Lis2.size(); j++) {
                    aux = Lis2.get(j);
                    if (aux.getTransaccion().equals("Venta") && aux.getDireccion().equals(str)) {
                        Mostrar1(aux);
                    }
                }
            }
            else if ((String)jComboBox2.getSelectedItem() == "Compra" ){
                for (int j = 0; j < Lis2.size(); j++) {
                    aux = Lis2.get(j);
                    if (aux.getTransaccion().equals("Compra") && aux.getDireccion().equals(str)) {
                        Mostrar1(aux);
                    }
                }
            }
            else if ((String)jComboBox2.getSelectedItem() == "Renta" ){
                for (int j = 0; j < Lis2.size(); j++) {
                    aux = Lis2.get(j);
                    if (aux.getTransaccion().equals("Renta") && aux.getDireccion().equals(str)) {
                        Mostrar1(aux);
                    }
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Ingrese una direccion valids");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        MostrarDatos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Intermedio V12 = new Intermedio();
        V12.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private boolean bandera;
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        int res = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la propiedad a desocupar \n Favor coloque el numero en la lista"));
        Registro aux = Lis2.get(res-1);

        aux.setEstdo("Desocupado");
        MostrarDatos();
        guardar();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    //File f = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\ProyectoJulioyStiven");
    File f = new File("C:\\ProyectoJulioyStiven");
    int ln;
    String Username,Password,Admin;
    
    void createFolder(){
        if(!f.exists()){
            f.mkdirs();
        }
    }
   
    void countLines(){
        try {
            ln=0;
            RandomAccessFile raf = new RandomAccessFile(f+"\\Novedades.txt", "rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("number of lines:"+ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    void AgregarNovedad(String Dire,double precio,String Estado, String Transa){
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\Novedades.txt", "rw");
            for(int i=0;i<ln;i++){
                raf.readLine();
            }
            
            if (Transa.equalsIgnoreCase("Venta")){
                
                Date fecha = new Date();
                fecha.getTime();
                
                raf.writeBytes("\n"+fecha + " la propiedad ubicada en: "+Dire+ ", Se vendio por: "+precio+" pesos, estado actual: "+Estado);
            }
            else if (Transa.equalsIgnoreCase("Renta")){
                Date fecha = new Date();
                fecha.getTime();
                
                raf.writeBytes("\n"+fecha + " la propiedad ubicada en: "+Dire+ ", Se arrendo por: "+precio+" pesos, estado actual: "+Estado);
                
            }
            else if (Estado.equalsIgnoreCase("Desocupado")){
                Date fecha = new Date();
                fecha.getTime();
                
                raf.writeBytes("\n"+fecha + " la propiedad ubicada en: "+Dire+ ", Se Desocupo");
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    private void guardar(){
        File file = new File ("Propiedades.txt");
        PrintWriter Escribe;
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (Exception e) {
            }
        }
        try {
            Registro aux;
            Escribe = new PrintWriter(file, "utf-8");
            for (int i = 0; i < Lis2.size(); i++) {
                aux = Lis2.get(i);
                aux.guardar(Escribe);
            }
            Escribe.close();
        } catch (Exception e) {
        }
    }
    
    public void cargar(){
        File archivo = new File ("Propiedades.txt");
        FileReader Leer;
        BufferedReader Almacen;
        Registro Reg, aux = new Registro();
        try {
            Leer = new FileReader(archivo);
            Almacen = new BufferedReader(Leer);
            Reg = aux.cargar(Almacen);
            
            while (Reg != null) {
                Lis2.add(Reg);
                Reg = aux.cargar(Almacen);
            }
            Almacen.close();
            Leer.close();
            MostrarDatos();
        } catch (Exception e) {
        }
    }
    
    
    private void MostrarDatos() {
        String Matriz [] [] = new String [Lis2.size()] [7];
        Registro aux;
        
        for (int i = 0; i < Lis2.size(); i++) {
            aux = Lis2.get(i);
            
            Matriz [i] [0] = aux.getDireccion();
            Matriz [i] [1] = Long.toString(aux.getTelefono());
            Matriz [i] [2] = aux.getAlcobas();
            Matriz [i] [3] = aux.getArea();
            Matriz [i] [4] = Double.toString(aux.getCompra());
            Matriz [i] [5] = aux.getEstado();
            Matriz [i] [6] = aux.getTransaccion();
        }
        
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            Matriz, 
            new String [] {
                "Direccion", "Telefono", "Alcobas", "Area", "Precio Compra", "Estado", "Transaccion"
            }
        ));
        
        
    }
    
    
    private void Mostrar1(Registro aux){
        String Matriz [] [] = new String [1] [9];
        
        Matriz [0] [0] = aux.getDireccion();
        Matriz [0] [1] = Long.toString(aux.getTelefono());
        Matriz [0] [2] = aux.getAlcobas();
        Matriz [0] [3] = aux.getArea();
        Matriz [0] [4] = Double.toString(aux.getCompra());
        Matriz [0] [5] = aux.getEstado();
        Matriz [0] [6] = aux.getTransaccion();
        
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            Matriz, 
            new String [] {
                "Direccion", "Telefono", "Alcobas", "Area", "Precio Compra", "Estado", "Transaccion"
            }
        ));
    }
    
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
            java.util.logging.Logger.getLogger(RegistrarTransaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarTransaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarTransaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarTransaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarTransaccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
