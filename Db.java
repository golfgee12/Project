package jbook;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
    public static Connection getConnection(){
        try{
            // เตรียมตัวแปรในการเชขื่อมต่อ
            String url = "jdbc:mysql://localhost/db_javagui";
            String user = "root";
            String pass = "1598";
            String driver = "com.mysql.jdbc.Driver";
            
            //โหลดไดรเวอร์ เข้าสุ้หน่วยความจำ
            Class.forName(driver);
            //เชื่อมฐานข้อมูลและ Return
            return DriverManager.getConnection(url, user, pass);
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
}
