/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easymcu;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.apache.maven.shared.utils.io.FileUtils;

/**
 *
 * @author askar
 */
public class NewProject extends javax.swing.JFrame {

    EasyMCU easy = new EasyMCU();

    /**
     * Creates new form NewProject
     */
    public NewProject() {
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
        jSeparator1 = new javax.swing.JSeparator();
        projectNameLabel = new javax.swing.JLabel();
        projectNameTextField = new javax.swing.JTextField();
        projectLocationLabel = new javax.swing.JLabel();
        projectLocationTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        projectVersionLabel = new javax.swing.JLabel();
        projectVersionTextField = new javax.swing.JTextField();
        cancleButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Project");
        setBackground(new java.awt.Color(82, 133, 212));
        setName("NewProjectFrame"); // NOI18N
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(82, 133, 212));

        projectNameLabel.setForeground(new java.awt.Color(254, 254, 254));
        projectNameLabel.setText("Project Name : ");

        projectNameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        projectNameTextField.setToolTipText("Enter Project Name");
        projectNameTextField.setName(""); // NOI18N

        projectLocationLabel.setForeground(new java.awt.Color(254, 254, 254));
        projectLocationLabel.setText("Project Location :");

        projectLocationTextField.setEditable(false);

        browseButton.setBackground(new java.awt.Color(35, 64, 102));
        browseButton.setForeground(new java.awt.Color(254, 254, 254));
        browseButton.setText("Browse...");
        browseButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                browseButtonMouseMoved(evt);
            }
        });
        browseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                browseButtonMouseExited(evt);
            }
        });
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        projectVersionLabel.setForeground(new java.awt.Color(254, 254, 254));
        projectVersionLabel.setText("Project Version : ");

        cancleButton.setBackground(new java.awt.Color(35, 64, 102));
        cancleButton.setForeground(new java.awt.Color(254, 254, 254));
        cancleButton.setText("<Cancle>");
        cancleButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cancleButtonMouseMoved(evt);
            }
        });
        cancleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancleButtonMouseExited(evt);
            }
        });
        cancleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleButtonActionPerformed(evt);
            }
        });

        createButton.setBackground(new java.awt.Color(35, 64, 102));
        createButton.setForeground(new java.awt.Color(254, 254, 254));
        createButton.setText("<Create>");
        createButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                createButtonMouseMoved(evt);
            }
        });
        createButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createButtonMouseExited(evt);
            }
        });
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(java.awt.Color.red);
        errorLabel.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(projectNameLabel)
                                .addGap(34, 34, 34)
                                .addComponent(projectNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(projectVersionLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(projectVersionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(projectLocationLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(projectLocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(browseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectNameLabel)
                    .addComponent(projectNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectLocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseButton)
                    .addComponent(projectLocationLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectVersionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectVersionLabel))
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(cancleButton)
                    .addComponent(errorLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    AskarFile aFile = new AskarFile();
    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        JFileChooser f = new JFileChooser(aFile.getLastLocation());
        f.setFileSelectionMode(f.DIRECTORIES_ONLY);
        f.showDialog(this, "Select");
        projectLocationTextField.setText(f.getSelectedFile().toString());
    }//GEN-LAST:event_browseButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        if (!projectNameTextField.getText().isEmpty() && !projectLocationTextField.getText().isEmpty() &&
                projectVersionTextField.getText().matches("(?!\\.)(\\d+(\\.\\d+)+)(?![\\d\\.])$")) {
            errorLabel.setText("");
            File file = new File(projectLocationTextField.getText() + "\\" + projectNameTextField.getText());
            System.out.println("file:"+file.toString());
            if (file.exists()) {
                errorLabel.setText("There is a project with the same name!");
            } else {
                try {
                    
                    
                    file.mkdir();
                    String Location = (String) projectLocationTextField.getText() + "\\" + projectNameTextField.getText()
                            ,Name = (String) projectNameTextField.getText();

                    aFile.saveIntoAAskarFile(projectNameTextField.getText(), projectLocationTextField.getText(), projectVersionTextField.getText());
                   
                    File source = new File(System.getProperty("user.dir")+"\\src\\Default_Drivers");
                    System.out.println("source:"+source.toString());

                    FileUtils.copyDirectory(source, file);
                    aFile.saveLastLocation((String) projectLocationTextField.getText() );
                    CurrentProject project = new CurrentProject(Location,Name);
                    
                    project.setVisible(true);
                    this.dispose();
                } catch (IOException ex) {
                    Logger.getLogger(NewProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            String errorMessage = "Not Valid";
            if (projectNameTextField.getText().isEmpty()) {
                errorMessage += " Name ";
            }
            if (projectLocationTextField.getText().isEmpty()) {
                errorMessage += " ,Location ";
            }
            if (!projectVersionTextField.getText().matches("(?!\\.)(\\d+(\\.\\d+)+)(?![\\d\\.])$")) {
                errorMessage += " ,Version.";
            }
            errorLabel.setText(errorMessage);
        }


    }//GEN-LAST:event_createButtonActionPerformed

    private void cancleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancleButtonActionPerformed

    private void browseButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseButtonMouseMoved
        browseButton.setForeground(new Color(255, 128, 0));
    }//GEN-LAST:event_browseButtonMouseMoved

    private void browseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseButtonMouseExited
        browseButton.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_browseButtonMouseExited

    private void createButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButtonMouseMoved
        createButton.setForeground(new Color(255, 128, 0));
    }//GEN-LAST:event_createButtonMouseMoved

    private void createButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButtonMouseExited
        createButton.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_createButtonMouseExited

    private void cancleButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancleButtonMouseMoved
        cancleButton.setForeground(new Color(255, 128, 0));
    }//GEN-LAST:event_cancleButtonMouseMoved

    private void cancleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancleButtonMouseExited
        cancleButton.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_cancleButtonMouseExited
    int xx, xy;
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

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
            java.util.logging.Logger.getLogger(NewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JButton cancleButton;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel projectLocationLabel;
    private javax.swing.JTextField projectLocationTextField;
    private javax.swing.JLabel projectNameLabel;
    private javax.swing.JTextField projectNameTextField;
    private javax.swing.JLabel projectVersionLabel;
    private javax.swing.JTextField projectVersionTextField;
    // End of variables declaration//GEN-END:variables
}
