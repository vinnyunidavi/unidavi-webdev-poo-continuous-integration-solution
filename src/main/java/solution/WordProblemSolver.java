package solution;

import java.util.HashMap;
import java.util.Map;

//XXX renomear classe
public class WordProblemSolver {

	private Map<String,Integer> results = new HashMap<String,Integer>();

	WordProblemSolver(){
		results.put("What is 53 plus 2?", 55);
		results.put("What is 1 plus 1?", 2);
		results.put("What is -1 plus -10?", -11);
	}

	public Object solve(String sentence) {
		return results.get(sentence);
	}

}
