/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concordiarpg;

import java.awt.event.KeyEvent;

/**
 *
 * @author stulujr.local
 */
public class KnutsonArea extends javax.swing.JFrame {

    /**
     * Creates new form KnustonArea
     */
    public KnutsonArea() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\jalet\\OneDrive\\Desktop\\Concordia RPG by Office Heroes\\CSC225 IMAGES\\My project (6).png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(390, 530, 30, 50);

        jLabel3.setBackground(new java.awt.Color(128, 0, 0));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 550, 30, 50);

        jLabel4.setBackground(new java.awt.Color(0, 255, 0));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(390, 550, 30, 50);

        jLabel5.setText("..");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 500, 30, 50);

        jLabel6.setText("..");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(430, 450, 30, 50);
        jLabel6.getAccessibleContext().setAccessibleDescription("");

        jLabel7.setText("..");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(400, 256, 30, 50);
        jLabel7.getAccessibleContext().setAccessibleDescription("");

        jLabel8.setText("..");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(230, 310, 30, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jalet\\OneDrive\\Desktop\\Concordia RPG by Office Heroes\\CSC225 IMAGES\\KNUSTON.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
       // In this Press key form we have a bunch of switch cases and if statements which helps us 
       // to control the Niblet and other JLabels. 
        
        int key = evt.getKeyCode();
        
        switch(key){
        
            case KeyEvent.VK_UP:
                jLabel2.setLocation(jLabel2.getLocation().x, jLabel2.getLocation().y - 5);
                break;
            case KeyEvent.VK_DOWN:
                jLabel2.setLocation(jLabel2.getLocation().x, jLabel2.getLocation().y + 5);
                break;    
            case KeyEvent.VK_RIGHT:
                jLabel2.setLocation(jLabel2.getLocation().x + 5, jLabel2.getLocation().y);
                break;
            case KeyEvent.VK_LEFT:
                jLabel2.setLocation(jLabel2.getLocation().x - 5, jLabel2.getLocation().y);
                break;    
        }
        int velx = jLabel2.getLocation().x;
        int vely = jLabel2.getLocation().y;
        if(velx <= -5)
        {
            jLabel2.setLocation(-velx-5,vely);
        }
        if(velx >= 575)
        {
            jLabel2.setLocation(velx-5,vely);
        }
        if(vely <= -5)
        {
            jLabel2.setLocation(velx,-vely-5);
        }
        if(vely >= 555)
        {
            jLabel2.setLocation(velx,vely-5);
        }
        
        // this is the if statement that first determines the location coordinate of two jLabels and then 
        // And if they are equal it procced to opening a selected JFrame and then closes the current one. 
        // And also we use it for including the Scoretracker which is tracks the score of the user(whether the user is correct or not)
        
        if ( jLabel2.getLocation().x == jLabel5.getLocation().x && jLabel2.getLocation().y==jLabel5.getLocation().y )
        {
           ScoreTracker.score+=1;     
            Assessment ass = new Assessment();
       ass.setVisible(true);
       
           dispose();
        }
        
        else if (
            jLabel2.getLocation().x == jLabel6.getLocation().x && jLabel2.getLocation().y==jLabel6.getLocation().y ||
            jLabel2.getLocation().x == jLabel7.getLocation().x && jLabel2.getLocation().y==jLabel7.getLocation().y ||
            jLabel2.getLocation().x == jLabel8.getLocation().x && jLabel2.getLocation().y==jLabel8.getLocation().y  )
        {
            Assessment ass = new Assessment();
       ass.setVisible(true);
       
           dispose();
        }
         else if (jLabel2.getLocation().x == jLabel3.getLocation().x && jLabel2.getLocation().y==jLabel3.getLocation().y) {
        
           MusicArea am = new MusicArea();
           am.setVisible(true);
           dispose(); 
        }
         else if (jLabel2.getLocation().x == jLabel4.getLocation().x && jLabel2.getLocation().y==jLabel4.getLocation().y) {
        
           WelcomeCenter2 ap = new WelcomeCenter2();
           ap.setVisible(true);
           dispose(); 
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(KnutsonArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KnutsonArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KnutsonArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KnutsonArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KnutsonArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}