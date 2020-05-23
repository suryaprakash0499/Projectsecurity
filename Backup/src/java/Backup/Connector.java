/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Connector {

    public int registerEmployee(RegistrationBean REGISTRATION) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO REGISTRATION" +
            "  (Username, Userid, Password, Reenterpassword, Address, State, County ) VALUES " +
            " (?, ?, ?, ?, ?,?,?);";

        int result = 0;

        Class.forName("org.h2.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:h2:~/test", "sa", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, REGISTRATION.getUsername());
            preparedStatement.setString(3, REGISTRATION.getUserid());
            preparedStatement.setString(4, REGISTRATION.getPassword());
            preparedStatement.setString(5, REGISTRATION.getReenterpassword());
            preparedStatement.setString(6, REGISTRATION.getAddress());
            preparedStatement.setString(7, REGISTRATION.getState());
            preparedStatement.setString(7, REGISTRATION.getCountry());
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
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
