// Generated from Calculette.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculetteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, TYPE=29, NEWLINE=30, WS=31, ENTIER=32, 
		AND=33, OR=34, NOT=35, RETOUR=36, IDENTIFIANT=37, UNMATCH=38;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_expr = 2, RULE_decl = 3, RULE_instruction = 4, 
		RULE_assignation = 5, RULE_tantque = 6, RULE_si = 7, RULE_pour = 8, RULE_dowhile = 9, 
		RULE_condition = 10, RULE_logique = 11, RULE_bloc = 12, RULE_fonction = 13, 
		RULE_params = 14, RULE_args = 15, RULE_entreesortie = 16, RULE_finInstruction = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "expr", "decl", "instruction", "assignation", "tantque", 
			"si", "pour", "dowhile", "condition", "logique", "bloc", "fonction", 
			"params", "args", "entreesortie", "finInstruction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'*'", "'/'", "'+'", "'('", "')'", "'='", "'while'", "'if'", 
			"'else'", "'for'", "';'", "'repeat'", "'until'", "'true'", "'false'", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'", "'{'", "'}'", "','", 
			"'readln'", "'println'", null, null, null, null, null, null, null, "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "TYPE", "NEWLINE", "WS", "ENTIER", "AND", 
			"OR", "NOT", "RETOUR", "IDENTIFIANT", "UNMATCH"
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
	public String getGrammarFileName() { return "Calculette.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private TablesSymboles tableSymboles = new TablesSymboles();

	    private String evalexpr (String x, String op, String y) {
	        String res = x+y;
	        if ( op.equals("*") ){
	            return res+"MUL\n";
	        }else if (op.equals("/")) {
	            return res+"DIV\n";
	        } else if ( op.equals("+") ){
	            return res+"ADD\n";
	        } else if ( op.equals("-")) {
	            return res+"SUB\n";
	        } else {
	           System.err.println("Opérateur arithmétique inconnu : '" + op + "'");
	           throw new IllegalArgumentException("Opérateur arithmétique inconnu : '" + op + "'");
	        }
	    }

	    private int _label = 0;
	    /** générateur de nom d'étiquettes */
	    private int nextLabel() { return _label++; }

	public CalculetteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculetteParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			calcul();
			setState(37);
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

	public static class CalculContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
		public FonctionContext fonction;
		public InstructionContext instruction;
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public List<FonctionContext> fonction() {
			return getRuleContexts(FonctionContext.class);
		}
		public FonctionContext fonction(int i) {
			return getRuleContext(FonctionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public CalculContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterCalcul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitCalcul(this);
		}
	}

	public final CalculContext calcul() throws RecognitionException {
		CalculContext _localctx = new CalculContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					((CalculContext)_localctx).decl = decl();
					 _localctx.code += ((CalculContext)_localctx).decl.code; 
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			 int entry = nextLabel(); _localctx.code += "JUMP " + entry + "\n"; 
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					match(NEWLINE);
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(54);
				((CalculContext)_localctx).fonction = fonction();
				 _localctx.code += ((CalculContext)_localctx).fonction.code; 
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					match(NEWLINE);
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			 _localctx.code += "LABEL " + entry + "\n"; 
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__26) | (1L << T__27) | (1L << NEWLINE) | (1L << ENTIER) | (1L << RETOUR) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(69);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "HALT\n"; 
			}
			_ctx.stop = _input.LT(-1);
			 System.out.println(_localctx.code); 
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

	public static class ExprContext extends ParserRuleContext {
		public String code;
		public String type;
		public ExprContext a;
		public Token ENTIER;
		public Token IDENTIFIANT;
		public ExprContext e;
		public ArgsContext args;
		public Token op;
		public ExprContext b;
		public TerminalNode ENTIER() { return getToken(CalculetteParser.ENTIER, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(80);
				((ExprContext)_localctx).ENTIER = match(ENTIER);
				((ExprContext)_localctx).code = "PUSHI "+ ((ExprContext)_localctx).ENTIER.getText() + "\n";
				}
				break;
			case 2:
				{
				setState(82);
				((ExprContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				 ((ExprContext)_localctx).code = "PUSHG "+tableSymboles.getAdresseType((((ExprContext)_localctx).IDENTIFIANT!=null?((ExprContext)_localctx).IDENTIFIANT.getText():null)).adresse + "\n";
				}
				break;
			case 3:
				{
				setState(84);
				match(T__0);
				setState(85);
				((ExprContext)_localctx).e = expr(5);
				((ExprContext)_localctx).code = "PUSHI 0\n" + ((ExprContext)_localctx).e.code + "SUB\n";
				}
				break;
			case 4:
				{
				setState(88);
				match(T__4);
				setState(89);
				((ExprContext)_localctx).e = expr(0);
				setState(90);
				match(T__5);
				((ExprContext)_localctx).code = ((ExprContext)_localctx).e.code;
				}
				break;
			case 5:
				{
				setState(93);
				((ExprContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(94);
				match(T__4);
				setState(95);
				((ExprContext)_localctx).args = args();
				setState(96);
				match(T__5);
				((ExprContext)_localctx).code = "PUSHI 0\n"+((ExprContext)_localctx).args.code+"CALL "+tableSymboles.getFonction((((ExprContext)_localctx).IDENTIFIANT!=null?((ExprContext)_localctx).IDENTIFIANT.getText():null)).adresse+"\n";
				  ((ExprContext)_localctx).type = tableSymboles.getFonction((((ExprContext)_localctx).IDENTIFIANT!=null?((ExprContext)_localctx).IDENTIFIANT.getText():null)).type;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(102);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__2) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						((ExprContext)_localctx).b = expr(5);
						((ExprContext)_localctx).code = evalexpr(((ExprContext)_localctx).a.code,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null),((ExprContext)_localctx).b.code);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(107);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__3) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						((ExprContext)_localctx).b = expr(4);
						((ExprContext)_localctx).code = evalexpr(((ExprContext)_localctx).a.code,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null),((ExprContext)_localctx).b.code);
						}
						break;
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public ExprContext expr;
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(117);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(118);
				match(T__6);
				setState(119);
				((DeclContext)_localctx).expr = expr(0);
				setState(120);
				finInstruction();
				tableSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null)); ((DeclContext)_localctx).code = "PUSHI 0\n" + ((DeclContext)_localctx).expr.code + "STOREG " + tableSymboles.getAdresseType((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null)).adresse+"\n"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(124);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(125);
				finInstruction();
				((DeclContext)_localctx).code = "PUSHI 0\n"; tableSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
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

	public static class InstructionContext extends ParserRuleContext {
		public String code;
		public AssignationContext a;
		public ExprContext b;
		public TantqueContext tantque;
		public SiContext si;
		public PourContext pour;
		public DowhileContext dowhile;
		public EntreesortieContext entreesortie;
		public ExprContext expr;
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TantqueContext tantque() {
			return getRuleContext(TantqueContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public PourContext pour() {
			return getRuleContext(PourContext.class,0);
		}
		public DowhileContext dowhile() {
			return getRuleContext(DowhileContext.class,0);
		}
		public EntreesortieContext entreesortie() {
			return getRuleContext(EntreesortieContext.class,0);
		}
		public TerminalNode RETOUR() { return getToken(CalculetteParser.RETOUR, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((InstructionContext)_localctx).a = assignation();
				setState(131);
				finInstruction();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).a.code;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				((InstructionContext)_localctx).b = expr(0);
				setState(135);
				finInstruction();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).b.code;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				((InstructionContext)_localctx).tantque = tantque();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).tantque.code;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				((InstructionContext)_localctx).si = si();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).si.code;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				((InstructionContext)_localctx).pour = pour();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).pour.code;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				((InstructionContext)_localctx).dowhile = dowhile();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).dowhile.code;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				((InstructionContext)_localctx).entreesortie = entreesortie();
				setState(151);
				finInstruction();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).entreesortie.code;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(154);
				match(RETOUR);
				setState(155);
				((InstructionContext)_localctx).expr = expr(0);
				setState(156);
				finInstruction();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).expr.code + "STOREL " + tableSymboles.getAdresseType("return").adresse + "\n";
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(159);
				finInstruction();
				((InstructionContext)_localctx).code = "";
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

	public static class AssignationContext extends ParserRuleContext {
		public String code;
		public String id;
		public Token IDENTIFIANT;
		public ExprContext expr;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitAssignation(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(165);
			match(T__6);
			setState(166);
			((AssignationContext)_localctx).expr = expr(0);
			((AssignationContext)_localctx).id =  (((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null); ((AssignationContext)_localctx).code = ((AssignationContext)_localctx).expr.code + "STOREG " + tableSymboles.getAdresseType(_localctx.id).adresse+"\n";
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

	public static class TantqueContext extends ParserRuleContext {
		public String code;
		public LogiqueContext logique;
		public InstructionContext instruction;
		public BlocContext bloc;
		public LogiqueContext logique() {
			return getRuleContext(LogiqueContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public TantqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tantque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterTantque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitTantque(this);
		}
	}

	public final TantqueContext tantque() throws RecognitionException {
		TantqueContext _localctx = new TantqueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tantque);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__7);
				setState(170);
				match(T__4);
				setState(171);
				((TantqueContext)_localctx).logique = logique();
				setState(172);
				match(T__5);
				setState(173);
				((TantqueContext)_localctx).instruction = instruction();
				int label1 = nextLabel(); int label2= nextLabel();
				  ((TantqueContext)_localctx).code = "LABEL " + label1 + "\n" + ((TantqueContext)_localctx).logique.code + "JUMPF " + label2 + "\n" + ((TantqueContext)_localctx).instruction.code + "JUMP " + label1 + "\nLABEL " + label2 + "\n";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__7);
				setState(177);
				match(T__4);
				setState(178);
				((TantqueContext)_localctx).logique = logique();
				setState(179);
				match(T__5);
				setState(180);
				((TantqueContext)_localctx).bloc = bloc();
				int label1 = nextLabel(); int label2= nextLabel();
				  ((TantqueContext)_localctx).code = "LABEL " + label1 + "\n" + ((TantqueContext)_localctx).logique.code + "JUMPF " + label2 + "\n" + ((TantqueContext)_localctx).bloc.code + "JUMP " + label1 + "\nLABEL " + label2 + "\n";
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

	public static class SiContext extends ParserRuleContext {
		public String code;
		public LogiqueContext logique;
		public BlocContext then;
		public BlocContext sinon;
		public LogiqueContext logique() {
			return getRuleContext(LogiqueContext.class,0);
		}
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
		}
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitSi(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_si);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(T__8);
				setState(186);
				match(T__4);
				setState(187);
				((SiContext)_localctx).logique = logique();
				setState(188);
				match(T__5);
				setState(189);
				((SiContext)_localctx).then = bloc();
				setState(190);
				match(T__9);
				setState(191);
				((SiContext)_localctx).sinon = bloc();
				int iflabel = nextLabel(); int endlabel = nextLabel();
				    ((SiContext)_localctx).code = ((SiContext)_localctx).logique.code + "JUMPF " + iflabel + "\n" + ((SiContext)_localctx).then.code + "JUMP " + endlabel + "\nLABEL " + iflabel + "\n" + ((SiContext)_localctx).sinon.code + "LABEL " + endlabel + "\n";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(T__8);
				setState(195);
				match(T__4);
				setState(196);
				((SiContext)_localctx).logique = logique();
				setState(197);
				match(T__5);
				setState(198);
				((SiContext)_localctx).then = bloc();
				int iflabel = nextLabel();
				  ((SiContext)_localctx).code = ((SiContext)_localctx).logique.code + "JUMPF " + iflabel + "\n" + ((SiContext)_localctx).then.code + "\nLABEL " + iflabel + "\n";
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

	public static class PourContext extends ParserRuleContext {
		public String code;
		public AssignationContext init;
		public LogiqueContext logique;
		public AssignationContext cont;
		public InstructionContext instruction;
		public BlocContext bloc;
		public LogiqueContext logique() {
			return getRuleContext(LogiqueContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<AssignationContext> assignation() {
			return getRuleContexts(AssignationContext.class);
		}
		public AssignationContext assignation(int i) {
			return getRuleContext(AssignationContext.class,i);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public PourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterPour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitPour(this);
		}
	}

	public final PourContext pour() throws RecognitionException {
		PourContext _localctx = new PourContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pour);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__10);
				setState(204);
				match(T__4);
				setState(205);
				((PourContext)_localctx).init = assignation();
				setState(206);
				match(T__11);
				setState(207);
				((PourContext)_localctx).logique = logique();
				setState(208);
				match(T__11);
				setState(209);
				((PourContext)_localctx).cont = assignation();
				setState(210);
				match(T__5);
				setState(211);
				((PourContext)_localctx).instruction = instruction();
				 int forlabel = nextLabel(); int endlabel = nextLabel();
				  ((PourContext)_localctx).code = ((PourContext)_localctx).init.code + "LABEL " + forlabel + ((PourContext)_localctx).logique.code + "\nJUMPF " + endlabel+ "\n" + ((PourContext)_localctx).instruction.code + ((PourContext)_localctx).cont.code + "JUMP " + forlabel + "\nLABEL " + endlabel + "\n"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(T__10);
				setState(215);
				match(T__4);
				setState(216);
				((PourContext)_localctx).init = assignation();
				setState(217);
				match(T__11);
				setState(218);
				((PourContext)_localctx).logique = logique();
				setState(219);
				match(T__11);
				setState(220);
				((PourContext)_localctx).cont = assignation();
				setState(221);
				match(T__5);
				setState(222);
				((PourContext)_localctx).bloc = bloc();
				 int forlabel = nextLabel(); int endlabel = nextLabel();
				    ((PourContext)_localctx).code = ((PourContext)_localctx).init.code + "LABEL " + forlabel + ((PourContext)_localctx).logique.code + "\nJUMPF " + endlabel+ "\n" + ((PourContext)_localctx).bloc.code + ((PourContext)_localctx).cont.code + "JUMP " + forlabel + "\nLABEL " + endlabel + "\n"; 
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

	public static class DowhileContext extends ParserRuleContext {
		public String code;
		public BlocContext bloc;
		public LogiqueContext logique;
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public LogiqueContext logique() {
			return getRuleContext(LogiqueContext.class,0);
		}
		public DowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitDowhile(this);
		}
	}

	public final DowhileContext dowhile() throws RecognitionException {
		DowhileContext _localctx = new DowhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__12);
			setState(228);
			((DowhileContext)_localctx).bloc = bloc();
			setState(229);
			match(T__13);
			setState(230);
			match(T__4);
			setState(231);
			((DowhileContext)_localctx).logique = logique();
			setState(232);
			match(T__5);
			 int dolabel = nextLabel();
			    ((DowhileContext)_localctx).code = "LABEL " + dolabel + "\n" + ((DowhileContext)_localctx).bloc.code + ((DowhileContext)_localctx).logique.code + "\nJUMPF " + dolabel + "\n"; 
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

	public static class ConditionContext extends ParserRuleContext {
		public String code;
		public ExprContext a;
		public ExprContext b;
		public ConditionContext condition;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(CalculetteParser.NOT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(T__14);
				 ((ConditionContext)_localctx).code =  "PUSHI 1\n"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(T__15);
				 ((ConditionContext)_localctx).code =  "PUSHI 0\n"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				((ConditionContext)_localctx).a = expr(0);
				setState(240);
				match(T__16);
				setState(241);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "INF\n";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				((ConditionContext)_localctx).a = expr(0);
				setState(245);
				match(T__17);
				setState(246);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "INFEQ\n";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				((ConditionContext)_localctx).a = expr(0);
				setState(250);
				match(T__18);
				setState(251);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "SUP\n";
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				((ConditionContext)_localctx).a = expr(0);
				setState(255);
				match(T__19);
				setState(256);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "SUPEQ\n";
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(259);
				((ConditionContext)_localctx).a = expr(0);
				setState(260);
				match(T__20);
				setState(261);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "EQUAL\n";
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(264);
				((ConditionContext)_localctx).a = expr(0);
				setState(265);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "NEQ\n";
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(269);
				match(NOT);
				setState(270);
				((ConditionContext)_localctx).condition = condition();
				((ConditionContext)_localctx).code = ((ConditionContext)_localctx).condition.code + "\nPUSHI 1\nNEQ\n";
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

	public static class LogiqueContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public LogiqueContext a;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode AND() { return getToken(CalculetteParser.AND, 0); }
		public LogiqueContext logique() {
			return getRuleContext(LogiqueContext.class,0);
		}
		public TerminalNode OR() { return getToken(CalculetteParser.OR, 0); }
		public TerminalNode NOT() { return getToken(CalculetteParser.NOT, 0); }
		public LogiqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterLogique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitLogique(this);
		}
	}

	public final LogiqueContext logique() throws RecognitionException {
		LogiqueContext _localctx = new LogiqueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logique);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				((LogiqueContext)_localctx).condition = condition();
				setState(276);
				match(AND);
				setState(277);
				((LogiqueContext)_localctx).a = logique();
				((LogiqueContext)_localctx).code =  ((LogiqueContext)_localctx).condition.code + ((LogiqueContext)_localctx).a.code + "MUL\n"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				((LogiqueContext)_localctx).condition = condition();
				setState(281);
				match(OR);
				setState(282);
				((LogiqueContext)_localctx).a = logique();
				((LogiqueContext)_localctx).code =  ((LogiqueContext)_localctx).condition.code + ((LogiqueContext)_localctx).a.code + "\nPUSHI 0\nNEQ\n";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				((LogiqueContext)_localctx).condition = condition();
				((LogiqueContext)_localctx).code = ((LogiqueContext)_localctx).condition.code;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				match(NOT);
				setState(289);
				match(T__4);
				setState(290);
				((LogiqueContext)_localctx).condition = condition();
				setState(291);
				match(T__5);
				((LogiqueContext)_localctx).code = ((LogiqueContext)_localctx).condition.code + "\nPUSHI 1\nNEQ\n";
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

	public static class BlocContext extends ParserRuleContext {
		public String code;
		public InstructionContext instruction;
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitBloc(this);
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bloc);
		 ((BlocContext)_localctx).code =  new String();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__23);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__26) | (1L << T__27) | (1L << NEWLINE) | (1L << ENTIER) | (1L << RETOUR) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(297);
				((BlocContext)_localctx).instruction = instruction();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(T__24);
			_localctx.code+=((BlocContext)_localctx).instruction.code;
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

	public static class FonctionContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public BlocContext bloc;
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitFonction(this);
		}
	}

	public final FonctionContext fonction() throws RecognitionException {
		FonctionContext _localctx = new FonctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fonction);
		 tableSymboles.newTableLocale();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			((FonctionContext)_localctx).TYPE = match(TYPE);
			setState(307);
			((FonctionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			int label = nextLabel();
			          ((FonctionContext)_localctx).code = "LABEL " + label + "\n";
			          tableSymboles.nouvelleFonction((((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null), label, (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));
			          tableSymboles.putVar("return", (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));
			setState(309);
			match(T__4);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(310);
				params();
				}
			}

			setState(313);
			match(T__5);
			setState(314);
			((FonctionContext)_localctx).bloc = bloc();
			_localctx.code+=((FonctionContext)_localctx).bloc.code;
			}
			_ctx.stop = _input.LT(-1);
			 _localctx.code+="RETURN\n"; tableSymboles.dropTableLocale();
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

	public static class ParamsContext extends ParserRuleContext {
		public Token TYPE;
		public Token IDENTIFIANT;
		public List<TerminalNode> TYPE() { return getTokens(CalculetteParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CalculetteParser.TYPE, i);
		}
		public List<TerminalNode> IDENTIFIANT() { return getTokens(CalculetteParser.IDENTIFIANT); }
		public TerminalNode IDENTIFIANT(int i) {
			return getToken(CalculetteParser.IDENTIFIANT, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			((ParamsContext)_localctx).TYPE = match(TYPE);
			setState(318);
			((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			tableSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null), (((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null));
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(320);
				match(T__25);
				setState(321);
				((ParamsContext)_localctx).TYPE = match(TYPE);
				setState(322);
				((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				tableSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null), (((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null));
				}
				}
				setState(328);
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

	public static class ArgsContext extends ParserRuleContext {
		public String code;
		public int size;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		 ((ArgsContext)_localctx).code =  new String(); ((ArgsContext)_localctx).size =  0; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
				{
				setState(329);
				((ArgsContext)_localctx).expr = expr(0);

				      _localctx.code+=((ArgsContext)_localctx).expr.code+"\n";
				      _localctx.size+=1;
				        // code java pour première expression pour arg1
				    
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(331);
					match(T__25);
					setState(332);
					((ArgsContext)_localctx).expr = expr(0);

					      _localctx.code+=((ArgsContext)_localctx).expr.code+"\n";
					      _localctx.size+=1;
					        // code java pour expression suivante pour argi
					    
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class EntreesortieContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public ExprContext expr;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EntreesortieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entreesortie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterEntreesortie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitEntreesortie(this);
		}
	}

	public final EntreesortieContext entreesortie() throws RecognitionException {
		EntreesortieContext _localctx = new EntreesortieContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_entreesortie);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(T__26);
				setState(343);
				match(T__4);
				setState(344);
				((EntreesortieContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(345);
				match(T__5);
				 ((EntreesortieContext)_localctx).code = "READ\nSTOREG " + tableSymboles.getAdresseType((((EntreesortieContext)_localctx).IDENTIFIANT!=null?((EntreesortieContext)_localctx).IDENTIFIANT.getText():null)).adresse+"\n"; 
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(T__27);
				setState(348);
				match(T__4);
				setState(349);
				((EntreesortieContext)_localctx).expr = expr(0);
				setState(350);
				match(T__5);
				 ((EntreesortieContext)_localctx).code = ((EntreesortieContext)_localctx).expr.code+"WRITE\nPOP\n"; 
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

	public static class FinInstructionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterFinInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitFinInstruction(this);
		}
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_finInstruction);
		try {
			int _alt;
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(T__11);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(357); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(356);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(359); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u016e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3\7"+
		"\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\7\3"+
		"B\n\3\f\3\16\3E\13\3\3\3\3\3\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4f\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4r\n\4\f\4"+
		"\16\4u\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0083"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a5"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00ba\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u00cc\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e4\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0114\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0129\n\r\3\16\3\16\7\16\u012d\n\16\f\16\16\16\u0130\13\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u013a\n\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0147\n\20\f\20\16\20\u014a\13\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0152\n\21\f\21\16\21\u0155\13\21"+
		"\5\21\u0157\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0164\n\22\3\23\3\23\6\23\u0168\n\23\r\23\16\23\u0169\5\23\u016c"+
		"\n\23\3\23\2\3\6\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\3\2"+
		"\4\5\4\2\3\3\6\6\3\2\30\31\2\u0185\2&\3\2\2\2\4.\3\2\2\2\6e\3\2\2\2\b"+
		"\u0082\3\2\2\2\n\u00a4\3\2\2\2\f\u00a6\3\2\2\2\16\u00b9\3\2\2\2\20\u00cb"+
		"\3\2\2\2\22\u00e3\3\2\2\2\24\u00e5\3\2\2\2\26\u0113\3\2\2\2\30\u0128\3"+
		"\2\2\2\32\u012a\3\2\2\2\34\u0134\3\2\2\2\36\u013f\3\2\2\2 \u0156\3\2\2"+
		"\2\"\u0163\3\2\2\2$\u016b\3\2\2\2&\'\5\4\3\2\'(\7\2\2\3(\3\3\2\2\2)*\5"+
		"\b\5\2*+\b\3\1\2+-\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/"+
		"\61\3\2\2\2\60.\3\2\2\2\61\65\b\3\1\2\62\64\7 \2\2\63\62\3\2\2\2\64\67"+
		"\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66=\3\2\2\2\67\65\3\2\2\289\5\34"+
		"\17\29:\b\3\1\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>C\3"+
		"\2\2\2?=\3\2\2\2@B\7 \2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3"+
		"\2\2\2EC\3\2\2\2FL\b\3\1\2GH\5\n\6\2HI\b\3\1\2IK\3\2\2\2JG\3\2\2\2KN\3"+
		"\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\b\3\1\2P\5\3\2\2\2QR"+
		"\b\4\1\2RS\7\"\2\2Sf\b\4\1\2TU\7\'\2\2Uf\b\4\1\2VW\7\3\2\2WX\5\6\4\7X"+
		"Y\b\4\1\2Yf\3\2\2\2Z[\7\7\2\2[\\\5\6\4\2\\]\7\b\2\2]^\b\4\1\2^f\3\2\2"+
		"\2_`\7\'\2\2`a\7\7\2\2ab\5 \21\2bc\7\b\2\2cd\b\4\1\2df\3\2\2\2eQ\3\2\2"+
		"\2eT\3\2\2\2eV\3\2\2\2eZ\3\2\2\2e_\3\2\2\2fs\3\2\2\2gh\f\6\2\2hi\t\2\2"+
		"\2ij\5\6\4\7jk\b\4\1\2kr\3\2\2\2lm\f\5\2\2mn\t\3\2\2no\5\6\4\6op\b\4\1"+
		"\2pr\3\2\2\2qg\3\2\2\2ql\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\7\3\2"+
		"\2\2us\3\2\2\2vw\7\37\2\2wx\7\'\2\2xy\7\t\2\2yz\5\6\4\2z{\5$\23\2{|\b"+
		"\5\1\2|\u0083\3\2\2\2}~\7\37\2\2~\177\7\'\2\2\177\u0080\5$\23\2\u0080"+
		"\u0081\b\5\1\2\u0081\u0083\3\2\2\2\u0082v\3\2\2\2\u0082}\3\2\2\2\u0083"+
		"\t\3\2\2\2\u0084\u0085\5\f\7\2\u0085\u0086\5$\23\2\u0086\u0087\b\6\1\2"+
		"\u0087\u00a5\3\2\2\2\u0088\u0089\5\6\4\2\u0089\u008a\5$\23\2\u008a\u008b"+
		"\b\6\1\2\u008b\u00a5\3\2\2\2\u008c\u008d\5\16\b\2\u008d\u008e\b\6\1\2"+
		"\u008e\u00a5\3\2\2\2\u008f\u0090\5\20\t\2\u0090\u0091\b\6\1\2\u0091\u00a5"+
		"\3\2\2\2\u0092\u0093\5\22\n\2\u0093\u0094\b\6\1\2\u0094\u00a5\3\2\2\2"+
		"\u0095\u0096\5\24\13\2\u0096\u0097\b\6\1\2\u0097\u00a5\3\2\2\2\u0098\u0099"+
		"\5\"\22\2\u0099\u009a\5$\23\2\u009a\u009b\b\6\1\2\u009b\u00a5\3\2\2\2"+
		"\u009c\u009d\7&\2\2\u009d\u009e\5\6\4\2\u009e\u009f\5$\23\2\u009f\u00a0"+
		"\b\6\1\2\u00a0\u00a5\3\2\2\2\u00a1\u00a2\5$\23\2\u00a2\u00a3\b\6\1\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u0084\3\2\2\2\u00a4\u0088\3\2\2\2\u00a4\u008c\3\2"+
		"\2\2\u00a4\u008f\3\2\2\2\u00a4\u0092\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4"+
		"\u0098\3\2\2\2\u00a4\u009c\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5\13\3\2\2"+
		"\2\u00a6\u00a7\7\'\2\2\u00a7\u00a8\7\t\2\2\u00a8\u00a9\5\6\4\2\u00a9\u00aa"+
		"\b\7\1\2\u00aa\r\3\2\2\2\u00ab\u00ac\7\n\2\2\u00ac\u00ad\7\7\2\2\u00ad"+
		"\u00ae\5\30\r\2\u00ae\u00af\7\b\2\2\u00af\u00b0\5\n\6\2\u00b0\u00b1\b"+
		"\b\1\2\u00b1\u00ba\3\2\2\2\u00b2\u00b3\7\n\2\2\u00b3\u00b4\7\7\2\2\u00b4"+
		"\u00b5\5\30\r\2\u00b5\u00b6\7\b\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8"+
		"\b\b\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00ab\3\2\2\2\u00b9\u00b2\3\2\2\2\u00ba"+
		"\17\3\2\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00bd\7\7\2\2\u00bd\u00be\5\30"+
		"\r\2\u00be\u00bf\7\b\2\2\u00bf\u00c0\5\32\16\2\u00c0\u00c1\7\f\2\2\u00c1"+
		"\u00c2\5\32\16\2\u00c2\u00c3\b\t\1\2\u00c3\u00cc\3\2\2\2\u00c4\u00c5\7"+
		"\13\2\2\u00c5\u00c6\7\7\2\2\u00c6\u00c7\5\30\r\2\u00c7\u00c8\7\b\2\2\u00c8"+
		"\u00c9\5\32\16\2\u00c9\u00ca\b\t\1\2\u00ca\u00cc\3\2\2\2\u00cb\u00bb\3"+
		"\2\2\2\u00cb\u00c4\3\2\2\2\u00cc\21\3\2\2\2\u00cd\u00ce\7\r\2\2\u00ce"+
		"\u00cf\7\7\2\2\u00cf\u00d0\5\f\7\2\u00d0\u00d1\7\16\2\2\u00d1\u00d2\5"+
		"\30\r\2\u00d2\u00d3\7\16\2\2\u00d3\u00d4\5\f\7\2\u00d4\u00d5\7\b\2\2\u00d5"+
		"\u00d6\5\n\6\2\u00d6\u00d7\b\n\1\2\u00d7\u00e4\3\2\2\2\u00d8\u00d9\7\r"+
		"\2\2\u00d9\u00da\7\7\2\2\u00da\u00db\5\f\7\2\u00db\u00dc\7\16\2\2\u00dc"+
		"\u00dd\5\30\r\2\u00dd\u00de\7\16\2\2\u00de\u00df\5\f\7\2\u00df\u00e0\7"+
		"\b\2\2\u00e0\u00e1\5\32\16\2\u00e1\u00e2\b\n\1\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00cd\3\2\2\2\u00e3\u00d8\3\2\2\2\u00e4\23\3\2\2\2\u00e5\u00e6\7\17\2"+
		"\2\u00e6\u00e7\5\32\16\2\u00e7\u00e8\7\20\2\2\u00e8\u00e9\7\7\2\2\u00e9"+
		"\u00ea\5\30\r\2\u00ea\u00eb\7\b\2\2\u00eb\u00ec\b\13\1\2\u00ec\25\3\2"+
		"\2\2\u00ed\u00ee\7\21\2\2\u00ee\u0114\b\f\1\2\u00ef\u00f0\7\22\2\2\u00f0"+
		"\u0114\b\f\1\2\u00f1\u00f2\5\6\4\2\u00f2\u00f3\7\23\2\2\u00f3\u00f4\5"+
		"\6\4\2\u00f4\u00f5\b\f\1\2\u00f5\u0114\3\2\2\2\u00f6\u00f7\5\6\4\2\u00f7"+
		"\u00f8\7\24\2\2\u00f8\u00f9\5\6\4\2\u00f9\u00fa\b\f\1\2\u00fa\u0114\3"+
		"\2\2\2\u00fb\u00fc\5\6\4\2\u00fc\u00fd\7\25\2\2\u00fd\u00fe\5\6\4\2\u00fe"+
		"\u00ff\b\f\1\2\u00ff\u0114\3\2\2\2\u0100\u0101\5\6\4\2\u0101\u0102\7\26"+
		"\2\2\u0102\u0103\5\6\4\2\u0103\u0104\b\f\1\2\u0104\u0114\3\2\2\2\u0105"+
		"\u0106\5\6\4\2\u0106\u0107\7\27\2\2\u0107\u0108\5\6\4\2\u0108\u0109\b"+
		"\f\1\2\u0109\u0114\3\2\2\2\u010a\u010b\5\6\4\2\u010b\u010c\t\4\2\2\u010c"+
		"\u010d\5\6\4\2\u010d\u010e\b\f\1\2\u010e\u0114\3\2\2\2\u010f\u0110\7%"+
		"\2\2\u0110\u0111\5\26\f\2\u0111\u0112\b\f\1\2\u0112\u0114\3\2\2\2\u0113"+
		"\u00ed\3\2\2\2\u0113\u00ef\3\2\2\2\u0113\u00f1\3\2\2\2\u0113\u00f6\3\2"+
		"\2\2\u0113\u00fb\3\2\2\2\u0113\u0100\3\2\2\2\u0113\u0105\3\2\2\2\u0113"+
		"\u010a\3\2\2\2\u0113\u010f\3\2\2\2\u0114\27\3\2\2\2\u0115\u0116\5\26\f"+
		"\2\u0116\u0117\7#\2\2\u0117\u0118\5\30\r\2\u0118\u0119\b\r\1\2\u0119\u0129"+
		"\3\2\2\2\u011a\u011b\5\26\f\2\u011b\u011c\7$\2\2\u011c\u011d\5\30\r\2"+
		"\u011d\u011e\b\r\1\2\u011e\u0129\3\2\2\2\u011f\u0120\5\26\f\2\u0120\u0121"+
		"\b\r\1\2\u0121\u0129\3\2\2\2\u0122\u0123\7%\2\2\u0123\u0124\7\7\2\2\u0124"+
		"\u0125\5\26\f\2\u0125\u0126\7\b\2\2\u0126\u0127\b\r\1\2\u0127\u0129\3"+
		"\2\2\2\u0128\u0115\3\2\2\2\u0128\u011a\3\2\2\2\u0128\u011f\3\2\2\2\u0128"+
		"\u0122\3\2\2\2\u0129\31\3\2\2\2\u012a\u012e\7\32\2\2\u012b\u012d\5\n\6"+
		"\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7\33\2\2"+
		"\u0132\u0133\b\16\1\2\u0133\33\3\2\2\2\u0134\u0135\7\37\2\2\u0135\u0136"+
		"\7\'\2\2\u0136\u0137\b\17\1\2\u0137\u0139\7\7\2\2\u0138\u013a\5\36\20"+
		"\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c"+
		"\7\b\2\2\u013c\u013d\5\32\16\2\u013d\u013e\b\17\1\2\u013e\35\3\2\2\2\u013f"+
		"\u0140\7\37\2\2\u0140\u0141\7\'\2\2\u0141\u0148\b\20\1\2\u0142\u0143\7"+
		"\34\2\2\u0143\u0144\7\37\2\2\u0144\u0145\7\'\2\2\u0145\u0147\b\20\1\2"+
		"\u0146\u0142\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\37\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\5\6\4\2\u014c"+
		"\u0153\b\21\1\2\u014d\u014e\7\34\2\2\u014e\u014f\5\6\4\2\u014f\u0150\b"+
		"\21\1\2\u0150\u0152\3\2\2\2\u0151\u014d\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0156\u014b\3\2\2\2\u0156\u0157\3\2\2\2\u0157!\3\2\2\2\u0158\u0159"+
		"\7\35\2\2\u0159\u015a\7\7\2\2\u015a\u015b\7\'\2\2\u015b\u015c\7\b\2\2"+
		"\u015c\u0164\b\22\1\2\u015d\u015e\7\36\2\2\u015e\u015f\7\7\2\2\u015f\u0160"+
		"\5\6\4\2\u0160\u0161\7\b\2\2\u0161\u0162\b\22\1\2\u0162\u0164\3\2\2\2"+
		"\u0163\u0158\3\2\2\2\u0163\u015d\3\2\2\2\u0164#\3\2\2\2\u0165\u016c\7"+
		"\16\2\2\u0166\u0168\7 \2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0165\3\2"+
		"\2\2\u016b\u0167\3\2\2\2\u016c%\3\2\2\2\31.\65=CLeqs\u0082\u00a4\u00b9"+
		"\u00cb\u00e3\u0113\u0128\u012e\u0139\u0148\u0153\u0156\u0163\u0169\u016b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}