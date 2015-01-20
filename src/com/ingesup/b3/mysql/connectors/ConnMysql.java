package com.ingesup.b3.mysql.connectors;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by alexandre on 06/01/2015.
 */
public class ConnMysql {
    private Connection con;

    public ConnMysql(String ip,String base, String login, String pass){
        try{
            String driver = "com.mysql.jdbc.Driver";
            Class.forName( driver );
            String url = "jdbc:mysql://" + ip + "/";
            con = DriverManager.getConnection(url + base, login, pass);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public ConnMysql(String base){
        this("localhost", base, "root", "");
    }


    public ResultSet select(String sql){
        ResultSet rs;
        try{
            Statement stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            if(sql.contains(" ")){
                rs = stmt.executeQuery(sql);
            }else{
                rs = stmt.executeQuery("SELECT * FROM " + sql);
            }
        }catch (Exception e){

        }
        return rs;
    }
}
