import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
        
public class EmpresaDao {
  Connection conecta;
  ResultSet resultado;
  
public void conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conecta = DriverManager.getConnection("jdbc:mysql://localhost:3307/bdsistema", "root", "admin");
    }
public ResultSet logar(String usuario, String senha) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conecta.prepareStatement("SELECT * FROM usuarios WHERE usuario = ? AND senha = ?");
   0     st.setString(1, usuario);
        st.setString(2, senha);
        resultado = st.executeQuery();
        
        return resultado;
    }
}
    
    
