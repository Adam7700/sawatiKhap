import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;

public class ourGrammarListeners extends ourGrammarBaseListener {
    ourGrammarParser parser;
	List<String> options = new ArrayList<String>();
	PrintWriter writer = new PrintWriter("sawat.sh", "utf-8");

    public ourGrammarListeners(ourGrammarParser parser){
	this.parser = parser;
    }

    @Override
    public void enterWorkspace(ourGrammarParser.WorkspaceContext ctx){
    	// switched wmctrl to a different workspace
    	System.out.println("wmctrl -s " + ctx.children.get(1) );
    }
    
    @Override 
    public void enterApplication(ourGrammarParser.ApplicationContext ctx) {
    	System.out.print(ctx.children.get(0));
    	
    }
    
    @Override public void enterAppoption(ourGrammarParser.AppoptionContext ctx) {
    	if(ctx.children.get(0).toString().equals("args")){
    		options.add(0,ctx.children.get(2).getText() + "\n");
    	}else{
    		options.add(ctx.children.get(2).getText() + "\n");
    	}
    }
    
    @Override public void exitApplication(ourGrammarParser.ApplicationContext ctx) { 
    	for(String items:options){
    		System.out.print(items);
    	}
    	options.clear();
    }
    
}
