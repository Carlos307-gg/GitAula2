<<<<<<< HEAD
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

>>>>>>> afe5746 (Definindo a tela de cadastro como tela principal)

public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
<<<<<<< HEAD
    public boolean cadastrarProduto(ProdutosDTO produto){
        String sql = "INSERT INTO produtos(nome, valor, status) VALUES (?, ?, ?)";
        
        try{
            conn = new conectaDAO().connectDB();
            prep = conn.prepareStatement(sql);
            prep.setString(1, produto.getNome());
            prep.setInt(2, produto.getValor());
            prep.setString(3, produto.getStatus());
            prep.execute();
            return true;
        }catch(SQLException e){
            System.out.println("Erro ao inserir produto: " + e.getMessage());
            return false;
        }
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        String sql = "SELECT * FROM produtos";

        try {
            conn = new conectaDAO().connectDB();
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();            

            while (rs.next()) { 
                ProdutosDTO produtoDTO = new ProdutosDTO();
                produtoDTO.setId(rs.getInt("id"));
                produtoDTO.setNome(rs.getString("nome"));
                produtoDTO.setStatus(rs.getString("status"));
                produtoDTO.setValor(rs.getInt("valor"));
                
                listagem.add(produtoDTO);
            }
            return listagem;
                    
        } catch (SQLException e) {
            System.out.println("Erro ao listar produtos");
            return null;
        }
    }
    
    public boolean venderProduto(ProdutosDTO produto){
        String sql = "UPDATE produtos SET `status` = 'Vendido' WHERE id = ?;";
        
        try{
            conn = new conectaDAO().connectDB();
            prep = conn.prepareStatement(sql);
            prep.setInt(1, produto.getId());
            prep.execute();
            return true;
        }catch(SQLException e){
            System.out.println("Erro ao vender produto: " + e.getMessage());
            return false;
        }
    }
    
    public ArrayList<ProdutosDTO> listarProdutosVendidos(){
        String sql = "SELECT * FROM produtos WHERE status = 'Vendido'";

        try {
            conn = new conectaDAO().connectDB();
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();            

            while (rs.next()) { 
                ProdutosDTO produtoDTO = new ProdutosDTO();
                produtoDTO.setId(rs.getInt("id"));
                produtoDTO.setNome(rs.getString("nome"));
                produtoDTO.setStatus(rs.getString("status"));
                produtoDTO.setValor(rs.getInt("valor"));
                
                listagem.add(produtoDTO);
            }
            return listagem;
                    
        } catch (SQLException e) {
            System.out.println("Erro ao Listar produtos vendidos");
            return null;
        }
    }
=======
    public void cadastrarProduto (ProdutosDTO produto){
        
        
        //conn = new conectaDAO().connectDB();
        
        
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        
        return listagem;
    }
    
    
    
        
>>>>>>> afe5746 (Definindo a tela de cadastro como tela principal)
}

