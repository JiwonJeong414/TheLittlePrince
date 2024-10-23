package gen;// Generated from /Users/jiwonjeong/Documents/TheLittlePrince/src/main/java/PlanetaryGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlanetaryGrammarParser}.
 */
public interface PlanetaryGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlanetaryGrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(PlanetaryGrammarParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlanetaryGrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(PlanetaryGrammarParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlanetaryGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(PlanetaryGrammarParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlanetaryGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(PlanetaryGrammarParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlanetaryGrammarParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOp(PlanetaryGrammarParser.LogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlanetaryGrammarParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOp(PlanetaryGrammarParser.LogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlanetaryGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PlanetaryGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlanetaryGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PlanetaryGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlanetaryGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(PlanetaryGrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlanetaryGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(PlanetaryGrammarParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlanetaryGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(PlanetaryGrammarParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlanetaryGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(PlanetaryGrammarParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlanetaryGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PlanetaryGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlanetaryGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PlanetaryGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlanetaryGrammarParser#sortClause}.
	 * @param ctx the parse tree
	 */
	void enterSortClause(PlanetaryGrammarParser.SortClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlanetaryGrammarParser#sortClause}.
	 * @param ctx the parse tree
	 */
	void exitSortClause(PlanetaryGrammarParser.SortClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlanetaryGrammarParser#sortOrder}.
	 * @param ctx the parse tree
	 */
	void enterSortOrder(PlanetaryGrammarParser.SortOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlanetaryGrammarParser#sortOrder}.
	 * @param ctx the parse tree
	 */
	void exitSortOrder(PlanetaryGrammarParser.SortOrderContext ctx);
}