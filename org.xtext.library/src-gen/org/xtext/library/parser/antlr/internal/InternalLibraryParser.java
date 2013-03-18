package org.xtext.library.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.library.services.LibraryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLibraryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ISBN", "RULE_YEAR", "RULE_STRING", "RULE_WHAT", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'Search'", "'book'", "'by'", "'year'", "'author'", "'Borrow'", "'Add'", "','", "'written'", "'Remove'", "'Return'", "'Check'", "'status'", "'Show'", "'all'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
    };
    public static final int RULE_ID=11;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_HEX=8;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_DECIMAL=10;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=12;
    public static final int RULE_STRING=6;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_WHAT=7;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_ISBN=4;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=9;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;
    public static final int RULE_YEAR=5;

    // delegates
    // delegators


        public InternalLibraryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLibraryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLibraryParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g"; }



     	private LibraryGrammarAccess grammarAccess;
     	
        public InternalLibraryParser(TokenStream input, LibraryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected LibraryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:76:1: ruleModel returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:79:28: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:80:1: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:80:1: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ISBN||LA1_0==17||(LA1_0>=22 && LA1_0<=23)||(LA1_0>=26 && LA1_0<=28)||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:81:1: (lv_commands_0_0= ruleCommand )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:81:1: (lv_commands_0_0= ruleCommand )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:82:3: lv_commands_0_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCommand_in_ruleModel130);
            	    lv_commands_0_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"commands",
            	              		lv_commands_0_0, 
            	              		"Command");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:106:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:107:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:108:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand166);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:115:1: ruleCommand returns [EObject current=null] : (this_Borrow_0= ruleBorrow | this_Add_1= ruleAdd | this_Return_2= ruleReturn | this_Remove_3= ruleRemove | this_Check_4= ruleCheck | this_Search_5= ruleSearch | this_Show_6= ruleShow | this_AddAuthor_7= ruleAddAuthor ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Borrow_0 = null;

        EObject this_Add_1 = null;

        EObject this_Return_2 = null;

        EObject this_Remove_3 = null;

        EObject this_Check_4 = null;

        EObject this_Search_5 = null;

        EObject this_Show_6 = null;

        EObject this_AddAuthor_7 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:118:28: ( (this_Borrow_0= ruleBorrow | this_Add_1= ruleAdd | this_Return_2= ruleReturn | this_Remove_3= ruleRemove | this_Check_4= ruleCheck | this_Search_5= ruleSearch | this_Show_6= ruleShow | this_AddAuthor_7= ruleAddAuthor ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:119:1: (this_Borrow_0= ruleBorrow | this_Add_1= ruleAdd | this_Return_2= ruleReturn | this_Remove_3= ruleRemove | this_Check_4= ruleCheck | this_Search_5= ruleSearch | this_Show_6= ruleShow | this_AddAuthor_7= ruleAddAuthor )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:119:1: (this_Borrow_0= ruleBorrow | this_Add_1= ruleAdd | this_Return_2= ruleReturn | this_Remove_3= ruleRemove | this_Check_4= ruleCheck | this_Search_5= ruleSearch | this_Show_6= ruleShow | this_AddAuthor_7= ruleAddAuthor )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            case 28:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            case 30:
                {
                alt2=7;
                }
                break;
            case RULE_ISBN:
                {
                alt2=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:120:5: this_Borrow_0= ruleBorrow
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getBorrowParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBorrow_in_ruleCommand223);
                    this_Borrow_0=ruleBorrow();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Borrow_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:130:5: this_Add_1= ruleAdd
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getAddParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAdd_in_ruleCommand250);
                    this_Add_1=ruleAdd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Add_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:140:5: this_Return_2= ruleReturn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getReturnParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturn_in_ruleCommand277);
                    this_Return_2=ruleReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Return_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:150:5: this_Remove_3= ruleRemove
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getRemoveParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRemove_in_ruleCommand304);
                    this_Remove_3=ruleRemove();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Remove_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:160:5: this_Check_4= ruleCheck
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getCheckParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheck_in_ruleCommand331);
                    this_Check_4=ruleCheck();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Check_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:170:5: this_Search_5= ruleSearch
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getSearchParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSearch_in_ruleCommand358);
                    this_Search_5=ruleSearch();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Search_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:180:5: this_Show_6= ruleShow
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getShowParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleShow_in_ruleCommand385);
                    this_Show_6=ruleShow();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Show_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:190:5: this_AddAuthor_7= ruleAddAuthor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getAddAuthorParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAddAuthor_in_ruleCommand412);
                    this_AddAuthor_7=ruleAddAuthor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AddAuthor_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleSearch"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:206:1: entryRuleSearch returns [EObject current=null] : iv_ruleSearch= ruleSearch EOF ;
    public final EObject entryRuleSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearch = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:207:2: (iv_ruleSearch= ruleSearch EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:208:2: iv_ruleSearch= ruleSearch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSearchRule()); 
            }
            pushFollow(FOLLOW_ruleSearch_in_entryRuleSearch447);
            iv_ruleSearch=ruleSearch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSearch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSearch457); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSearch"


    // $ANTLR start "ruleSearch"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:215:1: ruleSearch returns [EObject current=null] : (this_ByYear_0= ruleByYear | this_ByAuthor_1= ruleByAuthor ) ;
    public final EObject ruleSearch() throws RecognitionException {
        EObject current = null;

        EObject this_ByYear_0 = null;

        EObject this_ByAuthor_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:218:28: ( (this_ByYear_0= ruleByYear | this_ByAuthor_1= ruleByAuthor ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:219:1: (this_ByYear_0= ruleByYear | this_ByAuthor_1= ruleByAuthor )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:219:1: (this_ByYear_0= ruleByYear | this_ByAuthor_1= ruleByAuthor )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==18) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==19) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==21) ) {
                            alt3=2;
                        }
                        else if ( (LA3_3==20) ) {
                            alt3=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:220:5: this_ByYear_0= ruleByYear
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSearchAccess().getByYearParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleByYear_in_ruleSearch504);
                    this_ByYear_0=ruleByYear();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ByYear_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:230:5: this_ByAuthor_1= ruleByAuthor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSearchAccess().getByAuthorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleByAuthor_in_ruleSearch531);
                    this_ByAuthor_1=ruleByAuthor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ByAuthor_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSearch"


    // $ANTLR start "entryRuleAddAuthor"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:246:1: entryRuleAddAuthor returns [EObject current=null] : iv_ruleAddAuthor= ruleAddAuthor EOF ;
    public final EObject entryRuleAddAuthor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddAuthor = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:247:2: (iv_ruleAddAuthor= ruleAddAuthor EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:248:2: iv_ruleAddAuthor= ruleAddAuthor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddAuthorRule()); 
            }
            pushFollow(FOLLOW_ruleAddAuthor_in_entryRuleAddAuthor566);
            iv_ruleAddAuthor=ruleAddAuthor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddAuthor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddAuthor576); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddAuthor"


    // $ANTLR start "ruleAddAuthor"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:255:1: ruleAddAuthor returns [EObject current=null] : ( ( (lv_isbn_0_0= RULE_ISBN ) ) otherlv_1= '+' ( (lv_author_2_0= ruleAuthor ) ) ) ;
    public final EObject ruleAddAuthor() throws RecognitionException {
        EObject current = null;

        Token lv_isbn_0_0=null;
        Token otherlv_1=null;
        EObject lv_author_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:258:28: ( ( ( (lv_isbn_0_0= RULE_ISBN ) ) otherlv_1= '+' ( (lv_author_2_0= ruleAuthor ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:259:1: ( ( (lv_isbn_0_0= RULE_ISBN ) ) otherlv_1= '+' ( (lv_author_2_0= ruleAuthor ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:259:1: ( ( (lv_isbn_0_0= RULE_ISBN ) ) otherlv_1= '+' ( (lv_author_2_0= ruleAuthor ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:259:2: ( (lv_isbn_0_0= RULE_ISBN ) ) otherlv_1= '+' ( (lv_author_2_0= ruleAuthor ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:259:2: ( (lv_isbn_0_0= RULE_ISBN ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:260:1: (lv_isbn_0_0= RULE_ISBN )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:260:1: (lv_isbn_0_0= RULE_ISBN )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:261:3: lv_isbn_0_0= RULE_ISBN
            {
            lv_isbn_0_0=(Token)match(input,RULE_ISBN,FOLLOW_RULE_ISBN_in_ruleAddAuthor618); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_isbn_0_0, grammarAccess.getAddAuthorAccess().getIsbnISBNTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAddAuthorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"isbn",
                      		lv_isbn_0_0, 
                      		"ISBN");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAddAuthor635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAddAuthorAccess().getPlusSignKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:281:1: ( (lv_author_2_0= ruleAuthor ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:282:1: (lv_author_2_0= ruleAuthor )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:282:1: (lv_author_2_0= ruleAuthor )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:283:3: lv_author_2_0= ruleAuthor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAddAuthorAccess().getAuthorAuthorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAuthor_in_ruleAddAuthor656);
            lv_author_2_0=ruleAuthor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAddAuthorRule());
              	        }
                     		set(
                     			current, 
                     			"author",
                      		lv_author_2_0, 
                      		"Author");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddAuthor"


    // $ANTLR start "entryRuleByYear"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:307:1: entryRuleByYear returns [EObject current=null] : iv_ruleByYear= ruleByYear EOF ;
    public final EObject entryRuleByYear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleByYear = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:308:2: (iv_ruleByYear= ruleByYear EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:309:2: iv_ruleByYear= ruleByYear EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getByYearRule()); 
            }
            pushFollow(FOLLOW_ruleByYear_in_entryRuleByYear692);
            iv_ruleByYear=ruleByYear();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleByYear; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleByYear702); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleByYear"


    // $ANTLR start "ruleByYear"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:316:1: ruleByYear returns [EObject current=null] : (otherlv_0= 'Search' otherlv_1= 'book' otherlv_2= 'by' otherlv_3= 'year' ( (lv_year_4_0= RULE_YEAR ) ) ) ;
    public final EObject ruleByYear() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_year_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:319:28: ( (otherlv_0= 'Search' otherlv_1= 'book' otherlv_2= 'by' otherlv_3= 'year' ( (lv_year_4_0= RULE_YEAR ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:320:1: (otherlv_0= 'Search' otherlv_1= 'book' otherlv_2= 'by' otherlv_3= 'year' ( (lv_year_4_0= RULE_YEAR ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:320:1: (otherlv_0= 'Search' otherlv_1= 'book' otherlv_2= 'by' otherlv_3= 'year' ( (lv_year_4_0= RULE_YEAR ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:320:3: otherlv_0= 'Search' otherlv_1= 'book' otherlv_2= 'by' otherlv_3= 'year' ( (lv_year_4_0= RULE_YEAR ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleByYear739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getByYearAccess().getSearchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleByYear751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getByYearAccess().getBookKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleByYear763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getByYearAccess().getByKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleByYear775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getByYearAccess().getYearKeyword_3());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:336:1: ( (lv_year_4_0= RULE_YEAR ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:337:1: (lv_year_4_0= RULE_YEAR )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:337:1: (lv_year_4_0= RULE_YEAR )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:338:3: lv_year_4_0= RULE_YEAR
            {
            lv_year_4_0=(Token)match(input,RULE_YEAR,FOLLOW_RULE_YEAR_in_ruleByYear792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_year_4_0, grammarAccess.getByYearAccess().getYearYEARTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getByYearRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"year",
                      		lv_year_4_0, 
                      		"YEAR");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleByYear"


    // $ANTLR start "entryRuleByAuthor"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:362:1: entryRuleByAuthor returns [EObject current=null] : iv_ruleByAuthor= ruleByAuthor EOF ;
    public final EObject entryRuleByAuthor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleByAuthor = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:363:2: (iv_ruleByAuthor= ruleByAuthor EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:364:2: iv_ruleByAuthor= ruleByAuthor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getByAuthorRule()); 
            }
            pushFollow(FOLLOW_ruleByAuthor_in_entryRuleByAuthor833);
            iv_ruleByAuthor=ruleByAuthor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleByAuthor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleByAuthor843); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleByAuthor"


    // $ANTLR start "ruleByAuthor"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:371:1: ruleByAuthor returns [EObject current=null] : (otherlv_0= 'Search' otherlv_1= 'book' otherlv_2= 'by' otherlv_3= 'author' ( (lv_author_4_0= ruleAuthor ) ) ) ;
    public final EObject ruleByAuthor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_author_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:374:28: ( (otherlv_0= 'Search' otherlv_1= 'book' otherlv_2= 'by' otherlv_3= 'author' ( (lv_author_4_0= ruleAuthor ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:375:1: (otherlv_0= 'Search' otherlv_1= 'book' otherlv_2= 'by' otherlv_3= 'author' ( (lv_author_4_0= ruleAuthor ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:375:1: (otherlv_0= 'Search' otherlv_1= 'book' otherlv_2= 'by' otherlv_3= 'author' ( (lv_author_4_0= ruleAuthor ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:375:3: otherlv_0= 'Search' otherlv_1= 'book' otherlv_2= 'by' otherlv_3= 'author' ( (lv_author_4_0= ruleAuthor ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleByAuthor880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getByAuthorAccess().getSearchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleByAuthor892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getByAuthorAccess().getBookKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleByAuthor904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getByAuthorAccess().getByKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleByAuthor916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getByAuthorAccess().getAuthorKeyword_3());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:391:1: ( (lv_author_4_0= ruleAuthor ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:392:1: (lv_author_4_0= ruleAuthor )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:392:1: (lv_author_4_0= ruleAuthor )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:393:3: lv_author_4_0= ruleAuthor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getByAuthorAccess().getAuthorAuthorParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAuthor_in_ruleByAuthor937);
            lv_author_4_0=ruleAuthor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getByAuthorRule());
              	        }
                     		set(
                     			current, 
                     			"author",
                      		lv_author_4_0, 
                      		"Author");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleByAuthor"


    // $ANTLR start "entryRuleBorrow"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:417:1: entryRuleBorrow returns [EObject current=null] : iv_ruleBorrow= ruleBorrow EOF ;
    public final EObject entryRuleBorrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorrow = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:418:2: (iv_ruleBorrow= ruleBorrow EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:419:2: iv_ruleBorrow= ruleBorrow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBorrowRule()); 
            }
            pushFollow(FOLLOW_ruleBorrow_in_entryRuleBorrow973);
            iv_ruleBorrow=ruleBorrow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBorrow; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorrow983); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBorrow"


    // $ANTLR start "ruleBorrow"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:426:1: ruleBorrow returns [EObject current=null] : (otherlv_0= 'Borrow' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) ) ;
    public final EObject ruleBorrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isbn_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:429:28: ( (otherlv_0= 'Borrow' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:430:1: (otherlv_0= 'Borrow' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:430:1: (otherlv_0= 'Borrow' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:430:3: otherlv_0= 'Borrow' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleBorrow1020); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBorrowAccess().getBorrowKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBorrow1032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBorrowAccess().getBookKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:438:1: ( (lv_isbn_2_0= RULE_ISBN ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:439:1: (lv_isbn_2_0= RULE_ISBN )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:439:1: (lv_isbn_2_0= RULE_ISBN )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:440:3: lv_isbn_2_0= RULE_ISBN
            {
            lv_isbn_2_0=(Token)match(input,RULE_ISBN,FOLLOW_RULE_ISBN_in_ruleBorrow1049); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_isbn_2_0, grammarAccess.getBorrowAccess().getIsbnISBNTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBorrowRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"isbn",
                      		lv_isbn_2_0, 
                      		"ISBN");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBorrow"


    // $ANTLR start "entryRuleAdd"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:464:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:465:2: (iv_ruleAdd= ruleAdd EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:466:2: iv_ruleAdd= ruleAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddRule()); 
            }
            pushFollow(FOLLOW_ruleAdd_in_entryRuleAdd1090);
            iv_ruleAdd=ruleAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdd1100); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:473:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'Add' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) otherlv_3= ',' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_year_6_0= RULE_YEAR ) ) otherlv_7= 'written' otherlv_8= 'by' ( (lv_authors_9_0= ruleAuthor ) ) (otherlv_10= ',' ( (lv_autors_11_0= ruleAuthor ) ) )* ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isbn_2_0=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token lv_year_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_authors_9_0 = null;

        EObject lv_autors_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:476:28: ( (otherlv_0= 'Add' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) otherlv_3= ',' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_year_6_0= RULE_YEAR ) ) otherlv_7= 'written' otherlv_8= 'by' ( (lv_authors_9_0= ruleAuthor ) ) (otherlv_10= ',' ( (lv_autors_11_0= ruleAuthor ) ) )* ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:477:1: (otherlv_0= 'Add' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) otherlv_3= ',' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_year_6_0= RULE_YEAR ) ) otherlv_7= 'written' otherlv_8= 'by' ( (lv_authors_9_0= ruleAuthor ) ) (otherlv_10= ',' ( (lv_autors_11_0= ruleAuthor ) ) )* )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:477:1: (otherlv_0= 'Add' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) otherlv_3= ',' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_year_6_0= RULE_YEAR ) ) otherlv_7= 'written' otherlv_8= 'by' ( (lv_authors_9_0= ruleAuthor ) ) (otherlv_10= ',' ( (lv_autors_11_0= ruleAuthor ) ) )* )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:477:3: otherlv_0= 'Add' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) otherlv_3= ',' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_year_6_0= RULE_YEAR ) ) otherlv_7= 'written' otherlv_8= 'by' ( (lv_authors_9_0= ruleAuthor ) ) (otherlv_10= ',' ( (lv_autors_11_0= ruleAuthor ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleAdd1137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAdd1149); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAddAccess().getBookKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:485:1: ( (lv_isbn_2_0= RULE_ISBN ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:486:1: (lv_isbn_2_0= RULE_ISBN )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:486:1: (lv_isbn_2_0= RULE_ISBN )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:487:3: lv_isbn_2_0= RULE_ISBN
            {
            lv_isbn_2_0=(Token)match(input,RULE_ISBN,FOLLOW_RULE_ISBN_in_ruleAdd1166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_isbn_2_0, grammarAccess.getAddAccess().getIsbnISBNTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAddRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"isbn",
                      		lv_isbn_2_0, 
                      		"ISBN");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAdd1183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAddAccess().getCommaKeyword_3());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:507:1: ( (lv_title_4_0= RULE_STRING ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:508:1: (lv_title_4_0= RULE_STRING )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:508:1: (lv_title_4_0= RULE_STRING )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:509:3: lv_title_4_0= RULE_STRING
            {
            lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAdd1200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_title_4_0, grammarAccess.getAddAccess().getTitleSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAddRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"title",
                      		lv_title_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleAdd1217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAddAccess().getCommaKeyword_5());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:529:1: ( (lv_year_6_0= RULE_YEAR ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:530:1: (lv_year_6_0= RULE_YEAR )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:530:1: (lv_year_6_0= RULE_YEAR )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:531:3: lv_year_6_0= RULE_YEAR
            {
            lv_year_6_0=(Token)match(input,RULE_YEAR,FOLLOW_RULE_YEAR_in_ruleAdd1234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_year_6_0, grammarAccess.getAddAccess().getYearYEARTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAddRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"year",
                      		lv_year_6_0, 
                      		"YEAR");
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleAdd1251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getAddAccess().getWrittenKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleAdd1263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getAddAccess().getByKeyword_8());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:555:1: ( (lv_authors_9_0= ruleAuthor ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:556:1: (lv_authors_9_0= ruleAuthor )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:556:1: (lv_authors_9_0= ruleAuthor )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:557:3: lv_authors_9_0= ruleAuthor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAddAccess().getAuthorsAuthorParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAuthor_in_ruleAdd1284);
            lv_authors_9_0=ruleAuthor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAddRule());
              	        }
                     		add(
                     			current, 
                     			"authors",
                      		lv_authors_9_0, 
                      		"Author");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:573:2: (otherlv_10= ',' ( (lv_autors_11_0= ruleAuthor ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:573:4: otherlv_10= ',' ( (lv_autors_11_0= ruleAuthor ) )
            	    {
            	    otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleAdd1297); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getAddAccess().getCommaKeyword_10_0());
            	          
            	    }
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:577:1: ( (lv_autors_11_0= ruleAuthor ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:578:1: (lv_autors_11_0= ruleAuthor )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:578:1: (lv_autors_11_0= ruleAuthor )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:579:3: lv_autors_11_0= ruleAuthor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddAccess().getAutorsAuthorParserRuleCall_10_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAuthor_in_ruleAdd1318);
            	    lv_autors_11_0=ruleAuthor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAddRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"autors",
            	              		lv_autors_11_0, 
            	              		"Author");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleRemove"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:603:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:604:2: (iv_ruleRemove= ruleRemove EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:605:2: iv_ruleRemove= ruleRemove EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRemoveRule()); 
            }
            pushFollow(FOLLOW_ruleRemove_in_entryRuleRemove1356);
            iv_ruleRemove=ruleRemove();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRemove; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRemove1366); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:612:1: ruleRemove returns [EObject current=null] : (otherlv_0= 'Remove' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isbn_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:615:28: ( (otherlv_0= 'Remove' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:616:1: (otherlv_0= 'Remove' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:616:1: (otherlv_0= 'Remove' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:616:3: otherlv_0= 'Remove' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleRemove1403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRemoveAccess().getRemoveKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleRemove1415); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getBookKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:624:1: ( (lv_isbn_2_0= RULE_ISBN ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:625:1: (lv_isbn_2_0= RULE_ISBN )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:625:1: (lv_isbn_2_0= RULE_ISBN )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:626:3: lv_isbn_2_0= RULE_ISBN
            {
            lv_isbn_2_0=(Token)match(input,RULE_ISBN,FOLLOW_RULE_ISBN_in_ruleRemove1432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_isbn_2_0, grammarAccess.getRemoveAccess().getIsbnISBNTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRemoveRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"isbn",
                      		lv_isbn_2_0, 
                      		"ISBN");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleReturn"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:650:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:651:2: (iv_ruleReturn= ruleReturn EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:652:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn1473);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn1483); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:659:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'Return' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isbn_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:662:28: ( (otherlv_0= 'Return' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:663:1: (otherlv_0= 'Return' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:663:1: (otherlv_0= 'Return' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:663:3: otherlv_0= 'Return' otherlv_1= 'book' ( (lv_isbn_2_0= RULE_ISBN ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleReturn1520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleReturn1532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getBookKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:671:1: ( (lv_isbn_2_0= RULE_ISBN ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:672:1: (lv_isbn_2_0= RULE_ISBN )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:672:1: (lv_isbn_2_0= RULE_ISBN )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:673:3: lv_isbn_2_0= RULE_ISBN
            {
            lv_isbn_2_0=(Token)match(input,RULE_ISBN,FOLLOW_RULE_ISBN_in_ruleReturn1549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_isbn_2_0, grammarAccess.getReturnAccess().getIsbnISBNTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReturnRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"isbn",
                      		lv_isbn_2_0, 
                      		"ISBN");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleCheck"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:697:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:698:2: (iv_ruleCheck= ruleCheck EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:699:2: iv_ruleCheck= ruleCheck EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckRule()); 
            }
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck1590);
            iv_ruleCheck=ruleCheck();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheck; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck1600); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:706:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'Check' otherlv_1= 'book' otherlv_2= 'status' ( (lv_isbn_3_0= RULE_ISBN ) ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_isbn_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:709:28: ( (otherlv_0= 'Check' otherlv_1= 'book' otherlv_2= 'status' ( (lv_isbn_3_0= RULE_ISBN ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:710:1: (otherlv_0= 'Check' otherlv_1= 'book' otherlv_2= 'status' ( (lv_isbn_3_0= RULE_ISBN ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:710:1: (otherlv_0= 'Check' otherlv_1= 'book' otherlv_2= 'status' ( (lv_isbn_3_0= RULE_ISBN ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:710:3: otherlv_0= 'Check' otherlv_1= 'book' otherlv_2= 'status' ( (lv_isbn_3_0= RULE_ISBN ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleCheck1637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleCheck1649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCheckAccess().getBookKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleCheck1661); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCheckAccess().getStatusKeyword_2());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:722:1: ( (lv_isbn_3_0= RULE_ISBN ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:723:1: (lv_isbn_3_0= RULE_ISBN )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:723:1: (lv_isbn_3_0= RULE_ISBN )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:724:3: lv_isbn_3_0= RULE_ISBN
            {
            lv_isbn_3_0=(Token)match(input,RULE_ISBN,FOLLOW_RULE_ISBN_in_ruleCheck1678); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_isbn_3_0, grammarAccess.getCheckAccess().getIsbnISBNTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCheckRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"isbn",
                      		lv_isbn_3_0, 
                      		"ISBN");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleAuthor"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:748:1: entryRuleAuthor returns [EObject current=null] : iv_ruleAuthor= ruleAuthor EOF ;
    public final EObject entryRuleAuthor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthor = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:749:2: (iv_ruleAuthor= ruleAuthor EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:750:2: iv_ruleAuthor= ruleAuthor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAuthorRule()); 
            }
            pushFollow(FOLLOW_ruleAuthor_in_entryRuleAuthor1719);
            iv_ruleAuthor=ruleAuthor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAuthor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthor1729); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuthor"


    // $ANTLR start "ruleAuthor"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:757:1: ruleAuthor returns [EObject current=null] : ( ( (lv_firstname_0_0= RULE_STRING ) ) ( (lv_secondname_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAuthor() throws RecognitionException {
        EObject current = null;

        Token lv_firstname_0_0=null;
        Token lv_secondname_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:760:28: ( ( ( (lv_firstname_0_0= RULE_STRING ) ) ( (lv_secondname_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:761:1: ( ( (lv_firstname_0_0= RULE_STRING ) ) ( (lv_secondname_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:761:1: ( ( (lv_firstname_0_0= RULE_STRING ) ) ( (lv_secondname_1_0= RULE_STRING ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:761:2: ( (lv_firstname_0_0= RULE_STRING ) ) ( (lv_secondname_1_0= RULE_STRING ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:761:2: ( (lv_firstname_0_0= RULE_STRING ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:762:1: (lv_firstname_0_0= RULE_STRING )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:762:1: (lv_firstname_0_0= RULE_STRING )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:763:3: lv_firstname_0_0= RULE_STRING
            {
            lv_firstname_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAuthor1771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_firstname_0_0, grammarAccess.getAuthorAccess().getFirstnameSTRINGTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAuthorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"firstname",
                      		lv_firstname_0_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:779:2: ( (lv_secondname_1_0= RULE_STRING ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:780:1: (lv_secondname_1_0= RULE_STRING )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:780:1: (lv_secondname_1_0= RULE_STRING )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:781:3: lv_secondname_1_0= RULE_STRING
            {
            lv_secondname_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAuthor1793); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_secondname_1_0, grammarAccess.getAuthorAccess().getSecondnameSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAuthorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"secondname",
                      		lv_secondname_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuthor"


    // $ANTLR start "entryRuleShow"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:805:1: entryRuleShow returns [EObject current=null] : iv_ruleShow= ruleShow EOF ;
    public final EObject entryRuleShow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShow = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:806:2: (iv_ruleShow= ruleShow EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:807:2: iv_ruleShow= ruleShow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShowRule()); 
            }
            pushFollow(FOLLOW_ruleShow_in_entryRuleShow1834);
            iv_ruleShow=ruleShow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShow; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShow1844); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:814:1: ruleShow returns [EObject current=null] : (otherlv_0= 'Show' otherlv_1= 'all' ( (lv_what_2_0= RULE_WHAT ) ) ) ;
    public final EObject ruleShow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_what_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:817:28: ( (otherlv_0= 'Show' otherlv_1= 'all' ( (lv_what_2_0= RULE_WHAT ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:818:1: (otherlv_0= 'Show' otherlv_1= 'all' ( (lv_what_2_0= RULE_WHAT ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:818:1: (otherlv_0= 'Show' otherlv_1= 'all' ( (lv_what_2_0= RULE_WHAT ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:818:3: otherlv_0= 'Show' otherlv_1= 'all' ( (lv_what_2_0= RULE_WHAT ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleShow1881); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getShowAccess().getShowKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleShow1893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getShowAccess().getAllKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:826:1: ( (lv_what_2_0= RULE_WHAT ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:827:1: (lv_what_2_0= RULE_WHAT )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:827:1: (lv_what_2_0= RULE_WHAT )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:828:3: lv_what_2_0= RULE_WHAT
            {
            lv_what_2_0=(Token)match(input,RULE_WHAT,FOLLOW_RULE_WHAT_in_ruleShow1910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_what_2_0, grammarAccess.getShowAccess().getWhatWHATTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getShowRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"what",
                      		lv_what_2_0, 
                      		"WHAT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShow"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:852:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:853:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:854:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1951);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1961); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:861:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:864:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:866:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression2007);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:882:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:883:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:884:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment2041);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment2051); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:891:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:894:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:895:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:895:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==RULE_STRING||(LA6_1>=RULE_HEX && LA6_1<=RULE_ID)||LA6_1==16||LA6_1==24||(LA6_1>=33 && LA6_1<=61)||(LA6_1>=63 && LA6_1<=89)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==32) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_STRING||(LA6_0>=RULE_HEX && LA6_0<=RULE_DECIMAL)||LA6_0==16||LA6_0==42||LA6_0==49||LA6_0==54||LA6_0==59||LA6_0==61||LA6_0==65||LA6_0==67||LA6_0==69||(LA6_0>=73 && LA6_0<=75)||LA6_0==78||(LA6_0>=80 && LA6_0<=87)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:895:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:895:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:895:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:895:3: ()
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:896:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:901:2: ( ( ruleValidID ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:902:1: ( ruleValidID )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:902:1: ( ruleValidID )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:903:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment2109);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2125);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:924:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:925:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:925:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:926:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2145);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:943:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:943:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:944:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2175);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:952:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==33) ) {
                        int LA5_1 = input.LA(2);

                        if ( (synpred1_InternalLibrary()) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:952:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:952:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:952:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:957:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:957:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:957:7: ()
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:958:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:963:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:964:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:964:1: ( ruleOpMultiAssign )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:965:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2228);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:978:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:979:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:979:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:980:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2251);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1004:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1005:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1006:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2291);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2302); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1013:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1016:28: (kw= '=' )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1018:2: kw= '='
            {
            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpSingleAssign2339); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1031:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1032:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1033:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2379);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2390); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1040:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1043:28: (kw= '+=' )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1045:2: kw= '+='
            {
            kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMultiAssign2427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1058:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1059:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1060:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2466);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2476); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1067:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1070:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1071:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1071:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1072:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2523);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1080:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred2_InternalLibrary()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1080:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1080:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1080:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1085:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1085:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1085:7: ()
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1086:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1091:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1092:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1092:1: ( ruleOpOr )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1093:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2576);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1106:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1107:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1107:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1108:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2599);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1132:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1133:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1134:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2638);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2649); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1141:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1144:28: (kw= '||' )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1146:2: kw= '||'
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOr2686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1159:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1160:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1161:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2725);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2735); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1168:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1171:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1172:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1172:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1173:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2782);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1181:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred3_InternalLibrary()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1181:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1181:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1181:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1186:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1186:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1186:7: ()
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1187:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1192:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1193:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1193:1: ( ruleOpAnd )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1194:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2835);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1207:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1208:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1208:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1209:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2858);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1233:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1234:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1235:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2897);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2908); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1242:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1245:28: (kw= '&&' )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1247:2: kw= '&&'
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAnd2945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1260:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1261:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1262:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2984);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2994); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1269:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1272:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1273:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1273:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1274:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3041);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1282:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==36) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred4_InternalLibrary()) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==37) ) {
                    int LA9_3 = input.LA(2);

                    if ( (synpred4_InternalLibrary()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1282:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1282:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1282:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1287:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1287:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1287:7: ()
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1288:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1293:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1294:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1294:1: ( ruleOpEquality )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1295:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3094);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1308:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1309:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1309:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1310:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3117);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1334:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1335:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1336:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality3156);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3167); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1343:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1346:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1347:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1347:1: (kw= '==' | kw= '!=' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            else if ( (LA10_0==37) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1348:2: kw= '=='
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpEquality3205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1355:2: kw= '!='
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpEquality3224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1368:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1369:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1370:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3264);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression3274); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1377:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1380:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1381:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1381:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1382:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3321);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1390:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop11:
            do {
                int alt11=3;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (synpred6_InternalLibrary()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA11_3 = input.LA(2);

                    if ( (synpred6_InternalLibrary()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA11_4 = input.LA(2);

                    if ( (synpred5_InternalLibrary()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA11_5 = input.LA(2);

                    if ( (synpred6_InternalLibrary()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA11_6 = input.LA(2);

                    if ( (synpred6_InternalLibrary()) ) {
                        alt11=2;
                    }


                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1390:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1390:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1390:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1390:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1390:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1392:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1392:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1392:6: ()
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1393:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXRelationalExpression3357); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1402:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1403:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1403:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1404:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3380);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1421:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1421:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1421:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1421:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1421:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1426:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1426:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1426:7: ()
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1427:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1432:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1433:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1433:1: ( ruleOpCompare )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1434:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3441);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1447:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1448:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1448:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1449:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3464);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1473:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1474:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1475:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3504);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3515); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1482:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1485:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1486:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1486:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt12=1;
                }
                break;
            case 40:
                {
                alt12=2;
                }
                break;
            case 41:
                {
                alt12=3;
                }
                break;
            case 42:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1487:2: kw= '>='
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpCompare3553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1494:2: kw= '<='
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpCompare3572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1501:2: kw= '>'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpCompare3591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1508:2: kw= '<'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpCompare3610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1521:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1522:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1523:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3650);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3660); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1530:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1533:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1534:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1534:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1535:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3707);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1543:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1543:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1543:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1543:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1548:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1548:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1548:7: ()
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1549:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1554:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1555:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1555:1: ( ruleOpOther )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1556:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3760);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1569:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1570:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1570:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1571:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3783);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1595:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1596:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1597:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3822);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3833); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1604:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1607:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1608:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1608:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt16=8;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt16=1;
                }
                break;
            case 44:
                {
                alt16=2;
                }
                break;
            case 45:
                {
                alt16=3;
                }
                break;
            case 41:
                {
                alt16=4;
                }
                break;
            case 42:
                {
                alt16=5;
                }
                break;
            case 46:
                {
                alt16=6;
                }
                break;
            case 47:
                {
                alt16=7;
                }
                break;
            case 48:
                {
                alt16=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1609:2: kw= '->'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpOther3871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1616:2: kw= '..'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpOther3890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1623:2: kw= '=>'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpOther3909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1629:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1629:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1630:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOther3929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1635:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==41) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==EOF||LA14_1==RULE_STRING||(LA14_1>=RULE_HEX && LA14_1<=RULE_ID)||LA14_1==16||LA14_1==42||LA14_1==49||LA14_1==54||LA14_1==59||LA14_1==61||LA14_1==65||LA14_1==67||LA14_1==69||(LA14_1>=73 && LA14_1<=75)||LA14_1==78||(LA14_1>=80 && LA14_1<=87)) ) {
                            alt14=2;
                        }
                        else if ( (LA14_1==41) && (synpred8_InternalLibrary())) {
                            alt14=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1635:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1635:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1635:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1639:5: (kw= '>' kw= '>' )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1640:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOther3960); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOther3973); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1653:2: kw= '>'
                            {
                            kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOther3994); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1659:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1659:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1660:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpOther4016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1665:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==42) ) {
                        int LA15_1 = input.LA(2);

                        if ( (synpred9_InternalLibrary()) ) {
                            alt15=1;
                        }
                        else if ( (true) ) {
                            alt15=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1665:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1665:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1665:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1669:5: (kw= '<' kw= '<' )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1670:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleOpOther4047); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleOpOther4060); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1683:2: kw= '<'
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleOpOther4081); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1690:2: kw= '<>'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpOther4102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1697:2: kw= '?:'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpOther4121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1704:2: kw= '<=>'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpOther4140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1717:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1718:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1719:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4180);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression4190); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1726:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1729:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1730:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1730:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1731:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4237);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1739:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred10_InternalLibrary()) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==49) ) {
                    int LA17_3 = input.LA(2);

                    if ( (synpred10_InternalLibrary()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1739:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1739:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1739:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1744:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1744:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1744:7: ()
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1745:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1750:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1751:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1751:1: ( ruleOpAdd )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1752:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4290);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1765:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1766:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1766:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1767:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4313);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1791:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1792:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1793:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd4352);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd4363); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1800:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1803:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1804:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1804:1: (kw= '+' | kw= '-' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            else if ( (LA18_0==49) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1805:2: kw= '+'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleOpAdd4401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1812:2: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpAdd4420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1825:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1826:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1827:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4460);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4470); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1834:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1837:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1838:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1838:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1839:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4517);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1847:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case 50:
                    {
                    int LA19_2 = input.LA(2);

                    if ( (synpred11_InternalLibrary()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 51:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (synpred11_InternalLibrary()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 52:
                    {
                    int LA19_4 = input.LA(2);

                    if ( (synpred11_InternalLibrary()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 53:
                    {
                    int LA19_5 = input.LA(2);

                    if ( (synpred11_InternalLibrary()) ) {
                        alt19=1;
                    }


                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1847:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1847:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1847:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1852:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1852:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1852:7: ()
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1853:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1858:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1859:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1859:1: ( ruleOpMulti )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1860:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4570);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1873:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1874:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1874:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1875:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4593);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1899:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1900:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1901:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4632);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4643); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1908:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1911:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1912:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1912:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt20=1;
                }
                break;
            case 51:
                {
                alt20=2;
                }
                break;
            case 52:
                {
                alt20=3;
                }
                break;
            case 53:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1913:2: kw= '*'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleOpMulti4681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1920:2: kw= '**'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleOpMulti4700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1927:2: kw= '/'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleOpMulti4719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1934:2: kw= '%'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleOpMulti4738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1947:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1948:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1949:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4778);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4788); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1956:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1959:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1960:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1960:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16||LA21_0==49||LA21_0==54) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING||(LA21_0>=RULE_HEX && LA21_0<=RULE_ID)||LA21_0==42||LA21_0==59||LA21_0==61||LA21_0==65||LA21_0==67||LA21_0==69||(LA21_0>=73 && LA21_0<=75)||LA21_0==78||(LA21_0>=80 && LA21_0<=87)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1960:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1960:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1960:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1960:3: ()
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1961:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1966:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1967:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1967:1: ( ruleOpUnary )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1968:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4846);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1981:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1982:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1982:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1983:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4867);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2001:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4896);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2017:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2018:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2019:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4932);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4943); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2026:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2029:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2030:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2030:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt22=1;
                }
                break;
            case 49:
                {
                alt22=2;
                }
                break;
            case 16:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2031:2: kw= '!'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleOpUnary4981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2038:2: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpUnary5000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2045:2: kw= '+'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleOpUnary5019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2058:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2059:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2060:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5059);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression5069); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2067:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2070:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2071:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2071:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2072:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5116);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2080:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==55) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred12_InternalLibrary()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2080:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2080:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2080:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2082:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2082:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2082:6: ()
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2083:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleXCastedExpression5151); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2092:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2093:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2093:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2094:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5174);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2118:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2119:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2120:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5212);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall5222); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2127:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2130:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2131:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2131:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2132:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5269);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2140:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop31:
            do {
                int alt31=3;
                switch ( input.LA(1) ) {
                case 56:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred13_InternalLibrary()) ) {
                        alt31=1;
                    }
                    else if ( (synpred14_InternalLibrary()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 57:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred14_InternalLibrary()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 58:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred14_InternalLibrary()) ) {
                        alt31=2;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2140:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2140:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2140:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2140:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2140:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2146:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2146:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2146:26: ()
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2147:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleXMemberFeatureCall5318); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2156:1: ( ( ruleValidID ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2157:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2157:1: ( ruleValidID )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2158:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5341);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5357);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2179:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2180:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2180:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2181:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5379);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2198:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2198:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2198:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2198:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2198:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2214:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2214:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2214:8: ()
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2215:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2220:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt24=3;
            	    switch ( input.LA(1) ) {
            	    case 56:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 57:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2220:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,56,FOLLOW_56_in_ruleXMemberFeatureCall5465); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2225:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2225:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2226:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2226:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2227:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,57,FOLLOW_57_in_ruleXMemberFeatureCall5489); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2241:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2241:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2242:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2242:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2243:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,58,FOLLOW_58_in_ruleXMemberFeatureCall5526); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2256:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==42) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2256:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall5555); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2260:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2261:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2261:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2262:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5576);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2278:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==24) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2278:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall5589); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2282:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2283:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2283:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2284:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5610);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop25;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall5624); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2304:3: ( ( ruleValidID ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2305:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2305:1: ( ruleValidID )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2306:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5649);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2319:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2319:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2319:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2319:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2326:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2327:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,59,FOLLOW_59_in_ruleXMemberFeatureCall5683); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2340:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt28=3;
            	            alt28 = dfa28.predict(input);
            	            switch (alt28) {
            	                case 1 :
            	                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2340:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2340:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2340:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2357:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2358:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5768);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2375:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2375:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2375:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2375:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2376:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2376:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2377:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5796);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2393:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop27:
            	                    do {
            	                        int alt27=2;
            	                        int LA27_0 = input.LA(1);

            	                        if ( (LA27_0==24) ) {
            	                            alt27=1;
            	                        }


            	                        switch (alt27) {
            	                    	case 1 :
            	                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2393:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall5809); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2397:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2398:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2398:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2399:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5830);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop27;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,60,FOLLOW_60_in_ruleXMemberFeatureCall5847); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2419:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2419:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2422:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2423:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5882);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2447:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2448:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2449:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5922);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5932); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2456:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2459:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2460:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2460:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt32=13;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2461:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5979);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2471:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression6006);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2481:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6033);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2491:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6060);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2501:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6087);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2511:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6114);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2521:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6141);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2531:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6168);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2541:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6195);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2551:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6222);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2561:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression6249);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2571:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression6276);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2581:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6303);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2597:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2598:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2599:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral6338);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral6348); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2606:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2609:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2610:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2610:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt33=6;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==61) && (synpred18_InternalLibrary())) {
                alt33=1;
            }
            else if ( ((LA33_0>=81 && LA33_0<=82)) ) {
                alt33=2;
            }
            else if ( ((LA33_0>=RULE_HEX && LA33_0<=RULE_DECIMAL)) ) {
                alt33=3;
            }
            else if ( (LA33_0==83) ) {
                alt33=4;
            }
            else if ( (LA33_0==RULE_STRING) ) {
                alt33=5;
            }
            else if ( (LA33_0==84) ) {
                alt33=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2610:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2610:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2610:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral6408);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2623:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6436);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2633:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral6463);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2643:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral6490);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2653:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral6517);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2663:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6544);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2679:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2680:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2681:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6579);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6589); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2688:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2691:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2692:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2692:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2692:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2692:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2692:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2694:5: ( () otherlv_1= '[' )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2694:6: () otherlv_1= '['
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2694:6: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2695:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXClosure6649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2704:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2704:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2719:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2719:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2719:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID||LA35_0==45||LA35_0==59) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2719:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2719:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2720:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2720:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2721:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6722);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2737:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==24) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2737:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXClosure6735); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2741:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2742:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2742:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2743:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6756);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2759:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2760:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2760:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2761:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,62,FOLLOW_62_in_ruleXClosure6778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2774:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2775:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2775:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2776:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6815);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,63,FOLLOW_63_in_ruleXClosure6827); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2804:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2805:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2806:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6863);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6873); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2813:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2816:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2817:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2817:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2817:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2817:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2818:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2823:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_STRING||(LA38_0>=RULE_HEX && LA38_0<=RULE_ID)||LA38_0==16||LA38_0==42||LA38_0==49||LA38_0==54||LA38_0==59||LA38_0==61||LA38_0==65||LA38_0==67||LA38_0==69||(LA38_0>=73 && LA38_0<=78)||(LA38_0>=80 && LA38_0<=87)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2823:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2823:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2824:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2824:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2825:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6929);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2841:2: (otherlv_2= ';' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==64) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2841:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleXExpressionInClosure6942); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2853:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2854:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2855:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6982);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6992); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2862:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2865:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2866:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2866:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2866:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2866:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2866:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2882:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2882:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2882:7: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2883:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2888:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==45||LA40_0==59) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2888:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2888:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2889:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2889:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2890:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7100);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2906:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==24) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2906:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXShortClosure7113); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2910:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2911:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2911:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2912:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7134);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2928:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2929:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2929:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2930:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,62,FOLLOW_62_in_ruleXShortClosure7156); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2943:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2944:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2944:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2945:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure7192);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2969:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2970:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2971:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7228);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression7238); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2978:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2981:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2982:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2982:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2982:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleXParenthesizedExpression7275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7297);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleXParenthesizedExpression7308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3007:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3008:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3009:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7344);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression7354); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3016:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3019:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3020:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3020:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3020:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3020:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3021:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXIfExpression7400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleXIfExpression7412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3034:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3035:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3035:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3036:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7433);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleXIfExpression7445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3056:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3057:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3057:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3058:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7466);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3074:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==66) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred22_InternalLibrary()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3074:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3074:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3074:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,66,FOLLOW_66_in_ruleXIfExpression7487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3079:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3080:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3080:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3081:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7509);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3105:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3106:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3107:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7547);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression7557); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3114:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3117:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3118:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3118:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3118:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3118:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3119:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXSwitchExpression7603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3128:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING||(LA43_0>=RULE_HEX && LA43_0<=RULE_ID)||LA43_0==16||LA43_0==42||LA43_0==49||LA43_0==54||LA43_0==61||LA43_0==65||LA43_0==67||LA43_0==69||(LA43_0>=73 && LA43_0<=75)||LA43_0==78||(LA43_0>=80 && LA43_0<=87)) ) {
                alt43=1;
            }
            else if ( (LA43_0==59) ) {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==RULE_ID) ) {
                    int LA43_3 = input.LA(3);

                    if ( (LA43_3==16||(LA43_3>=32 && LA43_3<=53)||(LA43_3>=55 && LA43_3<=61)||LA43_3==79) ) {
                        alt43=1;
                    }
                    else if ( (LA43_3==68) && (synpred24_InternalLibrary())) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA43_2==RULE_STRING||(LA43_2>=RULE_HEX && LA43_2<=RULE_DECIMAL)||LA43_2==16||LA43_2==42||LA43_2==49||LA43_2==54||LA43_2==59||LA43_2==61||LA43_2==65||LA43_2==67||LA43_2==69||(LA43_2>=73 && LA43_2<=75)||LA43_2==78||(LA43_2>=80 && LA43_2<=87)) ) {
                    alt43=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3128:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3128:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3128:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3128:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID) ) {
                        int LA42_1 = input.LA(2);

                        if ( (LA42_1==68) && (synpred23_InternalLibrary())) {
                            alt42=1;
                        }
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3128:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3133:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3133:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3133:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3134:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3134:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3135:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7646);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,68,FOLLOW_68_in_ruleXSwitchExpression7658); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3155:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3156:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3156:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3157:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7682);
                    lv_switch_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3174:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3174:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3174:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3174:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3174:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3180:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3180:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression7726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3184:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3185:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3185:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3186:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7747);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,68,FOLLOW_68_in_ruleXSwitchExpression7759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3206:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3207:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3207:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3208:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7782);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,60,FOLLOW_60_in_ruleXSwitchExpression7794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,69,FOLLOW_69_in_ruleXSwitchExpression7808); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3232:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||LA44_0==45||LA44_0==59||LA44_0==68||LA44_0==72) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3233:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3233:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3234:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7829);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3250:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==70) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3250:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,70,FOLLOW_70_in_ruleXSwitchExpression7843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,68,FOLLOW_68_in_ruleXSwitchExpression7855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3258:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3259:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3259:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3260:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7876);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,71,FOLLOW_71_in_ruleXSwitchExpression7890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3288:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3289:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3290:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7926);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7936); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3297:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3300:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3301:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3301:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3301:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3301:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==45||LA46_0==59) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3302:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3302:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3303:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7982);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3319:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==72) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3319:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXCasePart7996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3323:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3324:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3324:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3325:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8017);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,68,FOLLOW_68_in_ruleXCasePart8031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3345:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3346:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3346:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3347:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8052);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3371:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3372:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3373:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8088);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression8098); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3380:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3383:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3384:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3384:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3384:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3384:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3385:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXForLoopExpression8144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleXForLoopExpression8156); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3398:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3399:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3399:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3400:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8177);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleXForLoopExpression8189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3420:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3421:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3421:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3422:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8210);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,60,FOLLOW_60_in_ruleXForLoopExpression8222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3442:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3443:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3443:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3444:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8243);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3468:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3469:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3470:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8279);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression8289); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3477:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3480:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3481:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3481:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3481:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3481:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3482:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXWhileExpression8335); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleXWhileExpression8347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3495:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3496:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3496:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3497:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8368);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleXWhileExpression8380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3517:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3518:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3518:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3519:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8401);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3543:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3544:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3545:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8437);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression8447); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3552:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3555:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3556:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3556:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3556:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3556:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3557:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXDoWhileExpression8493); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3566:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3567:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3567:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3568:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8514);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleXDoWhileExpression8526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression8538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3592:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3593:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3593:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3594:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8559);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,60,FOLLOW_60_in_ruleXDoWhileExpression8571); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3622:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3623:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3624:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8607);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8617); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3631:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3634:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3635:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3635:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3635:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3635:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3636:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXBlockExpression8663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3645:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_STRING||(LA49_0>=RULE_HEX && LA49_0<=RULE_ID)||LA49_0==16||LA49_0==42||LA49_0==49||LA49_0==54||LA49_0==59||LA49_0==61||LA49_0==65||LA49_0==67||LA49_0==69||(LA49_0>=73 && LA49_0<=78)||(LA49_0>=80 && LA49_0<=87)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3645:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3645:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3646:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3646:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3647:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8685);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3663:2: (otherlv_3= ';' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==64) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3663:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,64,FOLLOW_64_in_ruleXBlockExpression8698); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleXBlockExpression8714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3679:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3680:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3681:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8750);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8760); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3688:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3691:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3692:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3692:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=76 && LA50_0<=77)) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_STRING||(LA50_0>=RULE_HEX && LA50_0<=RULE_ID)||LA50_0==16||LA50_0==42||LA50_0==49||LA50_0==54||LA50_0==59||LA50_0==61||LA50_0==65||LA50_0==67||LA50_0==69||(LA50_0>=73 && LA50_0<=75)||LA50_0==78||(LA50_0>=80 && LA50_0<=87)) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3693:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8807);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3703:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8834);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3719:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3720:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3721:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8869);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8879); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3728:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3731:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3732:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3732:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3732:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3732:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3733:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3738:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==76) ) {
                alt51=1;
            }
            else if ( (LA51_0==77) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3738:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3738:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3739:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3739:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3740:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,76,FOLLOW_76_in_ruleXVariableDeclaration8932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3754:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,77,FOLLOW_77_in_ruleXVariableDeclaration8963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3758:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred25_InternalLibrary()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==59) && (synpred25_InternalLibrary())) {
                alt52=1;
            }
            else if ( (LA52_0==45) && (synpred25_InternalLibrary())) {
                alt52=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3758:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3758:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3758:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3766:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3766:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3766:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3767:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3767:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3768:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9011);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3784:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3785:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3785:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3786:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration9032);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3803:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3803:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3804:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3804:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3805:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration9061);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3821:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==32) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3821:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleXVariableDeclaration9075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3825:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3826:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3826:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3827:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9096);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3851:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3852:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3853:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9134);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter9144); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3860:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3863:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3864:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3864:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3864:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3864:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_ID||LA54_1==42||LA54_1==56||LA54_1==61) ) {
                    alt54=1;
                }
            }
            else if ( (LA54_0==45||LA54_0==59) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3865:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3865:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3866:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9190);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3882:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3883:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3883:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3884:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter9212);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3908:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3909:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3910:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter9248);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter9258); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3917:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3920:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3921:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3921:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3921:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3921:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3922:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3922:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3923:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter9304);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3939:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3940:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3940:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3941:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter9325);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3965:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3966:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3967:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9361);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall9371); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3974:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3977:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3978:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3978:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3978:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3978:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3979:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3984:2: ( ( ruleStaticQualifier ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==79) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3985:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3985:1: ( ruleStaticQualifier )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3986:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9428);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3999:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==42) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3999:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall9442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4003:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4004:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4004:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4005:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9463);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4021:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==24) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4021:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall9476); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4025:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4026:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4026:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4027:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9497);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall9511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4047:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4048:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4048:1: ( ruleIdOrSuper )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4049:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9536);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4062:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4062:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4062:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4062:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4069:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4070:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,59,FOLLOW_59_in_ruleXFeatureCall9570); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4083:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt59=3;
                    alt59 = dfa59.predict(input);
                    switch (alt59) {
                        case 1 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4083:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4083:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4083:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4100:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4101:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9655);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4118:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4118:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4118:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4118:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4119:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4119:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4120:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9683);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4136:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==24) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4136:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall9696); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4140:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4141:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4141:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4142:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9717);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,60,FOLLOW_60_in_ruleXFeatureCall9734); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4162:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4162:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4165:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4166:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall9769);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4190:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4191:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4192:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9807);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9818); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4199:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4202:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4203:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4203:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            else if ( (LA62_0==78) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4204:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper9865);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4216:2: kw= 'super'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleIdOrSuper9889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4229:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4230:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4231:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9930);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9941); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4238:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4241:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4242:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4242:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID) ) {
                    int LA63_2 = input.LA(2);

                    if ( (LA63_2==79) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4243:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9988);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,79,FOLLOW_79_in_ruleStaticQualifier10006); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4267:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4268:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4269:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10047);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall10057); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4276:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4279:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4280:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4280:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4280:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4280:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4281:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleXConstructorCall10103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4290:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4291:1: ( ruleQualifiedName )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4291:1: ( ruleQualifiedName )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4292:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10126);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4305:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4305:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4305:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4305:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall10147); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4310:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4311:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4311:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4312:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10169);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4328:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==24) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4328:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall10182); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4332:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4333:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4333:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4334:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10203);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall10217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4354:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4354:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4354:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4354:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_59_in_ruleXConstructorCall10240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4359:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt67=3;
                    alt67 = dfa67.predict(input);
                    switch (alt67) {
                        case 1 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4359:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4359:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4359:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4376:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4377:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10313);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4394:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4394:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4394:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4394:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4395:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4395:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4396:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10341);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4412:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==24) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4412:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall10354); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4416:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4417:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4417:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4418:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10375);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop66;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,60,FOLLOW_60_in_ruleXConstructorCall10392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4438:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4438:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4441:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4442:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall10427);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4466:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4467:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4468:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10464);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral10474); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4475:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4478:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4479:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4479:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4479:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4479:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4480:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4485:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==81) ) {
                alt70=1;
            }
            else if ( (LA70_0==82) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4485:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleXBooleanLiteral10521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4490:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4490:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4491:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4491:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4492:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,82,FOLLOW_82_in_ruleXBooleanLiteral10545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4513:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4514:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4515:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10595);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral10605); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4522:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4525:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4526:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4526:1: ( () otherlv_1= 'null' )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4526:2: () otherlv_1= 'null'
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4526:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4527:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleXNullLiteral10651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4544:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4545:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4546:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10687);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral10697); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4553:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4556:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4557:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4557:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4557:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4557:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4558:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4563:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4564:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4564:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4565:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral10752);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4589:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4590:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4591:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10788);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10798); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4598:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4601:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4602:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4602:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4602:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4602:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4603:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4608:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4609:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4609:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4610:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4634:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4635:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4636:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10890);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10900); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4643:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4646:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4647:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4647:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4647:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4647:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4648:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleXTypeLiteral10946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleXTypeLiteral10958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4661:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4662:1: ( ruleQualifiedName )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4662:1: ( ruleQualifiedName )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4663:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10981);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleXTypeLiteral10993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4688:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4689:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4690:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11029);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression11039); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4697:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4700:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4701:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4701:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4701:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4701:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4702:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,85,FOLLOW_85_in_ruleXThrowExpression11085); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4711:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4712:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4712:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4713:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression11106);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4737:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4738:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4739:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11142);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression11152); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4746:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4749:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4750:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4750:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4750:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4750:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4751:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,86,FOLLOW_86_in_ruleXReturnExpression11198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4760:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4760:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4765:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4766:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression11229);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4790:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4791:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4792:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11266);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11276); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4799:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4802:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4803:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4803:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4803:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4803:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4804:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,87,FOLLOW_87_in_ruleXTryCatchFinallyExpression11322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4813:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4814:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4814:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4815:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11343);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4831:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==89) ) {
                alt74=1;
            }
            else if ( (LA74_0==88) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4831:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4831:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4831:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4831:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==89) ) {
                            int LA72_2 = input.LA(2);

                            if ( (synpred34_InternalLibrary()) ) {
                                alt72=1;
                            }


                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4831:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4833:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4834:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11373);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt72 >= 1 ) break loop72;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4850:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==88) ) {
                        int LA73_1 = input.LA(2);

                        if ( (synpred35_InternalLibrary()) ) {
                            alt73=1;
                        }
                    }
                    switch (alt73) {
                        case 1 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4850:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4850:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4850:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,88,FOLLOW_88_in_ruleXTryCatchFinallyExpression11395); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4855:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4856:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4856:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4857:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11417);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4874:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4874:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4874:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,88,FOLLOW_88_in_ruleXTryCatchFinallyExpression11439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4878:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4879:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4879:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4880:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11460);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4904:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4905:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4906:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11498);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause11508); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4913:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4916:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4917:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4917:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4917:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4917:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4917:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,89,FOLLOW_89_in_ruleXCatchClause11553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXCatchClause11566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4926:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4927:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4927:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4928:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11587);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXCatchClause11599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4948:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4949:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4949:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4950:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause11620);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4974:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4975:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4976:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11657);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11668); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4983:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4986:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4987:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4987:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4988:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11715);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4998:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==56) ) {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==RULE_ID) ) {
                        int LA75_3 = input.LA(3);

                        if ( (synpred37_InternalLibrary()) ) {
                            alt75=1;
                        }


                    }


                }


                switch (alt75) {
            	case 1 :
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4998:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4998:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4998:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,56,FOLLOW_56_in_ruleQualifiedName11743); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11766);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5025:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5029:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5030:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber11820);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber11831); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5040:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5044:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5045:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5045:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_HEX) ) {
                alt79=1;
            }
            else if ( ((LA79_0>=RULE_INT && LA79_0<=RULE_DECIMAL)) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5045:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber11875); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5053:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5053:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5053:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5053:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==RULE_INT) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==RULE_DECIMAL) ) {
                        alt76=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5053:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11903); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5061:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11929); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5068:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==56) ) {
                        int LA78_1 = input.LA(2);

                        if ( ((LA78_1>=RULE_INT && LA78_1<=RULE_DECIMAL)) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5069:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,56,FOLLOW_56_in_ruleNumber11949); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5074:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==RULE_INT) ) {
                                alt77=1;
                            }
                            else if ( (LA77_0==RULE_DECIMAL) ) {
                                alt77=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 77, 0, input);

                                throw nvae;
                            }
                            switch (alt77) {
                                case 1 :
                                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5074:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11965); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5082:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11991); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5100:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5101:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5102:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference12044);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference12054); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5109:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5112:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5113:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5113:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            else if ( (LA81_0==45||LA81_0==59) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5113:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5113:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5114:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference12102);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5122:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==61) ) {
                            int LA80_2 = input.LA(2);

                            if ( (LA80_2==63) ) {
                                int LA80_3 = input.LA(3);

                                if ( (synpred38_InternalLibrary()) ) {
                                    alt80=1;
                                }


                            }


                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5122:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5125:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5125:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5125:6: ()
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5126:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleJvmTypeReference12140); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleJvmTypeReference12152); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5141:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12184);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5157:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5158:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5159:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef12219);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef12229); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5166:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5169:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5170:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5170:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5170:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5170:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==59) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5170:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleXFunctionTypeRef12267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5174:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==RULE_ID||LA83_0==45||LA83_0==59) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5174:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5174:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5175:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5175:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5176:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12289);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5192:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop82:
                            do {
                                int alt82=2;
                                int LA82_0 = input.LA(1);

                                if ( (LA82_0==24) ) {
                                    alt82=1;
                                }


                                switch (alt82) {
                            	case 1 :
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5192:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXFunctionTypeRef12302); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5196:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5197:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5197:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5198:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12323);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop82;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleXFunctionTypeRef12339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef12353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5222:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5223:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5223:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5224:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12374);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5248:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5249:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5250:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12410);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12420); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5257:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5260:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5261:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5261:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5261:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5261:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5262:1: ( ruleQualifiedName )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5262:1: ( ruleQualifiedName )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5263:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12468);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5276:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5276:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5276:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5276:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleJvmParameterizedTypeReference12489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5281:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5282:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5282:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5283:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12511);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5299:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==24) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5299:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleJvmParameterizedTypeReference12524); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5303:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5304:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5304:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5305:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12545);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleJvmParameterizedTypeReference12559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5333:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5334:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5335:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12597);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12607); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5342:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5345:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5346:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5346:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID||LA87_0==45||LA87_0==59) ) {
                alt87=1;
            }
            else if ( (LA87_0==90) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5347:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12654);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5357:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12681);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5373:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5374:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5375:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12716);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12726); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5382:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5385:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5386:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5386:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5386:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5386:2: ()
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5387:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,90,FOLLOW_90_in_ruleJvmWildcardTypeReference12772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5396:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt88=3;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==91) ) {
                alt88=1;
            }
            else if ( (LA88_0==78) ) {
                alt88=2;
            }
            switch (alt88) {
                case 1 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5396:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5396:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5397:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5397:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5398:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12794);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5415:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5415:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5416:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5416:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5417:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12821);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5441:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5442:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5443:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12859);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12869); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5450:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5453:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5454:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5454:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5454:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleJvmUpperBound12906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5458:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5459:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5459:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5460:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12927);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5484:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5485:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5486:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12963);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12973); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5493:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5496:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5497:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5497:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5497:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,92,FOLLOW_92_in_ruleJvmUpperBoundAnded13010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5501:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5502:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5502:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5503:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded13031);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5527:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5528:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5529:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound13067);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound13077); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5536:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5539:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5540:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5540:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5540:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmLowerBound13114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5544:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5545:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5545:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5546:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound13135);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5572:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5573:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5574:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID13174);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID13185); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5581:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5584:28: (this_ID_0= RULE_ID )
            // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5585:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID13224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalLibrary
    public final void synpred1_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:952:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:952:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:952:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:952:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:952:5: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:953:1: 
        {
        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:953:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:954:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:954:1: ( ruleOpMultiAssign )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:955:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalLibrary2196);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalLibrary

    // $ANTLR start synpred2_InternalLibrary
    public final void synpred2_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1080:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1080:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1080:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1080:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1080:5: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1081:1: 
        {
        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1081:2: ( ( ruleOpOr ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1082:1: ( ruleOpOr )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1082:1: ( ruleOpOr )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1083:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalLibrary2544);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalLibrary

    // $ANTLR start synpred3_InternalLibrary
    public final void synpred3_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1181:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1181:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1181:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1181:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1181:5: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1182:1: 
        {
        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1182:2: ( ( ruleOpAnd ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1183:1: ( ruleOpAnd )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1183:1: ( ruleOpAnd )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1184:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalLibrary2803);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalLibrary

    // $ANTLR start synpred4_InternalLibrary
    public final void synpred4_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1282:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1282:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1282:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1282:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1282:5: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1283:1: 
        {
        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1283:2: ( ( ruleOpEquality ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1284:1: ( ruleOpEquality )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1284:1: ( ruleOpEquality )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1285:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalLibrary3062);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalLibrary

    // $ANTLR start synpred5_InternalLibrary
    public final void synpred5_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1390:4: ( ( () 'instanceof' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1390:5: ( () 'instanceof' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1390:5: ( () 'instanceof' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1390:6: () 'instanceof'
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1390:6: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1391:1: 
        {
        }

        match(input,38,FOLLOW_38_in_synpred5_InternalLibrary3338); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalLibrary

    // $ANTLR start synpred6_InternalLibrary
    public final void synpred6_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1421:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1421:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1421:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1421:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1421:10: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1422:1: 
        {
        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1422:2: ( ( ruleOpCompare ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1423:1: ( ruleOpCompare )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1423:1: ( ruleOpCompare )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1424:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalLibrary3409);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalLibrary

    // $ANTLR start synpred7_InternalLibrary
    public final void synpred7_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1543:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1543:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1543:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1543:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1543:5: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1544:1: 
        {
        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1544:2: ( ( ruleOpOther ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1545:1: ( ruleOpOther )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1545:1: ( ruleOpOther )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1546:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalLibrary3728);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalLibrary

    // $ANTLR start synpred8_InternalLibrary
    public final void synpred8_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1635:3: ( ( '>' '>' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1635:4: ( '>' '>' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1635:4: ( '>' '>' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1636:2: '>' '>'
        {
        match(input,41,FOLLOW_41_in_synpred8_InternalLibrary3944); if (state.failed) return ;
        match(input,41,FOLLOW_41_in_synpred8_InternalLibrary3949); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalLibrary

    // $ANTLR start synpred9_InternalLibrary
    public final void synpred9_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1665:3: ( ( '<' '<' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1665:4: ( '<' '<' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1665:4: ( '<' '<' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1666:2: '<' '<'
        {
        match(input,42,FOLLOW_42_in_synpred9_InternalLibrary4031); if (state.failed) return ;
        match(input,42,FOLLOW_42_in_synpred9_InternalLibrary4036); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalLibrary

    // $ANTLR start synpred10_InternalLibrary
    public final void synpred10_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1739:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1739:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1739:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1739:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1739:5: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1740:1: 
        {
        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1740:2: ( ( ruleOpAdd ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1741:1: ( ruleOpAdd )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1741:1: ( ruleOpAdd )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1742:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalLibrary4258);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalLibrary

    // $ANTLR start synpred11_InternalLibrary
    public final void synpred11_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1847:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1847:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1847:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1847:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1847:5: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1848:1: 
        {
        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1848:2: ( ( ruleOpMulti ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1849:1: ( ruleOpMulti )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1849:1: ( ruleOpMulti )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:1850:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalLibrary4538);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalLibrary

    // $ANTLR start synpred12_InternalLibrary
    public final void synpred12_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2080:3: ( ( () 'as' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2080:4: ( () 'as' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2080:4: ( () 'as' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2080:5: () 'as'
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2080:5: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2081:1: 
        {
        }

        match(input,55,FOLLOW_55_in_synpred12_InternalLibrary5132); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalLibrary

    // $ANTLR start synpred13_InternalLibrary
    public final void synpred13_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2140:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2140:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2140:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2140:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2140:6: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2141:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred13_InternalLibrary5286); if (state.failed) return ;
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2142:1: ( ( ruleValidID ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2143:1: ( ruleValidID )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2143:1: ( ruleValidID )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2144:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalLibrary5295);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalLibrary5301);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalLibrary

    // $ANTLR start synpred14_InternalLibrary
    public final void synpred14_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2198:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2198:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2198:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2198:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2198:10: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2199:1: 
        {
        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2199:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt89=3;
        switch ( input.LA(1) ) {
        case 56:
            {
            alt89=1;
            }
            break;
        case 57:
            {
            alt89=2;
            }
            break;
        case 58:
            {
            alt89=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 89, 0, input);

            throw nvae;
        }

        switch (alt89) {
            case 1 :
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2199:4: '.'
                {
                match(input,56,FOLLOW_56_in_synpred14_InternalLibrary5404); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2201:6: ( ( '?.' ) )
                {
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2201:6: ( ( '?.' ) )
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2202:1: ( '?.' )
                {
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2202:1: ( '?.' )
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2203:2: '?.'
                {
                match(input,57,FOLLOW_57_in_synpred14_InternalLibrary5418); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2208:6: ( ( '*.' ) )
                {
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2208:6: ( ( '*.' ) )
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2209:1: ( '*.' )
                {
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2209:1: ( '*.' )
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2210:2: '*.'
                {
                match(input,58,FOLLOW_58_in_synpred14_InternalLibrary5438); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalLibrary

    // $ANTLR start synpred15_InternalLibrary
    public final void synpred15_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2319:4: ( ( '(' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2320:1: ( '(' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2320:1: ( '(' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2321:2: '('
        {
        match(input,59,FOLLOW_59_in_synpred15_InternalLibrary5665); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalLibrary

    // $ANTLR start synpred16_InternalLibrary
    public final void synpred16_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2340:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2340:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2340:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2340:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2340:6: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2341:1: 
        {
        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2341:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==RULE_ID||LA91_0==45||LA91_0==59) ) {
            alt91=1;
        }
        switch (alt91) {
            case 1 :
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2341:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2341:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2342:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2342:1: ( ruleJvmFormalParameter )
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2343:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalLibrary5717);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2345:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==24) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2345:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,24,FOLLOW_24_in_synpred16_InternalLibrary5724); if (state.failed) return ;
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2346:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2347:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2347:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2348:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalLibrary5731);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop90;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2350:6: ( ( '|' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2351:1: ( '|' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2351:1: ( '|' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2352:2: '|'
        {
        match(input,62,FOLLOW_62_in_synpred16_InternalLibrary5745); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalLibrary

    // $ANTLR start synpred17_InternalLibrary
    public final void synpred17_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2419:4: ( ( () '[' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2419:5: ( () '[' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2419:5: ( () '[' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2419:6: () '['
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2419:6: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2420:1: 
        {
        }

        match(input,61,FOLLOW_61_in_synpred17_InternalLibrary5865); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalLibrary

    // $ANTLR start synpred18_InternalLibrary
    public final void synpred18_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2610:3: ( ( () '[' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2610:4: ( () '[' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2610:4: ( () '[' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2610:5: () '['
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2610:5: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2611:1: 
        {
        }

        match(input,61,FOLLOW_61_in_synpred18_InternalLibrary6389); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalLibrary

    // $ANTLR start synpred20_InternalLibrary
    public final void synpred20_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2704:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2704:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2704:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2704:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2704:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==RULE_ID||LA93_0==45||LA93_0==59) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2704:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2704:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2705:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2705:1: ( ruleJvmFormalParameter )
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2706:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalLibrary6668);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2708:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==24) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2708:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,24,FOLLOW_24_in_synpred20_InternalLibrary6675); if (state.failed) return ;
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2709:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2710:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2710:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2711:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalLibrary6682);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop92;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2713:6: ( ( '|' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2714:1: ( '|' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2714:1: ( '|' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:2715:2: '|'
        {
        match(input,62,FOLLOW_62_in_synpred20_InternalLibrary6696); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalLibrary

    // $ANTLR start synpred22_InternalLibrary
    public final void synpred22_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3074:4: ( 'else' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3074:6: 'else'
        {
        match(input,66,FOLLOW_66_in_synpred22_InternalLibrary7479); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalLibrary

    // $ANTLR start synpred23_InternalLibrary
    public final void synpred23_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3128:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3128:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3128:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3128:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3128:6: ( ( ruleValidID ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3129:1: ( ruleValidID )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3129:1: ( ruleValidID )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3130:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalLibrary7621);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,68,FOLLOW_68_in_synpred23_InternalLibrary7627); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalLibrary

    // $ANTLR start synpred24_InternalLibrary
    public final void synpred24_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3174:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3174:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3174:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3174:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,59,FOLLOW_59_in_synpred24_InternalLibrary7703); if (state.failed) return ;
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3175:1: ( ( ruleValidID ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3176:1: ( ruleValidID )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3176:1: ( ruleValidID )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3177:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalLibrary7710);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,68,FOLLOW_68_in_synpred24_InternalLibrary7716); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalLibrary

    // $ANTLR start synpred25_InternalLibrary
    public final void synpred25_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3758:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3758:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3758:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3758:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3758:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3759:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3759:1: ( ruleJvmTypeReference )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3760:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalLibrary8981);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3762:2: ( ( ruleValidID ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3763:1: ( ruleValidID )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3763:1: ( ruleValidID )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:3764:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalLibrary8990);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalLibrary

    // $ANTLR start synpred26_InternalLibrary
    public final void synpred26_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4062:4: ( ( '(' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4063:1: ( '(' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4063:1: ( '(' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4064:2: '('
        {
        match(input,59,FOLLOW_59_in_synpred26_InternalLibrary9552); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalLibrary

    // $ANTLR start synpred27_InternalLibrary
    public final void synpred27_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4083:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4083:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4083:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4083:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4083:6: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4084:1: 
        {
        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4084:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==45||LA97_0==59) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4084:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4084:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4085:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4085:1: ( ruleJvmFormalParameter )
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4086:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalLibrary9604);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4088:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==24) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4088:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,24,FOLLOW_24_in_synpred27_InternalLibrary9611); if (state.failed) return ;
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4089:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4090:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4090:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4091:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalLibrary9618);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop96;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4093:6: ( ( '|' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4094:1: ( '|' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4094:1: ( '|' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4095:2: '|'
        {
        match(input,62,FOLLOW_62_in_synpred27_InternalLibrary9632); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalLibrary

    // $ANTLR start synpred28_InternalLibrary
    public final void synpred28_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4162:4: ( ( () '[' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4162:5: ( () '[' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4162:5: ( () '[' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4162:6: () '['
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4162:6: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4163:1: 
        {
        }

        match(input,61,FOLLOW_61_in_synpred28_InternalLibrary9752); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalLibrary

    // $ANTLR start synpred29_InternalLibrary
    public final void synpred29_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4305:4: ( '<' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4305:6: '<'
        {
        match(input,42,FOLLOW_42_in_synpred29_InternalLibrary10139); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalLibrary

    // $ANTLR start synpred30_InternalLibrary
    public final void synpred30_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4354:5: ( '(' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4354:7: '('
        {
        match(input,59,FOLLOW_59_in_synpred30_InternalLibrary10232); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalLibrary

    // $ANTLR start synpred31_InternalLibrary
    public final void synpred31_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4359:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4359:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4359:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4359:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4359:6: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4360:1: 
        {
        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4360:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==45||LA99_0==59) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4360:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4360:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4361:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4361:1: ( ruleJvmFormalParameter )
                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4362:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalLibrary10262);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4364:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==24) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4364:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,24,FOLLOW_24_in_synpred31_InternalLibrary10269); if (state.failed) return ;
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4365:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4366:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4366:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4367:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalLibrary10276);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop98;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4369:6: ( ( '|' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4370:1: ( '|' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4370:1: ( '|' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4371:2: '|'
        {
        match(input,62,FOLLOW_62_in_synpred31_InternalLibrary10290); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalLibrary

    // $ANTLR start synpred32_InternalLibrary
    public final void synpred32_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4438:4: ( ( () '[' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4438:5: ( () '[' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4438:5: ( () '[' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4438:6: () '['
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4438:6: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4439:1: 
        {
        }

        match(input,61,FOLLOW_61_in_synpred32_InternalLibrary10410); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalLibrary

    // $ANTLR start synpred33_InternalLibrary
    public final void synpred33_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4760:2: ( ( ruleXExpression ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4761:1: ( ruleXExpression )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4761:1: ( ruleXExpression )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4762:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalLibrary11212);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalLibrary

    // $ANTLR start synpred34_InternalLibrary
    public final void synpred34_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4831:5: ( 'catch' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4831:7: 'catch'
        {
        match(input,89,FOLLOW_89_in_synpred34_InternalLibrary11357); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalLibrary

    // $ANTLR start synpred35_InternalLibrary
    public final void synpred35_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4850:5: ( 'finally' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4850:7: 'finally'
        {
        match(input,88,FOLLOW_88_in_synpred35_InternalLibrary11387); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalLibrary

    // $ANTLR start synpred37_InternalLibrary
    public final void synpred37_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4998:3: ( '.' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:4999:2: '.'
        {
        match(input,56,FOLLOW_56_in_synpred37_InternalLibrary11734); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalLibrary

    // $ANTLR start synpred38_InternalLibrary
    public final void synpred38_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5122:2: ( ( () '[' ']' ) )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5122:3: ( () '[' ']' )
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5122:3: ( () '[' ']' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5122:4: () '[' ']'
        {
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5122:4: ()
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5123:1: 
        {
        }

        match(input,61,FOLLOW_61_in_synpred38_InternalLibrary12117); if (state.failed) return ;
        match(input,63,FOLLOW_63_in_synpred38_InternalLibrary12121); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalLibrary

    // $ANTLR start synpred39_InternalLibrary
    public final void synpred39_InternalLibrary_fragment() throws RecognitionException {   
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5276:4: ( '<' )
        // ../org.xtext.library/src-gen/org/xtext/library/parser/antlr/internal/InternalLibrary.g:5276:6: '<'
        {
        match(input,42,FOLLOW_42_in_synpred39_InternalLibrary12481); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalLibrary

    // Delegated rules

    public final boolean synpred2_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalLibrary() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalLibrary_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA86 dfa86 = new DFA86(this);
    static final String DFA13_eotS =
        "\13\uffff";
    static final String DFA13_eofS =
        "\1\1\12\uffff";
    static final String DFA13_minS =
        "\1\6\1\uffff\10\0\1\uffff";
    static final String DFA13_maxS =
        "\1\131\1\uffff\10\0\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA13_specialS =
        "\2\uffff\1\2\1\5\1\6\1\7\1\1\1\0\1\3\1\4\1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\uffff\4\1\4\uffff\1\1\7\uffff\1\1\10\uffff\10\1\1\2"+
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\15\1\1\uffff\20\1\1\uffff\12"+
            "\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()* loopback of 1543:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalLibrary()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalLibrary()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalLibrary()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalLibrary()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalLibrary()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalLibrary()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalLibrary()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalLibrary()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\101\uffff";
    static final String DFA29_eofS =
        "\1\2\100\uffff";
    static final String DFA29_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA29_maxS =
        "\1\131\1\0\77\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\2\1\uffff\4\2\4\uffff\1\2\7\uffff\1\2\10\uffff\32\2\1\1"+
            "\2\2\1\uffff\20\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "2319:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\36\uffff";
    static final String DFA28_eofS =
        "\36\uffff";
    static final String DFA28_minS =
        "\1\6\2\0\33\uffff";
    static final String DFA28_maxS =
        "\1\127\2\0\33\uffff";
    static final String DFA28_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA28_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\5\1\uffff\3\5\1\1\4\uffff\1\5\31\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\1\5\4\uffff\1\5\4\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5"+
            "\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10"+
            "\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "2340:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA28_0==RULE_ID) ) {s = 1;}

                        else if ( (LA28_0==59) ) {s = 2;}

                        else if ( (LA28_0==45) && (synpred16_InternalLibrary())) {s = 3;}

                        else if ( (LA28_0==62) && (synpred16_InternalLibrary())) {s = 4;}

                        else if ( (LA28_0==RULE_STRING||(LA28_0>=RULE_HEX && LA28_0<=RULE_DECIMAL)||LA28_0==16||LA28_0==42||LA28_0==49||LA28_0==54||LA28_0==61||LA28_0==65||LA28_0==67||LA28_0==69||(LA28_0>=73 && LA28_0<=75)||LA28_0==78||(LA28_0>=80 && LA28_0<=87)) ) {s = 5;}

                        else if ( (LA28_0==60) ) {s = 29;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalLibrary()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalLibrary()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\101\uffff";
    static final String DFA30_eofS =
        "\1\2\100\uffff";
    static final String DFA30_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA30_maxS =
        "\1\131\1\0\77\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\2\1\uffff\4\2\4\uffff\1\2\7\uffff\1\2\10\uffff\34\2\1\1"+
            "\1\uffff\20\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "2419:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\16\uffff";
    static final String DFA32_eofS =
        "\16\uffff";
    static final String DFA32_minS =
        "\1\6\15\uffff";
    static final String DFA32_maxS =
        "\1\127\15\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA32_specialS =
        "\16\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\5\1\uffff\3\5\1\4\36\uffff\1\4\20\uffff\1\15\1\uffff\1\5"+
            "\3\uffff\1\6\1\uffff\1\3\1\uffff\1\2\3\uffff\1\7\1\10\1\11\2"+
            "\uffff\1\4\1\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "2460:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA36_eotS =
        "\40\uffff";
    static final String DFA36_eofS =
        "\40\uffff";
    static final String DFA36_minS =
        "\1\6\2\0\35\uffff";
    static final String DFA36_maxS =
        "\1\127\2\0\35\uffff";
    static final String DFA36_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA36_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\5\1\uffff\3\5\1\1\4\uffff\1\5\31\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\1\5\4\uffff\1\5\4\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\6\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2704:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_0 = input.LA(1);

                         
                        int index36_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA36_0==RULE_ID) ) {s = 1;}

                        else if ( (LA36_0==59) ) {s = 2;}

                        else if ( (LA36_0==45) && (synpred20_InternalLibrary())) {s = 3;}

                        else if ( (LA36_0==62) && (synpred20_InternalLibrary())) {s = 4;}

                        else if ( (LA36_0==RULE_STRING||(LA36_0>=RULE_HEX && LA36_0<=RULE_DECIMAL)||LA36_0==16||LA36_0==42||LA36_0==49||LA36_0==54||LA36_0==61||LA36_0==63||LA36_0==65||LA36_0==67||LA36_0==69||(LA36_0>=73 && LA36_0<=78)||(LA36_0>=80 && LA36_0<=87)) ) {s = 5;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalLibrary()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalLibrary()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index36_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\101\uffff";
    static final String DFA60_eofS =
        "\1\2\100\uffff";
    static final String DFA60_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA60_maxS =
        "\1\131\1\0\77\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\2\1\uffff\4\2\4\uffff\1\2\7\uffff\1\2\10\uffff\32\2\1\1"+
            "\2\2\1\uffff\20\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "4062:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\36\uffff";
    static final String DFA59_eofS =
        "\36\uffff";
    static final String DFA59_minS =
        "\1\6\2\0\33\uffff";
    static final String DFA59_maxS =
        "\1\127\2\0\33\uffff";
    static final String DFA59_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA59_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\5\1\uffff\3\5\1\1\4\uffff\1\5\31\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\1\5\4\uffff\1\5\4\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5"+
            "\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10"+
            "\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "4083:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_0 = input.LA(1);

                         
                        int index59_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA59_0==RULE_ID) ) {s = 1;}

                        else if ( (LA59_0==59) ) {s = 2;}

                        else if ( (LA59_0==45) && (synpred27_InternalLibrary())) {s = 3;}

                        else if ( (LA59_0==62) && (synpred27_InternalLibrary())) {s = 4;}

                        else if ( (LA59_0==RULE_STRING||(LA59_0>=RULE_HEX && LA59_0<=RULE_DECIMAL)||LA59_0==16||LA59_0==42||LA59_0==49||LA59_0==54||LA59_0==61||LA59_0==65||LA59_0==67||LA59_0==69||(LA59_0>=73 && LA59_0<=75)||LA59_0==78||(LA59_0>=80 && LA59_0<=87)) ) {s = 5;}

                        else if ( (LA59_0==60) ) {s = 29;}

                         
                        input.seek(index59_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalLibrary()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalLibrary()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\101\uffff";
    static final String DFA61_eofS =
        "\1\2\100\uffff";
    static final String DFA61_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA61_maxS =
        "\1\131\1\0\77\uffff";
    static final String DFA61_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA61_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\2\1\uffff\4\2\4\uffff\1\2\7\uffff\1\2\10\uffff\34\2\1\1"+
            "\1\uffff\20\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "4162:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\101\uffff";
    static final String DFA65_eofS =
        "\1\2\100\uffff";
    static final String DFA65_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA65_maxS =
        "\1\131\1\0\77\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\2\1\uffff\4\2\4\uffff\1\2\7\uffff\1\2\10\uffff\11\2\1\1"+
            "\23\2\1\uffff\20\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "4305:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\101\uffff";
    static final String DFA68_eofS =
        "\1\2\100\uffff";
    static final String DFA68_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA68_maxS =
        "\1\131\1\0\77\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\2\1\uffff\4\2\4\uffff\1\2\7\uffff\1\2\10\uffff\32\2\1\1"+
            "\2\2\1\uffff\20\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "4354:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\36\uffff";
    static final String DFA67_eofS =
        "\36\uffff";
    static final String DFA67_minS =
        "\1\6\2\0\33\uffff";
    static final String DFA67_maxS =
        "\1\127\2\0\33\uffff";
    static final String DFA67_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA67_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\5\1\uffff\3\5\1\1\4\uffff\1\5\31\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\1\5\4\uffff\1\5\4\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5"+
            "\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10"+
            "\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "4359:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_0 = input.LA(1);

                         
                        int index67_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_0==RULE_ID) ) {s = 1;}

                        else if ( (LA67_0==59) ) {s = 2;}

                        else if ( (LA67_0==45) && (synpred31_InternalLibrary())) {s = 3;}

                        else if ( (LA67_0==62) && (synpred31_InternalLibrary())) {s = 4;}

                        else if ( (LA67_0==RULE_STRING||(LA67_0>=RULE_HEX && LA67_0<=RULE_DECIMAL)||LA67_0==16||LA67_0==42||LA67_0==49||LA67_0==54||LA67_0==61||LA67_0==65||LA67_0==67||LA67_0==69||(LA67_0>=73 && LA67_0<=75)||LA67_0==78||(LA67_0>=80 && LA67_0<=87)) ) {s = 5;}

                        else if ( (LA67_0==60) ) {s = 29;}

                         
                        input.seek(index67_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalLibrary()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalLibrary()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\101\uffff";
    static final String DFA69_eofS =
        "\1\2\100\uffff";
    static final String DFA69_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA69_maxS =
        "\1\131\1\0\77\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\2\1\uffff\4\2\4\uffff\1\2\7\uffff\1\2\10\uffff\34\2\1\1"+
            "\1\uffff\20\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "4438:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\101\uffff";
    static final String DFA71_eofS =
        "\1\33\100\uffff";
    static final String DFA71_minS =
        "\1\6\32\0\46\uffff";
    static final String DFA71_maxS =
        "\1\131\32\0\46\uffff";
    static final String DFA71_acceptS =
        "\33\uffff\1\2\44\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\46\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\21\1\uffff\1\15\1\16\1\17\1\1\4\uffff\1\4\7\uffff\1\33\10"+
            "\uffff\11\33\1\10\6\33\1\3\4\33\1\2\4\33\1\32\1\33\1\12\1\uffff"+
            "\2\33\1\23\1\33\1\7\1\33\1\6\3\33\1\24\1\25\1\26\2\33\1\11\1"+
            "\uffff\1\5\1\13\1\14\1\20\1\22\1\27\1\30\1\31\2\33",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "4760:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_3 = input.LA(1);

                         
                        int index71_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA71_4 = input.LA(1);

                         
                        int index71_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA71_5 = input.LA(1);

                         
                        int index71_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA71_6 = input.LA(1);

                         
                        int index71_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA71_7 = input.LA(1);

                         
                        int index71_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA71_8 = input.LA(1);

                         
                        int index71_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA71_9 = input.LA(1);

                         
                        int index71_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA71_10 = input.LA(1);

                         
                        int index71_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA71_11 = input.LA(1);

                         
                        int index71_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA71_12 = input.LA(1);

                         
                        int index71_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA71_13 = input.LA(1);

                         
                        int index71_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA71_14 = input.LA(1);

                         
                        int index71_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA71_15 = input.LA(1);

                         
                        int index71_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA71_16 = input.LA(1);

                         
                        int index71_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA71_17 = input.LA(1);

                         
                        int index71_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA71_18 = input.LA(1);

                         
                        int index71_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA71_19 = input.LA(1);

                         
                        int index71_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA71_20 = input.LA(1);

                         
                        int index71_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA71_21 = input.LA(1);

                         
                        int index71_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA71_22 = input.LA(1);

                         
                        int index71_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA71_23 = input.LA(1);

                         
                        int index71_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA71_24 = input.LA(1);

                         
                        int index71_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA71_25 = input.LA(1);

                         
                        int index71_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA71_26 = input.LA(1);

                         
                        int index71_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA86_eotS =
        "\101\uffff";
    static final String DFA86_eofS =
        "\1\2\100\uffff";
    static final String DFA86_minS =
        "\1\6\1\0\77\uffff";
    static final String DFA86_maxS =
        "\1\131\1\0\77\uffff";
    static final String DFA86_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA86_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA86_transitionS = {
            "\1\2\1\uffff\4\2\4\uffff\1\2\7\uffff\1\2\10\uffff\11\2\1\1"+
            "\23\2\1\uffff\20\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "5276:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_1 = input.LA(1);

                         
                        int index86_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalLibrary()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index86_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleModel130 = new BitSet(new long[]{0x000000005CC20012L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrow_in_ruleCommand223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_ruleCommand250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleCommand277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRemove_in_ruleCommand304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleCommand331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSearch_in_ruleCommand358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShow_in_ruleCommand385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddAuthor_in_ruleCommand412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSearch_in_entryRuleSearch447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSearch457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleByYear_in_ruleSearch504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleByAuthor_in_ruleSearch531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddAuthor_in_entryRuleAddAuthor566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddAuthor576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ISBN_in_ruleAddAuthor618 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAddAuthor635 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAuthor_in_ruleAddAuthor656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleByYear_in_entryRuleByYear692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleByYear702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleByYear739 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleByYear751 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleByYear763 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleByYear775 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_YEAR_in_ruleByYear792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleByAuthor_in_entryRuleByAuthor833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleByAuthor843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleByAuthor880 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleByAuthor892 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleByAuthor904 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleByAuthor916 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAuthor_in_ruleByAuthor937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrow_in_entryRuleBorrow973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorrow983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBorrow1020 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBorrow1032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ISBN_in_ruleBorrow1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_entryRuleAdd1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdd1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAdd1137 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAdd1149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ISBN_in_ruleAdd1166 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAdd1183 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAdd1200 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAdd1217 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_YEAR_in_ruleAdd1234 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAdd1251 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAdd1263 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAuthor_in_ruleAdd1284 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAdd1297 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAuthor_in_ruleAdd1318 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleRemove_in_entryRuleRemove1356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRemove1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRemove1403 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRemove1415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ISBN_in_ruleRemove1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn1473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleReturn1520 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleReturn1532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ISBN_in_ruleReturn1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck1590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCheck1637 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCheck1649 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCheck1661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ISBN_in_ruleCheck1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthor_in_entryRuleAuthor1719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthor1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAuthor1771 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAuthor1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShow_in_entryRuleShow1834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShow1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleShow1881 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleShow1893 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_WHAT_in_ruleShow1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment2109 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2125 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2175 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2228 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpSingleAssign2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMultiAssign2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2523 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2576 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2599 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOr2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2782 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2835 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2858 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAnd2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3041 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3094 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3117 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality3156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpEquality3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpEquality3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3321 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_38_in_ruleXRelationalExpression3357 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3380 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3441 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3464 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpCompare3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpCompare3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpCompare3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpCompare3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3707 = new BitSet(new long[]{0x0001FE0000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3760 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3783 = new BitSet(new long[]{0x0001FE0000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpOther3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpOther3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpOther3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpOther3929 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleOpOther3960 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleOpOther3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpOther3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpOther4016 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleOpOther4047 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleOpOther4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpOther4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpOther4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpOther4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpOther4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4237 = new BitSet(new long[]{0x0002000000010002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4290 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4313 = new BitSet(new long[]{0x0002000000010002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd4352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpAdd4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpAdd4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4517 = new BitSet(new long[]{0x003C000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4570 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4593 = new BitSet(new long[]{0x003C000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOpMulti4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOpMulti4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOpMulti4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOpMulti4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4846 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOpUnary4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpUnary5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpUnary5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5116 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXCastedExpression5151 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5174 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5269 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXMemberFeatureCall5318 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5341 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5357 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5379 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXMemberFeatureCall5465 = new BitSet(new long[]{0x0000040000000800L});
    public static final BitSet FOLLOW_57_in_ruleXMemberFeatureCall5489 = new BitSet(new long[]{0x0000040000000800L});
    public static final BitSet FOLLOW_58_in_ruleXMemberFeatureCall5526 = new BitSet(new long[]{0x0000040000000800L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall5555 = new BitSet(new long[]{0x0800200000000800L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5576 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall5589 = new BitSet(new long[]{0x0800200000000800L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5610 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall5624 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5649 = new BitSet(new long[]{0x2F00000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXMemberFeatureCall5683 = new BitSet(new long[]{0x7842240000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5768 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5796 = new BitSet(new long[]{0x1000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall5809 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5830 = new BitSet(new long[]{0x1000000001000000L});
    public static final BitSet FOLLOW_60_in_ruleXMemberFeatureCall5847 = new BitSet(new long[]{0x2700000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5882 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression6006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression6249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral6338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral6490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXClosure6649 = new BitSet(new long[]{0xE842240000010F40L,0x0000000000FF7E2AL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6722 = new BitSet(new long[]{0x4000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXClosure6735 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6756 = new BitSet(new long[]{0x4000000001000000L});
    public static final BitSet FOLLOW_62_in_ruleXClosure6778 = new BitSet(new long[]{0xA842040000010F40L,0x0000000000FF7E2AL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6815 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleXClosure6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6929 = new BitSet(new long[]{0x2842040000010F42L,0x0000000000FF7E2BL});
    public static final BitSet FOLLOW_64_in_ruleXExpressionInClosure6942 = new BitSet(new long[]{0x2842040000010F42L,0x0000000000FF7E2AL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7100 = new BitSet(new long[]{0x4000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXShortClosure7113 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7134 = new BitSet(new long[]{0x4000000001000000L});
    public static final BitSet FOLLOW_62_in_ruleXShortClosure7156 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression7238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXParenthesizedExpression7275 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7297 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXParenthesizedExpression7308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXIfExpression7400 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXIfExpression7412 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7433 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXIfExpression7445 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXIfExpression7487 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression7557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXSwitchExpression7603 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXSwitchExpression7658 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression7726 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXSwitchExpression7759 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7782 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXSwitchExpression7794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleXSwitchExpression7808 = new BitSet(new long[]{0x0800200000000800L,0x0000000000000110L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7829 = new BitSet(new long[]{0x0800200000000800L,0x00000000000001D0L});
    public static final BitSet FOLLOW_70_in_ruleXSwitchExpression7843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXSwitchExpression7855 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleXSwitchExpression7890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000110L});
    public static final BitSet FOLLOW_72_in_ruleXCasePart7996 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXCasePart8031 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression8098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXForLoopExpression8144 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXForLoopExpression8156 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXForLoopExpression8189 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8210 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXForLoopExpression8222 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression8289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXWhileExpression8335 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXWhileExpression8347 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8368 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXWhileExpression8380 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXDoWhileExpression8493 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleXDoWhileExpression8526 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression8538 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8559 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXDoWhileExpression8571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXBlockExpression8663 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF7EAAL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8685 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF7EABL});
    public static final BitSet FOLLOW_64_in_ruleXBlockExpression8698 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF7EAAL});
    public static final BitSet FOLLOW_71_in_ruleXBlockExpression8714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXVariableDeclaration8932 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_77_in_ruleXVariableDeclaration8963 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9011 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration9032 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration9061 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleXVariableDeclaration9075 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter9144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9190 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter9212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter9248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter9258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter9304 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter9325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall9371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9428 = new BitSet(new long[]{0x0000040000000800L,0x0000000000004000L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall9442 = new BitSet(new long[]{0x0800200000000800L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9463 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall9476 = new BitSet(new long[]{0x0800200000000800L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9497 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall9511 = new BitSet(new long[]{0x0000040000000800L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9536 = new BitSet(new long[]{0x2800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXFeatureCall9570 = new BitSet(new long[]{0x7842240000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9655 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9683 = new BitSet(new long[]{0x1000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall9696 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9717 = new BitSet(new long[]{0x1000000001000000L});
    public static final BitSet FOLLOW_60_in_ruleXFeatureCall9734 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall9769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper9865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleIdOrSuper9889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleStaticQualifier10006 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall10057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleXConstructorCall10103 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10126 = new BitSet(new long[]{0x2800040000000002L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall10147 = new BitSet(new long[]{0x0800200000000800L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10169 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall10182 = new BitSet(new long[]{0x0800200000000800L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10203 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall10217 = new BitSet(new long[]{0x2800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXConstructorCall10240 = new BitSet(new long[]{0x7842240000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10313 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10341 = new BitSet(new long[]{0x1000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall10354 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10375 = new BitSet(new long[]{0x1000000001000000L});
    public static final BitSet FOLLOW_60_in_ruleXConstructorCall10392 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall10427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral10474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleXBooleanLiteral10521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleXBooleanLiteral10545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral10605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleXNullLiteral10651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral10697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral10752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleXTypeLiteral10946 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXTypeLiteral10958 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10981 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXTypeLiteral10993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression11039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleXThrowExpression11085 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression11106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression11152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleXReturnExpression11198 = new BitSet(new long[]{0x2842040000010F42L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression11229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleXTryCatchFinallyExpression11322 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11343 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11373 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_88_in_ruleXTryCatchFinallyExpression11395 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleXTryCatchFinallyExpression11439 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause11508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleXCatchClause11553 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXCatchClause11566 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11587 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXCatchClause11599 = new BitSet(new long[]{0x2842040000010F40L,0x0000000000FF4E2AL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause11620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11715 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleQualifiedName11743 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11766 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber11820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber11831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber11875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11903 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11929 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNumber11949 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference12044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference12054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference12102 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleJvmTypeReference12140 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleJvmTypeReference12152 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef12219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef12229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXFunctionTypeRef12267 = new BitSet(new long[]{0x1800200000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12289 = new BitSet(new long[]{0x1000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXFunctionTypeRef12302 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12323 = new BitSet(new long[]{0x1000000001000000L});
    public static final BitSet FOLLOW_60_in_ruleXFunctionTypeRef12339 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef12353 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12468 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleJvmParameterizedTypeReference12489 = new BitSet(new long[]{0x0800200000000800L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12511 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_24_in_ruleJvmParameterizedTypeReference12524 = new BitSet(new long[]{0x0800200000000800L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12545 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_41_in_ruleJvmParameterizedTypeReference12559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleJvmWildcardTypeReference12772 = new BitSet(new long[]{0x0000000000000002L,0x0000000008004000L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleJvmUpperBound12906 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleJvmUpperBoundAnded13010 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded13031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound13067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound13077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmLowerBound13114 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound13135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID13174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID13185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID13224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalLibrary2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalLibrary2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalLibrary2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalLibrary3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred5_InternalLibrary3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalLibrary3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalLibrary3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred8_InternalLibrary3944 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred8_InternalLibrary3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred9_InternalLibrary4031 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred9_InternalLibrary4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalLibrary4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalLibrary4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred12_InternalLibrary5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred13_InternalLibrary5286 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalLibrary5295 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalLibrary5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred14_InternalLibrary5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_synpred14_InternalLibrary5418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_synpred14_InternalLibrary5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_synpred15_InternalLibrary5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalLibrary5717 = new BitSet(new long[]{0x4000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred16_InternalLibrary5724 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalLibrary5731 = new BitSet(new long[]{0x4000000001000000L});
    public static final BitSet FOLLOW_62_in_synpred16_InternalLibrary5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_synpred17_InternalLibrary5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_synpred18_InternalLibrary6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalLibrary6668 = new BitSet(new long[]{0x4000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred20_InternalLibrary6675 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalLibrary6682 = new BitSet(new long[]{0x4000000001000000L});
    public static final BitSet FOLLOW_62_in_synpred20_InternalLibrary6696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_synpred22_InternalLibrary7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalLibrary7621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_synpred23_InternalLibrary7627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_synpred24_InternalLibrary7703 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalLibrary7710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_synpred24_InternalLibrary7716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalLibrary8981 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalLibrary8990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_synpred26_InternalLibrary9552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalLibrary9604 = new BitSet(new long[]{0x4000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred27_InternalLibrary9611 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalLibrary9618 = new BitSet(new long[]{0x4000000001000000L});
    public static final BitSet FOLLOW_62_in_synpred27_InternalLibrary9632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_synpred28_InternalLibrary9752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred29_InternalLibrary10139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_synpred30_InternalLibrary10232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalLibrary10262 = new BitSet(new long[]{0x4000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred31_InternalLibrary10269 = new BitSet(new long[]{0x0800200000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalLibrary10276 = new BitSet(new long[]{0x4000000001000000L});
    public static final BitSet FOLLOW_62_in_synpred31_InternalLibrary10290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_synpred32_InternalLibrary10410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalLibrary11212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_synpred34_InternalLibrary11357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_synpred35_InternalLibrary11387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred37_InternalLibrary11734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_synpred38_InternalLibrary12117 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_synpred38_InternalLibrary12121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred39_InternalLibrary12481 = new BitSet(new long[]{0x0000000000000002L});

}