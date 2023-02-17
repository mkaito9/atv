/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

    import factory.ConnectionFactory;
    import model.Notebook;
    import java.sql.*;
    import java.sql.PreparedStatement;

/**
 *
 * @author matig
 */
public class NotebookDAO {

    private Connection connection;
    int id;
    String modelo;
    String marca;
    String processador;
    String ram;
    String tipoRam;
    String armazenamento;
    String tipoArmazenamento;
    String placaVideo; 
    String polegadas;
    String resolucao;
    
    public NotebookDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adicionaNotebook(Notebook notebook){
        String sql = "INSERT INTO notebook (modelo,marca,processador,ram,tipoRam,armazenamento,tipoArmazenamento,placaVideo,polegadas,resolucao)VALUES(?,?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, notebook.getModelo());
            stmt.setString(2, notebook.getMarca());
            stmt.setString(3, notebook.getProcessador());
            stmt.setString(4, notebook.getRam());
            stmt.setString(5, notebook.getTipoRam());
            stmt.setString(6, notebook.getArmazenamento());
            stmt.setString(7, notebook.getTipoArmazenamento());
            stmt.setString(8, notebook.getPlacaVideo());
            stmt.setString(9, notebook.getPolegadas());
            stmt.setString(10, notebook.getResolucao());
            
            stmt.execute();
            stmt.close();
        }
        catch(SQLException u){
            throw new RuntimeException(u);
        
        }
    }
}
