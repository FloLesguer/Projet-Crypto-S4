package prog;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Boucle_num {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NoSuchAlgorithmException {
		
		for (int i=0; i<=9; i++) {
			System.out.println(i);
			
			//InsertBD.MettreStringDansBD(""+i,"md5num8char");
			
			String strI = "" + i;
			String md5 = stringVersHash.md5(strI);
		
			InsertBD.MettreStringDansBD("md5num8char",strI, md5);
			
		}
	
	}
}