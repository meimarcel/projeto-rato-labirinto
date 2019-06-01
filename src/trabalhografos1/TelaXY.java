/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhografos1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author marce
 */
public class TelaXY extends javax.swing.JFrame {

    /**
     * Creates new form TelaXY
     */
    public int rx;
    public int ry;
    public int qx;
    public int qy;
    public String caminho = null;
    public String[] file;
    
    public TelaXY() {
        setVisible(true);
        setTitle("Jogo do Rato");
        setSize(1000,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }
    
//    public int getRX() {
//        return this.rx;
//    }
//    public int getRY() {
//        return this.ry;
//    }
//    public int getQX() {
//        return this.qx;
//    }
//    public int getQY() {
//        return this.qy;
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 255,0));
        jButton1.setFont(new java.awt.Font("Forte", 0, 50)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Iniciar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 4));
        jButton1.setPreferredSize(new java.awt.Dimension(111, 77));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 170, 170, 50);

        jLabel1.setFont(new java.awt.Font("Castellar", 0, 20)); // NOI18N
        jLabel1.setText("POSIÇÃO DO RATO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 25));
        jLabel1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 60, 210, 25);

        jLabel2.setFont(new java.awt.Font("Castellar", 0, 20)); // NOI18N
        jLabel2.setText("POSIÇÃO DO QUEIJO");
        jLabel2.setPreferredSize(new java.awt.Dimension(90, 25));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 60, 230, 25);

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setPreferredSize(new java.awt.Dimension(6, 19));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(340, 86, 55, 30);

        jTextField2.setBackground(new java.awt.Color(204, 204, 255));
        jTextField2.setPreferredSize(new java.awt.Dimension(6, 19));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(340, 121, 55, 30);

        jTextField3.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(601, 85, 55, 30);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jLabel3.setText("X");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 100, 7, 14);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jLabel4.setText("Y");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 125, 8, 14);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jLabel5.setText("Y");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(581, 125, 8, 14);

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jLabel6.setText("X");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(581, 100, 7, 14);

        jTextField5.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jTextField5);
        jTextField5.setBounds(601, 121, 55, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 255,0));
        jButton2.setFont(new java.awt.Font("Forte", 0, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Mapa1");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 4));
        jButton2.setPreferredSize(new java.awt.Dimension(194, 79));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 420, 110, 30);

        jButton3.setBackground(new java.awt.Color(204, 204, 255,0));
        jButton3.setFont(new java.awt.Font("Forte", 0, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(28, 11, 11));
        jButton3.setText("Mapa2");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 11, 11), 4));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 420, 110, 30);

        jButton4.setBackground(new java.awt.Color(204, 204, 255,0));
        jButton4.setFont(new java.awt.Font("Forte", 0, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(41, 205, 253));
        jButton4.setText("Mapa3");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 205, 253), 4));
        jButton4.setPreferredSize(new java.awt.Dimension(194, 79));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(710, 420, 110, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon("/home/meimarcel/NetBeansProjects/TrabalhoGrafos1/res/lab1.JPG")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(120, 270, 190, 140);

        jLabel8.setIcon(new javax.swing.ImageIcon("/home/meimarcel/NetBeansProjects/TrabalhoGrafos1/res/lab2.JPG")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 270, 190, 140);

        jLabel10.setIcon(new javax.swing.ImageIcon("/home/meimarcel/NetBeansProjects/TrabalhoGrafos1/res/lab3.JPG")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(670, 270, 190, 140);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/fundo.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1000, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (caminho != null){
            try {
                this.file = File.Read(caminho);
                String aux;
                this.rx = Integer.parseInt(jTextField1.getText());
                this.ry = Integer.parseInt(jTextField2.getText());
                aux = file[ry].split(" ")[rx];
                this.qx = Integer.parseInt(jTextField3.getText());
                this.qy = Integer.parseInt(jTextField5.getText());
                aux = file[qx].split(" ")[qy];
                Tela tela = new Tela(rx,ry,qx,qy,caminho);

                this.setVisible(false);
                tela.setVisible(true);
            } catch(Exception e){
                JOptionPane.showMessageDialog(null,"Possui posiçôes inválidas");
            }
        }else {
            JOptionPane.showMessageDialog(null,"Selecione Um Mapa");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        caminho = "LABIRINTO1.txt";
        JOptionPane.showMessageDialog(null,"Mapa 1 Selecionado");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        caminho = "LABIRINTO2.txt";
        JOptionPane.showMessageDialog(null,"Mapa 2 Selecionado");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        caminho = "LABIRINTO3.txt";
        JOptionPane.showMessageDialog(null,"Mapa 3 Selecionado");
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaXY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}