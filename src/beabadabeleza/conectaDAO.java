
package beabadabeleza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {
    public Connection connectDB(){
        Connection conn = null;
        try {
            // A linha abaixo é a que faz a mágica! Ela aponta para o banco beaba_da_beleza
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/beaba_da_beleza?user=root&password=616862");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO: " + erro.getMessage());
        }
        return conn;
    }
}
