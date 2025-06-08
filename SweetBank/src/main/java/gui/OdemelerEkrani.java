
package gui;

import dataBase.IBilgiController;
import dataBase.transactions.FaturaOdemeleri;
import dataBase.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
import java.awt.Color;
import java.awt.Component;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public final class OdemelerEkrani extends javax.swing.JFrame implements IDüzenleyici, IBilgiController {

    private FaturaOdemeleri faturaOdemeleriObject = null;   
    
    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    
    
    public OdemelerEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        odemelerEkraniPanel.setFocusable(true);
        this.kullaniciAdiSoyadiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.elektrikBorcu.setText(String.valueOf(getHesapBilgileri().getElektrikFaturasi()));
        this.suBorcu.setText(String.valueOf(getHesapBilgileri().getSuFaturasi()));
        this.dogalgazBorcu.setText(String.valueOf(getHesapBilgileri().getDogalgazFaturasi()));
        this.internetBorcu.setText(String.valueOf(getHesapBilgileri().getInternetFaturasi()));
    }

    public FaturaOdemeleri getFaturaOdemeleriObject() {
        if(this.faturaOdemeleriObject == null) {
            faturaOdemeleriObject = new FaturaOdemeleri();
        }
        return faturaOdemeleriObject;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraCekmeEkrani1 = new gui.ParaCekmeEkrani();
        odemelerEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        geriIcon = new javax.swing.JLabel();
        mesajElektrikLabel = new javax.swing.JLabel();
        elektrikBorcu = new javax.swing.JLabel();
        elektrikOdeButton = new javax.swing.JButton();
        mesajSuLabel = new javax.swing.JLabel();
        suBorcu = new javax.swing.JLabel();
        suOdeButton = new javax.swing.JButton();
        dogalgazBorcu = new javax.swing.JLabel();
        dogalgazOdeButton = new javax.swing.JButton();
        mesajDogalgazLabel = new javax.swing.JLabel();
        mesajInternetLabel = new javax.swing.JLabel();
        internetOdeButton = new javax.swing.JButton();
        internetBorcu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Ödemeler Ekranı");

        odemelerEkraniPanel.setBackground(new java.awt.Color(204, 255, 204));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 102, 102));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Sayın [KULLANICI ADI SOYADI]");

        geriIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Java Project\\SweetBank\\src\\main\\java\\gui\\İconlar\\previousIcon.png")); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        mesajElektrikLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajElektrikLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajElektrikLabel.setText("Toplam Elektrik Faturası Borcunuz :");

        elektrikBorcu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elektrikBorcu.setForeground(new java.awt.Color(51, 0, 255));
        elektrikBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elektrikBorcu.setText("[ELEKT BORC]");

        elektrikOdeButton.setBackground(new java.awt.Color(255, 204, 204));
        elektrikOdeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elektrikOdeButton.setText("ÖDE");
        elektrikOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elektrikOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                elektrikOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                elektrikOdeButtonMouseExited(evt);
            }
        });
        elektrikOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elektrikOdeButtonActionPerformed(evt);
            }
        });

        mesajSuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajSuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajSuLabel.setText("Toplam Su Faturası Borcunuz :");

        suBorcu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        suBorcu.setForeground(new java.awt.Color(51, 0, 255));
        suBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suBorcu.setText("[SU BORC]");

        suOdeButton.setBackground(new java.awt.Color(102, 255, 255));
        suOdeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        suOdeButton.setText("ÖDE");
        suOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suOdeButtonMouseExited(evt);
            }
        });
        suOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suOdeButtonActionPerformed(evt);
            }
        });

        dogalgazBorcu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dogalgazBorcu.setForeground(new java.awt.Color(51, 0, 255));
        dogalgazBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dogalgazBorcu.setText("[DGLGZ BORC]");

        dogalgazOdeButton.setBackground(new java.awt.Color(204, 204, 0));
        dogalgazOdeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dogalgazOdeButton.setText("ÖDE");
        dogalgazOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dogalgazOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dogalgazOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dogalgazOdeButtonMouseExited(evt);
            }
        });
        dogalgazOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogalgazOdeButtonActionPerformed(evt);
            }
        });

        mesajDogalgazLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajDogalgazLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajDogalgazLabel.setText("Toplam Doğalgaz Faturası Borcunuz :");

        mesajInternetLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajInternetLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajInternetLabel.setText("Toplam İnternet Faturası Borcunuz :");

        internetOdeButton.setBackground(new java.awt.Color(255, 153, 51));
        internetOdeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        internetOdeButton.setText("ÖDE");
        internetOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        internetOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                internetOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                internetOdeButtonMouseExited(evt);
            }
        });
        internetOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetOdeButtonActionPerformed(evt);
            }
        });

        internetBorcu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        internetBorcu.setForeground(new java.awt.Color(51, 0, 255));
        internetBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        internetBorcu.setText("[INTRNT BORC]");

        javax.swing.GroupLayout odemelerEkraniPanelLayout = new javax.swing.GroupLayout(odemelerEkraniPanel);
        odemelerEkraniPanel.setLayout(odemelerEkraniPanelLayout);
        odemelerEkraniPanelLayout.setHorizontalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mesajElektrikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesajSuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesajDogalgazLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesajInternetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(suBorcu)
                            .addComponent(elektrikBorcu)
                            .addComponent(dogalgazBorcu)
                            .addComponent(internetBorcu))
                        .addGap(44, 44, 44)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(suOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elektrikOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dogalgazOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(internetOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        odemelerEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dogalgazOdeButton, elektrikOdeButton, internetOdeButton, suOdeButton});

        odemelerEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dogalgazBorcu, elektrikBorcu, internetBorcu, suBorcu});

        odemelerEkraniPanelLayout.setVerticalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesajElektrikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elektrikBorcu)
                            .addComponent(elektrikOdeButton))
                        .addGap(40, 40, 40)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesajSuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suBorcu)
                            .addComponent(suOdeButton))
                        .addGap(40, 40, 40)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesajDogalgazLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dogalgazBorcu)
                            .addComponent(dogalgazOdeButton))
                        .addGap(40, 40, 40)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(internetBorcu)
                            .addComponent(internetOdeButton)))
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(mesajInternetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        odemelerEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dogalgazBorcu, dogalgazOdeButton, elektrikBorcu, elektrikOdeButton, internetBorcu, internetOdeButton, mesajElektrikLabel, suBorcu, suOdeButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this,new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    
    /*
    Actions
    */
    private void elektrikOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elektrikOdeButtonActionPerformed
        double elektrikTutari = Double.valueOf(this.elektrikBorcu.getText());
        if(this.faturaOncedenOdendiMi(elektrikTutari)) {
            Dialogs.ozelMesajGoster(this, "Elektrik faturası zaten ödenmiş.");
        } else {
            this.faturayiOde("elektrik", elektrikTutari);
        }
    }//GEN-LAST:event_elektrikOdeButtonActionPerformed

    private void suOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suOdeButtonActionPerformed
        double suTutari = Double.valueOf(this.suBorcu.getText());
        if(this.faturaOncedenOdendiMi(suTutari)) {
            Dialogs.ozelMesajGoster(this, "Su faturası zaten ödenmiş.");
        } else {
            this.faturayiOde("su", suTutari);
        }
    }//GEN-LAST:event_suOdeButtonActionPerformed

    private void dogalgazOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogalgazOdeButtonActionPerformed
        double dogalgazTutari = Double.valueOf(this.dogalgazBorcu.getText());
        if(this.faturaOncedenOdendiMi(dogalgazTutari)) {
            Dialogs.ozelMesajGoster(this, "Doğalgaz faturası zaten ödenmiş.");
        } else {
            this.faturayiOde("dogalgaz", dogalgazTutari);
        }
    }//GEN-LAST:event_dogalgazOdeButtonActionPerformed

    private void internetOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetOdeButtonActionPerformed
        double internetTutari = Double.valueOf(this.internetBorcu.getText());
        if(this.faturaOncedenOdendiMi(internetTutari)) {
            Dialogs.ozelMesajGoster(this, "İnternet faturası zaten ödenmiş.");
        } else {
            this.faturayiOde("internet", internetTutari);
        }
    }//GEN-LAST:event_internetOdeButtonActionPerformed

    private boolean faturaOncedenOdendiMi(double odenecekTutar) {
        return odenecekTutar == 0.0;
    }
    
    private void faturayiOde(String faturaIsmi, double faturaTutari) {
        this.getFaturaOdemeleriObject().setFaturaIsmi(faturaIsmi);
        this.getFaturaOdemeleriObject().setFaturaTutari(faturaTutari);
        
        if(getFaturaOdemeleriObject().faturaOdendiMi()) {
            Dialogs.ozelMesajGoster(this, "Faturanız başarıyla ödenmiştir.");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Ödeme işlemi gerçekleştirilemedi.");
        }
        
    }
    
    /*
    Button renklendirmeleri
    */
    private void setBgFg(Component c) {
        ButtonAyarlari.setBgFg((JButton) c, Color.black, Color.white);
    }
    
    private void elektrikOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elektrikOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_elektrikOdeButtonMouseEntered

    private void elektrikOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elektrikOdeButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_elektrikOdeButtonMouseExited

    private void suOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_suOdeButtonMouseEntered

    private void suOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suOdeButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_suOdeButtonMouseExited

    private void dogalgazOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogalgazOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_dogalgazOdeButtonMouseEntered

    private void dogalgazOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogalgazOdeButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_dogalgazOdeButtonMouseExited

    private void internetOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internetOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_internetOdeButtonMouseEntered

    private void internetOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internetOdeButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_internetOdeButtonMouseExited

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdemelerEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dogalgazBorcu;
    private javax.swing.JButton dogalgazOdeButton;
    private javax.swing.JLabel elektrikBorcu;
    private javax.swing.JButton elektrikOdeButton;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel internetBorcu;
    private javax.swing.JButton internetOdeButton;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel mesajDogalgazLabel;
    private javax.swing.JLabel mesajElektrikLabel;
    private javax.swing.JLabel mesajInternetLabel;
    private javax.swing.JLabel mesajSuLabel;
    private javax.swing.JPanel odemelerEkraniPanel;
    private gui.ParaCekmeEkrani paraCekmeEkrani1;
    private javax.swing.JLabel suBorcu;
    private javax.swing.JButton suOdeButton;
    // End of variables declaration//GEN-END:variables
}
