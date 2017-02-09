/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JDialogAbout.java
 *
 * Created on 18-nov.-2009, 13:42:30
 */

package UI;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Alain
 */
public class JDialogAbout extends javax.swing.JDialog {

    /** Creates new form JDialogAbout */
    public JDialogAbout(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        URL url = JDialogAbout.class.getResource("hole_small.jpg");
        if (url != null) {
            ImageIcon image = new ImageIcon(url);
            this.jLabelHole.setIcon(image);
        }
        url = JDialogAbout.class.getResource("SQLite.gif");
        if (url != null) {
            ImageIcon image2 = new ImageIcon(url);
            this.jLabelSQLite.setIcon(image2);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelHole = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelSQLite = new javax.swing.JLabel();
        jLabelPimpy = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelDescrip = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About Acanthus/Pimpy conversational agent");
        setResizable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabelHole.setPreferredSize(new java.awt.Dimension(350, 265));
        jPanel1.add(jLabelHole, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabelSQLite.setPreferredSize(new java.awt.Dimension(120, 36));
        jPanel3.add(jLabelSQLite, java.awt.BorderLayout.CENTER);
        jPanel3.add(jLabelPimpy, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel3, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabelDescrip.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDescrip.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelDescrip.setText("<html>\nAcanthus/Pimpy conversational engine by <b>John Van Bouc</b> ;<br />\nWritten in Java ; Using SQLiteJDBC (http://www.zentus.com/sqlitejdbc/) ;<br />\nCopyright 2009 © John Van Bouc ;<br />\nsausagerollll@yahoo.fr ;<br />\nThe painting is \"Swimming Hole\" from Thomas Eakins (look it up, he's cool)\n</html>");
        jLabelDescrip.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelDescrip.setOpaque(true);
        jPanel2.add(jLabelDescrip, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jButtonClose.setText("Close");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonClose);

        getContentPane().add(jPanel4, java.awt.BorderLayout.SOUTH);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-500)/2, (screenSize.height-452)/2, 500, 452);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JLabel jLabelDescrip;
    private javax.swing.JLabel jLabelHole;
    private javax.swing.JLabel jLabelPimpy;
    private javax.swing.JLabel jLabelSQLite;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}