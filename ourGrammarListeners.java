import org.antlr.v4.runtime.*;

public class ourGrammarListeners extends ourGrammarBaseListener {
    ourGrammarParser parser;
    int x = 1;

    public ourGrammarListeners(ourGrammarParser parser){
	this.parser = parser;
    }

    @Override
    public void enterWorkspace(ourGrammarParser.WorkspaceContext ctx){
    	System.out.println("wmctrl -s " + x + " " + ctx);
    	x+=1;
    }
    
    
    
}
