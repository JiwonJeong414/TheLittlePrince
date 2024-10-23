package gen;// Generated from /Users/jiwonjeong/Documents/TheLittlePrince/src/main/java/PlanetaryGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlanetaryGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlanetaryGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlanetaryGrammarParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(PlanetaryGrammarParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlanetaryGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(PlanetaryGrammarParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlanetaryGrammarParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOp(PlanetaryGrammarParser.LogicalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlanetaryGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PlanetaryGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlanetaryGrammarParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(PlanetaryGrammarParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlanetaryGrammarParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(PlanetaryGrammarParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlanetaryGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PlanetaryGrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlanetaryGrammarParser#sortClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortClause(PlanetaryGrammarParser.SortClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlanetaryGrammarParser#sortOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortOrder(PlanetaryGrammarParser.SortOrderContext ctx);
}