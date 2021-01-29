package lexAnalysis;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Dictionary {
	private final Set<String>vocabulary = new HashSet<String>();
	public Dictionary(String filePath) {
		try {
			BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
			String word = "";
			while((word = buff.readLine()) != null) {
				vocabulary.add(word);
			}
			buff.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String checkWord(String word) {
		String testWord = word.toLowerCase();
		for (String str : vocabulary) {
		      if(str.equals(testWord)) {
		    	  return word;
		      }
		}
		return "\"" + word +"\"" +  " Misspelling";
	}
}

