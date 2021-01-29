package lexAnalysis;

public class Token {

	private TokenType type; // 词法记号的type
	private String token; // 词法记号的value
	public String start;
	public String end;
	public int order;
	///////////////////////////////////////
	public int classifiedCode;
	public String nm ;
	public int endAddr;
	public int lineNo;

	public Token(int lNo, TokenType type, String token) {
		lineNo = lNo;
		this.type = type;
		this.token = token;
		classifiedCode = this.type.getValue();
		nm = token;
		
	}

	public Token(int lNo, TokenType type, String token, int order) {
		lineNo = lNo;
		this.type = type;
		this.token = token;
		this.order = order;
		classifiedCode = this.type.getValue();
		nm = token;
		
	}

	public TokenType getType() {
		return type;
	}

	public String getLexeme() {
		return token;
	}

	public String toString() {
		return "No:" + order +", Code:"+ type.getValue() + ", type:" + type + ", value:" + token + ", start:" + start + ", end:" + end +  "\n";
	}
}

enum TokenType {
	Error(-1), DIGIT(0), DCA(1), RPS(2), SPECIFY(3), NOTE(4), TABLE(5), DFS(6), AFSDS(7), PREVALENCE(8), DACE(9),
	RAPFS(10), CULRDIS(11), GENRDIS(12), DMS(13), SRK(14), FCO(15), DDS(16), COMORBIDITY(17), RTOCS(18), CLASS(19), ID(20),
	SEPARATORS(21);

	private int value;

	TokenType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
