// Generated from trabalho\limage\limage.g4 by ANTLR 4.7.2
package trabalho.limage;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class limageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, PALAVRA_CHAVE=12, NUM_INT=13, IDENT=14, COMENTARIO=15, 
		COMENTARIOERRADO1=16, WS=17, OP_ARIT=18, VIRGULA=19, ABREPAR=20, FECHAPAR=21, 
		ERROR=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "PALAVRA_CHAVE", "NUM_INT", "IDENT", "COMENTARIO", "COMENTARIOERRADO1", 
			"WS", "OP_ARIT", "VIRGULA", "ABREPAR", "FECHAPAR", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ALG'", "'FIM'", "'imagem'", "':'", "'inteiro'", "'leia'", "'filtroMedia'", 
			"'filtroMediana'", "'adicionarRuido'", "'mostrar'", "'salvar'", null, 
			null, null, null, null, null, null, "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"PALAVRA_CHAVE", "NUM_INT", "IDENT", "COMENTARIO", "COMENTARIOERRADO1", 
			"WS", "OP_ARIT", "VIRGULA", "ABREPAR", "FECHAPAR", "ERROR"
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


	void erro(int linha, String msg) {
	throw new RuntimeException("Linha "+linha+": "+msg);
	}


	public limageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "limage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 14:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			COMENTARIOERRADO1_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMENTARIOERRADO1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			erro(getLine(), "comentario nao fechado");
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			skip();
			break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 erro(getLine(), getText()+" - simbolo nao identificado"); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0104\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00d0\n\r\3\16\6\16\u00d3\n\16\r\16\16\16\u00d4\3\17\3\17\7\17"+
		"\u00d9\n\17\f\17\16\17\u00dc\13\17\3\20\3\20\7\20\u00e0\n\20\f\20\16\20"+
		"\u00e3\13\20\3\20\5\20\u00e6\n\20\3\20\3\20\3\20\3\21\3\21\7\21\u00ed"+
		"\n\21\f\21\16\21\u00f0\13\21\3\21\5\21\u00f3\n\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\u00ee\2"+
		"\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\7\5\2C\\aac|\6\2\62;C\\aac"+
		"|\5\2\f\f\17\17%%\5\2\13\f\17\17\"\"\5\2,-//\61\61\2\u0112\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\63\3\2\2"+
		"\2\7\67\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2\rH\3\2\2\2\17M\3\2\2\2\21Y\3\2"+
		"\2\2\23g\3\2\2\2\25v\3\2\2\2\27~\3\2\2\2\31\u00cf\3\2\2\2\33\u00d2\3\2"+
		"\2\2\35\u00d6\3\2\2\2\37\u00dd\3\2\2\2!\u00ea\3\2\2\2#\u00f6\3\2\2\2%"+
		"\u00f9\3\2\2\2\'\u00fb\3\2\2\2)\u00fd\3\2\2\2+\u00ff\3\2\2\2-\u0101\3"+
		"\2\2\2/\60\7C\2\2\60\61\7N\2\2\61\62\7I\2\2\62\4\3\2\2\2\63\64\7H\2\2"+
		"\64\65\7K\2\2\65\66\7O\2\2\66\6\3\2\2\2\678\7k\2\289\7o\2\29:\7c\2\2:"+
		";\7i\2\2;<\7g\2\2<=\7o\2\2=\b\3\2\2\2>?\7<\2\2?\n\3\2\2\2@A\7k\2\2AB\7"+
		"p\2\2BC\7v\2\2CD\7g\2\2DE\7k\2\2EF\7t\2\2FG\7q\2\2G\f\3\2\2\2HI\7n\2\2"+
		"IJ\7g\2\2JK\7k\2\2KL\7c\2\2L\16\3\2\2\2MN\7h\2\2NO\7k\2\2OP\7n\2\2PQ\7"+
		"v\2\2QR\7t\2\2RS\7q\2\2ST\7O\2\2TU\7g\2\2UV\7f\2\2VW\7k\2\2WX\7c\2\2X"+
		"\20\3\2\2\2YZ\7h\2\2Z[\7k\2\2[\\\7n\2\2\\]\7v\2\2]^\7t\2\2^_\7q\2\2_`"+
		"\7O\2\2`a\7g\2\2ab\7f\2\2bc\7k\2\2cd\7c\2\2de\7p\2\2ef\7c\2\2f\22\3\2"+
		"\2\2gh\7c\2\2hi\7f\2\2ij\7k\2\2jk\7e\2\2kl\7k\2\2lm\7q\2\2mn\7p\2\2no"+
		"\7c\2\2op\7t\2\2pq\7T\2\2qr\7w\2\2rs\7k\2\2st\7f\2\2tu\7q\2\2u\24\3\2"+
		"\2\2vw\7o\2\2wx\7q\2\2xy\7u\2\2yz\7v\2\2z{\7t\2\2{|\7c\2\2|}\7t\2\2}\26"+
		"\3\2\2\2~\177\7u\2\2\177\u0080\7c\2\2\u0080\u0081\7n\2\2\u0081\u0082\7"+
		"x\2\2\u0082\u0083\7c\2\2\u0083\u0084\7t\2\2\u0084\30\3\2\2\2\u0085\u0086"+
		"\7C\2\2\u0086\u0087\7N\2\2\u0087\u00d0\7I\2\2\u0088\u0089\7H\2\2\u0089"+
		"\u008a\7K\2\2\u008a\u00d0\7O\2\2\u008b\u008c\7k\2\2\u008c\u008d\7o\2\2"+
		"\u008d\u008e\7c\2\2\u008e\u008f\7i\2\2\u008f\u0090\7g\2\2\u0090\u00d0"+
		"\7o\2\2\u0091\u0092\7n\2\2\u0092\u0093\7g\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u00d0\7c\2\2\u0095\u0096\7u\2\2\u0096\u0097\7c\2\2\u0097\u0098\7n\2\2"+
		"\u0098\u0099\7x\2\2\u0099\u009a\7c\2\2\u009a\u00d0\7t\2\2\u009b\u009c"+
		"\7o\2\2\u009c\u009d\7q\2\2\u009d\u009e\7u\2\2\u009e\u009f\7v\2\2\u009f"+
		"\u00a0\7t\2\2\u00a0\u00a1\7c\2\2\u00a1\u00d0\7t\2\2\u00a2\u00a3\7k\2\2"+
		"\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7"+
		"\7k\2\2\u00a7\u00a8\7t\2\2\u00a8\u00d0\7q\2\2\u00a9\u00aa\7h\2\2\u00aa"+
		"\u00ab\7k\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7t\2\2"+
		"\u00ae\u00af\7q\2\2\u00af\u00b0\7O\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2"+
		"\7f\2\2\u00b2\u00b3\7k\2\2\u00b3\u00d0\7c\2\2\u00b4\u00b5\7h\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7t\2\2"+
		"\u00b9\u00ba\7q\2\2\u00ba\u00bb\7O\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd"+
		"\7f\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		"\u00d0\7c\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7k\2\2"+
		"\u00c4\u00c5\7e\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8"+
		"\7p\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7T\2\2\u00cb"+
		"\u00cc\7w\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7f\2\2\u00ce\u00d0\7q\2\2"+
		"\u00cf\u0085\3\2\2\2\u00cf\u0088\3\2\2\2\u00cf\u008b\3\2\2\2\u00cf\u0091"+
		"\3\2\2\2\u00cf\u0095\3\2\2\2\u00cf\u009b\3\2\2\2\u00cf\u00a2\3\2\2\2\u00cf"+
		"\u00a9\3\2\2\2\u00cf\u00b4\3\2\2\2\u00cf\u00c1\3\2\2\2\u00d0\32\3\2\2"+
		"\2\u00d1\u00d3\4\62;\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\34\3\2\2\2\u00d6\u00da\t\2\2\2\u00d7"+
		"\u00d9\t\3\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\36\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e1"+
		"\7%\2\2\u00de\u00e0\n\4\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e4\u00e6\7\17\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\7%\2\2\u00e8\u00e9\b\20\2\2\u00e9 \3\2\2\2"+
		"\u00ea\u00ee\7%\2\2\u00eb\u00ed\13\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f3\7\f\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b\21\3\2\u00f5\"\3\2\2\2\u00f6\u00f7"+
		"\t\5\2\2\u00f7\u00f8\b\22\4\2\u00f8$\3\2\2\2\u00f9\u00fa\t\6\2\2\u00fa"+
		"&\3\2\2\2\u00fb\u00fc\7.\2\2\u00fc(\3\2\2\2\u00fd\u00fe\7*\2\2\u00fe*"+
		"\3\2\2\2\u00ff\u0100\7+\2\2\u0100,\3\2\2\2\u0101\u0102\13\2\2\2\u0102"+
		"\u0103\b\27\5\2\u0103.\3\2\2\2\n\2\u00cf\u00d4\u00da\u00e1\u00e5\u00ee"+
		"\u00f2\6\3\20\2\3\21\3\3\22\4\3\27\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}