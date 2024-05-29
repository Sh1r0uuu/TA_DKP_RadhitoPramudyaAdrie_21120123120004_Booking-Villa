
package DKP.TugasAkhir;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class FormBooking extends javax.swing.JFrame {
 private String Nama;
    private String Telepon;
    private String harga;
    
    public FormBooking() {
        initComponents();
    }
  public void setData(String nama, String telepon) {
    this.Nama = nama;
    this.Telepon = telepon;
    jLabel4.setText( nama);
    jLabel5.setText( telepon);
}
  
public FormBooking(String[] rowData) {
    initComponents();
}


public JTable getjTable1() {
        return jTable1;
    }

public JTextField gettxtTotal() {
        return txtTotal;
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(495, 550));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(475, 64, 17, 328);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type Villa", "Tanggal Checkin", "Jumlah hari", "Harga", "Sub Total"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 240, 453, 158);
        getContentPane().add(txtTotal);
        txtTotal.setBounds(355, 410, 120, 28);

        jLabel3.setFont(new java.awt.Font("Courier New", 3, 14)); // NOI18N
        jLabel3.setText("Total");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 420, 50, 20);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 141, 208, 30);

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 183, 208, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/invoice.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 490, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
      

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
