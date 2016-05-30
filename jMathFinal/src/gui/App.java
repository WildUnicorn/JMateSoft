package gui;

import java.awt.Color;
import java.awt.Graphics;
import random.Rand;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class App extends javax.swing.JFrame {
    Rand rd;
    int n1; 
    int n2;
    int con1;
    int con2;
    int cTotal;
    int porc;
    int puntos;
    int pFinal;
    
    public App() {
        initComponents();
        setLocationRelativeTo(null);
        rd = new Rand();
        n1=1;
        n2=6;
        puntos = 1;
        cTotal = 0;
        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        lblN1 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        jProgressBarAciertos = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAResultado = new javax.swing.JTextArea();
        lblOp = new javax.swing.JLabel();
        lblN2 = new javax.swing.JLabel();
        lblN3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblPuntos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JMateSoft");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel.setText("Bebe [1-5]");

        lblN1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblN1.setText("n1");

        txtRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespuestaActionPerformed(evt);
            }
        });
        txtRespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRespuestaKeyReleased(evt);
            }
        });

        jProgressBarAciertos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jProgressBarAciertos.setToolTipText("");
        jProgressBarAciertos.setStringPainted(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Aciertos");

        txtAResultado.setEditable(false);
        txtAResultado.setColumns(20);
        txtAResultado.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        txtAResultado.setRows(5);
        jScrollPane1.setViewportView(txtAResultado);

        lblOp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOp.setText("op");

        lblN2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblN2.setText("n2");

        lblN3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblN3.setText("=");

        jButton1.setText("Terminar juego ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblPuntos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPuntos.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Puntuación:");

        jMenu1.setText("Dificultad");

        buttonGroup1.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Bebe [1-5]");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem1);

        buttonGroup1.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setText("Novato [6-10]");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem2);

        buttonGroup1.add(jRadioButtonMenuItem3);
        jRadioButtonMenuItem3.setText("Maximo[11-20]");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem3);

        buttonGroup1.add(jRadioButtonMenuItem4);
        jRadioButtonMenuItem4.setText("Extremo [21-40]");
        jRadioButtonMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem4);

        buttonGroup1.add(jRadioButtonMenuItem5);
        jRadioButtonMenuItem5.setText("Insano [41-100]");
        jRadioButtonMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jProgressBarAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblN1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOp)
                                .addGap(7, 7, 7)
                                .addComponent(lblN2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblN3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(txtRespuesta)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(lblPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblN1)
                    .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOp)
                    .addComponent(lblN2)
                    .addComponent(lblN3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jProgressBarAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(lblPuntos)
                    .addComponent(jLabel2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
        lblNivel.setText("Maximo [11-20]");
        n1 = 11;
        n2 =21;
        puntos= 3;
        txtAResultado.setText(txtAResultado.getText()+
                "\nCambiando dificultad a Maximo"
                +"\n-----------------------------------");
        cargar();
                
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void jRadioButtonMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
        lblNivel.setText("Extremo [21-40]");
        n1 = 21;
        n2 = 41;
        puntos = 4;
        txtAResultado.setText(txtAResultado.getText()+
                "\nCambiando dificultad a Extremo"
                +"\n-----------------------------------");
        cargar();
    }//GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        lblNivel.setText("Bebe [1-5]");
        n1 = 1;
        n2 = 6;
        puntos = 1;
        txtAResultado.setText(txtAResultado.getText()+            
                "\nCambiando dificultad a Bebe"+
                "\n-----------------------------------");
        cargar();
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void txtRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        lblNivel.setText("Novato [6-10]");
        n1 = 6;
        n2 = 11;
        puntos = 2;
        txtAResultado.setText(txtAResultado.getText()+
                "\nCambiando dificultad a Novato"
                +"\n-----------------------------------");
        cargar();
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jRadioButtonMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem5ActionPerformed
        lblNivel.setText("Insano [41-100]");
        n1 = 41;
        n2 = 101;
        puntos = 5;
        txtAResultado.setText(txtAResultado.getText()+
                "\nCambiando dificultad a Insano"
                +"\n-----------------------------------");
        cargar();
        
    }//GEN-LAST:event_jRadioButtonMenuItem5ActionPerformed

    private void txtRespuestaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespuestaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            cargarRespueta();
            cambiarColorBarra();
            
        }
    }//GEN-LAST:event_txtRespuestaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this, "Juego Terminado.\n Su puntuacion: "+lblPuntos.getText());
        txtAResultado.setText(null);
        txtRespuesta.setText(null);
        jProgressBarAciertos.setValue(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JProgressBar jProgressBarAciertos;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblN1;
    private javax.swing.JLabel lblN2;
    private javax.swing.JLabel lblN3;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblOp;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JTextArea txtAResultado;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables

private void cargar(){
    lblN1.setText(Integer.toString(rd.generarNumero(n1, n2)));
    lblOp.setText(rd.generarOperadores());
    lblN2.setText(Integer.toString(rd.generarNumero(n1, n2)));
    }
private float resolverOperacion (){
    float resultado = 0;
    if (lblOp.getText()== "+"){
        resultado = Float.parseFloat(lblN1.getText()) + Float.parseFloat(lblN2.getText());
    }else if (lblOp.getText()== "-"){
        resultado = Float.parseFloat(lblN1.getText()) - Float.parseFloat(lblN2.getText());
    }else if (lblOp.getText()== "*"){
        resultado = Float.parseFloat(lblN1.getText()) * Float.parseFloat(lblN2.getText());
    }else{
        resultado = Float.parseFloat(lblN1.getText()) / Float.parseFloat(lblN2.getText());
    }
    return resultado;
    }

    private void cargarRespueta() {
        cTotal++;

        if (resolverOperacion() == Float.parseFloat(txtRespuesta.getText())){
                //esta bien 
                con1++;
                pFinal = pFinal + puntos;
                String sPFinal = Integer.toString(pFinal);
                lblPuntos.setText(sPFinal);
                txtAResultado.setText(txtAResultado.getText()+"\n"+"Bien hecho :D\nSu respuesta: "+txtRespuesta.getText()
                        +"\n ["+con1+" de "+cTotal+"]\n-----------------------------------");
                
                
            }else {
                //esta mal 
                txtAResultado.setText(txtAResultado.getText()+"\n"+"Mal hecho! :C ["+lblN1.getText()
                        +lblOp.getText()
                        +lblN2.getText()+"="+resolverOperacion()+"]\n"+ "Su respuesta: "+txtRespuesta.getText()
                        +"\n ["+con1+" de "+cTotal+"]\n-----------------------------------");
                con2++;
                
               
            }
            //txtAResultado.setText(txtRespuesta.getText()+"-"+Integer.toString(resolverOperacion()));
            txtRespuesta.setText(null);
            porc = (con1 * 100)/cTotal;
            jProgressBarAciertos.setValue(porc);
            cargar();
            
      }
    private void cambiarColorBarra(){
        if (jProgressBarAciertos.getValue()<= 33){
            jProgressBarAciertos.setForeground(Color.red);
        } else if (jProgressBarAciertos.getValue()>33 && jProgressBarAciertos.getValue() <=66 ){
            jProgressBarAciertos.setForeground(Color.yellow);
        } else{
            jProgressBarAciertos.setForeground(Color.green);
        }
         
    }
    }
