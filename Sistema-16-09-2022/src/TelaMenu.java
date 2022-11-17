
public class TelaMenu extends javax.swing.JFrame {

    //Construtor da classe
    public TelaMenu(String nome, String cargo) {
        initComponents();
        mnuUsuarios.setVisible(false);
        lblSaudacao.setText("Olá, " + cargo + " " + nome + ".");
        if(cargo.equalsIgnoreCase("gerente")){
            mnuUsuarios.setVisible(true);
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacao = new javax.swing.JLabel();
        barMenu = new javax.swing.JMenuBar();
        mnuProdutos = new javax.swing.JMenu();
        itmCadastroProdutos = new javax.swing.JMenuItem();
        itmConsultaProdutos = new javax.swing.JMenuItem();
        itmExclusaoProdutos = new javax.swing.JMenuItem();
        itmAlteracaoProdutos = new javax.swing.JMenuItem();
        itmRelatoriosProdutos = new javax.swing.JMenuItem();
        mnuClientes = new javax.swing.JMenu();
        mnuFuncionarios = new javax.swing.JMenu();
        mnuUsuarios = new javax.swing.JMenu();
        itmIncluirUsuarios = new javax.swing.JMenuItem();
        itmAlterarUsuarios = new javax.swing.JMenuItem();
        itmConsultarUsuarios = new javax.swing.JMenuItem();
        itmExcluirUsuarios = new javax.swing.JMenuItem();
        itmRelatoriosUsuarios = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();

        setTitle("Menu Principal");
        getContentPane().setLayout(null);

        lblSaudacao.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        lblSaudacao.setForeground(new java.awt.Color(0, 51, 153));
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(360, 0, 350, 40);

        mnuProdutos.setText("Produtos");
        mnuProdutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        itmCadastroProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastroProdutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itmCadastroProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/disco.jpg"))); // NOI18N
        itmCadastroProdutos.setText("Cadastro");
        mnuProdutos.add(itmCadastroProdutos);

        itmConsultaProdutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itmConsultaProdutos.setText("Consulta");
        mnuProdutos.add(itmConsultaProdutos);

        itmExclusaoProdutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itmExclusaoProdutos.setText("Exclusão");
        mnuProdutos.add(itmExclusaoProdutos);

        itmAlteracaoProdutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itmAlteracaoProdutos.setText("Alteração");
        mnuProdutos.add(itmAlteracaoProdutos);

        itmRelatoriosProdutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itmRelatoriosProdutos.setText("Relatórios");
        mnuProdutos.add(itmRelatoriosProdutos);

        barMenu.add(mnuProdutos);

        mnuClientes.setText("Clientes");
        mnuClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        barMenu.add(mnuClientes);

        mnuFuncionarios.setText("Funcionários");
        mnuFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        barMenu.add(mnuFuncionarios);

        mnuUsuarios.setText("Usuários");
        mnuUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        itmIncluirUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmIncluirUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itmIncluirUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/disquete.jpg"))); // NOI18N
        itmIncluirUsuarios.setText("Incluir");
        itmIncluirUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmIncluirUsuariosActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmIncluirUsuarios);

        itmAlterarUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itmAlterarUsuarios.setText("Alterar");
        mnuUsuarios.add(itmAlterarUsuarios);

        itmConsultarUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmConsultarUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itmConsultarUsuarios.setText("Consultar");
        mnuUsuarios.add(itmConsultarUsuarios);

        itmExcluirUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itmExcluirUsuarios.setText("Excluir");
        itmExcluirUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirUsuariosActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmExcluirUsuarios);

        itmRelatoriosUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatoriosUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itmRelatoriosUsuarios.setText("Relatórios");
        itmRelatoriosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatoriosUsuariosActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmRelatoriosUsuarios);

        barMenu.add(mnuUsuarios);

        mnuAjuda.setText("Ajuda");
        mnuAjuda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        barMenu.add(mnuAjuda);

        setJMenuBar(barMenu);

        setSize(new java.awt.Dimension(725, 394));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmIncluirUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmIncluirUsuariosActionPerformed
        TelaUsuario tela;
        tela = new TelaUsuario();
        tela.setVisible(true);
        
    }//GEN-LAST:event_itmIncluirUsuariosActionPerformed

    private void itmRelatoriosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatoriosUsuariosActionPerformed
       //new RelatorioUsuarios().setVisible(true);
       RelatorioUsuarios x;
       x = new RelatorioUsuarios();
       x.setVisible(true);
    }//GEN-LAST:event_itmRelatoriosUsuariosActionPerformed

    private void itmExcluirUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirUsuariosActionPerformed
        new TelaExcluirUsuario().setVisible(true);
    }//GEN-LAST:event_itmExcluirUsuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JMenuItem itmAlteracaoProdutos;
    private javax.swing.JMenuItem itmAlterarUsuarios;
    private javax.swing.JMenuItem itmCadastroProdutos;
    private javax.swing.JMenuItem itmConsultaProdutos;
    private javax.swing.JMenuItem itmConsultarUsuarios;
    private javax.swing.JMenuItem itmExcluirUsuarios;
    private javax.swing.JMenuItem itmExclusaoProdutos;
    private javax.swing.JMenuItem itmIncluirUsuarios;
    private javax.swing.JMenuItem itmRelatoriosProdutos;
    private javax.swing.JMenuItem itmRelatoriosUsuarios;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuClientes;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuProdutos;
    private javax.swing.JMenu mnuUsuarios;
    // End of variables declaration//GEN-END:variables
}
