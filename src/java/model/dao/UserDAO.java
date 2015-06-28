/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.util.List;
import model.User;
import model.db.ConnectionExceptions;
import model.db.ConnectionFactory;

/**
 *
 * @author Marcel
 */
public class UserDAO implements IDAO<User> {
    private Connection c;

    public UserDAO(Connection c) throws ConnectionExceptions{
        try {
             this.c = ConnectionFactory.getConnection();
        } catch (Exception e) {
            throw new ConnectionExceptions(e.getMessage());
        }
       
    }

    @Override
    public void create(User t) throws ConnectionExceptions {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List read(int cod) throws ConnectionExceptions {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(User t) throws ConnectionExceptions {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(User t) throws ConnectionExceptions {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
