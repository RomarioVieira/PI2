/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.db.ConnectionExceptions;
import model.db.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Login;
/**
 *
 * @author Marcel
 */
public class LoginDAO implements IDAO<Login>{
    
    private Connection c = null;
    
    public LoginDAO() throws ConnectionExceptions{
        try{
            this.c = ConnectionFactory.getConnection();
        }
        catch(Exception e){
            throw new ConnectionExceptions(e.getMessage());
        }
    }

    @Override
    public void create(Login t) throws ConnectionExceptions {
        PreparedStatement ps = null;
        
        if(t ==null)
            throw new ConnectionExceptions("O valor passado não pode ser nulo");
        try{
            String SQL = "insert into login (cod, user_, senha) values (?, ?, ?)";
            
            ps = c.prepareStatement(SQL);
            ps.setString(1, t.getCod().toString());
            ps.setString(2, t.getUser());
            ps.setString(3, t.getSenha());
            ps.executeUpdate();
        } catch (SQLException ex) {
           throw new ConnectionExceptions("Erro ao inserir dados: "+ ex);
        }finally{
            ConnectionFactory.closeConnection(c, ps);
        }
    }

    @Override
    public void update(Login t) throws ConnectionExceptions {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Login t) throws ConnectionExceptions {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List read(int cod) throws ConnectionExceptions {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
