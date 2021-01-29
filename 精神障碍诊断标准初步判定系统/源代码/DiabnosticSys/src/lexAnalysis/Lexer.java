package lexAnalysis;

import java.io.IOException;
import java.util.Vector;
import java.io.FileReader;

import SyntaxSemanticAna.*;



public class Lexer {
	private int order = 0; // order从0开始就是所有的计数是0，1， 2， 3，……
	private int end = -1;
	private int lineNo = 1;
	private char ch;
	private Vector<Token> lexResult = new Vector<Token>();
	public Vector<ErrorInfoInSemanticSyntax> errorList = new Vector<ErrorInfoInSemanticSyntax>();
	private StringBuilder lexeme = new StringBuilder();
	private FileReader fileReader;
	ErrorInfoInSemanticSyntax newError = null;

	public Lexer(String filePath) {
		try {
			fileReader = new FileReader(filePath);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	public Vector<Token> getResult(){
		return lexResult;
	}
	public void analyse() {
		try {
			int read;
			int [] old = {-1, -1};	//old[0]指明上一关键词位置，old[1]指明上一诊断标准位置
			Dictionary dictionary = new Dictionary("./src/lexAnalysis/wordlist.txt");
			while ((read = fileReader.read()) != -1) {
				ch = (char) read;
				if(ch == 10) {lineNo++;}
				if (Character.isWhitespace(ch)) {
					
					refreshLexResult(old, dictionary);
					continue;
				} else if (Character.isDigit(ch) || Character.isLetter(ch) || ch == '-') {
					lexeme.append(ch);
				} else if ((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64)|| (ch >= 91 && ch <= 96) ||(ch >= 123 && ch <= 126)) {
					
					refreshLexResult(old, dictionary);
//					order++; // SEPARATORS（助记符）添加到vector里
					
					lexResult.addElement(new Token(lineNo,TokenType.SEPARATORS, String.valueOf(ch), order));
					order++;
				}
			}
			end = order-1;
			if(lexResult.lastElement().classifiedCode == 21) {
				
				
					if(old[1] != -1 && lexResult.get(old[1]).end == null) {
						lexResult.get(old[1]).end = String.valueOf(end);
						lexResult.get(old[1]).endAddr = end;
						lexResult.get(old[0]).end = String.valueOf(end);
						lexResult.get(old[0]).endAddr = end;
					}else {
						lexResult.get(old[0]).end = String.valueOf(end);
						lexResult.get(old[0]).endAddr = end;
					}
				
			}else {
			
			refreshLexResult(old, dictionary);
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	private Token strToLex(String sLexeme) {
		switch (sLexeme) {
		case "Diagnostic-Criteria":
			return new Token(lineNo,TokenType.DCA, sLexeme);
		case "Recording-Procedures":
			return new Token(lineNo,TokenType.RPS, sLexeme);
		case "Specify":
			return new Token(lineNo,TokenType.SPECIFY, sLexeme);
		case "Note":
			return new Token(lineNo,TokenType.NOTE, sLexeme);
		case "TABLE":
			return new Token(lineNo,TokenType.TABLE, sLexeme);
		case "Diagnostic-Features":
			return new Token(lineNo,TokenType.DFS, sLexeme);
		case "Associated-Features-Supporting-Diagnosis":
			return new Token(lineNo,TokenType.AFSDS, sLexeme);
		case "Prevalence":
			return new Token(lineNo,TokenType.PREVALENCE, sLexeme);
		case "Development-and-Course":
			return new Token(lineNo,TokenType.DACE, sLexeme);
		case "Risk-and-Prognostic-Factors":
			return new Token(lineNo,TokenType.RAPFS, sLexeme);
		case "Culture-Related-Diagnostic-issues":
			return new Token(lineNo,TokenType.CULRDIS, sLexeme);
		case "Gender-Related-Diagnostic-issues":
			return new Token(lineNo,TokenType.GENRDIS, sLexeme);
		case "Diagnostic-Markers":
			return new Token(lineNo,TokenType.DMS, sLexeme);
		case "Suicide-Risk":
			return new Token(lineNo,TokenType.SRK, sLexeme);
		case "Functional-Consequences-of":
			return new Token(lineNo,TokenType.FCO, sLexeme);
		case "Differential-Diagnosis":
			return new Token(lineNo,TokenType.DDS, sLexeme);
		case "Comorbidity":
			return new Token(lineNo,TokenType.COMORBIDITY, sLexeme);
		case "Relationship-to-Other-Classifications":
			return new Token(lineNo,TokenType.RTOCS, sLexeme);
		case "Class":
			return new Token(lineNo,TokenType.CLASS, sLexeme);
		default:
			try {
				int num = Integer.parseInt(sLexeme);
				return new Token(lineNo,TokenType.DIGIT, sLexeme);
			} catch (Exception e) {
				return new Token(lineNo,TokenType.ID, sLexeme);
			}
		}
	}

	private void refreshLexResult(int [] old, Dictionary dict) {
		if (lexeme.length() != 0) {
			String sLexeme = lexeme.toString();
			Token tLexeme = strToLex(sLexeme);
			tLexeme.start = String.valueOf(order);
			if(end != -1) {
				if(old[1] != -1 && lexResult.get(old[1]).end == null) {
					lexResult.get(old[1]).end = String.valueOf(end);
					lexResult.get(old[1]).endAddr = end;
					lexResult.get(old[0]).end = String.valueOf(end);
					lexResult.get(old[0]).endAddr = end;
				}else {
					lexResult.get(old[0]).end = String.valueOf(end);
					lexResult.get(old[0]).endAddr = end;
				}
			}
			if (tLexeme.classifiedCode >= 1 && tLexeme.classifiedCode <= 19) {
				if(old[1] != -1 && lexResult.size() >= old[1]+1 && lexResult.get(old[1]).end == null) {
					lexResult.get(old[1]).end = String.valueOf(order-1);
					lexResult.get(old[1]).endAddr = order-1;
				}
				if (old[0] != -1) {
					lexResult.get(old[0]).end = String.valueOf(order-1);
					lexResult.get(old[0]).endAddr = order-1;
					
				}
				old[0] = order;
			} else if (tLexeme.getType() == TokenType.DIGIT || tLexeme.getType() == TokenType.ID) {
				
				if(tLexeme.getType() == TokenType.ID) {
					String word = dict.checkWord(sLexeme);
					if (lexeme.length() == 1 && Character.isUpperCase(lexeme.charAt(0))) {
						if (old[1] != -1) {
							lexResult.get(old[1]).end = String.valueOf(order-1);
							lexResult.get(old[1]).endAddr = order-1;
						}
						old[1] = order;
					}
					else if(word == sLexeme) {
						
					}
					else {
//						tLexeme = null;
//						tLexeme = new Token(lineNo,TokenType.Error, word);
						
						newError = new ErrorInfoInSemanticSyntax(ErrorType.LexError);
						newError.setErrorInfo(lineNo, sLexeme, "拼写错误");
						errorList.add(newError);
						newError = null;
//						order++;
//						lexeme.delete(0, lexeme.length());
//						return;
					}
				}
			}
			lexResult.addElement(tLexeme);
			order++;
			lexResult.lastElement().order = order-1;
			lexeme.delete(0, lexeme.length());
		}
	}
}
