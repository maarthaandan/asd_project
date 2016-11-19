/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.*;
/**
 *
 * @author manu
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username="root";
        String password="manu";
        String query="Select*from student";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            String name;
            while(rs.next())
            {
                name = rs.getString(2);
                   System.out.println(name);
            }
        }
           catch(Exception e)
           {
               System.out.println("e");
           }
    }
    
}