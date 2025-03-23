package section15;

public class EX15_08 {
	public static void main(String[] args) {
		String word = "1I2LOVE6YOU";
		
		String text = "";
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int asciiNum = ch;
			
			if ((asciiNum >= 65 & asciiNum <= 90) || (asciiNum >= 97 && asciiNum <= 122)) {
				text += ch;
			} else {
				text += " ";
			}
		}
		
		System.out.println(text);
	}

}
