/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.db;

/**
 *
 * @author Marcel
 */
public class ConnectionExceptions extends Exception{

    public ConnectionExceptions() {
    }

    public ConnectionExceptions(String message) {
        super(message);
    }

    public ConnectionExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public ConnectionExceptions(Throwable cause) {
        super(cause);
    }

    public ConnectionExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
