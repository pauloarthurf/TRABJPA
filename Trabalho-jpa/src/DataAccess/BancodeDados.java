/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulo_000
 */
public class BancodeDados {
    private Connection conexao;

    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }
    
    public BancodeDados(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabfinal","root","1234");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BancodeDados.class.getName()).log(Level.SEVERE, null, ex);                    
        }
    }
}
