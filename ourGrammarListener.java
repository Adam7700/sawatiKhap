// Generated from ourGrammar.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ourGrammarParser}.
 */
public interface ourGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ourGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ourGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ourGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourGrammarParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(ourGrammarParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourGrammarParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(ourGrammarParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourGrammarParser#workspace}.
	 * @param ctx the parse tree
	 */
	void enterWorkspace(ourGrammarParser.WorkspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourGrammarParser#workspace}.
	 * @param ctx the parse tree
	 */
	void exitWorkspace(ourGrammarParser.WorkspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourGrammarParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApplication(ourGrammarParser.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourGrammarParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApplication(ourGrammarParser.ApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourGrammarParser#appoption}.
	 * @param ctx the parse tree
	 */
	void enterAppoption(ourGrammarParser.AppoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourGrammarParser#appoption}.
	 * @param ctx the parse tree
	 */
	void exitAppoption(ourGrammarParser.AppoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ourGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ourGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourGrammarParser#appvalue}.
	 * @param ctx the parse tree
	 */
	void enterAppvalue(ourGrammarParser.AppvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourGrammarParser#appvalue}.
	 * @param ctx the parse tree
	 */
	void exitAppvalue(ourGrammarParser.AppvalueContext ctx);
}