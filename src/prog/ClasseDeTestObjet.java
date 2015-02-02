package prog;

import java.io.File;
import java.io.IOException;

public class ClasseDeTestObjet {

	public static void main(String[] args) throws IOException {
		
		
		//InsertBD.MettreStringDansBD("test","md5num8char");
		
		stringVersHash.md5("test");

		File monfichier = new File("C:/Users/Florian/Desktop/workspace projet s4/ProjetS4/fichierdetest.txt");
		
		
	     detruireFichier.detruireUnFichier(monfichier);
		
	}

}
