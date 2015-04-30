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
            String actions;
            String dimensions = ctx.children.get(2).getText().toLowerCase();
            actions = getWmctrlActions(dimensions);
            options.add(actions);
    	}
		else
		{}
    }

    private String getWmctrlActions(String dimensions) {
        String actions = "";
        switch (dimensions){
            case "fullscreen":
                actions = "\nwmctrl -r :ACTIVE: -b add,maximized_horz,maximized_vert";
                break;
            case "topleft":
                actions = "\nwmctrl -r :ACTIVE:  -e 0,0,0," + boundaries.getCenterX() + ",560";
                break;
            case "topright":
                actions = "";
                break;
            case "bottomright":
                actions = "";
                break;
            case "bottomleft":
                actions = "wmctrl -r :ACTIVE:  -e 0,0,612,960,560";
                break;
            case "top":
                actions = "";
                break;
            case "bottom":
                actions = "";
                break;
            case "left":
                actions = "";
                break;
            case "right":
                actions = "";
                break;
        }
        return actions;
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
        if(options.size() == 0){ // TODO: this was supposed to help if there were no args, but it's flawed...
            try {
                gramgram.write(" &\n");
            } catch (IOException e) {
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
