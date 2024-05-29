package DKP.TugasAkhir;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class HalamanBooking extends javax.swing.JFrame {

    private final FormBooking Jf2 = new FormBooking();
    public HalamanBooking() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNama = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        Cbtype = new javax.swing.JComboBox<>();
        Tanggal = new com.toedter.calendar.JDateChooser();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtHarga = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(545, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama);
        txtNama.setBounds(130, 170, 165, 30);

        txtTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleponActionPerformed(evt);
            }
        });
        txtTelepon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTeleponKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTeleponKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelepon);
        txtTelepon.setBounds(130, 220, 165, 30);

        Cbtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Pilih Tipe Villa-----", "Villa 1", "Villa 2", "Villa 3", "Big Villa", "Villa A", "Villa B", "Villa C", "Villa D" }));
        Cbtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbtypeActionPerformed(evt);
            }
        });
        getContentPane().add(Cbtype);
        Cbtype.setBounds(130, 270, 159, 30);
        getContentPane().add(Tanggal);
        Tanggal.setBounds(130, 360, 134, 30);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(140, 400, 75, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type Villa", "Tanggal Checkin", "Jumlah hari", "Harga", "SubTotal"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 500, 453, 158);

        txtHarga.setEditable(false);
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        getContentPane().add(txtHarga);
        txtHarga.setBounds(130, 310, 159, 30);

        jButton1.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        jButton1.setText("Pesan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 390, 90, 40);

        jButton2.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        jButton2.setText("Konfirmasi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 700, 120, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Reservasi.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 530, 900);

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(110, 710, 76, 25);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
  txtNama.getText();  
           
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleponActionPerformed
       
    }//GEN-LAST:event_txtTeleponActionPerformed

    private void CbtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbtypeActionPerformed
 Object selectedType = Cbtype.getSelectedItem();
        if (selectedType != null) {
            String type = selectedType.toString();
            switch (type) {
                case "Villa 1":
                case "Villa 2":
                case "Villa 3":
                    txtHarga.setText("1.200.000");
                    break;
                case "Big Villa":
                    txtHarga.setText("1.800.000");
                    break;
                case "Villa A":
                case "Villa B":
                case "Villa C":
                case "Villa D":
                    txtHarga.setText("650.000");
                    break;
                default:
                    txtHarga.setText("");
                    break;
            }
        }
    }//GEN-LAST:event_CbtypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       String Tipe = Cbtype.getSelectedItem().toString();
        String hargaText = txtHarga.getText().replace(".", "");
        int harga = Integer.parseInt(hargaText);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String CheckIn = dateFormat.format(Tanggal.getDate());
       int JumlahHari = (int)jSpinner1.getValue();
       int Total = harga * JumlahHari;
       DefaultTableModel Model = (DefaultTableModel) jTable1.getModel();
       Model.addRow(new Object[]{Tipe, CheckIn, JumlahHari, harga, Total});
       bersihkan();
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new FormBooking().setVisible(true);
    
dispose();
String nama = txtNama.getText();
String telepon = txtTelepon.getText();
FormBooking formBooking = new FormBooking();
formBooking.setData(nama, telepon);
formBooking.setVisible(true);

   DefaultTableModel modelHalamanBooking = (DefaultTableModel) jTable1.getModel();
    int rowCount = modelHalamanBooking.getRowCount();
    
    DefaultTableModel modelFormBooking = (DefaultTableModel) formBooking.getjTable1().getModel();
    
    
    modelFormBooking.setRowCount(0);
     double totalHarga = 0; 
    
    
    for (int i = 0; i < rowCount; i++) {
        Object[] rowData = new Object[modelHalamanBooking.getColumnCount()];
        for (int j = 0; j < modelHalamanBooking.getColumnCount(); j++) {
            rowData[j] = modelHalamanBooking.getValueAt(i, j);
        }
        modelFormBooking.addRow(rowData);
          
        double harga = Double.parseDouble(modelHalamanBooking.getValueAt(i, 4).toString()); 
        totalHarga += harga;
    }
    
    
    formBooking.gettxtTotal().setText("Rp " + String.valueOf(totalHarga));
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
       
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtTeleponKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeleponKeyReleased
      
    }//GEN-LAST:event_txtTeleponKeyReleased

    private void txtTeleponKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeleponKeyTyped
  char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
      
        evt.consume();
    } 
    }//GEN-LAST:event_txtTeleponKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

 
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(HalamanBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cbtype;
    private com.toedter.calendar.JDateChooser Tanggal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables

    private void bersihkan() {
    Cbtype.setSelectedIndex(0);
    jSpinner1.setValue(0);
    
    }
}
