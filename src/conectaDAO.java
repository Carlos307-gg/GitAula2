
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
    public Connection connectDB(){
        Connection conn = null;
        
        try {
        
<<<<<<< HEAD
            conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11?user=root&password=ap100267");
=======
            conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11?user=root&password=");
>>>>>>> afe5746 (Definindo a tela de cadastro como tela principal)
            
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO" + erro.getMessage());
        }
        return conn;
    }
    
}
