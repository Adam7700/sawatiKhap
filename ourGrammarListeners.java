import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;

import static java.awt.GraphicsEnvironment.*;

public class ourGrammarListeners extends ourGrammarBaseListener {
    ourGrammarParser parser;
	ArrayList<String> options = new ArrayList<String>();
	File fout = new File("sawat.sh");
	BufferedWriter gramgram;
	FileOutputStream fos;
    public int height, width;
    public ArrayList<Integer> offsets = new ArrayList<Integer>();
    private Rectangle boundaries = getLocalGraphicsEnvironment().getMaximumWindowBounds();

    public ourGrammarListeners(ourGrammarParser parser){
    	this.parser = parser;
    	try {
			fos = new FileOutputStream(fout);
			gramgram = new BufferedWriter(new OutputStreamWriter(fos));
		} catch (FileNotFoundException e) {
		}
        getWorkspaceBoundaries();
    }

    private void getWorkspaceBoundaries() {
        int screenWidth = (int) boundaries.getMaxX();
        int screenHeight = (int) boundaries.getMaxY();
        height = (int) boundaries.getHeight();
        width = (int) boundaries.getWidth();
        System.out.println(height);
        System.out.println(width);
        System.out.println(boundaries.getCenterX());
        System.out.println(boundaries.getCenterY());


    }

    @Override
    public void enterWorkspace(ourGrammarParser.WorkspaceContext ctx){
    	// switched wmctrl to a different workspace
        	//System.out.print(ctx.children.get(0));
        	try {
    			gramgram.write("\nworkspace " + ctx.children.get(1)+"\n" );
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
    	if(ctx.children.get(0).toString().equals("args"))
		{
    		options.add(0, " " + ctx.children.get(2).getText() + " &");
    	}
		else if(ctx.children.get(0).toString().equals("snap"))
		{
            String dimensions = ctx.children.get(2).getText();
            if(dimensions.equals("fullscreen")){
                // figure out what the ending should be
                dimensions = "20,20,200,200 ";
            }
            options.add("\n" + "wmctrl -r :ACTIVE: -e 0," + dimensions);
    	}
		else
		{
            return;
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
