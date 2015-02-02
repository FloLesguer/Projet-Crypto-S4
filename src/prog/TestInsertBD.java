package prog;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class TestInsertBD {
    public static void main(String[] args) {
        Connection connection = null;
        Statement stmt = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/bdprojets4", "root", "");
             
            stmt = connection.createStatement();
            stmt.execute("INSERT INTO md5 (id,pass,passmd5) "
                                + "VALUES (1,'Lokesh','Gupta')");
        }
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}