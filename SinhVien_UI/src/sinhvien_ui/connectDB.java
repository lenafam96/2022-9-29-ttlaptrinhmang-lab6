/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinhvien_ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP                       
 */
public class connectDB {
    private static String DB_URL = "jdbc:mysql://localhost:3306/qlsv";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";
    Connection conn;
    
    public connectDB(){
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            
            if(conn != null){
                System.out.println("Kết nối CSDL SQL Server thành công!");
            }
            else{
                System.out.println("Kết nối CSDL SQL Server thất bại");
            }
        }
        catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
        }   
    }
    
    public ResultSet ExcuteQueryGetTable(String cauTruyVanSQL){
        try {
            Statement stmt = conn.createStatement();           
            ResultSet rs = stmt.executeQuery(cauTruyVanSQL);
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
            
        return null;
    }
    public void ExcuteQueryUpdateDB(String cauTruyVanSQL){
       
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(cauTruyVanSQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
