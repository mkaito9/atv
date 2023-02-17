/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import model.Fornecedor;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author matig
 */
public class FornecedorDAO {
    private Connection connection;
    
    int id;
    String razaoSocial;
    String nomeFantasia;
    String cnpj;
    String cidade;
    String estado;
    
    public FornecedorDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adicionaFornecedor (Fornecedor fornecedor){
        String sql = "INSERT INTO fornecedor(razaoSocial,nomeFantasia,cnpj,cidade,estado)VALUES(?,?,?,?,?)";
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, fornecedor.getRazaoSocial());
            stmt.setString(2, fornecedor.getNomeFantasia());
            stmt.setString(3, fornecedor.getCnpj());
            stmt.setString(4, fornecedor.getCidade());
            stmt.setString(5, fornecedor.getEstado());
            stmt.execute();
            stmt.close();
        }
        catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
}
