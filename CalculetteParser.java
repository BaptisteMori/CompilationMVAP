// Generated from Calculette.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__27=1, T__26=2, T__25=3, T__24=4, T__23=5, T__22=6, T__21=7, T__20=8, 
		T__19=9, T__18=10, T__17=11, T__16=12, T__15=13, T__14=14, T__13=15, T__12=16, 
		T__11=17, T__10=18, T__9=19, T__8=20, T__7=21, T__6=22, T__5=23, T__4=24, 
		T__3=25, T__2=26, T__1=27, T__0=28, TYPE=29, NEWLINE=30, WS=31, ENTIER=32, 
		AND=33, OR=34, NOT=35, RETOUR=36, IDENTIFIANT=37, UNMATCH=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'readln'", "'true'", "'!='", "'{'", "';'", "'while'", 
		"'}'", "'='", "'for'", "'if'", "'<='", "'('", "'*'", "','", "'repeat'", 
		"'false'", "'println'", "'>='", "'=='", "'<'", "'>'", "'until'", "'<>'", 
		"'else'", "')'", "'+'", "'-'", "TYPE", "NEWLINE", "WS", "ENTIER", "AND", 
		"OR", "NOT", "'return'", "IDENTIFIANT", "UNMATCH"
	};
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_expr = 2, RULE_decl = 3, RULE_instruction = 4, 
		RULE_assignation = 5, RULE_tantque = 6, RULE_si = 7, RULE_pour = 8, RULE_dowhile = 9, 
		RULE_condition = 10, RULE_logique = 11, RULE_bloc = 12, RULE_fonction = 13, 
		RULE_params = 14, RULE_args = 15, RULE_entreesortie = 16, RULE_finInstruction = 17;
	public static final String[] ruleNames = {
		"start", "calcul", "expr", "decl", "instruction", "assignation", "tantque", 
		"si", "pour", "dowhile", "condition", "logique", "bloc", "fonction", "params", 
		"args", "entreesortie", "finInstruction"
	};

	@Override
	public String getGrammarFileName() { return "Calculette.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
			setState(36); calcul();
			setState(37); match(EOF);
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
		public List<FonctionContext> fonction() {
			return getRuleContexts(FonctionContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public FonctionContext fonction(int i) {
			return getRuleContext(FonctionContext.class,i);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
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
					setState(39); ((CalculContext)_localctx).decl = decl();
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
					setState(48); match(NEWLINE);
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
				setState(54); ((CalculContext)_localctx).fonction = fonction();
				 _localctx.code += ((CalculContext)_localctx).fonction.code; 
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(62); match(NEWLINE);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "LABEL " + entry + "\n"; 
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__22) | (1L << T__21) | (1L << T__18) | (1L << T__17) | (1L << T__15) | (1L << T__12) | (1L << T__10) | (1L << T__0) | (1L << ENTIER) | (1L << RETOUR) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(69); ((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "HALT\n"; 
			}
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
		public ExprContext e;
		public Token ENTIER;
		public Token IDENTIFIANT;
		public ArgsContext args;
		public Token op;
		public ExprContext b;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ENTIER() { return getToken(CalculetteParser.ENTIER, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
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
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(80); match(T__0);
				setState(81); ((ExprContext)_localctx).e = expr(5);
				((ExprContext)_localctx).code = "PUSHI 0\n" + ((ExprContext)_localctx).e.code + "SUB\n";
				}
				break;
			case 2:
				{
				setState(84); ((ExprContext)_localctx).ENTIER = match(ENTIER);
				((ExprContext)_localctx).code = "PUSHI "+ ((ExprContext)_localctx).ENTIER.getText() + "\n";
				}
				break;
			case 3:
				{
				setState(86); ((ExprContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				 ((ExprContext)_localctx).code = "PUSHG "+tableSymboles.getAdresseType((((ExprContext)_localctx).IDENTIFIANT!=null?((ExprContext)_localctx).IDENTIFIANT.getText():null)).adresse + "\n";
				}
				break;
			case 4:
				{
				setState(88); match(T__15);
				setState(89); ((ExprContext)_localctx).e = expr(0);
				setState(90); match(T__2);
				((ExprContext)_localctx).code = ((ExprContext)_localctx).e.code;
				}
				break;
			case 5:
				{
				setState(93); ((ExprContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(94); match(T__15);
				setState(95); ((ExprContext)_localctx).args = args();
				setState(96); match(T__2);
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
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(102);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__14) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(103); ((ExprContext)_localctx).b = expr(5);
						((ExprContext)_localctx).code = evalexpr(((ExprContext)_localctx).a.code,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null),((ExprContext)_localctx).b.code);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(107);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__0) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(108); ((ExprContext)_localctx).b = expr(4);
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
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
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
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); ((DeclContext)_localctx).TYPE = match(TYPE);
				setState(117); ((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(118); match(T__19);
				setState(119); ((DeclContext)_localctx).expr = expr(0);
				setState(120); finInstruction();
				tableSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null)); ((DeclContext)_localctx).code = "PUSHI 0\n" + ((DeclContext)_localctx).expr.code + "STOREG " + tableSymboles.getAdresseType((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null)).adresse+"\n"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); ((DeclContext)_localctx).TYPE = match(TYPE);
				setState(124); ((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(125); finInstruction();
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
		public EntreesortieContext entreesortie() {
			return getRuleContext(EntreesortieContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public DowhileContext dowhile() {
			return getRuleContext(DowhileContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public TerminalNode RETOUR() { return getToken(CalculetteParser.RETOUR, 0); }
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public TantqueContext tantque() {
			return getRuleContext(TantqueContext.class,0);
		}
		public PourContext pour() {
			return getRuleContext(PourContext.class,0);
		}
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
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); ((InstructionContext)_localctx).a = assignation();
				setState(131); finInstruction();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).a.code;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134); ((InstructionContext)_localctx).b = expr(0);
				setState(135); finInstruction();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).b.code;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138); ((InstructionContext)_localctx).tantque = tantque();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).tantque.code;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141); ((InstructionContext)_localctx).si = si();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).si.code;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144); ((InstructionContext)_localctx).pour = pour();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).pour.code;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(147); ((InstructionContext)_localctx).dowhile = dowhile();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).dowhile.code;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(150); ((InstructionContext)_localctx).entreesortie = entreesortie();
				setState(151); finInstruction();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).entreesortie.code;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(154); match(RETOUR);
				setState(155); ((InstructionContext)_localctx).expr = expr(0);
				setState(156); finInstruction();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).expr.code + "STOREL " + tableSymboles.getAdresseType("return").adresse + "\n";
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(159); finInstruction();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
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
			setState(164); ((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(165); match(T__19);
			setState(166); ((AssignationContext)_localctx).expr = expr(0);
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
		public BlocContext bloc;
		public LogiqueContext logique() {
			return getRuleContext(LogiqueContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(T__21);
			setState(170); match(T__15);
			setState(171); ((TantqueContext)_localctx).logique = logique();
			setState(172); match(T__2);
			setState(173); ((TantqueContext)_localctx).bloc = bloc();
			int label1 = nextLabel(); int label2= nextLabel();
			  ((TantqueContext)_localctx).code = "LABEL " + label1 + "\n" + ((TantqueContext)_localctx).logique.code + "JUMPF " + label2 + "\n" + ((TantqueContext)_localctx).bloc.code + "JUMP " + label1 + "\nLABEL " + label2 + "\n";
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
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
		public LogiqueContext logique() {
			return getRuleContext(LogiqueContext.class,0);
		}
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
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
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176); match(T__17);
				setState(177); match(T__15);
				setState(178); ((SiContext)_localctx).logique = logique();
				setState(179); match(T__2);
				setState(180); ((SiContext)_localctx).then = bloc();
				setState(181); match(T__3);
				setState(182); ((SiContext)_localctx).sinon = bloc();
				int iflabel = nextLabel(); int endlabel = nextLabel();
				    ((SiContext)_localctx).code = ((SiContext)_localctx).logique.code + "JUMPF " + iflabel + "\n" + ((SiContext)_localctx).then.code + "JUMP " + endlabel + "\nLABEL " + iflabel + "\n" + ((SiContext)_localctx).sinon.code + "LABEL " + endlabel + "\n";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); match(T__17);
				setState(186); match(T__15);
				setState(187); ((SiContext)_localctx).logique = logique();
				setState(188); match(T__2);
				setState(189); ((SiContext)_localctx).then = bloc();
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
		public BlocContext bloc;
		public List<AssignationContext> assignation() {
			return getRuleContexts(AssignationContext.class);
		}
		public AssignationContext assignation(int i) {
			return getRuleContext(AssignationContext.class,i);
		}
		public LogiqueContext logique() {
			return getRuleContext(LogiqueContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(T__18);
			setState(195); match(T__15);
			setState(196); ((PourContext)_localctx).init = assignation();
			setState(197); match(T__22);
			setState(198); ((PourContext)_localctx).logique = logique();
			setState(199); match(T__22);
			setState(200); ((PourContext)_localctx).cont = assignation();
			setState(201); match(T__2);
			setState(202); ((PourContext)_localctx).bloc = bloc();
			 int forlabel = nextLabel(); int endlabel = nextLabel();
			    ((PourContext)_localctx).code = ((PourContext)_localctx).init.code + "LABEL " + forlabel + ((PourContext)_localctx).logique.code + "\nJUMPF " + endlabel+ "\n" + ((PourContext)_localctx).bloc.code + ((PourContext)_localctx).cont.code + "JUMP " + forlabel + "\nLABEL " + endlabel + "\n"; 
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
		public LogiqueContext logique() {
			return getRuleContext(LogiqueContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
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
			setState(205); match(T__12);
			setState(206); ((DowhileContext)_localctx).bloc = bloc();
			setState(207); match(T__5);
			setState(208); match(T__15);
			setState(209); ((DowhileContext)_localctx).logique = logique();
			setState(210); match(T__2);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); match(T__25);
				 ((ConditionContext)_localctx).code =  "PUSHI 1\n"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); match(T__11);
				 ((ConditionContext)_localctx).code =  "PUSHI 0\n"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217); ((ConditionContext)_localctx).a = expr(0);
				setState(218); match(T__7);
				setState(219); ((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "INF\n";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222); ((ConditionContext)_localctx).a = expr(0);
				setState(223); match(T__16);
				setState(224); ((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "INFEQ\n";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227); ((ConditionContext)_localctx).a = expr(0);
				setState(228); match(T__6);
				setState(229); ((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "SUP\n";
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232); ((ConditionContext)_localctx).a = expr(0);
				setState(233); match(T__9);
				setState(234); ((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "SUPEQ\n";
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(237); ((ConditionContext)_localctx).a = expr(0);
				setState(238); match(T__8);
				setState(239); ((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "EQUAL\n";
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(242); ((ConditionContext)_localctx).a = expr(0);
				setState(243);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(244); ((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "NEQ\n";
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
		public TerminalNode NOT() { return getToken(CalculetteParser.NOT, 0); }
		public TerminalNode AND() { return getToken(CalculetteParser.AND, 0); }
		public TerminalNode OR() { return getToken(CalculetteParser.OR, 0); }
		public LogiqueContext logique() {
			return getRuleContext(LogiqueContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
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
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); ((LogiqueContext)_localctx).condition = condition();
				setState(250); match(AND);
				setState(251); ((LogiqueContext)_localctx).a = logique();
				((LogiqueContext)_localctx).code =  ((LogiqueContext)_localctx).condition.code + ((LogiqueContext)_localctx).a.code + "MUL\n"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); ((LogiqueContext)_localctx).condition = condition();
				setState(255); match(OR);
				setState(256); ((LogiqueContext)_localctx).a = logique();
				((LogiqueContext)_localctx).code =  ((LogiqueContext)_localctx).condition.code + ((LogiqueContext)_localctx).a.code + "\nPUSHI 0\nNEQ\n";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259); ((LogiqueContext)_localctx).condition = condition();
				((LogiqueContext)_localctx).code = ((LogiqueContext)_localctx).condition.code;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262); match(NOT);
				setState(263); match(T__15);
				setState(264); ((LogiqueContext)_localctx).condition = condition();
				setState(265); match(T__2);
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
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
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
			setState(270); match(T__23);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__22) | (1L << T__21) | (1L << T__18) | (1L << T__17) | (1L << T__15) | (1L << T__12) | (1L << T__10) | (1L << T__0) | (1L << ENTIER) | (1L << RETOUR) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(271); ((BlocContext)_localctx).instruction = instruction();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277); match(T__20);
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
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
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
			setState(280); ((FonctionContext)_localctx).TYPE = match(TYPE);
			setState(281); ((FonctionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			int label = nextLabel();
			          ((FonctionContext)_localctx).code = "LABEL " + label + "\n";
			          tableSymboles.nouvelleFonction((((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null), label, (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));
			          tableSymboles.putVar("return", (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));
			setState(283); match(T__15);
			setState(285);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(284); params();
				}
			}

			setState(287); match(T__2);
			setState(288); ((FonctionContext)_localctx).bloc = bloc();
			_localctx.code+=((FonctionContext)_localctx).bloc.code;
			}
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
		public TerminalNode IDENTIFIANT(int i) {
			return getToken(CalculetteParser.IDENTIFIANT, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(CalculetteParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CalculetteParser.TYPE, i);
		}
		public List<TerminalNode> IDENTIFIANT() { return getTokens(CalculetteParser.IDENTIFIANT); }
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
			setState(291); ((ParamsContext)_localctx).TYPE = match(TYPE);
			setState(292); ((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			tableSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null), (((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null));
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(294); match(T__13);
				setState(295); ((ParamsContext)_localctx).TYPE = match(TYPE);
				setState(296); ((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				tableSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null), (((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null));
				}
				}
				setState(302);
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
			setState(314);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__0) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
				{
				setState(303); ((ArgsContext)_localctx).expr = expr(0);

				      _localctx.code+=((ArgsContext)_localctx).expr.code+"\n";
				      _localctx.size+=1;
				        // code java pour première expression pour arg1
				    
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(305); match(T__13);
					setState(306); ((ArgsContext)_localctx).expr = expr(0);

					      _localctx.code+=((ArgsContext)_localctx).expr.code+"\n";
					      _localctx.size+=1;
					        // code java pour expression suivante pour argi
					    
					}
					}
					setState(313);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
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
			setState(327);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(316); match(T__26);
				setState(317); match(T__15);
				setState(318); ((EntreesortieContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(319); match(T__2);
				 ((EntreesortieContext)_localctx).code = "READ\nSTOREG "+tableSymboles.getAdresseType((((EntreesortieContext)_localctx).IDENTIFIANT!=null?((EntreesortieContext)_localctx).IDENTIFIANT.getText():null)).adresse+"\n"; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(321); match(T__10);
				setState(322); match(T__15);
				setState(323); ((EntreesortieContext)_localctx).expr = expr(0);
				setState(324); match(T__2);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(T__22);
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
		case 2: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		case 1: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u014e\4\2\t\2\4"+
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
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c3\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00fa\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u010f\n\r\3\16\3\16\7\16\u0113\n\16\f\16\16"+
		"\16\u0116\13\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0120\n\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u012d\n\20"+
		"\f\20\16\20\u0130\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0138\n\21"+
		"\f\21\16\21\u013b\13\21\5\21\u013d\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u014a\n\22\3\23\3\23\3\23\2\3\6\24\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\4\2\3\3\20\20\3\2\35\36\4"+
		"\2\6\6\32\32\u0160\2&\3\2\2\2\4.\3\2\2\2\6e\3\2\2\2\b\u0082\3\2\2\2\n"+
		"\u00a4\3\2\2\2\f\u00a6\3\2\2\2\16\u00ab\3\2\2\2\20\u00c2\3\2\2\2\22\u00c4"+
		"\3\2\2\2\24\u00cf\3\2\2\2\26\u00f9\3\2\2\2\30\u010e\3\2\2\2\32\u0110\3"+
		"\2\2\2\34\u011a\3\2\2\2\36\u0125\3\2\2\2 \u013c\3\2\2\2\"\u0149\3\2\2"+
		"\2$\u014b\3\2\2\2&\'\5\4\3\2\'(\7\2\2\3(\3\3\2\2\2)*\5\b\5\2*+\b\3\1\2"+
		"+-\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3"+
		"\2\2\2\61\65\b\3\1\2\62\64\7 \2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3"+
		"\2\2\2\65\66\3\2\2\2\66=\3\2\2\2\67\65\3\2\2\289\5\34\17\29:\b\3\1\2:"+
		"<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>C\3\2\2\2?=\3\2\2\2"+
		"@B\7 \2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2"+
		"FL\b\3\1\2GH\5\n\6\2HI\b\3\1\2IK\3\2\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2"+
		"LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\b\3\1\2P\5\3\2\2\2QR\b\4\1\2RS\7\36\2"+
		"\2ST\5\6\4\7TU\b\4\1\2Uf\3\2\2\2VW\7\"\2\2Wf\b\4\1\2XY\7\'\2\2Yf\b\4\1"+
		"\2Z[\7\17\2\2[\\\5\6\4\2\\]\7\34\2\2]^\b\4\1\2^f\3\2\2\2_`\7\'\2\2`a\7"+
		"\17\2\2ab\5 \21\2bc\7\34\2\2cd\b\4\1\2df\3\2\2\2eQ\3\2\2\2eV\3\2\2\2e"+
		"X\3\2\2\2eZ\3\2\2\2e_\3\2\2\2fs\3\2\2\2gh\f\6\2\2hi\t\2\2\2ij\5\6\4\7"+
		"jk\b\4\1\2kr\3\2\2\2lm\f\5\2\2mn\t\3\2\2no\5\6\4\6op\b\4\1\2pr\3\2\2\2"+
		"qg\3\2\2\2ql\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\7\3\2\2\2us\3\2\2"+
		"\2vw\7\37\2\2wx\7\'\2\2xy\7\13\2\2yz\5\6\4\2z{\5$\23\2{|\b\5\1\2|\u0083"+
		"\3\2\2\2}~\7\37\2\2~\177\7\'\2\2\177\u0080\5$\23\2\u0080\u0081\b\5\1\2"+
		"\u0081\u0083\3\2\2\2\u0082v\3\2\2\2\u0082}\3\2\2\2\u0083\t\3\2\2\2\u0084"+
		"\u0085\5\f\7\2\u0085\u0086\5$\23\2\u0086\u0087\b\6\1\2\u0087\u00a5\3\2"+
		"\2\2\u0088\u0089\5\6\4\2\u0089\u008a\5$\23\2\u008a\u008b\b\6\1\2\u008b"+
		"\u00a5\3\2\2\2\u008c\u008d\5\16\b\2\u008d\u008e\b\6\1\2\u008e\u00a5\3"+
		"\2\2\2\u008f\u0090\5\20\t\2\u0090\u0091\b\6\1\2\u0091\u00a5\3\2\2\2\u0092"+
		"\u0093\5\22\n\2\u0093\u0094\b\6\1\2\u0094\u00a5\3\2\2\2\u0095\u0096\5"+
		"\24\13\2\u0096\u0097\b\6\1\2\u0097\u00a5\3\2\2\2\u0098\u0099\5\"\22\2"+
		"\u0099\u009a\5$\23\2\u009a\u009b\b\6\1\2\u009b\u00a5\3\2\2\2\u009c\u009d"+
		"\7&\2\2\u009d\u009e\5\6\4\2\u009e\u009f\5$\23\2\u009f\u00a0\b\6\1\2\u00a0"+
		"\u00a5\3\2\2\2\u00a1\u00a2\5$\23\2\u00a2\u00a3\b\6\1\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u0084\3\2\2\2\u00a4\u0088\3\2\2\2\u00a4\u008c\3\2\2\2\u00a4"+
		"\u008f\3\2\2\2\u00a4\u0092\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4\u0098\3\2"+
		"\2\2\u00a4\u009c\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5\13\3\2\2\2\u00a6\u00a7"+
		"\7\'\2\2\u00a7\u00a8\7\13\2\2\u00a8\u00a9\5\6\4\2\u00a9\u00aa\b\7\1\2"+
		"\u00aa\r\3\2\2\2\u00ab\u00ac\7\t\2\2\u00ac\u00ad\7\17\2\2\u00ad\u00ae"+
		"\5\30\r\2\u00ae\u00af\7\34\2\2\u00af\u00b0\5\32\16\2\u00b0\u00b1\b\b\1"+
		"\2\u00b1\17\3\2\2\2\u00b2\u00b3\7\r\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00b5"+
		"\5\30\r\2\u00b5\u00b6\7\34\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8\7\33"+
		"\2\2\u00b8\u00b9\5\32\16\2\u00b9\u00ba\b\t\1\2\u00ba\u00c3\3\2\2\2\u00bb"+
		"\u00bc\7\r\2\2\u00bc\u00bd\7\17\2\2\u00bd\u00be\5\30\r\2\u00be\u00bf\7"+
		"\34\2\2\u00bf\u00c0\5\32\16\2\u00c0\u00c1\b\t\1\2\u00c1\u00c3\3\2\2\2"+
		"\u00c2\u00b2\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c3\21\3\2\2\2\u00c4\u00c5"+
		"\7\f\2\2\u00c5\u00c6\7\17\2\2\u00c6\u00c7\5\f\7\2\u00c7\u00c8\7\b\2\2"+
		"\u00c8\u00c9\5\30\r\2\u00c9\u00ca\7\b\2\2\u00ca\u00cb\5\f\7\2\u00cb\u00cc"+
		"\7\34\2\2\u00cc\u00cd\5\32\16\2\u00cd\u00ce\b\n\1\2\u00ce\23\3\2\2\2\u00cf"+
		"\u00d0\7\22\2\2\u00d0\u00d1\5\32\16\2\u00d1\u00d2\7\31\2\2\u00d2\u00d3"+
		"\7\17\2\2\u00d3\u00d4\5\30\r\2\u00d4\u00d5\7\34\2\2\u00d5\u00d6\b\13\1"+
		"\2\u00d6\25\3\2\2\2\u00d7\u00d8\7\5\2\2\u00d8\u00fa\b\f\1\2\u00d9\u00da"+
		"\7\23\2\2\u00da\u00fa\b\f\1\2\u00db\u00dc\5\6\4\2\u00dc\u00dd\7\27\2\2"+
		"\u00dd\u00de\5\6\4\2\u00de\u00df\b\f\1\2\u00df\u00fa\3\2\2\2\u00e0\u00e1"+
		"\5\6\4\2\u00e1\u00e2\7\16\2\2\u00e2\u00e3\5\6\4\2\u00e3\u00e4\b\f\1\2"+
		"\u00e4\u00fa\3\2\2\2\u00e5\u00e6\5\6\4\2\u00e6\u00e7\7\30\2\2\u00e7\u00e8"+
		"\5\6\4\2\u00e8\u00e9\b\f\1\2\u00e9\u00fa\3\2\2\2\u00ea\u00eb\5\6\4\2\u00eb"+
		"\u00ec\7\25\2\2\u00ec\u00ed\5\6\4\2\u00ed\u00ee\b\f\1\2\u00ee\u00fa\3"+
		"\2\2\2\u00ef\u00f0\5\6\4\2\u00f0\u00f1\7\26\2\2\u00f1\u00f2\5\6\4\2\u00f2"+
		"\u00f3\b\f\1\2\u00f3\u00fa\3\2\2\2\u00f4\u00f5\5\6\4\2\u00f5\u00f6\t\4"+
		"\2\2\u00f6\u00f7\5\6\4\2\u00f7\u00f8\b\f\1\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00d7\3\2\2\2\u00f9\u00d9\3\2\2\2\u00f9\u00db\3\2\2\2\u00f9\u00e0\3\2"+
		"\2\2\u00f9\u00e5\3\2\2\2\u00f9\u00ea\3\2\2\2\u00f9\u00ef\3\2\2\2\u00f9"+
		"\u00f4\3\2\2\2\u00fa\27\3\2\2\2\u00fb\u00fc\5\26\f\2\u00fc\u00fd\7#\2"+
		"\2\u00fd\u00fe\5\30\r\2\u00fe\u00ff\b\r\1\2\u00ff\u010f\3\2\2\2\u0100"+
		"\u0101\5\26\f\2\u0101\u0102\7$\2\2\u0102\u0103\5\30\r\2\u0103\u0104\b"+
		"\r\1\2\u0104\u010f\3\2\2\2\u0105\u0106\5\26\f\2\u0106\u0107\b\r\1\2\u0107"+
		"\u010f\3\2\2\2\u0108\u0109\7%\2\2\u0109\u010a\7\17\2\2\u010a\u010b\5\26"+
		"\f\2\u010b\u010c\7\34\2\2\u010c\u010d\b\r\1\2\u010d\u010f\3\2\2\2\u010e"+
		"\u00fb\3\2\2\2\u010e\u0100\3\2\2\2\u010e\u0105\3\2\2\2\u010e\u0108\3\2"+
		"\2\2\u010f\31\3\2\2\2\u0110\u0114\7\7\2\2\u0111\u0113\5\n\6\2\u0112\u0111"+
		"\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\n\2\2\u0118\u0119\b\16"+
		"\1\2\u0119\33\3\2\2\2\u011a\u011b\7\37\2\2\u011b\u011c\7\'\2\2\u011c\u011d"+
		"\b\17\1\2\u011d\u011f\7\17\2\2\u011e\u0120\5\36\20\2\u011f\u011e\3\2\2"+
		"\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\34\2\2\u0122"+
		"\u0123\5\32\16\2\u0123\u0124\b\17\1\2\u0124\35\3\2\2\2\u0125\u0126\7\37"+
		"\2\2\u0126\u0127\7\'\2\2\u0127\u012e\b\20\1\2\u0128\u0129\7\21\2\2\u0129"+
		"\u012a\7\37\2\2\u012a\u012b\7\'\2\2\u012b\u012d\b\20\1\2\u012c\u0128\3"+
		"\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\37\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\5\6\4\2\u0132\u0139\b\21\1"+
		"\2\u0133\u0134\7\21\2\2\u0134\u0135\5\6\4\2\u0135\u0136\b\21\1\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0133\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u0131\3\2\2\2\u013c\u013d\3\2\2\2\u013d!\3\2\2\2\u013e\u013f\7\4\2\2"+
		"\u013f\u0140\7\17\2\2\u0140\u0141\7\'\2\2\u0141\u0142\7\34\2\2\u0142\u014a"+
		"\b\22\1\2\u0143\u0144\7\24\2\2\u0144\u0145\7\17\2\2\u0145\u0146\5\6\4"+
		"\2\u0146\u0147\7\34\2\2\u0147\u0148\b\22\1\2\u0148\u014a\3\2\2\2\u0149"+
		"\u013e\3\2\2\2\u0149\u0143\3\2\2\2\u014a#\3\2\2\2\u014b\u014c\7\b\2\2"+
		"\u014c%\3\2\2\2\25.\65=CLeqs\u0082\u00a4\u00c2\u00f9\u010e\u0114\u011f"+
		"\u012e\u0139\u013c\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}