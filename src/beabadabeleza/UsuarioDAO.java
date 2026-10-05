
package beabadabeleza;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class UsuarioDAO {
    Connection conn;
    public ResultSet autenticacaoUsuario(UsuarioDTO objusu) {
        conn = new conectaDAO().connectDB();
        try {
            String sql = "SELECT * FROM usuario WHERE email = ? AND senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusu.getEmail());
            pstm.setString(2, objusu.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro UsuarioDAO: " + erro.getMessage());
            return null;
        }
    }
}
