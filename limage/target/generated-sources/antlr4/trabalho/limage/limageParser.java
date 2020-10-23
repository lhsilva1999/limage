// Generated from trabalho\limage\limage.g4 by ANTLR 4.7.2
package trabalho.limage;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class limageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, PALAVRA_CHAVE=15, NUM_INT=16, 
		IDENT=17, COMENTARIO=18, COMENTARIOERRADO1=19, WS=20, OP_ARIT=21, VIRGULA=22, 
		ABREPAR=23, FECHAPAR=24, ERROR=25;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_imagem = 2, RULE_decl_inteiro = 3, 
		RULE_cmd = 4, RULE_cmd_aritmetico = 5, RULE_cmdLeia = 6, RULE_cmdOperacoes = 7, 
		RULE_cmdMostrar = 8, RULE_cmdFinal = 9, RULE_cmdSalvar = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "decl_imagem", "decl_inteiro", "cmd", "cmd_aritmetico", 
			"cmdLeia", "cmdOperacoes", "cmdMostrar", "cmdFinal", "cmdSalvar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ALG'", "'FIM'", "'imagem'", "':'", "'inteiro'", "'leia'", "'filtroMedia'", 
			"'filtroMediana'", "'adicionarRuido'", "'limiarOtsu'", "'realceBordas'", 
			"'filtroGaussiano'", "'mostrar'", "'salvar'", null, null, null, null, 
			null, null, null, "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "PALAVRA_CHAVE", "NUM_INT", "IDENT", "COMENTARIO", 
			"COMENTARIOERRADO1", "WS", "OP_ARIT", "VIRGULA", "ABREPAR", "FECHAPAR", 
			"ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "limage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	void erro(int linha, String msg) {
	throw new RuntimeException("Linha "+linha+": "+msg);
	}

	public limageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public CmdFinalContext cmdFinal() {
			return getRuleContext(CmdFinalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(limageParser.EOF, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof limageVisitor ) return ((limageVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			declaracoes();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << IDENT))) != 0)) {
				{
				{
				setState(24);
				cmd();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			cmdFinal();
			setState(31);
			match(T__1);
			setState(32);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_imagemContext> decl_imagem() {
			return getRuleContexts(Decl_imagemContext.class);
		}
		public Decl_imagemContext decl_imagem(int i) {
			return getRuleContext(Decl_imagemContext.class,i);
		}
		public List<CmdLeiaContext> cmdLeia() {
			return getRuleContexts(CmdLeiaContext.class);
		}
		public CmdLeiaContext cmdLeia(int i) {
			return getRuleContext(CmdLeiaContext.class,i);
		}
		public List<Decl_inteiroContext> decl_inteiro() {
			return getRuleContexts(Decl_inteiroContext.class);
		}
		public Decl_inteiroContext decl_inteiro(int i) {
			return getRuleContext(Decl_inteiroContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof limageVisitor ) return ((limageVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(34);
					decl_imagem();
					setState(35);
					cmdLeia();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(39); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__4) {
				{
				setState(47);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					{
					setState(41);
					decl_inteiro();
					setState(42);
					cmdLeia();
					}
					}
					break;
				case T__2:
					{
					{
					setState(44);
					decl_imagem();
					setState(45);
					cmdLeia();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_imagemContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(limageParser.IDENT, 0); }
		public Decl_imagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_imagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).enterDecl_imagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).exitDecl_imagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof limageVisitor ) return ((limageVisitor<? extends T>)visitor).visitDecl_imagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_imagemContext decl_imagem() throws RecognitionException {
		Decl_imagemContext _localctx = new Decl_imagemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_imagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__2);
			setState(53);
			match(T__3);
			setState(54);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_inteiroContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(limageParser.IDENT, 0); }
		public Decl_inteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).enterDecl_inteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).exitDecl_inteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof limageVisitor ) return ((limageVisitor<? extends T>)visitor).visitDecl_inteiro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_inteiroContext decl_inteiro() throws RecognitionException {
		Decl_inteiroContext _localctx = new Decl_inteiroContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__4);
			setState(57);
			match(T__3);
			setState(58);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdOperacoesContext cmdOperacoes() {
			return getRuleContext(CmdOperacoesContext.class,0);
		}
		public Cmd_aritmeticoContext cmd_aritmetico() {
			return getRuleContext(Cmd_aritmeticoContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof limageVisitor ) return ((limageVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				cmdOperacoes();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				cmd_aritmetico();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_aritmeticoContext extends ParserRuleContext {
		public Token valor;
		public List<TerminalNode> IDENT() { return getTokens(limageParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(limageParser.IDENT, i);
		}
		public TerminalNode OP_ARIT() { return getToken(limageParser.OP_ARIT, 0); }
		public TerminalNode NUM_INT() { return getToken(limageParser.NUM_INT, 0); }
		public Cmd_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).enterCmd_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).exitCmd_aritmetico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof limageVisitor ) return ((limageVisitor<? extends T>)visitor).visitCmd_aritmetico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_aritmeticoContext cmd_aritmetico() throws RecognitionException {
		Cmd_aritmeticoContext _localctx = new Cmd_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IDENT);
			setState(65);
			match(OP_ARIT);
			setState(66);
			((Cmd_aritmeticoContext)_localctx).valor = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NUM_INT || _la==IDENT) ) {
				((Cmd_aritmeticoContext)_localctx).valor = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdLeiaContext extends ParserRuleContext {
		public TerminalNode ABREPAR() { return getToken(limageParser.ABREPAR, 0); }
		public TerminalNode IDENT() { return getToken(limageParser.IDENT, 0); }
		public TerminalNode FECHAPAR() { return getToken(limageParser.FECHAPAR, 0); }
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).enterCmdLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).exitCmdLeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof limageVisitor ) return ((limageVisitor<? extends T>)visitor).visitCmdLeia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdLeia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__5);
			setState(69);
			match(ABREPAR);
			setState(70);
			match(IDENT);
			setState(71);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdOperacoesContext extends ParserRuleContext {
		public Token filtro;
		public Token param2;
		public Token operacao;
		public Token gaussiano;
		public Token p2;
		public Token p3;
		public TerminalNode ABREPAR() { return getToken(limageParser.ABREPAR, 0); }
		public List<TerminalNode> IDENT() { return getTokens(limageParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(limageParser.IDENT, i);
		}
		public TerminalNode FECHAPAR() { return getToken(limageParser.FECHAPAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(limageParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(limageParser.VIRGULA, i);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(limageParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(limageParser.NUM_INT, i);
		}
		public CmdOperacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdOperacoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).enterCmdOperacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).exitCmdOperacoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof limageVisitor ) return ((limageVisitor<? extends T>)visitor).visitCmdOperacoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdOperacoesContext cmdOperacoes() throws RecognitionException {
		CmdOperacoesContext _localctx = new CmdOperacoesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdOperacoes);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				((CmdOperacoesContext)_localctx).filtro = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
					((CmdOperacoesContext)_localctx).filtro = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(74);
				match(ABREPAR);
				setState(75);
				match(IDENT);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRGULA) {
					{
					setState(76);
					match(VIRGULA);
					setState(77);
					((CmdOperacoesContext)_localctx).param2 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==NUM_INT || _la==IDENT) ) {
						((CmdOperacoesContext)_localctx).param2 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(80);
				match(FECHAPAR);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				((CmdOperacoesContext)_localctx).operacao = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
					((CmdOperacoesContext)_localctx).operacao = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(82);
				match(ABREPAR);
				setState(83);
				match(IDENT);
				setState(84);
				match(FECHAPAR);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				((CmdOperacoesContext)_localctx).gaussiano = match(T__11);
				setState(86);
				match(ABREPAR);
				setState(87);
				match(IDENT);
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(88);
					match(VIRGULA);
					setState(89);
					((CmdOperacoesContext)_localctx).p2 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==NUM_INT || _la==IDENT) ) {
						((CmdOperacoesContext)_localctx).p2 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRGULA) {
					{
					setState(92);
					match(VIRGULA);
					setState(93);
					((CmdOperacoesContext)_localctx).p3 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==NUM_INT || _la==IDENT) ) {
						((CmdOperacoesContext)_localctx).p3 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(96);
				match(FECHAPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdMostrarContext extends ParserRuleContext {
		public TerminalNode ABREPAR() { return getToken(limageParser.ABREPAR, 0); }
		public TerminalNode IDENT() { return getToken(limageParser.IDENT, 0); }
		public TerminalNode FECHAPAR() { return getToken(limageParser.FECHAPAR, 0); }
		public CmdMostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdMostrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).enterCmdMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).exitCmdMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof limageVisitor ) return ((limageVisitor<? extends T>)visitor).visitCmdMostrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdMostrarContext cmdMostrar() throws RecognitionException {
		CmdMostrarContext _localctx = new CmdMostrarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdMostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__12);
			setState(100);
			match(ABREPAR);
			setState(101);
			match(IDENT);
			setState(102);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdFinalContext extends ParserRuleContext {
		public CmdSalvarContext cmdSalvar() {
			return getRuleContext(CmdSalvarContext.class,0);
		}
		public CmdMostrarContext cmdMostrar() {
			return getRuleContext(CmdMostrarContext.class,0);
		}
		public CmdFinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).enterCmdFinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).exitCmdFinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof limageVisitor ) return ((limageVisitor<? extends T>)visitor).visitCmdFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdFinalContext cmdFinal() throws RecognitionException {
		CmdFinalContext _localctx = new CmdFinalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdFinal);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				cmdSalvar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				cmdMostrar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				cmdSalvar();
				setState(107);
				cmdMostrar();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSalvarContext extends ParserRuleContext {
		public TerminalNode ABREPAR() { return getToken(limageParser.ABREPAR, 0); }
		public TerminalNode IDENT() { return getToken(limageParser.IDENT, 0); }
		public TerminalNode FECHAPAR() { return getToken(limageParser.FECHAPAR, 0); }
		public CmdSalvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSalvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).enterCmdSalvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof limageListener ) ((limageListener)listener).exitCmdSalvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof limageVisitor ) return ((limageVisitor<? extends T>)visitor).visitCmdSalvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSalvarContext cmdSalvar() throws RecognitionException {
		CmdSalvarContext _localctx = new CmdSalvarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdSalvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__13);
			setState(112);
			match(ABREPAR);
			setState(113);
			match(IDENT);
			setState(114);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33w\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\3\3\3\3\3\3\3\3\7\3\62\n\3\f\3\16\3\65"+
		"\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6A\n\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tQ\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t]\n\t\3\t\3\t\5\ta\n\t\3\t\5\td\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13p\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\5\3\2\22\23\3\2\t\n\3\2\13\r\2w\2"+
		"\30\3\2\2\2\4\'\3\2\2\2\6\66\3\2\2\2\b:\3\2\2\2\n@\3\2\2\2\fB\3\2\2\2"+
		"\16F\3\2\2\2\20c\3\2\2\2\22e\3\2\2\2\24o\3\2\2\2\26q\3\2\2\2\30\31\7\3"+
		"\2\2\31\35\5\4\3\2\32\34\5\n\6\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2"+
		"\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\5\24\13\2!\"\7\4\2\2\""+
		"#\7\2\2\3#\3\3\2\2\2$%\5\6\4\2%&\5\16\b\2&(\3\2\2\2\'$\3\2\2\2()\3\2\2"+
		"\2)\'\3\2\2\2)*\3\2\2\2*\63\3\2\2\2+,\5\b\5\2,-\5\16\b\2-\62\3\2\2\2."+
		"/\5\6\4\2/\60\5\16\b\2\60\62\3\2\2\2\61+\3\2\2\2\61.\3\2\2\2\62\65\3\2"+
		"\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65\63\3\2\2\2\66\67\7\5"+
		"\2\2\678\7\6\2\289\7\23\2\29\7\3\2\2\2:;\7\7\2\2;<\7\6\2\2<=\7\23\2\2"+
		"=\t\3\2\2\2>A\5\20\t\2?A\5\f\7\2@>\3\2\2\2@?\3\2\2\2A\13\3\2\2\2BC\7\23"+
		"\2\2CD\7\27\2\2DE\t\2\2\2E\r\3\2\2\2FG\7\b\2\2GH\7\31\2\2HI\7\23\2\2I"+
		"J\7\32\2\2J\17\3\2\2\2KL\t\3\2\2LM\7\31\2\2MP\7\23\2\2NO\7\30\2\2OQ\t"+
		"\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2Rd\7\32\2\2ST\t\4\2\2TU\7\31\2\2U"+
		"V\7\23\2\2Vd\7\32\2\2WX\7\16\2\2XY\7\31\2\2Y\\\7\23\2\2Z[\7\30\2\2[]\t"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^_\7\30\2\2_a\t\2\2\2`^\3\2\2\2"+
		"`a\3\2\2\2ab\3\2\2\2bd\7\32\2\2cK\3\2\2\2cS\3\2\2\2cW\3\2\2\2d\21\3\2"+
		"\2\2ef\7\17\2\2fg\7\31\2\2gh\7\23\2\2hi\7\32\2\2i\23\3\2\2\2jp\5\26\f"+
		"\2kp\5\22\n\2lm\5\26\f\2mn\5\22\n\2np\3\2\2\2oj\3\2\2\2ok\3\2\2\2ol\3"+
		"\2\2\2p\25\3\2\2\2qr\7\20\2\2rs\7\31\2\2st\7\23\2\2tu\7\32\2\2u\27\3\2"+
		"\2\2\f\35)\61\63@P\\`co";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}