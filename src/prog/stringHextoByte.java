package prog;

import java.io.File;
import java.io.IOException;

public class stringHextoByte {

	
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
	
	
	
	public static byte[] hexStringToByteArray2(String s) {
	    byte[] b = new byte[s.length() / 2];
	    for (int i = 0; i < b.length; i++) {
	      int index = i * 2;
	      int v = Integer.parseInt(s.substring(index, index + 2), 16);
	      b[i] = (byte) v;
	      System.out.println(b);
	    }
	    return b;
	  }

	
	public static void main(String[] args) throws IOException {

		String buffer = null;
		
		byte[] matriceOctets = { (byte) 204, 29, (byte) 207, (byte) 217 };
		hexStringToByteArray2("4141204141204141");
		System.out.println(matriceOctets);
		
		
		System.out.println(matriceOctets.toString());
	//	System.out.println(buffer);
		
		
		String text = "99";
	    byte value = Byte.parseByte(text);
	    
	    System.out.println(value);
		
		
	}
	
	
	
}
