import java.awt.*;
import java.io.*;
import java.util.ArrayList;

import static java.awt.GraphicsEnvironment.*;

public class ourGrammarListeners extends ourGrammarBaseListener {
    ourGrammarParser parser;
	ArrayList<String> options = new ArrayList<>();
    File fout;
	BufferedWriter gramgram;
	FileOutputStream fos;

    public int xOffset=0, yOffset=0;
    private Rectangle boundaries = getLocalGraphicsEnvironment().getMaximumWindowBounds();
    public int maxWidth = (int) boundaries.getMaxX();
    public int maxHeight = (int) boundaries.getMaxY();

    public int halfWidth = (int) boundaries.getCenterX();
    public int halfHeight = (int) boundaries.getCenterY()- 50;
    public int halfwayHeight = (int) boundaries.getCenterY(); //This is because the windows were too tall, but the midway point was correct

    public String finalView = "";
    public String sleepString = "\nsleep 1\n";
    public String filename;

    /* Constructor */
    public ourGrammarListeners(ourGrammarParser parser){
    	this.parser = parser;
    }

    @Override
    public void enterWorkspace(ourGrammarParser.WorkspaceContext ctx){
    	// switched wmctrl to a different workspace
        	//System.out.print(ctx.children.get(0));
            setViewport(ctx.children.get(1).toString());
    }

    private void setViewport(String workspaceNum) {
        try {
            gramgram.write("###### Start Workspace " + workspaceNum + " ######");
            gramgram.write(sleepString);
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
                    gramgram.write("wmctrl -o "+ maxWidth+",0\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "3":
                try {
                    gramgram.write("wmctrl -o"+ " 0,"+ maxHeight+"\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "4":
                try {
                    gramgram.write("wmctrl -o " + maxWidth + "," + maxHeight + "\n");
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
 
    @Override
    public void enterAppoption(ourGrammarParser.AppoptionContext ctx) {
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
                actions = "wmctrl -r :ACTIVE:  -e 0," + xOffset + "," + yOffset + "," + halfWidth + "," + halfHeight+"\n";
                break;

            case "topright":
                actions = "wmctrl -r :ACTIVE:  -e 0," + (xOffset + halfWidth) + "," + yOffset +"," + halfWidth + "," + halfHeight + "\n";
                break;

            case "bottomright":
                actions = "wmctrl -r :ACTIVE:  -e 0," + (xOffset + halfWidth) + "," + (yOffset+halfwayHeight) +"," + halfWidth + "," + halfHeight + "\n";
                break;

            case "bottomleft":
                actions = "wmctrl -r :ACTIVE:  -e 0," + (xOffset) + "," + (yOffset+halfwayHeight) +"," + halfWidth + "," + halfHeight + "\n";
                break;

            case "top":
                actions = "wmctrl -r :ACTIVE:  -e 0," + xOffset + "," + yOffset +"," + 0 + "," + halfHeight +
                            "\nwmctrl -r :ACTIVE: -b add,maximized_horz" + "\n";
                break;

            case "bottom":
                actions = "wmctrl -r :ACTIVE:  -e 0," + xOffset + "," + (yOffset+halfwayHeight) +"," + 0 + "," + halfHeight +
                            "\nwmctrl -r :ACTIVE: -b add,maximized_horz" + "\n";
                break;
            case "left":
                actions = "wmctrl -r :ACTIVE:  -e 0," + xOffset + "," + yOffset +"," + halfWidth + "," + 0 +
                            "\nwmctrl -r :ACTIVE: -b add,maximized_vert" + "\n";
                break;
            case "right":
                actions = "wmctrl -r :ACTIVE:  -e 0," + (xOffset + halfWidth) + "," + yOffset +"," + halfWidth + "," + 0 +
                            "\nwmctrl -r :ACTIVE: -b add,maximized_vert" + "\n";
                break;
        }
        return actions;
    }


    @Override
    public void exitApplication(ourGrammarParser.ApplicationContext ctx) {
        // Check to see if wmctrl is the first thing. If it is, that means there were no args
    	if(options.get(0).contains("wmctrl")){
            try {
                gramgram.write(" &" + sleepString);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for(String items:options){

    		try {
				gramgram.write(items);
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    	options.clear();
        try {
            gramgram.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void enterOption(ourGrammarParser.OptionContext ctx) {
        if (ctx.ID().getText().equals("templateName")){
            filename = ctx.value().getText();
            fout = new File(filename);
            fout.setExecutable(true);
            try {
                fos = new FileOutputStream(fout);
                gramgram = new BufferedWriter(new OutputStreamWriter(fos));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        if (ctx.ID().getText().equals("view")){
            setFinalView(ctx.value().getText());
        }

    }

    private void setFinalView(String workspace) {
        switch (workspace) {
            case "workspace1":
                finalView = "wmctrl -o 0,0\n";
                break;
            case "workspace2":
                finalView = "wmctrl -o "+ maxWidth+",0\n";
                break;
            case "workspace3":
                finalView = "wmctrl -o"+ " 0,"+ maxHeight+"\n";
                break;
            case "workspace4":
                finalView = "wmctrl -o " + maxWidth + "," + maxHeight + "\n";
                break;
        }
    }

    // Exit start
    // write out the final view


    @Override
    public void exitWorkspace(ourGrammarParser.WorkspaceContext ctx) {
    	try {
			gramgram.write("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @Override
    public void exitStart(ourGrammarParser.StartContext ctx) {
        try {
            gramgram.write("###### Switch to view setting ######");
            gramgram.write(sleepString);
            gramgram.write(finalView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
