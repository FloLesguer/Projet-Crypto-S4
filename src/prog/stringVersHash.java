package prog;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class stringVersHash {

	// fonction de conversion de la chaine de caracteres vers md5
	public static String md5(String input) {

		String md5 = null;

		if(null == input) return null;

		try {

			//cree l objet MessageDigest en md5 MD5
			MessageDigest digest = MessageDigest.getInstance("MD5");

			//on met le string d entree dans le messagedigest
			digest.update(input.getBytes(), 0, input.length());

			//convertit le message en base 16 (hex)
			md5 = new BigInteger(1, digest.digest()).toString(16);
			System.out.println(md5);

		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();
		}
		return md5;
		
	}


	// fonction de conversion de la chaine de caracteres vers sha1
	static String sha1(String input) throws NoSuchAlgorithmException {


		MessageDigest mDigest = MessageDigest.getInstance("SHA1");


		byte[] result = mDigest.digest(input.getBytes());
		StringBuffer sb = new StringBuffer();


		for (int i = 0; i < result.length; i++) {
			sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
		}


		return sb.toString();
	}


	// fonction de conversion de la chaine de caracteres vers sha256
	static String sha256(String input) throws NoSuchAlgorithmException {


		MessageDigest mDigest = MessageDigest.getInstance("SHA-256");


		byte[] result = mDigest.digest(input.getBytes());
		StringBuffer sb = new StringBuffer();


		for (int i = 0; i < result.length; i++) {
			sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
		}


		return sb.toString();
	}





}

