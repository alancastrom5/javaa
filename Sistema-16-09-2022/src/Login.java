
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso ao sistema");
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(51, 51, 255));
        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(30, 60, 120, 40);

        txtUsuario.setBackground(new java.awt.Color(153, 204, 255));
        txtUsuario.setFont(new java.awt.Font("Sitka Heading", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(130, 50, 150, 40);

        lblSenha.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(51, 51, 255));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(30, 100, 100, 40);

        txtSenha.setBackground(new java.awt.Color(153, 204, 255));
        txtSenha.setFont(new java.awt.Font("Sitka Heading", 0, 12)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(txtSenha);
        txtSenha.setBounds(130, 100, 150, 40);

        btnEntrar.setBackground(new java.awt.Color(153, 204, 255));
        btnEntrar.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(51, 51, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(30, 160, 120, 40);

        setSize(new java.awt.Dimension(422, 263));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try { // Tentar fazer
            String usuario, senha;
            usuario = txtUsuario.getText();
            senha = txtSenha.getText();
            //2 - Conectar com o banco de dados bdsistema.
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conecta = DriverManager.getConnection("jdbc:mysql://localhost:3307/bdsistema", "root", "admin");
            //3 - Buscar na tabela usuarios o nome do usuário e a senha digitados no formulário.
            PreparedStatement st = conecta.prepareStatement("SELECT * FROM usuarios WHERE usuario = ? AND senha = ?");
            st.setString(1, usuario);
            st.setString(2, senha);
            ResultSet resultado = st.executeQuery();
            //4 - Verificar se o usuário foi encontrado na tabela do banco de dados.
            if(resultado.next()){
                //4.1 Se foi encontrado, abrir o formulário TelaMenu.java.
                TelaMenu tela;
                tela = new TelaMenu(resultado.getString("nome"), resultado.getString("cargo"));
                tela.setVisible(true);
            }else{
                //4.2 Se não foi encontrado, mostrar a mensagem "Usuário e/ou senha inválidos".
                JOptionPane.showMessageDialog(null,"Usuário e/ou senha inválidos");
            }   //5 - Desconectar do banco de dados.
            conecta.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
