
package gui;

import dataBase.IBilgiController;
import dataBase.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;




public final class HesapEkrani extends javax.swing.JFrame implements IDüzenleyici, IBilgiController {


    
    public HesapEkrani() {
        initComponents();
        getEdits();
        this.kullaniciAdSoyadLabel.setText(getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye()) + " TL");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hesapEkraniPanel = new javax.swing.JPanel();
        hosgeldinLabel = new javax.swing.JLabel();
        kullaniciAdSoyadLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        paraCekButton = new javax.swing.JButton();
        paraYatirButton = new javax.swing.JButton();
        havaleButton = new javax.swing.JButton();
        odemelerButton = new javax.swing.JButton();
        settingsIcon = new javax.swing.JLabel();
        turkLirasiIcon = new javax.swing.JLabel();
        paraCekIkon = new javax.swing.JLabel();
        paraYatirIcon = new javax.swing.JLabel();
        havaleIcon = new javax.swing.JLabel();
        odemelerIcon1 = new javax.swing.JLabel();
        logoutIcon1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Hesap Ekranı");

        hesapEkraniPanel.setBackground(new java.awt.Color(204, 204, 204));
        hesapEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hosgeldinLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hosgeldinLabel.setForeground(new java.awt.Color(51, 51, 255));
        hosgeldinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinLabel.setText("HOŞGELDİN");
        hesapEkraniPanel.add(hosgeldinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 200, 30));

        kullaniciAdSoyadLabel.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        kullaniciAdSoyadLabel.setForeground(new java.awt.Color(51, 51, 255));
        kullaniciAdSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciAdSoyadLabel.setText("[KULLANICI ADI SOYADI]");
        hesapEkraniPanel.add(kullaniciAdSoyadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 800, 50));

        bakiyeLabel.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        bakiyeLabel.setText("[BAKİYE]");
        hesapEkraniPanel.add(bakiyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 400, -1));

        paraCekButton.setBackground(new java.awt.Color(204, 255, 204));
        paraCekButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        paraCekButton.setText("Para Çek");
        paraCekButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraCekButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paraCekButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paraCekButtonMouseExited(evt);
            }
        });
        paraCekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraCekButtonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(paraCekButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 105, 48));

        paraYatirButton.setBackground(new java.awt.Color(255, 255, 153));
        paraYatirButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        paraYatirButton.setText("Para Yatır");
        paraYatirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraYatirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paraYatirButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paraYatirButtonMouseExited(evt);
            }
        });
        paraYatirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraYatirButtonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(paraYatirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, 48));

        havaleButton.setBackground(new java.awt.Color(255, 102, 0));
        havaleButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        havaleButton.setText("Havale");
        havaleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        havaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                havaleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                havaleButtonMouseExited(evt);
            }
        });
        havaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                havaleButtonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(havaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 105, 48));

        odemelerButton.setBackground(new java.awt.Color(0, 204, 204));
        odemelerButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        odemelerButton.setText("Ödemeler");
        odemelerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        odemelerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                odemelerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                odemelerButtonMouseExited(evt);
            }
        });
        odemelerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemelerButtonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(odemelerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, -1, 48));

        settingsIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Java Project\\SweetBank\\src\\main\\java\\gui\\İconlar\\settingsIcon.png")); // NOI18N
        settingsIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsIconMouseClicked(evt);
            }
        });
        hesapEkraniPanel.add(settingsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        turkLirasiIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Java Project\\SweetBank\\src\\main\\java\\gui\\İconlar\\turkishLiraIcon.png")); // NOI18N
        hesapEkraniPanel.add(turkLirasiIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        paraCekIkon.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Java Project\\SweetBank\\src\\main\\java\\gui\\İconlar\\WithDrawIcon.png")); // NOI18N
        hesapEkraniPanel.add(paraCekIkon, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        paraYatirIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Java Project\\SweetBank\\src\\main\\java\\gui\\İconlar\\depositIcon.png")); // NOI18N
        hesapEkraniPanel.add(paraYatirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        havaleIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Java Project\\SweetBank\\src\\main\\java\\gui\\İconlar\\transferIcon.png")); // NOI18N
        hesapEkraniPanel.add(havaleIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        odemelerIcon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Java Project\\SweetBank\\src\\main\\java\\gui\\İconlar\\paymentsIcon.png")); // NOI18N
        hesapEkraniPanel.add(odemelerIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, -1, -1));

        logoutIcon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Java Project\\SweetBank\\src\\main\\java\\gui\\İconlar\\logoutIcon.png")); // NOI18N
        logoutIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutIcon1MouseClicked(evt);
            }
        });
        hesapEkraniPanel.add(logoutIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        hesapEkraniPanel.setFocusable(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException(".");
    }
    
    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
    /*
    Actionlar
    */
    private void paraCekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraCekButtonActionPerformed
        ActionAyarlari.setVisible(this, new ParaCekmeEkrani());
    }//GEN-LAST:event_paraCekButtonActionPerformed

    private void paraYatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraYatirButtonActionPerformed
        ActionAyarlari.setVisible(this, new ParaYatirmaEkrani());
    }//GEN-LAST:event_paraYatirButtonActionPerformed

    private void havaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_havaleButtonActionPerformed
        ActionAyarlari.setVisible(this, new HavaleEkrani());
    }//GEN-LAST:event_havaleButtonActionPerformed

    private void odemelerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemelerButtonActionPerformed
        ActionAyarlari.setVisible(this, new OdemelerEkrani());
    }//GEN-LAST:event_odemelerButtonActionPerformed

       
    
    /*
    Button renklendirmeleri ve icon değişimleri
    */
    private void setBgFg(Component c) {
        ButtonAyarlari.setBgFg((JButton)c, Color.black, Color.white);
    }
    
    
    
    private void paraCekButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraCekButtonMouseEntered
        this.setBgFg(evt.getComponent());
        
        //IconAyarlari.changeIcon(paraCekIkon, "withdrawIcon2");
    }//GEN-LAST:event_paraCekButtonMouseEntered

    private void paraCekButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraCekButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
        
        //IconAyarlari.setOriginalIcon(paraCekIkon);
    }//GEN-LAST:event_paraCekButtonMouseExited

    private void paraYatirButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraYatirButtonMouseEntered
        this.setBgFg(evt.getComponent());
        
        //IconAyarlari.changeIcon(paraYatirIcon, "depositIcon2");
    }//GEN-LAST:event_paraYatirButtonMouseEntered

    private void paraYatirButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraYatirButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_paraYatirButtonMouseExited

    private void havaleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havaleButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_havaleButtonMouseEntered

    private void havaleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havaleButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_havaleButtonMouseExited

    private void odemelerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odemelerButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_odemelerButtonMouseEntered

    private void odemelerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odemelerButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_odemelerButtonMouseExited

    
    /*
    Ayarlar ve geri dönme actionlari
    */
    private void logoutIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutIcon1MouseClicked
        String question = "Hesabınızdan çıkış yapılacaktır.\nOnaylıyor musunuz?";
        if(Dialogs.onayMesajiGoster(this, question) == 1) {
            this.cıkısYap();
        }
    }//GEN-LAST:event_logoutIcon1MouseClicked

    private void cıkısYap() {
        getHesapBilgileri().cıkısYap();
        ActionAyarlari.setVisible(this, new GirisEkrani());        
    }
    
    private void settingsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsIconMouseClicked
        ActionAyarlari.setVisible(this, new AyarlarEkrani());
    }//GEN-LAST:event_settingsIconMouseClicked

    
    
    
    
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
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JButton havaleButton;
    private javax.swing.JLabel havaleIcon;
    private javax.swing.JPanel hesapEkraniPanel;
    private javax.swing.JLabel hosgeldinLabel;
    private javax.swing.JLabel kullaniciAdSoyadLabel;
    private javax.swing.JLabel logoutIcon1;
    private javax.swing.JButton odemelerButton;
    private javax.swing.JLabel odemelerIcon1;
    private javax.swing.JButton paraCekButton;
    private javax.swing.JLabel paraCekIkon;
    private javax.swing.JButton paraYatirButton;
    private javax.swing.JLabel paraYatirIcon;
    private javax.swing.JLabel settingsIcon;
    private javax.swing.JLabel turkLirasiIcon;
    // End of variables declaration//GEN-END:variables
}
