import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import static java.awt.GraphicsEnvironment.*;

public class ourGrammarListeners extends ourGrammarBaseListener {
    ourGrammarParser parser;
	ArrayList<String> options = new ArrayList<String>();
	File fout = new File("sawat.sh");
	BufferedWriter gramgram;
	FileOutputStream fos;
    public int height, width, xOffset=0, yOffset=0;
    private Rectangle boundaries = getLocalGraphicsEnvironment().getMaximumWindowBounds();
    public String sleepString = "\nsleep 1\n";


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
            setViewport(ctx.children.get(1).toString());
        	/*try {
    			gramgram.write("\nworkspace " + ctx.children.get(1)+"\n" );
    			//gramgram.close();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}*/
    	
    }

    private void setViewport(String workspaceNum) {
        try {
            gramgram.write("###### Start Workspace " + workspaceNum + " ######\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (workspaceNum) {
            case "1":
                try {
                    gramgram.write("wmctrl -o 0,0\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "2":
                try {
                    gramgram.write("wmctrl -o "+ (int) boundaries.getMaxX()+",0\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "3":
                try {
                    gramgram.write("wmctrl -o"+ " 0,"+ (int)boundaries.getMaxY()+"\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "4":
                try {
                    gramgram.write("wmctrl -o " + boundaries.getMaxX() + "," + boundaries.getMaxY() + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    @Override 
    public void enterApplication(ourGrammarParser.ApplicationContext ctx) {
    	//System.out.print(ctx.children.get(0));
    	try {
			gramgram.write("\n###### Start Application ######\n");
			gramgram.write(ctx.children.get(0).toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
    }
 
    @Override public void enterAppoption(ourGrammarParser.AppoptionContext ctx) {
    	if(ctx.children.get(0).toString().equals("args"))
		{
    		options.add(0, " " + ctx.children.get(2).getText() + " &" + sleepString);
    	}
		else if(ctx.children.get(0).toString().equals("snap"))
		{
            String actions;
            String dimensions = ctx.children.get(2).getText().toLowerCase();
            actions = getWmctrlActions(dimensions);
            options.add(actions);
    	}
    }

    private String getWmctrlActions(String dimensions) {
        String actions = "";
        switch (dimensions){
            case "fullscreen":
                actions = "wmctrl -r :ACTIVE: -b add,maximized_horz,maximized_vert";
                break;

            case "topleft":
                actions = "wmctrl -r :ACTIVE:  -e 0," + xOffset + "," + yOffset + "," + (int) boundaries.getCenterX() + "," + (int) boundaries.getCenterY()+"\n";
                break;

            case "topright":
                actions = "wmctrl -r :ACTIVE:  -e 0," + (xOffset + (int) boundaries.getCenterX()) + "," + yOffset +"," + (int) boundaries.getCenterX() + "," + (int) boundaries.getCenterY() + "\n";
                break;

            case "bottomright":
                actions = "wmctrl -r :ACTIVE:  -e 0," + (xOffset + (int) boundaries.getCenterX()) + "," + (yOffset+(int) boundaries.getCenterY()) +"," + (int) boundaries.getCenterX() + "," + (int) boundaries.getCenterY() + "\n";
                break;

            case "bottomleft":
                actions = "wmctrl -r :ACTIVE:  -e 0," + (xOffset) + "," + (yOffset+(int) boundaries.getCenterY()) +"," + (int) boundaries.getCenterX() + "," + (int) boundaries.getCenterY() + "\n";
                break;

            case "top":
                actions = "wmctrl -r :ACTIVE:  -e 0," + xOffset + "," + yOffset +"," + 0 + "," + (int) boundaries.getCenterY() +
                            "\nwmctrl -r :ACTIVE: -b add,maximized_horz" + "\n";
                break;

            case "bottom":
                actions = "wmctrl -r :ACTIVE:  -e 0," + xOffset + "," + (yOffset+(int) boundaries.getCenterY()) +"," + 0 + "," + (int) boundaries.getCenterY() +
                            "\nwmctrl -r :ACTIVE: -b add,maximized_horz" + "\n";
                break;

            case "left":
                actions = "wmctrl -r :ACTIVE:  -e 0," + xOffset + "," + yOffset +"," + (int) boundaries.getCenterX() + "," + 0 +
                            "\nwmctrl -r :ACTIVE: -b add,maximized_vert" + "\n";
                break;

            case "right":
                actions = "wmctrl -r :ACTIVE:  -e 0," + (xOffset + (int) boundaries.getCenterX()) + "," + yOffset +"," + (int) boundaries.getCenterX() + "," + 0 +
                            "wmctrl -r :ACTIVE: -b add,maximized_vert" + "\n";
                break;
        }
        return actions;
    }


    @Override public void exitApplication(ourGrammarParser.ApplicationContext ctx) {
    	if(options.get(0).contains("wmctrl")){
            try {
                gramgram.write(" &" + sleepString);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        for(String items:options){

    		try {
				gramgram.write(items);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	options.clear();
        try {
            gramgram.write("\n");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

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
