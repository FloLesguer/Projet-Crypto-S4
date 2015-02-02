package prog;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;

public class detruireFichier {

	
	public static void detruireUnFichier(File fichier) throws IOException {
		//on verifie si le fichier existe
		if (fichier.exists()) {
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
			int pos = 0;
			//tant que on est pas arrivé à la fin du fichier
			while (pos < longeurfichier) {
				valaleatoire.nextBytes(data);
				raf.write(data);
				//on ajoute a la position la longeur du byte
				pos += data.length;
			}
			raf.close();
			//on supprime le fichier
		//	fichier.delete();
		}
	}
	
	
	
}
