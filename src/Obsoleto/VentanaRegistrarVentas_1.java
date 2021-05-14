package Obsoleto;

import Aplication.Login;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;


public class VentanaRegistrarVentas_1 extends javax.swing.JFrame {
    public void limpiar() {
        JTextField caja;
        for (int i = 0; i < jPanel1.getComponentCount(); i++) {
            if (jPanel1.getComponent(i).getClass().getName().equals("javax.swing.JTextField")) {
                caja = (JTextField) jPanel1.getComponent(i);
                caja.setText("");
            }
        }
        
    }
  
    int i = 0;
    
    private ArrayList<persona> Lis; //Declarar Lista
    public List<persona> getList() { 
        return Lis; 
    }
    public VentanaRegistrarVentas_1() {
        Lis = new ArrayList<persona>(); // Nueva lista
        
        
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePersona = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TxtBuscar = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Ventas");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro Ventas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 250, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Atrás");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, new java.awt.Color(153, 153, 153)));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 40));

        jTablePersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Direccion", "Telefono", "Total alcobas", "Area total", "Estado", "Valor Venta", "Valor Compra", "Valor Arriendo"
            }
        ));
        jTablePersona.setEnabled(false);
        jScrollPane1.setViewportView(jTablePersona);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 880, 340));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar Direccion");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 160, 40));
        jPanel1.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 180, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Direccion", "Ventas", "Arrendadas", "Compras" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Resetear Busqueda");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 140, 180, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/geometria-3d-3586.jpg"))); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Retroceder
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Login Ventana25 = new Login();
        Ventana25.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked
    
    

   
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed
    

    public void cargar(){
        File Archivo = new File("Ventas.txt");
        FileReader Leer = null;
        BufferedReader Almacen = null;
        persona aux = new persona ();
        persona per;
        try {
            Leer = new FileReader(Archivo);
            Almacen = new BufferedReader(Leer);
            per = aux.cargar(Almacen);
            while (per != null){
                Lis.add(per);
                per = aux.cargar(Almacen);
            }
            Almacen.close();
            Leer.close();
        } catch (Exception e){            
        }
        verDatos();
    }
    
    private void guardar(){
        File file = new File("Ventas.txt");
        PrintWriter Escribe;
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (Exception e){                
            }
        }
        
        try{
            persona aux;
            Escribe = new PrintWriter(file, "utf-8");
            for (int j = 0; j < Lis.size(); j++) {
                aux = Lis.get(j);
                aux.guardar(Escribe);
            }
            Escribe.close();
        } catch (Exception e){
            
        }
        
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        if (!TxtBuscar.getText().isEmpty()){
            persona aux = null;
            String str = TxtBuscar.getText();
            
            if ((String)jComboBox1.getSelectedItem() == "Direccion"){
                for (int j = 0; j < Lis.size(); j++) {
                    aux = Lis.get(j);
                    if (aux.getDireccion().equals(str)) {
                        mostrarPersona(aux);
                    }
                }
            }
            else if ((String)jComboBox1.getSelectedItem() == "Ventas" ){
                for (int j = 0; j < Lis.size(); j++) {
                    aux = Lis.get(j);
                    if (aux.getType().equals("Venta") && aux.getDireccion().equals(str)) {
                        mostrarPersona(aux);
                    }
                }
            }
            else if ((String)jComboBox1.getSelectedItem() == "Compras" ){
                for (int j = 0; j < Lis.size(); j++) {
                    aux = Lis.get(j);
                    if (aux.getType().equals("Compra") && aux.getDireccion().equals(str)) {
                        mostrarPersona(aux);
                    }
                }
            }
            else if ((String)jComboBox1.getSelectedItem() == "Arrendadas" ){
                for (int j = 0; j < Lis.size(); j++) {
                    aux = Lis.get(j);
                    if (aux.getType().equals("Renta") && aux.getDireccion().equals(str)) {
                        mostrarPersona(aux);
                    }
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Ingrese una direccion valids");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        verDatos();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void mostrarPersona(persona aux) {
        
        String Mat[][] = new String [1] [9];

            
            Mat [0] [0] = aux.getDireccion();
            Mat [0] [1] = Long.toString(aux.getTelefono());
            Mat [0] [2] = aux.getTotalAlcobas();
            Mat [0] [3] = aux.getAreaTotal();
            Mat [0] [4] = aux.getEstado();
            Mat [0] [5] = aux.getType();
            Mat [0] [6] = Double.toString(aux.getValorVenta());
            Mat [0] [7] = Double.toString(aux.getValorCompra());
            Mat [0] [8] = Double.toString(aux.getValorArriendo());
            
            
            jTablePersona.setModel(new javax.swing.table.DefaultTableModel(
            Mat,
            new String [] {
                "Direccion", "Telefono", "Total alcobas", "Area Total", "Estado","Tipo" ,"Valor Venta","Valor Arriendo", "Valor Compra"
            }
        ));
    }
    
   private void verDatos(){
        String Mat[][] = new String [Lis.size()] [9];
        persona aux;
        for (int i = 0; i < Lis.size(); i++) {
            aux = Lis.get(i);
            Mat [i] [0] = aux.getDireccion();
            Mat [i] [1] = Long.toString(aux.getTelefono());
            Mat [i] [2] = aux.getTotalAlcobas();
            Mat [i] [3] = aux.getAreaTotal();
            Mat [i] [4] = aux.getEstado();
            Mat [i] [5] = aux.getType();
            Mat [i] [6] = Double.toString(aux.getValorVenta());
            Mat [i] [7] = Double.toString(aux.getValorCompra());
            Mat [i] [8] = Double.toString(aux.getValorArriendo());
            
            
        }
        
        jTablePersona.setModel(new javax.swing.table.DefaultTableModel(
            Mat,
            new String [] {
                "Direccion", "Telefono", "Total alcobas", "Area Total", "Estado","Tipo" ,"Valor Venta", "Valor Arriendo", "Valor Compra"
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
            java.util.logging.Logger.getLogger(VentanaRegistrarVentas_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVentas_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVentas_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVentas_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrarVentas_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTablePersona;
    // End of variables declaration//GEN-END:variables

    
}
