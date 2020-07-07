package SeleniumRevised;

import org.apache.commons.codec.binary.Base64;

public class Encoding_decoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="ihhbqihb";
		byte[]  b=Base64.encodeBase64(str.getBytes());
		
		System.out.println(b);
		byte[] a=Base64.decodeBase64(b);
		System.out.println(new String(a));
		System.out.println(a.toString());
	}

}
