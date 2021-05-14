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

/**
 *
 * @author Usuario
 */
public class RegistrarCompra extends javax.swing.JFrame {

   
    private ArrayList<Registro>Lis2;
    
    public RegistrarCompra() {
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
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        AgregarDa = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setForeground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Direccion", "Telefono", "Alcobas", "Area", "Precio Compra", "Estado", "Transaccion"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 860, 160));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 110, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 110, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Direccion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Precio Compra");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Area");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alcobas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 110, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 110, -1));

        AgregarDa.setText("Registrar Compra");
        AgregarDa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarDaActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarDa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 110, -1));

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 110, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agregar Nueva Propiedad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camara-trasera.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/geometria-3d-3586.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -1, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int c;
        try {
            c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila a borrar"));
            Lis2.remove((c-1));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Favor Dijite una fila valida para eliminar");
        }
        MostrarDatos();  
        guardar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AgregarDaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarDaActionPerformed

        String Dir, Alc, Art, Est, Trans; 
        long Tel; double Comp, Rent = 0;
        
        try {
            Dir   = jTextField1.getText();
            Tel   = Long.parseLong(jTextField2.getText());
            Alc   = jTextField3.getText();
            Art   = jTextField4.getText();
            Comp  = Double.parseDouble(jTextField5.getText());
            Est   = "Desocupado";
            Trans = "Compra";
                    
            
            Lis2.add(new Registro(Dir,Tel,Alc,Art,Comp,Est,Trans));
            countLines();
            AgregarNovedad(jTextField1.getText(),Double.parseDouble(jTextField5.getText()),Est, Trans);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifica los datos");
        }
        MostrarDatos();
        guardar();
        
    }//GEN-LAST:event_AgregarDaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


        int modificador , c; 
        Registro aux;
        String modificador2;
        try{
       
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la propiedad a modificar"));
        aux = Lis2.get(c-1);
        
        
        int res = Integer.parseInt(JOptionPane.showInputDialog("Favor ingrese la opcion a modificar"
                    + "\n 1- Direccion" + "\n 2- Telefono" + "\n 3- Total alcobas " + "\n 4- Area Total"
                    + "\n 5- Estado" + "\n 6- Precio"));

        switch (res){
                
                case 1: modificador2 = JOptionPane.showInputDialog("Ingrese la nueva direccion"); 
                        aux.setDireccion(modificador2);
                    break;
                
                case 2: modificador  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo telefono"));
                        aux.setTelefono(modificador);
                    break;
                    
                case 3: modificador2 = JOptionPane.showInputDialog("Ingrese la nueva cantidad de alcobas");
                        aux.setAlcobas(modificador2);
                    break;
                    
                case 4: modificador2 = JOptionPane.showInputDialog("Ingrese la nueva area total");
                        aux.setArea(modificador2);
                    break;
                    
                case 5: modificador2 = JOptionPane.showInputDialog("Ingrese el nuevo estado");
                        aux.setEstdo(modificador2);
                    break;
                    
                case 6: modificador  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo precio"));
                        aux.setCompra(modificador);
                    break;
                      
                default: JOptionPane.showMessageDialog(null, "Debe escoger una opcion valida");
                    break;
            }

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Escoja una fila");
        }
        
        guardar();
        MostrarDatos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        Intermedio V13 = new Intermedio();
        V13.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    //File f = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\ProyectoJulioyStiven");
    File f = new File("C:\\ProyectoJulioyStiven");
    int ln;
    
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
            
            
            if (Transa.equalsIgnoreCase("Compra")){
                Date fecha = new Date();
                fecha.getTime();
                
                raf.writeBytes("\n" +fecha + " la propiedad ubicada en: "+Dire+ ", Se compro por: "+precio+" pesos, estado actual: "+Estado);
                
                
            }
            else {
                System.out.println("error");
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
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarDa;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    
}
