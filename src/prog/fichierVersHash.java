package prog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

public class fichierVersHash {

	public void file2md5  (String datafile) throws NoSuchAlgorithmException, IOException {

		//String datafile = "c:\\test.TXT";

		MessageDigest md = MessageDigest.getInstance("MD5");

		FileInputStream fis = new FileInputStream(datafile);
		byte[] dataBytes = new byte[1024];

		int nread = 0; 

		while ((nread = fis.read(dataBytes)) != -1) {
			md.update(dataBytes, 0, nread);
		};

		byte[] mdbytes = md.digest();

		//convertit l octet au format hexadecimal
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < mdbytes.length; i++) {
			sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
		}

		//  System.out.println("Resulat(au format hexadecimal): " + sb.toString());
		//  JOptionPane.showMessageDialog(null,"Resulat(au format hexadecimal): " + sb.toString());

		//Menu.md5fileresult = sb.toString();

	}




	public void file2sha1  (String datafile) throws NoSuchAlgorithmException, IOException {


		MessageDigest md = MessageDigest.getInstance("SHA1");


		FileInputStream fis = new FileInputStream(datafile);
		byte[] dataBytes = new byte[1024];

		int nread = 0; 

		while ((nread = fis.read(dataBytes)) != -1) {
			md.update(dataBytes, 0, nread);
		};

		byte[] mdbytes = md.digest();

		//convertit l octet au format hexadecimal
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < mdbytes.length; i++) {
			sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
		}

		// Menu.sha1fileresult = sb.toString();

	}

	public void file2sha256  (String datafile) throws NoSuchAlgorithmException, IOException {





		MessageDigest md = MessageDigest.getInstance("SHA-256");


		FileInputStream fis = new FileInputStream(datafile);
		byte[] dataBytes = new byte[1024];

		int nread = 0; 

		while ((nread = fis.read(dataBytes)) != -1) {
			md.update(dataBytes, 0, nread);
		};

		byte[] mdbytes = md.digest();

		//convertit l octet au format hexadecimal
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < mdbytes.length; i++) {
			sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
		}

		//Menu.sha256fileresult = sb.toString();

	}


}
