/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cpu.projeto.cpu;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author gabri
 */
public class Barras extends javax.swing.JFrame {

    /**
     * Creates new form Barras
     */
    public Barras() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pgCPU = new javax.swing.JProgressBar();
        pgDisco = new javax.swing.JProgressBar();
        pgMemoria = new javax.swing.JProgressBar();
        btnacao1 = new javax.swing.JButton();
        jminimo1 = new javax.swing.JLabel();
        jmedia1 = new javax.swing.JLabel();
        jmaximo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jVminimo1 = new javax.swing.JLabel();
        jVmedio1 = new javax.swing.JLabel();
        jVmaximo1 = new javax.swing.JLabel();
        jVminimo2 = new javax.swing.JLabel();
        jVmedio2 = new javax.swing.JLabel();
        jVmaximo2 = new javax.swing.JLabel();
        jminimo2 = new javax.swing.JLabel();
        jmedia2 = new javax.swing.JLabel();
        jmaximo2 = new javax.swing.JLabel();
        jminimo3 = new javax.swing.JLabel();
        jVminimo3 = new javax.swing.JLabel();
        jmedia3 = new javax.swing.JLabel();
        jVmedio3 = new javax.swing.JLabel();
        jVmaximo3 = new javax.swing.JLabel();
        jmaximo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnacao1.setText("Analizar maquina");
        btnacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacao1ActionPerformed(evt);
            }
        });

        jminimo1.setText("Mínimo:");

        jmedia1.setText("Média:");

        jmaximo1.setText("Máximo:");

        jLabel1.setText("Memória");

        jLabel2.setText("Disco");

        jLabel3.setText("CPU");

        jVminimo1.setText("0");

        jVmedio1.setText("0");

        jVmaximo1.setText("0");

        jVminimo2.setText("0");

        jVmedio2.setText("0");

        jVmaximo2.setText("0");

        jminimo2.setText("Mínimo:");

        jmedia2.setText("Média:");

        jmaximo2.setText("Máximo:");

        jminimo3.setText("Mínimo:");

        jVminimo3.setText("0");

        jmedia3.setText("Média:");

        jVmedio3.setText("0");

        jVmaximo3.setText("0");

        jmaximo3.setText("Máximo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jVminimo2)
                            .addComponent(jminimo2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jVmedio2)
                            .addComponent(jmedia2))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jVmaximo2)
                            .addComponent(jmaximo2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pgMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jminimo3)
                            .addComponent(jVminimo3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jmedia3)
                            .addComponent(jVmedio3))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jVmaximo3)
                            .addComponent(jmaximo3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pgCPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pgDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jminimo1)
                            .addComponent(jVminimo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jmedia1)
                            .addComponent(jVmedio1))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jVmaximo1)
                            .addComponent(jmaximo1))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnacao1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pgCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jminimo1)
                                .addComponent(jmedia1)
                                .addComponent(jmaximo1)))
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jVminimo1)
                            .addComponent(jVmedio1)
                            .addComponent(jVmaximo1))))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pgDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jminimo2)
                                .addComponent(jmedia2)
                                .addComponent(jmaximo2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jVminimo2)
                                    .addComponent(jVmedio2)
                                    .addComponent(jVmaximo2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pgMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jminimo3)
                        .addComponent(jmedia3)
                        .addComponent(jmaximo3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jVminimo3)
                            .addComponent(jVmedio3)
                            .addComponent(jVmaximo3))))
                .addGap(24, 24, 24)
                .addComponent(btnacao1)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Integer contador = 0;
    
    Integer minimoCPU = 0;
    Integer medioCPU = 0;
    Integer maximoCPU = 0;
    
    Integer minimodisco = 0;
    Integer mediodisco = 0;
    Integer maximodisco = 0;
    
    Integer minimoMem = 0;
    Integer medioMem = 0;
    Integer maximoMem = 0;
    
    private void btnacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacao1ActionPerformed
        contador += 1;


        

        
        // CPU 
        Random aleatorioCPU = new Random();
        Integer CPU = aleatorioCPU.nextInt(101);
        pgCPU.setStringPainted(true);
        pgCPU.setForeground(Color.blue);
        pgCPU.setString(String.format("%d",CPU));
        pgCPU.setValue(CPU);        
        if(minimoCPU == 0){
            minimoCPU = CPU;
            jVminimo1.setText(String.format("%d",minimoCPU));
        }else{
            if(minimoCPU > CPU){
                minimoCPU = CPU;
                jVminimo1.setText(String.format("%d",minimoCPU));
            }
        }
        medioCPU += CPU; 
        Integer CalMediaCPU = medioCPU / contador;
        jVmedio1.setText(String.format("%d",CalMediaCPU));
        
        if(maximoCPU < CPU){
            maximoCPU = CPU;
            jVmaximo1.setText(String.format("%d",maximoCPU));
        }
        
        // Disco
        Random aleatorioDisk = new Random();
        Integer Disco = aleatorioDisk.nextInt(501);
        pgDisco.setStringPainted(true);
        pgDisco.setForeground(Color.blue);
        pgDisco.setString(String.format("%d GB",Disco));
        pgDisco.setValue(Disco/5);
        
        if(minimodisco == 0){
            minimodisco = Disco;
            jVminimo2.setText(String.format("%d GB",minimodisco));
        }else{
            if(minimodisco > CPU){
                minimodisco = CPU;
                jVminimo2.setText(String.format("%d GB",minimodisco));
            }
        }
        // medio disco
        mediodisco += Disco; 
        Integer CalMediaDisco = mediodisco / contador;
        jVmedio2.setText(String.format("%d GB",CalMediaDisco));
        //maximo disco
        if(maximodisco < Disco){
            maximodisco = Disco;
            jVmaximo2.setText(String.format("%d GB",maximodisco));
        }
        // Memoria
        Random aleatorioMem = new Random();
        Integer Memoria = aleatorioMem.nextInt(8001);
        pgMemoria.setStringPainted(true);
        pgMemoria.setForeground(Color.blue);
        pgMemoria.setString(String.format("%d MB",Memoria));
        pgMemoria.setValue(Memoria/80);
        // minimo memoria
        if(minimoMem == 0){
            minimoMem = Memoria;
            jVminimo3.setText(String.format("%d MB",minimoMem));
        }else{
            if(minimoMem > Memoria){
                minimoMem = Memoria;
                jVminimo3.setText(String.format("%d MB",minimoMem));
            }
        }
        //medio memoria
        medioMem += Memoria; 
        Integer CalMediaMem = medioMem / contador;
        jVmedio3.setText(String.format("%d MB",CalMediaMem));
        //maximo memoria
        if(maximoMem < Memoria){
            maximoMem = Memoria;
            jVmaximo3.setText(String.format("%d MB",maximoMem));
        }
        
    }//GEN-LAST:event_btnacao1ActionPerformed

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
            java.util.logging.Logger.getLogger(Barras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacao1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jVmaximo1;
    private javax.swing.JLabel jVmaximo2;
    private javax.swing.JLabel jVmaximo3;
    private javax.swing.JLabel jVmedio1;
    private javax.swing.JLabel jVmedio2;
    private javax.swing.JLabel jVmedio3;
    private javax.swing.JLabel jVminimo1;
    private javax.swing.JLabel jVminimo2;
    private javax.swing.JLabel jVminimo3;
    private javax.swing.JLabel jmaximo1;
    private javax.swing.JLabel jmaximo2;
    private javax.swing.JLabel jmaximo3;
    private javax.swing.JLabel jmedia1;
    private javax.swing.JLabel jmedia2;
    private javax.swing.JLabel jmedia3;
    private javax.swing.JLabel jminimo1;
    private javax.swing.JLabel jminimo2;
    private javax.swing.JLabel jminimo3;
    private javax.swing.JProgressBar pgCPU;
    private javax.swing.JProgressBar pgDisco;
    private javax.swing.JProgressBar pgMemoria;
    // End of variables declaration//GEN-END:variables
}
