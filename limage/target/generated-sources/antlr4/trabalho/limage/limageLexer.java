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
		T__9=10, T__10=11, T__11=12, T__12=13, PALAVRA_CHAVE=14, NUM_INT=15, IDENT=16, 
		COMENTARIO=17, COMENTARIOERRADO1=18, WS=19, OP_ARIT=20, VIRGULA=21, ABREPAR=22, 
		FECHAPAR=23, ERROR=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "PALAVRA_CHAVE", "NUM_INT", "IDENT", 
			"COMENTARIO", "COMENTARIOERRADO1", "WS", "OP_ARIT", "VIRGULA", "ABREPAR", 
			"FECHAPAR", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ALG'", "'FIM'", "'imagem'", "':'", "'inteiro'", "'leia'", "'filtroMedia'", 
			"'filtroMediana'", "'adicionarRuido'", "'limiarOtsu'", "'realceBordas'", 
			"'mostrar'", "'salvar'", null, null, null, null, null, null, null, "','", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "PALAVRA_CHAVE", "NUM_INT", "IDENT", "COMENTARIO", "COMENTARIOERRADO1", 
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
		case 16:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			COMENTARIOERRADO1_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0139\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0102\n\17\3\20\5\20\u0105\n"+
		"\20\3\20\6\20\u0108\n\20\r\20\16\20\u0109\3\21\3\21\7\21\u010e\n\21\f"+
		"\21\16\21\u0111\13\21\3\22\3\22\7\22\u0115\n\22\f\22\16\22\u0118\13\22"+
		"\3\22\5\22\u011b\n\22\3\22\3\22\3\22\3\23\3\23\7\23\u0122\n\23\f\23\16"+
		"\23\u0125\13\23\3\23\5\23\u0128\n\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\u0123\2\32\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\5\2\f"+
		"\f\17\17%%\5\2\13\f\17\17\"\"\5\2,-//\61\61\2\u014a\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63"+
		"\3\2\2\2\5\67\3\2\2\2\7;\3\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rL\3\2\2\2\17"+
		"Q\3\2\2\2\21]\3\2\2\2\23k\3\2\2\2\25z\3\2\2\2\27\u0085\3\2\2\2\31\u0092"+
		"\3\2\2\2\33\u009a\3\2\2\2\35\u0101\3\2\2\2\37\u0104\3\2\2\2!\u010b\3\2"+
		"\2\2#\u0112\3\2\2\2%\u011f\3\2\2\2\'\u012b\3\2\2\2)\u012e\3\2\2\2+\u0130"+
		"\3\2\2\2-\u0132\3\2\2\2/\u0134\3\2\2\2\61\u0136\3\2\2\2\63\64\7C\2\2\64"+
		"\65\7N\2\2\65\66\7I\2\2\66\4\3\2\2\2\678\7H\2\289\7K\2\29:\7O\2\2:\6\3"+
		"\2\2\2;<\7k\2\2<=\7o\2\2=>\7c\2\2>?\7i\2\2?@\7g\2\2@A\7o\2\2A\b\3\2\2"+
		"\2BC\7<\2\2C\n\3\2\2\2DE\7k\2\2EF\7p\2\2FG\7v\2\2GH\7g\2\2HI\7k\2\2IJ"+
		"\7t\2\2JK\7q\2\2K\f\3\2\2\2LM\7n\2\2MN\7g\2\2NO\7k\2\2OP\7c\2\2P\16\3"+
		"\2\2\2QR\7h\2\2RS\7k\2\2ST\7n\2\2TU\7v\2\2UV\7t\2\2VW\7q\2\2WX\7O\2\2"+
		"XY\7g\2\2YZ\7f\2\2Z[\7k\2\2[\\\7c\2\2\\\20\3\2\2\2]^\7h\2\2^_\7k\2\2_"+
		"`\7n\2\2`a\7v\2\2ab\7t\2\2bc\7q\2\2cd\7O\2\2de\7g\2\2ef\7f\2\2fg\7k\2"+
		"\2gh\7c\2\2hi\7p\2\2ij\7c\2\2j\22\3\2\2\2kl\7c\2\2lm\7f\2\2mn\7k\2\2n"+
		"o\7e\2\2op\7k\2\2pq\7q\2\2qr\7p\2\2rs\7c\2\2st\7t\2\2tu\7T\2\2uv\7w\2"+
		"\2vw\7k\2\2wx\7f\2\2xy\7q\2\2y\24\3\2\2\2z{\7n\2\2{|\7k\2\2|}\7o\2\2}"+
		"~\7k\2\2~\177\7c\2\2\177\u0080\7t\2\2\u0080\u0081\7Q\2\2\u0081\u0082\7"+
		"v\2\2\u0082\u0083\7u\2\2\u0083\u0084\7w\2\2\u0084\26\3\2\2\2\u0085\u0086"+
		"\7t\2\2\u0086\u0087\7g\2\2\u0087\u0088\7c\2\2\u0088\u0089\7n\2\2\u0089"+
		"\u008a\7e\2\2\u008a\u008b\7g\2\2\u008b\u008c\7D\2\2\u008c\u008d\7q\2\2"+
		"\u008d\u008e\7t\2\2\u008e\u008f\7f\2\2\u008f\u0090\7c\2\2\u0090\u0091"+
		"\7u\2\2\u0091\30\3\2\2\2\u0092\u0093\7o\2\2\u0093\u0094\7q\2\2\u0094\u0095"+
		"\7u\2\2\u0095\u0096\7v\2\2\u0096\u0097\7t\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7t\2\2\u0099\32\3\2\2\2\u009a\u009b\7u\2\2\u009b\u009c\7c\2\2\u009c"+
		"\u009d\7n\2\2\u009d\u009e\7x\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7t\2\2"+
		"\u00a0\34\3\2\2\2\u00a1\u00a2\7C\2\2\u00a2\u00a3\7N\2\2\u00a3\u0102\7"+
		"I\2\2\u00a4\u00a5\7H\2\2\u00a5\u00a6\7K\2\2\u00a6\u0102\7O\2\2\u00a7\u00a8"+
		"\7k\2\2\u00a8\u00a9\7o\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7i\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\u0102\7o\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7g\2\2"+
		"\u00af\u00b0\7k\2\2\u00b0\u0102\7c\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3"+
		"\7c\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7x\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u0102\7t\2\2\u00b7\u00b8\7o\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7u\2\2"+
		"\u00ba\u00bb\7v\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7c\2\2\u00bd\u0102"+
		"\7t\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7v\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7t\2\2\u00c4\u0102\7q\2\2"+
		"\u00c5\u00c6\7h\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9"+
		"\7v\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7O\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7k\2\2\u00cf\u0102\7c\2\2"+
		"\u00d0\u00d1\7h\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4"+
		"\7v\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7O\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7f\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7c\2\2"+
		"\u00db\u00dc\7p\2\2\u00dc\u0102\7c\2\2\u00dd\u00de\7c\2\2\u00de\u00df"+
		"\7f\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7k\2\2\u00e2"+
		"\u00e3\7q\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7t\2\2"+
		"\u00e6\u00e7\7T\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea"+
		"\7f\2\2\u00ea\u0102\7q\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7g\2\2\u00ed"+
		"\u00ee\7c\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7g\2\2"+
		"\u00f1\u00f2\7D\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5"+
		"\7f\2\2\u00f5\u00f6\7c\2\2\u00f6\u0102\7u\2\2\u00f7\u00f8\7n\2\2\u00f8"+
		"\u00f9\7k\2\2\u00f9\u00fa\7o\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7c\2\2"+
		"\u00fc\u00fd\7t\2\2\u00fd\u00fe\7Q\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100"+
		"\7u\2\2\u0100\u0102\7w\2\2\u0101\u00a1\3\2\2\2\u0101\u00a4\3\2\2\2\u0101"+
		"\u00a7\3\2\2\2\u0101\u00ad\3\2\2\2\u0101\u00b1\3\2\2\2\u0101\u00b7\3\2"+
		"\2\2\u0101\u00be\3\2\2\2\u0101\u00c5\3\2\2\2\u0101\u00d0\3\2\2\2\u0101"+
		"\u00dd\3\2\2\2\u0101\u00eb\3\2\2\2\u0101\u00f7\3\2\2\2\u0102\36\3\2\2"+
		"\2\u0103\u0105\7/\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107"+
		"\3\2\2\2\u0106\u0108\4\62;\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a \3\2\2\2\u010b\u010f\t\2\2\2"+
		"\u010c\u010e\t\3\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\"\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0116\7%\2\2\u0113\u0115\n\4\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011b\7\17\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3"+
		"\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7%\2\2\u011d\u011e\b\22\2\2\u011e"+
		"$\3\2\2\2\u011f\u0123\7%\2\2\u0120\u0122\13\2\2\2\u0121\u0120\3\2\2\2"+
		"\u0122\u0125\3\2\2\2\u0123\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0127"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0128\7\f\2\2\u0127\u0126\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b\23\3\2\u012a&\3\2\2\2"+
		"\u012b\u012c\t\5\2\2\u012c\u012d\b\24\4\2\u012d(\3\2\2\2\u012e\u012f\t"+
		"\6\2\2\u012f*\3\2\2\2\u0130\u0131\7.\2\2\u0131,\3\2\2\2\u0132\u0133\7"+
		"*\2\2\u0133.\3\2\2\2\u0134\u0135\7+\2\2\u0135\60\3\2\2\2\u0136\u0137\13"+
		"\2\2\2\u0137\u0138\b\31\5\2\u0138\62\3\2\2\2\13\2\u0101\u0104\u0109\u010f"+
		"\u0116\u011a\u0123\u0127\6\3\22\2\3\23\3\3\24\4\3\31\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}