package SyntaxSemanticAna;

public	enum ErrorType{
	Warning("Warning",0),LexError("LexError", 1), SyntaxError("SyntaxError",2), SemanticError("SemanticError",3);
	
	 private String name;
    private int value;
        
   private ErrorType(String name,int value){
       this.name=name;
       this.value=value;
   }
    
   public String getName(){
       return this.name;
   }
    
   public int getValue(){
       return this.value;
   }
}