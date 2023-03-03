/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Brenn
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        
        try {
          
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdvendas","usuario","123");
            return conexao;
            
            
           
        
            
        } catch (Exception erro) {
            
            throw new RuntimeException(erro);
        }
        
    }
}
