/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Surya0499
 */
public class RegistrationConnector {
     public boolean validate(LoginBean loginbean) throws ClassNotFoundException {
        boolean status = false;
        HttpServletRequest req;
        HttpServletResponse res;

        Class.forName("org.h2.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:h2:tcp://localhost/~/test","sa","");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Registration where userid = ? and password = ? ")) {
            preparedStatement.setString(1, loginbean.getUserid());
            preparedStatement.setString(2, loginbean.getPassword());
            System.out.println(preparedStatement);
            
            // Step 3: Execute the query or update query
            ResultSet rs= preparedStatement.executeQuery();
            status = rs.next();

        } catch (SQLException e) {
            // process sql exception
            
            printSQLException(e);
        }
        return status;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
    
}
