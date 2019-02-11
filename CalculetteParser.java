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
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, TYPE=22, IDENTIFIANT=23, 
		NEWLINE=24, WS=25, ENTIER=26, UNMATCH=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'readln'", "'println'", "'true'", "'!='", "';'", 
		"'{'", "'>='", "'while'", "'=='", "'<'", "'}'", "'='", "'>'", "'<='", 
		"'('", "')'", "'*'", "'+'", "'-'", "'false'", "TYPE", "IDENTIFIANT", "NEWLINE", 
		"WS", "ENTIER", "UNMATCH"
	};
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_expr = 2, RULE_decl = 3, RULE_instruction = 4, 
		RULE_assignation = 5, RULE_tantque = 6, RULE_condition = 7, RULE_bloc = 8, 
		RULE_entreesortie = 9, RULE_finInstruction = 10;
	public static final String[] ruleNames = {
		"start", "calcul", "expr", "decl", "instruction", "assignation", "tantque", 
		"condition", "bloc", "entreesortie", "finInstruction"
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


	    private TableSymboles tableSymboles = new TableSymboles();

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
			setState(22); calcul();
			setState(23); match(EOF);
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
		public InstructionContext instruction;
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
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(25); ((CalculContext)_localctx).decl = decl();
				 _localctx.code += ((CalculContext)_localctx).decl.code; 
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(33); match(NEWLINE);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__18) | (1L << T__15) | (1L << T__12) | (1L << T__5) | (1L << T__1) | (1L << IDENTIFIANT) | (1L << ENTIER))) != 0)) {
				{
				{
				setState(39); ((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(46);
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
		public ExprContext a;
		public ExprContext e;
		public Token ENTIER;
		public Token IDENTIFIANT;
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
			setState(63);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(50); match(T__1);
				setState(51); ((ExprContext)_localctx).e = expr(4);
				((ExprContext)_localctx).code = "PUSHI 0\n" + ((ExprContext)_localctx).e.code + "SUB\n";
				}
				break;
			case ENTIER:
				{
				setState(54); ((ExprContext)_localctx).ENTIER = match(ENTIER);
				((ExprContext)_localctx).code = "PUSHI "+ ((ExprContext)_localctx).ENTIER.getText() + "\n";
				}
				break;
			case IDENTIFIANT:
				{
				setState(56); ((ExprContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				 ((ExprContext)_localctx).code = "PUSHG "+tableSymboles.getAdresseType((((ExprContext)_localctx).IDENTIFIANT!=null?((ExprContext)_localctx).IDENTIFIANT.getText():null)).adresse + "\n";
				}
				break;
			case T__5:
				{
				setState(58); match(T__5);
				setState(59); ((ExprContext)_localctx).e = expr(0);
				setState(60); match(T__4);
				((ExprContext)_localctx).code = ((ExprContext)_localctx).e.code;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(65);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(66);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__3) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(67); ((ExprContext)_localctx).b = expr(4);
						((ExprContext)_localctx).code = evalexpr(((ExprContext)_localctx).a.code,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null),((ExprContext)_localctx).b.code);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(71);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__1) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(72); ((ExprContext)_localctx).b = expr(3);
						((ExprContext)_localctx).code = evalexpr(((ExprContext)_localctx).a.code,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null),((ExprContext)_localctx).b.code);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80); ((DeclContext)_localctx).TYPE = match(TYPE);
				setState(81); ((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(82); match(T__8);
				setState(83); ((DeclContext)_localctx).expr = expr(0);
				setState(84); finInstruction();
				tableSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null)); ((DeclContext)_localctx).code = "PUSHI 0\n" + ((DeclContext)_localctx).expr.code + "STOREG " + tableSymboles.getAdresseType((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null)).adresse+"\n"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); ((DeclContext)_localctx).TYPE = match(TYPE);
				setState(88); ((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(89); finInstruction();
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
		public EntreesortieContext entreesortie;
		public EntreesortieContext entreesortie() {
			return getRuleContext(EntreesortieContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public TantqueContext tantque() {
			return getRuleContext(TantqueContext.class,0);
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
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); ((InstructionContext)_localctx).a = assignation();
				setState(95); finInstruction();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).a.code;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); ((InstructionContext)_localctx).b = expr(0);
				setState(99); finInstruction();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).b.code;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); ((InstructionContext)_localctx).tantque = tantque();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).tantque.code;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105); ((InstructionContext)_localctx).entreesortie = entreesortie();
				setState(106); finInstruction();
				((InstructionContext)_localctx).code = ((InstructionContext)_localctx).entreesortie.code;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109); finInstruction();
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
			setState(114); ((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(115); match(T__8);
			setState(116); ((AssignationContext)_localctx).expr = expr(0);
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
		public ConditionContext condition;
		public BlocContext bloc;
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
			setState(119); match(T__12);
			setState(120); match(T__5);
			setState(121); ((TantqueContext)_localctx).condition = condition();
			setState(122); match(T__4);
			setState(123); ((TantqueContext)_localctx).bloc = bloc();
			int label1 = nextLabel(); int label2= nextLabel();
			  ((TantqueContext)_localctx).code = "LABEL " + label1 + "\n" + ((TantqueContext)_localctx).condition.code + "JUMPF " + label2 + "\n" + ((TantqueContext)_localctx).bloc.code + "JUMP " + label1 + "\nLABEL " + label2 + "\n";
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
		enterRule(_localctx, 14, RULE_condition);
		try {
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); match(T__17);
				 ((ConditionContext)_localctx).code =  "PUSHI 1\n"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); match(T__0);
				 ((ConditionContext)_localctx).code =  "PUSHI 0\n"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130); ((ConditionContext)_localctx).a = expr(0);
				setState(131); match(T__10);
				setState(132); ((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "INF\n";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135); ((ConditionContext)_localctx).a = expr(0);
				setState(136); match(T__6);
				setState(137); ((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "INFEQ\n";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140); ((ConditionContext)_localctx).a = expr(0);
				setState(141); match(T__7);
				setState(142); ((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "SUP\n";
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145); ((ConditionContext)_localctx).a = expr(0);
				setState(146); match(T__13);
				setState(147); ((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "SUPEQ\n";
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(150); ((ConditionContext)_localctx).a = expr(0);
				setState(151); match(T__11);
				setState(152); ((ConditionContext)_localctx).b = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "EQUAL\n";
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(155); ((ConditionContext)_localctx).a = expr(0);
				setState(156); match(T__16);
				setState(157); ((ConditionContext)_localctx).b = expr(0);
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
		enterRule(_localctx, 16, RULE_bloc);
		 ((BlocContext)_localctx).code =  new String();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(T__14);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__18) | (1L << T__15) | (1L << T__12) | (1L << T__5) | (1L << T__1) | (1L << IDENTIFIANT) | (1L << ENTIER))) != 0)) {
				{
				{
				setState(163); ((BlocContext)_localctx).instruction = instruction();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169); match(T__9);
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
		enterRule(_localctx, 18, RULE_entreesortie);
		try {
			setState(183);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); match(T__19);
				setState(173); match(T__5);
				setState(174); ((EntreesortieContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(175); match(T__4);
				 ((EntreesortieContext)_localctx).code = "READ\nSTOREG "+tableSymboles.getAdresseType((((EntreesortieContext)_localctx).IDENTIFIANT!=null?((EntreesortieContext)_localctx).IDENTIFIANT.getText():null)).adresse+"\n"; 
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); match(T__18);
				setState(178); match(T__5);
				setState(179); ((EntreesortieContext)_localctx).expr = expr(0);
				setState(180); match(T__4);
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
		enterRule(_localctx, 20, RULE_finInstruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(T__15);
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
		case 0: return precpred(_ctx, 3);
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u00be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\7"+
		"\3%\n\3\f\3\16\3(\13\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6s\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a3\n\t\3\n\3\n\7\n\u00a7\n\n\f"+
		"\n\16\n\u00aa\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00ba\n\13\3\f\3\f\3\f\2\3\6\r\2\4\6\b\n\f\16\20"+
		"\22\24\26\2\4\4\2\3\3\24\24\3\2\25\26\u00c8\2\30\3\2\2\2\4 \3\2\2\2\6"+
		"A\3\2\2\2\b^\3\2\2\2\nr\3\2\2\2\ft\3\2\2\2\16y\3\2\2\2\20\u00a2\3\2\2"+
		"\2\22\u00a4\3\2\2\2\24\u00b9\3\2\2\2\26\u00bb\3\2\2\2\30\31\5\4\3\2\31"+
		"\32\7\2\2\3\32\3\3\2\2\2\33\34\5\b\5\2\34\35\b\3\1\2\35\37\3\2\2\2\36"+
		"\33\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!&\3\2\2\2\" \3\2\2\2#%"+
		"\7\32\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'.\3\2\2\2(&\3\2\2"+
		"\2)*\5\n\6\2*+\b\3\1\2+-\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2"+
		"\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\b\3\1\2\62\5\3\2\2\2\63\64\b\4\1\2"+
		"\64\65\7\26\2\2\65\66\5\6\4\6\66\67\b\4\1\2\67B\3\2\2\289\7\34\2\29B\b"+
		"\4\1\2:;\7\31\2\2;B\b\4\1\2<=\7\22\2\2=>\5\6\4\2>?\7\23\2\2?@\b\4\1\2"+
		"@B\3\2\2\2A\63\3\2\2\2A8\3\2\2\2A:\3\2\2\2A<\3\2\2\2BO\3\2\2\2CD\f\5\2"+
		"\2DE\t\2\2\2EF\5\6\4\6FG\b\4\1\2GN\3\2\2\2HI\f\4\2\2IJ\t\3\2\2JK\5\6\4"+
		"\5KL\b\4\1\2LN\3\2\2\2MC\3\2\2\2MH\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2"+
		"\2P\7\3\2\2\2QO\3\2\2\2RS\7\30\2\2ST\7\31\2\2TU\7\17\2\2UV\5\6\4\2VW\5"+
		"\26\f\2WX\b\5\1\2X_\3\2\2\2YZ\7\30\2\2Z[\7\31\2\2[\\\5\26\f\2\\]\b\5\1"+
		"\2]_\3\2\2\2^R\3\2\2\2^Y\3\2\2\2_\t\3\2\2\2`a\5\f\7\2ab\5\26\f\2bc\b\6"+
		"\1\2cs\3\2\2\2de\5\6\4\2ef\5\26\f\2fg\b\6\1\2gs\3\2\2\2hi\5\16\b\2ij\b"+
		"\6\1\2js\3\2\2\2kl\5\24\13\2lm\5\26\f\2mn\b\6\1\2ns\3\2\2\2op\5\26\f\2"+
		"pq\b\6\1\2qs\3\2\2\2r`\3\2\2\2rd\3\2\2\2rh\3\2\2\2rk\3\2\2\2ro\3\2\2\2"+
		"s\13\3\2\2\2tu\7\31\2\2uv\7\17\2\2vw\5\6\4\2wx\b\7\1\2x\r\3\2\2\2yz\7"+
		"\13\2\2z{\7\22\2\2{|\5\20\t\2|}\7\23\2\2}~\5\22\n\2~\177\b\b\1\2\177\17"+
		"\3\2\2\2\u0080\u0081\7\6\2\2\u0081\u00a3\b\t\1\2\u0082\u0083\7\27\2\2"+
		"\u0083\u00a3\b\t\1\2\u0084\u0085\5\6\4\2\u0085\u0086\7\r\2\2\u0086\u0087"+
		"\5\6\4\2\u0087\u0088\b\t\1\2\u0088\u00a3\3\2\2\2\u0089\u008a\5\6\4\2\u008a"+
		"\u008b\7\21\2\2\u008b\u008c\5\6\4\2\u008c\u008d\b\t\1\2\u008d\u00a3\3"+
		"\2\2\2\u008e\u008f\5\6\4\2\u008f\u0090\7\20\2\2\u0090\u0091\5\6\4\2\u0091"+
		"\u0092\b\t\1\2\u0092\u00a3\3\2\2\2\u0093\u0094\5\6\4\2\u0094\u0095\7\n"+
		"\2\2\u0095\u0096\5\6\4\2\u0096\u0097\b\t\1\2\u0097\u00a3\3\2\2\2\u0098"+
		"\u0099\5\6\4\2\u0099\u009a\7\f\2\2\u009a\u009b\5\6\4\2\u009b\u009c\b\t"+
		"\1\2\u009c\u00a3\3\2\2\2\u009d\u009e\5\6\4\2\u009e\u009f\7\7\2\2\u009f"+
		"\u00a0\5\6\4\2\u00a0\u00a1\b\t\1\2\u00a1\u00a3\3\2\2\2\u00a2\u0080\3\2"+
		"\2\2\u00a2\u0082\3\2\2\2\u00a2\u0084\3\2\2\2\u00a2\u0089\3\2\2\2\u00a2"+
		"\u008e\3\2\2\2\u00a2\u0093\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2\u009d\3\2"+
		"\2\2\u00a3\21\3\2\2\2\u00a4\u00a8\7\t\2\2\u00a5\u00a7\5\n\6\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\16\2\2\u00ac\u00ad\b"+
		"\n\1\2\u00ad\23\3\2\2\2\u00ae\u00af\7\4\2\2\u00af\u00b0\7\22\2\2\u00b0"+
		"\u00b1\7\31\2\2\u00b1\u00b2\7\23\2\2\u00b2\u00ba\b\13\1\2\u00b3\u00b4"+
		"\7\5\2\2\u00b4\u00b5\7\22\2\2\u00b5\u00b6\5\6\4\2\u00b6\u00b7\7\23\2\2"+
		"\u00b7\u00b8\b\13\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00ae\3\2\2\2\u00b9\u00b3"+
		"\3\2\2\2\u00ba\25\3\2\2\2\u00bb\u00bc\7\b\2\2\u00bc\27\3\2\2\2\r &.AM"+
		"O^r\u00a2\u00a8\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}