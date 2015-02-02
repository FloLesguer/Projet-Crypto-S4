package prog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertBD {

	
	
	
	//fonction a part
	public static void MettreStringDansBD (String nomtable, String mdp, String mdpcrypt) {
		
		 Connection connection = null;
	        Statement stmt = null;
	        try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdprojets4", "root", "");
	             
	            stmt = connection.createStatement();
	            
	            //fonctionne
	          //  stmt.execute("INSERT INTO "+nomtable+"(pass,passcrypt) "+"VALUES ('test23','testcrypt')");
	            
	            //fonctionne mal
	              stmt.execute("INSERT INTO "+nomtable+"(pass,passcrypt) "+"VALUES ('"+mdp+"','"+mdpcrypt+"'");
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
