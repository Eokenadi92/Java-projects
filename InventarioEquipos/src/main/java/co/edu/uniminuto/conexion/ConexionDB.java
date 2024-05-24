/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionDB {
    private String user;
    private String password;
    private String nameDB;
    private String port;
    private String server;
    private String url;
    Connection con;

    public ConexionDB() {
        this.user="root";
        this.password="";
        this.nameDB="inventario_db";
        this.port="3306";
        this.server="localhost";
        this.con =null;
        this.url="jdbc:mysql://"+this.server+":"+this.port+"/"+this.nameDB;
    }
    private Connection conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con=DriverManager.getConnection(this.url,this.user,this.password);
            JOptionPane.showMessageDialog(null,"Conectado a: "+this.nameDB);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Se ha Generado un error: "+e.getMessage());
        }
        return this.con;    
    }
    public Connection myConex(){
        return this.conexion();
    }
}
