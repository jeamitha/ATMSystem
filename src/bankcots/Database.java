/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankcots;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author KAHFI
 */
public class Database {
    private Connection con=null;
    private Statement stmt=null;
    
    public Database(){
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/db_cots","root","");
            stmt=con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public ResultSet getData(String s){
        ResultSet rs=null;
        try {
            rs=stmt.executeQuery(s);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
    
    public void query(String s){
        try {
            stmt.executeUpdate(s);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    
    
    
}