// Generated from parserll/SFa.g4 by ANTLR 4.9.2

    package parserll;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SFaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SFaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SFaParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(SFaParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link SFaParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(SFaParser.FContext ctx);
}