import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;


public class runThisThing extends ourGrammarBaseListener {
    public static void main(String[] args) throws Exception {
    	
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        ourGrammarLexer lexer = new ourGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ourGrammarParser parser = new ourGrammarParser(tokens);
        
        ParseTree tree = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();
        
        
        ourGrammarListeners thingy = new ourGrammarListeners(parser);
        walker.walk(thingy, tree);
        thingy.gramgram.close();
//
//        try {
//	        Process p = new ProcessBuilder("sh", thingy.filename).start();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println(tree.toStringTree(parser));
    }

    
}
