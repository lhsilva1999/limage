// Generated from trabalho\limage\limage.g4 by ANTLR 4.7.2
package trabalho.limage;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link limageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface limageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link limageParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(limageParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link limageParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(limageParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link limageParser#decl_imagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_imagem(limageParser.Decl_imagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link limageParser#decl_inteiro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_inteiro(limageParser.Decl_inteiroContext ctx);
	/**
	 * Visit a parse tree produced by {@link limageParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(limageParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link limageParser#cmd_aritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_aritmetico(limageParser.Cmd_aritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link limageParser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(limageParser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link limageParser#cmdOperacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdOperacoes(limageParser.CmdOperacoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link limageParser#cmdMostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdMostrar(limageParser.CmdMostrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link limageParser#cmdFinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFinal(limageParser.CmdFinalContext ctx);
	/**
	 * Visit a parse tree produced by {@link limageParser#cmdSalvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSalvar(limageParser.CmdSalvarContext ctx);
}