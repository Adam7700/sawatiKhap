import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class runThisThing {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        ourGrammarLexer lexer = new ourGrammarLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ourGrammarParser parser = new ourGrammarParser(tokens);

        ParseTree tree = parser.start();
        System.out.println(tree.toStringTree(parser));
    }
}
