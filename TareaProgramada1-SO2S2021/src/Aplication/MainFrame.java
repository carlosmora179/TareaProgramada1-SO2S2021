package Aplication;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlosmora
 */


public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    
    File archivo;
    
    
    public MainFrame() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfFile = new javax.swing.JTextField();
        btnOpenFile = new javax.swing.JButton();
        btnStrat = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lbFileError = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMemory = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfDX = new javax.swing.JTextField();
        tfCX = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfBX = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfAX = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfAC = new javax.swing.JTextField();
        tfPC = new javax.swing.JTextField();
        tfIR = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TareaProgramada1SO");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Achivo asm");

        tfFile.setToolTipText("");

        btnOpenFile.setText("Abrir");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        btnStrat.setText("Inicar");
        btnStrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStratActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lbFileError.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbFileError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfFile, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpenFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStrat)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenFile)
                    .addComponent(btnStrat)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbFileError, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblMemory.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblMemory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Reservado", "Reservado"},
                { new Integer(2), "Reservado", "Reservado"},
                { new Integer(3), "Reservado", "Reservado"},
                { new Integer(4), "Reservado", "Reservado"},
                { new Integer(5), "Reservado", "Reservado"},
                { new Integer(6), "Reservado", "Reservado"},
                { new Integer(7), "Reservado", "Reservado"},
                { new Integer(8), "Reservado", "Reservado"},
                { new Integer(9), "Reservado", "Reservado"},
                { new Integer(10), "Reservado", "Reservado"},
                { new Integer(11), "Reservado", "Reservado"},
                { new Integer(12), "Reservado", "Reservado"},
                { new Integer(13), "Reservado", "Reservado"},
                { new Integer(14), "Reservado", "Reservado"},
                { new Integer(15), "Reservado", "Reservado"},
                { new Integer(16), "Reservado", "Reservado"},
                { new Integer(17), "Reservado", "Reservado"},
                { new Integer(18), "Reservado", "Reservado"},
                { new Integer(19), "Reservado", "Reservado"},
                { new Integer(20), "Reservado", "Reservado"},
                { new Integer(21), null, null},
                { new Integer(22), null, null},
                { new Integer(23), null, null},
                { new Integer(24), null, null},
                { new Integer(25), null, null},
                { new Integer(26), null, null},
                { new Integer(27), null, null},
                { new Integer(28), null, null},
                { new Integer(29), null, null},
                { new Integer(30), null, null},
                { new Integer(31), null, null},
                { new Integer(32), null, null},
                { new Integer(33), null, null},
                { new Integer(34), null, null},
                { new Integer(35), null, null},
                { new Integer(36), null, null},
                { new Integer(37), null, null},
                { new Integer(38), null, null},
                { new Integer(39), null, null},
                { new Integer(40), null, null},
                { new Integer(41), null, null},
                { new Integer(42), null, null},
                { new Integer(43), null, null},
                { new Integer(44), null, null},
                { new Integer(45), null, null},
                { new Integer(46), null, null},
                { new Integer(47), null, null},
                { new Integer(48), null, null},
                { new Integer(49), null, null},
                { new Integer(50), null, null},
                { new Integer(51), null, null},
                { new Integer(52), null, null},
                { new Integer(53), null, null},
                { new Integer(54), null, null},
                { new Integer(55), null, null},
                { new Integer(56), null, null},
                { new Integer(57), null, null},
                { new Integer(58), null, null},
                { new Integer(59), null, null},
                { new Integer(60), null, null},
                { new Integer(61), null, null},
                { new Integer(62), null, null},
                { new Integer(63), null, null},
                { new Integer(64), null, null},
                { new Integer(65), null, null},
                { new Integer(66), null, null},
                { new Integer(67), null, null},
                { new Integer(68), null, null},
                { new Integer(69), null, null},
                { new Integer(70), null, null},
                { new Integer(71), null, null},
                { new Integer(72), null, null},
                { new Integer(73), null, null},
                { new Integer(74), null, null},
                { new Integer(75), null, null},
                { new Integer(76), null, null},
                { new Integer(77), null, null},
                { new Integer(78), null, null},
                { new Integer(79), null, null},
                { new Integer(80), null, null},
                { new Integer(81), null, null},
                { new Integer(82), null, null},
                { new Integer(83), null, null},
                { new Integer(84), null, null},
                { new Integer(85), null, null},
                { new Integer(86), null, null},
                { new Integer(87), null, null},
                { new Integer(88), null, null},
                { new Integer(89), null, null},
                { new Integer(90), null, null},
                { new Integer(91), null, null},
                { new Integer(92), null, null},
                { new Integer(93), null, null},
                { new Integer(94), null, null},
                { new Integer(95), null, null},
                { new Integer(96), null, null},
                { new Integer(97), null, null},
                { new Integer(98), null, null},
                { new Integer(99), null, null},
                { new Integer(100), null, null}
            },
            new String [] {
                "Linea", "Codigo ASM", "Codigo Binario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMemory.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblMemory.setCellSelectionEnabled(false);
        tblMemory.setFocusable(false);
        tblMemory.setRequestFocusEnabled(false);
        tblMemory.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblMemory.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblMemory.setShowGrid(false);
        tblMemory.getTableHeader().setResizingAllowed(false);
        tblMemory.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblMemory);
        tblMemory.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblMemory.getColumnModel().getColumnCount() > 0) {
            tblMemory.getColumnModel().getColumn(0).setResizable(false);
            tblMemory.getColumnModel().getColumn(1).setResizable(false);
            tblMemory.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setText("Memoria");

        jLabel7.setText("DX");

        tfDX.setEditable(false);

        tfCX.setEditable(false);

        jLabel5.setText("BX");

        jLabel6.setText("CX");

        tfBX.setEditable(false);
        tfBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBXActionPerformed(evt);
            }
        });

        jLabel4.setText("AX");

        tfAX.setEditable(false);
        tfAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAXActionPerformed(evt);
            }
        });

        jLabel3.setText("CPU Registers");

        tfAC.setEditable(false);

        tfPC.setEditable(false);

        tfIR.setEditable(false);

        jLabel8.setText("AC");

        jLabel9.setText("PC");

        jLabel10.setText("IR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3)
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPC)
                                    .addComponent(tfAC)
                                    .addComponent(tfIR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfAX)
                            .addComponent(tfDX, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfCX)
                            .addComponent(tfBX))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        lbFileError.setText("");
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtroAsm=new FileNameExtensionFilter("ASM","asm");
        jfc.setFileFilter(filtroAsm);
        jfc.showOpenDialog(this);
        
        archivo = jfc.getSelectedFile();
        if(archivo != null){
           tfFile.setText(archivo.getAbsolutePath());
        }
    }//GEN-LAST:event_btnOpenFileActionPerformed

    private void btnStratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStratActionPerformed
        
        
        if(archivo == null){
            lbFileError.setText("Error: Debe seleccionar un archivo");
        }
        else if(!archivo.getName().contains(".asm")){
            lbFileError.setText("Error: La extension del archivo debe ser .asm");
        }
        else{
            
           
            UploadFileToMemory();




            tblMemory.setRowSelectionAllowed(true);

            StartSimulation();
             
            
        }
        
    }//GEN-LAST:event_btnStratActionPerformed
    
    private void tfBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBXActionPerformed

    private void tfAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAXActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed
   
    
    public enum Operations{
    //Operations
    LOAD("001"), STORE("010"), MOV("011"), SUB("100"), ADD("101"),
    //Registers
    AX("0001"),BX("0010"),CX("0011"),DX("0100");
    private String binary;       
    
        private Operations(String binary){
            this.binary = binary;
        }
        public String getBinary() {
            return binary;
        }
         public static Operations fromString(String text) {
        for (Operations b : Operations.values()) {
            
            if (text.equals(b.name())|| text.contains(b.name())) {
                //System.out.println("soy igual a: "+b);
                return b;
            }
        }
        return null;
    }
    }
    
    private void StartSimulation(){
        try {
            
            
            
            tblMemory.setRowSelectionInterval(20, 20);
            int lines = LineFileCounter(archivo);


            //System.out.println("numero"+i);

            final int[] counter = {lines};
            final Timer tt = new Timer();
            tt.schedule(new TimerTask(){
                @Override
                public void run() {
                    int lineAct = (20+lines) -counter[0];
                    String lineaActString = String.valueOf(lineAct+1);
                    tblMemory.setRowSelectionInterval(lineAct, lineAct);
                    String linea = tblMemory.getValueAt(lineAct, 1).toString();
                    //System.out.println("linea :"+linea);
                    tfPC.setText(lineaActString);
                    executeLine(linea);
                    //System.out.println("termine linea :"+counter[0]);
                    counter[0]--;
                    if (counter[0] == 0) {
                        
                        tt.cancel();
                        
                    }
                }
            }, 1500,2500);

            
            
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    private void executeLine(String linea){
        StringTokenizer strToken = new StringTokenizer(linea);
        boolean bandera = false;
        boolean movFlag = false;
        boolean loadFlag = false;
        String register = "";
        if(strToken.countTokens() == 3){
            bandera = true;
        }
        while(strToken.hasMoreTokens()){
            String token = strToken.nextToken();
            String numb = "";
            Long numero ;
            
            if(strToken.countTokens() < 1 && bandera ){
                 numero = Long.valueOf(token);
                 if(register.equals("AX")){
                     tfAX.setText(numero.toString());
                 }
                 else if(register.equals("BX")){
                     tfBX.setText(numero.toString());
                 }
                 else if(register.equals("CX")){
                     tfCX.setText(numero.toString());
                 }
                 else if(register.equals("DX")){
                     tfDX.setText(numero.toString());
                 }
            }
            if(movFlag){
                if(token.contains("AX")){
                    register = "AX";
                }
                else if(token.contains("BX")){
                    register = "BX";
                }
                else if(token.contains("CX")){
                    register = "CX";
                }
                else if(token.contains("DX")){
                    register = "DX";
                }
                
            }
            if(token.equals("MOV")){
                movFlag = true;
                tfIR.setText(getTokenCode(token));
            }
            if(token.equals("SUB")){
                tfIR.setText(getTokenCode(token));
                token = strToken.nextToken();
                Long ac = Long.valueOf(tfAC.getText());
                if(token.contains("AX")){
                    Long ax = Long.valueOf(tfAX.getText());
                    ac = ac-ax;
                    String num = ac.toString();
                    tfAC.setText(num);
                }
                else if(token.contains("BX")){
                    Long bx = Long.valueOf(tfBX.getText());
                    ac = ac-bx;
                    String num = ac.toString();
                    tfAC.setText(num);
                }
                else if(token.contains("CX")){
                    Long cx = Long.valueOf(tfCX.getText());
                    ac = ac-cx;
                    String num = ac.toString();
                    tfAC.setText(num);
                }
                else if(token.contains("DX")){
                    Long dx = Long.valueOf(tfDX.getText());
                    ac = ac-dx;
                    String num = ac.toString();
                    tfAC.setText(num);
                }
            }
            if(token.equals("ADD")){
                tfIR.setText(getTokenCode(token));
                token = strToken.nextToken();
                Long ac = Long.valueOf(tfAC.getText());
                if(token.contains("AX")){
                    Long ax = Long.valueOf(tfAX.getText());
                    ac = ac+ax;
                    String num = ac.toString();
                    tfAC.setText(num);
                }
                else if(token.contains("BX")){
                    Long bx = Long.valueOf(tfBX.getText());
                    ac = ac+bx;
                    String num = ac.toString();
                    tfAC.setText(num);
                }
                else if(token.contains("CX")){
                    Long cx = Long.valueOf(tfCX.getText());
                    ac = ac+cx;
                    String num = ac.toString();
                    tfAC.setText(num);
                }
                else if(token.contains("DX")){
                    Long dx = Long.valueOf(tfDX.getText());
                    ac = ac+dx;
                    String num = ac.toString();
                    tfAC.setText(num);
                }
            }
            if(token.equals("STORE")){
                tfIR.setText(getTokenCode(token));
                token = strToken.nextToken();
                if(token.contains("AX")){
                    tfAX.setText(tfAC.getText());
                }
                else if(token.contains("BX")){
                    tfBX.setText(tfAC.getText());
                }
                else if(token.contains("CX")){
                    tfCX.setText(tfAC.getText());
                }
                else if(token.contains("DX")){
                    tfDX.setText(tfAC.getText());
                }
            }
            if(token.equals("LOAD")){
                tfIR.setText(getTokenCode(token));
                token = strToken.nextToken();
                if(token.contains("AX")){
                    tfAC.setText(tfAX.getText());
                }
                else if(token.contains("BX")){
                    tfAC.setText(tfBX.getText());
                }
                else if(token.contains("CX")){
                    tfAC.setText(tfCX.getText());
                }
                else if(token.contains("DX")){
                    tfAC.setText(tfDX.getText());
                }
            }
        }
        
    }
    
    private void UploadFileToMemory(){
        try {
                BufferedReader reader = new BufferedReader(new FileReader(archivo.getAbsolutePath()));
                int lines = LineFileCounter(archivo);
                //System.out.println("lineas son > "+lines);
                if(lines >= 80){
                    //System.out.println("Programa muy grande");
                }
                for(int i = 20; i<20+lines;i++){
                    String binaryString = "";
                    String line = reader.readLine();
                    boolean bandera = false;
                    boolean negativo = false;
                    tblMemory.setValueAt(line, i, 1);
                    StringTokenizer strToken = new StringTokenizer(line);
                    if(strToken.countTokens() == 3){
                        bandera = true;
                    }
                    while(strToken.hasMoreTokens()){
                        String token = strToken.nextToken();
                        String numb = "";
                        if(strToken.countTokens() < 1 && bandera ){
                            Long numero = Long.valueOf(token);
                            //System.out.println("numero antes: "+numero);
                            
                            if(numero<0){
                                negativo = true;
                                numb = Long.toBinaryString(numero*-1) ;
                            }
                            else{
                                
                                 numb = Long.toBinaryString(numero);
                                 
                                //System.out.println("soy el binario del numero: "+numb);
                                
                            }
                            numb = getBinaryString(numb,negativo);
                            binaryString = binaryString.concat(numb);
                        }
                        else{
                            
                            //System.out.println("token : "+token);
                            //System.out.println("binario: "+getTokenCode(token));
                            binaryString= binaryString.concat(getTokenCode(token).concat(" "));
                        }
                        
                        
                    }
                    tblMemory.setValueAt(binaryString, i, 2);
                }
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        
    }
    public static String getTokenCode(String token){
        Operations binaryToken = Operations.fromString(token);
        //System.out.println(binaryToken);
        return binaryToken.getBinary(); 
    }
    
    public static String getBinaryString(String number, boolean negative){
        String binary = "";
        int largo = number.length();
        for(int i = 0;i<8-largo;i++){
            if(negative){
                binary = binary.concat("1");
                negative = false;
            }
            else{
                binary = binary.concat("0");
            }
            
        }
        binary = binary.concat(number);
        
        return binary;
        
    }
    
    public static int LineFileCounter(File archivoFile) throws  IOException{
        
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoFile.getAbsolutePath()))) {
            while(reader.readLine() != null)lines++;
        }
        return lines;
        
    }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnStrat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbFileError;
    private javax.swing.JTable tblMemory;
    private javax.swing.JTextField tfAC;
    private javax.swing.JTextField tfAX;
    private javax.swing.JTextField tfBX;
    private javax.swing.JTextField tfCX;
    private javax.swing.JTextField tfDX;
    private javax.swing.JTextField tfFile;
    private javax.swing.JTextField tfIR;
    private javax.swing.JTextField tfPC;
    // End of variables declaration//GEN-END:variables
}
