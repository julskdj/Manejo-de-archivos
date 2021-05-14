package Obsoleto;

import Aplication.Intermedio;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;


public class VentanaRegistrarVentas1 extends javax.swing.JFrame {
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
    
    public VentanaRegistrarVentas1() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextoDireccion = new javax.swing.JTextField();
        Texto_Telefono = new javax.swing.JTextField();
        TextoAlcobas = new javax.swing.JTextField();
        Texto_Area = new javax.swing.JTextField();
        CampoVenta = new javax.swing.JTextField();
        CampoCompra = new javax.swing.JTextField();
        CampoArriendo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePersona = new javax.swing.JTable();
        JCBEstado1 = new javax.swing.JComboBox<>();
        TipoTrans = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
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
        jLabel1.setText("Registrar Venta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 250, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 80, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total alcobas:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Area total:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 90, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor Venta:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Valor Compra:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 120, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Valor Arriendo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 120, 30));

        TextoDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(TextoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 140, 30));

        Texto_Telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Texto_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto_TelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(Texto_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 140, 30));

        TextoAlcobas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextoAlcobas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoAlcobasActionPerformed(evt);
            }
        });
        jPanel1.add(TextoAlcobas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 140, 30));

        Texto_Area.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Texto_Area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto_AreaActionPerformed(evt);
            }
        });
        jPanel1.add(Texto_Area, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 130, 30));

        CampoVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CampoVenta.setText("0");
        CampoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoVentaActionPerformed(evt);
            }
        });
        jPanel1.add(CampoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 130, 30));

        CampoCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CampoCompra.setText("0");
        CampoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCompraActionPerformed(evt);
            }
        });
        jPanel1.add(CampoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 130, -1));

        CampoArriendo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CampoArriendo.setText("0");
        CampoArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoArriendoActionPerformed(evt);
            }
        });
        jPanel1.add(CampoArriendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 130, -1));

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
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aceptar.png"))); // NOI18N
        jLabel12.setText("Registrar venta");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, new java.awt.Color(153, 153, 153)));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 160, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aceptar.png"))); // NOI18N
        jLabel13.setText("Modificar");
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, new java.awt.Color(153, 153, 153)));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cerrar (2).png"))); // NOI18N
        jLabel2.setText("Eliminar");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 120, 40));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 870, 240));

        JCBEstado1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JCBEstado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arrendado", "Desocupado", "Ocupado" }));
        JCBEstado1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(JCBEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 130, 30));

        TipoTrans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Venta", "Compra", "Renta" }));
        jPanel1.add(TipoTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 130, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco-flexible.png"))); // NOI18N
        jLabel14.setText("Guardar");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 120, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/geometria-3d-3586.jpg"))); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 650));

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

    private void TextoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoDireccionActionPerformed

    private void Texto_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Texto_TelefonoActionPerformed

    private void TextoAlcobasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoAlcobasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoAlcobasActionPerformed

    private void Texto_AreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto_AreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Texto_AreaActionPerformed

    private void CampoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoVentaActionPerformed

    private void CampoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCompraActionPerformed

    private void CampoArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoArriendoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoArriendoActionPerformed
    //Retroceder
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Intermedio Ventana2 = new Intermedio();
        Ventana2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked
    
    

    //Boton de Registrar
    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        i++;      
        String Dir,TAlc, AreaT, Est , Type;
        double Vent,Arri,Comp;
        long Tel;
        try{
            Dir = TextoDireccion.getText();
            Tel = Long.parseLong(Texto_Telefono.getText());
            TAlc  = TextoAlcobas.getText();
            AreaT = Texto_Area.getText();
            Vent = Double.parseDouble(CampoVenta.getText());
            Arri = Double.parseDouble(CampoArriendo.getText());
            Comp = Double.parseDouble(CampoCompra.getText());
            Est = (String) JCBEstado1.getSelectedItem();
            Type = (String) TipoTrans.getSelectedItem();
            
            
            if  ((String) Est == "Arrendado"){
                JOptionPane.showMessageDialog(null, "No se puede guardar datos estando Arrendada una propiedad");
            }
            else{
                if (Vent > 0 && Arri == 0 && Comp > 0 && Type == "Venta"){
                    
                    
                    
                    Vent = (Comp * 0.15) + Vent;
                    Lis.add(new persona(Dir, Tel, TAlc, AreaT, Est, Type ,Vent, Arri,Comp));
                       
                }
                else if (Vent == 0 && Arri > 0 && Comp == 0){
                    Type = "Renta";
                    Lis.add(new persona(Dir, Tel, TAlc, AreaT, Est,Type ,Vent, Arri,Comp));
                    
                }
                else if (Vent == 0 && Arri == 0 && Comp > 0){
                    Type = "Compra";
                    Lis.add(new persona(Dir, Tel, TAlc, AreaT, Est, Type,Vent, Arri,Comp));
                    
                }
                else {
                    JOptionPane.showMessageDialog(null, "Los campos deben ser validos");
                }
            }
                      
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Llena todos los campos correctamente");   
        }
        
        verDatos();
        guardar();
    }//GEN-LAST:event_jLabel12MouseClicked
    
    //Boton de modificar
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        
        int c, modificador, res;
        String modificador2;
        persona aux;
        try{
            c = Integer.parseInt(JOptionPane.showInputDialog("Coloque el numero de la fila a modificar"));;
            aux = Lis.get((c-1));
            res = Integer.parseInt(JOptionPane.showInputDialog("Favor ingrese la opcion a modificar"
                    + "\n 1- Direccion" + "\n 2- Telefono" + "\n 3- Total alcobas " + "\n 4- Area Total"
                    + "\n 5- Estado" + "\n 6- Valor Venta" + "\n 7- Valor Compra" + "\n 8- Valor Arriendo"));
            switch (res){
                
                case 1: modificador2 = JOptionPane.showInputDialog("Ingrese la nueva direccion"); 
                        aux.setDireccion(modificador2);
                    break;
                
                case 2: modificador  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo telefono"));
                        aux.setTelefono(modificador);
                    break;
                    
                case 3: modificador2 = JOptionPane.showInputDialog("Ingrese la nueva cantidad de alcobas");
                        aux.setTotalAlcobas(modificador2);
                    break;
                    
                case 4: modificador2 = JOptionPane.showInputDialog("Ingrese la nueva area total");
                        aux.setAreaTotal(modificador2);
                    break;
                    
                case 5: modificador2 = JOptionPane.showInputDialog("Ingrese el nuevo estado");
                        aux.setEstado(modificador2);
                    break;
                    
                case 6: modificador  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo valor de venta"));
                        aux.setValorVenta(modificador);
                    break;
                    
                case 7: modificador  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo valor de Compra"));
                        aux.setValorCompra(modificador);
                    break;
                    
                case 8: modificador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo valor de Arriendo"));
                        aux.setValorArriendo(modificador);
                    break;
                    
                default: JOptionPane.showMessageDialog(null, "Debe escoger una opcion valida");
                    break;
            }
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Escoja una fila");
        }
        verDatos();
        guardar();
        
    }//GEN-LAST:event_jLabel13MouseClicked
    //Boton de eliminar
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        int c;
        try {
            c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila a borrar"));
            Lis.remove((c-1));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Favor Dijite una fila valida para eliminar");
        }
        verDatos();  
        guardar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

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

        String botones [] = {"Si", "No"};
        int n = JOptionPane.showOptionDialog(null, "Desea guardar la informacion?", "Salir", 0, 0, null, botones, null);
        
        if (n == 0){
            guardar();
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        guardar();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

   public void verDatos(){
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
            Mat [i] [7] = Double.toString(aux.getValorArriendo());
            Mat [i] [8] = Double.toString(aux.getValorCompra());
        }
        
        jTablePersona.setModel(new javax.swing.table.DefaultTableModel(
            Mat,
            new String [] {
                "Direccion", "Telefono", "Total alcobas", "Area Total", "Estado","Tipo" ,"Valor Venta","Valor Compra" ,"Valor Arriendo", 
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
            java.util.logging.Logger.getLogger(VentanaRegistrarVentas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVentas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVentas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVentas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrarVentas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoArriendo;
    private javax.swing.JTextField CampoCompra;
    private javax.swing.JTextField CampoVenta;
    private javax.swing.JComboBox<String> JCBEstado1;
    private javax.swing.JTextField TextoAlcobas;
    private javax.swing.JTextField TextoDireccion;
    private javax.swing.JTextField Texto_Area;
    private javax.swing.JTextField Texto_Telefono;
    private javax.swing.JComboBox<String> TipoTrans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTablePersona;
    // End of variables declaration//GEN-END:variables
}
