package prog;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.SecureRandom;

public class detruireFichierGuttman {

	public static void detruireUnFichier(File fichier) throws IOException {
	
		String firstpass5 = "99";
	    byte pass5 = Byte.parseByte(firstpass5);
		
		String stringbyte = "aaaaaa";
		new BigInteger("AAAAAA", 16).toByteArray();

		
		//on verifie si le fichier existe
		//	if (fichier.exists()) {
		//on mesure la longeur du fichier
		long longeurfichier = fichier.length();

		//on cree one valeur aleatoire
		SecureRandom valaleatoire = new SecureRandom();
		//on cre un acces au fichier en ecriture
		RandomAccessFile raf = new RandomAccessFile(fichier, "rws");

		//Javadoc: Seek: Sets the file-pointer offset, measured from the beginning of this file, at which the next read or write occurs.
		raf.seek(0);
		raf.getFilePointer();
		byte[] data = new byte[64];

		Integer.parseInt(stringbyte, 16);
		byte[] b = stringbyte.getBytes();
		//	byte[] b = stringbyte.getBytes(Charset.forName("UTF-8"));

	//	System.out.println(stringbyte);
		byte[] CDRIVES = hexStringToByteArray("55");
		System.out.println(CDRIVES);
		System.out.println();

		int pos = 0;
		//tant que on est pas arrivé à la fin du fichier
		while (pos < longeurfichier) {
		//	valaleatoire.nextBytes(data);
			raf.write(pass5);
			//on ajoute a la position la longeur du byte
			pos += data.length;
		}
		raf.close();
		//on supprime le fichier
		//	fichier.delete();
	}
	//	}

	public static byte[] hexStringToByteArray(String s) {
		int len = s.length();
		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
					+ Character.digit(s.charAt(i+1), 16));
			System.out.println(data);
		
		}
		return data;
	}


	public static void main(String[] args) throws IOException {

		File monfichier = new File("C:/Users/Florian/Desktop/workspace projet s4/ProjetS4/fichierdetest.txt");
		detruireFichierGuttman.detruireUnFichier(monfichier);
		
		byte[] octettest = hexStringToByteArray("e04fd020");
		System.out.println(octettest);
	}

}
