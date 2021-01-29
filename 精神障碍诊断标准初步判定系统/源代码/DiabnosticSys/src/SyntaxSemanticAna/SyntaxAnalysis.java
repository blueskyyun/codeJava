package SyntaxSemanticAna;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.UUID;
import java.util.Vector;

import lexAnalysis.*;

import FileWrite.*;
public class SyntaxAnalysis {
	
	int index = 0;
	String mntlNm[] = new String[10];
	int cntNm  = 0;
	Vector<Token> lAT;

	Vector<ErrorInfoInSemanticSyntax> errSet = new Vector<ErrorInfoInSemanticSyntax>();
	ErrorInfoInSemanticSyntax err = null;
	SemanticAnalyses semAna = new SemanticAnalyses();
	public String sourcefPath;
	Lexer myLexer = null;
	
	
	public SyntaxAnalysis(String path) {
		// TODO Auto-generated constructor stub
		sourcefPath = path;
		File file = new File(path);
		if(file.isFile()) {
			myLexer =  new Lexer(path);
			synAndSemanticAna();
		}else {
			errSet.add(new ErrorInfoInSemanticSyntax("源文件的路径是一个目录文件"));
		}
		FileWriter writer = null;
		try {
			writer = new FileWriter(file, true);
			writer.write("\r\n");
			writer.write("\r\n");
			writer.write("\r\n");
			writer.write("**********************以下是错误信息***********************\r\n");
			for(int i = 0; i<errSet.size(); i++) {
				writer.write(errSet.get(i).errorInfo);
			}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	
	
	
    //FileWrite fw= new FileWrite();
	
	
			
	private int synAndSemanticAna() {
		
		myLexer.analyse();
		lAT = myLexer.getResult();
		
		for(int i = 0; i < myLexer.errorList.size(); i++) {
			errSet.add(myLexer.errorList.get(i));
		}
		//将符号表生成文件
//		FileWrite.path = System.getProperty("user.dir")+"\\";
//		System.getProperty("user.dir");
		
		File file = new File(sourcefPath);
		FileWrite.path = file.getParent()+"\\";
		UUID uuid = UUID.randomUUID();
		String fileNm = uuid+"symboleTable";
		FileWrite.createFile(fileNm);	
		
		for(int i = 0; i<lAT.size(); i++) {
			try {
				FileWrite.writeFileContent(lAT.get(i).toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(m_main() == -2) {
			return -2;
		}else {
			return options();
		}
	}
	public int m_main() {
		int isSearch = 0;
		if(lAT.size() >= index+1) {
//			
			if(lAT.get(index).classifiedCode == 19) {
				isSearch =m_name();
				if(isSearch == -1) {
					generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "<Main>  ->  <Name>< Diagnostic Criteria >< Diagnostic Features >", lAT.get(index).nm+"<Name>未定义的内容");
				}
			}else {
				isSearch = -1;
				generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "<Main>  ->  <Name>< Diagnostic Criteria >< Diagnostic Features >", "<Name>未声明");
				
			}
			boolean isFind =  false;
			if(isSearch == -1) {
				for(int i = 0; i<lAT.size(); i++) {
					if(lAT.get(i).classifiedCode >= 1 && lAT.get(i).classifiedCode <= 19) {
						index = i;
						isFind = true;
						break;
					}
				}
				if(isFind) {
					if(m_DiagnosticCriteria() == -2) {
						return -2;
					}
				}else {
					
					generateError(ErrorType.SyntaxError,lAT.get(index).lineNo,"<Main>  ->  <Name>< Diagnostic Criteria >< Diagnostic Features >", lAT.get(index).nm+"无需要分析的语法单位");
					return -2;
					
				}
				
			}else {
				if(m_DiagnosticCriteria()==-2) {
					return -2;
				}
			}
			
			if(m_DiagnosticFeatures()==-2) {
				return -2;
			}
			
		}else {
			
			generateError(ErrorType.SyntaxError,lAT.get(index-1).lineNo, "<Main>  ->  <Name>< Diagnostic Criteria >< Diagnostic Features >", "文件为空，没有构成产生式的语法单位");
			
			return -2;
		}
		return 0;
		
	}
	public int m_name() {
		if(lAT.get(index).endAddr > index) {
			for(int i = 0; i < (lAT.get(index).endAddr-index);i++) {
				int idx = i+index+1;
				mntlNm[i] = lAT.get(idx).nm;
				cntNm++;
			}
			index = lAT.get(index).endAddr+1;
			
			return 0;
		}else {
			return -1;
		}
	}
	public int m_DiagnosticCriteria() {
		boolean isHasCap = false;
		if(lAT.size() >= index+1) {
			if(lAT.get(index).classifiedCode == 1) {
				index++;
				if(lAT.size() >= index+1) {
					for(int i = index; i < lAT.size(); i++) {
						if(lAT.get(i).classifiedCode >= 1 && lAT.get(i).classifiedCode <= 19) {
							index = i;
							isHasCap = true;
							generateError(ErrorType.SyntaxError,lAT.get(index-1).lineNo, "< Diagnostic Criteria > -> Diagnostic-Criteria<Text> < Diagnostic Criteria item ><A>", "没有< Diagnostic Criteria item >");
							
							return -1;
							
						}
						if(lAT.get(i).classifiedCode == 20) {
							if(isCapital(lAT.get(i).nm)) {
								isHasCap = true;
								index = i;
								if(lAT.size() >= i+2) {
									if(!(lAT.get(i+1).classifiedCode == 21 && lAT.get(i+1).nm.charAt(0) == 46)) {
											
											generateError(ErrorType.Warning,lAT.get(index-1).lineNo, "< Diagnostic Criteria item > -> <letter>.<Text>", "符号表里能构成此产生式的单词里没有“.” ");
											index++;
									}
									
									if(lAT.get(i).endAddr > i+1) {
										index = lAT.get(i).endAddr+1;
										
									}else {
										generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "< Diagnostic Criteria item > -> <letter>.<Text>", "诊断标准项"+lAT.get(i).nm+"没有内容");
										index++;
									}
									
									if(A() != -2) {
										return 0;
									}else {
										return -2;
									}
									
								}else {
									generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "< Diagnostic Criteria > -> Diagnostic-Criteria<Text> < Diagnostic Criteria item ><A>", "诊断标准项"+lAT.get(i).nm+"没有内容，符号表后也没有内容");
									return -2;
								}
								
							}
							
						}
						
						
					}
					///
					
						generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "< Diagnostic Criteria > -> Diagnostic-Criteria<Text> < Diagnostic Criteria item ><A>", "没有诊断标准项，文件后也没有需要分析的语法单位");
						return -2;
					
				}else {
					generateError(ErrorType.SyntaxError,lAT.get(index).lineNo,"< Diagnostic Criteria item > -> <letter>.<Text>", "诊断标准没有内容，到达符号表末尾");
					return -2;
				}
			}else {
				generateError(ErrorType.SyntaxError,lAT.get(index).lineNo,"< Diagnostic Criteria > -> Diagnostic-Criteria<Text> < Diagnostic Criteria item ><A>", "没有关键词Diagnostic-Criteria");
				return -1;
				
			}
			
		}else {
			generateError(ErrorType.SyntaxError,lAT.get(index-1).lineNo, "<Main>  ->  <Name>< Diagnostic Criteria >< Diagnostic Features >", "没有构成<Diagnostic Criteria>的语法单位，符号表已到达末尾");
			return -2;
		}
		
		
	}
	public int m_DiagnosticFeatures() {
		if(lAT.size() >= index +1) {
			if(lAT.get(index).classifiedCode == 6) {
				if(lAT.get(index).endAddr > index) {
					index = lAT.get(index).endAddr+1;
					return 0;
				}else {
					generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "< Diagnostic Features > -> Diagnostic-Features<Text>", "< Diagnostic Features >没有内容");
					index++;
				    return -1;
				}
			}else {
				if(lAT.get(index).classifiedCode >= 1 && lAT.get(index).classifiedCode <= 19 && lAT.get(index).classifiedCode != 6) {
					generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "< Diagnostic Features > -> Diagnostic-Features<Text>", "没有关键词Diagnostic-Features,没有构成< Diagnostic Features >的语法单位");
				    return -1;
				}else {
					if(seekNextAnaPnt() != 1) {
						return -2;
					}else {
						generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "<Main>  ->  <Name>< Diagnostic Criteria >< Diagnostic Features >", "没有构成< Diagnostic Features >的语法单位,填符号表错误：结束地址");
						return -1; 
					}
				}
				
			}
		}else {
			generateError(ErrorType.SyntaxError,lAT.get(index-1).lineNo, "< Diagnostic Features > -> Diagnostic-Features<Text>", "符号表已到达末尾,异常终止语法分析");
		    return -2;
		}
		
	}
	public int m_DiagnosticCriteriaItem () {
		index++;
		if(lAT.size() >= index+1) {
			if(!(lAT.get(index).classifiedCode == 21 && lAT.get(index).nm.charAt(0) == 46)) {
				generateError(ErrorType.Warning,lAT.get(index).lineNo, "< Diagnostic Criteria item > -> <letter>.<Text>", "符号表里能构成此产生式的单词里没有“.” ");
			}
			if(lAT.get(index-1).endAddr > index) {
				index = lAT.get(index-1).endAddr+1;
			}else {
				generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "< Diagnostic Criteria item > -> <letter>.<Text>", "诊断标准项"+lAT.get(index-1).nm+"没有内容");	
				index++;
			}
			return 0;
		}else {
			generateError(ErrorType.SyntaxError,lAT.get(index-1).lineNo, "< Diagnostic Criteria item > -> <letter>.<Text>", "符号表已到达末尾,异常终止语法分析");
		    return -2;
		}
		
	}
	////////////////////////////////////////////////
	public int A() {
		
		if(lAT.size() >= index+1) {
			if(lAT.get(index).classifiedCode >= 1 && lAT.get(index).classifiedCode <= 19) {
				return 0;
			}else if(lAT.get(index).classifiedCode == 20) {
				if(isCapital(lAT.get(index).nm)) {
					
					if(m_DiagnosticCriteriaItem () == -2) {
						generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "<A> -> < Diagnostic Criteria item ><A>|ε", "没有下一项诊断标准，符号表已到达末尾");
						return -2;
					}
					
					return A();
						
					}else {
						generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "<A> -> < Diagnostic Criteria item ><A>|ε","符号表填表错误:结束地址"+lAT.get(index).endAddr);
						index++;
						if(lAT.size() >= index+1) {
							boolean isKw = false;
							for(int i = index; i < lAT.size(); i++) {
								if(lAT.get(i).classifiedCode == 20 && isCapital(lAT.get(i).nm)) {
									isKw = true;
									index = i;
									if(m_DiagnosticCriteriaItem () == -2) {
										generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "<A> -> < Diagnostic Criteria item ><A>|ε", "没有下一项诊断标准，符号表已到达末尾");
										return -2;
									}
									
									return A();	
									
								}
								if(lAT.get(i).classifiedCode >= 1 && lAT.get(i).classifiedCode <= 19) {
									index = i;
									isKw = true;
									break;
								}
							}
							if(isKw) {
								generateError(ErrorType.SyntaxError,lAT.get(index-1).lineNo, "<A> -> < Diagnostic Criteria item ><A>|ε", "符号表位置填错，诊断标准项"+lAT.get(index-1).nm+"的结束位置填错:"+lAT.get(index-1).endAddr);
								return -1;
							}else {
								generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "<Diagnostic Criteria of Mental Disorders >  ->  <Name>< Diagnostic Criteria >< Diagnostic Features ><Options>", "< Diagnostic Criteria >后无内容，语法结构不完整");
								return -2;
							}
						}else {
							generateError(ErrorType.SyntaxError,lAT.get(index-1).lineNo, "<A> -> < Diagnostic Criteria item ><A>|ε", "符号表已到达末尾,语法结构不完整");
						    return -2;
						}
						
						
					}
			}else {
				generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "< Diagnostic Criteria > -> Diagnostic-Criteria<Text> < Diagnostic Criteria item ><A>","符号表填表错误:结束地址"+lAT.get(index).endAddr);
				if(seekNextAnaPnt() == 1) {
					return -1;
				}else {
					return -2;
				}
				
			}
			
		}else {
			generateError(ErrorType.SyntaxError,lAT.get(index-1).lineNo, "<Main>  ->  <Name>< Diagnostic Criteria >< Diagnostic Features >", "语法结构不完整，没有< Diagnostic Features >，符号表已到达末尾");
			return -2;
		}
	}
	
	public int options() {
		int tmp = 0;
		if(lAT.size() >= index+1) {
			for(; index < lAT.size(); index++) {
				tmp = lAT.get(index).classifiedCode;
				if(tmp >= 3 && tmp <= 19) {
					if(semAna.updateOpCnt(tmp-3) > 1) {
						generateError(ErrorType.SemanticError,lAT.get(index).lineNo, semAna.kw[tmp-3], lAT.get(index).nm+"这部分重复");
					}
					if(tmp == 15) {
						functionalConsequences();
					}else {
						m_optns(tmp);
					}
				}
				
			}
			return 0;
		}else {
			generateError(ErrorType.Warning,lAT.get(index-1).lineNo, "<Options>", "已到达符号表末尾,没有<Options>的内容");
		    return -2;
		}
		
		
	}
	public int functionalConsequences() {
		int in = index +1;
		for(int i = 0; i < cntNm; i++) {
			if(mntlNm[i] != lAT.get(in).nm) {
				generateError(ErrorType.SyntaxError,lAT.get(i).lineNo, "< Functional Consequences> -> Functional-Consequences-of <Name><Text>",  "精神障碍名不匹配："+mntlNm[i]+ "||错误：" + lAT.get(in).nm);
				break;
			}
		}
		
		if(lAT.get(index).endAddr > index) {
			index = lAT.get(index).endAddr;
			return 0;
		}else {
			generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "< Functional Consequences> -> Functional-Consequences-of <Name><Text>",  "< Functional Consequences>没有内容");
			
		    return -1;
		}
	}
	public int m_optns(int clsfCd) {
		
			
				if(lAT.get(index).endAddr > index) {
					index = lAT.get(index).endAddr;
					return 0;
				}else {
					generateError(ErrorType.SyntaxError,lAT.get(index).lineNo, "<Options>", semAna.kw[clsfCd-3]+ "没有内容");
				    return -1;
				}
			
		
		
	}
	public boolean isCapital(String str) {
		if(str.length() != 1) {
			return false;
		}
		char ch = ' ';
		
		ch = str.charAt(0);
		boolean isUp = false;
		if(Character.isLetter(ch)) {
			isUp = Character.isUpperCase(ch);
			if(isUp) {
				if(!semAna.DiagnosticCriteriaItem(ch)) {
					generateError(ErrorType.SemanticError,lAT.get(index).lineNo,"< Diagnostic Criteria item > -> <letter>.<Text>", "诊断标准项标号错误"+ch+"应为："+semAna.ch);
				}
				return true;
			}
			return false;
		}else {
			return false;
		}
		
	}
	public void generateError(ErrorType et, int lno, String errPro, String errPart) {
		err = new ErrorInfoInSemanticSyntax(et);
		errPart += ","+ lAT.get(index-1).nm;
		err.setErrorInfo(lno,errPro,errPart);
		errSet.add(err);
		err = null;
		
	}
	
	public int seekNextAnaPnt() {
		index++;
		if(lAT.size() >= index+1) {
			boolean isKw = false;
			for(int i = index; i < lAT.size(); i++) {
				if(lAT.get(i).classifiedCode >= 1 && lAT.get(i).classifiedCode <= 19) {
					index = i;
					isKw = true;
					break;
				}
			}
			if(isKw) {
				return 1;
			}else {
				return -2;
			}
		}else {
			return 1000;
		}
	}
	
	
	
}

