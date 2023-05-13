
public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        setLocationRelativeTo(null);
    }

     DadosVentana v1 = new DadosVentana ();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DadosButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TragaMonedasButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        DadosButton.setText("Dados");
        DadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadosButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Menú de Juegos");

        TragaMonedasButton.setText("TragaMonedas");
        TragaMonedasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TragaMonedasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DadosButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TragaMonedasButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DadosButton, TragaMonedasButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TragaMonedasButton)
                    .addComponent(DadosButton))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DadosButton, TragaMonedasButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadosButtonActionPerformed
        v1.setVisible(true);
        v1.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_DadosButtonActionPerformed

    private void TragaMonedasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TragaMonedasButtonActionPerformed
        TragaMonedas v2 = new TragaMonedas();
        v2.setVisible(true);
        v2.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_TragaMonedasButtonActionPerformed

  
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DadosButton;
    private javax.swing.JButton TragaMonedasButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
