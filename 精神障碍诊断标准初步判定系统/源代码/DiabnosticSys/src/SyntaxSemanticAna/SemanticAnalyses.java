package SyntaxSemanticAna;
import java.util.HashMap;
import java.util.Map;





public class SemanticAnalyses {
	public int cnt[] = new int[17];
	public char ch = 'A';
	public String kw[] = {"Specify", 
			"Note" , 
			"TABLE", 
			"Diagnostic-Features",
			"Associated-Features-Supporting-Diagnosis", 
			"Prevalence" , 
			"Development-and-Course", 
			"Risk-and-Prognostic-Factors", 
			"Culture-Related-Diagnostic-issues", 
			"Gender-Related-Diagnostic-issues" ,  
			"Diagnostic-Markers" , 
			"Suicide-Risk",
			"Functional-Consequences-of",  
			"Differential-Diagnosis" ,  
			"Comorbidity" , 
			"Relationship-to-Other-Classifications"};
	public SemanticAnalyses() {
		// TODO Auto-generated constructor stub
		initMap();
	}
	public void initMap() {
		int tmp = 0;
		for(int i = 0; i < 17; i++) {
			
			cnt[i] = 0;
		}
	}
	public int updateOpCnt(int index) {
		int itg = 0;
		itg = cnt[index];
		itg++;
		cnt[index] = itg;
		return itg;
	} 
	
	public boolean DiagnosticCriteriaItem(char c) {
		if(c == ch) {
			ch = (char)(ch+1);
			return true;
		}else {
			ch = (char)(ch+1);
			return false;
		}
		
	}

}
