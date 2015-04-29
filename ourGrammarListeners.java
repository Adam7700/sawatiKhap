import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;

public class ourGrammarListeners extends ourGrammarBaseListener {
    ourGrammarParser parser;
	ArrayList<String> options = new ArrayList<String>();
	File fout = new File("sawat.sh");
	BufferedWriter gramgram;
	FileOutputStream fos;
	

    public ourGrammarListeners(ourGrammarParser parser){
    	this.parser = parser;
    	try {
			fos = new FileOutputStream(fout);
			gramgram = new BufferedWriter(new OutputStreamWriter(fos));
		} catch (FileNotFoundException e) {
		}
    }

    @Override
    public void enterWorkspace(ourGrammarParser.WorkspaceContext ctx){
    	// switched wmctrl to a different workspace
        	//System.out.print(ctx.children.get(0));
        	try {
    			gramgram.write("wmctrl -s " + ctx.children.get(1)+"\n" );
    			//gramgram.close();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	
    }
    
    @Override 
    public void enterApplication(ourGrammarParser.ApplicationContext ctx) {
    	//System.out.print(ctx.children.get(0));
    	try {
			gramgram.write(ctx.children.get(0).toString());
			//gramgram.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
 
    @Override public void enterAppoption(ourGrammarParser.AppoptionContext ctx) {
    	if(ctx.children.get(0).toString().equals("args")){
    		options.add(0," "+ctx.children.get(2).getText());
    	}else{
    		options.add("\n"+ctx.children.get(2).getText());
    	}
    }
    
    @Override public void exitApplication(ourGrammarParser.ApplicationContext ctx) { 
    	for(String items:options){
    		try {
				gramgram.write(items);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	options.clear();
    }
   
    @Override public void exitWorkspace(ourGrammarParser.WorkspaceContext ctx) { 
    	try {
			gramgram.write("\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
  
    
}
