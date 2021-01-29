package SyntaxSemanticAna;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import FileWrite.FileWrite;
import lexAnalysis.Lexer;
import lexAnalysis.Token;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("*************************************");
		 File file = new File(System.getProperty("user.dir"));
	     String strParentDirectory = file.getParent();
	     File file2 = new File(strParentDirectory);
	     String rootCurrent = file2.getParent();
//	     System.out.println(System.getProperty("user.dir"));
//	     System.out.println(strParentDirectory);
//	     System.out.println(rootCurrent);
	     String path = rootCurrent + "/测试用例/test.txt";
	     System.out.println(path);
//		String path =  "./src/lexAnalysis/test.txt";
		SyntaxAnalysis syntaxAna=new SyntaxAnalysis(path);
//		
		if(syntaxAna.errSet.size() == 0) {
			System.out.println("没有语法错误，语义错误");
		}else {
			
			System.out.println("有"+syntaxAna.errSet.size()+"个错误提示");
			System.out.println("具体信息请到路径"+path+"下查看");
			
		}
	}

}
