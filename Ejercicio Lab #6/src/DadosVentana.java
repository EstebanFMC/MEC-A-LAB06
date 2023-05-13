import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;


public class DadosVentana extends javax.swing.JFrame {

    public DadosVentana() {
        initComponents();
    }
    String [] DadosCaras = {"dados1.png","dados2.png","dados3.png","dados4.png","dados5.png","dados6.png"};
    Timer timer, timer2;
    Random random = new Random();
    Hilo1 hilo;
    
   
    
    
     public class Hilo1 extends Thread{
        @Override
        public void run(){
            timer = new Timer();
            timer2 = new Timer();
           
            TimerTask task2 = new TimerTask() {
                 @Override
                 public void run() {
                     Dado1Label.setIcon(new ImageIcon("Imagenes/" + DadosCaras[random.nextInt(6)]));
                     Dado2Label.setIcon(new ImageIcon("Imagenes/" + DadosCaras[random.nextInt(6)])); 
                     timer.cancel();
                 }
             };
            TimerTask task = new TimerTask() {
                 @Override
                 public void run() {
                     Dado1Label.setIcon(new ImageIcon("Imagenes/" + DadosCaras[random.nextInt(6)]));
                     Dado2Label.setIcon(new ImageIcon("Imagenes/" + DadosCaras[random.nextInt(6)]));
                 }
             };
            
            timer2.schedule(task2,1000); 
            timer.scheduleAtFixedRate(task, 0, 1);
           
            }
        } 
     
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IniciaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Dado2Label = new javax.swing.JLabel();
        Dado1Label = new javax.swing.JLabel();
        SalirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IniciaButton.setText("Iniciar");
        IniciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciaButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Dados");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        Dado2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dados2.png"))); // NOI18N

        Dado1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dados1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dado1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Dado2Label)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dado1Label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Dado2Label, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        SalirButton.setBackground(new java.awt.Color(255, 0, 0));
        SalirButton.setText("X");
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SalirButton))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(IniciaButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(SalirButton))
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IniciaButton)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciaButtonActionPerformed
    hilo = new Hilo1();
    hilo.start();
    }//GEN-LAST:event_IniciaButtonActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
        Interfaz v = new Interfaz();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_SalirButtonActionPerformed


    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dado1Label;
    private javax.swing.JLabel Dado2Label;
    private javax.swing.JButton IniciaButton;
    private javax.swing.JButton SalirButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
