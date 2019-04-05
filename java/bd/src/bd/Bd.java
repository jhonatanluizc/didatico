/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.text.html.HTML;

/**
 *
 * @author jonat
 */
public class Bd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
            Statement stm = con.createStatement();
            System.out.println("Conectado");
            
            
            

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Não Conectado: " + e);
        }

    }

}
