// Generated from trabalho\limage\limage.g4 by ANTLR 4.7.2
package trabalho.limage;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link limageParser}.
 */
public interface limageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link limageParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(limageParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link limageParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(limageParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link limageParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(limageParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link limageParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(limageParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link limageParser#decl_imagem}.
	 * @param ctx the parse tree
	 */
	void enterDecl_imagem(limageParser.Decl_imagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link limageParser#decl_imagem}.
	 * @param ctx the parse tree
	 */
	void exitDecl_imagem(limageParser.Decl_imagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link limageParser#decl_inteiro}.
	 * @param ctx the parse tree
	 */
	void enterDecl_inteiro(limageParser.Decl_inteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link limageParser#decl_inteiro}.
	 * @param ctx the parse tree
	 */
	void exitDecl_inteiro(limageParser.Decl_inteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link limageParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(limageParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link limageParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(limageParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link limageParser#cmd_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterCmd_aritmetico(limageParser.Cmd_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link limageParser#cmd_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitCmd_aritmetico(limageParser.Cmd_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link limageParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(limageParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link limageParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(limageParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link limageParser#cmdOperacoes}.
	 * @param ctx the parse tree
	 */
	void enterCmdOperacoes(limageParser.CmdOperacoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link limageParser#cmdOperacoes}.
	 * @param ctx the parse tree
	 */
	void exitCmdOperacoes(limageParser.CmdOperacoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link limageParser#cmdMostrar}.
	 * @param ctx the parse tree
	 */
	void enterCmdMostrar(limageParser.CmdMostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link limageParser#cmdMostrar}.
	 * @param ctx the parse tree
	 */
	void exitCmdMostrar(limageParser.CmdMostrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link limageParser#cmdFinal}.
	 * @param ctx the parse tree
	 */
	void enterCmdFinal(limageParser.CmdFinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link limageParser#cmdFinal}.
	 * @param ctx the parse tree
	 */
	void exitCmdFinal(limageParser.CmdFinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link limageParser#cmdSalvar}.
	 * @param ctx the parse tree
	 */
	void enterCmdSalvar(limageParser.CmdSalvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link limageParser#cmdSalvar}.
	 * @param ctx the parse tree
	 */
	void exitCmdSalvar(limageParser.CmdSalvarContext ctx);
}