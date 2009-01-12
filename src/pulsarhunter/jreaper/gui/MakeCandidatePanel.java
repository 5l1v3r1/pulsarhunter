/*
 * MakeCandidatePanel.java
 *
 * Created on March 24, 2008, 2:26 PM
 */

package pulsarhunter.jreaper.gui;

import pulsarhunter.jreaper.Cand;

/**
 *
 * @author  mkeith
 */
public class MakeCandidatePanel extends javax.swing.JFrame {
    
    private MainView master;
    private Cand c;
    
    /** Creates new form MakeCandidatePanel */
    public MakeCandidatePanel(Cand c,MainView master) {
        initComponents();
        this.c = c;
        this.master = master;
        
        if(c.getCandClass()!=0)this.jTextField_newCandName.setText(c.getName());
        else this.jTextField_newCandName.setText(c.getCandidateFile().getUniqueIdentifier());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton_class1 = new javax.swing.JRadioButton();
        jRadioButton_class2 = new javax.swing.JRadioButton();
        jRadioButton_class3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField_newCandName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton_kpsr = new javax.swing.JRadioButton();
        jTextField_kpsrName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Classify Candidate");
        jLabel1.setText("Mark this candidate as:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("New Pulsar"));
        buttonGroup1.add(jRadioButton_class1);
        jRadioButton_class1.setText("Very Likely New Pulsar (Class 1)");
        jRadioButton_class1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton_class1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton_class1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_class1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_class2);
        jRadioButton_class2.setSelected(true);
        jRadioButton_class2.setText("Probable New Pulsar (Class 2)");
        jRadioButton_class2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton_class2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton_class2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_class2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_class3);
        jRadioButton_class3.setText("Possible New Pulsar (Class 3)");
        jRadioButton_class3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton_class3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton_class3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_class3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Name for new candidate:");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextField_newCandName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .add(jRadioButton_class2)
                    .add(jRadioButton_class1)
                    .add(jRadioButton_class3)
                    .add(jLabel2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jRadioButton_class1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton_class2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton_class3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextField_newCandName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Previously Known Pulsar"));
        buttonGroup1.add(jRadioButton_kpsr);
        jRadioButton_kpsr.setText("A Previously Known Pulsar");
        jRadioButton_kpsr.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton_kpsr.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton_kpsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_kpsrActionPerformed(evt);
            }
        });

        jTextField_kpsrName.setText("Jxxxx-xxxx");
        jTextField_kpsrName.setEnabled(false);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextField_kpsrName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .add(jRadioButton_kpsr))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jRadioButton_kpsr)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextField_kpsrName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        jButton1.setText("Classify Candidate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.add(jButton1);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.add(jButton2);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jRadioButton_kpsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_kpsrActionPerformed
        this.jTextField_kpsrName.setEnabled(true);
        this.jTextField_newCandName.setEnabled(false);
    }//GEN-LAST:event_jRadioButton_kpsrActionPerformed
    
    private void jRadioButton_class3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_class3ActionPerformed
        this.jTextField_kpsrName.setEnabled(false);
        this.jTextField_newCandName.setEnabled(true);
    }//GEN-LAST:event_jRadioButton_class3ActionPerformed
    
    private void jRadioButton_class2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_class2ActionPerformed
        this.jTextField_kpsrName.setEnabled(false);
        this.jTextField_newCandName.setEnabled(true);
    }//GEN-LAST:event_jRadioButton_class2ActionPerformed
    
    private void jRadioButton_class1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_class1ActionPerformed
        this.jTextField_kpsrName.setEnabled(false);
        this.jTextField_newCandName.setEnabled(true);
    }//GEN-LAST:event_jRadioButton_class1ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int theClass = -1;
        String name;
        name = this.jTextField_newCandName.getText();
        if(this.jRadioButton_class1.isSelected())theClass = 1;
        if(this.jRadioButton_class2.isSelected())theClass = 2;
        if(this.jRadioButton_class3.isSelected())theClass = 3;
        
        if(this.jRadioButton_kpsr.isSelected()){
            theClass = 0;
            name = this.jTextField_kpsrName.getText()+" (usr)";
        }
        
        c.setNPulses(1);
        
        
        final int theClassFinal = theClass;
        final String nameFinal = name;
        Thread task = new Thread(){
            public void run(){
                final LoadingSplash lsplash = new LoadingSplash();
                java.awt.EventQueue.invokeLater(new Runnable(){
                    public void run(){
                        lsplash.setText("Marking Candidates... Please wait");
                        lsplash.setVisible(true);
                    }
                });
                master.findHarmonics(c,theClassFinal,nameFinal);
                master.replot();
                java.awt.EventQueue.invokeLater(new Runnable(){
                    public void run(){
                        master.replot();
                        lsplash.setVisible(false);
                        lsplash.dispose();
                    }
                });
            }
        };
        task.start();
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton_class1;
    private javax.swing.JRadioButton jRadioButton_class2;
    private javax.swing.JRadioButton jRadioButton_class3;
    private javax.swing.JRadioButton jRadioButton_kpsr;
    private javax.swing.JTextField jTextField_kpsrName;
    private javax.swing.JTextField jTextField_newCandName;
    // End of variables declaration//GEN-END:variables
    
}
