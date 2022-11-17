
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioUsuarios extends javax.swing.JFrame {

    //Construtor da classe
    public RelatorioUsuarios() {
        initComponents();
        try {
            //1 - Conectar com o banco de dados.
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conecta = DriverManager.getConnection("jdbc:mysql://localhost:3307/bdsistema", "root", "admin");

            //2 - Buscar todos os usuários cadastrados na tabela do BD (SELECT).
            PreparedStatement st = conecta.prepareStatement("SELECT * FROM usuarios");
            ResultSet resultado = st.executeQuery();

            //3 - Carregar os usuários na tabela tblUsuarios do formulário.
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("usuario"),
                    resultado.getString("senha"),
                    resultado.getString("nome"),
                    resultado.getString("cargo")
                };
                tblModelo.addRow(dados);
            }

            //4 - Desconectar do banco de dados.
            conecta.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        lblCargo = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();

        setTitle("Relatório de usuários");
        getContentPane().setLayout(null);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Senha", "Nome", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 680, 250);

        lblCargo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(0, 51, 153));
        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(40, 20, 110, 40);

        cmbCargo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmbCargo.setForeground(new java.awt.Color(153, 0, 51));
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Analista", "Estagiário", "Gerente", "Professor", "Programador", "Vendedor" }));
        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(150, 20, 280, 40);

        setSize(new java.awt.Dimension(728, 355));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        //Pegar o valor selecionado no combo
        String c;
        c = cmbCargo.getSelectedItem().toString();
        try {
            //1 - Conectar com o banco de dados.
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conecta = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsistema", "root", "teruel");

            //2 - Buscar todos os usuários cadastrados na tabela do BD (SELECT).
            PreparedStatement st = conecta.prepareStatement("SELECT * FROM usuarios WHERE cargo = ?");
            st.setString(1, c); // completa o SELECT (no interrogação) com o conteúdo de c
            ResultSet resultado = st.executeQuery();

            //3 - Carregar os usuários na tabela tblUsuarios do formulário.
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            tblModelo.setRowCount(0);
            
            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("usuario"),
                    resultado.getString("senha"),
                    resultado.getString("nome"),
                    resultado.getString("cargo")
                };
                tblModelo.addRow(dados);
            }

            //4 - Desconectar do banco de dados.
            conecta.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
    }//GEN-LAST:event_cmbCargoActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
