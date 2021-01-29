package SyntaxSemanticAna;





public class ErrorInfoInSemanticSyntax {
	
	public String errorInfo = null;
	private ErrorType errorType;
	public ErrorInfoInSemanticSyntax(String err) {
		// TODO Auto-generated constructor stub
		errorInfo = err;
	}
	public ErrorInfoInSemanticSyntax(ErrorType et) {
		// TODO Auto-generated constructor stub
		errorType = et;
	}
	public void setErrorInfo(int lNo, String errPro, String errPart) {
		String string = errorType.getName();
		errorInfo = String.format(" %s,LineNo: %d,Which Production Formula: %s, Error Part: %s%n", string,lNo,errPro,errPart);
	}
	
	public void printErr() {
		System.out.println(errorInfo);
	} 
	
}

