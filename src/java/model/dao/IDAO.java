/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.util.List;
import model.db.ConnectionExceptions;

/**
 *
 * @author Marcel
 * @param <T>
 */
public interface  IDAO<T> {
    
    public void create(T t)throws ConnectionExceptions;   
    public List read(int cod) throws ConnectionExceptions;    
    public void update(T t) throws ConnectionExceptions;
    public void delete(T t) throws ConnectionExceptions;
}
