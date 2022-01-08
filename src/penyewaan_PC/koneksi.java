/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penyewaan_PC;
   import java.sql.Connection;
   import java.sql.DriverManager;
   import java.sql.SQLException;

public class koneksi {
    public static Connection getConnection(){ 
         Connection conn = null;
         String url ="jdbc:mysql://localhost:3306/penyewaanpc";
         String user = "root";
         String pass = "";
         
        try{
    conn=DriverManager.getConnection(url, user, pass);
         }catch (SQLException e){
             System.out.println(e);
         }
         
        return conn;
    }
    
    public static void main (String[]args){
        try{
            Connection c = koneksi.getConnection();
            System.out.println(String.format("Terkoneksi kedatabase %s"+"Sukses !",c.getCatalog()));
        }catch (SQLException e){
            System.out.println(e);
        }
    }
 
}
