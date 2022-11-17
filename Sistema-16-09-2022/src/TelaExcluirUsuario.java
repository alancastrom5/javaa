
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class TelaExcluirUsuario extends javax.swing.JFrame {

    //Construtor da classe
    public TelaExcluirUsuario() {
        initComponents();
        pnlDadosUsuario.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        pnlDadosUsuario = new javax.swing.JPanel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        cmbCargo = new javax.swing.JComboBox<>();

        setTitle("Exclusão de usuários");
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsuario.setText("Usuário a excluir");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(20, 20, 130, 40);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(150, 20, 160, 40);

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(330, 20, 110, 40);

        pnlDadosUsuario.setLayout(null);

        lblSenha.setText("Senha");
        pnlDadosUsuario.add(lblSenha);
        lblSenha.setBounds(20, 20, 100, 40);
        pnlDadosUsuario.add(txtSenha);
        txtSenha.setBounds(130, 22, 210, 40);

        lblNome.setText("Nome");
        pnlDadosUsuario.add(lblNome);
        lblNome.setBounds(20, 70, 100, 40);
        pnlDadosUsuario.add(txtNome);
        txtNome.setBounds(130, 70, 210, 40);

        lblCargo.setText("Cargo");
        pnlDadosUsuario.add(lblCargo);
        lblCargo.setBounds(20, 120, 100, 40);

        btnExcluir.setText("Confirmar Exclusão");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnlDadosUsuario.add(btnExcluir);
        btnExcluir.setBounds(20, 180, 190, 40);

        cmbCargo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmbCargo.setForeground(new java.awt.Color(153, 0, 51));
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Analista", "Estagiário", "Gerente", "Professor", "Programador", "Vendedor" }));
        pnlDadosUsuario.add(cmbCargo);
        cmbCargo.setBounds(130, 120, 210, 40);

        getContentPane().add(pnlDadosUsuario);
        pnlDadosUsuario.setBounds(20, 70, 580, 260);

        setSize(new java.awt.Dimension(636, 356));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //1 - Verificar se o campo txtUsuario está vazio;
        if (txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o usuário a excluir");
            txtUsuario.requestFocus();
            return; // stop - para a execução
        }
        //2 - Pegar o valor digitado no txtUsuario
        String u;
        u = txtUsuario.getText();
        try {
            //3 - Conectar com o BD
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conecta = DriverManager.getConnection("jdbc:mysql://localhost:3307/bdsistema", "root", "admin");
            //4 - Buscar o usuário digitado na tabela usuarios
            PreparedStatement st = conecta.prepareStatement("SELECT * FROM usuarios WHERE usuario = ?");
            st.setString(1, u);
            ResultSet resultado = st.executeQuery(); //Executa o SELECT
            //4.1 Se encontrar, carregar os dados nos campos do painel
            if(resultado.next()){ //Verifica se encontrou o usuário
                txtSenha.setText(resultado.getString("senha"));
                txtNome.setText(resultado.getString("nome"));
                cmbCargo.setSelectedItem(resultado.getString("cargo"));
                pnlDadosUsuario.setVisible(true);
            } else { //4.2 Se não encontrar, exibir mensagem
                JOptionPane.showMessageDialog(null, "Usuário não encontrado");
            }
            //5 - Desconectar
            conecta.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //1 - Verificar se o campo txtUsuario está vazio;
        if (txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o usuário a excluir");
            txtUsuario.requestFocus();
            return; // stop - para a execução
        }
        //2 - Pegar o valor digitado no txtUsuario
        String u;
        u = txtUsuario.getText();
        try {
            //3 - Conectar com o BD
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conecta = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsistema", "root", "teruel");
            //4 - Excluir o usuário digitado na tabela usuarios
            PreparedStatement st = conecta.prepareStatement("DELETE FROM usuarios WHERE usuario = ?");
            st.setString(1, u);
            st.executeUpdate(); //Executa o DELETE
            JOptionPane.showMessageDialog(null, "Usuário Excluído com sucesso");
            pnlDadosUsuario.setVisible(false);
            txtUsuario.setText("");
            txtUsuario.requestFocus();
            //5 - Desconectar
            conecta.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaExcluirUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExcluirUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExcluirUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExcluirUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExcluirUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlDadosUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
