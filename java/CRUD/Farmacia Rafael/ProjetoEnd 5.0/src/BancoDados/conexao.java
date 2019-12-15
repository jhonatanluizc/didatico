/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conexao {

    public Connection con;
    public Statement stmt;
    public ResultSet rs;

    String url = "jdbc:mysql://localhost/farmacia";
    String driver = "com.mysql.jdbc.Driver";
    String user = "root";
    String password = "";

    public void conectar() {
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, user, password);

            stmt = con.createStatement();
        } catch (Exception e) {

        }
    }

    public void executaSql(String sql) {
        try {

            stmt = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            
        }
    }
}
