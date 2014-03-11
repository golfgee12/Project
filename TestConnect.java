package jbook;
import java.sql.Connection;

public class TestConnect {
    public static void main(String[] args){
        try{
            Connection c = Db.getConnection();
            
            if(c != null){
                System.out.println("pass");
            }else{
                System.out.println("fail");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
