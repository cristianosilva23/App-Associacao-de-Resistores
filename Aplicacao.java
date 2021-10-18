
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Cristiano
 */
public class Aplicacao extends javax.swing.JFrame {
    
    private Resistor resistorobj;

    public Aplicacao() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLResistor1 = new javax.swing.JLabel();
        jLResistor2 = new javax.swing.JLabel();
        jTFResistor1 = new javax.swing.JTextField();
        jTFResistor2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAResultado = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jBCalcularSerie = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jBCalcularParalelo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equivalência de Resistores");

        jLResistor1.setText("Resistor 1:");

        jLResistor2.setText("Resistor 2:");

        jTFResistor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFResistor2ActionPerformed(evt);
            }
        });

        jTAResultado.setColumns(20);
        jTAResultado.setRows(5);
        jTAResultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jScrollPane1.setViewportView(jTAResultado);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Operações"));

        jBCalcularSerie.setText("Calcular em Série");
        jBCalcularSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularSerieActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBCalcularParalelo.setText("Calcular em Paralelo");
        jBCalcularParalelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularParaleloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBLimpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBCalcularSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBCalcularParalelo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCalcularSerie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCalcularParalelo)
                .addGap(18, 18, 18)
                .addComponent(jBLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSair)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLResistor2)
                        .addGap(18, 18, 18)
                        .addComponent(jTFResistor2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLResistor1)
                        .addGap(18, 18, 18)
                        .addComponent(jTFResistor1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLResistor1)
                            .addComponent(jTFResistor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLResistor2)
                            .addComponent(jTFResistor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFResistor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFResistor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFResistor2ActionPerformed

    private void jBCalcularSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularSerieActionPerformed
       realizaOperacao('+');
    }//GEN-LAST:event_jBCalcularSerieActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTFResistor1.setText(null);
        jTFResistor2.setText(null);
        jTAResultado.setText("");
        jTFResistor1.requestFocusInWindow();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBCalcularParaleloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularParaleloActionPerformed
        realizaOperacao('/');
    }//GEN-LAST:event_jBCalcularParaleloActionPerformed

    private void realizaOperacao(char op) {
        float resistor1;
        float resistor2;
        
        resistor1 = Float.parseFloat(jTFResistor1.getText());
        resistor2 = Float.parseFloat(jTFResistor2.getText());
        
        resistorobj = new Resistor(resistor1, resistor2);
        
        float resultOperacao = 0;
        switch (op) {
            case '+':
                resultOperacao = resistorobj.serie();
                break;
            case '/':
                resultOperacao = resistorobj.paralelo();
                break;
            
            }//fim do switch
        jTAResultado.setText(String.valueOf("O resultado da Associação é = " + String.valueOf(resultOperacao)+" Ohms"));
    }
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
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCalcularParalelo;
    private javax.swing.JButton jBCalcularSerie;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLResistor1;
    private javax.swing.JLabel jLResistor2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAResultado;
    private javax.swing.JTextField jTFResistor1;
    private javax.swing.JTextField jTFResistor2;
    // End of variables declaration//GEN-END:variables
}
