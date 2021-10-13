package com.b2international.snomed.etl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.b2international.snomed.etl.services.EtlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEtlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE_SQUARE_OPEN", "RULE_DOUBLE_SQUARE_CLOSE", "RULE_TILDE", "RULE_AT", "RULE_ID", "RULE_SCG", "RULE_TOK", "RULE_STR", "RULE_INT", "RULE_DEC", "RULE_EQUIVALENT_TO", "RULE_SUBTYPE_OF", "RULE_STRING", "RULE_WS", "RULE_SQUARE_OPEN", "RULE_SQUARE_CLOSE", "RULE_SLOTNAME_STRING", "RULE_CASE_SIGNIFICANCE_ID_KEYWORD", "RULE_DEFINITION_STATUS_ID_KEYWORD", "RULE_DEFINITION_STATUS_TOKEN_KEYWORD", "RULE_LANGUAGE_REFSET_ID_KEYWORD", "RULE_EFFECTIVE_TIME_KEYWORD", "RULE_ACCEPTABLE_IN_KEYWORD", "RULE_PREFERRED_IN_KEYWORD", "RULE_SEMANTIC_TAG_KEYWORD", "RULE_DIALECTID_KEYWORD", "RULE_LANGUAGE_KEYWORD", "RULE_MODULEID_KEYWORD", "RULE_DIALECT_KEYWORD", "RULE_ACTIVE_KEYWORD", "RULE_TYPEID_KEYWORD", "RULE_EXCLUSION_KEYWORD", "RULE_EXACT_KEYWORD", "RULE_FALSE_KEYWORD", "RULE_MATCH_KEYWORD", "RULE_REGEX_KEYWORD", "RULE_TERM_KEYWORD", "RULE_TRUE_KEYWORD", "RULE_TYPE_KEYWORD", "RULE_WILD_KEYWORD", "RULE_CONJUNCTION_KEYWORD", "RULE_DISJUNCTION_KEYWORD", "RULE_REVERSED", "RULE_DESCRIPTION_SHORT_KEYWORD", "RULE_CONCEPT_SHORT_KEYWORD", "RULE_KEYWORD", "RULE_DBL_LT_EM", "RULE_DBL_GT_EM", "RULE_DBL_LT", "RULE_DBL_GT", "RULE_LT_EM", "RULE_GT_EM", "RULE_GTE", "RULE_LTE", "RULE_DOUBLE_CURLY_OPEN", "RULE_DOUBLE_CURLY_CLOSE", "RULE_PIPE_DELIMITED_STRING", "RULE_TO", "RULE_COMMA", "RULE_DIGIT_ZERO", "RULE_DIGIT_NONZERO", "RULE_COLON", "RULE_CURLY_OPEN", "RULE_CURLY_CLOSE", "RULE_ROUND_OPEN", "RULE_ROUND_CLOSE", "RULE_PLUS", "RULE_DASH", "RULE_CARET", "RULE_DOT", "RULE_WILDCARD", "RULE_EQUAL", "RULE_NOT_EQUAL", "RULE_LT", "RULE_GT", "RULE_HASH", "RULE_ML_COMMENT", "RULE_SL_COMMENT"
    };
    public static final int RULE_DIALECT_KEYWORD=32;
    public static final int RULE_LANGUAGE_KEYWORD=30;
    public static final int RULE_DIGIT_NONZERO=64;
    public static final int RULE_CURLY_OPEN=66;
    public static final int RULE_DBL_GT=53;
    public static final int RULE_TO=61;
    public static final int RULE_ROUND_CLOSE=69;
    public static final int RULE_GT=78;
    public static final int RULE_ACTIVE_KEYWORD=33;
    public static final int RULE_CONCEPT_SHORT_KEYWORD=48;
    public static final int RULE_SLOTNAME_STRING=20;
    public static final int RULE_SCG=9;
    public static final int RULE_MODULEID_KEYWORD=31;
    public static final int RULE_GTE=56;
    public static final int RULE_DOUBLE_SQUARE_OPEN=4;
    public static final int RULE_DISJUNCTION_KEYWORD=45;
    public static final int RULE_EQUIVALENT_TO=14;
    public static final int RULE_ROUND_OPEN=68;
    public static final int RULE_DBL_LT=52;
    public static final int RULE_TYPEID_KEYWORD=34;
    public static final int RULE_MATCH_KEYWORD=38;
    public static final int RULE_NOT_EQUAL=76;
    public static final int RULE_SQUARE_CLOSE=19;
    public static final int RULE_SEMANTIC_TAG_KEYWORD=28;
    public static final int RULE_ID=8;
    public static final int RULE_SQUARE_OPEN=18;
    public static final int RULE_EQUAL=75;
    public static final int RULE_DEC=13;
    public static final int RULE_CASE_SIGNIFICANCE_ID_KEYWORD=21;
    public static final int RULE_EXCLUSION_KEYWORD=35;
    public static final int RULE_DESCRIPTION_SHORT_KEYWORD=47;
    public static final int RULE_LT_EM=54;
    public static final int RULE_COMMA=62;
    public static final int RULE_CURLY_CLOSE=67;
    public static final int RULE_DBL_GT_EM=51;
    public static final int RULE_COLON=65;
    public static final int RULE_TILDE=6;
    public static final int RULE_LT=77;
    public static final int RULE_DOUBLE_CURLY_CLOSE=59;
    public static final int RULE_LANGUAGE_REFSET_ID_KEYWORD=24;
    public static final int RULE_INT=12;
    public static final int RULE_EXACT_KEYWORD=36;
    public static final int RULE_ML_COMMENT=80;
    public static final int RULE_DOUBLE_SQUARE_CLOSE=5;
    public static final int RULE_PREFERRED_IN_KEYWORD=27;
    public static final int RULE_PIPE_DELIMITED_STRING=60;
    public static final int RULE_LTE=57;
    public static final int RULE_TYPE_KEYWORD=42;
    public static final int RULE_STRING=16;
    public static final int RULE_AT=7;
    public static final int RULE_FALSE_KEYWORD=37;
    public static final int RULE_REVERSED=46;
    public static final int RULE_SL_COMMENT=81;
    public static final int RULE_DIGIT_ZERO=63;
    public static final int RULE_HASH=79;
    public static final int RULE_TOK=10;
    public static final int RULE_DASH=71;
    public static final int RULE_PLUS=70;
    public static final int RULE_DOT=73;
    public static final int EOF=-1;
    public static final int RULE_DIALECTID_KEYWORD=29;
    public static final int RULE_KEYWORD=49;
    public static final int RULE_DEFINITION_STATUS_ID_KEYWORD=22;
    public static final int RULE_DEFINITION_STATUS_TOKEN_KEYWORD=23;
    public static final int RULE_ACCEPTABLE_IN_KEYWORD=26;
    public static final int RULE_SUBTYPE_OF=15;
    public static final int RULE_WS=17;
    public static final int RULE_TERM_KEYWORD=40;
    public static final int RULE_GT_EM=55;
    public static final int RULE_REGEX_KEYWORD=39;
    public static final int RULE_TRUE_KEYWORD=41;
    public static final int RULE_CARET=72;
    public static final int RULE_DOUBLE_CURLY_OPEN=58;
    public static final int RULE_WILD_KEYWORD=43;
    public static final int RULE_CONJUNCTION_KEYWORD=44;
    public static final int RULE_STR=11;
    public static final int RULE_WILDCARD=74;
    public static final int RULE_EFFECTIVE_TIME_KEYWORD=25;
    public static final int RULE_DBL_LT_EM=50;

    // delegates
    // delegators


        public InternalEtlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEtlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEtlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEtlParser.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private EtlGrammarAccess grammarAccess;

        public InternalEtlParser(TokenStream input, EtlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ExpressionTemplate";
       	}

       	@Override
       	protected EtlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExpressionTemplate"
    // InternalEtlParser.g:75:1: entryRuleExpressionTemplate returns [EObject current=null] : iv_ruleExpressionTemplate= ruleExpressionTemplate EOF ;
    public final EObject entryRuleExpressionTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTemplate = null;


        try {
            // InternalEtlParser.g:75:59: (iv_ruleExpressionTemplate= ruleExpressionTemplate EOF )
            // InternalEtlParser.g:76:2: iv_ruleExpressionTemplate= ruleExpressionTemplate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionTemplateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpressionTemplate=ruleExpressionTemplate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionTemplate; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionTemplate"


    // $ANTLR start "ruleExpressionTemplate"
    // InternalEtlParser.g:82:1: ruleExpressionTemplate returns [EObject current=null] : ( () ( ( ( ( (lv_primitive_1_0= RULE_SUBTYPE_OF ) ) | this_EQUIVALENT_TO_2= RULE_EQUIVALENT_TO ) | ( (lv_slot_3_0= ruleTokenReplacementSlot ) ) )? ( (lv_expression_4_0= ruleSubExpression ) ) )? ) ;
    public final EObject ruleExpressionTemplate() throws RecognitionException {
        EObject current = null;

        Token lv_primitive_1_0=null;
        Token this_EQUIVALENT_TO_2=null;
        EObject lv_slot_3_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:88:2: ( ( () ( ( ( ( (lv_primitive_1_0= RULE_SUBTYPE_OF ) ) | this_EQUIVALENT_TO_2= RULE_EQUIVALENT_TO ) | ( (lv_slot_3_0= ruleTokenReplacementSlot ) ) )? ( (lv_expression_4_0= ruleSubExpression ) ) )? ) )
            // InternalEtlParser.g:89:2: ( () ( ( ( ( (lv_primitive_1_0= RULE_SUBTYPE_OF ) ) | this_EQUIVALENT_TO_2= RULE_EQUIVALENT_TO ) | ( (lv_slot_3_0= ruleTokenReplacementSlot ) ) )? ( (lv_expression_4_0= ruleSubExpression ) ) )? )
            {
            // InternalEtlParser.g:89:2: ( () ( ( ( ( (lv_primitive_1_0= RULE_SUBTYPE_OF ) ) | this_EQUIVALENT_TO_2= RULE_EQUIVALENT_TO ) | ( (lv_slot_3_0= ruleTokenReplacementSlot ) ) )? ( (lv_expression_4_0= ruleSubExpression ) ) )? )
            // InternalEtlParser.g:90:3: () ( ( ( ( (lv_primitive_1_0= RULE_SUBTYPE_OF ) ) | this_EQUIVALENT_TO_2= RULE_EQUIVALENT_TO ) | ( (lv_slot_3_0= ruleTokenReplacementSlot ) ) )? ( (lv_expression_4_0= ruleSubExpression ) ) )?
            {
            // InternalEtlParser.g:90:3: ()
            // InternalEtlParser.g:91:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExpressionTemplateAccess().getExpressionTemplateAction_0(),
              					current);
              			
            }

            }

            // InternalEtlParser.g:100:3: ( ( ( ( (lv_primitive_1_0= RULE_SUBTYPE_OF ) ) | this_EQUIVALENT_TO_2= RULE_EQUIVALENT_TO ) | ( (lv_slot_3_0= ruleTokenReplacementSlot ) ) )? ( (lv_expression_4_0= ruleSubExpression ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_DOUBLE_SQUARE_OPEN||(LA3_0>=RULE_EQUIVALENT_TO && LA3_0<=RULE_SUBTYPE_OF)||(LA3_0>=RULE_DIGIT_ZERO && LA3_0<=RULE_DIGIT_NONZERO)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEtlParser.g:101:4: ( ( ( (lv_primitive_1_0= RULE_SUBTYPE_OF ) ) | this_EQUIVALENT_TO_2= RULE_EQUIVALENT_TO ) | ( (lv_slot_3_0= ruleTokenReplacementSlot ) ) )? ( (lv_expression_4_0= ruleSubExpression ) )
                    {
                    // InternalEtlParser.g:101:4: ( ( ( (lv_primitive_1_0= RULE_SUBTYPE_OF ) ) | this_EQUIVALENT_TO_2= RULE_EQUIVALENT_TO ) | ( (lv_slot_3_0= ruleTokenReplacementSlot ) ) )?
                    int alt2=3;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=RULE_EQUIVALENT_TO && LA2_0<=RULE_SUBTYPE_OF)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==RULE_DOUBLE_SQUARE_OPEN) ) {
                        int LA2_2 = input.LA(2);

                        if ( (LA2_2==RULE_PLUS) ) {
                            int LA2_4 = input.LA(3);

                            if ( (LA2_4==RULE_TOK) ) {
                                alt2=2;
                            }
                        }
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalEtlParser.g:102:5: ( ( (lv_primitive_1_0= RULE_SUBTYPE_OF ) ) | this_EQUIVALENT_TO_2= RULE_EQUIVALENT_TO )
                            {
                            // InternalEtlParser.g:102:5: ( ( (lv_primitive_1_0= RULE_SUBTYPE_OF ) ) | this_EQUIVALENT_TO_2= RULE_EQUIVALENT_TO )
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==RULE_SUBTYPE_OF) ) {
                                alt1=1;
                            }
                            else if ( (LA1_0==RULE_EQUIVALENT_TO) ) {
                                alt1=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 0, input);

                                throw nvae;
                            }
                            switch (alt1) {
                                case 1 :
                                    // InternalEtlParser.g:103:6: ( (lv_primitive_1_0= RULE_SUBTYPE_OF ) )
                                    {
                                    // InternalEtlParser.g:103:6: ( (lv_primitive_1_0= RULE_SUBTYPE_OF ) )
                                    // InternalEtlParser.g:104:7: (lv_primitive_1_0= RULE_SUBTYPE_OF )
                                    {
                                    // InternalEtlParser.g:104:7: (lv_primitive_1_0= RULE_SUBTYPE_OF )
                                    // InternalEtlParser.g:105:8: lv_primitive_1_0= RULE_SUBTYPE_OF
                                    {
                                    lv_primitive_1_0=(Token)match(input,RULE_SUBTYPE_OF,FollowSets000.FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_primitive_1_0, grammarAccess.getExpressionTemplateAccess().getPrimitiveSUBTYPE_OFTerminalRuleCall_1_0_0_0_0());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getExpressionTemplateRule());
                                      								}
                                      								setWithLastConsumed(
                                      									current,
                                      									"primitive",
                                      									lv_primitive_1_0 != null,
                                      									"com.b2international.snomed.etl.Etl.SUBTYPE_OF");
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalEtlParser.g:122:6: this_EQUIVALENT_TO_2= RULE_EQUIVALENT_TO
                                    {
                                    this_EQUIVALENT_TO_2=(Token)match(input,RULE_EQUIVALENT_TO,FollowSets000.FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(this_EQUIVALENT_TO_2, grammarAccess.getExpressionTemplateAccess().getEQUIVALENT_TOTerminalRuleCall_1_0_0_1());
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalEtlParser.g:128:5: ( (lv_slot_3_0= ruleTokenReplacementSlot ) )
                            {
                            // InternalEtlParser.g:128:5: ( (lv_slot_3_0= ruleTokenReplacementSlot ) )
                            // InternalEtlParser.g:129:6: (lv_slot_3_0= ruleTokenReplacementSlot )
                            {
                            // InternalEtlParser.g:129:6: (lv_slot_3_0= ruleTokenReplacementSlot )
                            // InternalEtlParser.g:130:7: lv_slot_3_0= ruleTokenReplacementSlot
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpressionTemplateAccess().getSlotTokenReplacementSlotParserRuleCall_1_0_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_3);
                            lv_slot_3_0=ruleTokenReplacementSlot();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpressionTemplateRule());
                              							}
                              							set(
                              								current,
                              								"slot",
                              								lv_slot_3_0,
                              								"com.b2international.snomed.etl.Etl.TokenReplacementSlot");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalEtlParser.g:148:4: ( (lv_expression_4_0= ruleSubExpression ) )
                    // InternalEtlParser.g:149:5: (lv_expression_4_0= ruleSubExpression )
                    {
                    // InternalEtlParser.g:149:5: (lv_expression_4_0= ruleSubExpression )
                    // InternalEtlParser.g:150:6: lv_expression_4_0= ruleSubExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionTemplateAccess().getExpressionSubExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expression_4_0=ruleSubExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionTemplateRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_4_0,
                      							"com.b2international.snomed.etl.Etl.SubExpression");
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
    // $ANTLR end "ruleExpressionTemplate"


    // $ANTLR start "entryRuleSubExpression"
    // InternalEtlParser.g:172:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalEtlParser.g:172:54: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalEtlParser.g:173:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // InternalEtlParser.g:179:1: ruleSubExpression returns [EObject current=null] : ( ( (lv_focusConcepts_0_0= ruleFocusConcept ) ) (this_PLUS_1= RULE_PLUS ( (lv_focusConcepts_2_0= ruleFocusConcept ) ) )* (this_COLON_3= RULE_COLON ( (lv_refinement_4_0= ruleRefinement ) ) )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        Token this_PLUS_1=null;
        Token this_COLON_3=null;
        EObject lv_focusConcepts_0_0 = null;

        EObject lv_focusConcepts_2_0 = null;

        EObject lv_refinement_4_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:185:2: ( ( ( (lv_focusConcepts_0_0= ruleFocusConcept ) ) (this_PLUS_1= RULE_PLUS ( (lv_focusConcepts_2_0= ruleFocusConcept ) ) )* (this_COLON_3= RULE_COLON ( (lv_refinement_4_0= ruleRefinement ) ) )? ) )
            // InternalEtlParser.g:186:2: ( ( (lv_focusConcepts_0_0= ruleFocusConcept ) ) (this_PLUS_1= RULE_PLUS ( (lv_focusConcepts_2_0= ruleFocusConcept ) ) )* (this_COLON_3= RULE_COLON ( (lv_refinement_4_0= ruleRefinement ) ) )? )
            {
            // InternalEtlParser.g:186:2: ( ( (lv_focusConcepts_0_0= ruleFocusConcept ) ) (this_PLUS_1= RULE_PLUS ( (lv_focusConcepts_2_0= ruleFocusConcept ) ) )* (this_COLON_3= RULE_COLON ( (lv_refinement_4_0= ruleRefinement ) ) )? )
            // InternalEtlParser.g:187:3: ( (lv_focusConcepts_0_0= ruleFocusConcept ) ) (this_PLUS_1= RULE_PLUS ( (lv_focusConcepts_2_0= ruleFocusConcept ) ) )* (this_COLON_3= RULE_COLON ( (lv_refinement_4_0= ruleRefinement ) ) )?
            {
            // InternalEtlParser.g:187:3: ( (lv_focusConcepts_0_0= ruleFocusConcept ) )
            // InternalEtlParser.g:188:4: (lv_focusConcepts_0_0= ruleFocusConcept )
            {
            // InternalEtlParser.g:188:4: (lv_focusConcepts_0_0= ruleFocusConcept )
            // InternalEtlParser.g:189:5: lv_focusConcepts_0_0= ruleFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubExpressionAccess().getFocusConceptsFocusConceptParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_focusConcepts_0_0=ruleFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubExpressionRule());
              					}
              					add(
              						current,
              						"focusConcepts",
              						lv_focusConcepts_0_0,
              						"com.b2international.snomed.etl.Etl.FocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:206:3: (this_PLUS_1= RULE_PLUS ( (lv_focusConcepts_2_0= ruleFocusConcept ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_PLUS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEtlParser.g:207:4: this_PLUS_1= RULE_PLUS ( (lv_focusConcepts_2_0= ruleFocusConcept ) )
            	    {
            	    this_PLUS_1=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_PLUS_1, grammarAccess.getSubExpressionAccess().getPLUSTerminalRuleCall_1_0());
            	      			
            	    }
            	    // InternalEtlParser.g:211:4: ( (lv_focusConcepts_2_0= ruleFocusConcept ) )
            	    // InternalEtlParser.g:212:5: (lv_focusConcepts_2_0= ruleFocusConcept )
            	    {
            	    // InternalEtlParser.g:212:5: (lv_focusConcepts_2_0= ruleFocusConcept )
            	    // InternalEtlParser.g:213:6: lv_focusConcepts_2_0= ruleFocusConcept
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSubExpressionAccess().getFocusConceptsFocusConceptParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_focusConcepts_2_0=ruleFocusConcept();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSubExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"focusConcepts",
            	      							lv_focusConcepts_2_0,
            	      							"com.b2international.snomed.etl.Etl.FocusConcept");
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

            // InternalEtlParser.g:231:3: (this_COLON_3= RULE_COLON ( (lv_refinement_4_0= ruleRefinement ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_COLON) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEtlParser.g:232:4: this_COLON_3= RULE_COLON ( (lv_refinement_4_0= ruleRefinement ) )
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_COLON_3, grammarAccess.getSubExpressionAccess().getCOLONTerminalRuleCall_2_0());
                      			
                    }
                    // InternalEtlParser.g:236:4: ( (lv_refinement_4_0= ruleRefinement ) )
                    // InternalEtlParser.g:237:5: (lv_refinement_4_0= ruleRefinement )
                    {
                    // InternalEtlParser.g:237:5: (lv_refinement_4_0= ruleRefinement )
                    // InternalEtlParser.g:238:6: lv_refinement_4_0= ruleRefinement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSubExpressionAccess().getRefinementRefinementParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_refinement_4_0=ruleRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                      						}
                      						set(
                      							current,
                      							"refinement",
                      							lv_refinement_4_0,
                      							"com.b2international.snomed.etl.Etl.Refinement");
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleFocusConcept"
    // InternalEtlParser.g:260:1: entryRuleFocusConcept returns [EObject current=null] : iv_ruleFocusConcept= ruleFocusConcept EOF ;
    public final EObject entryRuleFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFocusConcept = null;


        try {
            // InternalEtlParser.g:260:53: (iv_ruleFocusConcept= ruleFocusConcept EOF )
            // InternalEtlParser.g:261:2: iv_ruleFocusConcept= ruleFocusConcept EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFocusConceptRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFocusConcept=ruleFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFocusConcept; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFocusConcept"


    // $ANTLR start "ruleFocusConcept"
    // InternalEtlParser.g:267:1: ruleFocusConcept returns [EObject current=null] : ( ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? ( (lv_concept_1_0= ruleConceptReference ) ) ) ;
    public final EObject ruleFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject lv_slot_0_0 = null;

        EObject lv_concept_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:273:2: ( ( ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? ( (lv_concept_1_0= ruleConceptReference ) ) ) )
            // InternalEtlParser.g:274:2: ( ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? ( (lv_concept_1_0= ruleConceptReference ) ) )
            {
            // InternalEtlParser.g:274:2: ( ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? ( (lv_concept_1_0= ruleConceptReference ) ) )
            // InternalEtlParser.g:275:3: ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? ( (lv_concept_1_0= ruleConceptReference ) )
            {
            // InternalEtlParser.g:275:3: ( (lv_slot_0_0= ruleTemplateInformationSlot ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOUBLE_SQUARE_OPEN) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=RULE_DOUBLE_SQUARE_CLOSE && LA6_1<=RULE_TILDE)||LA6_1==RULE_SLOTNAME_STRING||(LA6_1>=RULE_DIGIT_ZERO && LA6_1<=RULE_DIGIT_NONZERO)) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalEtlParser.g:276:4: (lv_slot_0_0= ruleTemplateInformationSlot )
                    {
                    // InternalEtlParser.g:276:4: (lv_slot_0_0= ruleTemplateInformationSlot )
                    // InternalEtlParser.g:277:5: lv_slot_0_0= ruleTemplateInformationSlot
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFocusConceptAccess().getSlotTemplateInformationSlotParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_3);
                    lv_slot_0_0=ruleTemplateInformationSlot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFocusConceptRule());
                      					}
                      					set(
                      						current,
                      						"slot",
                      						lv_slot_0_0,
                      						"com.b2international.snomed.etl.Etl.TemplateInformationSlot");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEtlParser.g:294:3: ( (lv_concept_1_0= ruleConceptReference ) )
            // InternalEtlParser.g:295:4: (lv_concept_1_0= ruleConceptReference )
            {
            // InternalEtlParser.g:295:4: (lv_concept_1_0= ruleConceptReference )
            // InternalEtlParser.g:296:5: lv_concept_1_0= ruleConceptReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFocusConceptAccess().getConceptConceptReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_concept_1_0=ruleConceptReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFocusConceptRule());
              					}
              					set(
              						current,
              						"concept",
              						lv_concept_1_0,
              						"com.b2international.snomed.etl.Etl.ConceptReference");
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
    // $ANTLR end "ruleFocusConcept"


    // $ANTLR start "entryRuleRefinement"
    // InternalEtlParser.g:317:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // InternalEtlParser.g:317:51: (iv_ruleRefinement= ruleRefinement EOF )
            // InternalEtlParser.g:318:2: iv_ruleRefinement= ruleRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRefinement=ruleRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefinement"


    // $ANTLR start "ruleRefinement"
    // InternalEtlParser.g:324:1: ruleRefinement returns [EObject current=null] : ( ( ( ( (lv_attributes_0_0= ruleAttribute ) ) (this_COMMA_1= RULE_COMMA ( (lv_attributes_2_0= ruleAttribute ) ) )* ) | ( (lv_groups_3_0= ruleAttributeGroup ) ) ) ( (this_COMMA_4= RULE_COMMA )? ( (lv_groups_5_0= ruleAttributeGroup ) ) )* ) ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        Token this_COMMA_4=null;
        EObject lv_attributes_0_0 = null;

        EObject lv_attributes_2_0 = null;

        EObject lv_groups_3_0 = null;

        EObject lv_groups_5_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:330:2: ( ( ( ( ( (lv_attributes_0_0= ruleAttribute ) ) (this_COMMA_1= RULE_COMMA ( (lv_attributes_2_0= ruleAttribute ) ) )* ) | ( (lv_groups_3_0= ruleAttributeGroup ) ) ) ( (this_COMMA_4= RULE_COMMA )? ( (lv_groups_5_0= ruleAttributeGroup ) ) )* ) )
            // InternalEtlParser.g:331:2: ( ( ( ( (lv_attributes_0_0= ruleAttribute ) ) (this_COMMA_1= RULE_COMMA ( (lv_attributes_2_0= ruleAttribute ) ) )* ) | ( (lv_groups_3_0= ruleAttributeGroup ) ) ) ( (this_COMMA_4= RULE_COMMA )? ( (lv_groups_5_0= ruleAttributeGroup ) ) )* )
            {
            // InternalEtlParser.g:331:2: ( ( ( ( (lv_attributes_0_0= ruleAttribute ) ) (this_COMMA_1= RULE_COMMA ( (lv_attributes_2_0= ruleAttribute ) ) )* ) | ( (lv_groups_3_0= ruleAttributeGroup ) ) ) ( (this_COMMA_4= RULE_COMMA )? ( (lv_groups_5_0= ruleAttributeGroup ) ) )* )
            // InternalEtlParser.g:332:3: ( ( ( (lv_attributes_0_0= ruleAttribute ) ) (this_COMMA_1= RULE_COMMA ( (lv_attributes_2_0= ruleAttribute ) ) )* ) | ( (lv_groups_3_0= ruleAttributeGroup ) ) ) ( (this_COMMA_4= RULE_COMMA )? ( (lv_groups_5_0= ruleAttributeGroup ) ) )*
            {
            // InternalEtlParser.g:332:3: ( ( ( (lv_attributes_0_0= ruleAttribute ) ) (this_COMMA_1= RULE_COMMA ( (lv_attributes_2_0= ruleAttribute ) ) )* ) | ( (lv_groups_3_0= ruleAttributeGroup ) ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalEtlParser.g:333:4: ( ( (lv_attributes_0_0= ruleAttribute ) ) (this_COMMA_1= RULE_COMMA ( (lv_attributes_2_0= ruleAttribute ) ) )* )
                    {
                    // InternalEtlParser.g:333:4: ( ( (lv_attributes_0_0= ruleAttribute ) ) (this_COMMA_1= RULE_COMMA ( (lv_attributes_2_0= ruleAttribute ) ) )* )
                    // InternalEtlParser.g:334:5: ( (lv_attributes_0_0= ruleAttribute ) ) (this_COMMA_1= RULE_COMMA ( (lv_attributes_2_0= ruleAttribute ) ) )*
                    {
                    // InternalEtlParser.g:334:5: ( (lv_attributes_0_0= ruleAttribute ) )
                    // InternalEtlParser.g:335:6: (lv_attributes_0_0= ruleAttribute )
                    {
                    // InternalEtlParser.g:335:6: (lv_attributes_0_0= ruleAttribute )
                    // InternalEtlParser.g:336:7: lv_attributes_0_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_attributes_0_0=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getRefinementRule());
                      							}
                      							add(
                      								current,
                      								"attributes",
                      								lv_attributes_0_0,
                      								"com.b2international.snomed.etl.Etl.Attribute");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalEtlParser.g:353:5: (this_COMMA_1= RULE_COMMA ( (lv_attributes_2_0= ruleAttribute ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        alt7 = dfa7.predict(input);
                        switch (alt7) {
                    	case 1 :
                    	    // InternalEtlParser.g:354:6: this_COMMA_1= RULE_COMMA ( (lv_attributes_2_0= ruleAttribute ) )
                    	    {
                    	    this_COMMA_1=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(this_COMMA_1, grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_0_0_1_0());
                    	      					
                    	    }
                    	    // InternalEtlParser.g:358:6: ( (lv_attributes_2_0= ruleAttribute ) )
                    	    // InternalEtlParser.g:359:7: (lv_attributes_2_0= ruleAttribute )
                    	    {
                    	    // InternalEtlParser.g:359:7: (lv_attributes_2_0= ruleAttribute )
                    	    // InternalEtlParser.g:360:8: lv_attributes_2_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_attributes_2_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getRefinementRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"attributes",
                    	      									lv_attributes_2_0,
                    	      									"com.b2international.snomed.etl.Etl.Attribute");
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
                    break;
                case 2 :
                    // InternalEtlParser.g:380:4: ( (lv_groups_3_0= ruleAttributeGroup ) )
                    {
                    // InternalEtlParser.g:380:4: ( (lv_groups_3_0= ruleAttributeGroup ) )
                    // InternalEtlParser.g:381:5: (lv_groups_3_0= ruleAttributeGroup )
                    {
                    // InternalEtlParser.g:381:5: (lv_groups_3_0= ruleAttributeGroup )
                    // InternalEtlParser.g:382:6: lv_groups_3_0= ruleAttributeGroup
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_groups_3_0=ruleAttributeGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRefinementRule());
                      						}
                      						add(
                      							current,
                      							"groups",
                      							lv_groups_3_0,
                      							"com.b2international.snomed.etl.Etl.AttributeGroup");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalEtlParser.g:400:3: ( (this_COMMA_4= RULE_COMMA )? ( (lv_groups_5_0= ruleAttributeGroup ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DOUBLE_SQUARE_OPEN||LA10_0==RULE_COMMA||LA10_0==RULE_CURLY_OPEN) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEtlParser.g:401:4: (this_COMMA_4= RULE_COMMA )? ( (lv_groups_5_0= ruleAttributeGroup ) )
            	    {
            	    // InternalEtlParser.g:401:4: (this_COMMA_4= RULE_COMMA )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_COMMA) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalEtlParser.g:402:5: this_COMMA_4= RULE_COMMA
            	            {
            	            this_COMMA_4=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_4, grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_1_0());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEtlParser.g:407:4: ( (lv_groups_5_0= ruleAttributeGroup ) )
            	    // InternalEtlParser.g:408:5: (lv_groups_5_0= ruleAttributeGroup )
            	    {
            	    // InternalEtlParser.g:408:5: (lv_groups_5_0= ruleAttributeGroup )
            	    // InternalEtlParser.g:409:6: lv_groups_5_0= ruleAttributeGroup
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_groups_5_0=ruleAttributeGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRefinementRule());
            	      						}
            	      						add(
            	      							current,
            	      							"groups",
            	      							lv_groups_5_0,
            	      							"com.b2international.snomed.etl.Etl.AttributeGroup");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleRefinement"


    // $ANTLR start "entryRuleAttributeGroup"
    // InternalEtlParser.g:431:1: entryRuleAttributeGroup returns [EObject current=null] : iv_ruleAttributeGroup= ruleAttributeGroup EOF ;
    public final EObject entryRuleAttributeGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeGroup = null;


        try {
            // InternalEtlParser.g:431:55: (iv_ruleAttributeGroup= ruleAttributeGroup EOF )
            // InternalEtlParser.g:432:2: iv_ruleAttributeGroup= ruleAttributeGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeGroup=ruleAttributeGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeGroup; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeGroup"


    // $ANTLR start "ruleAttributeGroup"
    // InternalEtlParser.g:438:1: ruleAttributeGroup returns [EObject current=null] : ( ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_attributes_2_0= ruleAttribute ) ) (this_COMMA_3= RULE_COMMA ( (lv_attributes_4_0= ruleAttribute ) ) )* this_CURLY_CLOSE_5= RULE_CURLY_CLOSE ) ;
    public final EObject ruleAttributeGroup() throws RecognitionException {
        EObject current = null;

        Token this_CURLY_OPEN_1=null;
        Token this_COMMA_3=null;
        Token this_CURLY_CLOSE_5=null;
        EObject lv_slot_0_0 = null;

        EObject lv_attributes_2_0 = null;

        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:444:2: ( ( ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_attributes_2_0= ruleAttribute ) ) (this_COMMA_3= RULE_COMMA ( (lv_attributes_4_0= ruleAttribute ) ) )* this_CURLY_CLOSE_5= RULE_CURLY_CLOSE ) )
            // InternalEtlParser.g:445:2: ( ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_attributes_2_0= ruleAttribute ) ) (this_COMMA_3= RULE_COMMA ( (lv_attributes_4_0= ruleAttribute ) ) )* this_CURLY_CLOSE_5= RULE_CURLY_CLOSE )
            {
            // InternalEtlParser.g:445:2: ( ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_attributes_2_0= ruleAttribute ) ) (this_COMMA_3= RULE_COMMA ( (lv_attributes_4_0= ruleAttribute ) ) )* this_CURLY_CLOSE_5= RULE_CURLY_CLOSE )
            // InternalEtlParser.g:446:3: ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_attributes_2_0= ruleAttribute ) ) (this_COMMA_3= RULE_COMMA ( (lv_attributes_4_0= ruleAttribute ) ) )* this_CURLY_CLOSE_5= RULE_CURLY_CLOSE
            {
            // InternalEtlParser.g:446:3: ( (lv_slot_0_0= ruleTemplateInformationSlot ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DOUBLE_SQUARE_OPEN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEtlParser.g:447:4: (lv_slot_0_0= ruleTemplateInformationSlot )
                    {
                    // InternalEtlParser.g:447:4: (lv_slot_0_0= ruleTemplateInformationSlot )
                    // InternalEtlParser.g:448:5: lv_slot_0_0= ruleTemplateInformationSlot
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeGroupAccess().getSlotTemplateInformationSlotParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_slot_0_0=ruleTemplateInformationSlot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAttributeGroupRule());
                      					}
                      					set(
                      						current,
                      						"slot",
                      						lv_slot_0_0,
                      						"com.b2international.snomed.etl.Etl.TemplateInformationSlot");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            this_CURLY_OPEN_1=(Token)match(input,RULE_CURLY_OPEN,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CURLY_OPEN_1, grammarAccess.getAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:469:3: ( (lv_attributes_2_0= ruleAttribute ) )
            // InternalEtlParser.g:470:4: (lv_attributes_2_0= ruleAttribute )
            {
            // InternalEtlParser.g:470:4: (lv_attributes_2_0= ruleAttribute )
            // InternalEtlParser.g:471:5: lv_attributes_2_0= ruleAttribute
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_8);
            lv_attributes_2_0=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeGroupRule());
              					}
              					add(
              						current,
              						"attributes",
              						lv_attributes_2_0,
              						"com.b2international.snomed.etl.Etl.Attribute");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:488:3: (this_COMMA_3= RULE_COMMA ( (lv_attributes_4_0= ruleAttribute ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEtlParser.g:489:4: this_COMMA_3= RULE_COMMA ( (lv_attributes_4_0= ruleAttribute ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_COMMA_3, grammarAccess.getAttributeGroupAccess().getCOMMATerminalRuleCall_3_0());
            	      			
            	    }
            	    // InternalEtlParser.g:493:4: ( (lv_attributes_4_0= ruleAttribute ) )
            	    // InternalEtlParser.g:494:5: (lv_attributes_4_0= ruleAttribute )
            	    {
            	    // InternalEtlParser.g:494:5: (lv_attributes_4_0= ruleAttribute )
            	    // InternalEtlParser.g:495:6: lv_attributes_4_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_attributes_4_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAttributeGroupRule());
            	      						}
            	      						add(
            	      							current,
            	      							"attributes",
            	      							lv_attributes_4_0,
            	      							"com.b2international.snomed.etl.Etl.Attribute");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            this_CURLY_CLOSE_5=(Token)match(input,RULE_CURLY_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CURLY_CLOSE_5, grammarAccess.getAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_4());
              		
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
    // $ANTLR end "ruleAttributeGroup"


    // $ANTLR start "entryRuleAttribute"
    // InternalEtlParser.g:521:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalEtlParser.g:521:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalEtlParser.g:522:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalEtlParser.g:528:1: ruleAttribute returns [EObject current=null] : ( ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? ( (lv_name_1_0= ruleConceptReference ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= ruleAttributeValue ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_2=null;
        EObject lv_slot_0_0 = null;

        EObject lv_name_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:534:2: ( ( ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? ( (lv_name_1_0= ruleConceptReference ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= ruleAttributeValue ) ) ) )
            // InternalEtlParser.g:535:2: ( ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? ( (lv_name_1_0= ruleConceptReference ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= ruleAttributeValue ) ) )
            {
            // InternalEtlParser.g:535:2: ( ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? ( (lv_name_1_0= ruleConceptReference ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= ruleAttributeValue ) ) )
            // InternalEtlParser.g:536:3: ( (lv_slot_0_0= ruleTemplateInformationSlot ) )? ( (lv_name_1_0= ruleConceptReference ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= ruleAttributeValue ) )
            {
            // InternalEtlParser.g:536:3: ( (lv_slot_0_0= ruleTemplateInformationSlot ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DOUBLE_SQUARE_OPEN) ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>=RULE_DOUBLE_SQUARE_CLOSE && LA13_1<=RULE_TILDE)||LA13_1==RULE_SLOTNAME_STRING||(LA13_1>=RULE_DIGIT_ZERO && LA13_1<=RULE_DIGIT_NONZERO)) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalEtlParser.g:537:4: (lv_slot_0_0= ruleTemplateInformationSlot )
                    {
                    // InternalEtlParser.g:537:4: (lv_slot_0_0= ruleTemplateInformationSlot )
                    // InternalEtlParser.g:538:5: lv_slot_0_0= ruleTemplateInformationSlot
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeAccess().getSlotTemplateInformationSlotParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_3);
                    lv_slot_0_0=ruleTemplateInformationSlot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAttributeRule());
                      					}
                      					set(
                      						current,
                      						"slot",
                      						lv_slot_0_0,
                      						"com.b2international.snomed.etl.Etl.TemplateInformationSlot");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEtlParser.g:555:3: ( (lv_name_1_0= ruleConceptReference ) )
            // InternalEtlParser.g:556:4: (lv_name_1_0= ruleConceptReference )
            {
            // InternalEtlParser.g:556:4: (lv_name_1_0= ruleConceptReference )
            // InternalEtlParser.g:557:5: lv_name_1_0= ruleConceptReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getNameConceptReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_9);
            lv_name_1_0=ruleConceptReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.b2international.snomed.etl.Etl.ConceptReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_2, grammarAccess.getAttributeAccess().getEQUALTerminalRuleCall_2());
              		
            }
            // InternalEtlParser.g:578:3: ( (lv_value_3_0= ruleAttributeValue ) )
            // InternalEtlParser.g:579:4: (lv_value_3_0= ruleAttributeValue )
            {
            // InternalEtlParser.g:579:4: (lv_value_3_0= ruleAttributeValue )
            // InternalEtlParser.g:580:5: lv_value_3_0= ruleAttributeValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_3_0=ruleAttributeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"com.b2international.snomed.etl.Etl.AttributeValue");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalEtlParser.g:601:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalEtlParser.g:601:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalEtlParser.g:602:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalEtlParser.g:608:1: ruleAttributeValue returns [EObject current=null] : (this_ConceptReference_0= ruleConceptReference | (this_ROUND_OPEN_1= RULE_ROUND_OPEN this_SubExpression_2= ruleSubExpression this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) | this_StringValue_4= ruleStringValue | this_IntegerValue_5= ruleIntegerValue | this_DecimalValue_6= ruleDecimalValue | this_ConcreteValueReplacementSlot_7= ruleConcreteValueReplacementSlot ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_1=null;
        Token this_ROUND_CLOSE_3=null;
        EObject this_ConceptReference_0 = null;

        EObject this_SubExpression_2 = null;

        EObject this_StringValue_4 = null;

        EObject this_IntegerValue_5 = null;

        EObject this_DecimalValue_6 = null;

        EObject this_ConcreteValueReplacementSlot_7 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:614:2: ( (this_ConceptReference_0= ruleConceptReference | (this_ROUND_OPEN_1= RULE_ROUND_OPEN this_SubExpression_2= ruleSubExpression this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) | this_StringValue_4= ruleStringValue | this_IntegerValue_5= ruleIntegerValue | this_DecimalValue_6= ruleDecimalValue | this_ConcreteValueReplacementSlot_7= ruleConcreteValueReplacementSlot ) )
            // InternalEtlParser.g:615:2: (this_ConceptReference_0= ruleConceptReference | (this_ROUND_OPEN_1= RULE_ROUND_OPEN this_SubExpression_2= ruleSubExpression this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) | this_StringValue_4= ruleStringValue | this_IntegerValue_5= ruleIntegerValue | this_DecimalValue_6= ruleDecimalValue | this_ConcreteValueReplacementSlot_7= ruleConcreteValueReplacementSlot )
            {
            // InternalEtlParser.g:615:2: (this_ConceptReference_0= ruleConceptReference | (this_ROUND_OPEN_1= RULE_ROUND_OPEN this_SubExpression_2= ruleSubExpression this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) | this_StringValue_4= ruleStringValue | this_IntegerValue_5= ruleIntegerValue | this_DecimalValue_6= ruleDecimalValue | this_ConcreteValueReplacementSlot_7= ruleConcreteValueReplacementSlot )
            int alt14=6;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalEtlParser.g:616:3: this_ConceptReference_0= ruleConceptReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAttributeValueAccess().getConceptReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ConceptReference_0=ruleConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConceptReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:628:3: (this_ROUND_OPEN_1= RULE_ROUND_OPEN this_SubExpression_2= ruleSubExpression this_ROUND_CLOSE_3= RULE_ROUND_CLOSE )
                    {
                    // InternalEtlParser.g:628:3: (this_ROUND_OPEN_1= RULE_ROUND_OPEN this_SubExpression_2= ruleSubExpression this_ROUND_CLOSE_3= RULE_ROUND_CLOSE )
                    // InternalEtlParser.g:629:4: this_ROUND_OPEN_1= RULE_ROUND_OPEN this_SubExpression_2= ruleSubExpression this_ROUND_CLOSE_3= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_1=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ROUND_OPEN_1, grammarAccess.getAttributeValueAccess().getROUND_OPENTerminalRuleCall_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAttributeValueAccess().getSubExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    this_SubExpression_2=ruleSubExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SubExpression_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_ROUND_CLOSE_3=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ROUND_CLOSE_3, grammarAccess.getAttributeValueAccess().getROUND_CLOSETerminalRuleCall_1_2());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEtlParser.g:650:3: this_StringValue_4= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAttributeValueAccess().getStringValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValue_4=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValue_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEtlParser.g:662:3: this_IntegerValue_5= ruleIntegerValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAttributeValueAccess().getIntegerValueParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerValue_5=ruleIntegerValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerValue_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEtlParser.g:674:3: this_DecimalValue_6= ruleDecimalValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAttributeValueAccess().getDecimalValueParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DecimalValue_6=ruleDecimalValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecimalValue_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEtlParser.g:686:3: this_ConcreteValueReplacementSlot_7= ruleConcreteValueReplacementSlot
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAttributeValueAccess().getConcreteValueReplacementSlotParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ConcreteValueReplacementSlot_7=ruleConcreteValueReplacementSlot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConcreteValueReplacementSlot_7;
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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleConceptIdReplacementSlot"
    // InternalEtlParser.g:701:1: entryRuleConceptIdReplacementSlot returns [EObject current=null] : iv_ruleConceptIdReplacementSlot= ruleConceptIdReplacementSlot EOF ;
    public final EObject entryRuleConceptIdReplacementSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptIdReplacementSlot = null;


        try {
            // InternalEtlParser.g:701:65: (iv_ruleConceptIdReplacementSlot= ruleConceptIdReplacementSlot EOF )
            // InternalEtlParser.g:702:2: iv_ruleConceptIdReplacementSlot= ruleConceptIdReplacementSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConceptIdReplacementSlotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConceptIdReplacementSlot=ruleConceptIdReplacementSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConceptIdReplacementSlot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConceptIdReplacementSlot"


    // $ANTLR start "ruleConceptIdReplacementSlot"
    // InternalEtlParser.g:708:1: ruleConceptIdReplacementSlot returns [EObject current=null] : ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_ID_3= RULE_ID (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_constraint_5_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )? ( (lv_name_7_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_8= RULE_DOUBLE_SQUARE_CLOSE ) ;
    public final EObject ruleConceptIdReplacementSlot() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_SQUARE_OPEN_1=null;
        Token this_PLUS_2=null;
        Token this_ID_3=null;
        Token this_ROUND_OPEN_4=null;
        Token this_ROUND_CLOSE_6=null;
        Token lv_name_7_0=null;
        Token this_DOUBLE_SQUARE_CLOSE_8=null;
        EObject lv_constraint_5_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:714:2: ( ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_ID_3= RULE_ID (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_constraint_5_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )? ( (lv_name_7_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_8= RULE_DOUBLE_SQUARE_CLOSE ) )
            // InternalEtlParser.g:715:2: ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_ID_3= RULE_ID (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_constraint_5_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )? ( (lv_name_7_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_8= RULE_DOUBLE_SQUARE_CLOSE )
            {
            // InternalEtlParser.g:715:2: ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_ID_3= RULE_ID (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_constraint_5_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )? ( (lv_name_7_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_8= RULE_DOUBLE_SQUARE_CLOSE )
            // InternalEtlParser.g:716:3: () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_ID_3= RULE_ID (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_constraint_5_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )? ( (lv_name_7_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_8= RULE_DOUBLE_SQUARE_CLOSE
            {
            // InternalEtlParser.g:716:3: ()
            // InternalEtlParser.g:717:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConceptIdReplacementSlotAccess().getConceptIdReplacementSlotAction_0(),
              					current);
              			
            }

            }

            this_DOUBLE_SQUARE_OPEN_1=(Token)match(input,RULE_DOUBLE_SQUARE_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_SQUARE_OPEN_1, grammarAccess.getConceptIdReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1());
              		
            }
            this_PLUS_2=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PLUS_2, grammarAccess.getConceptIdReplacementSlotAccess().getPLUSTerminalRuleCall_2());
              		
            }
            this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_3, grammarAccess.getConceptIdReplacementSlotAccess().getIDTerminalRuleCall_3());
              		
            }
            // InternalEtlParser.g:738:3: (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_constraint_5_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ROUND_OPEN) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEtlParser.g:739:4: this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_constraint_5_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_6= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_4=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ROUND_OPEN_4, grammarAccess.getConceptIdReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0());
                      			
                    }
                    // InternalEtlParser.g:743:4: ( (lv_constraint_5_0= ruleExpressionConstraint ) )
                    // InternalEtlParser.g:744:5: (lv_constraint_5_0= ruleExpressionConstraint )
                    {
                    // InternalEtlParser.g:744:5: (lv_constraint_5_0= ruleExpressionConstraint )
                    // InternalEtlParser.g:745:6: lv_constraint_5_0= ruleExpressionConstraint
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConceptIdReplacementSlotAccess().getConstraintExpressionConstraintParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_constraint_5_0=ruleExpressionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConceptIdReplacementSlotRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_5_0,
                      							"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_ROUND_CLOSE_6=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ROUND_CLOSE_6, grammarAccess.getConceptIdReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_2());
                      			
                    }

                    }
                    break;

            }

            // InternalEtlParser.g:767:3: ( (lv_name_7_0= RULE_SLOTNAME_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_SLOTNAME_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEtlParser.g:768:4: (lv_name_7_0= RULE_SLOTNAME_STRING )
                    {
                    // InternalEtlParser.g:768:4: (lv_name_7_0= RULE_SLOTNAME_STRING )
                    // InternalEtlParser.g:769:5: lv_name_7_0= RULE_SLOTNAME_STRING
                    {
                    lv_name_7_0=(Token)match(input,RULE_SLOTNAME_STRING,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_7_0, grammarAccess.getConceptIdReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConceptIdReplacementSlotRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_7_0,
                      						"com.b2international.snomed.etl.Etl.SLOTNAME_STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            this_DOUBLE_SQUARE_CLOSE_8=(Token)match(input,RULE_DOUBLE_SQUARE_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_SQUARE_CLOSE_8, grammarAccess.getConceptIdReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6());
              		
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
    // $ANTLR end "ruleConceptIdReplacementSlot"


    // $ANTLR start "entryRuleExpressionReplacementSlot"
    // InternalEtlParser.g:793:1: entryRuleExpressionReplacementSlot returns [EObject current=null] : iv_ruleExpressionReplacementSlot= ruleExpressionReplacementSlot EOF ;
    public final EObject entryRuleExpressionReplacementSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionReplacementSlot = null;


        try {
            // InternalEtlParser.g:793:66: (iv_ruleExpressionReplacementSlot= ruleExpressionReplacementSlot EOF )
            // InternalEtlParser.g:794:2: iv_ruleExpressionReplacementSlot= ruleExpressionReplacementSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionReplacementSlotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpressionReplacementSlot=ruleExpressionReplacementSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionReplacementSlot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionReplacementSlot"


    // $ANTLR start "ruleExpressionReplacementSlot"
    // InternalEtlParser.g:800:1: ruleExpressionReplacementSlot returns [EObject current=null] : ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS (this_SCG_3= RULE_SCG )? (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_constraint_5_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )? ( (lv_name_7_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_8= RULE_DOUBLE_SQUARE_CLOSE ) ;
    public final EObject ruleExpressionReplacementSlot() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_SQUARE_OPEN_1=null;
        Token this_PLUS_2=null;
        Token this_SCG_3=null;
        Token this_ROUND_OPEN_4=null;
        Token this_ROUND_CLOSE_6=null;
        Token lv_name_7_0=null;
        Token this_DOUBLE_SQUARE_CLOSE_8=null;
        EObject lv_constraint_5_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:806:2: ( ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS (this_SCG_3= RULE_SCG )? (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_constraint_5_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )? ( (lv_name_7_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_8= RULE_DOUBLE_SQUARE_CLOSE ) )
            // InternalEtlParser.g:807:2: ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS (this_SCG_3= RULE_SCG )? (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_constraint_5_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )? ( (lv_name_7_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_8= RULE_DOUBLE_SQUARE_CLOSE )
            {
            // InternalEtlParser.g:807:2: ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS (this_SCG_3= RULE_SCG )? (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_constraint_5_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )? ( (lv_name_7_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_8= RULE_DOUBLE_SQUARE_CLOSE )
            // InternalEtlParser.g:808:3: () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS (this_SCG_3= RULE_SCG )? (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_constraint_5_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )? ( (lv_name_7_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_8= RULE_DOUBLE_SQUARE_CLOSE
            {
            // InternalEtlParser.g:808:3: ()
            // InternalEtlParser.g:809:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExpressionReplacementSlotAccess().getExpressionReplacementSlotAction_0(),
              					current);
              			
            }

            }

            this_DOUBLE_SQUARE_OPEN_1=(Token)match(input,RULE_DOUBLE_SQUARE_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_SQUARE_OPEN_1, grammarAccess.getExpressionReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1());
              		
            }
            this_PLUS_2=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PLUS_2, grammarAccess.getExpressionReplacementSlotAccess().getPLUSTerminalRuleCall_2());
              		
            }
            // InternalEtlParser.g:826:3: (this_SCG_3= RULE_SCG )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_SCG) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEtlParser.g:827:4: this_SCG_3= RULE_SCG
                    {
                    this_SCG_3=(Token)match(input,RULE_SCG,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SCG_3, grammarAccess.getExpressionReplacementSlotAccess().getSCGTerminalRuleCall_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEtlParser.g:832:3: (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_constraint_5_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ROUND_OPEN) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEtlParser.g:833:4: this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_constraint_5_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_6= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_4=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ROUND_OPEN_4, grammarAccess.getExpressionReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0());
                      			
                    }
                    // InternalEtlParser.g:837:4: ( (lv_constraint_5_0= ruleExpressionConstraint ) )
                    // InternalEtlParser.g:838:5: (lv_constraint_5_0= ruleExpressionConstraint )
                    {
                    // InternalEtlParser.g:838:5: (lv_constraint_5_0= ruleExpressionConstraint )
                    // InternalEtlParser.g:839:6: lv_constraint_5_0= ruleExpressionConstraint
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionReplacementSlotAccess().getConstraintExpressionConstraintParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_constraint_5_0=ruleExpressionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionReplacementSlotRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_5_0,
                      							"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_ROUND_CLOSE_6=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ROUND_CLOSE_6, grammarAccess.getExpressionReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_2());
                      			
                    }

                    }
                    break;

            }

            // InternalEtlParser.g:861:3: ( (lv_name_7_0= RULE_SLOTNAME_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_SLOTNAME_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEtlParser.g:862:4: (lv_name_7_0= RULE_SLOTNAME_STRING )
                    {
                    // InternalEtlParser.g:862:4: (lv_name_7_0= RULE_SLOTNAME_STRING )
                    // InternalEtlParser.g:863:5: lv_name_7_0= RULE_SLOTNAME_STRING
                    {
                    lv_name_7_0=(Token)match(input,RULE_SLOTNAME_STRING,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_7_0, grammarAccess.getExpressionReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExpressionReplacementSlotRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_7_0,
                      						"com.b2international.snomed.etl.Etl.SLOTNAME_STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            this_DOUBLE_SQUARE_CLOSE_8=(Token)match(input,RULE_DOUBLE_SQUARE_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_SQUARE_CLOSE_8, grammarAccess.getExpressionReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6());
              		
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
    // $ANTLR end "ruleExpressionReplacementSlot"


    // $ANTLR start "entryRuleTokenReplacementSlot"
    // InternalEtlParser.g:887:1: entryRuleTokenReplacementSlot returns [EObject current=null] : iv_ruleTokenReplacementSlot= ruleTokenReplacementSlot EOF ;
    public final EObject entryRuleTokenReplacementSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokenReplacementSlot = null;


        try {
            // InternalEtlParser.g:887:61: (iv_ruleTokenReplacementSlot= ruleTokenReplacementSlot EOF )
            // InternalEtlParser.g:888:2: iv_ruleTokenReplacementSlot= ruleTokenReplacementSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTokenReplacementSlotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTokenReplacementSlot=ruleTokenReplacementSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTokenReplacementSlot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTokenReplacementSlot"


    // $ANTLR start "ruleTokenReplacementSlot"
    // InternalEtlParser.g:894:1: ruleTokenReplacementSlot returns [EObject current=null] : ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_TOK_3= RULE_TOK (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_tokens_5_0= ruleSlotToken ) ) ( (lv_tokens_6_0= ruleSlotToken ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE ) ;
    public final EObject ruleTokenReplacementSlot() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_SQUARE_OPEN_1=null;
        Token this_PLUS_2=null;
        Token this_TOK_3=null;
        Token this_ROUND_OPEN_4=null;
        Token this_ROUND_CLOSE_7=null;
        Token lv_name_8_0=null;
        Token this_DOUBLE_SQUARE_CLOSE_9=null;
        AntlrDatatypeRuleToken lv_tokens_5_0 = null;

        AntlrDatatypeRuleToken lv_tokens_6_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:900:2: ( ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_TOK_3= RULE_TOK (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_tokens_5_0= ruleSlotToken ) ) ( (lv_tokens_6_0= ruleSlotToken ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE ) )
            // InternalEtlParser.g:901:2: ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_TOK_3= RULE_TOK (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_tokens_5_0= ruleSlotToken ) ) ( (lv_tokens_6_0= ruleSlotToken ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE )
            {
            // InternalEtlParser.g:901:2: ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_TOK_3= RULE_TOK (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_tokens_5_0= ruleSlotToken ) ) ( (lv_tokens_6_0= ruleSlotToken ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE )
            // InternalEtlParser.g:902:3: () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_TOK_3= RULE_TOK (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_tokens_5_0= ruleSlotToken ) ) ( (lv_tokens_6_0= ruleSlotToken ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE
            {
            // InternalEtlParser.g:902:3: ()
            // InternalEtlParser.g:903:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTokenReplacementSlotAccess().getTokenReplacementSlotAction_0(),
              					current);
              			
            }

            }

            this_DOUBLE_SQUARE_OPEN_1=(Token)match(input,RULE_DOUBLE_SQUARE_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_SQUARE_OPEN_1, grammarAccess.getTokenReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1());
              		
            }
            this_PLUS_2=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PLUS_2, grammarAccess.getTokenReplacementSlotAccess().getPLUSTerminalRuleCall_2());
              		
            }
            this_TOK_3=(Token)match(input,RULE_TOK,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TOK_3, grammarAccess.getTokenReplacementSlotAccess().getTOKTerminalRuleCall_3());
              		
            }
            // InternalEtlParser.g:924:3: (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_tokens_5_0= ruleSlotToken ) ) ( (lv_tokens_6_0= ruleSlotToken ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ROUND_OPEN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEtlParser.g:925:4: this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_tokens_5_0= ruleSlotToken ) ) ( (lv_tokens_6_0= ruleSlotToken ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_4=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ROUND_OPEN_4, grammarAccess.getTokenReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0());
                      			
                    }
                    // InternalEtlParser.g:929:4: ( (lv_tokens_5_0= ruleSlotToken ) )
                    // InternalEtlParser.g:930:5: (lv_tokens_5_0= ruleSlotToken )
                    {
                    // InternalEtlParser.g:930:5: (lv_tokens_5_0= ruleSlotToken )
                    // InternalEtlParser.g:931:6: lv_tokens_5_0= ruleSlotToken
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTokenReplacementSlotAccess().getTokensSlotTokenParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_tokens_5_0=ruleSlotToken();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTokenReplacementSlotRule());
                      						}
                      						add(
                      							current,
                      							"tokens",
                      							lv_tokens_5_0,
                      							"com.b2international.snomed.etl.Etl.SlotToken");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEtlParser.g:948:4: ( (lv_tokens_6_0= ruleSlotToken ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=RULE_EQUIVALENT_TO && LA20_0<=RULE_SUBTYPE_OF)||LA20_0==RULE_EXCLUSION_KEYWORD||(LA20_0>=RULE_CONJUNCTION_KEYWORD && LA20_0<=RULE_REVERSED)||(LA20_0>=RULE_DBL_LT && LA20_0<=RULE_LTE)||LA20_0==RULE_COMMA||LA20_0==RULE_CARET||(LA20_0>=RULE_EQUAL && LA20_0<=RULE_GT)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalEtlParser.g:949:5: (lv_tokens_6_0= ruleSlotToken )
                    	    {
                    	    // InternalEtlParser.g:949:5: (lv_tokens_6_0= ruleSlotToken )
                    	    // InternalEtlParser.g:950:6: lv_tokens_6_0= ruleSlotToken
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getTokenReplacementSlotAccess().getTokensSlotTokenParserRuleCall_4_2_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_21);
                    	    lv_tokens_6_0=ruleSlotToken();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getTokenReplacementSlotRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"tokens",
                    	      							lv_tokens_6_0,
                    	      							"com.b2international.snomed.etl.Etl.SlotToken");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    this_ROUND_CLOSE_7=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ROUND_CLOSE_7, grammarAccess.getTokenReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEtlParser.g:972:3: ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_SLOTNAME_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEtlParser.g:973:4: (lv_name_8_0= RULE_SLOTNAME_STRING )
                    {
                    // InternalEtlParser.g:973:4: (lv_name_8_0= RULE_SLOTNAME_STRING )
                    // InternalEtlParser.g:974:5: lv_name_8_0= RULE_SLOTNAME_STRING
                    {
                    lv_name_8_0=(Token)match(input,RULE_SLOTNAME_STRING,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_8_0, grammarAccess.getTokenReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTokenReplacementSlotRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_8_0,
                      						"com.b2international.snomed.etl.Etl.SLOTNAME_STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            this_DOUBLE_SQUARE_CLOSE_9=(Token)match(input,RULE_DOUBLE_SQUARE_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_SQUARE_CLOSE_9, grammarAccess.getTokenReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6());
              		
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
    // $ANTLR end "ruleTokenReplacementSlot"


    // $ANTLR start "entryRuleTemplateInformationSlot"
    // InternalEtlParser.g:998:1: entryRuleTemplateInformationSlot returns [EObject current=null] : iv_ruleTemplateInformationSlot= ruleTemplateInformationSlot EOF ;
    public final EObject entryRuleTemplateInformationSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateInformationSlot = null;


        try {
            // InternalEtlParser.g:998:64: (iv_ruleTemplateInformationSlot= ruleTemplateInformationSlot EOF )
            // InternalEtlParser.g:999:2: iv_ruleTemplateInformationSlot= ruleTemplateInformationSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateInformationSlotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTemplateInformationSlot=ruleTemplateInformationSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateInformationSlot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplateInformationSlot"


    // $ANTLR start "ruleTemplateInformationSlot"
    // InternalEtlParser.g:1005:1: ruleTemplateInformationSlot returns [EObject current=null] : ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN ( (lv_cardinality_2_0= ruleEtlCardinality ) )? ( (lv_name_3_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_4= RULE_DOUBLE_SQUARE_CLOSE ) ;
    public final EObject ruleTemplateInformationSlot() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_SQUARE_OPEN_1=null;
        Token lv_name_3_0=null;
        Token this_DOUBLE_SQUARE_CLOSE_4=null;
        EObject lv_cardinality_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:1011:2: ( ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN ( (lv_cardinality_2_0= ruleEtlCardinality ) )? ( (lv_name_3_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_4= RULE_DOUBLE_SQUARE_CLOSE ) )
            // InternalEtlParser.g:1012:2: ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN ( (lv_cardinality_2_0= ruleEtlCardinality ) )? ( (lv_name_3_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_4= RULE_DOUBLE_SQUARE_CLOSE )
            {
            // InternalEtlParser.g:1012:2: ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN ( (lv_cardinality_2_0= ruleEtlCardinality ) )? ( (lv_name_3_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_4= RULE_DOUBLE_SQUARE_CLOSE )
            // InternalEtlParser.g:1013:3: () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN ( (lv_cardinality_2_0= ruleEtlCardinality ) )? ( (lv_name_3_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_4= RULE_DOUBLE_SQUARE_CLOSE
            {
            // InternalEtlParser.g:1013:3: ()
            // InternalEtlParser.g:1014:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTemplateInformationSlotAccess().getTemplateInformationSlotAction_0(),
              					current);
              			
            }

            }

            this_DOUBLE_SQUARE_OPEN_1=(Token)match(input,RULE_DOUBLE_SQUARE_OPEN,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_SQUARE_OPEN_1, grammarAccess.getTemplateInformationSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:1027:3: ( (lv_cardinality_2_0= ruleEtlCardinality ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_TILDE||(LA23_0>=RULE_DIGIT_ZERO && LA23_0<=RULE_DIGIT_NONZERO)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEtlParser.g:1028:4: (lv_cardinality_2_0= ruleEtlCardinality )
                    {
                    // InternalEtlParser.g:1028:4: (lv_cardinality_2_0= ruleEtlCardinality )
                    // InternalEtlParser.g:1029:5: lv_cardinality_2_0= ruleEtlCardinality
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTemplateInformationSlotAccess().getCardinalityEtlCardinalityParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
                    lv_cardinality_2_0=ruleEtlCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTemplateInformationSlotRule());
                      					}
                      					set(
                      						current,
                      						"cardinality",
                      						lv_cardinality_2_0,
                      						"com.b2international.snomed.etl.Etl.EtlCardinality");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEtlParser.g:1046:3: ( (lv_name_3_0= RULE_SLOTNAME_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_SLOTNAME_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEtlParser.g:1047:4: (lv_name_3_0= RULE_SLOTNAME_STRING )
                    {
                    // InternalEtlParser.g:1047:4: (lv_name_3_0= RULE_SLOTNAME_STRING )
                    // InternalEtlParser.g:1048:5: lv_name_3_0= RULE_SLOTNAME_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_SLOTNAME_STRING,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_3_0, grammarAccess.getTemplateInformationSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTemplateInformationSlotRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_3_0,
                      						"com.b2international.snomed.etl.Etl.SLOTNAME_STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            this_DOUBLE_SQUARE_CLOSE_4=(Token)match(input,RULE_DOUBLE_SQUARE_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_SQUARE_CLOSE_4, grammarAccess.getTemplateInformationSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_4());
              		
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
    // $ANTLR end "ruleTemplateInformationSlot"


    // $ANTLR start "entryRuleConcreteValueReplacementSlot"
    // InternalEtlParser.g:1072:1: entryRuleConcreteValueReplacementSlot returns [EObject current=null] : iv_ruleConcreteValueReplacementSlot= ruleConcreteValueReplacementSlot EOF ;
    public final EObject entryRuleConcreteValueReplacementSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteValueReplacementSlot = null;


        try {
            // InternalEtlParser.g:1072:69: (iv_ruleConcreteValueReplacementSlot= ruleConcreteValueReplacementSlot EOF )
            // InternalEtlParser.g:1073:2: iv_ruleConcreteValueReplacementSlot= ruleConcreteValueReplacementSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcreteValueReplacementSlotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConcreteValueReplacementSlot=ruleConcreteValueReplacementSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcreteValueReplacementSlot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConcreteValueReplacementSlot"


    // $ANTLR start "ruleConcreteValueReplacementSlot"
    // InternalEtlParser.g:1079:1: ruleConcreteValueReplacementSlot returns [EObject current=null] : (this_StringReplacementSlot_0= ruleStringReplacementSlot | this_IntegerReplacementSlot_1= ruleIntegerReplacementSlot | this_DecimalReplacementSlot_2= ruleDecimalReplacementSlot ) ;
    public final EObject ruleConcreteValueReplacementSlot() throws RecognitionException {
        EObject current = null;

        EObject this_StringReplacementSlot_0 = null;

        EObject this_IntegerReplacementSlot_1 = null;

        EObject this_DecimalReplacementSlot_2 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:1085:2: ( (this_StringReplacementSlot_0= ruleStringReplacementSlot | this_IntegerReplacementSlot_1= ruleIntegerReplacementSlot | this_DecimalReplacementSlot_2= ruleDecimalReplacementSlot ) )
            // InternalEtlParser.g:1086:2: (this_StringReplacementSlot_0= ruleStringReplacementSlot | this_IntegerReplacementSlot_1= ruleIntegerReplacementSlot | this_DecimalReplacementSlot_2= ruleDecimalReplacementSlot )
            {
            // InternalEtlParser.g:1086:2: (this_StringReplacementSlot_0= ruleStringReplacementSlot | this_IntegerReplacementSlot_1= ruleIntegerReplacementSlot | this_DecimalReplacementSlot_2= ruleDecimalReplacementSlot )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_DOUBLE_SQUARE_OPEN) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==RULE_PLUS) ) {
                    switch ( input.LA(3) ) {
                    case RULE_INT:
                        {
                        alt25=2;
                        }
                        break;
                    case RULE_STR:
                        {
                        alt25=1;
                        }
                        break;
                    case RULE_DEC:
                        {
                        alt25=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalEtlParser.g:1087:3: this_StringReplacementSlot_0= ruleStringReplacementSlot
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcreteValueReplacementSlotAccess().getStringReplacementSlotParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringReplacementSlot_0=ruleStringReplacementSlot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringReplacementSlot_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:1099:3: this_IntegerReplacementSlot_1= ruleIntegerReplacementSlot
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcreteValueReplacementSlotAccess().getIntegerReplacementSlotParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerReplacementSlot_1=ruleIntegerReplacementSlot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerReplacementSlot_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEtlParser.g:1111:3: this_DecimalReplacementSlot_2= ruleDecimalReplacementSlot
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcreteValueReplacementSlotAccess().getDecimalReplacementSlotParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DecimalReplacementSlot_2=ruleDecimalReplacementSlot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecimalReplacementSlot_2;
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
    // $ANTLR end "ruleConcreteValueReplacementSlot"


    // $ANTLR start "entryRuleStringReplacementSlot"
    // InternalEtlParser.g:1126:1: entryRuleStringReplacementSlot returns [EObject current=null] : iv_ruleStringReplacementSlot= ruleStringReplacementSlot EOF ;
    public final EObject entryRuleStringReplacementSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringReplacementSlot = null;


        try {
            // InternalEtlParser.g:1126:62: (iv_ruleStringReplacementSlot= ruleStringReplacementSlot EOF )
            // InternalEtlParser.g:1127:2: iv_ruleStringReplacementSlot= ruleStringReplacementSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringReplacementSlotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringReplacementSlot=ruleStringReplacementSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringReplacementSlot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringReplacementSlot"


    // $ANTLR start "ruleStringReplacementSlot"
    // InternalEtlParser.g:1133:1: ruleStringReplacementSlot returns [EObject current=null] : ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_STR_3= RULE_STR (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= RULE_STRING ) ) ( (lv_values_6_0= RULE_STRING ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE ) ;
    public final EObject ruleStringReplacementSlot() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_SQUARE_OPEN_1=null;
        Token this_PLUS_2=null;
        Token this_STR_3=null;
        Token this_ROUND_OPEN_4=null;
        Token lv_values_5_0=null;
        Token lv_values_6_0=null;
        Token this_ROUND_CLOSE_7=null;
        Token lv_name_8_0=null;
        Token this_DOUBLE_SQUARE_CLOSE_9=null;


        	enterRule();

        try {
            // InternalEtlParser.g:1139:2: ( ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_STR_3= RULE_STR (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= RULE_STRING ) ) ( (lv_values_6_0= RULE_STRING ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE ) )
            // InternalEtlParser.g:1140:2: ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_STR_3= RULE_STR (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= RULE_STRING ) ) ( (lv_values_6_0= RULE_STRING ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE )
            {
            // InternalEtlParser.g:1140:2: ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_STR_3= RULE_STR (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= RULE_STRING ) ) ( (lv_values_6_0= RULE_STRING ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE )
            // InternalEtlParser.g:1141:3: () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_STR_3= RULE_STR (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= RULE_STRING ) ) ( (lv_values_6_0= RULE_STRING ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE
            {
            // InternalEtlParser.g:1141:3: ()
            // InternalEtlParser.g:1142:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStringReplacementSlotAccess().getStringReplacementSlotAction_0(),
              					current);
              			
            }

            }

            this_DOUBLE_SQUARE_OPEN_1=(Token)match(input,RULE_DOUBLE_SQUARE_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_SQUARE_OPEN_1, grammarAccess.getStringReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1());
              		
            }
            this_PLUS_2=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PLUS_2, grammarAccess.getStringReplacementSlotAccess().getPLUSTerminalRuleCall_2());
              		
            }
            this_STR_3=(Token)match(input,RULE_STR,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_STR_3, grammarAccess.getStringReplacementSlotAccess().getSTRTerminalRuleCall_3());
              		
            }
            // InternalEtlParser.g:1163:3: (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= RULE_STRING ) ) ( (lv_values_6_0= RULE_STRING ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ROUND_OPEN) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEtlParser.g:1164:4: this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= RULE_STRING ) ) ( (lv_values_6_0= RULE_STRING ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_4=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ROUND_OPEN_4, grammarAccess.getStringReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0());
                      			
                    }
                    // InternalEtlParser.g:1168:4: ( (lv_values_5_0= RULE_STRING ) )
                    // InternalEtlParser.g:1169:5: (lv_values_5_0= RULE_STRING )
                    {
                    // InternalEtlParser.g:1169:5: (lv_values_5_0= RULE_STRING )
                    // InternalEtlParser.g:1170:6: lv_values_5_0= RULE_STRING
                    {
                    lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_values_5_0, grammarAccess.getStringReplacementSlotAccess().getValuesSTRINGTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStringReplacementSlotRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"values",
                      							lv_values_5_0,
                      							"com.b2international.snomed.ecl.Ecl.STRING");
                      					
                    }

                    }


                    }

                    // InternalEtlParser.g:1186:4: ( (lv_values_6_0= RULE_STRING ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_STRING) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalEtlParser.g:1187:5: (lv_values_6_0= RULE_STRING )
                    	    {
                    	    // InternalEtlParser.g:1187:5: (lv_values_6_0= RULE_STRING )
                    	    // InternalEtlParser.g:1188:6: lv_values_6_0= RULE_STRING
                    	    {
                    	    lv_values_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_values_6_0, grammarAccess.getStringReplacementSlotAccess().getValuesSTRINGTerminalRuleCall_4_2_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getStringReplacementSlotRule());
                    	      						}
                    	      						addWithLastConsumed(
                    	      							current,
                    	      							"values",
                    	      							lv_values_6_0,
                    	      							"com.b2international.snomed.ecl.Ecl.STRING");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    this_ROUND_CLOSE_7=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ROUND_CLOSE_7, grammarAccess.getStringReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEtlParser.g:1209:3: ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_SLOTNAME_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEtlParser.g:1210:4: (lv_name_8_0= RULE_SLOTNAME_STRING )
                    {
                    // InternalEtlParser.g:1210:4: (lv_name_8_0= RULE_SLOTNAME_STRING )
                    // InternalEtlParser.g:1211:5: lv_name_8_0= RULE_SLOTNAME_STRING
                    {
                    lv_name_8_0=(Token)match(input,RULE_SLOTNAME_STRING,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_8_0, grammarAccess.getStringReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getStringReplacementSlotRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_8_0,
                      						"com.b2international.snomed.etl.Etl.SLOTNAME_STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            this_DOUBLE_SQUARE_CLOSE_9=(Token)match(input,RULE_DOUBLE_SQUARE_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_SQUARE_CLOSE_9, grammarAccess.getStringReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6());
              		
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
    // $ANTLR end "ruleStringReplacementSlot"


    // $ANTLR start "entryRuleIntegerReplacementSlot"
    // InternalEtlParser.g:1235:1: entryRuleIntegerReplacementSlot returns [EObject current=null] : iv_ruleIntegerReplacementSlot= ruleIntegerReplacementSlot EOF ;
    public final EObject entryRuleIntegerReplacementSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerReplacementSlot = null;


        try {
            // InternalEtlParser.g:1235:63: (iv_ruleIntegerReplacementSlot= ruleIntegerReplacementSlot EOF )
            // InternalEtlParser.g:1236:2: iv_ruleIntegerReplacementSlot= ruleIntegerReplacementSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerReplacementSlotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerReplacementSlot=ruleIntegerReplacementSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerReplacementSlot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerReplacementSlot"


    // $ANTLR start "ruleIntegerReplacementSlot"
    // InternalEtlParser.g:1242:1: ruleIntegerReplacementSlot returns [EObject current=null] : ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_INT_3= RULE_INT (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= ruleSlotInteger ) ) ( (lv_values_6_0= ruleSlotInteger ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE ) ;
    public final EObject ruleIntegerReplacementSlot() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_SQUARE_OPEN_1=null;
        Token this_PLUS_2=null;
        Token this_INT_3=null;
        Token this_ROUND_OPEN_4=null;
        Token this_ROUND_CLOSE_7=null;
        Token lv_name_8_0=null;
        Token this_DOUBLE_SQUARE_CLOSE_9=null;
        EObject lv_values_5_0 = null;

        EObject lv_values_6_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:1248:2: ( ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_INT_3= RULE_INT (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= ruleSlotInteger ) ) ( (lv_values_6_0= ruleSlotInteger ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE ) )
            // InternalEtlParser.g:1249:2: ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_INT_3= RULE_INT (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= ruleSlotInteger ) ) ( (lv_values_6_0= ruleSlotInteger ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE )
            {
            // InternalEtlParser.g:1249:2: ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_INT_3= RULE_INT (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= ruleSlotInteger ) ) ( (lv_values_6_0= ruleSlotInteger ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE )
            // InternalEtlParser.g:1250:3: () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_INT_3= RULE_INT (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= ruleSlotInteger ) ) ( (lv_values_6_0= ruleSlotInteger ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE
            {
            // InternalEtlParser.g:1250:3: ()
            // InternalEtlParser.g:1251:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIntegerReplacementSlotAccess().getIntegerReplacementSlotAction_0(),
              					current);
              			
            }

            }

            this_DOUBLE_SQUARE_OPEN_1=(Token)match(input,RULE_DOUBLE_SQUARE_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_SQUARE_OPEN_1, grammarAccess.getIntegerReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1());
              		
            }
            this_PLUS_2=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PLUS_2, grammarAccess.getIntegerReplacementSlotAccess().getPLUSTerminalRuleCall_2());
              		
            }
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_3, grammarAccess.getIntegerReplacementSlotAccess().getINTTerminalRuleCall_3());
              		
            }
            // InternalEtlParser.g:1272:3: (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= ruleSlotInteger ) ) ( (lv_values_6_0= ruleSlotInteger ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ROUND_OPEN) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalEtlParser.g:1273:4: this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= ruleSlotInteger ) ) ( (lv_values_6_0= ruleSlotInteger ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_4=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ROUND_OPEN_4, grammarAccess.getIntegerReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0());
                      			
                    }
                    // InternalEtlParser.g:1277:4: ( (lv_values_5_0= ruleSlotInteger ) )
                    // InternalEtlParser.g:1278:5: (lv_values_5_0= ruleSlotInteger )
                    {
                    // InternalEtlParser.g:1278:5: (lv_values_5_0= ruleSlotInteger )
                    // InternalEtlParser.g:1279:6: lv_values_5_0= ruleSlotInteger
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIntegerReplacementSlotAccess().getValuesSlotIntegerParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_values_5_0=ruleSlotInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIntegerReplacementSlotRule());
                      						}
                      						add(
                      							current,
                      							"values",
                      							lv_values_5_0,
                      							"com.b2international.snomed.etl.Etl.SlotInteger");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEtlParser.g:1296:4: ( (lv_values_6_0= ruleSlotInteger ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_TO||(LA29_0>=RULE_GT && LA29_0<=RULE_HASH)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalEtlParser.g:1297:5: (lv_values_6_0= ruleSlotInteger )
                    	    {
                    	    // InternalEtlParser.g:1297:5: (lv_values_6_0= ruleSlotInteger )
                    	    // InternalEtlParser.g:1298:6: lv_values_6_0= ruleSlotInteger
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIntegerReplacementSlotAccess().getValuesSlotIntegerParserRuleCall_4_2_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_28);
                    	    lv_values_6_0=ruleSlotInteger();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getIntegerReplacementSlotRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"values",
                    	      							lv_values_6_0,
                    	      							"com.b2international.snomed.etl.Etl.SlotInteger");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    this_ROUND_CLOSE_7=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ROUND_CLOSE_7, grammarAccess.getIntegerReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEtlParser.g:1320:3: ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_SLOTNAME_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalEtlParser.g:1321:4: (lv_name_8_0= RULE_SLOTNAME_STRING )
                    {
                    // InternalEtlParser.g:1321:4: (lv_name_8_0= RULE_SLOTNAME_STRING )
                    // InternalEtlParser.g:1322:5: lv_name_8_0= RULE_SLOTNAME_STRING
                    {
                    lv_name_8_0=(Token)match(input,RULE_SLOTNAME_STRING,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_8_0, grammarAccess.getIntegerReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getIntegerReplacementSlotRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_8_0,
                      						"com.b2international.snomed.etl.Etl.SLOTNAME_STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            this_DOUBLE_SQUARE_CLOSE_9=(Token)match(input,RULE_DOUBLE_SQUARE_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_SQUARE_CLOSE_9, grammarAccess.getIntegerReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6());
              		
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
    // $ANTLR end "ruleIntegerReplacementSlot"


    // $ANTLR start "entryRuleDecimalReplacementSlot"
    // InternalEtlParser.g:1346:1: entryRuleDecimalReplacementSlot returns [EObject current=null] : iv_ruleDecimalReplacementSlot= ruleDecimalReplacementSlot EOF ;
    public final EObject entryRuleDecimalReplacementSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalReplacementSlot = null;


        try {
            // InternalEtlParser.g:1346:63: (iv_ruleDecimalReplacementSlot= ruleDecimalReplacementSlot EOF )
            // InternalEtlParser.g:1347:2: iv_ruleDecimalReplacementSlot= ruleDecimalReplacementSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalReplacementSlotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecimalReplacementSlot=ruleDecimalReplacementSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalReplacementSlot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalReplacementSlot"


    // $ANTLR start "ruleDecimalReplacementSlot"
    // InternalEtlParser.g:1353:1: ruleDecimalReplacementSlot returns [EObject current=null] : ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_DEC_3= RULE_DEC (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= ruleSlotDecimal ) ) ( (lv_values_6_0= ruleSlotDecimal ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE ) ;
    public final EObject ruleDecimalReplacementSlot() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_SQUARE_OPEN_1=null;
        Token this_PLUS_2=null;
        Token this_DEC_3=null;
        Token this_ROUND_OPEN_4=null;
        Token this_ROUND_CLOSE_7=null;
        Token lv_name_8_0=null;
        Token this_DOUBLE_SQUARE_CLOSE_9=null;
        EObject lv_values_5_0 = null;

        EObject lv_values_6_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:1359:2: ( ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_DEC_3= RULE_DEC (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= ruleSlotDecimal ) ) ( (lv_values_6_0= ruleSlotDecimal ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE ) )
            // InternalEtlParser.g:1360:2: ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_DEC_3= RULE_DEC (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= ruleSlotDecimal ) ) ( (lv_values_6_0= ruleSlotDecimal ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE )
            {
            // InternalEtlParser.g:1360:2: ( () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_DEC_3= RULE_DEC (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= ruleSlotDecimal ) ) ( (lv_values_6_0= ruleSlotDecimal ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE )
            // InternalEtlParser.g:1361:3: () this_DOUBLE_SQUARE_OPEN_1= RULE_DOUBLE_SQUARE_OPEN this_PLUS_2= RULE_PLUS this_DEC_3= RULE_DEC (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= ruleSlotDecimal ) ) ( (lv_values_6_0= ruleSlotDecimal ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )? ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )? this_DOUBLE_SQUARE_CLOSE_9= RULE_DOUBLE_SQUARE_CLOSE
            {
            // InternalEtlParser.g:1361:3: ()
            // InternalEtlParser.g:1362:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDecimalReplacementSlotAccess().getDecimalReplacementSlotAction_0(),
              					current);
              			
            }

            }

            this_DOUBLE_SQUARE_OPEN_1=(Token)match(input,RULE_DOUBLE_SQUARE_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_SQUARE_OPEN_1, grammarAccess.getDecimalReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1());
              		
            }
            this_PLUS_2=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PLUS_2, grammarAccess.getDecimalReplacementSlotAccess().getPLUSTerminalRuleCall_2());
              		
            }
            this_DEC_3=(Token)match(input,RULE_DEC,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DEC_3, grammarAccess.getDecimalReplacementSlotAccess().getDECTerminalRuleCall_3());
              		
            }
            // InternalEtlParser.g:1383:3: (this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= ruleSlotDecimal ) ) ( (lv_values_6_0= ruleSlotDecimal ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ROUND_OPEN) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEtlParser.g:1384:4: this_ROUND_OPEN_4= RULE_ROUND_OPEN ( (lv_values_5_0= ruleSlotDecimal ) ) ( (lv_values_6_0= ruleSlotDecimal ) )* this_ROUND_CLOSE_7= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_4=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ROUND_OPEN_4, grammarAccess.getDecimalReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0());
                      			
                    }
                    // InternalEtlParser.g:1388:4: ( (lv_values_5_0= ruleSlotDecimal ) )
                    // InternalEtlParser.g:1389:5: (lv_values_5_0= ruleSlotDecimal )
                    {
                    // InternalEtlParser.g:1389:5: (lv_values_5_0= ruleSlotDecimal )
                    // InternalEtlParser.g:1390:6: lv_values_5_0= ruleSlotDecimal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDecimalReplacementSlotAccess().getValuesSlotDecimalParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_values_5_0=ruleSlotDecimal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDecimalReplacementSlotRule());
                      						}
                      						add(
                      							current,
                      							"values",
                      							lv_values_5_0,
                      							"com.b2international.snomed.etl.Etl.SlotDecimal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEtlParser.g:1407:4: ( (lv_values_6_0= ruleSlotDecimal ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_TO||(LA32_0>=RULE_GT && LA32_0<=RULE_HASH)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalEtlParser.g:1408:5: (lv_values_6_0= ruleSlotDecimal )
                    	    {
                    	    // InternalEtlParser.g:1408:5: (lv_values_6_0= ruleSlotDecimal )
                    	    // InternalEtlParser.g:1409:6: lv_values_6_0= ruleSlotDecimal
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDecimalReplacementSlotAccess().getValuesSlotDecimalParserRuleCall_4_2_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_28);
                    	    lv_values_6_0=ruleSlotDecimal();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDecimalReplacementSlotRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"values",
                    	      							lv_values_6_0,
                    	      							"com.b2international.snomed.etl.Etl.SlotDecimal");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    this_ROUND_CLOSE_7=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ROUND_CLOSE_7, grammarAccess.getDecimalReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEtlParser.g:1431:3: ( (lv_name_8_0= RULE_SLOTNAME_STRING ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_SLOTNAME_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalEtlParser.g:1432:4: (lv_name_8_0= RULE_SLOTNAME_STRING )
                    {
                    // InternalEtlParser.g:1432:4: (lv_name_8_0= RULE_SLOTNAME_STRING )
                    // InternalEtlParser.g:1433:5: lv_name_8_0= RULE_SLOTNAME_STRING
                    {
                    lv_name_8_0=(Token)match(input,RULE_SLOTNAME_STRING,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_8_0, grammarAccess.getDecimalReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDecimalReplacementSlotRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_8_0,
                      						"com.b2international.snomed.etl.Etl.SLOTNAME_STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            this_DOUBLE_SQUARE_CLOSE_9=(Token)match(input,RULE_DOUBLE_SQUARE_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_SQUARE_CLOSE_9, grammarAccess.getDecimalReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6());
              		
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
    // $ANTLR end "ruleDecimalReplacementSlot"


    // $ANTLR start "entryRuleEtlCardinality"
    // InternalEtlParser.g:1457:1: entryRuleEtlCardinality returns [EObject current=null] : iv_ruleEtlCardinality= ruleEtlCardinality EOF ;
    public final EObject entryRuleEtlCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEtlCardinality = null;


        try {
            // InternalEtlParser.g:1457:55: (iv_ruleEtlCardinality= ruleEtlCardinality EOF )
            // InternalEtlParser.g:1458:2: iv_ruleEtlCardinality= ruleEtlCardinality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEtlCardinalityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEtlCardinality=ruleEtlCardinality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEtlCardinality; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEtlCardinality"


    // $ANTLR start "ruleEtlCardinality"
    // InternalEtlParser.g:1464:1: ruleEtlCardinality returns [EObject current=null] : ( (this_TILDE_0= RULE_TILDE )? ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) ) ;
    public final EObject ruleEtlCardinality() throws RecognitionException {
        EObject current = null;

        Token this_TILDE_0=null;
        Token this_TO_2=null;
        AntlrDatatypeRuleToken lv_min_1_0 = null;

        AntlrDatatypeRuleToken lv_max_3_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:1470:2: ( ( (this_TILDE_0= RULE_TILDE )? ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) ) )
            // InternalEtlParser.g:1471:2: ( (this_TILDE_0= RULE_TILDE )? ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) )
            {
            // InternalEtlParser.g:1471:2: ( (this_TILDE_0= RULE_TILDE )? ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) )
            // InternalEtlParser.g:1472:3: (this_TILDE_0= RULE_TILDE )? ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) )
            {
            // InternalEtlParser.g:1472:3: (this_TILDE_0= RULE_TILDE )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_TILDE) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalEtlParser.g:1473:4: this_TILDE_0= RULE_TILDE
                    {
                    this_TILDE_0=(Token)match(input,RULE_TILDE,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_TILDE_0, grammarAccess.getEtlCardinalityAccess().getTILDETerminalRuleCall_0());
                      			
                    }

                    }
                    break;

            }

            // InternalEtlParser.g:1478:3: ( (lv_min_1_0= ruleNonNegativeInteger ) )
            // InternalEtlParser.g:1479:4: (lv_min_1_0= ruleNonNegativeInteger )
            {
            // InternalEtlParser.g:1479:4: (lv_min_1_0= ruleNonNegativeInteger )
            // InternalEtlParser.g:1480:5: lv_min_1_0= ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEtlCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
            lv_min_1_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEtlCardinalityRule());
              					}
              					set(
              						current,
              						"min",
              						lv_min_1_0,
              						"com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_TO_2=(Token)match(input,RULE_TO,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TO_2, grammarAccess.getEtlCardinalityAccess().getTOTerminalRuleCall_2());
              		
            }
            // InternalEtlParser.g:1501:3: ( (lv_max_3_0= ruleMaxValue ) )
            // InternalEtlParser.g:1502:4: (lv_max_3_0= ruleMaxValue )
            {
            // InternalEtlParser.g:1502:4: (lv_max_3_0= ruleMaxValue )
            // InternalEtlParser.g:1503:5: lv_max_3_0= ruleMaxValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEtlCardinalityAccess().getMaxMaxValueParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_max_3_0=ruleMaxValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEtlCardinalityRule());
              					}
              					set(
              						current,
              						"max",
              						lv_max_3_0,
              						"com.b2international.snomed.ecl.Ecl.MaxValue");
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
    // $ANTLR end "ruleEtlCardinality"


    // $ANTLR start "entryRuleConceptReplacementSlot"
    // InternalEtlParser.g:1524:1: entryRuleConceptReplacementSlot returns [EObject current=null] : iv_ruleConceptReplacementSlot= ruleConceptReplacementSlot EOF ;
    public final EObject entryRuleConceptReplacementSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptReplacementSlot = null;


        try {
            // InternalEtlParser.g:1524:63: (iv_ruleConceptReplacementSlot= ruleConceptReplacementSlot EOF )
            // InternalEtlParser.g:1525:2: iv_ruleConceptReplacementSlot= ruleConceptReplacementSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConceptReplacementSlotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConceptReplacementSlot=ruleConceptReplacementSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConceptReplacementSlot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConceptReplacementSlot"


    // $ANTLR start "ruleConceptReplacementSlot"
    // InternalEtlParser.g:1531:1: ruleConceptReplacementSlot returns [EObject current=null] : (this_ConceptIdReplacementSlot_0= ruleConceptIdReplacementSlot | this_ExpressionReplacementSlot_1= ruleExpressionReplacementSlot ) ;
    public final EObject ruleConceptReplacementSlot() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptIdReplacementSlot_0 = null;

        EObject this_ExpressionReplacementSlot_1 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:1537:2: ( (this_ConceptIdReplacementSlot_0= ruleConceptIdReplacementSlot | this_ExpressionReplacementSlot_1= ruleExpressionReplacementSlot ) )
            // InternalEtlParser.g:1538:2: (this_ConceptIdReplacementSlot_0= ruleConceptIdReplacementSlot | this_ExpressionReplacementSlot_1= ruleExpressionReplacementSlot )
            {
            // InternalEtlParser.g:1538:2: (this_ConceptIdReplacementSlot_0= ruleConceptIdReplacementSlot | this_ExpressionReplacementSlot_1= ruleExpressionReplacementSlot )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_DOUBLE_SQUARE_OPEN) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==RULE_PLUS) ) {
                    int LA36_2 = input.LA(3);

                    if ( (LA36_2==RULE_ID) ) {
                        alt36=1;
                    }
                    else if ( (LA36_2==RULE_DOUBLE_SQUARE_CLOSE||LA36_2==RULE_SCG||LA36_2==RULE_SLOTNAME_STRING||LA36_2==RULE_ROUND_OPEN) ) {
                        alt36=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalEtlParser.g:1539:3: this_ConceptIdReplacementSlot_0= ruleConceptIdReplacementSlot
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConceptReplacementSlotAccess().getConceptIdReplacementSlotParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ConceptIdReplacementSlot_0=ruleConceptIdReplacementSlot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConceptIdReplacementSlot_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:1551:3: this_ExpressionReplacementSlot_1= ruleExpressionReplacementSlot
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConceptReplacementSlotAccess().getExpressionReplacementSlotParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExpressionReplacementSlot_1=ruleExpressionReplacementSlot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionReplacementSlot_1;
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
    // $ANTLR end "ruleConceptReplacementSlot"


    // $ANTLR start "entryRuleConceptReference"
    // InternalEtlParser.g:1566:1: entryRuleConceptReference returns [EObject current=null] : iv_ruleConceptReference= ruleConceptReference EOF ;
    public final EObject entryRuleConceptReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptReference = null;


        try {
            // InternalEtlParser.g:1566:57: (iv_ruleConceptReference= ruleConceptReference EOF )
            // InternalEtlParser.g:1567:2: iv_ruleConceptReference= ruleConceptReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConceptReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConceptReference=ruleConceptReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConceptReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConceptReference"


    // $ANTLR start "ruleConceptReference"
    // InternalEtlParser.g:1573:1: ruleConceptReference returns [EObject current=null] : ( ( (lv_slot_0_0= ruleConceptReplacementSlot ) ) | ( ( (lv_id_1_0= ruleSnomedIdentifier ) ) ( (lv_term_2_0= RULE_PIPE_DELIMITED_STRING ) )? ) ) ;
    public final EObject ruleConceptReference() throws RecognitionException {
        EObject current = null;

        Token lv_term_2_0=null;
        EObject lv_slot_0_0 = null;

        AntlrDatatypeRuleToken lv_id_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:1579:2: ( ( ( (lv_slot_0_0= ruleConceptReplacementSlot ) ) | ( ( (lv_id_1_0= ruleSnomedIdentifier ) ) ( (lv_term_2_0= RULE_PIPE_DELIMITED_STRING ) )? ) ) )
            // InternalEtlParser.g:1580:2: ( ( (lv_slot_0_0= ruleConceptReplacementSlot ) ) | ( ( (lv_id_1_0= ruleSnomedIdentifier ) ) ( (lv_term_2_0= RULE_PIPE_DELIMITED_STRING ) )? ) )
            {
            // InternalEtlParser.g:1580:2: ( ( (lv_slot_0_0= ruleConceptReplacementSlot ) ) | ( ( (lv_id_1_0= ruleSnomedIdentifier ) ) ( (lv_term_2_0= RULE_PIPE_DELIMITED_STRING ) )? ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_DOUBLE_SQUARE_OPEN) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=RULE_DIGIT_ZERO && LA38_0<=RULE_DIGIT_NONZERO)) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalEtlParser.g:1581:3: ( (lv_slot_0_0= ruleConceptReplacementSlot ) )
                    {
                    // InternalEtlParser.g:1581:3: ( (lv_slot_0_0= ruleConceptReplacementSlot ) )
                    // InternalEtlParser.g:1582:4: (lv_slot_0_0= ruleConceptReplacementSlot )
                    {
                    // InternalEtlParser.g:1582:4: (lv_slot_0_0= ruleConceptReplacementSlot )
                    // InternalEtlParser.g:1583:5: lv_slot_0_0= ruleConceptReplacementSlot
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConceptReferenceAccess().getSlotConceptReplacementSlotParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_slot_0_0=ruleConceptReplacementSlot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConceptReferenceRule());
                      					}
                      					set(
                      						current,
                      						"slot",
                      						lv_slot_0_0,
                      						"com.b2international.snomed.etl.Etl.ConceptReplacementSlot");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:1601:3: ( ( (lv_id_1_0= ruleSnomedIdentifier ) ) ( (lv_term_2_0= RULE_PIPE_DELIMITED_STRING ) )? )
                    {
                    // InternalEtlParser.g:1601:3: ( ( (lv_id_1_0= ruleSnomedIdentifier ) ) ( (lv_term_2_0= RULE_PIPE_DELIMITED_STRING ) )? )
                    // InternalEtlParser.g:1602:4: ( (lv_id_1_0= ruleSnomedIdentifier ) ) ( (lv_term_2_0= RULE_PIPE_DELIMITED_STRING ) )?
                    {
                    // InternalEtlParser.g:1602:4: ( (lv_id_1_0= ruleSnomedIdentifier ) )
                    // InternalEtlParser.g:1603:5: (lv_id_1_0= ruleSnomedIdentifier )
                    {
                    // InternalEtlParser.g:1603:5: (lv_id_1_0= ruleSnomedIdentifier )
                    // InternalEtlParser.g:1604:6: lv_id_1_0= ruleSnomedIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_id_1_0=ruleSnomedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConceptReferenceRule());
                      						}
                      						set(
                      							current,
                      							"id",
                      							lv_id_1_0,
                      							"com.b2international.snomed.ecl.Ecl.SnomedIdentifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEtlParser.g:1621:4: ( (lv_term_2_0= RULE_PIPE_DELIMITED_STRING ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_PIPE_DELIMITED_STRING) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalEtlParser.g:1622:5: (lv_term_2_0= RULE_PIPE_DELIMITED_STRING )
                            {
                            // InternalEtlParser.g:1622:5: (lv_term_2_0= RULE_PIPE_DELIMITED_STRING )
                            // InternalEtlParser.g:1623:6: lv_term_2_0= RULE_PIPE_DELIMITED_STRING
                            {
                            lv_term_2_0=(Token)match(input,RULE_PIPE_DELIMITED_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_term_2_0, grammarAccess.getConceptReferenceAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_1_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getConceptReferenceRule());
                              						}
                              						setWithLastConsumed(
                              							current,
                              							"term",
                              							lv_term_2_0,
                              							"com.b2international.snomed.ecl.Ecl.PIPE_DELIMITED_STRING");
                              					
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
    // $ANTLR end "ruleConceptReference"


    // $ANTLR start "entryRuleSlotToken"
    // InternalEtlParser.g:1644:1: entryRuleSlotToken returns [String current=null] : iv_ruleSlotToken= ruleSlotToken EOF ;
    public final String entryRuleSlotToken() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlotToken = null;


        try {
            // InternalEtlParser.g:1644:49: (iv_ruleSlotToken= ruleSlotToken EOF )
            // InternalEtlParser.g:1645:2: iv_ruleSlotToken= ruleSlotToken EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlotTokenRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlotToken=ruleSlotToken();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlotToken.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSlotToken"


    // $ANTLR start "ruleSlotToken"
    // InternalEtlParser.g:1651:1: ruleSlotToken returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUIVALENT_TO_0= RULE_EQUIVALENT_TO | this_SUBTYPE_OF_1= RULE_SUBTYPE_OF | this_COMMA_2= RULE_COMMA | this_CONJUNCTION_KEYWORD_3= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_4= RULE_DISJUNCTION_KEYWORD | this_EXCLUSION_KEYWORD_5= RULE_EXCLUSION_KEYWORD | this_REVERSED_6= RULE_REVERSED | this_CARET_7= RULE_CARET | this_LT_8= RULE_LT | this_LTE_9= RULE_LTE | this_DBL_LT_10= RULE_DBL_LT | this_LT_EM_11= RULE_LT_EM | this_GT_12= RULE_GT | this_GTE_13= RULE_GTE | this_DBL_GT_14= RULE_DBL_GT | this_GT_EM_15= RULE_GT_EM | this_EQUAL_16= RULE_EQUAL | this_NOT_EQUAL_17= RULE_NOT_EQUAL ) ;
    public final AntlrDatatypeRuleToken ruleSlotToken() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQUIVALENT_TO_0=null;
        Token this_SUBTYPE_OF_1=null;
        Token this_COMMA_2=null;
        Token this_CONJUNCTION_KEYWORD_3=null;
        Token this_DISJUNCTION_KEYWORD_4=null;
        Token this_EXCLUSION_KEYWORD_5=null;
        Token this_REVERSED_6=null;
        Token this_CARET_7=null;
        Token this_LT_8=null;
        Token this_LTE_9=null;
        Token this_DBL_LT_10=null;
        Token this_LT_EM_11=null;
        Token this_GT_12=null;
        Token this_GTE_13=null;
        Token this_DBL_GT_14=null;
        Token this_GT_EM_15=null;
        Token this_EQUAL_16=null;
        Token this_NOT_EQUAL_17=null;


        	enterRule();

        try {
            // InternalEtlParser.g:1657:2: ( (this_EQUIVALENT_TO_0= RULE_EQUIVALENT_TO | this_SUBTYPE_OF_1= RULE_SUBTYPE_OF | this_COMMA_2= RULE_COMMA | this_CONJUNCTION_KEYWORD_3= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_4= RULE_DISJUNCTION_KEYWORD | this_EXCLUSION_KEYWORD_5= RULE_EXCLUSION_KEYWORD | this_REVERSED_6= RULE_REVERSED | this_CARET_7= RULE_CARET | this_LT_8= RULE_LT | this_LTE_9= RULE_LTE | this_DBL_LT_10= RULE_DBL_LT | this_LT_EM_11= RULE_LT_EM | this_GT_12= RULE_GT | this_GTE_13= RULE_GTE | this_DBL_GT_14= RULE_DBL_GT | this_GT_EM_15= RULE_GT_EM | this_EQUAL_16= RULE_EQUAL | this_NOT_EQUAL_17= RULE_NOT_EQUAL ) )
            // InternalEtlParser.g:1658:2: (this_EQUIVALENT_TO_0= RULE_EQUIVALENT_TO | this_SUBTYPE_OF_1= RULE_SUBTYPE_OF | this_COMMA_2= RULE_COMMA | this_CONJUNCTION_KEYWORD_3= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_4= RULE_DISJUNCTION_KEYWORD | this_EXCLUSION_KEYWORD_5= RULE_EXCLUSION_KEYWORD | this_REVERSED_6= RULE_REVERSED | this_CARET_7= RULE_CARET | this_LT_8= RULE_LT | this_LTE_9= RULE_LTE | this_DBL_LT_10= RULE_DBL_LT | this_LT_EM_11= RULE_LT_EM | this_GT_12= RULE_GT | this_GTE_13= RULE_GTE | this_DBL_GT_14= RULE_DBL_GT | this_GT_EM_15= RULE_GT_EM | this_EQUAL_16= RULE_EQUAL | this_NOT_EQUAL_17= RULE_NOT_EQUAL )
            {
            // InternalEtlParser.g:1658:2: (this_EQUIVALENT_TO_0= RULE_EQUIVALENT_TO | this_SUBTYPE_OF_1= RULE_SUBTYPE_OF | this_COMMA_2= RULE_COMMA | this_CONJUNCTION_KEYWORD_3= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_4= RULE_DISJUNCTION_KEYWORD | this_EXCLUSION_KEYWORD_5= RULE_EXCLUSION_KEYWORD | this_REVERSED_6= RULE_REVERSED | this_CARET_7= RULE_CARET | this_LT_8= RULE_LT | this_LTE_9= RULE_LTE | this_DBL_LT_10= RULE_DBL_LT | this_LT_EM_11= RULE_LT_EM | this_GT_12= RULE_GT | this_GTE_13= RULE_GTE | this_DBL_GT_14= RULE_DBL_GT | this_GT_EM_15= RULE_GT_EM | this_EQUAL_16= RULE_EQUAL | this_NOT_EQUAL_17= RULE_NOT_EQUAL )
            int alt39=18;
            switch ( input.LA(1) ) {
            case RULE_EQUIVALENT_TO:
                {
                alt39=1;
                }
                break;
            case RULE_SUBTYPE_OF:
                {
                alt39=2;
                }
                break;
            case RULE_COMMA:
                {
                alt39=3;
                }
                break;
            case RULE_CONJUNCTION_KEYWORD:
                {
                alt39=4;
                }
                break;
            case RULE_DISJUNCTION_KEYWORD:
                {
                alt39=5;
                }
                break;
            case RULE_EXCLUSION_KEYWORD:
                {
                alt39=6;
                }
                break;
            case RULE_REVERSED:
                {
                alt39=7;
                }
                break;
            case RULE_CARET:
                {
                alt39=8;
                }
                break;
            case RULE_LT:
                {
                alt39=9;
                }
                break;
            case RULE_LTE:
                {
                alt39=10;
                }
                break;
            case RULE_DBL_LT:
                {
                alt39=11;
                }
                break;
            case RULE_LT_EM:
                {
                alt39=12;
                }
                break;
            case RULE_GT:
                {
                alt39=13;
                }
                break;
            case RULE_GTE:
                {
                alt39=14;
                }
                break;
            case RULE_DBL_GT:
                {
                alt39=15;
                }
                break;
            case RULE_GT_EM:
                {
                alt39=16;
                }
                break;
            case RULE_EQUAL:
                {
                alt39=17;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt39=18;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalEtlParser.g:1659:3: this_EQUIVALENT_TO_0= RULE_EQUIVALENT_TO
                    {
                    this_EQUIVALENT_TO_0=(Token)match(input,RULE_EQUIVALENT_TO,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EQUIVALENT_TO_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EQUIVALENT_TO_0, grammarAccess.getSlotTokenAccess().getEQUIVALENT_TOTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:1667:3: this_SUBTYPE_OF_1= RULE_SUBTYPE_OF
                    {
                    this_SUBTYPE_OF_1=(Token)match(input,RULE_SUBTYPE_OF,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SUBTYPE_OF_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SUBTYPE_OF_1, grammarAccess.getSlotTokenAccess().getSUBTYPE_OFTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEtlParser.g:1675:3: this_COMMA_2= RULE_COMMA
                    {
                    this_COMMA_2=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_COMMA_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_COMMA_2, grammarAccess.getSlotTokenAccess().getCOMMATerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEtlParser.g:1683:3: this_CONJUNCTION_KEYWORD_3= RULE_CONJUNCTION_KEYWORD
                    {
                    this_CONJUNCTION_KEYWORD_3=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CONJUNCTION_KEYWORD_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CONJUNCTION_KEYWORD_3, grammarAccess.getSlotTokenAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEtlParser.g:1691:3: this_DISJUNCTION_KEYWORD_4= RULE_DISJUNCTION_KEYWORD
                    {
                    this_DISJUNCTION_KEYWORD_4=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DISJUNCTION_KEYWORD_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DISJUNCTION_KEYWORD_4, grammarAccess.getSlotTokenAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEtlParser.g:1699:3: this_EXCLUSION_KEYWORD_5= RULE_EXCLUSION_KEYWORD
                    {
                    this_EXCLUSION_KEYWORD_5=(Token)match(input,RULE_EXCLUSION_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXCLUSION_KEYWORD_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXCLUSION_KEYWORD_5, grammarAccess.getSlotTokenAccess().getEXCLUSION_KEYWORDTerminalRuleCall_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEtlParser.g:1707:3: this_REVERSED_6= RULE_REVERSED
                    {
                    this_REVERSED_6=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_REVERSED_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_REVERSED_6, grammarAccess.getSlotTokenAccess().getREVERSEDTerminalRuleCall_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEtlParser.g:1715:3: this_CARET_7= RULE_CARET
                    {
                    this_CARET_7=(Token)match(input,RULE_CARET,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CARET_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CARET_7, grammarAccess.getSlotTokenAccess().getCARETTerminalRuleCall_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEtlParser.g:1723:3: this_LT_8= RULE_LT
                    {
                    this_LT_8=(Token)match(input,RULE_LT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LT_8);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_LT_8, grammarAccess.getSlotTokenAccess().getLTTerminalRuleCall_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalEtlParser.g:1731:3: this_LTE_9= RULE_LTE
                    {
                    this_LTE_9=(Token)match(input,RULE_LTE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LTE_9);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_LTE_9, grammarAccess.getSlotTokenAccess().getLTETerminalRuleCall_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalEtlParser.g:1739:3: this_DBL_LT_10= RULE_DBL_LT
                    {
                    this_DBL_LT_10=(Token)match(input,RULE_DBL_LT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DBL_LT_10);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DBL_LT_10, grammarAccess.getSlotTokenAccess().getDBL_LTTerminalRuleCall_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalEtlParser.g:1747:3: this_LT_EM_11= RULE_LT_EM
                    {
                    this_LT_EM_11=(Token)match(input,RULE_LT_EM,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LT_EM_11);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_LT_EM_11, grammarAccess.getSlotTokenAccess().getLT_EMTerminalRuleCall_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalEtlParser.g:1755:3: this_GT_12= RULE_GT
                    {
                    this_GT_12=(Token)match(input,RULE_GT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_GT_12);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_GT_12, grammarAccess.getSlotTokenAccess().getGTTerminalRuleCall_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalEtlParser.g:1763:3: this_GTE_13= RULE_GTE
                    {
                    this_GTE_13=(Token)match(input,RULE_GTE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_GTE_13);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_GTE_13, grammarAccess.getSlotTokenAccess().getGTETerminalRuleCall_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalEtlParser.g:1771:3: this_DBL_GT_14= RULE_DBL_GT
                    {
                    this_DBL_GT_14=(Token)match(input,RULE_DBL_GT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DBL_GT_14);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DBL_GT_14, grammarAccess.getSlotTokenAccess().getDBL_GTTerminalRuleCall_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalEtlParser.g:1779:3: this_GT_EM_15= RULE_GT_EM
                    {
                    this_GT_EM_15=(Token)match(input,RULE_GT_EM,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_GT_EM_15);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_GT_EM_15, grammarAccess.getSlotTokenAccess().getGT_EMTerminalRuleCall_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalEtlParser.g:1787:3: this_EQUAL_16= RULE_EQUAL
                    {
                    this_EQUAL_16=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EQUAL_16);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EQUAL_16, grammarAccess.getSlotTokenAccess().getEQUALTerminalRuleCall_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalEtlParser.g:1795:3: this_NOT_EQUAL_17= RULE_NOT_EQUAL
                    {
                    this_NOT_EQUAL_17=(Token)match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NOT_EQUAL_17);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_NOT_EQUAL_17, grammarAccess.getSlotTokenAccess().getNOT_EQUALTerminalRuleCall_17());
                      		
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
    // $ANTLR end "ruleSlotToken"


    // $ANTLR start "entryRuleStringValue"
    // InternalEtlParser.g:1806:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalEtlParser.g:1806:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalEtlParser.g:1807:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalEtlParser.g:1813:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEtlParser.g:1819:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalEtlParser.g:1820:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalEtlParser.g:1820:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalEtlParser.g:1821:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalEtlParser.g:1821:3: (lv_value_0_0= RULE_STRING )
            // InternalEtlParser.g:1822:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStringValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.b2international.snomed.ecl.Ecl.STRING");
              			
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalEtlParser.g:1841:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalEtlParser.g:1841:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalEtlParser.g:1842:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalEtlParser.g:1848:1: ruleIntegerValue returns [EObject current=null] : (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token this_HASH_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:1854:2: ( (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleInteger ) ) ) )
            // InternalEtlParser.g:1855:2: (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleInteger ) ) )
            {
            // InternalEtlParser.g:1855:2: (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleInteger ) ) )
            // InternalEtlParser.g:1856:3: this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleInteger ) )
            {
            this_HASH_0=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_0, grammarAccess.getIntegerValueAccess().getHASHTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:1860:3: ( (lv_value_1_0= ruleInteger ) )
            // InternalEtlParser.g:1861:4: (lv_value_1_0= ruleInteger )
            {
            // InternalEtlParser.g:1861:4: (lv_value_1_0= ruleInteger )
            // InternalEtlParser.g:1862:5: lv_value_1_0= ruleInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerValueAccess().getValueIntegerParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerValueRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.b2international.snomed.ecl.Ecl.Integer");
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
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleDecimalValue"
    // InternalEtlParser.g:1883:1: entryRuleDecimalValue returns [EObject current=null] : iv_ruleDecimalValue= ruleDecimalValue EOF ;
    public final EObject entryRuleDecimalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValue = null;


        try {
            // InternalEtlParser.g:1883:53: (iv_ruleDecimalValue= ruleDecimalValue EOF )
            // InternalEtlParser.g:1884:2: iv_ruleDecimalValue= ruleDecimalValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecimalValue=ruleDecimalValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValue"


    // $ANTLR start "ruleDecimalValue"
    // InternalEtlParser.g:1890:1: ruleDecimalValue returns [EObject current=null] : (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValue() throws RecognitionException {
        EObject current = null;

        Token this_HASH_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:1896:2: ( (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleDecimal ) ) ) )
            // InternalEtlParser.g:1897:2: (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleDecimal ) ) )
            {
            // InternalEtlParser.g:1897:2: (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleDecimal ) ) )
            // InternalEtlParser.g:1898:3: this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleDecimal ) )
            {
            this_HASH_0=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_0, grammarAccess.getDecimalValueAccess().getHASHTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:1902:3: ( (lv_value_1_0= ruleDecimal ) )
            // InternalEtlParser.g:1903:4: (lv_value_1_0= ruleDecimal )
            {
            // InternalEtlParser.g:1903:4: (lv_value_1_0= ruleDecimal )
            // InternalEtlParser.g:1904:5: lv_value_1_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecimalValueAccess().getValueDecimalParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDecimalValueRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.b2international.snomed.ecl.Ecl.Decimal");
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
    // $ANTLR end "ruleDecimalValue"


    // $ANTLR start "entryRuleSlotInteger"
    // InternalEtlParser.g:1925:1: entryRuleSlotInteger returns [EObject current=null] : iv_ruleSlotInteger= ruleSlotInteger EOF ;
    public final EObject entryRuleSlotInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlotInteger = null;


        try {
            // InternalEtlParser.g:1925:52: (iv_ruleSlotInteger= ruleSlotInteger EOF )
            // InternalEtlParser.g:1926:2: iv_ruleSlotInteger= ruleSlotInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlotIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlotInteger=ruleSlotInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlotInteger; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSlotInteger"


    // $ANTLR start "ruleSlotInteger"
    // InternalEtlParser.g:1932:1: ruleSlotInteger returns [EObject current=null] : (this_SlotIntegerRange_0= ruleSlotIntegerRange | this_SlotIntegerValue_1= ruleSlotIntegerValue ) ;
    public final EObject ruleSlotInteger() throws RecognitionException {
        EObject current = null;

        EObject this_SlotIntegerRange_0 = null;

        EObject this_SlotIntegerValue_1 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:1938:2: ( (this_SlotIntegerRange_0= ruleSlotIntegerRange | this_SlotIntegerValue_1= ruleSlotIntegerValue ) )
            // InternalEtlParser.g:1939:2: (this_SlotIntegerRange_0= ruleSlotIntegerRange | this_SlotIntegerValue_1= ruleSlotIntegerValue )
            {
            // InternalEtlParser.g:1939:2: (this_SlotIntegerRange_0= ruleSlotIntegerRange | this_SlotIntegerValue_1= ruleSlotIntegerValue )
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalEtlParser.g:1940:3: this_SlotIntegerRange_0= ruleSlotIntegerRange
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSlotIntegerAccess().getSlotIntegerRangeParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SlotIntegerRange_0=ruleSlotIntegerRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SlotIntegerRange_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:1952:3: this_SlotIntegerValue_1= ruleSlotIntegerValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSlotIntegerAccess().getSlotIntegerValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SlotIntegerValue_1=ruleSlotIntegerValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SlotIntegerValue_1;
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
    // $ANTLR end "ruleSlotInteger"


    // $ANTLR start "entryRuleSlotIntegerValue"
    // InternalEtlParser.g:1967:1: entryRuleSlotIntegerValue returns [EObject current=null] : iv_ruleSlotIntegerValue= ruleSlotIntegerValue EOF ;
    public final EObject entryRuleSlotIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlotIntegerValue = null;


        try {
            // InternalEtlParser.g:1967:57: (iv_ruleSlotIntegerValue= ruleSlotIntegerValue EOF )
            // InternalEtlParser.g:1968:2: iv_ruleSlotIntegerValue= ruleSlotIntegerValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlotIntegerValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlotIntegerValue=ruleSlotIntegerValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlotIntegerValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSlotIntegerValue"


    // $ANTLR start "ruleSlotIntegerValue"
    // InternalEtlParser.g:1974:1: ruleSlotIntegerValue returns [EObject current=null] : (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleNonNegativeInteger ) ) ) ;
    public final EObject ruleSlotIntegerValue() throws RecognitionException {
        EObject current = null;

        Token this_HASH_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:1980:2: ( (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleNonNegativeInteger ) ) ) )
            // InternalEtlParser.g:1981:2: (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleNonNegativeInteger ) ) )
            {
            // InternalEtlParser.g:1981:2: (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleNonNegativeInteger ) ) )
            // InternalEtlParser.g:1982:3: this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleNonNegativeInteger ) )
            {
            this_HASH_0=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_0, grammarAccess.getSlotIntegerValueAccess().getHASHTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:1986:3: ( (lv_value_1_0= ruleNonNegativeInteger ) )
            // InternalEtlParser.g:1987:4: (lv_value_1_0= ruleNonNegativeInteger )
            {
            // InternalEtlParser.g:1987:4: (lv_value_1_0= ruleNonNegativeInteger )
            // InternalEtlParser.g:1988:5: lv_value_1_0= ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlotIntegerValueAccess().getValueNonNegativeIntegerParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlotIntegerValueRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
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
    // $ANTLR end "ruleSlotIntegerValue"


    // $ANTLR start "entryRuleSlotIntegerRange"
    // InternalEtlParser.g:2009:1: entryRuleSlotIntegerRange returns [EObject current=null] : iv_ruleSlotIntegerRange= ruleSlotIntegerRange EOF ;
    public final EObject entryRuleSlotIntegerRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlotIntegerRange = null;


        try {
            // InternalEtlParser.g:2009:57: (iv_ruleSlotIntegerRange= ruleSlotIntegerRange EOF )
            // InternalEtlParser.g:2010:2: iv_ruleSlotIntegerRange= ruleSlotIntegerRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlotIntegerRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlotIntegerRange=ruleSlotIntegerRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlotIntegerRange; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSlotIntegerRange"


    // $ANTLR start "ruleSlotIntegerRange"
    // InternalEtlParser.g:2016:1: ruleSlotIntegerRange returns [EObject current=null] : ( ( ( (lv_minimum_0_0= ruleSlotIntegerMinimumValue ) ) this_TO_1= RULE_TO ( (lv_maximum_2_0= ruleSlotIntegerMaximumValue ) )? ) | (this_TO_3= RULE_TO ( (lv_maximum_4_0= ruleSlotIntegerMaximumValue ) ) ) ) ;
    public final EObject ruleSlotIntegerRange() throws RecognitionException {
        EObject current = null;

        Token this_TO_1=null;
        Token this_TO_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_maximum_4_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2022:2: ( ( ( ( (lv_minimum_0_0= ruleSlotIntegerMinimumValue ) ) this_TO_1= RULE_TO ( (lv_maximum_2_0= ruleSlotIntegerMaximumValue ) )? ) | (this_TO_3= RULE_TO ( (lv_maximum_4_0= ruleSlotIntegerMaximumValue ) ) ) ) )
            // InternalEtlParser.g:2023:2: ( ( ( (lv_minimum_0_0= ruleSlotIntegerMinimumValue ) ) this_TO_1= RULE_TO ( (lv_maximum_2_0= ruleSlotIntegerMaximumValue ) )? ) | (this_TO_3= RULE_TO ( (lv_maximum_4_0= ruleSlotIntegerMaximumValue ) ) ) )
            {
            // InternalEtlParser.g:2023:2: ( ( ( (lv_minimum_0_0= ruleSlotIntegerMinimumValue ) ) this_TO_1= RULE_TO ( (lv_maximum_2_0= ruleSlotIntegerMaximumValue ) )? ) | (this_TO_3= RULE_TO ( (lv_maximum_4_0= ruleSlotIntegerMaximumValue ) ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_GT && LA42_0<=RULE_HASH)) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_TO) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalEtlParser.g:2024:3: ( ( (lv_minimum_0_0= ruleSlotIntegerMinimumValue ) ) this_TO_1= RULE_TO ( (lv_maximum_2_0= ruleSlotIntegerMaximumValue ) )? )
                    {
                    // InternalEtlParser.g:2024:3: ( ( (lv_minimum_0_0= ruleSlotIntegerMinimumValue ) ) this_TO_1= RULE_TO ( (lv_maximum_2_0= ruleSlotIntegerMaximumValue ) )? )
                    // InternalEtlParser.g:2025:4: ( (lv_minimum_0_0= ruleSlotIntegerMinimumValue ) ) this_TO_1= RULE_TO ( (lv_maximum_2_0= ruleSlotIntegerMaximumValue ) )?
                    {
                    // InternalEtlParser.g:2025:4: ( (lv_minimum_0_0= ruleSlotIntegerMinimumValue ) )
                    // InternalEtlParser.g:2026:5: (lv_minimum_0_0= ruleSlotIntegerMinimumValue )
                    {
                    // InternalEtlParser.g:2026:5: (lv_minimum_0_0= ruleSlotIntegerMinimumValue )
                    // InternalEtlParser.g:2027:6: lv_minimum_0_0= ruleSlotIntegerMinimumValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlotIntegerRangeAccess().getMinimumSlotIntegerMinimumValueParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    lv_minimum_0_0=ruleSlotIntegerMinimumValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlotIntegerRangeRule());
                      						}
                      						set(
                      							current,
                      							"minimum",
                      							lv_minimum_0_0,
                      							"com.b2international.snomed.etl.Etl.SlotIntegerMinimumValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_TO_1=(Token)match(input,RULE_TO,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_TO_1, grammarAccess.getSlotIntegerRangeAccess().getTOTerminalRuleCall_0_1());
                      			
                    }
                    // InternalEtlParser.g:2048:4: ( (lv_maximum_2_0= ruleSlotIntegerMaximumValue ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_LT) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==RULE_HASH) ) {
                        int LA41_2 = input.LA(2);

                        if ( (LA41_2==RULE_DIGIT_NONZERO) ) {
                            int LA41_4 = input.LA(3);

                            if ( (synpred63_InternalEtlParser()) ) {
                                alt41=1;
                            }
                        }
                        else if ( (LA41_2==RULE_DIGIT_ZERO) ) {
                            int LA41_5 = input.LA(3);

                            if ( (synpred63_InternalEtlParser()) ) {
                                alt41=1;
                            }
                        }
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalEtlParser.g:2049:5: (lv_maximum_2_0= ruleSlotIntegerMaximumValue )
                            {
                            // InternalEtlParser.g:2049:5: (lv_maximum_2_0= ruleSlotIntegerMaximumValue )
                            // InternalEtlParser.g:2050:6: lv_maximum_2_0= ruleSlotIntegerMaximumValue
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getSlotIntegerRangeAccess().getMaximumSlotIntegerMaximumValueParserRuleCall_0_2_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_maximum_2_0=ruleSlotIntegerMaximumValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getSlotIntegerRangeRule());
                              						}
                              						set(
                              							current,
                              							"maximum",
                              							lv_maximum_2_0,
                              							"com.b2international.snomed.etl.Etl.SlotIntegerMaximumValue");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:2069:3: (this_TO_3= RULE_TO ( (lv_maximum_4_0= ruleSlotIntegerMaximumValue ) ) )
                    {
                    // InternalEtlParser.g:2069:3: (this_TO_3= RULE_TO ( (lv_maximum_4_0= ruleSlotIntegerMaximumValue ) ) )
                    // InternalEtlParser.g:2070:4: this_TO_3= RULE_TO ( (lv_maximum_4_0= ruleSlotIntegerMaximumValue ) )
                    {
                    this_TO_3=(Token)match(input,RULE_TO,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_TO_3, grammarAccess.getSlotIntegerRangeAccess().getTOTerminalRuleCall_1_0());
                      			
                    }
                    // InternalEtlParser.g:2074:4: ( (lv_maximum_4_0= ruleSlotIntegerMaximumValue ) )
                    // InternalEtlParser.g:2075:5: (lv_maximum_4_0= ruleSlotIntegerMaximumValue )
                    {
                    // InternalEtlParser.g:2075:5: (lv_maximum_4_0= ruleSlotIntegerMaximumValue )
                    // InternalEtlParser.g:2076:6: lv_maximum_4_0= ruleSlotIntegerMaximumValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlotIntegerRangeAccess().getMaximumSlotIntegerMaximumValueParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_maximum_4_0=ruleSlotIntegerMaximumValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlotIntegerRangeRule());
                      						}
                      						set(
                      							current,
                      							"maximum",
                      							lv_maximum_4_0,
                      							"com.b2international.snomed.etl.Etl.SlotIntegerMaximumValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


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
    // $ANTLR end "ruleSlotIntegerRange"


    // $ANTLR start "entryRuleSlotIntegerMinimumValue"
    // InternalEtlParser.g:2098:1: entryRuleSlotIntegerMinimumValue returns [EObject current=null] : iv_ruleSlotIntegerMinimumValue= ruleSlotIntegerMinimumValue EOF ;
    public final EObject entryRuleSlotIntegerMinimumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlotIntegerMinimumValue = null;


        try {
            // InternalEtlParser.g:2098:64: (iv_ruleSlotIntegerMinimumValue= ruleSlotIntegerMinimumValue EOF )
            // InternalEtlParser.g:2099:2: iv_ruleSlotIntegerMinimumValue= ruleSlotIntegerMinimumValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlotIntegerMinimumValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlotIntegerMinimumValue=ruleSlotIntegerMinimumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlotIntegerMinimumValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSlotIntegerMinimumValue"


    // $ANTLR start "ruleSlotIntegerMinimumValue"
    // InternalEtlParser.g:2105:1: ruleSlotIntegerMinimumValue returns [EObject current=null] : ( ( (lv_exclusive_0_0= RULE_GT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeInteger ) ) ) ;
    public final EObject ruleSlotIntegerMinimumValue() throws RecognitionException {
        EObject current = null;

        Token lv_exclusive_0_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2111:2: ( ( ( (lv_exclusive_0_0= RULE_GT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeInteger ) ) ) )
            // InternalEtlParser.g:2112:2: ( ( (lv_exclusive_0_0= RULE_GT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeInteger ) ) )
            {
            // InternalEtlParser.g:2112:2: ( ( (lv_exclusive_0_0= RULE_GT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeInteger ) ) )
            // InternalEtlParser.g:2113:3: ( (lv_exclusive_0_0= RULE_GT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeInteger ) )
            {
            // InternalEtlParser.g:2113:3: ( (lv_exclusive_0_0= RULE_GT ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_GT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalEtlParser.g:2114:4: (lv_exclusive_0_0= RULE_GT )
                    {
                    // InternalEtlParser.g:2114:4: (lv_exclusive_0_0= RULE_GT )
                    // InternalEtlParser.g:2115:5: lv_exclusive_0_0= RULE_GT
                    {
                    lv_exclusive_0_0=(Token)match(input,RULE_GT,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_exclusive_0_0, grammarAccess.getSlotIntegerMinimumValueAccess().getExclusiveGTTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSlotIntegerMinimumValueRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"exclusive",
                      						lv_exclusive_0_0 != null,
                      						"com.b2international.snomed.ecl.Ecl.GT");
                      				
                    }

                    }


                    }
                    break;

            }

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getSlotIntegerMinimumValueAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:2135:3: ( (lv_value_2_0= ruleNonNegativeInteger ) )
            // InternalEtlParser.g:2136:4: (lv_value_2_0= ruleNonNegativeInteger )
            {
            // InternalEtlParser.g:2136:4: (lv_value_2_0= ruleNonNegativeInteger )
            // InternalEtlParser.g:2137:5: lv_value_2_0= ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlotIntegerMinimumValueAccess().getValueNonNegativeIntegerParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlotIntegerMinimumValueRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
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
    // $ANTLR end "ruleSlotIntegerMinimumValue"


    // $ANTLR start "entryRuleSlotIntegerMaximumValue"
    // InternalEtlParser.g:2158:1: entryRuleSlotIntegerMaximumValue returns [EObject current=null] : iv_ruleSlotIntegerMaximumValue= ruleSlotIntegerMaximumValue EOF ;
    public final EObject entryRuleSlotIntegerMaximumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlotIntegerMaximumValue = null;


        try {
            // InternalEtlParser.g:2158:64: (iv_ruleSlotIntegerMaximumValue= ruleSlotIntegerMaximumValue EOF )
            // InternalEtlParser.g:2159:2: iv_ruleSlotIntegerMaximumValue= ruleSlotIntegerMaximumValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlotIntegerMaximumValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlotIntegerMaximumValue=ruleSlotIntegerMaximumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlotIntegerMaximumValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSlotIntegerMaximumValue"


    // $ANTLR start "ruleSlotIntegerMaximumValue"
    // InternalEtlParser.g:2165:1: ruleSlotIntegerMaximumValue returns [EObject current=null] : ( ( (lv_exclusive_0_0= RULE_LT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeInteger ) ) ) ;
    public final EObject ruleSlotIntegerMaximumValue() throws RecognitionException {
        EObject current = null;

        Token lv_exclusive_0_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2171:2: ( ( ( (lv_exclusive_0_0= RULE_LT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeInteger ) ) ) )
            // InternalEtlParser.g:2172:2: ( ( (lv_exclusive_0_0= RULE_LT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeInteger ) ) )
            {
            // InternalEtlParser.g:2172:2: ( ( (lv_exclusive_0_0= RULE_LT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeInteger ) ) )
            // InternalEtlParser.g:2173:3: ( (lv_exclusive_0_0= RULE_LT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeInteger ) )
            {
            // InternalEtlParser.g:2173:3: ( (lv_exclusive_0_0= RULE_LT ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_LT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalEtlParser.g:2174:4: (lv_exclusive_0_0= RULE_LT )
                    {
                    // InternalEtlParser.g:2174:4: (lv_exclusive_0_0= RULE_LT )
                    // InternalEtlParser.g:2175:5: lv_exclusive_0_0= RULE_LT
                    {
                    lv_exclusive_0_0=(Token)match(input,RULE_LT,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_exclusive_0_0, grammarAccess.getSlotIntegerMaximumValueAccess().getExclusiveLTTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSlotIntegerMaximumValueRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"exclusive",
                      						lv_exclusive_0_0 != null,
                      						"com.b2international.snomed.ecl.Ecl.LT");
                      				
                    }

                    }


                    }
                    break;

            }

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getSlotIntegerMaximumValueAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:2195:3: ( (lv_value_2_0= ruleNonNegativeInteger ) )
            // InternalEtlParser.g:2196:4: (lv_value_2_0= ruleNonNegativeInteger )
            {
            // InternalEtlParser.g:2196:4: (lv_value_2_0= ruleNonNegativeInteger )
            // InternalEtlParser.g:2197:5: lv_value_2_0= ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlotIntegerMaximumValueAccess().getValueNonNegativeIntegerParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlotIntegerMaximumValueRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
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
    // $ANTLR end "ruleSlotIntegerMaximumValue"


    // $ANTLR start "entryRuleSlotDecimal"
    // InternalEtlParser.g:2218:1: entryRuleSlotDecimal returns [EObject current=null] : iv_ruleSlotDecimal= ruleSlotDecimal EOF ;
    public final EObject entryRuleSlotDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlotDecimal = null;


        try {
            // InternalEtlParser.g:2218:52: (iv_ruleSlotDecimal= ruleSlotDecimal EOF )
            // InternalEtlParser.g:2219:2: iv_ruleSlotDecimal= ruleSlotDecimal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlotDecimalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlotDecimal=ruleSlotDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlotDecimal; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSlotDecimal"


    // $ANTLR start "ruleSlotDecimal"
    // InternalEtlParser.g:2225:1: ruleSlotDecimal returns [EObject current=null] : (this_SlotDecimalRange_0= ruleSlotDecimalRange | this_SlotDecimalValue_1= ruleSlotDecimalValue ) ;
    public final EObject ruleSlotDecimal() throws RecognitionException {
        EObject current = null;

        EObject this_SlotDecimalRange_0 = null;

        EObject this_SlotDecimalValue_1 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2231:2: ( (this_SlotDecimalRange_0= ruleSlotDecimalRange | this_SlotDecimalValue_1= ruleSlotDecimalValue ) )
            // InternalEtlParser.g:2232:2: (this_SlotDecimalRange_0= ruleSlotDecimalRange | this_SlotDecimalValue_1= ruleSlotDecimalValue )
            {
            // InternalEtlParser.g:2232:2: (this_SlotDecimalRange_0= ruleSlotDecimalRange | this_SlotDecimalValue_1= ruleSlotDecimalValue )
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // InternalEtlParser.g:2233:3: this_SlotDecimalRange_0= ruleSlotDecimalRange
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSlotDecimalAccess().getSlotDecimalRangeParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SlotDecimalRange_0=ruleSlotDecimalRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SlotDecimalRange_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:2245:3: this_SlotDecimalValue_1= ruleSlotDecimalValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSlotDecimalAccess().getSlotDecimalValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SlotDecimalValue_1=ruleSlotDecimalValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SlotDecimalValue_1;
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
    // $ANTLR end "ruleSlotDecimal"


    // $ANTLR start "entryRuleSlotDecimalValue"
    // InternalEtlParser.g:2260:1: entryRuleSlotDecimalValue returns [EObject current=null] : iv_ruleSlotDecimalValue= ruleSlotDecimalValue EOF ;
    public final EObject entryRuleSlotDecimalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlotDecimalValue = null;


        try {
            // InternalEtlParser.g:2260:57: (iv_ruleSlotDecimalValue= ruleSlotDecimalValue EOF )
            // InternalEtlParser.g:2261:2: iv_ruleSlotDecimalValue= ruleSlotDecimalValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlotDecimalValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlotDecimalValue=ruleSlotDecimalValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlotDecimalValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSlotDecimalValue"


    // $ANTLR start "ruleSlotDecimalValue"
    // InternalEtlParser.g:2267:1: ruleSlotDecimalValue returns [EObject current=null] : (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleNonNegativeDecimal ) ) ) ;
    public final EObject ruleSlotDecimalValue() throws RecognitionException {
        EObject current = null;

        Token this_HASH_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2273:2: ( (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleNonNegativeDecimal ) ) ) )
            // InternalEtlParser.g:2274:2: (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleNonNegativeDecimal ) ) )
            {
            // InternalEtlParser.g:2274:2: (this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleNonNegativeDecimal ) ) )
            // InternalEtlParser.g:2275:3: this_HASH_0= RULE_HASH ( (lv_value_1_0= ruleNonNegativeDecimal ) )
            {
            this_HASH_0=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_0, grammarAccess.getSlotDecimalValueAccess().getHASHTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:2279:3: ( (lv_value_1_0= ruleNonNegativeDecimal ) )
            // InternalEtlParser.g:2280:4: (lv_value_1_0= ruleNonNegativeDecimal )
            {
            // InternalEtlParser.g:2280:4: (lv_value_1_0= ruleNonNegativeDecimal )
            // InternalEtlParser.g:2281:5: lv_value_1_0= ruleNonNegativeDecimal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlotDecimalValueAccess().getValueNonNegativeDecimalParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlotDecimalValueRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.b2international.snomed.ecl.Ecl.NonNegativeDecimal");
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
    // $ANTLR end "ruleSlotDecimalValue"


    // $ANTLR start "entryRuleSlotDecimalRange"
    // InternalEtlParser.g:2302:1: entryRuleSlotDecimalRange returns [EObject current=null] : iv_ruleSlotDecimalRange= ruleSlotDecimalRange EOF ;
    public final EObject entryRuleSlotDecimalRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlotDecimalRange = null;


        try {
            // InternalEtlParser.g:2302:57: (iv_ruleSlotDecimalRange= ruleSlotDecimalRange EOF )
            // InternalEtlParser.g:2303:2: iv_ruleSlotDecimalRange= ruleSlotDecimalRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlotDecimalRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlotDecimalRange=ruleSlotDecimalRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlotDecimalRange; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSlotDecimalRange"


    // $ANTLR start "ruleSlotDecimalRange"
    // InternalEtlParser.g:2309:1: ruleSlotDecimalRange returns [EObject current=null] : ( ( ( (lv_minimum_0_0= ruleSlotDecimalMinimumValue ) ) this_TO_1= RULE_TO ( (lv_maximum_2_0= ruleSlotDecimalMaximumValue ) )? ) | (this_TO_3= RULE_TO ( (lv_maximum_4_0= ruleSlotDecimalMaximumValue ) ) ) ) ;
    public final EObject ruleSlotDecimalRange() throws RecognitionException {
        EObject current = null;

        Token this_TO_1=null;
        Token this_TO_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_maximum_4_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2315:2: ( ( ( ( (lv_minimum_0_0= ruleSlotDecimalMinimumValue ) ) this_TO_1= RULE_TO ( (lv_maximum_2_0= ruleSlotDecimalMaximumValue ) )? ) | (this_TO_3= RULE_TO ( (lv_maximum_4_0= ruleSlotDecimalMaximumValue ) ) ) ) )
            // InternalEtlParser.g:2316:2: ( ( ( (lv_minimum_0_0= ruleSlotDecimalMinimumValue ) ) this_TO_1= RULE_TO ( (lv_maximum_2_0= ruleSlotDecimalMaximumValue ) )? ) | (this_TO_3= RULE_TO ( (lv_maximum_4_0= ruleSlotDecimalMaximumValue ) ) ) )
            {
            // InternalEtlParser.g:2316:2: ( ( ( (lv_minimum_0_0= ruleSlotDecimalMinimumValue ) ) this_TO_1= RULE_TO ( (lv_maximum_2_0= ruleSlotDecimalMaximumValue ) )? ) | (this_TO_3= RULE_TO ( (lv_maximum_4_0= ruleSlotDecimalMaximumValue ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_GT && LA47_0<=RULE_HASH)) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_TO) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalEtlParser.g:2317:3: ( ( (lv_minimum_0_0= ruleSlotDecimalMinimumValue ) ) this_TO_1= RULE_TO ( (lv_maximum_2_0= ruleSlotDecimalMaximumValue ) )? )
                    {
                    // InternalEtlParser.g:2317:3: ( ( (lv_minimum_0_0= ruleSlotDecimalMinimumValue ) ) this_TO_1= RULE_TO ( (lv_maximum_2_0= ruleSlotDecimalMaximumValue ) )? )
                    // InternalEtlParser.g:2318:4: ( (lv_minimum_0_0= ruleSlotDecimalMinimumValue ) ) this_TO_1= RULE_TO ( (lv_maximum_2_0= ruleSlotDecimalMaximumValue ) )?
                    {
                    // InternalEtlParser.g:2318:4: ( (lv_minimum_0_0= ruleSlotDecimalMinimumValue ) )
                    // InternalEtlParser.g:2319:5: (lv_minimum_0_0= ruleSlotDecimalMinimumValue )
                    {
                    // InternalEtlParser.g:2319:5: (lv_minimum_0_0= ruleSlotDecimalMinimumValue )
                    // InternalEtlParser.g:2320:6: lv_minimum_0_0= ruleSlotDecimalMinimumValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlotDecimalRangeAccess().getMinimumSlotDecimalMinimumValueParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    lv_minimum_0_0=ruleSlotDecimalMinimumValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlotDecimalRangeRule());
                      						}
                      						set(
                      							current,
                      							"minimum",
                      							lv_minimum_0_0,
                      							"com.b2international.snomed.etl.Etl.SlotDecimalMinimumValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_TO_1=(Token)match(input,RULE_TO,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_TO_1, grammarAccess.getSlotDecimalRangeAccess().getTOTerminalRuleCall_0_1());
                      			
                    }
                    // InternalEtlParser.g:2341:4: ( (lv_maximum_2_0= ruleSlotDecimalMaximumValue ) )?
                    int alt46=2;
                    alt46 = dfa46.predict(input);
                    switch (alt46) {
                        case 1 :
                            // InternalEtlParser.g:2342:5: (lv_maximum_2_0= ruleSlotDecimalMaximumValue )
                            {
                            // InternalEtlParser.g:2342:5: (lv_maximum_2_0= ruleSlotDecimalMaximumValue )
                            // InternalEtlParser.g:2343:6: lv_maximum_2_0= ruleSlotDecimalMaximumValue
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getSlotDecimalRangeAccess().getMaximumSlotDecimalMaximumValueParserRuleCall_0_2_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_maximum_2_0=ruleSlotDecimalMaximumValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getSlotDecimalRangeRule());
                              						}
                              						set(
                              							current,
                              							"maximum",
                              							lv_maximum_2_0,
                              							"com.b2international.snomed.etl.Etl.SlotDecimalMaximumValue");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:2362:3: (this_TO_3= RULE_TO ( (lv_maximum_4_0= ruleSlotDecimalMaximumValue ) ) )
                    {
                    // InternalEtlParser.g:2362:3: (this_TO_3= RULE_TO ( (lv_maximum_4_0= ruleSlotDecimalMaximumValue ) ) )
                    // InternalEtlParser.g:2363:4: this_TO_3= RULE_TO ( (lv_maximum_4_0= ruleSlotDecimalMaximumValue ) )
                    {
                    this_TO_3=(Token)match(input,RULE_TO,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_TO_3, grammarAccess.getSlotDecimalRangeAccess().getTOTerminalRuleCall_1_0());
                      			
                    }
                    // InternalEtlParser.g:2367:4: ( (lv_maximum_4_0= ruleSlotDecimalMaximumValue ) )
                    // InternalEtlParser.g:2368:5: (lv_maximum_4_0= ruleSlotDecimalMaximumValue )
                    {
                    // InternalEtlParser.g:2368:5: (lv_maximum_4_0= ruleSlotDecimalMaximumValue )
                    // InternalEtlParser.g:2369:6: lv_maximum_4_0= ruleSlotDecimalMaximumValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlotDecimalRangeAccess().getMaximumSlotDecimalMaximumValueParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_maximum_4_0=ruleSlotDecimalMaximumValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlotDecimalRangeRule());
                      						}
                      						set(
                      							current,
                      							"maximum",
                      							lv_maximum_4_0,
                      							"com.b2international.snomed.etl.Etl.SlotDecimalMaximumValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


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
    // $ANTLR end "ruleSlotDecimalRange"


    // $ANTLR start "entryRuleSlotDecimalMinimumValue"
    // InternalEtlParser.g:2391:1: entryRuleSlotDecimalMinimumValue returns [EObject current=null] : iv_ruleSlotDecimalMinimumValue= ruleSlotDecimalMinimumValue EOF ;
    public final EObject entryRuleSlotDecimalMinimumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlotDecimalMinimumValue = null;


        try {
            // InternalEtlParser.g:2391:64: (iv_ruleSlotDecimalMinimumValue= ruleSlotDecimalMinimumValue EOF )
            // InternalEtlParser.g:2392:2: iv_ruleSlotDecimalMinimumValue= ruleSlotDecimalMinimumValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlotDecimalMinimumValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlotDecimalMinimumValue=ruleSlotDecimalMinimumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlotDecimalMinimumValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSlotDecimalMinimumValue"


    // $ANTLR start "ruleSlotDecimalMinimumValue"
    // InternalEtlParser.g:2398:1: ruleSlotDecimalMinimumValue returns [EObject current=null] : ( ( (lv_exclusive_0_0= RULE_GT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeDecimal ) ) ) ;
    public final EObject ruleSlotDecimalMinimumValue() throws RecognitionException {
        EObject current = null;

        Token lv_exclusive_0_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2404:2: ( ( ( (lv_exclusive_0_0= RULE_GT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeDecimal ) ) ) )
            // InternalEtlParser.g:2405:2: ( ( (lv_exclusive_0_0= RULE_GT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeDecimal ) ) )
            {
            // InternalEtlParser.g:2405:2: ( ( (lv_exclusive_0_0= RULE_GT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeDecimal ) ) )
            // InternalEtlParser.g:2406:3: ( (lv_exclusive_0_0= RULE_GT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeDecimal ) )
            {
            // InternalEtlParser.g:2406:3: ( (lv_exclusive_0_0= RULE_GT ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_GT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalEtlParser.g:2407:4: (lv_exclusive_0_0= RULE_GT )
                    {
                    // InternalEtlParser.g:2407:4: (lv_exclusive_0_0= RULE_GT )
                    // InternalEtlParser.g:2408:5: lv_exclusive_0_0= RULE_GT
                    {
                    lv_exclusive_0_0=(Token)match(input,RULE_GT,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_exclusive_0_0, grammarAccess.getSlotDecimalMinimumValueAccess().getExclusiveGTTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSlotDecimalMinimumValueRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"exclusive",
                      						lv_exclusive_0_0 != null,
                      						"com.b2international.snomed.ecl.Ecl.GT");
                      				
                    }

                    }


                    }
                    break;

            }

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getSlotDecimalMinimumValueAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:2428:3: ( (lv_value_2_0= ruleNonNegativeDecimal ) )
            // InternalEtlParser.g:2429:4: (lv_value_2_0= ruleNonNegativeDecimal )
            {
            // InternalEtlParser.g:2429:4: (lv_value_2_0= ruleNonNegativeDecimal )
            // InternalEtlParser.g:2430:5: lv_value_2_0= ruleNonNegativeDecimal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlotDecimalMinimumValueAccess().getValueNonNegativeDecimalParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlotDecimalMinimumValueRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.NonNegativeDecimal");
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
    // $ANTLR end "ruleSlotDecimalMinimumValue"


    // $ANTLR start "entryRuleSlotDecimalMaximumValue"
    // InternalEtlParser.g:2451:1: entryRuleSlotDecimalMaximumValue returns [EObject current=null] : iv_ruleSlotDecimalMaximumValue= ruleSlotDecimalMaximumValue EOF ;
    public final EObject entryRuleSlotDecimalMaximumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlotDecimalMaximumValue = null;


        try {
            // InternalEtlParser.g:2451:64: (iv_ruleSlotDecimalMaximumValue= ruleSlotDecimalMaximumValue EOF )
            // InternalEtlParser.g:2452:2: iv_ruleSlotDecimalMaximumValue= ruleSlotDecimalMaximumValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlotDecimalMaximumValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlotDecimalMaximumValue=ruleSlotDecimalMaximumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlotDecimalMaximumValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSlotDecimalMaximumValue"


    // $ANTLR start "ruleSlotDecimalMaximumValue"
    // InternalEtlParser.g:2458:1: ruleSlotDecimalMaximumValue returns [EObject current=null] : ( ( (lv_exclusive_0_0= RULE_LT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeDecimal ) ) ) ;
    public final EObject ruleSlotDecimalMaximumValue() throws RecognitionException {
        EObject current = null;

        Token lv_exclusive_0_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2464:2: ( ( ( (lv_exclusive_0_0= RULE_LT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeDecimal ) ) ) )
            // InternalEtlParser.g:2465:2: ( ( (lv_exclusive_0_0= RULE_LT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeDecimal ) ) )
            {
            // InternalEtlParser.g:2465:2: ( ( (lv_exclusive_0_0= RULE_LT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeDecimal ) ) )
            // InternalEtlParser.g:2466:3: ( (lv_exclusive_0_0= RULE_LT ) )? this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleNonNegativeDecimal ) )
            {
            // InternalEtlParser.g:2466:3: ( (lv_exclusive_0_0= RULE_LT ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_LT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalEtlParser.g:2467:4: (lv_exclusive_0_0= RULE_LT )
                    {
                    // InternalEtlParser.g:2467:4: (lv_exclusive_0_0= RULE_LT )
                    // InternalEtlParser.g:2468:5: lv_exclusive_0_0= RULE_LT
                    {
                    lv_exclusive_0_0=(Token)match(input,RULE_LT,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_exclusive_0_0, grammarAccess.getSlotDecimalMaximumValueAccess().getExclusiveLTTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSlotDecimalMaximumValueRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"exclusive",
                      						lv_exclusive_0_0 != null,
                      						"com.b2international.snomed.ecl.Ecl.LT");
                      				
                    }

                    }


                    }
                    break;

            }

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getSlotDecimalMaximumValueAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:2488:3: ( (lv_value_2_0= ruleNonNegativeDecimal ) )
            // InternalEtlParser.g:2489:4: (lv_value_2_0= ruleNonNegativeDecimal )
            {
            // InternalEtlParser.g:2489:4: (lv_value_2_0= ruleNonNegativeDecimal )
            // InternalEtlParser.g:2490:5: lv_value_2_0= ruleNonNegativeDecimal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlotDecimalMaximumValueAccess().getValueNonNegativeDecimalParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlotDecimalMaximumValueRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.NonNegativeDecimal");
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
    // $ANTLR end "ruleSlotDecimalMaximumValue"


    // $ANTLR start "entryRuleExpressionConstraint"
    // InternalEtlParser.g:2511:1: entryRuleExpressionConstraint returns [EObject current=null] : iv_ruleExpressionConstraint= ruleExpressionConstraint EOF ;
    public final EObject entryRuleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstraint = null;


        try {
            // InternalEtlParser.g:2511:61: (iv_ruleExpressionConstraint= ruleExpressionConstraint EOF )
            // InternalEtlParser.g:2512:2: iv_ruleExpressionConstraint= ruleExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpressionConstraint=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionConstraint"


    // $ANTLR start "ruleExpressionConstraint"
    // InternalEtlParser.g:2518:1: ruleExpressionConstraint returns [EObject current=null] : this_OrExpressionConstraint_0= ruleOrExpressionConstraint ;
    public final EObject ruleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpressionConstraint_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2524:2: (this_OrExpressionConstraint_0= ruleOrExpressionConstraint )
            // InternalEtlParser.g:2525:2: this_OrExpressionConstraint_0= ruleOrExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionConstraintAccess().getOrExpressionConstraintParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_OrExpressionConstraint_0=ruleOrExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_OrExpressionConstraint_0;
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
    // $ANTLR end "ruleExpressionConstraint"


    // $ANTLR start "entryRuleOrExpressionConstraint"
    // InternalEtlParser.g:2539:1: entryRuleOrExpressionConstraint returns [EObject current=null] : iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF ;
    public final EObject entryRuleOrExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpressionConstraint = null;


        try {
            // InternalEtlParser.g:2539:63: (iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF )
            // InternalEtlParser.g:2540:2: iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOrExpressionConstraint=ruleOrExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpressionConstraint"


    // $ANTLR start "ruleOrExpressionConstraint"
    // InternalEtlParser.g:2546:1: ruleOrExpressionConstraint returns [EObject current=null] : (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* ) ;
    public final EObject ruleOrExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_KEYWORD_2=null;
        EObject this_AndExpressionConstraint_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2552:2: ( (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* ) )
            // InternalEtlParser.g:2553:2: (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* )
            {
            // InternalEtlParser.g:2553:2: (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* )
            // InternalEtlParser.g:2554:3: this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getAndExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_38);
            this_AndExpressionConstraint_0=ruleAndExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEtlParser.g:2565:3: ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_DISJUNCTION_KEYWORD) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalEtlParser.g:2566:4: () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndExpressionConstraint ) )
            	    {
            	    // InternalEtlParser.g:2566:4: ()
            	    // InternalEtlParser.g:2567:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_DISJUNCTION_KEYWORD_2=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalEtlParser.g:2580:4: ( (lv_right_3_0= ruleAndExpressionConstraint ) )
            	    // InternalEtlParser.g:2581:5: (lv_right_3_0= ruleAndExpressionConstraint )
            	    {
            	    // InternalEtlParser.g:2581:5: (lv_right_3_0= ruleAndExpressionConstraint )
            	    // InternalEtlParser.g:2582:6: lv_right_3_0= ruleAndExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_right_3_0=ruleAndExpressionConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.b2international.snomed.ecl.Ecl.AndExpressionConstraint");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // $ANTLR end "ruleOrExpressionConstraint"


    // $ANTLR start "entryRuleAndExpressionConstraint"
    // InternalEtlParser.g:2604:1: entryRuleAndExpressionConstraint returns [EObject current=null] : iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF ;
    public final EObject entryRuleAndExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpressionConstraint = null;


        try {
            // InternalEtlParser.g:2604:64: (iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF )
            // InternalEtlParser.g:2605:2: iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndExpressionConstraint=ruleAndExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpressionConstraint"


    // $ANTLR start "ruleAndExpressionConstraint"
    // InternalEtlParser.g:2611:1: ruleAndExpressionConstraint returns [EObject current=null] : (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* ) ;
    public final EObject ruleAndExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_KEYWORD_2=null;
        Token this_COMMA_3=null;
        EObject this_ExclusionExpressionConstraint_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2617:2: ( (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* ) )
            // InternalEtlParser.g:2618:2: (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* )
            {
            // InternalEtlParser.g:2618:2: (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* )
            // InternalEtlParser.g:2619:3: this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_39);
            this_ExclusionExpressionConstraint_0=ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExclusionExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEtlParser.g:2630:3: ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_CONJUNCTION_KEYWORD||LA52_0==RULE_COMMA) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalEtlParser.g:2631:4: () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) )
            	    {
            	    // InternalEtlParser.g:2631:4: ()
            	    // InternalEtlParser.g:2632:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalEtlParser.g:2641:4: (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA )
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==RULE_CONJUNCTION_KEYWORD) ) {
            	        alt51=1;
            	    }
            	    else if ( (LA51_0==RULE_COMMA) ) {
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
            	            // InternalEtlParser.g:2642:5: this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD
            	            {
            	            this_CONJUNCTION_KEYWORD_2=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEtlParser.g:2647:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEtlParser.g:2652:4: ( (lv_right_4_0= ruleExclusionExpressionConstraint ) )
            	    // InternalEtlParser.g:2653:5: (lv_right_4_0= ruleExclusionExpressionConstraint )
            	    {
            	    // InternalEtlParser.g:2653:5: (lv_right_4_0= ruleExclusionExpressionConstraint )
            	    // InternalEtlParser.g:2654:6: lv_right_4_0= ruleExclusionExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_39);
            	    lv_right_4_0=ruleExclusionExpressionConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_4_0,
            	      							"com.b2international.snomed.ecl.Ecl.ExclusionExpressionConstraint");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // $ANTLR end "ruleAndExpressionConstraint"


    // $ANTLR start "entryRuleExclusionExpressionConstraint"
    // InternalEtlParser.g:2676:1: entryRuleExclusionExpressionConstraint returns [EObject current=null] : iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF ;
    public final EObject entryRuleExclusionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusionExpressionConstraint = null;


        try {
            // InternalEtlParser.g:2676:70: (iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF )
            // InternalEtlParser.g:2677:2: iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExclusionExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExclusionExpressionConstraint=ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExclusionExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExclusionExpressionConstraint"


    // $ANTLR start "ruleExclusionExpressionConstraint"
    // InternalEtlParser.g:2683:1: ruleExclusionExpressionConstraint returns [EObject current=null] : (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_KEYWORD_2= RULE_EXCLUSION_KEYWORD ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? ) ;
    public final EObject ruleExclusionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_EXCLUSION_KEYWORD_2=null;
        EObject this_RefinedExpressionConstraint_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2689:2: ( (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_KEYWORD_2= RULE_EXCLUSION_KEYWORD ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? ) )
            // InternalEtlParser.g:2690:2: (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_KEYWORD_2= RULE_EXCLUSION_KEYWORD ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? )
            {
            // InternalEtlParser.g:2690:2: (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_KEYWORD_2= RULE_EXCLUSION_KEYWORD ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? )
            // InternalEtlParser.g:2691:3: this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_KEYWORD_2= RULE_EXCLUSION_KEYWORD ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_40);
            this_RefinedExpressionConstraint_0=ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RefinedExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEtlParser.g:2702:3: ( () this_EXCLUSION_KEYWORD_2= RULE_EXCLUSION_KEYWORD ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_EXCLUSION_KEYWORD) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalEtlParser.g:2703:4: () this_EXCLUSION_KEYWORD_2= RULE_EXCLUSION_KEYWORD ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
                    {
                    // InternalEtlParser.g:2703:4: ()
                    // InternalEtlParser.g:2704:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    this_EXCLUSION_KEYWORD_2=(Token)match(input,RULE_EXCLUSION_KEYWORD,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_EXCLUSION_KEYWORD_2, grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSION_KEYWORDTerminalRuleCall_1_1());
                      			
                    }
                    // InternalEtlParser.g:2717:4: ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
                    // InternalEtlParser.g:2718:5: (lv_right_3_0= ruleRefinedExpressionConstraint )
                    {
                    // InternalEtlParser.g:2718:5: (lv_right_3_0= ruleRefinedExpressionConstraint )
                    // InternalEtlParser.g:2719:6: lv_right_3_0= ruleRefinedExpressionConstraint
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=ruleRefinedExpressionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExclusionExpressionConstraintRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"com.b2international.snomed.ecl.Ecl.RefinedExpressionConstraint");
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
    // $ANTLR end "ruleExclusionExpressionConstraint"


    // $ANTLR start "entryRuleRefinedExpressionConstraint"
    // InternalEtlParser.g:2741:1: entryRuleRefinedExpressionConstraint returns [EObject current=null] : iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF ;
    public final EObject entryRuleRefinedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinedExpressionConstraint = null;


        try {
            // InternalEtlParser.g:2741:68: (iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF )
            // InternalEtlParser.g:2742:2: iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefinedExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRefinedExpressionConstraint=ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefinedExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefinedExpressionConstraint"


    // $ANTLR start "ruleRefinedExpressionConstraint"
    // InternalEtlParser.g:2748:1: ruleRefinedExpressionConstraint returns [EObject current=null] : (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? ) ;
    public final EObject ruleRefinedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_COLON_2=null;
        EObject this_DottedExpressionConstraint_0 = null;

        EObject lv_refinement_3_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2754:2: ( (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? ) )
            // InternalEtlParser.g:2755:2: (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? )
            {
            // InternalEtlParser.g:2755:2: (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? )
            // InternalEtlParser.g:2756:3: this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRefinedExpressionConstraintAccess().getDottedExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_41);
            this_DottedExpressionConstraint_0=ruleDottedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DottedExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEtlParser.g:2767:3: ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_COLON) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalEtlParser.g:2768:4: () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) )
                    {
                    // InternalEtlParser.g:2768:4: ()
                    // InternalEtlParser.g:2769:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0(),
                      						current);
                      				
                    }

                    }

                    this_COLON_2=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_COLON_2, grammarAccess.getRefinedExpressionConstraintAccess().getCOLONTerminalRuleCall_1_1());
                      			
                    }
                    // InternalEtlParser.g:2782:4: ( (lv_refinement_3_0= ruleEclRefinement ) )
                    // InternalEtlParser.g:2783:5: (lv_refinement_3_0= ruleEclRefinement )
                    {
                    // InternalEtlParser.g:2783:5: (lv_refinement_3_0= ruleEclRefinement )
                    // InternalEtlParser.g:2784:6: lv_refinement_3_0= ruleEclRefinement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementEclRefinementParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_refinement_3_0=ruleEclRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRefinedExpressionConstraintRule());
                      						}
                      						set(
                      							current,
                      							"refinement",
                      							lv_refinement_3_0,
                      							"com.b2international.snomed.ecl.Ecl.EclRefinement");
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
    // $ANTLR end "ruleRefinedExpressionConstraint"


    // $ANTLR start "entryRuleDottedExpressionConstraint"
    // InternalEtlParser.g:2806:1: entryRuleDottedExpressionConstraint returns [EObject current=null] : iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF ;
    public final EObject entryRuleDottedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDottedExpressionConstraint = null;


        try {
            // InternalEtlParser.g:2806:67: (iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF )
            // InternalEtlParser.g:2807:2: iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDottedExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDottedExpressionConstraint=ruleDottedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDottedExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDottedExpressionConstraint"


    // $ANTLR start "ruleDottedExpressionConstraint"
    // InternalEtlParser.g:2813:1: ruleDottedExpressionConstraint returns [EObject current=null] : (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )* ) ;
    public final EObject ruleDottedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DOT_2=null;
        EObject this_FilteredExpressionConstraint_0 = null;

        EObject lv_attribute_3_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2819:2: ( (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )* ) )
            // InternalEtlParser.g:2820:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )* )
            {
            // InternalEtlParser.g:2820:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )* )
            // InternalEtlParser.g:2821:3: this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getFilteredExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_43);
            this_FilteredExpressionConstraint_0=ruleFilteredExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_FilteredExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEtlParser.g:2832:3: ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_DOT) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalEtlParser.g:2833:4: () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) )
            	    {
            	    // InternalEtlParser.g:2833:4: ()
            	    // InternalEtlParser.g:2834:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_DOT_2=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DOT_2, grammarAccess.getDottedExpressionConstraintAccess().getDOTTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalEtlParser.g:2847:4: ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) )
            	    // InternalEtlParser.g:2848:5: (lv_attribute_3_0= ruleFilteredExpressionConstraint )
            	    {
            	    // InternalEtlParser.g:2848:5: (lv_attribute_3_0= ruleFilteredExpressionConstraint )
            	    // InternalEtlParser.g:2849:6: lv_attribute_3_0= ruleFilteredExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_43);
            	    lv_attribute_3_0=ruleFilteredExpressionConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDottedExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"attribute",
            	      							lv_attribute_3_0,
            	      							"com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // $ANTLR end "ruleDottedExpressionConstraint"


    // $ANTLR start "entryRuleFilteredExpressionConstraint"
    // InternalEtlParser.g:2871:1: entryRuleFilteredExpressionConstraint returns [EObject current=null] : iv_ruleFilteredExpressionConstraint= ruleFilteredExpressionConstraint EOF ;
    public final EObject entryRuleFilteredExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilteredExpressionConstraint = null;


        try {
            // InternalEtlParser.g:2871:69: (iv_ruleFilteredExpressionConstraint= ruleFilteredExpressionConstraint EOF )
            // InternalEtlParser.g:2872:2: iv_ruleFilteredExpressionConstraint= ruleFilteredExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilteredExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFilteredExpressionConstraint=ruleFilteredExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilteredExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFilteredExpressionConstraint"


    // $ANTLR start "ruleFilteredExpressionConstraint"
    // InternalEtlParser.g:2878:1: ruleFilteredExpressionConstraint returns [EObject current=null] : (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* ) ;
    public final EObject ruleFilteredExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpressionConstraint_0 = null;

        EObject lv_filter_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2884:2: ( (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* ) )
            // InternalEtlParser.g:2885:2: (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* )
            {
            // InternalEtlParser.g:2885:2: (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* )
            // InternalEtlParser.g:2886:3: this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFilteredExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_44);
            this_SubExpressionConstraint_0=ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEtlParser.g:2897:3: ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_DOUBLE_CURLY_OPEN) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalEtlParser.g:2898:4: () ( (lv_filter_2_0= ruleFilterConstraint ) )
            	    {
            	    // InternalEtlParser.g:2898:4: ()
            	    // InternalEtlParser.g:2899:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getFilteredExpressionConstraintAccess().getFilteredExpressionConstraintConstraintAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalEtlParser.g:2908:4: ( (lv_filter_2_0= ruleFilterConstraint ) )
            	    // InternalEtlParser.g:2909:5: (lv_filter_2_0= ruleFilterConstraint )
            	    {
            	    // InternalEtlParser.g:2909:5: (lv_filter_2_0= ruleFilterConstraint )
            	    // InternalEtlParser.g:2910:6: lv_filter_2_0= ruleFilterConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFilteredExpressionConstraintAccess().getFilterFilterConstraintParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    lv_filter_2_0=ruleFilterConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFilteredExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"filter",
            	      							lv_filter_2_0,
            	      							"com.b2international.snomed.ecl.Ecl.FilterConstraint");
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
    // $ANTLR end "ruleFilteredExpressionConstraint"


    // $ANTLR start "entryRuleSubExpressionConstraint"
    // InternalEtlParser.g:2932:1: entryRuleSubExpressionConstraint returns [EObject current=null] : iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF ;
    public final EObject entryRuleSubExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpressionConstraint = null;


        try {
            // InternalEtlParser.g:2932:64: (iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF )
            // InternalEtlParser.g:2933:2: iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubExpressionConstraint=ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubExpressionConstraint"


    // $ANTLR start "ruleSubExpressionConstraint"
    // InternalEtlParser.g:2939:1: ruleSubExpressionConstraint returns [EObject current=null] : (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept ) ;
    public final EObject ruleSubExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ChildOf_0 = null;

        EObject this_ChildOrSelfOf_1 = null;

        EObject this_DescendantOf_2 = null;

        EObject this_DescendantOrSelfOf_3 = null;

        EObject this_ParentOf_4 = null;

        EObject this_ParentOrSelfOf_5 = null;

        EObject this_AncestorOf_6 = null;

        EObject this_AncestorOrSelfOf_7 = null;

        EObject this_EclFocusConcept_8 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:2945:2: ( (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept ) )
            // InternalEtlParser.g:2946:2: (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept )
            {
            // InternalEtlParser.g:2946:2: (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept )
            int alt57=9;
            switch ( input.LA(1) ) {
            case RULE_LT_EM:
                {
                alt57=1;
                }
                break;
            case RULE_DBL_LT_EM:
                {
                alt57=2;
                }
                break;
            case RULE_LT:
                {
                alt57=3;
                }
                break;
            case RULE_DBL_LT:
                {
                alt57=4;
                }
                break;
            case RULE_GT_EM:
                {
                alt57=5;
                }
                break;
            case RULE_DBL_GT_EM:
                {
                alt57=6;
                }
                break;
            case RULE_GT:
                {
                alt57=7;
                }
                break;
            case RULE_DBL_GT:
                {
                alt57=8;
                }
                break;
            case RULE_DIGIT_ZERO:
            case RULE_DIGIT_NONZERO:
            case RULE_ROUND_OPEN:
            case RULE_CARET:
            case RULE_WILDCARD:
                {
                alt57=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalEtlParser.g:2947:3: this_ChildOf_0= ruleChildOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getChildOfParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ChildOf_0=ruleChildOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ChildOf_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:2959:3: this_ChildOrSelfOf_1= ruleChildOrSelfOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getChildOrSelfOfParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ChildOrSelfOf_1=ruleChildOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ChildOrSelfOf_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEtlParser.g:2971:3: this_DescendantOf_2= ruleDescendantOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DescendantOf_2=ruleDescendantOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DescendantOf_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEtlParser.g:2983:3: this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DescendantOrSelfOf_3=ruleDescendantOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DescendantOrSelfOf_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEtlParser.g:2995:3: this_ParentOf_4= ruleParentOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParentOf_4=ruleParentOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParentOf_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEtlParser.g:3007:3: this_ParentOrSelfOf_5= ruleParentOrSelfOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getParentOrSelfOfParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParentOrSelfOf_5=ruleParentOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParentOrSelfOf_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEtlParser.g:3019:3: this_AncestorOf_6= ruleAncestorOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AncestorOf_6=ruleAncestorOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AncestorOf_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEtlParser.g:3031:3: this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AncestorOrSelfOf_7=ruleAncestorOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AncestorOrSelfOf_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEtlParser.g:3043:3: this_EclFocusConcept_8= ruleEclFocusConcept
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EclFocusConcept_8=ruleEclFocusConcept();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EclFocusConcept_8;
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
    // $ANTLR end "ruleSubExpressionConstraint"


    // $ANTLR start "entryRuleEclFocusConcept"
    // InternalEtlParser.g:3058:1: entryRuleEclFocusConcept returns [EObject current=null] : iv_ruleEclFocusConcept= ruleEclFocusConcept EOF ;
    public final EObject entryRuleEclFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclFocusConcept = null;


        try {
            // InternalEtlParser.g:3058:56: (iv_ruleEclFocusConcept= ruleEclFocusConcept EOF )
            // InternalEtlParser.g:3059:2: iv_ruleEclFocusConcept= ruleEclFocusConcept EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclFocusConceptRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclFocusConcept=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclFocusConcept; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEclFocusConcept"


    // $ANTLR start "ruleEclFocusConcept"
    // InternalEtlParser.g:3065:1: ruleEclFocusConcept returns [EObject current=null] : (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression ) ;
    public final EObject ruleEclFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject this_MemberOf_0 = null;

        EObject this_EclConceptReference_1 = null;

        EObject this_Any_2 = null;

        EObject this_NestedExpression_3 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3071:2: ( (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression ) )
            // InternalEtlParser.g:3072:2: (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression )
            {
            // InternalEtlParser.g:3072:2: (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression )
            int alt58=4;
            switch ( input.LA(1) ) {
            case RULE_CARET:
                {
                alt58=1;
                }
                break;
            case RULE_DIGIT_ZERO:
            case RULE_DIGIT_NONZERO:
                {
                alt58=2;
                }
                break;
            case RULE_WILDCARD:
                {
                alt58=3;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt58=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalEtlParser.g:3073:3: this_MemberOf_0= ruleMemberOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getMemberOfParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MemberOf_0=ruleMemberOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MemberOf_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:3085:3: this_EclConceptReference_1= ruleEclConceptReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getEclConceptReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EclConceptReference_1=ruleEclConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EclConceptReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEtlParser.g:3097:3: this_Any_2= ruleAny
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getAnyParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Any_2=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Any_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEtlParser.g:3109:3: this_NestedExpression_3= ruleNestedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedExpression_3=ruleNestedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedExpression_3;
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
    // $ANTLR end "ruleEclFocusConcept"


    // $ANTLR start "entryRuleChildOf"
    // InternalEtlParser.g:3124:1: entryRuleChildOf returns [EObject current=null] : iv_ruleChildOf= ruleChildOf EOF ;
    public final EObject entryRuleChildOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildOf = null;


        try {
            // InternalEtlParser.g:3124:48: (iv_ruleChildOf= ruleChildOf EOF )
            // InternalEtlParser.g:3125:2: iv_ruleChildOf= ruleChildOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChildOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChildOf=ruleChildOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChildOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChildOf"


    // $ANTLR start "ruleChildOf"
    // InternalEtlParser.g:3131:1: ruleChildOf returns [EObject current=null] : (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleChildOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3137:2: ( (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEtlParser.g:3138:2: (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEtlParser.g:3138:2: (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEtlParser.g:3139:3: this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_LT_EM_0=(Token)match(input,RULE_LT_EM,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LT_EM_0, grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:3143:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEtlParser.g:3144:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEtlParser.g:3144:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEtlParser.g:3145:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChildOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getChildOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
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
    // $ANTLR end "ruleChildOf"


    // $ANTLR start "entryRuleChildOrSelfOf"
    // InternalEtlParser.g:3166:1: entryRuleChildOrSelfOf returns [EObject current=null] : iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF ;
    public final EObject entryRuleChildOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildOrSelfOf = null;


        try {
            // InternalEtlParser.g:3166:54: (iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF )
            // InternalEtlParser.g:3167:2: iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChildOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChildOrSelfOf=ruleChildOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChildOrSelfOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChildOrSelfOf"


    // $ANTLR start "ruleChildOrSelfOf"
    // InternalEtlParser.g:3173:1: ruleChildOrSelfOf returns [EObject current=null] : (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleChildOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_LT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3179:2: ( (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEtlParser.g:3180:2: (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEtlParser.g:3180:2: (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEtlParser.g:3181:3: this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_LT_EM_0=(Token)match(input,RULE_DBL_LT_EM,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_LT_EM_0, grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:3185:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEtlParser.g:3186:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEtlParser.g:3186:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEtlParser.g:3187:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChildOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getChildOrSelfOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
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
    // $ANTLR end "ruleChildOrSelfOf"


    // $ANTLR start "entryRuleDescendantOf"
    // InternalEtlParser.g:3208:1: entryRuleDescendantOf returns [EObject current=null] : iv_ruleDescendantOf= ruleDescendantOf EOF ;
    public final EObject entryRuleDescendantOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendantOf = null;


        try {
            // InternalEtlParser.g:3208:53: (iv_ruleDescendantOf= ruleDescendantOf EOF )
            // InternalEtlParser.g:3209:2: iv_ruleDescendantOf= ruleDescendantOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDescendantOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDescendantOf=ruleDescendantOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDescendantOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDescendantOf"


    // $ANTLR start "ruleDescendantOf"
    // InternalEtlParser.g:3215:1: ruleDescendantOf returns [EObject current=null] : (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleDescendantOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3221:2: ( (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEtlParser.g:3222:2: (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEtlParser.g:3222:2: (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEtlParser.g:3223:3: this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_LT_0=(Token)match(input,RULE_LT,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LT_0, grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:3227:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEtlParser.g:3228:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEtlParser.g:3228:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEtlParser.g:3229:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDescendantOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDescendantOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
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
    // $ANTLR end "ruleDescendantOf"


    // $ANTLR start "entryRuleDescendantOrSelfOf"
    // InternalEtlParser.g:3250:1: entryRuleDescendantOrSelfOf returns [EObject current=null] : iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF ;
    public final EObject entryRuleDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendantOrSelfOf = null;


        try {
            // InternalEtlParser.g:3250:59: (iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF )
            // InternalEtlParser.g:3251:2: iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDescendantOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDescendantOrSelfOf=ruleDescendantOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDescendantOrSelfOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDescendantOrSelfOf"


    // $ANTLR start "ruleDescendantOrSelfOf"
    // InternalEtlParser.g:3257:1: ruleDescendantOrSelfOf returns [EObject current=null] : (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_LT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3263:2: ( (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEtlParser.g:3264:2: (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEtlParser.g:3264:2: (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEtlParser.g:3265:3: this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_LT_0=(Token)match(input,RULE_DBL_LT,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_LT_0, grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:3269:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEtlParser.g:3270:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEtlParser.g:3270:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEtlParser.g:3271:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDescendantOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDescendantOrSelfOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
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
    // $ANTLR end "ruleDescendantOrSelfOf"


    // $ANTLR start "entryRuleParentOf"
    // InternalEtlParser.g:3292:1: entryRuleParentOf returns [EObject current=null] : iv_ruleParentOf= ruleParentOf EOF ;
    public final EObject entryRuleParentOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentOf = null;


        try {
            // InternalEtlParser.g:3292:49: (iv_ruleParentOf= ruleParentOf EOF )
            // InternalEtlParser.g:3293:2: iv_ruleParentOf= ruleParentOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParentOf=ruleParentOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParentOf"


    // $ANTLR start "ruleParentOf"
    // InternalEtlParser.g:3299:1: ruleParentOf returns [EObject current=null] : (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleParentOf() throws RecognitionException {
        EObject current = null;

        Token this_GT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3305:2: ( (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEtlParser.g:3306:2: (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEtlParser.g:3306:2: (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEtlParser.g:3307:3: this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_GT_EM_0=(Token)match(input,RULE_GT_EM,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GT_EM_0, grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:3311:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEtlParser.g:3312:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEtlParser.g:3312:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEtlParser.g:3313:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParentOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParentOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
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
    // $ANTLR end "ruleParentOf"


    // $ANTLR start "entryRuleParentOrSelfOf"
    // InternalEtlParser.g:3334:1: entryRuleParentOrSelfOf returns [EObject current=null] : iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF ;
    public final EObject entryRuleParentOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentOrSelfOf = null;


        try {
            // InternalEtlParser.g:3334:55: (iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF )
            // InternalEtlParser.g:3335:2: iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParentOrSelfOf=ruleParentOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentOrSelfOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParentOrSelfOf"


    // $ANTLR start "ruleParentOrSelfOf"
    // InternalEtlParser.g:3341:1: ruleParentOrSelfOf returns [EObject current=null] : (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleParentOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_GT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3347:2: ( (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEtlParser.g:3348:2: (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEtlParser.g:3348:2: (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEtlParser.g:3349:3: this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_GT_EM_0=(Token)match(input,RULE_DBL_GT_EM,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_GT_EM_0, grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:3353:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEtlParser.g:3354:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEtlParser.g:3354:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEtlParser.g:3355:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParentOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParentOrSelfOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
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
    // $ANTLR end "ruleParentOrSelfOf"


    // $ANTLR start "entryRuleAncestorOf"
    // InternalEtlParser.g:3376:1: entryRuleAncestorOf returns [EObject current=null] : iv_ruleAncestorOf= ruleAncestorOf EOF ;
    public final EObject entryRuleAncestorOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncestorOf = null;


        try {
            // InternalEtlParser.g:3376:51: (iv_ruleAncestorOf= ruleAncestorOf EOF )
            // InternalEtlParser.g:3377:2: iv_ruleAncestorOf= ruleAncestorOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAncestorOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAncestorOf=ruleAncestorOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAncestorOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAncestorOf"


    // $ANTLR start "ruleAncestorOf"
    // InternalEtlParser.g:3383:1: ruleAncestorOf returns [EObject current=null] : (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleAncestorOf() throws RecognitionException {
        EObject current = null;

        Token this_GT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3389:2: ( (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEtlParser.g:3390:2: (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEtlParser.g:3390:2: (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEtlParser.g:3391:3: this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_GT_0=(Token)match(input,RULE_GT,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GT_0, grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:3395:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEtlParser.g:3396:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEtlParser.g:3396:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEtlParser.g:3397:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAncestorOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAncestorOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
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
    // $ANTLR end "ruleAncestorOf"


    // $ANTLR start "entryRuleAncestorOrSelfOf"
    // InternalEtlParser.g:3418:1: entryRuleAncestorOrSelfOf returns [EObject current=null] : iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF ;
    public final EObject entryRuleAncestorOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncestorOrSelfOf = null;


        try {
            // InternalEtlParser.g:3418:57: (iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF )
            // InternalEtlParser.g:3419:2: iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAncestorOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAncestorOrSelfOf=ruleAncestorOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAncestorOrSelfOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAncestorOrSelfOf"


    // $ANTLR start "ruleAncestorOrSelfOf"
    // InternalEtlParser.g:3425:1: ruleAncestorOrSelfOf returns [EObject current=null] : (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleAncestorOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_GT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3431:2: ( (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEtlParser.g:3432:2: (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEtlParser.g:3432:2: (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEtlParser.g:3433:3: this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_GT_0=(Token)match(input,RULE_DBL_GT,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_GT_0, grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:3437:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEtlParser.g:3438:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEtlParser.g:3438:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEtlParser.g:3439:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAncestorOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAncestorOrSelfOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
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
    // $ANTLR end "ruleAncestorOrSelfOf"


    // $ANTLR start "entryRuleMemberOf"
    // InternalEtlParser.g:3460:1: entryRuleMemberOf returns [EObject current=null] : iv_ruleMemberOf= ruleMemberOf EOF ;
    public final EObject entryRuleMemberOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberOf = null;


        try {
            // InternalEtlParser.g:3460:49: (iv_ruleMemberOf= ruleMemberOf EOF )
            // InternalEtlParser.g:3461:2: iv_ruleMemberOf= ruleMemberOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMemberOf=ruleMemberOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMemberOf"


    // $ANTLR start "ruleMemberOf"
    // InternalEtlParser.g:3467:1: ruleMemberOf returns [EObject current=null] : (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) ) ;
    public final EObject ruleMemberOf() throws RecognitionException {
        EObject current = null;

        Token this_CARET_0=null;
        EObject lv_constraint_1_1 = null;

        EObject lv_constraint_1_2 = null;

        EObject lv_constraint_1_3 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3473:2: ( (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) ) )
            // InternalEtlParser.g:3474:2: (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) )
            {
            // InternalEtlParser.g:3474:2: (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) )
            // InternalEtlParser.g:3475:3: this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) )
            {
            this_CARET_0=(Token)match(input,RULE_CARET,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CARET_0, grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:3479:3: ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) )
            // InternalEtlParser.g:3480:4: ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) )
            {
            // InternalEtlParser.g:3480:4: ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) )
            // InternalEtlParser.g:3481:5: (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression )
            {
            // InternalEtlParser.g:3481:5: (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression )
            int alt59=3;
            switch ( input.LA(1) ) {
            case RULE_DIGIT_ZERO:
            case RULE_DIGIT_NONZERO:
                {
                alt59=1;
                }
                break;
            case RULE_WILDCARD:
                {
                alt59=2;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalEtlParser.g:3482:6: lv_constraint_1_1= ruleEclConceptReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_1_1=ruleEclConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_1_1,
                      							"com.b2international.snomed.ecl.Ecl.EclConceptReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:3498:6: lv_constraint_1_2= ruleAny
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_1_2=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_1_2,
                      							"com.b2international.snomed.ecl.Ecl.Any");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalEtlParser.g:3514:6: lv_constraint_1_3= ruleNestedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_1_0_2());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_1_3=ruleNestedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_1_3,
                      							"com.b2international.snomed.ecl.Ecl.NestedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

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
    // $ANTLR end "ruleMemberOf"


    // $ANTLR start "entryRuleEclConceptReference"
    // InternalEtlParser.g:3536:1: entryRuleEclConceptReference returns [EObject current=null] : iv_ruleEclConceptReference= ruleEclConceptReference EOF ;
    public final EObject entryRuleEclConceptReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclConceptReference = null;


        try {
            // InternalEtlParser.g:3536:60: (iv_ruleEclConceptReference= ruleEclConceptReference EOF )
            // InternalEtlParser.g:3537:2: iv_ruleEclConceptReference= ruleEclConceptReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclConceptReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclConceptReference=ruleEclConceptReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclConceptReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEclConceptReference"


    // $ANTLR start "ruleEclConceptReference"
    // InternalEtlParser.g:3543:1: ruleEclConceptReference returns [EObject current=null] : ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )? ) ;
    public final EObject ruleEclConceptReference() throws RecognitionException {
        EObject current = null;

        Token lv_term_1_0=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3549:2: ( ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )? ) )
            // InternalEtlParser.g:3550:2: ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )? )
            {
            // InternalEtlParser.g:3550:2: ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )? )
            // InternalEtlParser.g:3551:3: ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )?
            {
            // InternalEtlParser.g:3551:3: ( (lv_id_0_0= ruleSnomedIdentifier ) )
            // InternalEtlParser.g:3552:4: (lv_id_0_0= ruleSnomedIdentifier )
            {
            // InternalEtlParser.g:3552:4: (lv_id_0_0= ruleSnomedIdentifier )
            // InternalEtlParser.g:3553:5: lv_id_0_0= ruleSnomedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEclConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_33);
            lv_id_0_0=ruleSnomedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEclConceptReferenceRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_0_0,
              						"com.b2international.snomed.ecl.Ecl.SnomedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:3570:3: ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_PIPE_DELIMITED_STRING) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalEtlParser.g:3571:4: (lv_term_1_0= RULE_PIPE_DELIMITED_STRING )
                    {
                    // InternalEtlParser.g:3571:4: (lv_term_1_0= RULE_PIPE_DELIMITED_STRING )
                    // InternalEtlParser.g:3572:5: lv_term_1_0= RULE_PIPE_DELIMITED_STRING
                    {
                    lv_term_1_0=(Token)match(input,RULE_PIPE_DELIMITED_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_term_1_0, grammarAccess.getEclConceptReferenceAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEclConceptReferenceRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"term",
                      						lv_term_1_0,
                      						"com.b2international.snomed.ecl.Ecl.PIPE_DELIMITED_STRING");
                      				
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
    // $ANTLR end "ruleEclConceptReference"


    // $ANTLR start "entryRuleEclConceptReferenceSet"
    // InternalEtlParser.g:3592:1: entryRuleEclConceptReferenceSet returns [EObject current=null] : iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF ;
    public final EObject entryRuleEclConceptReferenceSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclConceptReferenceSet = null;


        try {
            // InternalEtlParser.g:3592:63: (iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF )
            // InternalEtlParser.g:3593:2: iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclConceptReferenceSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclConceptReferenceSet=ruleEclConceptReferenceSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclConceptReferenceSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEclConceptReferenceSet"


    // $ANTLR start "ruleEclConceptReferenceSet"
    // InternalEtlParser.g:3599:1: ruleEclConceptReferenceSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleEclConceptReferenceSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_concepts_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3605:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEtlParser.g:3606:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEtlParser.g:3606:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEtlParser.g:3607:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getEclConceptReferenceSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:3611:3: ( (lv_concepts_1_0= ruleEclConceptReference ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=RULE_DIGIT_ZERO && LA61_0<=RULE_DIGIT_NONZERO)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalEtlParser.g:3612:4: (lv_concepts_1_0= ruleEclConceptReference )
            	    {
            	    // InternalEtlParser.g:3612:4: (lv_concepts_1_0= ruleEclConceptReference )
            	    // InternalEtlParser.g:3613:5: lv_concepts_1_0= ruleEclConceptReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEclConceptReferenceSetAccess().getConceptsEclConceptReferenceParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_45);
            	    lv_concepts_1_0=ruleEclConceptReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEclConceptReferenceSetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"concepts",
            	      						lv_concepts_1_0,
            	      						"com.b2international.snomed.ecl.Ecl.EclConceptReference");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getEclConceptReferenceSetAccess().getROUND_CLOSETerminalRuleCall_2());
              		
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
    // $ANTLR end "ruleEclConceptReferenceSet"


    // $ANTLR start "entryRuleAny"
    // InternalEtlParser.g:3638:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // InternalEtlParser.g:3638:44: (iv_ruleAny= ruleAny EOF )
            // InternalEtlParser.g:3639:2: iv_ruleAny= ruleAny EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAny=ruleAny();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAny; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // InternalEtlParser.g:3645:1: ruleAny returns [EObject current=null] : (this_WILDCARD_0= RULE_WILDCARD () ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token this_WILDCARD_0=null;


        	enterRule();

        try {
            // InternalEtlParser.g:3651:2: ( (this_WILDCARD_0= RULE_WILDCARD () ) )
            // InternalEtlParser.g:3652:2: (this_WILDCARD_0= RULE_WILDCARD () )
            {
            // InternalEtlParser.g:3652:2: (this_WILDCARD_0= RULE_WILDCARD () )
            // InternalEtlParser.g:3653:3: this_WILDCARD_0= RULE_WILDCARD ()
            {
            this_WILDCARD_0=(Token)match(input,RULE_WILDCARD,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_WILDCARD_0, grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:3657:3: ()
            // InternalEtlParser.g:3658:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAnyAccess().getAnyAction_1(),
              					current);
              			
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
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleEclRefinement"
    // InternalEtlParser.g:3671:1: entryRuleEclRefinement returns [EObject current=null] : iv_ruleEclRefinement= ruleEclRefinement EOF ;
    public final EObject entryRuleEclRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclRefinement = null;


        try {
            // InternalEtlParser.g:3671:54: (iv_ruleEclRefinement= ruleEclRefinement EOF )
            // InternalEtlParser.g:3672:2: iv_ruleEclRefinement= ruleEclRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclRefinement=ruleEclRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEclRefinement"


    // $ANTLR start "ruleEclRefinement"
    // InternalEtlParser.g:3678:1: ruleEclRefinement returns [EObject current=null] : this_OrRefinement_0= ruleOrRefinement ;
    public final EObject ruleEclRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_OrRefinement_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3684:2: (this_OrRefinement_0= ruleOrRefinement )
            // InternalEtlParser.g:3685:2: this_OrRefinement_0= ruleOrRefinement
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEclRefinementAccess().getOrRefinementParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_OrRefinement_0=ruleOrRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_OrRefinement_0;
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
    // $ANTLR end "ruleEclRefinement"


    // $ANTLR start "entryRuleOrRefinement"
    // InternalEtlParser.g:3699:1: entryRuleOrRefinement returns [EObject current=null] : iv_ruleOrRefinement= ruleOrRefinement EOF ;
    public final EObject entryRuleOrRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrRefinement = null;


        try {
            // InternalEtlParser.g:3699:53: (iv_ruleOrRefinement= ruleOrRefinement EOF )
            // InternalEtlParser.g:3700:2: iv_ruleOrRefinement= ruleOrRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOrRefinement=ruleOrRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrRefinement"


    // $ANTLR start "ruleOrRefinement"
    // InternalEtlParser.g:3706:1: ruleOrRefinement returns [EObject current=null] : (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) ;
    public final EObject ruleOrRefinement() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_KEYWORD_2=null;
        EObject this_AndRefinement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3712:2: ( (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) )
            // InternalEtlParser.g:3713:2: (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            {
            // InternalEtlParser.g:3713:2: (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            // InternalEtlParser.g:3714:3: this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrRefinementAccess().getAndRefinementParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_38);
            this_AndRefinement_0=ruleAndRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndRefinement_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEtlParser.g:3725:3: ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_DISJUNCTION_KEYWORD) ) {
                    int LA62_4 = input.LA(2);

                    if ( (synpred94_InternalEtlParser()) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // InternalEtlParser.g:3726:4: ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    {
            	    // InternalEtlParser.g:3727:4: ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    // InternalEtlParser.g:3728:5: () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) )
            	    {
            	    // InternalEtlParser.g:3728:5: ()
            	    // InternalEtlParser.g:3729:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    this_DISJUNCTION_KEYWORD_2=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getOrRefinementAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_0_1());
            	      				
            	    }
            	    // InternalEtlParser.g:3742:5: ( (lv_right_3_0= ruleAndRefinement ) )
            	    // InternalEtlParser.g:3743:6: (lv_right_3_0= ruleAndRefinement )
            	    {
            	    // InternalEtlParser.g:3743:6: (lv_right_3_0= ruleAndRefinement )
            	    // InternalEtlParser.g:3744:7: lv_right_3_0= ruleAndRefinement
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_right_3_0=ruleAndRefinement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getOrRefinementRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"com.b2international.snomed.ecl.Ecl.AndRefinement");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // $ANTLR end "ruleOrRefinement"


    // $ANTLR start "entryRuleAndRefinement"
    // InternalEtlParser.g:3767:1: entryRuleAndRefinement returns [EObject current=null] : iv_ruleAndRefinement= ruleAndRefinement EOF ;
    public final EObject entryRuleAndRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndRefinement = null;


        try {
            // InternalEtlParser.g:3767:54: (iv_ruleAndRefinement= ruleAndRefinement EOF )
            // InternalEtlParser.g:3768:2: iv_ruleAndRefinement= ruleAndRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndRefinement=ruleAndRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndRefinement"


    // $ANTLR start "ruleAndRefinement"
    // InternalEtlParser.g:3774:1: ruleAndRefinement returns [EObject current=null] : (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* ) ;
    public final EObject ruleAndRefinement() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_KEYWORD_2=null;
        Token this_COMMA_3=null;
        EObject this_SubRefinement_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3780:2: ( (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* ) )
            // InternalEtlParser.g:3781:2: (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* )
            {
            // InternalEtlParser.g:3781:2: (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* )
            // InternalEtlParser.g:3782:3: this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndRefinementAccess().getSubRefinementParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_39);
            this_SubRefinement_0=ruleSubRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubRefinement_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEtlParser.g:3793:3: ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_CONJUNCTION_KEYWORD) ) {
                    int LA64_3 = input.LA(2);

                    if ( (synpred96_InternalEtlParser()) ) {
                        alt64=1;
                    }


                }
                else if ( (LA64_0==RULE_COMMA) ) {
                    int LA64_4 = input.LA(2);

                    if ( (synpred96_InternalEtlParser()) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // InternalEtlParser.g:3794:4: ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) )
            	    {
            	    // InternalEtlParser.g:3795:4: ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) )
            	    // InternalEtlParser.g:3796:5: () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) )
            	    {
            	    // InternalEtlParser.g:3796:5: ()
            	    // InternalEtlParser.g:3797:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalEtlParser.g:3806:5: (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA )
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==RULE_CONJUNCTION_KEYWORD) ) {
            	        alt63=1;
            	    }
            	    else if ( (LA63_0==RULE_COMMA) ) {
            	        alt63=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 63, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // InternalEtlParser.g:3807:6: this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD
            	            {
            	            this_CONJUNCTION_KEYWORD_2=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_42); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndRefinementAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0());
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEtlParser.g:3812:6: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_42); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_COMMA_3, grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEtlParser.g:3817:5: ( (lv_right_4_0= ruleSubRefinement ) )
            	    // InternalEtlParser.g:3818:6: (lv_right_4_0= ruleSubRefinement )
            	    {
            	    // InternalEtlParser.g:3818:6: (lv_right_4_0= ruleSubRefinement )
            	    // InternalEtlParser.g:3819:7: lv_right_4_0= ruleSubRefinement
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_39);
            	    lv_right_4_0=ruleSubRefinement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getAndRefinementRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_4_0,
            	      								"com.b2international.snomed.ecl.Ecl.SubRefinement");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
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
    // $ANTLR end "ruleAndRefinement"


    // $ANTLR start "entryRuleSubRefinement"
    // InternalEtlParser.g:3842:1: entryRuleSubRefinement returns [EObject current=null] : iv_ruleSubRefinement= ruleSubRefinement EOF ;
    public final EObject entryRuleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubRefinement = null;


        try {
            // InternalEtlParser.g:3842:54: (iv_ruleSubRefinement= ruleSubRefinement EOF )
            // InternalEtlParser.g:3843:2: iv_ruleSubRefinement= ruleSubRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubRefinement=ruleSubRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubRefinement"


    // $ANTLR start "ruleSubRefinement"
    // InternalEtlParser.g:3849:1: ruleSubRefinement returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) ;
    public final EObject ruleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_EclAttributeGroup_1 = null;

        EObject this_NestedRefinement_2 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3855:2: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) )
            // InternalEtlParser.g:3856:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            {
            // InternalEtlParser.g:3856:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            int alt65=3;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalEtlParser.g:3857:3: this_AttributeConstraint_0= ruleAttributeConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AttributeConstraint_0=ruleAttributeConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeConstraint_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:3869:3: this_EclAttributeGroup_1= ruleEclAttributeGroup
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubRefinementAccess().getEclAttributeGroupParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EclAttributeGroup_1=ruleEclAttributeGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EclAttributeGroup_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEtlParser.g:3881:3: this_NestedRefinement_2= ruleNestedRefinement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubRefinementAccess().getNestedRefinementParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedRefinement_2=ruleNestedRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedRefinement_2;
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
    // $ANTLR end "ruleSubRefinement"


    // $ANTLR start "entryRuleNestedRefinement"
    // InternalEtlParser.g:3896:1: entryRuleNestedRefinement returns [EObject current=null] : iv_ruleNestedRefinement= ruleNestedRefinement EOF ;
    public final EObject entryRuleNestedRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedRefinement = null;


        try {
            // InternalEtlParser.g:3896:57: (iv_ruleNestedRefinement= ruleNestedRefinement EOF )
            // InternalEtlParser.g:3897:2: iv_ruleNestedRefinement= ruleNestedRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedRefinement=ruleNestedRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedRefinement"


    // $ANTLR start "ruleNestedRefinement"
    // InternalEtlParser.g:3903:1: ruleNestedRefinement returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedRefinement() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3909:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEtlParser.g:3910:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEtlParser.g:3910:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEtlParser.g:3911:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:3915:3: ( (lv_nested_1_0= ruleEclRefinement ) )
            // InternalEtlParser.g:3916:4: (lv_nested_1_0= ruleEclRefinement )
            {
            // InternalEtlParser.g:3916:4: (lv_nested_1_0= ruleEclRefinement )
            // InternalEtlParser.g:3917:5: lv_nested_1_0= ruleEclRefinement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
            lv_nested_1_0=ruleEclRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedRefinementRule());
              					}
              					set(
              						current,
              						"nested",
              						lv_nested_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclRefinement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedRefinementAccess().getROUND_CLOSETerminalRuleCall_2());
              		
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
    // $ANTLR end "ruleNestedRefinement"


    // $ANTLR start "entryRuleEclAttributeGroup"
    // InternalEtlParser.g:3942:1: entryRuleEclAttributeGroup returns [EObject current=null] : iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF ;
    public final EObject entryRuleEclAttributeGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclAttributeGroup = null;


        try {
            // InternalEtlParser.g:3942:58: (iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF )
            // InternalEtlParser.g:3943:2: iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclAttributeGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclAttributeGroup=ruleEclAttributeGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclAttributeGroup; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEclAttributeGroup"


    // $ANTLR start "ruleEclAttributeGroup"
    // InternalEtlParser.g:3949:1: ruleEclAttributeGroup returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) ;
    public final EObject ruleEclAttributeGroup() throws RecognitionException {
        EObject current = null;

        Token this_CURLY_OPEN_1=null;
        Token this_CURLY_CLOSE_3=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_refinement_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:3955:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) )
            // InternalEtlParser.g:3956:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            {
            // InternalEtlParser.g:3956:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            // InternalEtlParser.g:3957:3: ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE
            {
            // InternalEtlParser.g:3957:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_SQUARE_OPEN) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalEtlParser.g:3958:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalEtlParser.g:3958:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalEtlParser.g:3959:5: lv_cardinality_0_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEclAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_cardinality_0_0=ruleCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEclAttributeGroupRule());
                      					}
                      					set(
                      						current,
                      						"cardinality",
                      						lv_cardinality_0_0,
                      						"com.b2international.snomed.ecl.Ecl.Cardinality");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            this_CURLY_OPEN_1=(Token)match(input,RULE_CURLY_OPEN,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CURLY_OPEN_1, grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:3980:3: ( (lv_refinement_2_0= ruleEclAttributeSet ) )
            // InternalEtlParser.g:3981:4: (lv_refinement_2_0= ruleEclAttributeSet )
            {
            // InternalEtlParser.g:3981:4: (lv_refinement_2_0= ruleEclAttributeSet )
            // InternalEtlParser.g:3982:5: lv_refinement_2_0= ruleEclAttributeSet
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
            lv_refinement_2_0=ruleEclAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEclAttributeGroupRule());
              					}
              					set(
              						current,
              						"refinement",
              						lv_refinement_2_0,
              						"com.b2international.snomed.ecl.Ecl.EclAttributeSet");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_CURLY_CLOSE_3=(Token)match(input,RULE_CURLY_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CURLY_CLOSE_3, grammarAccess.getEclAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3());
              		
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
    // $ANTLR end "ruleEclAttributeGroup"


    // $ANTLR start "entryRuleEclAttributeSet"
    // InternalEtlParser.g:4007:1: entryRuleEclAttributeSet returns [EObject current=null] : iv_ruleEclAttributeSet= ruleEclAttributeSet EOF ;
    public final EObject entryRuleEclAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclAttributeSet = null;


        try {
            // InternalEtlParser.g:4007:56: (iv_ruleEclAttributeSet= ruleEclAttributeSet EOF )
            // InternalEtlParser.g:4008:2: iv_ruleEclAttributeSet= ruleEclAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclAttributeSet=ruleEclAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEclAttributeSet"


    // $ANTLR start "ruleEclAttributeSet"
    // InternalEtlParser.g:4014:1: ruleEclAttributeSet returns [EObject current=null] : this_OrAttributeSet_0= ruleOrAttributeSet ;
    public final EObject ruleEclAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_OrAttributeSet_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4020:2: (this_OrAttributeSet_0= ruleOrAttributeSet )
            // InternalEtlParser.g:4021:2: this_OrAttributeSet_0= ruleOrAttributeSet
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEclAttributeSetAccess().getOrAttributeSetParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_OrAttributeSet_0=ruleOrAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_OrAttributeSet_0;
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
    // $ANTLR end "ruleEclAttributeSet"


    // $ANTLR start "entryRuleOrAttributeSet"
    // InternalEtlParser.g:4035:1: entryRuleOrAttributeSet returns [EObject current=null] : iv_ruleOrAttributeSet= ruleOrAttributeSet EOF ;
    public final EObject entryRuleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrAttributeSet = null;


        try {
            // InternalEtlParser.g:4035:55: (iv_ruleOrAttributeSet= ruleOrAttributeSet EOF )
            // InternalEtlParser.g:4036:2: iv_ruleOrAttributeSet= ruleOrAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOrAttributeSet=ruleOrAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrAttributeSet"


    // $ANTLR start "ruleOrAttributeSet"
    // InternalEtlParser.g:4042:1: ruleOrAttributeSet returns [EObject current=null] : (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) ;
    public final EObject ruleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_KEYWORD_2=null;
        EObject this_AndAttributeSet_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4048:2: ( (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) )
            // InternalEtlParser.g:4049:2: (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            {
            // InternalEtlParser.g:4049:2: (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            // InternalEtlParser.g:4050:3: this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAttributeSetAccess().getAndAttributeSetParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_38);
            this_AndAttributeSet_0=ruleAndAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndAttributeSet_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEtlParser.g:4061:3: ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_DISJUNCTION_KEYWORD) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalEtlParser.g:4062:4: () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    {
            	    // InternalEtlParser.g:4062:4: ()
            	    // InternalEtlParser.g:4063:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_DISJUNCTION_KEYWORD_2=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getOrAttributeSetAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalEtlParser.g:4076:4: ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    // InternalEtlParser.g:4077:5: (lv_right_3_0= ruleAndAttributeSet )
            	    {
            	    // InternalEtlParser.g:4077:5: (lv_right_3_0= ruleAndAttributeSet )
            	    // InternalEtlParser.g:4078:6: lv_right_3_0= ruleAndAttributeSet
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_right_3_0=ruleAndAttributeSet();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrAttributeSetRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.b2international.snomed.ecl.Ecl.AndAttributeSet");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
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
    // $ANTLR end "ruleOrAttributeSet"


    // $ANTLR start "entryRuleAndAttributeSet"
    // InternalEtlParser.g:4100:1: entryRuleAndAttributeSet returns [EObject current=null] : iv_ruleAndAttributeSet= ruleAndAttributeSet EOF ;
    public final EObject entryRuleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndAttributeSet = null;


        try {
            // InternalEtlParser.g:4100:56: (iv_ruleAndAttributeSet= ruleAndAttributeSet EOF )
            // InternalEtlParser.g:4101:2: iv_ruleAndAttributeSet= ruleAndAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndAttributeSet=ruleAndAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndAttributeSet"


    // $ANTLR start "ruleAndAttributeSet"
    // InternalEtlParser.g:4107:1: ruleAndAttributeSet returns [EObject current=null] : (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* ) ;
    public final EObject ruleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_KEYWORD_2=null;
        Token this_COMMA_3=null;
        EObject this_SubAttributeSet_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4113:2: ( (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* ) )
            // InternalEtlParser.g:4114:2: (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* )
            {
            // InternalEtlParser.g:4114:2: (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* )
            // InternalEtlParser.g:4115:3: this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAttributeSetAccess().getSubAttributeSetParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_39);
            this_SubAttributeSet_0=ruleSubAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubAttributeSet_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEtlParser.g:4126:3: ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_CONJUNCTION_KEYWORD||LA69_0==RULE_COMMA) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalEtlParser.g:4127:4: () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) )
            	    {
            	    // InternalEtlParser.g:4127:4: ()
            	    // InternalEtlParser.g:4128:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalEtlParser.g:4137:4: (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA )
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==RULE_CONJUNCTION_KEYWORD) ) {
            	        alt68=1;
            	    }
            	    else if ( (LA68_0==RULE_COMMA) ) {
            	        alt68=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 68, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // InternalEtlParser.g:4138:5: this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD
            	            {
            	            this_CONJUNCTION_KEYWORD_2=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndAttributeSetAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEtlParser.g:4143:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEtlParser.g:4148:4: ( (lv_right_4_0= ruleSubAttributeSet ) )
            	    // InternalEtlParser.g:4149:5: (lv_right_4_0= ruleSubAttributeSet )
            	    {
            	    // InternalEtlParser.g:4149:5: (lv_right_4_0= ruleSubAttributeSet )
            	    // InternalEtlParser.g:4150:6: lv_right_4_0= ruleSubAttributeSet
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_39);
            	    lv_right_4_0=ruleSubAttributeSet();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndAttributeSetRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_4_0,
            	      							"com.b2international.snomed.ecl.Ecl.SubAttributeSet");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
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
    // $ANTLR end "ruleAndAttributeSet"


    // $ANTLR start "entryRuleSubAttributeSet"
    // InternalEtlParser.g:4172:1: entryRuleSubAttributeSet returns [EObject current=null] : iv_ruleSubAttributeSet= ruleSubAttributeSet EOF ;
    public final EObject entryRuleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAttributeSet = null;


        try {
            // InternalEtlParser.g:4172:56: (iv_ruleSubAttributeSet= ruleSubAttributeSet EOF )
            // InternalEtlParser.g:4173:2: iv_ruleSubAttributeSet= ruleSubAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubAttributeSet=ruleSubAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubAttributeSet"


    // $ANTLR start "ruleSubAttributeSet"
    // InternalEtlParser.g:4179:1: ruleSubAttributeSet returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) ;
    public final EObject ruleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_NestedAttributeSet_1 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4185:2: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) )
            // InternalEtlParser.g:4186:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            {
            // InternalEtlParser.g:4186:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // InternalEtlParser.g:4187:3: this_AttributeConstraint_0= ruleAttributeConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AttributeConstraint_0=ruleAttributeConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeConstraint_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:4199:3: this_NestedAttributeSet_1= ruleNestedAttributeSet
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubAttributeSetAccess().getNestedAttributeSetParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedAttributeSet_1=ruleNestedAttributeSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedAttributeSet_1;
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
    // $ANTLR end "ruleSubAttributeSet"


    // $ANTLR start "entryRuleNestedAttributeSet"
    // InternalEtlParser.g:4214:1: entryRuleNestedAttributeSet returns [EObject current=null] : iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF ;
    public final EObject entryRuleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedAttributeSet = null;


        try {
            // InternalEtlParser.g:4214:59: (iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF )
            // InternalEtlParser.g:4215:2: iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedAttributeSet=ruleNestedAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedAttributeSet"


    // $ANTLR start "ruleNestedAttributeSet"
    // InternalEtlParser.g:4221:1: ruleNestedAttributeSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4227:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEtlParser.g:4228:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEtlParser.g:4228:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEtlParser.g:4229:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:4233:3: ( (lv_nested_1_0= ruleEclAttributeSet ) )
            // InternalEtlParser.g:4234:4: (lv_nested_1_0= ruleEclAttributeSet )
            {
            // InternalEtlParser.g:4234:4: (lv_nested_1_0= ruleEclAttributeSet )
            // InternalEtlParser.g:4235:5: lv_nested_1_0= ruleEclAttributeSet
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
            lv_nested_1_0=ruleEclAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedAttributeSetRule());
              					}
              					set(
              						current,
              						"nested",
              						lv_nested_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclAttributeSet");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedAttributeSetAccess().getROUND_CLOSETerminalRuleCall_2());
              		
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
    // $ANTLR end "ruleNestedAttributeSet"


    // $ANTLR start "entryRuleAttributeConstraint"
    // InternalEtlParser.g:4260:1: entryRuleAttributeConstraint returns [EObject current=null] : iv_ruleAttributeConstraint= ruleAttributeConstraint EOF ;
    public final EObject entryRuleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeConstraint = null;


        try {
            // InternalEtlParser.g:4260:60: (iv_ruleAttributeConstraint= ruleAttributeConstraint EOF )
            // InternalEtlParser.g:4261:2: iv_ruleAttributeConstraint= ruleAttributeConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeConstraint=ruleAttributeConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeConstraint"


    // $ANTLR start "ruleAttributeConstraint"
    // InternalEtlParser.g:4267:1: ruleAttributeConstraint returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? ) ;
    public final EObject ruleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_reversed_1_0=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_attribute_2_0 = null;

        EObject lv_comparison_3_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4273:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? ) )
            // InternalEtlParser.g:4274:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? )
            {
            // InternalEtlParser.g:4274:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? )
            // InternalEtlParser.g:4275:3: ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )?
            {
            // InternalEtlParser.g:4275:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_SQUARE_OPEN) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalEtlParser.g:4276:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalEtlParser.g:4276:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalEtlParser.g:4277:5: lv_cardinality_0_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
                    lv_cardinality_0_0=ruleCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
                      					}
                      					set(
                      						current,
                      						"cardinality",
                      						lv_cardinality_0_0,
                      						"com.b2international.snomed.ecl.Ecl.Cardinality");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEtlParser.g:4294:3: ( (lv_reversed_1_0= RULE_REVERSED ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_REVERSED) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalEtlParser.g:4295:4: (lv_reversed_1_0= RULE_REVERSED )
                    {
                    // InternalEtlParser.g:4295:4: (lv_reversed_1_0= RULE_REVERSED )
                    // InternalEtlParser.g:4296:5: lv_reversed_1_0= RULE_REVERSED
                    {
                    lv_reversed_1_0=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_reversed_1_0, grammarAccess.getAttributeConstraintAccess().getReversedREVERSEDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAttributeConstraintRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"reversed",
                      						lv_reversed_1_0 != null,
                      						"com.b2international.snomed.ecl.Ecl.REVERSED");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEtlParser.g:4312:3: ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) )
            // InternalEtlParser.g:4313:4: (lv_attribute_2_0= ruleFilteredExpressionConstraint )
            {
            // InternalEtlParser.g:4313:4: (lv_attribute_2_0= ruleFilteredExpressionConstraint )
            // InternalEtlParser.g:4314:5: lv_attribute_2_0= ruleFilteredExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_49);
            lv_attribute_2_0=ruleFilteredExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
              					}
              					set(
              						current,
              						"attribute",
              						lv_attribute_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:4331:3: ( (lv_comparison_3_0= ruleComparison ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=RULE_GTE && LA73_0<=RULE_LTE)||(LA73_0>=RULE_EQUAL && LA73_0<=RULE_GT)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalEtlParser.g:4332:4: (lv_comparison_3_0= ruleComparison )
                    {
                    // InternalEtlParser.g:4332:4: (lv_comparison_3_0= ruleComparison )
                    // InternalEtlParser.g:4333:5: lv_comparison_3_0= ruleComparison
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getComparisonComparisonParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_comparison_3_0=ruleComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
                      					}
                      					set(
                      						current,
                      						"comparison",
                      						lv_comparison_3_0,
                      						"com.b2international.snomed.ecl.Ecl.Comparison");
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
    // $ANTLR end "ruleAttributeConstraint"


    // $ANTLR start "entryRuleCardinality"
    // InternalEtlParser.g:4354:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalEtlParser.g:4354:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalEtlParser.g:4355:2: iv_ruleCardinality= ruleCardinality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCardinalityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCardinality; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalEtlParser.g:4361:1: ruleCardinality returns [EObject current=null] : (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token this_SQUARE_OPEN_0=null;
        Token this_TO_2=null;
        Token this_SQUARE_CLOSE_4=null;
        AntlrDatatypeRuleToken lv_min_1_0 = null;

        AntlrDatatypeRuleToken lv_max_3_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4367:2: ( (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) )
            // InternalEtlParser.g:4368:2: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            {
            // InternalEtlParser.g:4368:2: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            // InternalEtlParser.g:4369:3: this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE
            {
            this_SQUARE_OPEN_0=(Token)match(input,RULE_SQUARE_OPEN,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SQUARE_OPEN_0, grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:4373:3: ( (lv_min_1_0= ruleNonNegativeInteger ) )
            // InternalEtlParser.g:4374:4: (lv_min_1_0= ruleNonNegativeInteger )
            {
            // InternalEtlParser.g:4374:4: (lv_min_1_0= ruleNonNegativeInteger )
            // InternalEtlParser.g:4375:5: lv_min_1_0= ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
            lv_min_1_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCardinalityRule());
              					}
              					set(
              						current,
              						"min",
              						lv_min_1_0,
              						"com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_TO_2=(Token)match(input,RULE_TO,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TO_2, grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2());
              		
            }
            // InternalEtlParser.g:4396:3: ( (lv_max_3_0= ruleMaxValue ) )
            // InternalEtlParser.g:4397:4: (lv_max_3_0= ruleMaxValue )
            {
            // InternalEtlParser.g:4397:4: (lv_max_3_0= ruleMaxValue )
            // InternalEtlParser.g:4398:5: lv_max_3_0= ruleMaxValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_50);
            lv_max_3_0=ruleMaxValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCardinalityRule());
              					}
              					set(
              						current,
              						"max",
              						lv_max_3_0,
              						"com.b2international.snomed.ecl.Ecl.MaxValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_SQUARE_CLOSE_4=(Token)match(input,RULE_SQUARE_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SQUARE_CLOSE_4, grammarAccess.getCardinalityAccess().getSQUARE_CLOSETerminalRuleCall_4());
              		
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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleComparison"
    // InternalEtlParser.g:4423:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalEtlParser.g:4423:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalEtlParser.g:4424:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalEtlParser.g:4430:1: ruleComparison returns [EObject current=null] : (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeComparison_0 = null;

        EObject this_DataTypeComparison_1 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4436:2: ( (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) )
            // InternalEtlParser.g:4437:2: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            {
            // InternalEtlParser.g:4437:2: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            int alt74=2;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==RULE_STRING||LA74_1==RULE_FALSE_KEYWORD||LA74_1==RULE_TRUE_KEYWORD||LA74_1==RULE_HASH) ) {
                    alt74=2;
                }
                else if ( ((LA74_1>=RULE_DBL_LT_EM && LA74_1<=RULE_GT_EM)||(LA74_1>=RULE_DIGIT_ZERO && LA74_1<=RULE_DIGIT_NONZERO)||LA74_1==RULE_ROUND_OPEN||LA74_1==RULE_CARET||LA74_1==RULE_WILDCARD||(LA74_1>=RULE_LT && LA74_1<=RULE_GT)) ) {
                    alt74=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NOT_EQUAL:
                {
                int LA74_2 = input.LA(2);

                if ( (LA74_2==RULE_STRING||LA74_2==RULE_FALSE_KEYWORD||LA74_2==RULE_TRUE_KEYWORD||LA74_2==RULE_HASH) ) {
                    alt74=2;
                }
                else if ( ((LA74_2>=RULE_DBL_LT_EM && LA74_2<=RULE_GT_EM)||(LA74_2>=RULE_DIGIT_ZERO && LA74_2<=RULE_DIGIT_NONZERO)||LA74_2==RULE_ROUND_OPEN||LA74_2==RULE_CARET||LA74_2==RULE_WILDCARD||(LA74_2>=RULE_LT && LA74_2<=RULE_GT)) ) {
                    alt74=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_GTE:
            case RULE_LTE:
            case RULE_LT:
            case RULE_GT:
                {
                alt74=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalEtlParser.g:4438:3: this_AttributeComparison_0= ruleAttributeComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparisonAccess().getAttributeComparisonParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AttributeComparison_0=ruleAttributeComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeComparison_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:4450:3: this_DataTypeComparison_1= ruleDataTypeComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparisonAccess().getDataTypeComparisonParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DataTypeComparison_1=ruleDataTypeComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DataTypeComparison_1;
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleAttributeComparison"
    // InternalEtlParser.g:4465:1: entryRuleAttributeComparison returns [EObject current=null] : iv_ruleAttributeComparison= ruleAttributeComparison EOF ;
    public final EObject entryRuleAttributeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeComparison = null;


        try {
            // InternalEtlParser.g:4465:60: (iv_ruleAttributeComparison= ruleAttributeComparison EOF )
            // InternalEtlParser.g:4466:2: iv_ruleAttributeComparison= ruleAttributeComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeComparison=ruleAttributeComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeComparison"


    // $ANTLR start "ruleAttributeComparison"
    // InternalEtlParser.g:4472:1: ruleAttributeComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) ) ;
    public final EObject ruleAttributeComparison() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4478:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) ) )
            // InternalEtlParser.g:4479:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) )
            {
            // InternalEtlParser.g:4479:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) )
            // InternalEtlParser.g:4480:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) )
            {
            // InternalEtlParser.g:4480:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEtlParser.g:4481:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:4481:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEtlParser.g:4482:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_op_0_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeComparisonRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:4499:3: ( (lv_value_1_0= ruleFilteredExpressionConstraint ) )
            // InternalEtlParser.g:4500:4: (lv_value_1_0= ruleFilteredExpressionConstraint )
            {
            // InternalEtlParser.g:4500:4: (lv_value_1_0= ruleFilteredExpressionConstraint )
            // InternalEtlParser.g:4501:5: lv_value_1_0= ruleFilteredExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeComparisonAccess().getValueFilteredExpressionConstraintParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleFilteredExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeComparisonRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
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
    // $ANTLR end "ruleAttributeComparison"


    // $ANTLR start "entryRuleDataTypeComparison"
    // InternalEtlParser.g:4522:1: entryRuleDataTypeComparison returns [EObject current=null] : iv_ruleDataTypeComparison= ruleDataTypeComparison EOF ;
    public final EObject entryRuleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeComparison = null;


        try {
            // InternalEtlParser.g:4522:59: (iv_ruleDataTypeComparison= ruleDataTypeComparison EOF )
            // InternalEtlParser.g:4523:2: iv_ruleDataTypeComparison= ruleDataTypeComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDataTypeComparison=ruleDataTypeComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeComparison"


    // $ANTLR start "ruleDataTypeComparison"
    // InternalEtlParser.g:4529:1: ruleDataTypeComparison returns [EObject current=null] : (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison ) ;
    public final EObject ruleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValueComparison_0 = null;

        EObject this_StringValueComparison_1 = null;

        EObject this_IntegerValueComparison_2 = null;

        EObject this_DecimalValueComparison_3 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4535:2: ( (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison ) )
            // InternalEtlParser.g:4536:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )
            {
            // InternalEtlParser.g:4536:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )
            int alt75=4;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // InternalEtlParser.g:4537:3: this_BooleanValueComparison_0= ruleBooleanValueComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getBooleanValueComparisonParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanValueComparison_0=ruleBooleanValueComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanValueComparison_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:4549:3: this_StringValueComparison_1= ruleStringValueComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getStringValueComparisonParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValueComparison_1=ruleStringValueComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValueComparison_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEtlParser.g:4561:3: this_IntegerValueComparison_2= ruleIntegerValueComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueComparisonParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerValueComparison_2=ruleIntegerValueComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerValueComparison_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEtlParser.g:4573:3: this_DecimalValueComparison_3= ruleDecimalValueComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueComparisonParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DecimalValueComparison_3=ruleDecimalValueComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecimalValueComparison_3;
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
    // $ANTLR end "ruleDataTypeComparison"


    // $ANTLR start "entryRuleBooleanValueComparison"
    // InternalEtlParser.g:4588:1: entryRuleBooleanValueComparison returns [EObject current=null] : iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF ;
    public final EObject entryRuleBooleanValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueComparison = null;


        try {
            // InternalEtlParser.g:4588:63: (iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF )
            // InternalEtlParser.g:4589:2: iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanValueComparison=ruleBooleanValueComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValueComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanValueComparison"


    // $ANTLR start "ruleBooleanValueComparison"
    // InternalEtlParser.g:4595:1: ruleBooleanValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) ) ;
    public final EObject ruleBooleanValueComparison() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4601:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) ) )
            // InternalEtlParser.g:4602:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) )
            {
            // InternalEtlParser.g:4602:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) )
            // InternalEtlParser.g:4603:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) )
            {
            // InternalEtlParser.g:4603:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEtlParser.g:4604:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:4604:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEtlParser.g:4605:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_51);
            lv_op_0_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanValueComparisonRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:4622:3: ( (lv_value_1_0= ruleBoolean ) )
            // InternalEtlParser.g:4623:4: (lv_value_1_0= ruleBoolean )
            {
            // InternalEtlParser.g:4623:4: (lv_value_1_0= ruleBoolean )
            // InternalEtlParser.g:4624:5: lv_value_1_0= ruleBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanValueComparisonAccess().getValueBooleanParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanValueComparisonRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.b2international.snomed.ecl.Ecl.Boolean");
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
    // $ANTLR end "ruleBooleanValueComparison"


    // $ANTLR start "entryRuleStringValueComparison"
    // InternalEtlParser.g:4645:1: entryRuleStringValueComparison returns [EObject current=null] : iv_ruleStringValueComparison= ruleStringValueComparison EOF ;
    public final EObject entryRuleStringValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueComparison = null;


        try {
            // InternalEtlParser.g:4645:62: (iv_ruleStringValueComparison= ruleStringValueComparison EOF )
            // InternalEtlParser.g:4646:2: iv_ruleStringValueComparison= ruleStringValueComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringValueComparison=ruleStringValueComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValueComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValueComparison"


    // $ANTLR start "ruleStringValueComparison"
    // InternalEtlParser.g:4652:1: ruleStringValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValueComparison() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4658:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalEtlParser.g:4659:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalEtlParser.g:4659:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalEtlParser.g:4660:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalEtlParser.g:4660:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEtlParser.g:4661:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:4661:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEtlParser.g:4662:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_op_0_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStringValueComparisonRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:4679:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalEtlParser.g:4680:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalEtlParser.g:4680:4: (lv_value_1_0= RULE_STRING )
            // InternalEtlParser.g:4681:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getStringValueComparisonAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStringValueComparisonRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.b2international.snomed.ecl.Ecl.STRING");
              				
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
    // $ANTLR end "ruleStringValueComparison"


    // $ANTLR start "entryRuleIntegerValueComparison"
    // InternalEtlParser.g:4701:1: entryRuleIntegerValueComparison returns [EObject current=null] : iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF ;
    public final EObject entryRuleIntegerValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueComparison = null;


        try {
            // InternalEtlParser.g:4701:63: (iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF )
            // InternalEtlParser.g:4702:2: iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerValueComparison=ruleIntegerValueComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValueComparison"


    // $ANTLR start "ruleIntegerValueComparison"
    // InternalEtlParser.g:4708:1: ruleIntegerValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueComparison() throws RecognitionException {
        EObject current = null;

        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4714:2: ( ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalEtlParser.g:4715:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalEtlParser.g:4715:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // InternalEtlParser.g:4716:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            // InternalEtlParser.g:4716:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) )
            // InternalEtlParser.g:4717:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:4717:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            // InternalEtlParser.g:4718:5: lv_op_0_0= ruleNUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_37);
            lv_op_0_0=ruleNUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerValueComparisonRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"com.b2international.snomed.ecl.Ecl.NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getIntegerValueComparisonAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:4739:3: ( (lv_value_2_0= ruleInteger ) )
            // InternalEtlParser.g:4740:4: (lv_value_2_0= ruleInteger )
            {
            // InternalEtlParser.g:4740:4: (lv_value_2_0= ruleInteger )
            // InternalEtlParser.g:4741:5: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerValueComparisonAccess().getValueIntegerParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerValueComparisonRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Integer");
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
    // $ANTLR end "ruleIntegerValueComparison"


    // $ANTLR start "entryRuleDecimalValueComparison"
    // InternalEtlParser.g:4762:1: entryRuleDecimalValueComparison returns [EObject current=null] : iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF ;
    public final EObject entryRuleDecimalValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueComparison = null;


        try {
            // InternalEtlParser.g:4762:63: (iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF )
            // InternalEtlParser.g:4763:2: iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecimalValueComparison=ruleDecimalValueComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValueComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValueComparison"


    // $ANTLR start "ruleDecimalValueComparison"
    // InternalEtlParser.g:4769:1: ruleDecimalValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueComparison() throws RecognitionException {
        EObject current = null;

        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4775:2: ( ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // InternalEtlParser.g:4776:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // InternalEtlParser.g:4776:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // InternalEtlParser.g:4777:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            // InternalEtlParser.g:4777:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) )
            // InternalEtlParser.g:4778:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:4778:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            // InternalEtlParser.g:4779:5: lv_op_0_0= ruleNUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecimalValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_37);
            lv_op_0_0=ruleNUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDecimalValueComparisonRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"com.b2international.snomed.ecl.Ecl.NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getDecimalValueComparisonAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:4800:3: ( (lv_value_2_0= ruleDecimal ) )
            // InternalEtlParser.g:4801:4: (lv_value_2_0= ruleDecimal )
            {
            // InternalEtlParser.g:4801:4: (lv_value_2_0= ruleDecimal )
            // InternalEtlParser.g:4802:5: lv_value_2_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecimalValueComparisonAccess().getValueDecimalParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDecimalValueComparisonRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Decimal");
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
    // $ANTLR end "ruleDecimalValueComparison"


    // $ANTLR start "entryRuleNestedExpression"
    // InternalEtlParser.g:4823:1: entryRuleNestedExpression returns [EObject current=null] : iv_ruleNestedExpression= ruleNestedExpression EOF ;
    public final EObject entryRuleNestedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpression = null;


        try {
            // InternalEtlParser.g:4823:57: (iv_ruleNestedExpression= ruleNestedExpression EOF )
            // InternalEtlParser.g:4824:2: iv_ruleNestedExpression= ruleNestedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedExpression=ruleNestedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedExpression"


    // $ANTLR start "ruleNestedExpression"
    // InternalEtlParser.g:4830:1: ruleNestedExpression returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedExpression() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4836:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEtlParser.g:4837:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEtlParser.g:4837:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEtlParser.g:4838:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:4842:3: ( (lv_nested_1_0= ruleExpressionConstraint ) )
            // InternalEtlParser.g:4843:4: (lv_nested_1_0= ruleExpressionConstraint )
            {
            // InternalEtlParser.g:4843:4: (lv_nested_1_0= ruleExpressionConstraint )
            // InternalEtlParser.g:4844:5: lv_nested_1_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
            lv_nested_1_0=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedExpressionRule());
              					}
              					set(
              						current,
              						"nested",
              						lv_nested_1_0,
              						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedExpressionAccess().getROUND_CLOSETerminalRuleCall_2());
              		
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
    // $ANTLR end "ruleNestedExpression"


    // $ANTLR start "entryRuleFilterConstraint"
    // InternalEtlParser.g:4869:1: entryRuleFilterConstraint returns [EObject current=null] : iv_ruleFilterConstraint= ruleFilterConstraint EOF ;
    public final EObject entryRuleFilterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterConstraint = null;


        try {
            // InternalEtlParser.g:4869:57: (iv_ruleFilterConstraint= ruleFilterConstraint EOF )
            // InternalEtlParser.g:4870:2: iv_ruleFilterConstraint= ruleFilterConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilterConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFilterConstraint=ruleFilterConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilterConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFilterConstraint"


    // $ANTLR start "ruleFilterConstraint"
    // InternalEtlParser.g:4876:1: ruleFilterConstraint returns [EObject current=null] : (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE ) ;
    public final EObject ruleFilterConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_CURLY_OPEN_0=null;
        Token this_DOUBLE_CURLY_CLOSE_3=null;
        AntlrDatatypeRuleToken lv_domain_1_0 = null;

        EObject lv_filter_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4882:2: ( (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE ) )
            // InternalEtlParser.g:4883:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE )
            {
            // InternalEtlParser.g:4883:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE )
            // InternalEtlParser.g:4884:3: this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE
            {
            this_DOUBLE_CURLY_OPEN_0=(Token)match(input,RULE_DOUBLE_CURLY_OPEN,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_CURLY_OPEN_0, grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:4888:3: ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=RULE_DESCRIPTION_SHORT_KEYWORD && LA76_0<=RULE_CONCEPT_SHORT_KEYWORD)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalEtlParser.g:4889:4: (lv_domain_1_0= ruleSHORT_DOMAIN )
                    {
                    // InternalEtlParser.g:4889:4: (lv_domain_1_0= ruleSHORT_DOMAIN )
                    // InternalEtlParser.g:4890:5: lv_domain_1_0= ruleSHORT_DOMAIN
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFilterConstraintAccess().getDomainSHORT_DOMAINParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
                    lv_domain_1_0=ruleSHORT_DOMAIN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFilterConstraintRule());
                      					}
                      					set(
                      						current,
                      						"domain",
                      						lv_domain_1_0,
                      						"com.b2international.snomed.ecl.Ecl.SHORT_DOMAIN");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEtlParser.g:4907:3: ( (lv_filter_2_0= ruleFilter ) )
            // InternalEtlParser.g:4908:4: (lv_filter_2_0= ruleFilter )
            {
            // InternalEtlParser.g:4908:4: (lv_filter_2_0= ruleFilter )
            // InternalEtlParser.g:4909:5: lv_filter_2_0= ruleFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFilterConstraintAccess().getFilterFilterParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_53);
            lv_filter_2_0=ruleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFilterConstraintRule());
              					}
              					set(
              						current,
              						"filter",
              						lv_filter_2_0,
              						"com.b2international.snomed.ecl.Ecl.Filter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_DOUBLE_CURLY_CLOSE_3=(Token)match(input,RULE_DOUBLE_CURLY_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_CURLY_CLOSE_3, grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_3());
              		
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
    // $ANTLR end "ruleFilterConstraint"


    // $ANTLR start "entryRuleFilter"
    // InternalEtlParser.g:4934:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalEtlParser.g:4934:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalEtlParser.g:4935:2: iv_ruleFilter= ruleFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalEtlParser.g:4941:1: ruleFilter returns [EObject current=null] : this_DisjunctionFilter_0= ruleDisjunctionFilter ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DisjunctionFilter_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4947:2: (this_DisjunctionFilter_0= ruleDisjunctionFilter )
            // InternalEtlParser.g:4948:2: this_DisjunctionFilter_0= ruleDisjunctionFilter
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getFilterAccess().getDisjunctionFilterParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_DisjunctionFilter_0=ruleDisjunctionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_DisjunctionFilter_0;
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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleDisjunctionFilter"
    // InternalEtlParser.g:4962:1: entryRuleDisjunctionFilter returns [EObject current=null] : iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF ;
    public final EObject entryRuleDisjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionFilter = null;


        try {
            // InternalEtlParser.g:4962:58: (iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF )
            // InternalEtlParser.g:4963:2: iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDisjunctionFilter=ruleDisjunctionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunctionFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDisjunctionFilter"


    // $ANTLR start "ruleDisjunctionFilter"
    // InternalEtlParser.g:4969:1: ruleDisjunctionFilter returns [EObject current=null] : (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* ) ;
    public final EObject ruleDisjunctionFilter() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_KEYWORD_2=null;
        EObject this_ConjunctionFilter_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:4975:2: ( (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* ) )
            // InternalEtlParser.g:4976:2: (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* )
            {
            // InternalEtlParser.g:4976:2: (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* )
            // InternalEtlParser.g:4977:3: this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDisjunctionFilterAccess().getConjunctionFilterParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_38);
            this_ConjunctionFilter_0=ruleConjunctionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConjunctionFilter_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEtlParser.g:4988:3: ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_DISJUNCTION_KEYWORD) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalEtlParser.g:4989:4: () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) )
            	    {
            	    // InternalEtlParser.g:4989:4: ()
            	    // InternalEtlParser.g:4990:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getDisjunctionFilterAccess().getDisjunctionFilterLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_DISJUNCTION_KEYWORD_2=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getDisjunctionFilterAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalEtlParser.g:5003:4: ( (lv_right_3_0= ruleConjunctionFilter ) )
            	    // InternalEtlParser.g:5004:5: (lv_right_3_0= ruleConjunctionFilter )
            	    {
            	    // InternalEtlParser.g:5004:5: (lv_right_3_0= ruleConjunctionFilter )
            	    // InternalEtlParser.g:5005:6: lv_right_3_0= ruleConjunctionFilter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDisjunctionFilterAccess().getRightConjunctionFilterParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_right_3_0=ruleConjunctionFilter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDisjunctionFilterRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.b2international.snomed.ecl.Ecl.ConjunctionFilter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
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
    // $ANTLR end "ruleDisjunctionFilter"


    // $ANTLR start "entryRuleConjunctionFilter"
    // InternalEtlParser.g:5027:1: entryRuleConjunctionFilter returns [EObject current=null] : iv_ruleConjunctionFilter= ruleConjunctionFilter EOF ;
    public final EObject entryRuleConjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionFilter = null;


        try {
            // InternalEtlParser.g:5027:58: (iv_ruleConjunctionFilter= ruleConjunctionFilter EOF )
            // InternalEtlParser.g:5028:2: iv_ruleConjunctionFilter= ruleConjunctionFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConjunctionFilter=ruleConjunctionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunctionFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConjunctionFilter"


    // $ANTLR start "ruleConjunctionFilter"
    // InternalEtlParser.g:5034:1: ruleConjunctionFilter returns [EObject current=null] : (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* ) ;
    public final EObject ruleConjunctionFilter() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_KEYWORD_2=null;
        Token this_COMMA_3=null;
        EObject this_PropertyFilter_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:5040:2: ( (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* ) )
            // InternalEtlParser.g:5041:2: (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* )
            {
            // InternalEtlParser.g:5041:2: (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* )
            // InternalEtlParser.g:5042:3: this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConjunctionFilterAccess().getPropertyFilterParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_39);
            this_PropertyFilter_0=rulePropertyFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PropertyFilter_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEtlParser.g:5053:3: ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_CONJUNCTION_KEYWORD||LA79_0==RULE_COMMA) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalEtlParser.g:5054:4: () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) )
            	    {
            	    // InternalEtlParser.g:5054:4: ()
            	    // InternalEtlParser.g:5055:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getConjunctionFilterAccess().getConjunctionFilterLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalEtlParser.g:5064:4: (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA )
            	    int alt78=2;
            	    int LA78_0 = input.LA(1);

            	    if ( (LA78_0==RULE_CONJUNCTION_KEYWORD) ) {
            	        alt78=1;
            	    }
            	    else if ( (LA78_0==RULE_COMMA) ) {
            	        alt78=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 78, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt78) {
            	        case 1 :
            	            // InternalEtlParser.g:5065:5: this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD
            	            {
            	            this_CONJUNCTION_KEYWORD_2=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getConjunctionFilterAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEtlParser.g:5070:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEtlParser.g:5075:4: ( (lv_right_4_0= rulePropertyFilter ) )
            	    // InternalEtlParser.g:5076:5: (lv_right_4_0= rulePropertyFilter )
            	    {
            	    // InternalEtlParser.g:5076:5: (lv_right_4_0= rulePropertyFilter )
            	    // InternalEtlParser.g:5077:6: lv_right_4_0= rulePropertyFilter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConjunctionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_39);
            	    lv_right_4_0=rulePropertyFilter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConjunctionFilterRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_4_0,
            	      							"com.b2international.snomed.ecl.Ecl.PropertyFilter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
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
    // $ANTLR end "ruleConjunctionFilter"


    // $ANTLR start "entryRuleNestedFilter"
    // InternalEtlParser.g:5099:1: entryRuleNestedFilter returns [EObject current=null] : iv_ruleNestedFilter= ruleNestedFilter EOF ;
    public final EObject entryRuleNestedFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedFilter = null;


        try {
            // InternalEtlParser.g:5099:53: (iv_ruleNestedFilter= ruleNestedFilter EOF )
            // InternalEtlParser.g:5100:2: iv_ruleNestedFilter= ruleNestedFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedFilter=ruleNestedFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedFilter"


    // $ANTLR start "ruleNestedFilter"
    // InternalEtlParser.g:5106:1: ruleNestedFilter returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedFilter() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:5112:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEtlParser.g:5113:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEtlParser.g:5113:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEtlParser.g:5114:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:5118:3: ( (lv_nested_1_0= ruleFilter ) )
            // InternalEtlParser.g:5119:4: (lv_nested_1_0= ruleFilter )
            {
            // InternalEtlParser.g:5119:4: (lv_nested_1_0= ruleFilter )
            // InternalEtlParser.g:5120:5: lv_nested_1_0= ruleFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedFilterAccess().getNestedFilterParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
            lv_nested_1_0=ruleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedFilterRule());
              					}
              					set(
              						current,
              						"nested",
              						lv_nested_1_0,
              						"com.b2international.snomed.ecl.Ecl.Filter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedFilterAccess().getROUND_CLOSETerminalRuleCall_2());
              		
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
    // $ANTLR end "ruleNestedFilter"


    // $ANTLR start "entryRulePropertyFilter"
    // InternalEtlParser.g:5145:1: entryRulePropertyFilter returns [EObject current=null] : iv_rulePropertyFilter= rulePropertyFilter EOF ;
    public final EObject entryRulePropertyFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyFilter = null;


        try {
            // InternalEtlParser.g:5145:55: (iv_rulePropertyFilter= rulePropertyFilter EOF )
            // InternalEtlParser.g:5146:2: iv_rulePropertyFilter= rulePropertyFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyFilter=rulePropertyFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyFilter"


    // $ANTLR start "rulePropertyFilter"
    // InternalEtlParser.g:5152:1: rulePropertyFilter returns [EObject current=null] : (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter | this_ModuleFilter_5= ruleModuleFilter | this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter | this_ActiveFilter_7= ruleActiveFilter | this_SemanticTagFilter_8= ruleSemanticTagFilter | this_PreferredInFilter_9= rulePreferredInFilter | this_AcceptableInFilter_10= ruleAcceptableInFilter | this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter | this_NestedFilter_13= ruleNestedFilter ) ;
    public final EObject rulePropertyFilter() throws RecognitionException {
        EObject current = null;

        EObject this_TermFilter_0 = null;

        EObject this_LanguageFilter_1 = null;

        EObject this_TypeFilter_2 = null;

        EObject this_DialectFilter_3 = null;

        EObject this_DefinitionStatusFilter_4 = null;

        EObject this_ModuleFilter_5 = null;

        EObject this_EffectiveTimeFilter_6 = null;

        EObject this_ActiveFilter_7 = null;

        EObject this_SemanticTagFilter_8 = null;

        EObject this_PreferredInFilter_9 = null;

        EObject this_AcceptableInFilter_10 = null;

        EObject this_LanguageRefSetFilter_11 = null;

        EObject this_CaseSignificanceFilter_12 = null;

        EObject this_NestedFilter_13 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:5158:2: ( (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter | this_ModuleFilter_5= ruleModuleFilter | this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter | this_ActiveFilter_7= ruleActiveFilter | this_SemanticTagFilter_8= ruleSemanticTagFilter | this_PreferredInFilter_9= rulePreferredInFilter | this_AcceptableInFilter_10= ruleAcceptableInFilter | this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter | this_NestedFilter_13= ruleNestedFilter ) )
            // InternalEtlParser.g:5159:2: (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter | this_ModuleFilter_5= ruleModuleFilter | this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter | this_ActiveFilter_7= ruleActiveFilter | this_SemanticTagFilter_8= ruleSemanticTagFilter | this_PreferredInFilter_9= rulePreferredInFilter | this_AcceptableInFilter_10= ruleAcceptableInFilter | this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter | this_NestedFilter_13= ruleNestedFilter )
            {
            // InternalEtlParser.g:5159:2: (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter | this_ModuleFilter_5= ruleModuleFilter | this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter | this_ActiveFilter_7= ruleActiveFilter | this_SemanticTagFilter_8= ruleSemanticTagFilter | this_PreferredInFilter_9= rulePreferredInFilter | this_AcceptableInFilter_10= ruleAcceptableInFilter | this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter | this_NestedFilter_13= ruleNestedFilter )
            int alt80=14;
            switch ( input.LA(1) ) {
            case RULE_TERM_KEYWORD:
                {
                alt80=1;
                }
                break;
            case RULE_LANGUAGE_KEYWORD:
                {
                alt80=2;
                }
                break;
            case RULE_TYPEID_KEYWORD:
            case RULE_TYPE_KEYWORD:
                {
                alt80=3;
                }
                break;
            case RULE_DIALECTID_KEYWORD:
            case RULE_DIALECT_KEYWORD:
                {
                alt80=4;
                }
                break;
            case RULE_DEFINITION_STATUS_ID_KEYWORD:
            case RULE_DEFINITION_STATUS_TOKEN_KEYWORD:
                {
                alt80=5;
                }
                break;
            case RULE_MODULEID_KEYWORD:
                {
                alt80=6;
                }
                break;
            case RULE_EFFECTIVE_TIME_KEYWORD:
                {
                alt80=7;
                }
                break;
            case RULE_ACTIVE_KEYWORD:
                {
                alt80=8;
                }
                break;
            case RULE_SEMANTIC_TAG_KEYWORD:
                {
                alt80=9;
                }
                break;
            case RULE_PREFERRED_IN_KEYWORD:
                {
                alt80=10;
                }
                break;
            case RULE_ACCEPTABLE_IN_KEYWORD:
                {
                alt80=11;
                }
                break;
            case RULE_LANGUAGE_REFSET_ID_KEYWORD:
                {
                alt80=12;
                }
                break;
            case RULE_CASE_SIGNIFICANCE_ID_KEYWORD:
                {
                alt80=13;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt80=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalEtlParser.g:5160:3: this_TermFilter_0= ruleTermFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getTermFilterParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TermFilter_0=ruleTermFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TermFilter_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:5172:3: this_LanguageFilter_1= ruleLanguageFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getLanguageFilterParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LanguageFilter_1=ruleLanguageFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LanguageFilter_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEtlParser.g:5184:3: this_TypeFilter_2= ruleTypeFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getTypeFilterParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeFilter_2=ruleTypeFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeFilter_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEtlParser.g:5196:3: this_DialectFilter_3= ruleDialectFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getDialectFilterParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DialectFilter_3=ruleDialectFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DialectFilter_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEtlParser.g:5208:3: this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getDefinitionStatusFilterParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DefinitionStatusFilter_4=ruleDefinitionStatusFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefinitionStatusFilter_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEtlParser.g:5220:3: this_ModuleFilter_5= ruleModuleFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getModuleFilterParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ModuleFilter_5=ruleModuleFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ModuleFilter_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEtlParser.g:5232:3: this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getEffectiveTimeFilterParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EffectiveTimeFilter_6=ruleEffectiveTimeFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EffectiveTimeFilter_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEtlParser.g:5244:3: this_ActiveFilter_7= ruleActiveFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getActiveFilterParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ActiveFilter_7=ruleActiveFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ActiveFilter_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEtlParser.g:5256:3: this_SemanticTagFilter_8= ruleSemanticTagFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getSemanticTagFilterParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SemanticTagFilter_8=ruleSemanticTagFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SemanticTagFilter_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalEtlParser.g:5268:3: this_PreferredInFilter_9= rulePreferredInFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getPreferredInFilterParserRuleCall_9());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PreferredInFilter_9=rulePreferredInFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PreferredInFilter_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalEtlParser.g:5280:3: this_AcceptableInFilter_10= ruleAcceptableInFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getAcceptableInFilterParserRuleCall_10());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AcceptableInFilter_10=ruleAcceptableInFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AcceptableInFilter_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalEtlParser.g:5292:3: this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getLanguageRefSetFilterParserRuleCall_11());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LanguageRefSetFilter_11=ruleLanguageRefSetFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LanguageRefSetFilter_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalEtlParser.g:5304:3: this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getCaseSignificanceFilterParserRuleCall_12());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CaseSignificanceFilter_12=ruleCaseSignificanceFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CaseSignificanceFilter_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalEtlParser.g:5316:3: this_NestedFilter_13= ruleNestedFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_13());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedFilter_13=ruleNestedFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedFilter_13;
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
    // $ANTLR end "rulePropertyFilter"


    // $ANTLR start "entryRuleTermFilter"
    // InternalEtlParser.g:5331:1: entryRuleTermFilter returns [EObject current=null] : iv_ruleTermFilter= ruleTermFilter EOF ;
    public final EObject entryRuleTermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermFilter = null;


        try {
            // InternalEtlParser.g:5331:51: (iv_ruleTermFilter= ruleTermFilter EOF )
            // InternalEtlParser.g:5332:2: iv_ruleTermFilter= ruleTermFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTermFilter=ruleTermFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTermFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTermFilter"


    // $ANTLR start "ruleTermFilter"
    // InternalEtlParser.g:5338:1: ruleTermFilter returns [EObject current=null] : (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) ) ;
    public final EObject ruleTermFilter() throws RecognitionException {
        EObject current = null;

        Token this_TERM_KEYWORD_0=null;
        EObject this_TypedTermFilter_1 = null;

        EObject this_TypedTermFilterSet_2 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:5344:2: ( (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) ) )
            // InternalEtlParser.g:5345:2: (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) )
            {
            // InternalEtlParser.g:5345:2: (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) )
            // InternalEtlParser.g:5346:3: this_TERM_KEYWORD_0= RULE_TERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet )
            {
            this_TERM_KEYWORD_0=(Token)match(input,RULE_TERM_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TERM_KEYWORD_0, grammarAccess.getTermFilterAccess().getTERM_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:5350:3: (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_EQUAL) ) {
                int LA81_1 = input.LA(2);

                if ( (LA81_1==RULE_STRING||LA81_1==RULE_EXACT_KEYWORD||(LA81_1>=RULE_MATCH_KEYWORD && LA81_1<=RULE_REGEX_KEYWORD)||LA81_1==RULE_WILD_KEYWORD) ) {
                    alt81=1;
                }
                else if ( (LA81_1==RULE_ROUND_OPEN) ) {
                    alt81=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA81_0==RULE_NOT_EQUAL) ) {
                int LA81_2 = input.LA(2);

                if ( (LA81_2==RULE_STRING||LA81_2==RULE_EXACT_KEYWORD||(LA81_2>=RULE_MATCH_KEYWORD && LA81_2<=RULE_REGEX_KEYWORD)||LA81_2==RULE_WILD_KEYWORD) ) {
                    alt81=1;
                }
                else if ( (LA81_2==RULE_ROUND_OPEN) ) {
                    alt81=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalEtlParser.g:5351:4: this_TypedTermFilter_1= ruleTypedTermFilter
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTermFilterAccess().getTypedTermFilterParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedTermFilter_1=ruleTypedTermFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TypedTermFilter_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:5363:4: this_TypedTermFilterSet_2= ruleTypedTermFilterSet
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTermFilterAccess().getTypedTermFilterSetParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedTermFilterSet_2=ruleTypedTermFilterSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TypedTermFilterSet_2;
                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleTermFilter"


    // $ANTLR start "entryRuleTypedTermFilter"
    // InternalEtlParser.g:5379:1: entryRuleTypedTermFilter returns [EObject current=null] : iv_ruleTypedTermFilter= ruleTypedTermFilter EOF ;
    public final EObject entryRuleTypedTermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTermFilter = null;


        try {
            // InternalEtlParser.g:5379:56: (iv_ruleTypedTermFilter= ruleTypedTermFilter EOF )
            // InternalEtlParser.g:5380:2: iv_ruleTypedTermFilter= ruleTypedTermFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedTermFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedTermFilter=ruleTypedTermFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedTermFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypedTermFilter"


    // $ANTLR start "ruleTypedTermFilter"
    // InternalEtlParser.g:5386:1: ruleTypedTermFilter returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_clause_1_0= ruleTypedTermFilterClause ) ) ) ;
    public final EObject ruleTypedTermFilter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_clause_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:5392:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_clause_1_0= ruleTypedTermFilterClause ) ) ) )
            // InternalEtlParser.g:5393:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_clause_1_0= ruleTypedTermFilterClause ) ) )
            {
            // InternalEtlParser.g:5393:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_clause_1_0= ruleTypedTermFilterClause ) ) )
            // InternalEtlParser.g:5394:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_clause_1_0= ruleTypedTermFilterClause ) )
            {
            // InternalEtlParser.g:5394:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEtlParser.g:5395:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:5395:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEtlParser.g:5396:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTermFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_op_0_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedTermFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:5413:3: ( (lv_clause_1_0= ruleTypedTermFilterClause ) )
            // InternalEtlParser.g:5414:4: (lv_clause_1_0= ruleTypedTermFilterClause )
            {
            // InternalEtlParser.g:5414:4: (lv_clause_1_0= ruleTypedTermFilterClause )
            // InternalEtlParser.g:5415:5: lv_clause_1_0= ruleTypedTermFilterClause
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTermFilterAccess().getClauseTypedTermFilterClauseParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_clause_1_0=ruleTypedTermFilterClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedTermFilterRule());
              					}
              					set(
              						current,
              						"clause",
              						lv_clause_1_0,
              						"com.b2international.snomed.ecl.Ecl.TypedTermFilterClause");
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
    // $ANTLR end "ruleTypedTermFilter"


    // $ANTLR start "entryRuleTypedTermFilterSet"
    // InternalEtlParser.g:5436:1: entryRuleTypedTermFilterSet returns [EObject current=null] : iv_ruleTypedTermFilterSet= ruleTypedTermFilterSet EOF ;
    public final EObject entryRuleTypedTermFilterSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTermFilterSet = null;


        try {
            // InternalEtlParser.g:5436:59: (iv_ruleTypedTermFilterSet= ruleTypedTermFilterSet EOF )
            // InternalEtlParser.g:5437:2: iv_ruleTypedTermFilterSet= ruleTypedTermFilterSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedTermFilterSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedTermFilterSet=ruleTypedTermFilterSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedTermFilterSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypedTermFilterSet"


    // $ANTLR start "ruleTypedTermFilterSet"
    // InternalEtlParser.g:5443:1: ruleTypedTermFilterSet returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_clauses_2_0= ruleTypedTermFilterClause ) )+ this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) ;
    public final EObject ruleTypedTermFilterSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_1=null;
        Token this_ROUND_CLOSE_3=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_clauses_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:5449:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_clauses_2_0= ruleTypedTermFilterClause ) )+ this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) )
            // InternalEtlParser.g:5450:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_clauses_2_0= ruleTypedTermFilterClause ) )+ this_ROUND_CLOSE_3= RULE_ROUND_CLOSE )
            {
            // InternalEtlParser.g:5450:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_clauses_2_0= ruleTypedTermFilterClause ) )+ this_ROUND_CLOSE_3= RULE_ROUND_CLOSE )
            // InternalEtlParser.g:5451:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_clauses_2_0= ruleTypedTermFilterClause ) )+ this_ROUND_CLOSE_3= RULE_ROUND_CLOSE
            {
            // InternalEtlParser.g:5451:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEtlParser.g:5452:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:5452:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEtlParser.g:5453:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTermFilterSetAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_56);
            lv_op_0_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedTermFilterSetRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ROUND_OPEN_1=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_1, grammarAccess.getTypedTermFilterSetAccess().getROUND_OPENTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:5474:3: ( (lv_clauses_2_0= ruleTypedTermFilterClause ) )+
            int cnt82=0;
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_STRING||LA82_0==RULE_EXACT_KEYWORD||(LA82_0>=RULE_MATCH_KEYWORD && LA82_0<=RULE_REGEX_KEYWORD)||LA82_0==RULE_WILD_KEYWORD) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalEtlParser.g:5475:4: (lv_clauses_2_0= ruleTypedTermFilterClause )
            	    {
            	    // InternalEtlParser.g:5475:4: (lv_clauses_2_0= ruleTypedTermFilterClause )
            	    // InternalEtlParser.g:5476:5: lv_clauses_2_0= ruleTypedTermFilterClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTypedTermFilterSetAccess().getClausesTypedTermFilterClauseParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_57);
            	    lv_clauses_2_0=ruleTypedTermFilterClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTypedTermFilterSetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"clauses",
            	      						lv_clauses_2_0,
            	      						"com.b2international.snomed.ecl.Ecl.TypedTermFilterClause");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt82 >= 1 ) break loop82;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(82, input);
                        throw eee;
                }
                cnt82++;
            } while (true);

            this_ROUND_CLOSE_3=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_3, grammarAccess.getTypedTermFilterSetAccess().getROUND_CLOSETerminalRuleCall_3());
              		
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
    // $ANTLR end "ruleTypedTermFilterSet"


    // $ANTLR start "entryRuleTypedTermFilterClause"
    // InternalEtlParser.g:5501:1: entryRuleTypedTermFilterClause returns [EObject current=null] : iv_ruleTypedTermFilterClause= ruleTypedTermFilterClause EOF ;
    public final EObject entryRuleTypedTermFilterClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTermFilterClause = null;


        try {
            // InternalEtlParser.g:5501:62: (iv_ruleTypedTermFilterClause= ruleTypedTermFilterClause EOF )
            // InternalEtlParser.g:5502:2: iv_ruleTypedTermFilterClause= ruleTypedTermFilterClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedTermFilterClauseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedTermFilterClause=ruleTypedTermFilterClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedTermFilterClause; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypedTermFilterClause"


    // $ANTLR start "ruleTypedTermFilterClause"
    // InternalEtlParser.g:5508:1: ruleTypedTermFilterClause returns [EObject current=null] : ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) ) ;
    public final EObject ruleTypedTermFilterClause() throws RecognitionException {
        EObject current = null;

        Token this_COLON_1=null;
        Token lv_term_2_0=null;
        Token lv_lexicalSearchType_3_0=null;
        Token this_COLON_4=null;
        AntlrDatatypeRuleToken lv_lexicalSearchType_0_0 = null;

        AntlrDatatypeRuleToken lv_term_5_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:5514:2: ( ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) ) )
            // InternalEtlParser.g:5515:2: ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) )
            {
            // InternalEtlParser.g:5515:2: ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_STRING||LA84_0==RULE_EXACT_KEYWORD||LA84_0==RULE_MATCH_KEYWORD||LA84_0==RULE_WILD_KEYWORD) ) {
                alt84=1;
            }
            else if ( (LA84_0==RULE_REGEX_KEYWORD) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalEtlParser.g:5516:3: ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) )
                    {
                    // InternalEtlParser.g:5516:3: ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) )
                    // InternalEtlParser.g:5517:4: ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) )
                    {
                    // InternalEtlParser.g:5517:4: ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==RULE_EXACT_KEYWORD||LA83_0==RULE_MATCH_KEYWORD||LA83_0==RULE_WILD_KEYWORD) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalEtlParser.g:5518:5: ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON
                            {
                            // InternalEtlParser.g:5518:5: ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) )
                            // InternalEtlParser.g:5519:6: (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE )
                            {
                            // InternalEtlParser.g:5519:6: (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE )
                            // InternalEtlParser.g:5520:7: lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypedTermFilterClauseAccess().getLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_0_0_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_58);
                            lv_lexicalSearchType_0_0=ruleLEXICAL_SEARCH_TYPE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTypedTermFilterClauseRule());
                              							}
                              							set(
                              								current,
                              								"lexicalSearchType",
                              								lv_lexicalSearchType_0_0,
                              								"com.b2international.snomed.ecl.Ecl.LEXICAL_SEARCH_TYPE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            this_COLON_1=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_COLON_1, grammarAccess.getTypedTermFilterClauseAccess().getCOLONTerminalRuleCall_0_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalEtlParser.g:5542:4: ( (lv_term_2_0= RULE_STRING ) )
                    // InternalEtlParser.g:5543:5: (lv_term_2_0= RULE_STRING )
                    {
                    // InternalEtlParser.g:5543:5: (lv_term_2_0= RULE_STRING )
                    // InternalEtlParser.g:5544:6: lv_term_2_0= RULE_STRING
                    {
                    lv_term_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_term_2_0, grammarAccess.getTypedTermFilterClauseAccess().getTermSTRINGTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypedTermFilterClauseRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"term",
                      							lv_term_2_0,
                      							"com.b2international.snomed.ecl.Ecl.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:5562:3: ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) )
                    {
                    // InternalEtlParser.g:5562:3: ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) )
                    // InternalEtlParser.g:5563:4: ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) )
                    {
                    // InternalEtlParser.g:5563:4: ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) )
                    // InternalEtlParser.g:5564:5: (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD )
                    {
                    // InternalEtlParser.g:5564:5: (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD )
                    // InternalEtlParser.g:5565:6: lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD
                    {
                    lv_lexicalSearchType_3_0=(Token)match(input,RULE_REGEX_KEYWORD,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_lexicalSearchType_3_0, grammarAccess.getTypedTermFilterClauseAccess().getLexicalSearchTypeREGEX_KEYWORDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypedTermFilterClauseRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"lexicalSearchType",
                      							lv_lexicalSearchType_3_0,
                      							"com.b2international.snomed.ecl.Ecl.REGEX_KEYWORD");
                      					
                    }

                    }


                    }

                    this_COLON_4=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_COLON_4, grammarAccess.getTypedTermFilterClauseAccess().getCOLONTerminalRuleCall_1_1());
                      			
                    }
                    // InternalEtlParser.g:5585:4: ( (lv_term_5_0= ruleRegularExpression ) )
                    // InternalEtlParser.g:5586:5: (lv_term_5_0= ruleRegularExpression )
                    {
                    // InternalEtlParser.g:5586:5: (lv_term_5_0= ruleRegularExpression )
                    // InternalEtlParser.g:5587:6: lv_term_5_0= ruleRegularExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypedTermFilterClauseAccess().getTermRegularExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_term_5_0=ruleRegularExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypedTermFilterClauseRule());
                      						}
                      						set(
                      							current,
                      							"term",
                      							lv_term_5_0,
                      							"com.b2international.snomed.ecl.Ecl.RegularExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


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
    // $ANTLR end "ruleTypedTermFilterClause"


    // $ANTLR start "entryRuleRegularExpression"
    // InternalEtlParser.g:5609:1: entryRuleRegularExpression returns [String current=null] : iv_ruleRegularExpression= ruleRegularExpression EOF ;
    public final String entryRuleRegularExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRegularExpression = null;


        try {
            // InternalEtlParser.g:5609:57: (iv_ruleRegularExpression= ruleRegularExpression EOF )
            // InternalEtlParser.g:5610:2: iv_ruleRegularExpression= ruleRegularExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRegularExpression=ruleRegularExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularExpression.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRegularExpression"


    // $ANTLR start "ruleRegularExpression"
    // InternalEtlParser.g:5616:1: ruleRegularExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleRegularExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalEtlParser.g:5622:2: (this_STRING_0= RULE_STRING )
            // InternalEtlParser.g:5623:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getRegularExpressionAccess().getSTRINGTerminalRuleCall());
              	
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
    // $ANTLR end "ruleRegularExpression"


    // $ANTLR start "entryRuleLanguageFilter"
    // InternalEtlParser.g:5633:1: entryRuleLanguageFilter returns [EObject current=null] : iv_ruleLanguageFilter= ruleLanguageFilter EOF ;
    public final EObject entryRuleLanguageFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageFilter = null;


        try {
            // InternalEtlParser.g:5633:55: (iv_ruleLanguageFilter= ruleLanguageFilter EOF )
            // InternalEtlParser.g:5634:2: iv_ruleLanguageFilter= ruleLanguageFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLanguageFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLanguageFilter=ruleLanguageFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLanguageFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLanguageFilter"


    // $ANTLR start "ruleLanguageFilter"
    // InternalEtlParser.g:5640:1: ruleLanguageFilter returns [EObject current=null] : (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleLanguageFilter() throws RecognitionException {
        EObject current = null;

        Token this_LANGUAGE_KEYWORD_0=null;
        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_5=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_languageCodes_2_0 = null;

        AntlrDatatypeRuleToken lv_languageCodes_4_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:5646:2: ( (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEtlParser.g:5647:2: (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEtlParser.g:5647:2: (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEtlParser.g:5648:3: this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_LANGUAGE_KEYWORD_0=(Token)match(input,RULE_LANGUAGE_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LANGUAGE_KEYWORD_0, grammarAccess.getLanguageFilterAccess().getLANGUAGE_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:5652:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEtlParser.g:5653:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:5653:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEtlParser.g:5654:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLanguageFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_59);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLanguageFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:5671:3: ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=RULE_CASE_SIGNIFICANCE_ID_KEYWORD && LA86_0<=RULE_KEYWORD)) ) {
                alt86=1;
            }
            else if ( (LA86_0==RULE_ROUND_OPEN) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalEtlParser.g:5672:4: ( (lv_languageCodes_2_0= ruleUnquotedString ) )
                    {
                    // InternalEtlParser.g:5672:4: ( (lv_languageCodes_2_0= ruleUnquotedString ) )
                    // InternalEtlParser.g:5673:5: (lv_languageCodes_2_0= ruleUnquotedString )
                    {
                    // InternalEtlParser.g:5673:5: (lv_languageCodes_2_0= ruleUnquotedString )
                    // InternalEtlParser.g:5674:6: lv_languageCodes_2_0= ruleUnquotedString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_languageCodes_2_0=ruleUnquotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLanguageFilterRule());
                      						}
                      						add(
                      							current,
                      							"languageCodes",
                      							lv_languageCodes_2_0,
                      							"com.b2international.snomed.ecl.Ecl.UnquotedString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:5692:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEtlParser.g:5692:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEtlParser.g:5693:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getLanguageFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEtlParser.g:5697:5: ( (lv_languageCodes_4_0= ruleUnquotedString ) )+
                    int cnt85=0;
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( ((LA85_0>=RULE_CASE_SIGNIFICANCE_ID_KEYWORD && LA85_0<=RULE_KEYWORD)) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalEtlParser.g:5698:6: (lv_languageCodes_4_0= ruleUnquotedString )
                    	    {
                    	    // InternalEtlParser.g:5698:6: (lv_languageCodes_4_0= ruleUnquotedString )
                    	    // InternalEtlParser.g:5699:7: lv_languageCodes_4_0= ruleUnquotedString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_61);
                    	    lv_languageCodes_4_0=ruleUnquotedString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getLanguageFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"languageCodes",
                    	      								lv_languageCodes_4_0,
                    	      								"com.b2international.snomed.ecl.Ecl.UnquotedString");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt85 >= 1 ) break loop85;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(85, input);
                                throw eee;
                        }
                        cnt85++;
                    } while (true);

                    this_ROUND_CLOSE_5=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getLanguageFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
                      				
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
    // $ANTLR end "ruleLanguageFilter"


    // $ANTLR start "entryRuleTypeFilter"
    // InternalEtlParser.g:5726:1: entryRuleTypeFilter returns [EObject current=null] : iv_ruleTypeFilter= ruleTypeFilter EOF ;
    public final EObject entryRuleTypeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeFilter = null;


        try {
            // InternalEtlParser.g:5726:51: (iv_ruleTypeFilter= ruleTypeFilter EOF )
            // InternalEtlParser.g:5727:2: iv_ruleTypeFilter= ruleTypeFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeFilter=ruleTypeFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeFilter"


    // $ANTLR start "ruleTypeFilter"
    // InternalEtlParser.g:5733:1: ruleTypeFilter returns [EObject current=null] : (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter ) ;
    public final EObject ruleTypeFilter() throws RecognitionException {
        EObject current = null;

        EObject this_TypeIdFilter_0 = null;

        EObject this_TypeTokenFilter_1 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:5739:2: ( (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter ) )
            // InternalEtlParser.g:5740:2: (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter )
            {
            // InternalEtlParser.g:5740:2: (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_TYPEID_KEYWORD) ) {
                alt87=1;
            }
            else if ( (LA87_0==RULE_TYPE_KEYWORD) ) {
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
                    // InternalEtlParser.g:5741:3: this_TypeIdFilter_0= ruleTypeIdFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeFilterAccess().getTypeIdFilterParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeIdFilter_0=ruleTypeIdFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeIdFilter_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:5753:3: this_TypeTokenFilter_1= ruleTypeTokenFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeFilterAccess().getTypeTokenFilterParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeTokenFilter_1=ruleTypeTokenFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeTokenFilter_1;
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
    // $ANTLR end "ruleTypeFilter"


    // $ANTLR start "entryRuleTypeIdFilter"
    // InternalEtlParser.g:5768:1: entryRuleTypeIdFilter returns [EObject current=null] : iv_ruleTypeIdFilter= ruleTypeIdFilter EOF ;
    public final EObject entryRuleTypeIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeIdFilter = null;


        try {
            // InternalEtlParser.g:5768:53: (iv_ruleTypeIdFilter= ruleTypeIdFilter EOF )
            // InternalEtlParser.g:5769:2: iv_ruleTypeIdFilter= ruleTypeIdFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeIdFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeIdFilter=ruleTypeIdFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeIdFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeIdFilter"


    // $ANTLR start "ruleTypeIdFilter"
    // InternalEtlParser.g:5775:1: ruleTypeIdFilter returns [EObject current=null] : (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleTypeIdFilter() throws RecognitionException {
        EObject current = null;

        Token this_TYPEID_KEYWORD_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:5781:2: ( (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) ) )
            // InternalEtlParser.g:5782:2: (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) )
            {
            // InternalEtlParser.g:5782:2: (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) )
            // InternalEtlParser.g:5783:3: this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) )
            {
            this_TYPEID_KEYWORD_0=(Token)match(input,RULE_TYPEID_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TYPEID_KEYWORD_0, grammarAccess.getTypeIdFilterAccess().getTYPEID_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:5787:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEtlParser.g:5788:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:5788:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEtlParser.g:5789:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeIdFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:5806:3: ( (lv_type_2_0= ruleFilterValue ) )
            // InternalEtlParser.g:5807:4: (lv_type_2_0= ruleFilterValue )
            {
            // InternalEtlParser.g:5807:4: (lv_type_2_0= ruleFilterValue )
            // InternalEtlParser.g:5808:5: lv_type_2_0= ruleFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeIdFilterAccess().getTypeFilterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_type_2_0=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeIdFilterRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilterValue");
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
    // $ANTLR end "ruleTypeIdFilter"


    // $ANTLR start "entryRuleTypeTokenFilter"
    // InternalEtlParser.g:5829:1: entryRuleTypeTokenFilter returns [EObject current=null] : iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF ;
    public final EObject entryRuleTypeTokenFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTokenFilter = null;


        try {
            // InternalEtlParser.g:5829:56: (iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF )
            // InternalEtlParser.g:5830:2: iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeTokenFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeTokenFilter=ruleTypeTokenFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeTokenFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeTokenFilter"


    // $ANTLR start "ruleTypeTokenFilter"
    // InternalEtlParser.g:5836:1: ruleTypeTokenFilter returns [EObject current=null] : (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleTypeTokenFilter() throws RecognitionException {
        EObject current = null;

        Token this_TYPE_KEYWORD_0=null;
        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_5=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_tokens_2_0 = null;

        AntlrDatatypeRuleToken lv_tokens_4_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:5842:2: ( (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEtlParser.g:5843:2: (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEtlParser.g:5843:2: (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEtlParser.g:5844:3: this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_TYPE_KEYWORD_0=(Token)match(input,RULE_TYPE_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TYPE_KEYWORD_0, grammarAccess.getTypeTokenFilterAccess().getTYPE_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:5848:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEtlParser.g:5849:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:5849:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEtlParser.g:5850:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_59);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeTokenFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:5867:3: ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=RULE_CASE_SIGNIFICANCE_ID_KEYWORD && LA89_0<=RULE_KEYWORD)) ) {
                alt89=1;
            }
            else if ( (LA89_0==RULE_ROUND_OPEN) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalEtlParser.g:5868:4: ( (lv_tokens_2_0= ruleUnquotedString ) )
                    {
                    // InternalEtlParser.g:5868:4: ( (lv_tokens_2_0= ruleUnquotedString ) )
                    // InternalEtlParser.g:5869:5: (lv_tokens_2_0= ruleUnquotedString )
                    {
                    // InternalEtlParser.g:5869:5: (lv_tokens_2_0= ruleUnquotedString )
                    // InternalEtlParser.g:5870:6: lv_tokens_2_0= ruleUnquotedString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_tokens_2_0=ruleUnquotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeTokenFilterRule());
                      						}
                      						add(
                      							current,
                      							"tokens",
                      							lv_tokens_2_0,
                      							"com.b2international.snomed.ecl.Ecl.UnquotedString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:5888:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEtlParser.g:5888:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEtlParser.g:5889:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getTypeTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEtlParser.g:5893:5: ( (lv_tokens_4_0= ruleUnquotedString ) )+
                    int cnt88=0;
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( ((LA88_0>=RULE_CASE_SIGNIFICANCE_ID_KEYWORD && LA88_0<=RULE_KEYWORD)) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalEtlParser.g:5894:6: (lv_tokens_4_0= ruleUnquotedString )
                    	    {
                    	    // InternalEtlParser.g:5894:6: (lv_tokens_4_0= ruleUnquotedString )
                    	    // InternalEtlParser.g:5895:7: lv_tokens_4_0= ruleUnquotedString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_61);
                    	    lv_tokens_4_0=ruleUnquotedString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTypeTokenFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"tokens",
                    	      								lv_tokens_4_0,
                    	      								"com.b2international.snomed.ecl.Ecl.UnquotedString");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt88 >= 1 ) break loop88;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(88, input);
                                throw eee;
                        }
                        cnt88++;
                    } while (true);

                    this_ROUND_CLOSE_5=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getTypeTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
                      				
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
    // $ANTLR end "ruleTypeTokenFilter"


    // $ANTLR start "entryRuleDialectFilter"
    // InternalEtlParser.g:5922:1: entryRuleDialectFilter returns [EObject current=null] : iv_ruleDialectFilter= ruleDialectFilter EOF ;
    public final EObject entryRuleDialectFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectFilter = null;


        try {
            // InternalEtlParser.g:5922:54: (iv_ruleDialectFilter= ruleDialectFilter EOF )
            // InternalEtlParser.g:5923:2: iv_ruleDialectFilter= ruleDialectFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDialectFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDialectFilter=ruleDialectFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDialectFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDialectFilter"


    // $ANTLR start "ruleDialectFilter"
    // InternalEtlParser.g:5929:1: ruleDialectFilter returns [EObject current=null] : (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter ) ;
    public final EObject ruleDialectFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DialectIdFilter_0 = null;

        EObject this_DialectAliasFilter_1 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:5935:2: ( (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter ) )
            // InternalEtlParser.g:5936:2: (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter )
            {
            // InternalEtlParser.g:5936:2: (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_DIALECTID_KEYWORD) ) {
                alt90=1;
            }
            else if ( (LA90_0==RULE_DIALECT_KEYWORD) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalEtlParser.g:5937:3: this_DialectIdFilter_0= ruleDialectIdFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDialectFilterAccess().getDialectIdFilterParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DialectIdFilter_0=ruleDialectIdFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DialectIdFilter_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:5949:3: this_DialectAliasFilter_1= ruleDialectAliasFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDialectFilterAccess().getDialectAliasFilterParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DialectAliasFilter_1=ruleDialectAliasFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DialectAliasFilter_1;
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
    // $ANTLR end "ruleDialectFilter"


    // $ANTLR start "entryRuleDialectIdFilter"
    // InternalEtlParser.g:5964:1: entryRuleDialectIdFilter returns [EObject current=null] : iv_ruleDialectIdFilter= ruleDialectIdFilter EOF ;
    public final EObject entryRuleDialectIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectIdFilter = null;


        try {
            // InternalEtlParser.g:5964:56: (iv_ruleDialectIdFilter= ruleDialectIdFilter EOF )
            // InternalEtlParser.g:5965:2: iv_ruleDialectIdFilter= ruleDialectIdFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDialectIdFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDialectIdFilter=ruleDialectIdFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDialectIdFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDialectIdFilter"


    // $ANTLR start "ruleDialectIdFilter"
    // InternalEtlParser.g:5971:1: ruleDialectIdFilter returns [EObject current=null] : (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleDialectIdFilter() throws RecognitionException {
        EObject current = null;

        Token this_DIALECTID_KEYWORD_0=null;
        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_5=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_dialects_2_0 = null;

        EObject lv_dialects_4_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:5977:2: ( (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEtlParser.g:5978:2: (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEtlParser.g:5978:2: (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEtlParser.g:5979:3: this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_DIALECTID_KEYWORD_0=(Token)match(input,RULE_DIALECTID_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DIALECTID_KEYWORD_0, grammarAccess.getDialectIdFilterAccess().getDIALECTID_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:5983:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEtlParser.g:5984:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:5984:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEtlParser.g:5985:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDialectIdFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:6002:3: ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // InternalEtlParser.g:6003:4: ( (lv_dialects_2_0= ruleDialect ) )
                    {
                    // InternalEtlParser.g:6003:4: ( (lv_dialects_2_0= ruleDialect ) )
                    // InternalEtlParser.g:6004:5: (lv_dialects_2_0= ruleDialect )
                    {
                    // InternalEtlParser.g:6004:5: (lv_dialects_2_0= ruleDialect )
                    // InternalEtlParser.g:6005:6: lv_dialects_2_0= ruleDialect
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_dialects_2_0=ruleDialect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDialectIdFilterRule());
                      						}
                      						add(
                      							current,
                      							"dialects",
                      							lv_dialects_2_0,
                      							"com.b2international.snomed.ecl.Ecl.Dialect");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:6023:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEtlParser.g:6023:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEtlParser.g:6024:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectIdFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEtlParser.g:6028:5: ( (lv_dialects_4_0= ruleDialect ) )+
                    int cnt91=0;
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( ((LA91_0>=RULE_DBL_LT_EM && LA91_0<=RULE_GT_EM)||(LA91_0>=RULE_DIGIT_ZERO && LA91_0<=RULE_DIGIT_NONZERO)||LA91_0==RULE_ROUND_OPEN||LA91_0==RULE_CARET||LA91_0==RULE_WILDCARD||(LA91_0>=RULE_LT && LA91_0<=RULE_GT)) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalEtlParser.g:6029:6: (lv_dialects_4_0= ruleDialect )
                    	    {
                    	    // InternalEtlParser.g:6029:6: (lv_dialects_4_0= ruleDialect )
                    	    // InternalEtlParser.g:6030:7: lv_dialects_4_0= ruleDialect
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_62);
                    	    lv_dialects_4_0=ruleDialect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDialectIdFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"dialects",
                    	      								lv_dialects_4_0,
                    	      								"com.b2international.snomed.ecl.Ecl.Dialect");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt91 >= 1 ) break loop91;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(91, input);
                                throw eee;
                        }
                        cnt91++;
                    } while (true);

                    this_ROUND_CLOSE_5=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getDialectIdFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
                      				
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
    // $ANTLR end "ruleDialectIdFilter"


    // $ANTLR start "entryRuleDialectAliasFilter"
    // InternalEtlParser.g:6057:1: entryRuleDialectAliasFilter returns [EObject current=null] : iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF ;
    public final EObject entryRuleDialectAliasFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectAliasFilter = null;


        try {
            // InternalEtlParser.g:6057:59: (iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF )
            // InternalEtlParser.g:6058:2: iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDialectAliasFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDialectAliasFilter=ruleDialectAliasFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDialectAliasFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDialectAliasFilter"


    // $ANTLR start "ruleDialectAliasFilter"
    // InternalEtlParser.g:6064:1: ruleDialectAliasFilter returns [EObject current=null] : (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleDialectAliasFilter() throws RecognitionException {
        EObject current = null;

        Token this_DIALECT_KEYWORD_0=null;
        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_5=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_dialects_2_0 = null;

        EObject lv_dialects_4_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6070:2: ( (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEtlParser.g:6071:2: (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEtlParser.g:6071:2: (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEtlParser.g:6072:3: this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_DIALECT_KEYWORD_0=(Token)match(input,RULE_DIALECT_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DIALECT_KEYWORD_0, grammarAccess.getDialectAliasFilterAccess().getDIALECT_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:6076:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEtlParser.g:6077:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:6077:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEtlParser.g:6078:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_63);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDialectAliasFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:6095:3: ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=RULE_CASE_SIGNIFICANCE_ID_KEYWORD && LA94_0<=RULE_KEYWORD)||(LA94_0>=RULE_DIGIT_ZERO && LA94_0<=RULE_DIGIT_NONZERO)||LA94_0==RULE_DASH) ) {
                alt94=1;
            }
            else if ( (LA94_0==RULE_ROUND_OPEN) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalEtlParser.g:6096:4: ( (lv_dialects_2_0= ruleDialectAlias ) )
                    {
                    // InternalEtlParser.g:6096:4: ( (lv_dialects_2_0= ruleDialectAlias ) )
                    // InternalEtlParser.g:6097:5: (lv_dialects_2_0= ruleDialectAlias )
                    {
                    // InternalEtlParser.g:6097:5: (lv_dialects_2_0= ruleDialectAlias )
                    // InternalEtlParser.g:6098:6: lv_dialects_2_0= ruleDialectAlias
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_dialects_2_0=ruleDialectAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDialectAliasFilterRule());
                      						}
                      						add(
                      							current,
                      							"dialects",
                      							lv_dialects_2_0,
                      							"com.b2international.snomed.ecl.Ecl.DialectAlias");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:6116:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEtlParser.g:6116:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEtlParser.g:6117:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectAliasFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEtlParser.g:6121:5: ( (lv_dialects_4_0= ruleDialectAlias ) )+
                    int cnt93=0;
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( ((LA93_0>=RULE_CASE_SIGNIFICANCE_ID_KEYWORD && LA93_0<=RULE_KEYWORD)||(LA93_0>=RULE_DIGIT_ZERO && LA93_0<=RULE_DIGIT_NONZERO)||LA93_0==RULE_DASH) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalEtlParser.g:6122:6: (lv_dialects_4_0= ruleDialectAlias )
                    	    {
                    	    // InternalEtlParser.g:6122:6: (lv_dialects_4_0= ruleDialectAlias )
                    	    // InternalEtlParser.g:6123:7: lv_dialects_4_0= ruleDialectAlias
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_65);
                    	    lv_dialects_4_0=ruleDialectAlias();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDialectAliasFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"dialects",
                    	      								lv_dialects_4_0,
                    	      								"com.b2international.snomed.ecl.Ecl.DialectAlias");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt93 >= 1 ) break loop93;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(93, input);
                                throw eee;
                        }
                        cnt93++;
                    } while (true);

                    this_ROUND_CLOSE_5=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getDialectAliasFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
                      				
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
    // $ANTLR end "ruleDialectAliasFilter"


    // $ANTLR start "entryRuleDialect"
    // InternalEtlParser.g:6150:1: entryRuleDialect returns [EObject current=null] : iv_ruleDialect= ruleDialect EOF ;
    public final EObject entryRuleDialect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialect = null;


        try {
            // InternalEtlParser.g:6150:48: (iv_ruleDialect= ruleDialect EOF )
            // InternalEtlParser.g:6151:2: iv_ruleDialect= ruleDialect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDialectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDialect=ruleDialect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDialect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDialect"


    // $ANTLR start "ruleDialect"
    // InternalEtlParser.g:6157:1: ruleDialect returns [EObject current=null] : ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) ;
    public final EObject ruleDialect() throws RecognitionException {
        EObject current = null;

        EObject lv_languageRefSetId_0_0 = null;

        EObject lv_acceptability_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6163:2: ( ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) )
            // InternalEtlParser.g:6164:2: ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            {
            // InternalEtlParser.g:6164:2: ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            // InternalEtlParser.g:6165:3: ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )?
            {
            // InternalEtlParser.g:6165:3: ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) )
            // InternalEtlParser.g:6166:4: (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint )
            {
            // InternalEtlParser.g:6166:4: (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint )
            // InternalEtlParser.g:6167:5: lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAccess().getLanguageRefSetIdFilteredExpressionConstraintParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_66);
            lv_languageRefSetId_0_0=ruleFilteredExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDialectRule());
              					}
              					set(
              						current,
              						"languageRefSetId",
              						lv_languageRefSetId_0_0,
              						"com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:6184:3: ( (lv_acceptability_1_0= ruleAcceptability ) )?
            int alt95=2;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // InternalEtlParser.g:6185:4: (lv_acceptability_1_0= ruleAcceptability )
                    {
                    // InternalEtlParser.g:6185:4: (lv_acceptability_1_0= ruleAcceptability )
                    // InternalEtlParser.g:6186:5: lv_acceptability_1_0= ruleAcceptability
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDialectAccess().getAcceptabilityAcceptabilityParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_acceptability_1_0=ruleAcceptability();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDialectRule());
                      					}
                      					set(
                      						current,
                      						"acceptability",
                      						lv_acceptability_1_0,
                      						"com.b2international.snomed.ecl.Ecl.Acceptability");
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
    // $ANTLR end "ruleDialect"


    // $ANTLR start "entryRuleDialectAlias"
    // InternalEtlParser.g:6207:1: entryRuleDialectAlias returns [EObject current=null] : iv_ruleDialectAlias= ruleDialectAlias EOF ;
    public final EObject entryRuleDialectAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectAlias = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:6209:2: (iv_ruleDialectAlias= ruleDialectAlias EOF )
            // InternalEtlParser.g:6210:2: iv_ruleDialectAlias= ruleDialectAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDialectAliasRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDialectAlias=ruleDialectAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDialectAlias; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDialectAlias"


    // $ANTLR start "ruleDialectAlias"
    // InternalEtlParser.g:6219:1: ruleDialectAlias returns [EObject current=null] : ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )? ) ;
    public final EObject ruleDialectAlias() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        AntlrDatatypeRuleToken lv_alias_0_0 = null;

        EObject lv_acceptability_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:6226:2: ( ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )? ) )
            // InternalEtlParser.g:6227:2: ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )? )
            {
            // InternalEtlParser.g:6227:2: ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )? )
            // InternalEtlParser.g:6228:3: ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )?
            {
            // InternalEtlParser.g:6228:3: ( (lv_alias_0_0= ruleDialectAliasValue ) )
            // InternalEtlParser.g:6229:4: (lv_alias_0_0= ruleDialectAliasValue )
            {
            // InternalEtlParser.g:6229:4: (lv_alias_0_0= ruleDialectAliasValue )
            // InternalEtlParser.g:6230:5: lv_alias_0_0= ruleDialectAliasValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAliasAccess().getAliasDialectAliasValueParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_67);
            lv_alias_0_0=ruleDialectAliasValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDialectAliasRule());
              					}
              					set(
              						current,
              						"alias",
              						lv_alias_0_0,
              						"com.b2international.snomed.ecl.Ecl.DialectAliasValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:6247:3: (this_WS_1= RULE_WS )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==RULE_WS) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalEtlParser.g:6248:4: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_1, grammarAccess.getDialectAliasAccess().getWSTerminalRuleCall_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            // InternalEtlParser.g:6253:3: ( (lv_acceptability_2_0= ruleAcceptability ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_ROUND_OPEN) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalEtlParser.g:6254:4: (lv_acceptability_2_0= ruleAcceptability )
                    {
                    // InternalEtlParser.g:6254:4: (lv_acceptability_2_0= ruleAcceptability )
                    // InternalEtlParser.g:6255:5: lv_acceptability_2_0= ruleAcceptability
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDialectAliasAccess().getAcceptabilityAcceptabilityParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_acceptability_2_0=ruleAcceptability();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDialectAliasRule());
                      					}
                      					set(
                      						current,
                      						"acceptability",
                      						lv_acceptability_2_0,
                      						"com.b2international.snomed.ecl.Ecl.Acceptability");
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDialectAlias"


    // $ANTLR start "entryRuleAcceptability"
    // InternalEtlParser.g:6279:1: entryRuleAcceptability returns [EObject current=null] : iv_ruleAcceptability= ruleAcceptability EOF ;
    public final EObject entryRuleAcceptability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptability = null;


        try {
            // InternalEtlParser.g:6279:54: (iv_ruleAcceptability= ruleAcceptability EOF )
            // InternalEtlParser.g:6280:2: iv_ruleAcceptability= ruleAcceptability EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAcceptabilityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAcceptability=ruleAcceptability();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAcceptability; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAcceptability"


    // $ANTLR start "ruleAcceptability"
    // InternalEtlParser.g:6286:1: ruleAcceptability returns [EObject current=null] : (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet ) ;
    public final EObject ruleAcceptability() throws RecognitionException {
        EObject current = null;

        EObject this_AcceptabilityIdSet_0 = null;

        EObject this_AcceptabilityTokenSet_1 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6292:2: ( (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet ) )
            // InternalEtlParser.g:6293:2: (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet )
            {
            // InternalEtlParser.g:6293:2: (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_ROUND_OPEN) ) {
                int LA98_1 = input.LA(2);

                if ( ((LA98_1>=RULE_CASE_SIGNIFICANCE_ID_KEYWORD && LA98_1<=RULE_KEYWORD)) ) {
                    alt98=2;
                }
                else if ( ((LA98_1>=RULE_DIGIT_ZERO && LA98_1<=RULE_DIGIT_NONZERO)) ) {
                    alt98=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalEtlParser.g:6294:3: this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAcceptabilityAccess().getAcceptabilityIdSetParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AcceptabilityIdSet_0=ruleAcceptabilityIdSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AcceptabilityIdSet_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:6306:3: this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAcceptabilityAccess().getAcceptabilityTokenSetParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AcceptabilityTokenSet_1=ruleAcceptabilityTokenSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AcceptabilityTokenSet_1;
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
    // $ANTLR end "ruleAcceptability"


    // $ANTLR start "entryRuleAcceptabilityIdSet"
    // InternalEtlParser.g:6321:1: entryRuleAcceptabilityIdSet returns [EObject current=null] : iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF ;
    public final EObject entryRuleAcceptabilityIdSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptabilityIdSet = null;


        try {
            // InternalEtlParser.g:6321:59: (iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF )
            // InternalEtlParser.g:6322:2: iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAcceptabilityIdSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAcceptabilityIdSet=ruleAcceptabilityIdSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAcceptabilityIdSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAcceptabilityIdSet"


    // $ANTLR start "ruleAcceptabilityIdSet"
    // InternalEtlParser.g:6328:1: ruleAcceptabilityIdSet returns [EObject current=null] : ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) ) ;
    public final EObject ruleAcceptabilityIdSet() throws RecognitionException {
        EObject current = null;

        EObject lv_acceptabilities_0_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6334:2: ( ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) ) )
            // InternalEtlParser.g:6335:2: ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) )
            {
            // InternalEtlParser.g:6335:2: ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) )
            // InternalEtlParser.g:6336:3: (lv_acceptabilities_0_0= ruleEclConceptReferenceSet )
            {
            // InternalEtlParser.g:6336:3: (lv_acceptabilities_0_0= ruleEclConceptReferenceSet )
            // InternalEtlParser.g:6337:4: lv_acceptabilities_0_0= ruleEclConceptReferenceSet
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAcceptabilityIdSetAccess().getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_acceptabilities_0_0=ruleEclConceptReferenceSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getAcceptabilityIdSetRule());
              				}
              				set(
              					current,
              					"acceptabilities",
              					lv_acceptabilities_0_0,
              					"com.b2international.snomed.ecl.Ecl.EclConceptReferenceSet");
              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleAcceptabilityIdSet"


    // $ANTLR start "entryRuleAcceptabilityTokenSet"
    // InternalEtlParser.g:6357:1: entryRuleAcceptabilityTokenSet returns [EObject current=null] : iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF ;
    public final EObject entryRuleAcceptabilityTokenSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptabilityTokenSet = null;


        try {
            // InternalEtlParser.g:6357:62: (iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF )
            // InternalEtlParser.g:6358:2: iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAcceptabilityTokenSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAcceptabilityTokenSet=ruleAcceptabilityTokenSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAcceptabilityTokenSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAcceptabilityTokenSet"


    // $ANTLR start "ruleAcceptabilityTokenSet"
    // InternalEtlParser.g:6364:1: ruleAcceptabilityTokenSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleAcceptabilityTokenSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        AntlrDatatypeRuleToken lv_acceptabilities_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6370:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEtlParser.g:6371:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEtlParser.g:6371:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEtlParser.g:6372:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getAcceptabilityTokenSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:6376:3: ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+
            int cnt99=0;
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( ((LA99_0>=RULE_CASE_SIGNIFICANCE_ID_KEYWORD && LA99_0<=RULE_KEYWORD)) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalEtlParser.g:6377:4: (lv_acceptabilities_1_0= ruleUnquotedString )
            	    {
            	    // InternalEtlParser.g:6377:4: (lv_acceptabilities_1_0= ruleUnquotedString )
            	    // InternalEtlParser.g:6378:5: lv_acceptabilities_1_0= ruleUnquotedString
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesUnquotedStringParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
            	    lv_acceptabilities_1_0=ruleUnquotedString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAcceptabilityTokenSetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"acceptabilities",
            	      						lv_acceptabilities_1_0,
            	      						"com.b2international.snomed.ecl.Ecl.UnquotedString");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt99 >= 1 ) break loop99;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(99, input);
                        throw eee;
                }
                cnt99++;
            } while (true);

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getAcceptabilityTokenSetAccess().getROUND_CLOSETerminalRuleCall_2());
              		
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
    // $ANTLR end "ruleAcceptabilityTokenSet"


    // $ANTLR start "entryRuleDefinitionStatusFilter"
    // InternalEtlParser.g:6403:1: entryRuleDefinitionStatusFilter returns [EObject current=null] : iv_ruleDefinitionStatusFilter= ruleDefinitionStatusFilter EOF ;
    public final EObject entryRuleDefinitionStatusFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionStatusFilter = null;


        try {
            // InternalEtlParser.g:6403:63: (iv_ruleDefinitionStatusFilter= ruleDefinitionStatusFilter EOF )
            // InternalEtlParser.g:6404:2: iv_ruleDefinitionStatusFilter= ruleDefinitionStatusFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionStatusFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefinitionStatusFilter=ruleDefinitionStatusFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionStatusFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinitionStatusFilter"


    // $ANTLR start "ruleDefinitionStatusFilter"
    // InternalEtlParser.g:6410:1: ruleDefinitionStatusFilter returns [EObject current=null] : (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter ) ;
    public final EObject ruleDefinitionStatusFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DefinitionStatusIdFilter_0 = null;

        EObject this_DefinitionStatusTokenFilter_1 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6416:2: ( (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter ) )
            // InternalEtlParser.g:6417:2: (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter )
            {
            // InternalEtlParser.g:6417:2: (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_DEFINITION_STATUS_ID_KEYWORD) ) {
                alt100=1;
            }
            else if ( (LA100_0==RULE_DEFINITION_STATUS_TOKEN_KEYWORD) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalEtlParser.g:6418:3: this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionStatusFilterAccess().getDefinitionStatusIdFilterParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DefinitionStatusIdFilter_0=ruleDefinitionStatusIdFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefinitionStatusIdFilter_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:6430:3: this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionStatusFilterAccess().getDefinitionStatusTokenFilterParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DefinitionStatusTokenFilter_1=ruleDefinitionStatusTokenFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefinitionStatusTokenFilter_1;
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
    // $ANTLR end "ruleDefinitionStatusFilter"


    // $ANTLR start "entryRuleDefinitionStatusIdFilter"
    // InternalEtlParser.g:6445:1: entryRuleDefinitionStatusIdFilter returns [EObject current=null] : iv_ruleDefinitionStatusIdFilter= ruleDefinitionStatusIdFilter EOF ;
    public final EObject entryRuleDefinitionStatusIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionStatusIdFilter = null;


        try {
            // InternalEtlParser.g:6445:65: (iv_ruleDefinitionStatusIdFilter= ruleDefinitionStatusIdFilter EOF )
            // InternalEtlParser.g:6446:2: iv_ruleDefinitionStatusIdFilter= ruleDefinitionStatusIdFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionStatusIdFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefinitionStatusIdFilter=ruleDefinitionStatusIdFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionStatusIdFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinitionStatusIdFilter"


    // $ANTLR start "ruleDefinitionStatusIdFilter"
    // InternalEtlParser.g:6452:1: ruleDefinitionStatusIdFilter returns [EObject current=null] : (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleDefinitionStatusIdFilter() throws RecognitionException {
        EObject current = null;

        Token this_DEFINITION_STATUS_ID_KEYWORD_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_definitionStatus_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6458:2: ( (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) ) )
            // InternalEtlParser.g:6459:2: (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) )
            {
            // InternalEtlParser.g:6459:2: (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) )
            // InternalEtlParser.g:6460:3: this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) )
            {
            this_DEFINITION_STATUS_ID_KEYWORD_0=(Token)match(input,RULE_DEFINITION_STATUS_ID_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DEFINITION_STATUS_ID_KEYWORD_0, grammarAccess.getDefinitionStatusIdFilterAccess().getDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:6464:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEtlParser.g:6465:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:6465:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEtlParser.g:6466:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionStatusIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionStatusIdFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:6483:3: ( (lv_definitionStatus_2_0= ruleFilterValue ) )
            // InternalEtlParser.g:6484:4: (lv_definitionStatus_2_0= ruleFilterValue )
            {
            // InternalEtlParser.g:6484:4: (lv_definitionStatus_2_0= ruleFilterValue )
            // InternalEtlParser.g:6485:5: lv_definitionStatus_2_0= ruleFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionStatusIdFilterAccess().getDefinitionStatusFilterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_definitionStatus_2_0=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionStatusIdFilterRule());
              					}
              					set(
              						current,
              						"definitionStatus",
              						lv_definitionStatus_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilterValue");
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
    // $ANTLR end "ruleDefinitionStatusIdFilter"


    // $ANTLR start "entryRuleDefinitionStatusTokenFilter"
    // InternalEtlParser.g:6506:1: entryRuleDefinitionStatusTokenFilter returns [EObject current=null] : iv_ruleDefinitionStatusTokenFilter= ruleDefinitionStatusTokenFilter EOF ;
    public final EObject entryRuleDefinitionStatusTokenFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionStatusTokenFilter = null;


        try {
            // InternalEtlParser.g:6506:68: (iv_ruleDefinitionStatusTokenFilter= ruleDefinitionStatusTokenFilter EOF )
            // InternalEtlParser.g:6507:2: iv_ruleDefinitionStatusTokenFilter= ruleDefinitionStatusTokenFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefinitionStatusTokenFilter=ruleDefinitionStatusTokenFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionStatusTokenFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinitionStatusTokenFilter"


    // $ANTLR start "ruleDefinitionStatusTokenFilter"
    // InternalEtlParser.g:6513:1: ruleDefinitionStatusTokenFilter returns [EObject current=null] : (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleDefinitionStatusTokenFilter() throws RecognitionException {
        EObject current = null;

        Token this_DEFINITION_STATUS_TOKEN_KEYWORD_0=null;
        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_5=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_definitionStatusTokens_2_0 = null;

        AntlrDatatypeRuleToken lv_definitionStatusTokens_4_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6519:2: ( (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEtlParser.g:6520:2: (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEtlParser.g:6520:2: (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEtlParser.g:6521:3: this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_DEFINITION_STATUS_TOKEN_KEYWORD_0=(Token)match(input,RULE_DEFINITION_STATUS_TOKEN_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DEFINITION_STATUS_TOKEN_KEYWORD_0, grammarAccess.getDefinitionStatusTokenFilterAccess().getDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:6525:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEtlParser.g:6526:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:6526:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEtlParser.g:6527:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_59);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionStatusTokenFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:6544:3: ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( ((LA102_0>=RULE_CASE_SIGNIFICANCE_ID_KEYWORD && LA102_0<=RULE_KEYWORD)) ) {
                alt102=1;
            }
            else if ( (LA102_0==RULE_ROUND_OPEN) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // InternalEtlParser.g:6545:4: ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) )
                    {
                    // InternalEtlParser.g:6545:4: ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) )
                    // InternalEtlParser.g:6546:5: (lv_definitionStatusTokens_2_0= ruleUnquotedString )
                    {
                    // InternalEtlParser.g:6546:5: (lv_definitionStatusTokens_2_0= ruleUnquotedString )
                    // InternalEtlParser.g:6547:6: lv_definitionStatusTokens_2_0= ruleUnquotedString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensUnquotedStringParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_definitionStatusTokens_2_0=ruleUnquotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefinitionStatusTokenFilterRule());
                      						}
                      						add(
                      							current,
                      							"definitionStatusTokens",
                      							lv_definitionStatusTokens_2_0,
                      							"com.b2international.snomed.ecl.Ecl.UnquotedString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:6565:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEtlParser.g:6565:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEtlParser.g:6566:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDefinitionStatusTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEtlParser.g:6570:5: ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+
                    int cnt101=0;
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( ((LA101_0>=RULE_CASE_SIGNIFICANCE_ID_KEYWORD && LA101_0<=RULE_KEYWORD)) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalEtlParser.g:6571:6: (lv_definitionStatusTokens_4_0= ruleUnquotedString )
                    	    {
                    	    // InternalEtlParser.g:6571:6: (lv_definitionStatusTokens_4_0= ruleUnquotedString )
                    	    // InternalEtlParser.g:6572:7: lv_definitionStatusTokens_4_0= ruleUnquotedString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensUnquotedStringParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_61);
                    	    lv_definitionStatusTokens_4_0=ruleUnquotedString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDefinitionStatusTokenFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"definitionStatusTokens",
                    	      								lv_definitionStatusTokens_4_0,
                    	      								"com.b2international.snomed.ecl.Ecl.UnquotedString");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt101 >= 1 ) break loop101;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(101, input);
                                throw eee;
                        }
                        cnt101++;
                    } while (true);

                    this_ROUND_CLOSE_5=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getDefinitionStatusTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
                      				
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
    // $ANTLR end "ruleDefinitionStatusTokenFilter"


    // $ANTLR start "entryRuleModuleFilter"
    // InternalEtlParser.g:6599:1: entryRuleModuleFilter returns [EObject current=null] : iv_ruleModuleFilter= ruleModuleFilter EOF ;
    public final EObject entryRuleModuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleFilter = null;


        try {
            // InternalEtlParser.g:6599:53: (iv_ruleModuleFilter= ruleModuleFilter EOF )
            // InternalEtlParser.g:6600:2: iv_ruleModuleFilter= ruleModuleFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModuleFilter=ruleModuleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModuleFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModuleFilter"


    // $ANTLR start "ruleModuleFilter"
    // InternalEtlParser.g:6606:1: ruleModuleFilter returns [EObject current=null] : (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleModuleFilter() throws RecognitionException {
        EObject current = null;

        Token this_MODULEID_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_moduleId_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6612:2: ( (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) ) ) )
            // InternalEtlParser.g:6613:2: (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) ) )
            {
            // InternalEtlParser.g:6613:2: (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) ) )
            // InternalEtlParser.g:6614:3: this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) )
            {
            this_MODULEID_KEYWORD_0=(Token)match(input,RULE_MODULEID_KEYWORD,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_MODULEID_KEYWORD_0, grammarAccess.getModuleFilterAccess().getMODULEID_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getModuleFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:6622:3: ( (lv_moduleId_2_0= ruleFilterValue ) )
            // InternalEtlParser.g:6623:4: (lv_moduleId_2_0= ruleFilterValue )
            {
            // InternalEtlParser.g:6623:4: (lv_moduleId_2_0= ruleFilterValue )
            // InternalEtlParser.g:6624:5: lv_moduleId_2_0= ruleFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModuleFilterAccess().getModuleIdFilterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_moduleId_2_0=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModuleFilterRule());
              					}
              					set(
              						current,
              						"moduleId",
              						lv_moduleId_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilterValue");
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
    // $ANTLR end "ruleModuleFilter"


    // $ANTLR start "entryRuleEffectiveTimeFilter"
    // InternalEtlParser.g:6645:1: entryRuleEffectiveTimeFilter returns [EObject current=null] : iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF ;
    public final EObject entryRuleEffectiveTimeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectiveTimeFilter = null;


        try {
            // InternalEtlParser.g:6645:60: (iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF )
            // InternalEtlParser.g:6646:2: iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectiveTimeFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEffectiveTimeFilter=ruleEffectiveTimeFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffectiveTimeFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEffectiveTimeFilter"


    // $ANTLR start "ruleEffectiveTimeFilter"
    // InternalEtlParser.g:6652:1: ruleEffectiveTimeFilter returns [EObject current=null] : (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEffectiveTimeFilter() throws RecognitionException {
        EObject current = null;

        Token this_EFFECTIVE_TIME_KEYWORD_0=null;
        Token lv_effectiveTime_2_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6658:2: ( (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) ) )
            // InternalEtlParser.g:6659:2: (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) )
            {
            // InternalEtlParser.g:6659:2: (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) )
            // InternalEtlParser.g:6660:3: this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) )
            {
            this_EFFECTIVE_TIME_KEYWORD_0=(Token)match(input,RULE_EFFECTIVE_TIME_KEYWORD,FollowSets000.FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EFFECTIVE_TIME_KEYWORD_0, grammarAccess.getEffectiveTimeFilterAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:6664:3: ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) )
            // InternalEtlParser.g:6665:4: (lv_op_1_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:6665:4: (lv_op_1_0= ruleNUMERIC_OPERATOR )
            // InternalEtlParser.g:6666:5: lv_op_1_0= ruleNUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEffectiveTimeFilterAccess().getOpNUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_op_1_0=ruleNUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEffectiveTimeFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:6683:3: ( (lv_effectiveTime_2_0= RULE_STRING ) )
            // InternalEtlParser.g:6684:4: (lv_effectiveTime_2_0= RULE_STRING )
            {
            // InternalEtlParser.g:6684:4: (lv_effectiveTime_2_0= RULE_STRING )
            // InternalEtlParser.g:6685:5: lv_effectiveTime_2_0= RULE_STRING
            {
            lv_effectiveTime_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_effectiveTime_2_0, grammarAccess.getEffectiveTimeFilterAccess().getEffectiveTimeSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEffectiveTimeFilterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"effectiveTime",
              						lv_effectiveTime_2_0,
              						"com.b2international.snomed.ecl.Ecl.STRING");
              				
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
    // $ANTLR end "ruleEffectiveTimeFilter"


    // $ANTLR start "entryRuleActiveFilter"
    // InternalEtlParser.g:6705:1: entryRuleActiveFilter returns [EObject current=null] : iv_ruleActiveFilter= ruleActiveFilter EOF ;
    public final EObject entryRuleActiveFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveFilter = null;


        try {
            // InternalEtlParser.g:6705:53: (iv_ruleActiveFilter= ruleActiveFilter EOF )
            // InternalEtlParser.g:6706:2: iv_ruleActiveFilter= ruleActiveFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActiveFilter=ruleActiveFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActiveFilter"


    // $ANTLR start "ruleActiveFilter"
    // InternalEtlParser.g:6712:1: ruleActiveFilter returns [EObject current=null] : (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) ) ) ;
    public final EObject ruleActiveFilter() throws RecognitionException {
        EObject current = null;

        Token this_ACTIVE_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        AntlrDatatypeRuleToken lv_active_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6718:2: ( (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) ) ) )
            // InternalEtlParser.g:6719:2: (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) ) )
            {
            // InternalEtlParser.g:6719:2: (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) ) )
            // InternalEtlParser.g:6720:3: this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) )
            {
            this_ACTIVE_KEYWORD_0=(Token)match(input,RULE_ACTIVE_KEYWORD,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ACTIVE_KEYWORD_0, grammarAccess.getActiveFilterAccess().getACTIVE_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getActiveFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:6728:3: ( (lv_active_2_0= ruleActiveBoolean ) )
            // InternalEtlParser.g:6729:4: (lv_active_2_0= ruleActiveBoolean )
            {
            // InternalEtlParser.g:6729:4: (lv_active_2_0= ruleActiveBoolean )
            // InternalEtlParser.g:6730:5: lv_active_2_0= ruleActiveBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActiveFilterAccess().getActiveActiveBooleanParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_active_2_0=ruleActiveBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getActiveFilterRule());
              					}
              					set(
              						current,
              						"active",
              						lv_active_2_0,
              						"com.b2international.snomed.ecl.Ecl.ActiveBoolean");
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
    // $ANTLR end "ruleActiveFilter"


    // $ANTLR start "entryRuleSemanticTagFilter"
    // InternalEtlParser.g:6751:1: entryRuleSemanticTagFilter returns [EObject current=null] : iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF ;
    public final EObject entryRuleSemanticTagFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticTagFilter = null;


        try {
            // InternalEtlParser.g:6751:58: (iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF )
            // InternalEtlParser.g:6752:2: iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSemanticTagFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSemanticTagFilter=ruleSemanticTagFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSemanticTagFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSemanticTagFilter"


    // $ANTLR start "ruleSemanticTagFilter"
    // InternalEtlParser.g:6758:1: ruleSemanticTagFilter returns [EObject current=null] : (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSemanticTagFilter() throws RecognitionException {
        EObject current = null;

        Token this_SEMANTIC_TAG_KEYWORD_0=null;
        Token lv_semanticTag_2_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6764:2: ( (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) ) )
            // InternalEtlParser.g:6765:2: (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) )
            {
            // InternalEtlParser.g:6765:2: (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) )
            // InternalEtlParser.g:6766:3: this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) )
            {
            this_SEMANTIC_TAG_KEYWORD_0=(Token)match(input,RULE_SEMANTIC_TAG_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SEMANTIC_TAG_KEYWORD_0, grammarAccess.getSemanticTagFilterAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEtlParser.g:6770:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEtlParser.g:6771:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEtlParser.g:6771:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEtlParser.g:6772:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSemanticTagFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSemanticTagFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEtlParser.g:6789:3: ( (lv_semanticTag_2_0= RULE_STRING ) )
            // InternalEtlParser.g:6790:4: (lv_semanticTag_2_0= RULE_STRING )
            {
            // InternalEtlParser.g:6790:4: (lv_semanticTag_2_0= RULE_STRING )
            // InternalEtlParser.g:6791:5: lv_semanticTag_2_0= RULE_STRING
            {
            lv_semanticTag_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_semanticTag_2_0, grammarAccess.getSemanticTagFilterAccess().getSemanticTagSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSemanticTagFilterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"semanticTag",
              						lv_semanticTag_2_0,
              						"com.b2international.snomed.ecl.Ecl.STRING");
              				
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
    // $ANTLR end "ruleSemanticTagFilter"


    // $ANTLR start "entryRulePreferredInFilter"
    // InternalEtlParser.g:6811:1: entryRulePreferredInFilter returns [EObject current=null] : iv_rulePreferredInFilter= rulePreferredInFilter EOF ;
    public final EObject entryRulePreferredInFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferredInFilter = null;


        try {
            // InternalEtlParser.g:6811:58: (iv_rulePreferredInFilter= rulePreferredInFilter EOF )
            // InternalEtlParser.g:6812:2: iv_rulePreferredInFilter= rulePreferredInFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreferredInFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePreferredInFilter=rulePreferredInFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreferredInFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePreferredInFilter"


    // $ANTLR start "rulePreferredInFilter"
    // InternalEtlParser.g:6818:1: rulePreferredInFilter returns [EObject current=null] : (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) ;
    public final EObject rulePreferredInFilter() throws RecognitionException {
        EObject current = null;

        Token this_PREFERRED_IN_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6824:2: ( (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) )
            // InternalEtlParser.g:6825:2: (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            {
            // InternalEtlParser.g:6825:2: (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            // InternalEtlParser.g:6826:3: this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            {
            this_PREFERRED_IN_KEYWORD_0=(Token)match(input,RULE_PREFERRED_IN_KEYWORD,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PREFERRED_IN_KEYWORD_0, grammarAccess.getPreferredInFilterAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getPreferredInFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:6834:3: ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            // InternalEtlParser.g:6835:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            {
            // InternalEtlParser.g:6835:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            // InternalEtlParser.g:6836:5: lv_languageRefSetId_2_0= ruleFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_languageRefSetId_2_0=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPreferredInFilterRule());
              					}
              					set(
              						current,
              						"languageRefSetId",
              						lv_languageRefSetId_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilterValue");
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
    // $ANTLR end "rulePreferredInFilter"


    // $ANTLR start "entryRuleAcceptableInFilter"
    // InternalEtlParser.g:6857:1: entryRuleAcceptableInFilter returns [EObject current=null] : iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF ;
    public final EObject entryRuleAcceptableInFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptableInFilter = null;


        try {
            // InternalEtlParser.g:6857:59: (iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF )
            // InternalEtlParser.g:6858:2: iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAcceptableInFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAcceptableInFilter=ruleAcceptableInFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAcceptableInFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAcceptableInFilter"


    // $ANTLR start "ruleAcceptableInFilter"
    // InternalEtlParser.g:6864:1: ruleAcceptableInFilter returns [EObject current=null] : (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleAcceptableInFilter() throws RecognitionException {
        EObject current = null;

        Token this_ACCEPTABLE_IN_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6870:2: ( (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) )
            // InternalEtlParser.g:6871:2: (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            {
            // InternalEtlParser.g:6871:2: (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            // InternalEtlParser.g:6872:3: this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            {
            this_ACCEPTABLE_IN_KEYWORD_0=(Token)match(input,RULE_ACCEPTABLE_IN_KEYWORD,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ACCEPTABLE_IN_KEYWORD_0, grammarAccess.getAcceptableInFilterAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getAcceptableInFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:6880:3: ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            // InternalEtlParser.g:6881:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            {
            // InternalEtlParser.g:6881:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            // InternalEtlParser.g:6882:5: lv_languageRefSetId_2_0= ruleFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_languageRefSetId_2_0=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAcceptableInFilterRule());
              					}
              					set(
              						current,
              						"languageRefSetId",
              						lv_languageRefSetId_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilterValue");
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
    // $ANTLR end "ruleAcceptableInFilter"


    // $ANTLR start "entryRuleLanguageRefSetFilter"
    // InternalEtlParser.g:6903:1: entryRuleLanguageRefSetFilter returns [EObject current=null] : iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF ;
    public final EObject entryRuleLanguageRefSetFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageRefSetFilter = null;


        try {
            // InternalEtlParser.g:6903:61: (iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF )
            // InternalEtlParser.g:6904:2: iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLanguageRefSetFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLanguageRefSetFilter=ruleLanguageRefSetFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLanguageRefSetFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLanguageRefSetFilter"


    // $ANTLR start "ruleLanguageRefSetFilter"
    // InternalEtlParser.g:6910:1: ruleLanguageRefSetFilter returns [EObject current=null] : (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleLanguageRefSetFilter() throws RecognitionException {
        EObject current = null;

        Token this_LANGUAGE_REFSET_ID_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6916:2: ( (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) )
            // InternalEtlParser.g:6917:2: (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            {
            // InternalEtlParser.g:6917:2: (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            // InternalEtlParser.g:6918:3: this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            {
            this_LANGUAGE_REFSET_ID_KEYWORD_0=(Token)match(input,RULE_LANGUAGE_REFSET_ID_KEYWORD,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LANGUAGE_REFSET_ID_KEYWORD_0, grammarAccess.getLanguageRefSetFilterAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getLanguageRefSetFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:6926:3: ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            // InternalEtlParser.g:6927:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            {
            // InternalEtlParser.g:6927:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            // InternalEtlParser.g:6928:5: lv_languageRefSetId_2_0= ruleFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_languageRefSetId_2_0=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLanguageRefSetFilterRule());
              					}
              					set(
              						current,
              						"languageRefSetId",
              						lv_languageRefSetId_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilterValue");
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
    // $ANTLR end "ruleLanguageRefSetFilter"


    // $ANTLR start "entryRuleCaseSignificanceFilter"
    // InternalEtlParser.g:6949:1: entryRuleCaseSignificanceFilter returns [EObject current=null] : iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF ;
    public final EObject entryRuleCaseSignificanceFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseSignificanceFilter = null;


        try {
            // InternalEtlParser.g:6949:63: (iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF )
            // InternalEtlParser.g:6950:2: iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseSignificanceFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCaseSignificanceFilter=ruleCaseSignificanceFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseSignificanceFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCaseSignificanceFilter"


    // $ANTLR start "ruleCaseSignificanceFilter"
    // InternalEtlParser.g:6956:1: ruleCaseSignificanceFilter returns [EObject current=null] : (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleCaseSignificanceFilter() throws RecognitionException {
        EObject current = null;

        Token this_CASE_SIGNIFICANCE_ID_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_caseSignificanceId_2_0 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:6962:2: ( (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) ) )
            // InternalEtlParser.g:6963:2: (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) )
            {
            // InternalEtlParser.g:6963:2: (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) )
            // InternalEtlParser.g:6964:3: this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) )
            {
            this_CASE_SIGNIFICANCE_ID_KEYWORD_0=(Token)match(input,RULE_CASE_SIGNIFICANCE_ID_KEYWORD,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CASE_SIGNIFICANCE_ID_KEYWORD_0, grammarAccess.getCaseSignificanceFilterAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getCaseSignificanceFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:6972:3: ( (lv_caseSignificanceId_2_0= ruleFilterValue ) )
            // InternalEtlParser.g:6973:4: (lv_caseSignificanceId_2_0= ruleFilterValue )
            {
            // InternalEtlParser.g:6973:4: (lv_caseSignificanceId_2_0= ruleFilterValue )
            // InternalEtlParser.g:6974:5: lv_caseSignificanceId_2_0= ruleFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdFilterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_caseSignificanceId_2_0=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseSignificanceFilterRule());
              					}
              					set(
              						current,
              						"caseSignificanceId",
              						lv_caseSignificanceId_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilterValue");
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
    // $ANTLR end "ruleCaseSignificanceFilter"


    // $ANTLR start "entryRuleFilterValue"
    // InternalEtlParser.g:6995:1: entryRuleFilterValue returns [EObject current=null] : iv_ruleFilterValue= ruleFilterValue EOF ;
    public final EObject entryRuleFilterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterValue = null;


        try {
            // InternalEtlParser.g:6995:52: (iv_ruleFilterValue= ruleFilterValue EOF )
            // InternalEtlParser.g:6996:2: iv_ruleFilterValue= ruleFilterValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilterValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFilterValue=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilterValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFilterValue"


    // $ANTLR start "ruleFilterValue"
    // InternalEtlParser.g:7002:1: ruleFilterValue returns [EObject current=null] : (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet ) ;
    public final EObject ruleFilterValue() throws RecognitionException {
        EObject current = null;

        EObject this_FilteredExpressionConstraint_0 = null;

        EObject this_EclConceptReferenceSet_1 = null;



        	enterRule();

        try {
            // InternalEtlParser.g:7008:2: ( (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet ) )
            // InternalEtlParser.g:7009:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet )
            {
            // InternalEtlParser.g:7009:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet )
            int alt103=2;
            alt103 = dfa103.predict(input);
            switch (alt103) {
                case 1 :
                    // InternalEtlParser.g:7010:3: this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFilterValueAccess().getFilteredExpressionConstraintParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FilteredExpressionConstraint_0=ruleFilteredExpressionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FilteredExpressionConstraint_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:7022:3: this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFilterValueAccess().getEclConceptReferenceSetParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EclConceptReferenceSet_1=ruleEclConceptReferenceSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EclConceptReferenceSet_1;
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
    // $ANTLR end "ruleFilterValue"


    // $ANTLR start "entryRuleSnomedIdentifier"
    // InternalEtlParser.g:7037:1: entryRuleSnomedIdentifier returns [String current=null] : iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF ;
    public final String entryRuleSnomedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSnomedIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7039:2: (iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF )
            // InternalEtlParser.g:7040:2: iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSnomedIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSnomedIdentifier=ruleSnomedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSnomedIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSnomedIdentifier"


    // $ANTLR start "ruleSnomedIdentifier"
    // InternalEtlParser.g:7049:1: ruleSnomedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+ ;
    public final AntlrDatatypeRuleToken ruleSnomedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_NONZERO_0=null;
        Token this_DIGIT_ZERO_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7056:2: ( (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+ )
            // InternalEtlParser.g:7057:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+
            {
            // InternalEtlParser.g:7057:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+
            int cnt104=0;
            loop104:
            do {
                int alt104=3;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==RULE_DIGIT_NONZERO) ) {
                    int LA104_2 = input.LA(2);

                    if ( (synpred152_InternalEtlParser()) ) {
                        alt104=1;
                    }


                }
                else if ( (LA104_0==RULE_DIGIT_ZERO) ) {
                    int LA104_3 = input.LA(2);

                    if ( (synpred153_InternalEtlParser()) ) {
                        alt104=2;
                    }


                }


                switch (alt104) {
            	case 1 :
            	    // InternalEtlParser.g:7058:3: this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_0=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_70); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_NONZERO_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_NONZERO_0, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEtlParser.g:7066:3: this_DIGIT_ZERO_1= RULE_DIGIT_ZERO
            	    {
            	    this_DIGIT_ZERO_1=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_70); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_ZERO_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_ZERO_1, grammarAccess.getSnomedIdentifierAccess().getDIGIT_ZEROTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt104 >= 1 ) break loop104;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(104, input);
                        throw eee;
                }
                cnt104++;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSnomedIdentifier"


    // $ANTLR start "entryRuleNonNegativeInteger"
    // InternalEtlParser.g:7080:1: entryRuleNonNegativeInteger returns [String current=null] : iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF ;
    public final String entryRuleNonNegativeInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7082:2: (iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF )
            // InternalEtlParser.g:7083:2: iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonNegativeIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNonNegativeInteger=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonNegativeInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNonNegativeInteger"


    // $ANTLR start "ruleNonNegativeInteger"
    // InternalEtlParser.g:7092:1: ruleNonNegativeInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+ ;
    public final AntlrDatatypeRuleToken ruleNonNegativeInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_NONZERO_0=null;
        Token this_DIGIT_ZERO_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7099:2: ( (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+ )
            // InternalEtlParser.g:7100:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+
            {
            // InternalEtlParser.g:7100:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+
            int cnt105=0;
            loop105:
            do {
                int alt105=3;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==RULE_DIGIT_NONZERO) ) {
                    alt105=1;
                }
                else if ( (LA105_0==RULE_DIGIT_ZERO) ) {
                    alt105=2;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalEtlParser.g:7101:3: this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_0=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_70); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_NONZERO_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_NONZERO_0, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEtlParser.g:7109:3: this_DIGIT_ZERO_1= RULE_DIGIT_ZERO
            	    {
            	    this_DIGIT_ZERO_1=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_70); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_ZERO_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_ZERO_1, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_ZEROTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt105 >= 1 ) break loop105;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(105, input);
                        throw eee;
                }
                cnt105++;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNonNegativeInteger"


    // $ANTLR start "entryRuleNonNegativeDecimal"
    // InternalEtlParser.g:7123:1: entryRuleNonNegativeDecimal returns [String current=null] : iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF ;
    public final String entryRuleNonNegativeDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeDecimal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7125:2: (iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF )
            // InternalEtlParser.g:7126:2: iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonNegativeDecimalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNonNegativeDecimal=ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonNegativeDecimal.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNonNegativeDecimal"


    // $ANTLR start "ruleNonNegativeDecimal"
    // InternalEtlParser.g:7135:1: ruleNonNegativeDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )* ) ;
    public final AntlrDatatypeRuleToken ruleNonNegativeDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOT_1=null;
        Token this_DIGIT_NONZERO_2=null;
        Token this_DIGIT_ZERO_3=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7142:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )* ) )
            // InternalEtlParser.g:7143:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )* )
            {
            // InternalEtlParser.g:7143:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )* )
            // InternalEtlParser.g:7144:3: this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_71);
            this_NonNegativeInteger_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NonNegativeInteger_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DOT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOT_1, grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1());
              		
            }
            // InternalEtlParser.g:7161:3: (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )*
            loop106:
            do {
                int alt106=3;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==RULE_DIGIT_NONZERO) ) {
                    alt106=1;
                }
                else if ( (LA106_0==RULE_DIGIT_ZERO) ) {
                    alt106=2;
                }


                switch (alt106) {
            	case 1 :
            	    // InternalEtlParser.g:7162:4: this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_2=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_70); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_NONZERO_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_NONZERO_2, grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEtlParser.g:7170:4: this_DIGIT_ZERO_3= RULE_DIGIT_ZERO
            	    {
            	    this_DIGIT_ZERO_3=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_70); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_ZERO_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_ZERO_3, grammarAccess.getNonNegativeDecimalAccess().getDIGIT_ZEROTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop106;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNonNegativeDecimal"


    // $ANTLR start "entryRuleMaxValue"
    // InternalEtlParser.g:7185:1: entryRuleMaxValue returns [String current=null] : iv_ruleMaxValue= ruleMaxValue EOF ;
    public final String entryRuleMaxValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaxValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7187:2: (iv_ruleMaxValue= ruleMaxValue EOF )
            // InternalEtlParser.g:7188:2: iv_ruleMaxValue= ruleMaxValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMaxValue=ruleMaxValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxValue.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMaxValue"


    // $ANTLR start "ruleMaxValue"
    // InternalEtlParser.g:7197:1: ruleMaxValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) ;
    public final AntlrDatatypeRuleToken ruleMaxValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WILDCARD_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7204:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) )
            // InternalEtlParser.g:7205:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            {
            // InternalEtlParser.g:7205:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( ((LA107_0>=RULE_DIGIT_ZERO && LA107_0<=RULE_DIGIT_NONZERO)) ) {
                alt107=1;
            }
            else if ( (LA107_0==RULE_WILDCARD) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalEtlParser.g:7206:3: this_NonNegativeInteger_0= ruleNonNegativeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMaxValueAccess().getNonNegativeIntegerParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NonNegativeInteger_0=ruleNonNegativeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NonNegativeInteger_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:7217:3: this_WILDCARD_1= RULE_WILDCARD
                    {
                    this_WILDCARD_1=(Token)match(input,RULE_WILDCARD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_WILDCARD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_WILDCARD_1, grammarAccess.getMaxValueAccess().getWILDCARDTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleMaxValue"


    // $ANTLR start "entryRuleInteger"
    // InternalEtlParser.g:7231:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7233:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalEtlParser.g:7234:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalEtlParser.g:7243:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7250:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) )
            // InternalEtlParser.g:7251:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            {
            // InternalEtlParser.g:7251:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            // InternalEtlParser.g:7252:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger
            {
            // InternalEtlParser.g:7252:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt108=3;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RULE_PLUS) ) {
                alt108=1;
            }
            else if ( (LA108_0==RULE_DASH) ) {
                alt108=2;
            }
            switch (alt108) {
                case 1 :
                    // InternalEtlParser.g:7253:4: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PLUS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PLUS_0, grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:7261:4: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DASH_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DASH_1, grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_NonNegativeInteger_2=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NonNegativeInteger_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDecimal"
    // InternalEtlParser.g:7286:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7288:2: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalEtlParser.g:7289:2: iv_ruleDecimal= ruleDecimal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimal.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // InternalEtlParser.g:7298:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeDecimal_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7305:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) )
            // InternalEtlParser.g:7306:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            {
            // InternalEtlParser.g:7306:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            // InternalEtlParser.g:7307:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal
            {
            // InternalEtlParser.g:7307:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt109=3;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==RULE_PLUS) ) {
                alt109=1;
            }
            else if ( (LA109_0==RULE_DASH) ) {
                alt109=2;
            }
            switch (alt109) {
                case 1 :
                    // InternalEtlParser.g:7308:4: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PLUS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PLUS_0, grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:7316:4: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DASH_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DASH_1, grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_NonNegativeDecimal_2=ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NonNegativeDecimal_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleBoolean"
    // InternalEtlParser.g:7341:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7343:2: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalEtlParser.g:7344:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalEtlParser.g:7353:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TRUE_KEYWORD_0=null;
        Token this_FALSE_KEYWORD_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7360:2: ( (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD ) )
            // InternalEtlParser.g:7361:2: (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD )
            {
            // InternalEtlParser.g:7361:2: (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==RULE_TRUE_KEYWORD) ) {
                alt110=1;
            }
            else if ( (LA110_0==RULE_FALSE_KEYWORD) ) {
                alt110=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // InternalEtlParser.g:7362:3: this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD
                    {
                    this_TRUE_KEYWORD_0=(Token)match(input,RULE_TRUE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TRUE_KEYWORD_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TRUE_KEYWORD_0, grammarAccess.getBooleanAccess().getTRUE_KEYWORDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:7370:3: this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD
                    {
                    this_FALSE_KEYWORD_1=(Token)match(input,RULE_FALSE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FALSE_KEYWORD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_FALSE_KEYWORD_1, grammarAccess.getBooleanAccess().getFALSE_KEYWORDTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleActiveBoolean"
    // InternalEtlParser.g:7384:1: entryRuleActiveBoolean returns [String current=null] : iv_ruleActiveBoolean= ruleActiveBoolean EOF ;
    public final String entryRuleActiveBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActiveBoolean = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7386:2: (iv_ruleActiveBoolean= ruleActiveBoolean EOF )
            // InternalEtlParser.g:7387:2: iv_ruleActiveBoolean= ruleActiveBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActiveBoolean=ruleActiveBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActiveBoolean"


    // $ANTLR start "ruleActiveBoolean"
    // InternalEtlParser.g:7396:1: ruleActiveBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean ) ;
    public final AntlrDatatypeRuleToken ruleActiveBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;

        AntlrDatatypeRuleToken this_Boolean_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7403:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean ) )
            // InternalEtlParser.g:7404:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean )
            {
            // InternalEtlParser.g:7404:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( ((LA111_0>=RULE_DIGIT_ZERO && LA111_0<=RULE_DIGIT_NONZERO)) ) {
                alt111=1;
            }
            else if ( (LA111_0==RULE_FALSE_KEYWORD||LA111_0==RULE_TRUE_KEYWORD) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalEtlParser.g:7405:3: this_NonNegativeInteger_0= ruleNonNegativeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActiveBooleanAccess().getNonNegativeIntegerParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NonNegativeInteger_0=ruleNonNegativeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NonNegativeInteger_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:7416:3: this_Boolean_1= ruleBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActiveBooleanAccess().getBooleanParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Boolean_1=ruleBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Boolean_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleActiveBoolean"


    // $ANTLR start "entryRuleUnquotedString"
    // InternalEtlParser.g:7433:1: entryRuleUnquotedString returns [String current=null] : iv_ruleUnquotedString= ruleUnquotedString EOF ;
    public final String entryRuleUnquotedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnquotedString = null;


        try {
            // InternalEtlParser.g:7433:54: (iv_ruleUnquotedString= ruleUnquotedString EOF )
            // InternalEtlParser.g:7434:2: iv_ruleUnquotedString= ruleUnquotedString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnquotedStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnquotedString=ruleUnquotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnquotedString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnquotedString"


    // $ANTLR start "ruleUnquotedString"
    // InternalEtlParser.g:7440:1: ruleUnquotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_1= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_2= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_3= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_4= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_5= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_6= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_7= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_8= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_9= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_10= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_11= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_12= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_13= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_14= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_15= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_16= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_17= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_18= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_19= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_20= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_21= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_22= RULE_WILD_KEYWORD | this_CONJUNCTION_KEYWORD_23= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_24= RULE_DISJUNCTION_KEYWORD | this_REVERSED_25= RULE_REVERSED | this_DESCRIPTION_SHORT_KEYWORD_26= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_27= RULE_CONCEPT_SHORT_KEYWORD | this_KEYWORD_28= RULE_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleUnquotedString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CASE_SIGNIFICANCE_ID_KEYWORD_0=null;
        Token this_DEFINITION_STATUS_ID_KEYWORD_1=null;
        Token this_DEFINITION_STATUS_TOKEN_KEYWORD_2=null;
        Token this_LANGUAGE_REFSET_ID_KEYWORD_3=null;
        Token this_EFFECTIVE_TIME_KEYWORD_4=null;
        Token this_ACCEPTABLE_IN_KEYWORD_5=null;
        Token this_PREFERRED_IN_KEYWORD_6=null;
        Token this_SEMANTIC_TAG_KEYWORD_7=null;
        Token this_DIALECTID_KEYWORD_8=null;
        Token this_LANGUAGE_KEYWORD_9=null;
        Token this_MODULEID_KEYWORD_10=null;
        Token this_DIALECT_KEYWORD_11=null;
        Token this_ACTIVE_KEYWORD_12=null;
        Token this_TYPEID_KEYWORD_13=null;
        Token this_EXCLUSION_KEYWORD_14=null;
        Token this_EXACT_KEYWORD_15=null;
        Token this_FALSE_KEYWORD_16=null;
        Token this_MATCH_KEYWORD_17=null;
        Token this_REGEX_KEYWORD_18=null;
        Token this_TERM_KEYWORD_19=null;
        Token this_TRUE_KEYWORD_20=null;
        Token this_TYPE_KEYWORD_21=null;
        Token this_WILD_KEYWORD_22=null;
        Token this_CONJUNCTION_KEYWORD_23=null;
        Token this_DISJUNCTION_KEYWORD_24=null;
        Token this_REVERSED_25=null;
        Token this_DESCRIPTION_SHORT_KEYWORD_26=null;
        Token this_CONCEPT_SHORT_KEYWORD_27=null;
        Token this_KEYWORD_28=null;


        	enterRule();

        try {
            // InternalEtlParser.g:7446:2: ( (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_1= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_2= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_3= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_4= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_5= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_6= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_7= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_8= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_9= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_10= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_11= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_12= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_13= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_14= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_15= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_16= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_17= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_18= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_19= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_20= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_21= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_22= RULE_WILD_KEYWORD | this_CONJUNCTION_KEYWORD_23= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_24= RULE_DISJUNCTION_KEYWORD | this_REVERSED_25= RULE_REVERSED | this_DESCRIPTION_SHORT_KEYWORD_26= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_27= RULE_CONCEPT_SHORT_KEYWORD | this_KEYWORD_28= RULE_KEYWORD ) )
            // InternalEtlParser.g:7447:2: (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_1= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_2= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_3= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_4= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_5= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_6= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_7= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_8= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_9= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_10= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_11= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_12= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_13= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_14= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_15= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_16= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_17= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_18= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_19= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_20= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_21= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_22= RULE_WILD_KEYWORD | this_CONJUNCTION_KEYWORD_23= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_24= RULE_DISJUNCTION_KEYWORD | this_REVERSED_25= RULE_REVERSED | this_DESCRIPTION_SHORT_KEYWORD_26= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_27= RULE_CONCEPT_SHORT_KEYWORD | this_KEYWORD_28= RULE_KEYWORD )
            {
            // InternalEtlParser.g:7447:2: (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_1= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_2= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_3= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_4= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_5= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_6= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_7= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_8= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_9= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_10= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_11= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_12= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_13= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_14= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_15= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_16= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_17= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_18= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_19= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_20= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_21= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_22= RULE_WILD_KEYWORD | this_CONJUNCTION_KEYWORD_23= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_24= RULE_DISJUNCTION_KEYWORD | this_REVERSED_25= RULE_REVERSED | this_DESCRIPTION_SHORT_KEYWORD_26= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_27= RULE_CONCEPT_SHORT_KEYWORD | this_KEYWORD_28= RULE_KEYWORD )
            int alt112=29;
            switch ( input.LA(1) ) {
            case RULE_CASE_SIGNIFICANCE_ID_KEYWORD:
                {
                alt112=1;
                }
                break;
            case RULE_DEFINITION_STATUS_ID_KEYWORD:
                {
                alt112=2;
                }
                break;
            case RULE_DEFINITION_STATUS_TOKEN_KEYWORD:
                {
                alt112=3;
                }
                break;
            case RULE_LANGUAGE_REFSET_ID_KEYWORD:
                {
                alt112=4;
                }
                break;
            case RULE_EFFECTIVE_TIME_KEYWORD:
                {
                alt112=5;
                }
                break;
            case RULE_ACCEPTABLE_IN_KEYWORD:
                {
                alt112=6;
                }
                break;
            case RULE_PREFERRED_IN_KEYWORD:
                {
                alt112=7;
                }
                break;
            case RULE_SEMANTIC_TAG_KEYWORD:
                {
                alt112=8;
                }
                break;
            case RULE_DIALECTID_KEYWORD:
                {
                alt112=9;
                }
                break;
            case RULE_LANGUAGE_KEYWORD:
                {
                alt112=10;
                }
                break;
            case RULE_MODULEID_KEYWORD:
                {
                alt112=11;
                }
                break;
            case RULE_DIALECT_KEYWORD:
                {
                alt112=12;
                }
                break;
            case RULE_ACTIVE_KEYWORD:
                {
                alt112=13;
                }
                break;
            case RULE_TYPEID_KEYWORD:
                {
                alt112=14;
                }
                break;
            case RULE_EXCLUSION_KEYWORD:
                {
                alt112=15;
                }
                break;
            case RULE_EXACT_KEYWORD:
                {
                alt112=16;
                }
                break;
            case RULE_FALSE_KEYWORD:
                {
                alt112=17;
                }
                break;
            case RULE_MATCH_KEYWORD:
                {
                alt112=18;
                }
                break;
            case RULE_REGEX_KEYWORD:
                {
                alt112=19;
                }
                break;
            case RULE_TERM_KEYWORD:
                {
                alt112=20;
                }
                break;
            case RULE_TRUE_KEYWORD:
                {
                alt112=21;
                }
                break;
            case RULE_TYPE_KEYWORD:
                {
                alt112=22;
                }
                break;
            case RULE_WILD_KEYWORD:
                {
                alt112=23;
                }
                break;
            case RULE_CONJUNCTION_KEYWORD:
                {
                alt112=24;
                }
                break;
            case RULE_DISJUNCTION_KEYWORD:
                {
                alt112=25;
                }
                break;
            case RULE_REVERSED:
                {
                alt112=26;
                }
                break;
            case RULE_DESCRIPTION_SHORT_KEYWORD:
                {
                alt112=27;
                }
                break;
            case RULE_CONCEPT_SHORT_KEYWORD:
                {
                alt112=28;
                }
                break;
            case RULE_KEYWORD:
                {
                alt112=29;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // InternalEtlParser.g:7448:3: this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD
                    {
                    this_CASE_SIGNIFICANCE_ID_KEYWORD_0=(Token)match(input,RULE_CASE_SIGNIFICANCE_ID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CASE_SIGNIFICANCE_ID_KEYWORD_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CASE_SIGNIFICANCE_ID_KEYWORD_0, grammarAccess.getUnquotedStringAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:7456:3: this_DEFINITION_STATUS_ID_KEYWORD_1= RULE_DEFINITION_STATUS_ID_KEYWORD
                    {
                    this_DEFINITION_STATUS_ID_KEYWORD_1=(Token)match(input,RULE_DEFINITION_STATUS_ID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DEFINITION_STATUS_ID_KEYWORD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DEFINITION_STATUS_ID_KEYWORD_1, grammarAccess.getUnquotedStringAccess().getDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEtlParser.g:7464:3: this_DEFINITION_STATUS_TOKEN_KEYWORD_2= RULE_DEFINITION_STATUS_TOKEN_KEYWORD
                    {
                    this_DEFINITION_STATUS_TOKEN_KEYWORD_2=(Token)match(input,RULE_DEFINITION_STATUS_TOKEN_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DEFINITION_STATUS_TOKEN_KEYWORD_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DEFINITION_STATUS_TOKEN_KEYWORD_2, grammarAccess.getUnquotedStringAccess().getDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEtlParser.g:7472:3: this_LANGUAGE_REFSET_ID_KEYWORD_3= RULE_LANGUAGE_REFSET_ID_KEYWORD
                    {
                    this_LANGUAGE_REFSET_ID_KEYWORD_3=(Token)match(input,RULE_LANGUAGE_REFSET_ID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LANGUAGE_REFSET_ID_KEYWORD_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_LANGUAGE_REFSET_ID_KEYWORD_3, grammarAccess.getUnquotedStringAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEtlParser.g:7480:3: this_EFFECTIVE_TIME_KEYWORD_4= RULE_EFFECTIVE_TIME_KEYWORD
                    {
                    this_EFFECTIVE_TIME_KEYWORD_4=(Token)match(input,RULE_EFFECTIVE_TIME_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EFFECTIVE_TIME_KEYWORD_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EFFECTIVE_TIME_KEYWORD_4, grammarAccess.getUnquotedStringAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEtlParser.g:7488:3: this_ACCEPTABLE_IN_KEYWORD_5= RULE_ACCEPTABLE_IN_KEYWORD
                    {
                    this_ACCEPTABLE_IN_KEYWORD_5=(Token)match(input,RULE_ACCEPTABLE_IN_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ACCEPTABLE_IN_KEYWORD_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ACCEPTABLE_IN_KEYWORD_5, grammarAccess.getUnquotedStringAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEtlParser.g:7496:3: this_PREFERRED_IN_KEYWORD_6= RULE_PREFERRED_IN_KEYWORD
                    {
                    this_PREFERRED_IN_KEYWORD_6=(Token)match(input,RULE_PREFERRED_IN_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PREFERRED_IN_KEYWORD_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_PREFERRED_IN_KEYWORD_6, grammarAccess.getUnquotedStringAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEtlParser.g:7504:3: this_SEMANTIC_TAG_KEYWORD_7= RULE_SEMANTIC_TAG_KEYWORD
                    {
                    this_SEMANTIC_TAG_KEYWORD_7=(Token)match(input,RULE_SEMANTIC_TAG_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SEMANTIC_TAG_KEYWORD_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SEMANTIC_TAG_KEYWORD_7, grammarAccess.getUnquotedStringAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEtlParser.g:7512:3: this_DIALECTID_KEYWORD_8= RULE_DIALECTID_KEYWORD
                    {
                    this_DIALECTID_KEYWORD_8=(Token)match(input,RULE_DIALECTID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DIALECTID_KEYWORD_8);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DIALECTID_KEYWORD_8, grammarAccess.getUnquotedStringAccess().getDIALECTID_KEYWORDTerminalRuleCall_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalEtlParser.g:7520:3: this_LANGUAGE_KEYWORD_9= RULE_LANGUAGE_KEYWORD
                    {
                    this_LANGUAGE_KEYWORD_9=(Token)match(input,RULE_LANGUAGE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LANGUAGE_KEYWORD_9);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_LANGUAGE_KEYWORD_9, grammarAccess.getUnquotedStringAccess().getLANGUAGE_KEYWORDTerminalRuleCall_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalEtlParser.g:7528:3: this_MODULEID_KEYWORD_10= RULE_MODULEID_KEYWORD
                    {
                    this_MODULEID_KEYWORD_10=(Token)match(input,RULE_MODULEID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MODULEID_KEYWORD_10);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MODULEID_KEYWORD_10, grammarAccess.getUnquotedStringAccess().getMODULEID_KEYWORDTerminalRuleCall_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalEtlParser.g:7536:3: this_DIALECT_KEYWORD_11= RULE_DIALECT_KEYWORD
                    {
                    this_DIALECT_KEYWORD_11=(Token)match(input,RULE_DIALECT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DIALECT_KEYWORD_11);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DIALECT_KEYWORD_11, grammarAccess.getUnquotedStringAccess().getDIALECT_KEYWORDTerminalRuleCall_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalEtlParser.g:7544:3: this_ACTIVE_KEYWORD_12= RULE_ACTIVE_KEYWORD
                    {
                    this_ACTIVE_KEYWORD_12=(Token)match(input,RULE_ACTIVE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ACTIVE_KEYWORD_12);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ACTIVE_KEYWORD_12, grammarAccess.getUnquotedStringAccess().getACTIVE_KEYWORDTerminalRuleCall_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalEtlParser.g:7552:3: this_TYPEID_KEYWORD_13= RULE_TYPEID_KEYWORD
                    {
                    this_TYPEID_KEYWORD_13=(Token)match(input,RULE_TYPEID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TYPEID_KEYWORD_13);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TYPEID_KEYWORD_13, grammarAccess.getUnquotedStringAccess().getTYPEID_KEYWORDTerminalRuleCall_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalEtlParser.g:7560:3: this_EXCLUSION_KEYWORD_14= RULE_EXCLUSION_KEYWORD
                    {
                    this_EXCLUSION_KEYWORD_14=(Token)match(input,RULE_EXCLUSION_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXCLUSION_KEYWORD_14);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXCLUSION_KEYWORD_14, grammarAccess.getUnquotedStringAccess().getEXCLUSION_KEYWORDTerminalRuleCall_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalEtlParser.g:7568:3: this_EXACT_KEYWORD_15= RULE_EXACT_KEYWORD
                    {
                    this_EXACT_KEYWORD_15=(Token)match(input,RULE_EXACT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXACT_KEYWORD_15);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXACT_KEYWORD_15, grammarAccess.getUnquotedStringAccess().getEXACT_KEYWORDTerminalRuleCall_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalEtlParser.g:7576:3: this_FALSE_KEYWORD_16= RULE_FALSE_KEYWORD
                    {
                    this_FALSE_KEYWORD_16=(Token)match(input,RULE_FALSE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FALSE_KEYWORD_16);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_FALSE_KEYWORD_16, grammarAccess.getUnquotedStringAccess().getFALSE_KEYWORDTerminalRuleCall_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalEtlParser.g:7584:3: this_MATCH_KEYWORD_17= RULE_MATCH_KEYWORD
                    {
                    this_MATCH_KEYWORD_17=(Token)match(input,RULE_MATCH_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MATCH_KEYWORD_17);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MATCH_KEYWORD_17, grammarAccess.getUnquotedStringAccess().getMATCH_KEYWORDTerminalRuleCall_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalEtlParser.g:7592:3: this_REGEX_KEYWORD_18= RULE_REGEX_KEYWORD
                    {
                    this_REGEX_KEYWORD_18=(Token)match(input,RULE_REGEX_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_REGEX_KEYWORD_18);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_REGEX_KEYWORD_18, grammarAccess.getUnquotedStringAccess().getREGEX_KEYWORDTerminalRuleCall_18());
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalEtlParser.g:7600:3: this_TERM_KEYWORD_19= RULE_TERM_KEYWORD
                    {
                    this_TERM_KEYWORD_19=(Token)match(input,RULE_TERM_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TERM_KEYWORD_19);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TERM_KEYWORD_19, grammarAccess.getUnquotedStringAccess().getTERM_KEYWORDTerminalRuleCall_19());
                      		
                    }

                    }
                    break;
                case 21 :
                    // InternalEtlParser.g:7608:3: this_TRUE_KEYWORD_20= RULE_TRUE_KEYWORD
                    {
                    this_TRUE_KEYWORD_20=(Token)match(input,RULE_TRUE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TRUE_KEYWORD_20);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TRUE_KEYWORD_20, grammarAccess.getUnquotedStringAccess().getTRUE_KEYWORDTerminalRuleCall_20());
                      		
                    }

                    }
                    break;
                case 22 :
                    // InternalEtlParser.g:7616:3: this_TYPE_KEYWORD_21= RULE_TYPE_KEYWORD
                    {
                    this_TYPE_KEYWORD_21=(Token)match(input,RULE_TYPE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TYPE_KEYWORD_21);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TYPE_KEYWORD_21, grammarAccess.getUnquotedStringAccess().getTYPE_KEYWORDTerminalRuleCall_21());
                      		
                    }

                    }
                    break;
                case 23 :
                    // InternalEtlParser.g:7624:3: this_WILD_KEYWORD_22= RULE_WILD_KEYWORD
                    {
                    this_WILD_KEYWORD_22=(Token)match(input,RULE_WILD_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_WILD_KEYWORD_22);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_WILD_KEYWORD_22, grammarAccess.getUnquotedStringAccess().getWILD_KEYWORDTerminalRuleCall_22());
                      		
                    }

                    }
                    break;
                case 24 :
                    // InternalEtlParser.g:7632:3: this_CONJUNCTION_KEYWORD_23= RULE_CONJUNCTION_KEYWORD
                    {
                    this_CONJUNCTION_KEYWORD_23=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CONJUNCTION_KEYWORD_23);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CONJUNCTION_KEYWORD_23, grammarAccess.getUnquotedStringAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_23());
                      		
                    }

                    }
                    break;
                case 25 :
                    // InternalEtlParser.g:7640:3: this_DISJUNCTION_KEYWORD_24= RULE_DISJUNCTION_KEYWORD
                    {
                    this_DISJUNCTION_KEYWORD_24=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DISJUNCTION_KEYWORD_24);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DISJUNCTION_KEYWORD_24, grammarAccess.getUnquotedStringAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_24());
                      		
                    }

                    }
                    break;
                case 26 :
                    // InternalEtlParser.g:7648:3: this_REVERSED_25= RULE_REVERSED
                    {
                    this_REVERSED_25=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_REVERSED_25);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_REVERSED_25, grammarAccess.getUnquotedStringAccess().getREVERSEDTerminalRuleCall_25());
                      		
                    }

                    }
                    break;
                case 27 :
                    // InternalEtlParser.g:7656:3: this_DESCRIPTION_SHORT_KEYWORD_26= RULE_DESCRIPTION_SHORT_KEYWORD
                    {
                    this_DESCRIPTION_SHORT_KEYWORD_26=(Token)match(input,RULE_DESCRIPTION_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DESCRIPTION_SHORT_KEYWORD_26);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_26, grammarAccess.getUnquotedStringAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_26());
                      		
                    }

                    }
                    break;
                case 28 :
                    // InternalEtlParser.g:7664:3: this_CONCEPT_SHORT_KEYWORD_27= RULE_CONCEPT_SHORT_KEYWORD
                    {
                    this_CONCEPT_SHORT_KEYWORD_27=(Token)match(input,RULE_CONCEPT_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CONCEPT_SHORT_KEYWORD_27);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CONCEPT_SHORT_KEYWORD_27, grammarAccess.getUnquotedStringAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_27());
                      		
                    }

                    }
                    break;
                case 29 :
                    // InternalEtlParser.g:7672:3: this_KEYWORD_28= RULE_KEYWORD
                    {
                    this_KEYWORD_28=(Token)match(input,RULE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_KEYWORD_28);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_KEYWORD_28, grammarAccess.getUnquotedStringAccess().getKEYWORDTerminalRuleCall_28());
                      		
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
    // $ANTLR end "ruleUnquotedString"


    // $ANTLR start "entryRuleDialectAliasValue"
    // InternalEtlParser.g:7683:1: entryRuleDialectAliasValue returns [String current=null] : iv_ruleDialectAliasValue= ruleDialectAliasValue EOF ;
    public final String entryRuleDialectAliasValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDialectAliasValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7685:2: (iv_ruleDialectAliasValue= ruleDialectAliasValue EOF )
            // InternalEtlParser.g:7686:2: iv_ruleDialectAliasValue= ruleDialectAliasValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDialectAliasValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDialectAliasValue=ruleDialectAliasValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDialectAliasValue.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDialectAliasValue"


    // $ANTLR start "ruleDialectAliasValue"
    // InternalEtlParser.g:7695:1: ruleDialectAliasValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+ ;
    public final AntlrDatatypeRuleToken ruleDialectAliasValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DASH_0=null;
        Token this_DIGIT_ZERO_2=null;
        Token this_DIGIT_NONZERO_3=null;
        AntlrDatatypeRuleToken this_UnquotedString_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEtlParser.g:7702:2: ( (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+ )
            // InternalEtlParser.g:7703:2: (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+
            {
            // InternalEtlParser.g:7703:2: (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+
            int cnt113=0;
            loop113:
            do {
                int alt113=5;
                alt113 = dfa113.predict(input);
                switch (alt113) {
            	case 1 :
            	    // InternalEtlParser.g:7704:3: this_DASH_0= RULE_DASH
            	    {
            	    this_DASH_0=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DASH_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DASH_0, grammarAccess.getDialectAliasValueAccess().getDASHTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEtlParser.g:7712:3: this_UnquotedString_1= ruleUnquotedString
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getDialectAliasValueAccess().getUnquotedStringParserRuleCall_1());
            	      		
            	    }
            	    pushFollow(FollowSets000.FOLLOW_72);
            	    this_UnquotedString_1=ruleUnquotedString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_UnquotedString_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalEtlParser.g:7723:3: this_DIGIT_ZERO_2= RULE_DIGIT_ZERO
            	    {
            	    this_DIGIT_ZERO_2=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_ZERO_2);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_ZERO_2, grammarAccess.getDialectAliasValueAccess().getDIGIT_ZEROTerminalRuleCall_2());
            	      		
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalEtlParser.g:7731:3: this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_3=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_NONZERO_3);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_NONZERO_3, grammarAccess.getDialectAliasValueAccess().getDIGIT_NONZEROTerminalRuleCall_3());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt113 >= 1 ) break loop113;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(113, input);
                        throw eee;
                }
                cnt113++;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDialectAliasValue"


    // $ANTLR start "entryRuleLEXICAL_SEARCH_TYPE"
    // InternalEtlParser.g:7745:1: entryRuleLEXICAL_SEARCH_TYPE returns [String current=null] : iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF ;
    public final String entryRuleLEXICAL_SEARCH_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLEXICAL_SEARCH_TYPE = null;


        try {
            // InternalEtlParser.g:7745:59: (iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF )
            // InternalEtlParser.g:7746:2: iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLEXICAL_SEARCH_TYPERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLEXICAL_SEARCH_TYPE=ruleLEXICAL_SEARCH_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLEXICAL_SEARCH_TYPE.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLEXICAL_SEARCH_TYPE"


    // $ANTLR start "ruleLEXICAL_SEARCH_TYPE"
    // InternalEtlParser.g:7752:1: ruleLEXICAL_SEARCH_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleLEXICAL_SEARCH_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MATCH_KEYWORD_0=null;
        Token this_WILD_KEYWORD_1=null;
        Token this_EXACT_KEYWORD_2=null;


        	enterRule();

        try {
            // InternalEtlParser.g:7758:2: ( (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD ) )
            // InternalEtlParser.g:7759:2: (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD )
            {
            // InternalEtlParser.g:7759:2: (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD )
            int alt114=3;
            switch ( input.LA(1) ) {
            case RULE_MATCH_KEYWORD:
                {
                alt114=1;
                }
                break;
            case RULE_WILD_KEYWORD:
                {
                alt114=2;
                }
                break;
            case RULE_EXACT_KEYWORD:
                {
                alt114=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // InternalEtlParser.g:7760:3: this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD
                    {
                    this_MATCH_KEYWORD_0=(Token)match(input,RULE_MATCH_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MATCH_KEYWORD_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MATCH_KEYWORD_0, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getMATCH_KEYWORDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:7768:3: this_WILD_KEYWORD_1= RULE_WILD_KEYWORD
                    {
                    this_WILD_KEYWORD_1=(Token)match(input,RULE_WILD_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_WILD_KEYWORD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_WILD_KEYWORD_1, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getWILD_KEYWORDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEtlParser.g:7776:3: this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD
                    {
                    this_EXACT_KEYWORD_2=(Token)match(input,RULE_EXACT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXACT_KEYWORD_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXACT_KEYWORD_2, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getEXACT_KEYWORDTerminalRuleCall_2());
                      		
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
    // $ANTLR end "ruleLEXICAL_SEARCH_TYPE"


    // $ANTLR start "entryRuleSHORT_DOMAIN"
    // InternalEtlParser.g:7787:1: entryRuleSHORT_DOMAIN returns [String current=null] : iv_ruleSHORT_DOMAIN= ruleSHORT_DOMAIN EOF ;
    public final String entryRuleSHORT_DOMAIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSHORT_DOMAIN = null;


        try {
            // InternalEtlParser.g:7787:52: (iv_ruleSHORT_DOMAIN= ruleSHORT_DOMAIN EOF )
            // InternalEtlParser.g:7788:2: iv_ruleSHORT_DOMAIN= ruleSHORT_DOMAIN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSHORT_DOMAINRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSHORT_DOMAIN=ruleSHORT_DOMAIN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSHORT_DOMAIN.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSHORT_DOMAIN"


    // $ANTLR start "ruleSHORT_DOMAIN"
    // InternalEtlParser.g:7794:1: ruleSHORT_DOMAIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleSHORT_DOMAIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CONCEPT_SHORT_KEYWORD_0=null;
        Token this_DESCRIPTION_SHORT_KEYWORD_1=null;


        	enterRule();

        try {
            // InternalEtlParser.g:7800:2: ( (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD ) )
            // InternalEtlParser.g:7801:2: (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD )
            {
            // InternalEtlParser.g:7801:2: (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==RULE_CONCEPT_SHORT_KEYWORD) ) {
                alt115=1;
            }
            else if ( (LA115_0==RULE_DESCRIPTION_SHORT_KEYWORD) ) {
                alt115=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // InternalEtlParser.g:7802:3: this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD
                    {
                    this_CONCEPT_SHORT_KEYWORD_0=(Token)match(input,RULE_CONCEPT_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CONCEPT_SHORT_KEYWORD_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CONCEPT_SHORT_KEYWORD_0, grammarAccess.getSHORT_DOMAINAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:7810:3: this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD
                    {
                    this_DESCRIPTION_SHORT_KEYWORD_1=(Token)match(input,RULE_DESCRIPTION_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DESCRIPTION_SHORT_KEYWORD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_1, grammarAccess.getSHORT_DOMAINAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleSHORT_DOMAIN"


    // $ANTLR start "entryRuleNON_NUMERIC_OPERATOR"
    // InternalEtlParser.g:7821:1: entryRuleNON_NUMERIC_OPERATOR returns [String current=null] : iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF ;
    public final String entryRuleNON_NUMERIC_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNON_NUMERIC_OPERATOR = null;


        try {
            // InternalEtlParser.g:7821:60: (iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF )
            // InternalEtlParser.g:7822:2: iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNON_NUMERIC_OPERATORRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNON_NUMERIC_OPERATOR=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNON_NUMERIC_OPERATOR.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNON_NUMERIC_OPERATOR"


    // $ANTLR start "ruleNON_NUMERIC_OPERATOR"
    // InternalEtlParser.g:7828:1: ruleNON_NUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL ) ;
    public final AntlrDatatypeRuleToken ruleNON_NUMERIC_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQUAL_0=null;
        Token this_NOT_EQUAL_1=null;


        	enterRule();

        try {
            // InternalEtlParser.g:7834:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL ) )
            // InternalEtlParser.g:7835:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL )
            {
            // InternalEtlParser.g:7835:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==RULE_EQUAL) ) {
                alt116=1;
            }
            else if ( (LA116_0==RULE_NOT_EQUAL) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // InternalEtlParser.g:7836:3: this_EQUAL_0= RULE_EQUAL
                    {
                    this_EQUAL_0=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EQUAL_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EQUAL_0, grammarAccess.getNON_NUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:7844:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
                    {
                    this_NOT_EQUAL_1=(Token)match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NOT_EQUAL_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_NOT_EQUAL_1, grammarAccess.getNON_NUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleNON_NUMERIC_OPERATOR"


    // $ANTLR start "entryRuleNUMERIC_OPERATOR"
    // InternalEtlParser.g:7855:1: entryRuleNUMERIC_OPERATOR returns [String current=null] : iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF ;
    public final String entryRuleNUMERIC_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMERIC_OPERATOR = null;


        try {
            // InternalEtlParser.g:7855:56: (iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF )
            // InternalEtlParser.g:7856:2: iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMERIC_OPERATORRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNUMERIC_OPERATOR=ruleNUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMERIC_OPERATOR.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNUMERIC_OPERATOR"


    // $ANTLR start "ruleNUMERIC_OPERATOR"
    // InternalEtlParser.g:7862:1: ruleNUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE ) ;
    public final AntlrDatatypeRuleToken ruleNUMERIC_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQUAL_0=null;
        Token this_NOT_EQUAL_1=null;
        Token this_GT_2=null;
        Token this_LT_3=null;
        Token this_GTE_4=null;
        Token this_LTE_5=null;


        	enterRule();

        try {
            // InternalEtlParser.g:7868:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE ) )
            // InternalEtlParser.g:7869:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE )
            {
            // InternalEtlParser.g:7869:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE )
            int alt117=6;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                alt117=1;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt117=2;
                }
                break;
            case RULE_GT:
                {
                alt117=3;
                }
                break;
            case RULE_LT:
                {
                alt117=4;
                }
                break;
            case RULE_GTE:
                {
                alt117=5;
                }
                break;
            case RULE_LTE:
                {
                alt117=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // InternalEtlParser.g:7870:3: this_EQUAL_0= RULE_EQUAL
                    {
                    this_EQUAL_0=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EQUAL_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EQUAL_0, grammarAccess.getNUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEtlParser.g:7878:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
                    {
                    this_NOT_EQUAL_1=(Token)match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NOT_EQUAL_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_NOT_EQUAL_1, grammarAccess.getNUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEtlParser.g:7886:3: this_GT_2= RULE_GT
                    {
                    this_GT_2=(Token)match(input,RULE_GT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_GT_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_GT_2, grammarAccess.getNUMERIC_OPERATORAccess().getGTTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEtlParser.g:7894:3: this_LT_3= RULE_LT
                    {
                    this_LT_3=(Token)match(input,RULE_LT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LT_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_LT_3, grammarAccess.getNUMERIC_OPERATORAccess().getLTTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEtlParser.g:7902:3: this_GTE_4= RULE_GTE
                    {
                    this_GTE_4=(Token)match(input,RULE_GTE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_GTE_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_GTE_4, grammarAccess.getNUMERIC_OPERATORAccess().getGTETerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEtlParser.g:7910:3: this_LTE_5= RULE_LTE
                    {
                    this_LTE_5=(Token)match(input,RULE_LTE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LTE_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_LTE_5, grammarAccess.getNUMERIC_OPERATORAccess().getLTETerminalRuleCall_5());
                      		
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
    // $ANTLR end "ruleNUMERIC_OPERATOR"

    // $ANTLR start synpred62_InternalEtlParser
    public final void synpred62_InternalEtlParser_fragment() throws RecognitionException {   
        EObject this_SlotIntegerRange_0 = null;


        // InternalEtlParser.g:1940:3: (this_SlotIntegerRange_0= ruleSlotIntegerRange )
        // InternalEtlParser.g:1940:3: this_SlotIntegerRange_0= ruleSlotIntegerRange
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_SlotIntegerRange_0=ruleSlotIntegerRange();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalEtlParser

    // $ANTLR start synpred63_InternalEtlParser
    public final void synpred63_InternalEtlParser_fragment() throws RecognitionException {   
        EObject lv_maximum_2_0 = null;


        // InternalEtlParser.g:2049:5: ( (lv_maximum_2_0= ruleSlotIntegerMaximumValue ) )
        // InternalEtlParser.g:2049:5: (lv_maximum_2_0= ruleSlotIntegerMaximumValue )
        {
        // InternalEtlParser.g:2049:5: (lv_maximum_2_0= ruleSlotIntegerMaximumValue )
        // InternalEtlParser.g:2050:6: lv_maximum_2_0= ruleSlotIntegerMaximumValue
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getSlotIntegerRangeAccess().getMaximumSlotIntegerMaximumValueParserRuleCall_0_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_maximum_2_0=ruleSlotIntegerMaximumValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred63_InternalEtlParser

    // $ANTLR start synpred67_InternalEtlParser
    public final void synpred67_InternalEtlParser_fragment() throws RecognitionException {   
        EObject this_SlotDecimalRange_0 = null;


        // InternalEtlParser.g:2233:3: (this_SlotDecimalRange_0= ruleSlotDecimalRange )
        // InternalEtlParser.g:2233:3: this_SlotDecimalRange_0= ruleSlotDecimalRange
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_SlotDecimalRange_0=ruleSlotDecimalRange();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalEtlParser

    // $ANTLR start synpred68_InternalEtlParser
    public final void synpred68_InternalEtlParser_fragment() throws RecognitionException {   
        EObject lv_maximum_2_0 = null;


        // InternalEtlParser.g:2342:5: ( (lv_maximum_2_0= ruleSlotDecimalMaximumValue ) )
        // InternalEtlParser.g:2342:5: (lv_maximum_2_0= ruleSlotDecimalMaximumValue )
        {
        // InternalEtlParser.g:2342:5: (lv_maximum_2_0= ruleSlotDecimalMaximumValue )
        // InternalEtlParser.g:2343:6: lv_maximum_2_0= ruleSlotDecimalMaximumValue
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getSlotDecimalRangeAccess().getMaximumSlotDecimalMaximumValueParserRuleCall_0_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_maximum_2_0=ruleSlotDecimalMaximumValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred68_InternalEtlParser

    // $ANTLR start synpred94_InternalEtlParser
    public final void synpred94_InternalEtlParser_fragment() throws RecognitionException {   
        // InternalEtlParser.g:3726:4: ( RULE_DISJUNCTION_KEYWORD )
        // InternalEtlParser.g:3726:5: RULE_DISJUNCTION_KEYWORD
        {
        match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_InternalEtlParser

    // $ANTLR start synpred96_InternalEtlParser
    public final void synpred96_InternalEtlParser_fragment() throws RecognitionException {   
        // InternalEtlParser.g:3794:4: ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )
        // InternalEtlParser.g:
        {
        if ( input.LA(1)==RULE_CONJUNCTION_KEYWORD||input.LA(1)==RULE_COMMA ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred96_InternalEtlParser

    // $ANTLR start synpred98_InternalEtlParser
    public final void synpred98_InternalEtlParser_fragment() throws RecognitionException {   
        EObject this_AttributeConstraint_0 = null;


        // InternalEtlParser.g:3857:3: (this_AttributeConstraint_0= ruleAttributeConstraint )
        // InternalEtlParser.g:3857:3: this_AttributeConstraint_0= ruleAttributeConstraint
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_AttributeConstraint_0=ruleAttributeConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred98_InternalEtlParser

    // $ANTLR start synpred99_InternalEtlParser
    public final void synpred99_InternalEtlParser_fragment() throws RecognitionException {   
        EObject this_EclAttributeGroup_1 = null;


        // InternalEtlParser.g:3869:3: (this_EclAttributeGroup_1= ruleEclAttributeGroup )
        // InternalEtlParser.g:3869:3: this_EclAttributeGroup_1= ruleEclAttributeGroup
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_EclAttributeGroup_1=ruleEclAttributeGroup();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_InternalEtlParser

    // $ANTLR start synpred104_InternalEtlParser
    public final void synpred104_InternalEtlParser_fragment() throws RecognitionException {   
        EObject this_AttributeConstraint_0 = null;


        // InternalEtlParser.g:4187:3: (this_AttributeConstraint_0= ruleAttributeConstraint )
        // InternalEtlParser.g:4187:3: this_AttributeConstraint_0= ruleAttributeConstraint
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_AttributeConstraint_0=ruleAttributeConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_InternalEtlParser

    // $ANTLR start synpred139_InternalEtlParser
    public final void synpred139_InternalEtlParser_fragment() throws RecognitionException {   
        EObject lv_dialects_2_0 = null;


        // InternalEtlParser.g:6003:4: ( ( (lv_dialects_2_0= ruleDialect ) ) )
        // InternalEtlParser.g:6003:4: ( (lv_dialects_2_0= ruleDialect ) )
        {
        // InternalEtlParser.g:6003:4: ( (lv_dialects_2_0= ruleDialect ) )
        // InternalEtlParser.g:6004:5: (lv_dialects_2_0= ruleDialect )
        {
        // InternalEtlParser.g:6004:5: (lv_dialects_2_0= ruleDialect )
        // InternalEtlParser.g:6005:6: lv_dialects_2_0= ruleDialect
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_0_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_dialects_2_0=ruleDialect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred139_InternalEtlParser

    // $ANTLR start synpred143_InternalEtlParser
    public final void synpred143_InternalEtlParser_fragment() throws RecognitionException {   
        EObject lv_acceptability_1_0 = null;


        // InternalEtlParser.g:6185:4: ( (lv_acceptability_1_0= ruleAcceptability ) )
        // InternalEtlParser.g:6185:4: (lv_acceptability_1_0= ruleAcceptability )
        {
        // InternalEtlParser.g:6185:4: (lv_acceptability_1_0= ruleAcceptability )
        // InternalEtlParser.g:6186:5: lv_acceptability_1_0= ruleAcceptability
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getDialectAccess().getAcceptabilityAcceptabilityParserRuleCall_1_0());
          				
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_acceptability_1_0=ruleAcceptability();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred143_InternalEtlParser

    // $ANTLR start synpred151_InternalEtlParser
    public final void synpred151_InternalEtlParser_fragment() throws RecognitionException {   
        EObject this_FilteredExpressionConstraint_0 = null;


        // InternalEtlParser.g:7010:3: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint )
        // InternalEtlParser.g:7010:3: this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_FilteredExpressionConstraint_0=ruleFilteredExpressionConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred151_InternalEtlParser

    // $ANTLR start synpred152_InternalEtlParser
    public final void synpred152_InternalEtlParser_fragment() throws RecognitionException {   
        Token this_DIGIT_NONZERO_0=null;

        // InternalEtlParser.g:7058:3: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO )
        // InternalEtlParser.g:7058:3: this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO
        {
        this_DIGIT_NONZERO_0=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred152_InternalEtlParser

    // $ANTLR start synpred153_InternalEtlParser
    public final void synpred153_InternalEtlParser_fragment() throws RecognitionException {   
        Token this_DIGIT_ZERO_1=null;

        // InternalEtlParser.g:7066:3: (this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )
        // InternalEtlParser.g:7066:3: this_DIGIT_ZERO_1= RULE_DIGIT_ZERO
        {
        this_DIGIT_ZERO_1=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred153_InternalEtlParser

    // $ANTLR start synpred193_InternalEtlParser
    public final void synpred193_InternalEtlParser_fragment() throws RecognitionException {   
        Token this_DASH_0=null;

        // InternalEtlParser.g:7704:3: (this_DASH_0= RULE_DASH )
        // InternalEtlParser.g:7704:3: this_DASH_0= RULE_DASH
        {
        this_DASH_0=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred193_InternalEtlParser

    // $ANTLR start synpred194_InternalEtlParser
    public final void synpred194_InternalEtlParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_UnquotedString_1 = null;


        // InternalEtlParser.g:7712:3: (this_UnquotedString_1= ruleUnquotedString )
        // InternalEtlParser.g:7712:3: this_UnquotedString_1= ruleUnquotedString
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getDialectAliasValueAccess().getUnquotedStringParserRuleCall_1());
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_UnquotedString_1=ruleUnquotedString();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred194_InternalEtlParser

    // $ANTLR start synpred195_InternalEtlParser
    public final void synpred195_InternalEtlParser_fragment() throws RecognitionException {   
        Token this_DIGIT_ZERO_2=null;

        // InternalEtlParser.g:7723:3: (this_DIGIT_ZERO_2= RULE_DIGIT_ZERO )
        // InternalEtlParser.g:7723:3: this_DIGIT_ZERO_2= RULE_DIGIT_ZERO
        {
        this_DIGIT_ZERO_2=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred195_InternalEtlParser

    // $ANTLR start synpred196_InternalEtlParser
    public final void synpred196_InternalEtlParser_fragment() throws RecognitionException {   
        Token this_DIGIT_NONZERO_3=null;

        // InternalEtlParser.g:7731:3: (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )
        // InternalEtlParser.g:7731:3: this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO
        {
        this_DIGIT_NONZERO_3=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred196_InternalEtlParser

    // Delegated rules

    public final boolean synpred196_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred196_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred99_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred193_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred193_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred151_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred151_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred152_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred152_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred194_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred194_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred139_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred139_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred153_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred153_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred143_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred143_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred195_InternalEtlParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred195_InternalEtlParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA95 dfa95 = new DFA95(this);
    protected DFA103 dfa103 = new DFA103(this);
    protected DFA113 dfa113 = new DFA113(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\1\5\2\uffff\1\77\2\75\1\5\1\4\1\77\3\5";
    static final String dfa_3s = "\1\102\1\106\2\uffff\3\100\1\5\1\102\1\112\2\100\1\24";
    static final String dfa_4s = "\2\uffff\1\1\1\2\11\uffff";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\72\uffff\2\2\1\uffff\1\3",
            "\1\10\1\4\15\uffff\1\7\52\uffff\1\6\1\5\5\uffff\1\2",
            "",
            "",
            "\1\6\1\5",
            "\1\11\1\uffff\1\6\1\5",
            "\1\11\1\uffff\1\6\1\5",
            "\1\10",
            "\1\2\72\uffff\2\2\1\uffff\1\3",
            "\1\13\1\12\11\uffff\1\14",
            "\1\10\16\uffff\1\7\52\uffff\1\13\1\12",
            "\1\10\16\uffff\1\7\52\uffff\1\13\1\12",
            "\1\10\16\uffff\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "332:3: ( ( ( (lv_attributes_0_0= ruleAttribute ) ) (this_COMMA_1= RULE_COMMA ( (lv_attributes_2_0= ruleAttribute ) ) )* ) | ( (lv_groups_3_0= ruleAttributeGroup ) ) )";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\2\15\uffff";
    static final String dfa_9s = "\2\4\1\uffff\1\5\1\uffff\1\77\2\75\1\5\1\4\1\77\3\5";
    static final String dfa_10s = "\1\105\1\102\1\uffff\1\106\1\uffff\3\100\1\5\1\102\1\112\2\100\1\24";
    static final String dfa_11s = "\2\uffff\1\2\1\uffff\1\1\11\uffff";
    static final String dfa_12s = "\16\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\71\uffff\1\1\3\uffff\1\2\2\uffff\1\2",
            "\1\3\72\uffff\2\4\1\uffff\1\2",
            "",
            "\1\11\1\5\15\uffff\1\10\52\uffff\1\7\1\6\5\uffff\1\4",
            "",
            "\1\7\1\6",
            "\1\12\1\uffff\1\7\1\6",
            "\1\12\1\uffff\1\7\1\6",
            "\1\11",
            "\1\4\72\uffff\2\4\1\uffff\1\2",
            "\1\14\1\13\11\uffff\1\15",
            "\1\11\16\uffff\1\10\52\uffff\1\14\1\13",
            "\1\11\16\uffff\1\10\52\uffff\1\14\1\13",
            "\1\11\16\uffff\1\10"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 353:5: (this_COMMA_1= RULE_COMMA ( (lv_attributes_2_0= ruleAttribute ) ) )*";
        }
    }
    static final String dfa_14s = "\11\uffff\2\14\3\uffff";
    static final String dfa_15s = "\1\4\1\106\3\uffff\1\77\1\5\2\77\2\4\3\uffff";
    static final String dfa_16s = "\1\117\1\106\3\uffff\1\107\1\104\2\100\2\111\3\uffff";
    static final String dfa_17s = "\2\uffff\1\1\1\2\1\3\6\uffff\1\6\1\4\1\5";
    static final String[] dfa_18s = {
            "\1\1\13\uffff\1\4\56\uffff\2\2\3\uffff\1\3\12\uffff\1\5",
            "\1\6",
            "",
            "",
            "",
            "\1\12\1\11\5\uffff\1\7\1\10",
            "\1\2\2\uffff\2\2\1\uffff\3\13\6\uffff\1\2\57\uffff\1\2",
            "\1\12\1\11",
            "\1\12\1\11",
            "\1\14\71\uffff\1\14\1\12\1\11\1\uffff\2\14\1\uffff\1\14\3\uffff\1\15",
            "\1\14\71\uffff\1\14\1\12\1\11\1\uffff\2\14\1\uffff\1\14\3\uffff\1\15",
            "",
            "",
            ""
    };
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_12;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "615:2: (this_ConceptReference_0= ruleConceptReference | (this_ROUND_OPEN_1= RULE_ROUND_OPEN this_SubExpression_2= ruleSubExpression this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) | this_StringValue_4= ruleStringValue | this_IntegerValue_5= ruleIntegerValue | this_DecimalValue_6= ruleDecimalValue | this_ConcreteValueReplacementSlot_7= ruleConcreteValueReplacementSlot )";
        }
    }
    static final String dfa_19s = "\3\uffff\2\6\1\1\10\uffff";
    static final String dfa_20s = "\1\75\1\uffff\1\77\3\75\1\uffff\1\117\2\77\4\0";
    static final String dfa_21s = "\1\117\1\uffff\1\100\3\117\1\uffff\1\117\2\100\4\0";
    static final String dfa_22s = "\1\uffff\1\1\4\uffff\1\2\7\uffff";
    static final String dfa_23s = "\12\uffff\1\3\1\1\1\2\1\0}>";
    static final String[] dfa_24s = {
            "\1\1\20\uffff\1\1\1\2",
            "",
            "\1\4\1\3",
            "\1\5\1\uffff\1\4\1\3\4\uffff\1\6\10\uffff\2\6",
            "\1\5\1\uffff\1\4\1\3\4\uffff\1\6\10\uffff\2\6",
            "\1\1\7\uffff\1\1\7\uffff\1\7\1\1\1\10",
            "",
            "\1\11",
            "\1\13\1\12",
            "\1\15\1\14",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_7;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1939:2: (this_SlotIntegerRange_0= ruleSlotIntegerRange | this_SlotIntegerValue_1= ruleSlotIntegerValue )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_13 = input.LA(1);

                         
                        int index40_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalEtlParser()) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index40_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_11 = input.LA(1);

                         
                        int index40_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalEtlParser()) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index40_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_12 = input.LA(1);

                         
                        int index40_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalEtlParser()) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index40_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA40_10 = input.LA(1);

                         
                        int index40_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalEtlParser()) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index40_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\23\uffff";
    static final String dfa_26s = "\5\uffff\3\10\1\uffff\1\1\11\uffff";
    static final String dfa_27s = "\1\75\1\uffff\3\77\3\75\1\uffff\1\75\1\117\6\77\2\0";
    static final String dfa_28s = "\1\117\1\uffff\1\100\2\111\3\117\1\uffff\2\117\2\100\4\111\2\0";
    static final String dfa_29s = "\1\uffff\1\1\6\uffff\1\2\12\uffff";
    static final String dfa_30s = "\21\uffff\1\0\1\1}>";
    static final String[] dfa_31s = {
            "\1\1\20\uffff\1\1\1\2",
            "",
            "\1\4\1\3",
            "\1\4\1\3\10\uffff\1\5",
            "\1\4\1\3\10\uffff\1\5",
            "\1\11\1\uffff\1\7\1\6\4\uffff\1\10\10\uffff\2\10",
            "\1\11\1\uffff\1\7\1\6\4\uffff\1\10\10\uffff\2\10",
            "\1\11\1\uffff\1\7\1\6\4\uffff\1\10\10\uffff\2\10",
            "",
            "\1\1\7\uffff\1\1\7\uffff\1\12\1\1\1\13",
            "\1\14",
            "\1\16\1\15",
            "\1\20\1\17",
            "\1\16\1\15\10\uffff\1\21",
            "\1\16\1\15\10\uffff\1\21",
            "\1\20\1\17\10\uffff\1\22",
            "\1\20\1\17\10\uffff\1\22",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_25;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "2232:2: (this_SlotDecimalRange_0= ruleSlotDecimalRange | this_SlotDecimalValue_1= ruleSlotDecimalValue )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_17 = input.LA(1);

                         
                        int index45_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalEtlParser()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index45_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_18 = input.LA(1);

                         
                        int index45_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalEtlParser()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index45_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_32s = "\7\uffff";
    static final String dfa_33s = "\1\3\6\uffff";
    static final String dfa_34s = "\1\75\1\uffff\1\77\1\uffff\2\77\1\0";
    static final String dfa_35s = "\1\117\1\uffff\1\100\1\uffff\2\111\1\0";
    static final String dfa_36s = "\1\uffff\1\1\1\uffff\1\2\3\uffff";
    static final String dfa_37s = "\6\uffff\1\0}>";
    static final String[] dfa_38s = {
            "\1\3\7\uffff\1\3\7\uffff\1\1\1\3\1\2",
            "",
            "\1\5\1\4",
            "",
            "\1\5\1\4\10\uffff\1\6",
            "\1\5\1\4\10\uffff\1\6",
            "\1\uffff"
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_32;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "2341:4: ( (lv_maximum_2_0= ruleSlotDecimalMaximumValue ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_6 = input.LA(1);

                         
                        int index46_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalEtlParser()) ) {s = 1;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index46_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_39s = "\22\uffff";
    static final String dfa_40s = "\1\22\1\0\15\uffff\1\0\2\uffff";
    static final String dfa_41s = "\1\116\1\0\15\uffff\1\0\2\uffff";
    static final String dfa_42s = "\2\uffff\1\1\15\uffff\1\2\1\3";
    static final String dfa_43s = "\1\uffff\1\0\15\uffff\1\1\2\uffff}>";
    static final String[] dfa_44s = {
            "\1\1\33\uffff\1\2\3\uffff\6\2\7\uffff\2\2\1\uffff\1\20\1\uffff\1\17\3\uffff\1\2\1\uffff\1\2\2\uffff\2\2",
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
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_39;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "3856:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )";
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
                        if ( (synpred98_InternalEtlParser()) ) {s = 2;}

                        else if ( (synpred99_InternalEtlParser()) ) {s = 16;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_15 = input.LA(1);

                         
                        int index65_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_InternalEtlParser()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index65_15);
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
    static final String dfa_45s = "\21\uffff";
    static final String dfa_46s = "\1\22\16\uffff\1\0\1\uffff";
    static final String dfa_47s = "\1\116\16\uffff\1\0\1\uffff";
    static final String dfa_48s = "\1\uffff\1\1\16\uffff\1\2";
    static final String dfa_49s = "\17\uffff\1\0\1\uffff}>";
    static final String[] dfa_50s = {
            "\1\1\33\uffff\1\1\3\uffff\6\1\7\uffff\2\1\3\uffff\1\17\3\uffff\1\1\1\uffff\1\1\2\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            ""
    };

    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = dfa_45;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_49;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "4186:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_15 = input.LA(1);

                         
                        int index70_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalEtlParser()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index70_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_51s = "\20\uffff";
    static final String dfa_52s = "\14\uffff\2\16\2\uffff";
    static final String dfa_53s = "\1\70\2\20\4\117\1\77\2\uffff\2\77\2\43\2\uffff";
    static final String dfa_54s = "\1\116\6\117\1\107\2\uffff\2\100\2\111\2\uffff";
    static final String dfa_55s = "\10\uffff\1\1\1\2\4\uffff\1\3\1\4";
    static final String dfa_56s = "\20\uffff}>";
    static final String[] dfa_57s = {
            "\1\5\1\6\21\uffff\1\1\1\2\1\4\1\3",
            "\1\11\24\uffff\1\10\3\uffff\1\10\45\uffff\1\7",
            "\1\11\24\uffff\1\10\3\uffff\1\10\45\uffff\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\15\1\14\5\uffff\1\12\1\13",
            "",
            "",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\16\10\uffff\2\16\20\uffff\1\16\1\15\1\14\2\uffff\1\16\1\uffff\1\16\3\uffff\1\17",
            "\1\16\10\uffff\2\16\20\uffff\1\16\1\15\1\14\2\uffff\1\16\1\uffff\1\16\3\uffff\1\17",
            "",
            ""
    };

    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[][] dfa_57 = unpackEncodedStringArray(dfa_57s);

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = dfa_51;
            this.eof = dfa_52;
            this.min = dfa_53;
            this.max = dfa_54;
            this.accept = dfa_55;
            this.special = dfa_56;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "4536:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )";
        }
    }
    static final String dfa_58s = "\17\uffff";
    static final String dfa_59s = "\1\62\14\uffff\1\0\1\uffff";
    static final String dfa_60s = "\1\116\14\uffff\1\0\1\uffff";
    static final String dfa_61s = "\1\uffff\1\1\14\uffff\1\2";
    static final String dfa_62s = "\15\uffff\1\0\1\uffff}>";
    static final String[] dfa_63s = {
            "\6\1\7\uffff\2\1\3\uffff\1\15\3\uffff\1\1\1\uffff\1\1\2\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            ""
    };

    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final char[] dfa_59 = DFA.unpackEncodedStringToUnsignedChars(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[][] dfa_63 = unpackEncodedStringArray(dfa_63s);

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = dfa_58;
            this.eof = dfa_58;
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_61;
            this.special = dfa_62;
            this.transition = dfa_63;
        }
        public String getDescription() {
            return "6002:3: ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA92_13 = input.LA(1);

                         
                        int index92_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred139_InternalEtlParser()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index92_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 92, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_64s = "\10\uffff";
    static final String dfa_65s = "\1\2\7\uffff";
    static final String dfa_66s = "\1\54\1\25\1\uffff\2\43\1\uffff\1\43\1\0";
    static final String dfa_67s = "\2\116\1\uffff\2\111\1\uffff\1\111\1\0";
    static final String dfa_68s = "\2\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String dfa_69s = "\7\uffff\1\0}>";
    static final String[] dfa_70s = {
            "\2\2\4\uffff\6\2\3\uffff\1\2\2\uffff\3\2\3\uffff\1\1\1\2\2\uffff\1\2\1\uffff\1\2\2\uffff\2\2",
            "\35\5\6\2\7\uffff\1\4\1\3\3\uffff\1\2\3\uffff\1\2\1\uffff\1\2\2\uffff\2\2",
            "",
            "\1\2\10\uffff\2\2\14\uffff\1\2\1\uffff\1\6\1\uffff\1\2\1\4\1\3\1\2\3\uffff\1\7\3\uffff\1\2",
            "\1\2\10\uffff\2\2\14\uffff\1\2\1\uffff\1\6\1\uffff\1\2\1\4\1\3\1\2\3\uffff\1\7\3\uffff\1\2",
            "",
            "\1\2\10\uffff\2\2\14\uffff\1\2\3\uffff\1\2\2\5\1\2\3\uffff\1\7\3\uffff\1\2",
            "\1\uffff"
    };

    static final short[] dfa_64 = DFA.unpackEncodedString(dfa_64s);
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final char[] dfa_66 = DFA.unpackEncodedStringToUnsignedChars(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[][] dfa_70 = unpackEncodedStringArray(dfa_70s);

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = dfa_64;
            this.eof = dfa_65;
            this.min = dfa_66;
            this.max = dfa_67;
            this.accept = dfa_68;
            this.special = dfa_69;
            this.transition = dfa_70;
        }
        public String getDescription() {
            return "6184:3: ( (lv_acceptability_1_0= ruleAcceptability ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA95_7 = input.LA(1);

                         
                        int index95_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred143_InternalEtlParser()) ) {s = 5;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index95_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 95, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_71s = "\1\62\1\uffff\1\62\3\43\1\0\1\uffff";
    static final String dfa_72s = "\1\116\1\uffff\1\116\3\111\1\0\1\uffff";
    static final String dfa_73s = "\1\uffff\1\1\5\uffff\1\2";
    static final String dfa_74s = "\6\uffff\1\0\1\uffff}>";
    static final String[] dfa_75s = {
            "\6\1\7\uffff\2\1\3\uffff\1\2\3\uffff\1\1\1\uffff\1\1\2\uffff\2\1",
            "",
            "\6\1\7\uffff\1\4\1\3\3\uffff\1\1\3\uffff\1\1\1\uffff\1\1\2\uffff\2\1",
            "\1\1\10\uffff\2\1\14\uffff\1\1\1\uffff\1\5\1\uffff\1\1\1\4\1\3\1\1\3\uffff\1\6\3\uffff\1\1",
            "\1\1\10\uffff\2\1\14\uffff\1\1\1\uffff\1\5\1\uffff\1\1\1\4\1\3\1\1\3\uffff\1\6\3\uffff\1\1",
            "\1\1\10\uffff\2\1\14\uffff\1\1\3\uffff\1\1\2\7\1\1\3\uffff\1\6\3\uffff\1\1",
            "\1\uffff",
            ""
    };
    static final char[] dfa_71 = DFA.unpackEncodedStringToUnsignedChars(dfa_71s);
    static final char[] dfa_72 = DFA.unpackEncodedStringToUnsignedChars(dfa_72s);
    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final short[][] dfa_75 = unpackEncodedStringArray(dfa_75s);

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = dfa_64;
            this.eof = dfa_64;
            this.min = dfa_71;
            this.max = dfa_72;
            this.accept = dfa_73;
            this.special = dfa_74;
            this.transition = dfa_75;
        }
        public String getDescription() {
            return "7009:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA103_6 = input.LA(1);

                         
                        int index103_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred151_InternalEtlParser()) ) {s = 1;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index103_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 103, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_76s = "\46\uffff";
    static final String dfa_77s = "\1\1\45\uffff";
    static final String dfa_78s = "\1\21\1\uffff\40\0\4\uffff";
    static final String dfa_79s = "\1\107\1\uffff\40\0\4\uffff";
    static final String dfa_80s = "\1\uffff\1\5\40\uffff\1\2\1\1\1\3\1\4";
    static final String dfa_81s = "\2\uffff\1\1\1\10\1\0\1\2\1\30\1\21\1\13\1\3\1\31\1\22\1\14\1\4\1\32\1\23\1\15\1\5\1\33\1\24\1\16\1\6\1\34\1\25\1\17\1\7\1\35\1\26\1\36\1\27\1\20\1\37\1\11\1\12\4\uffff}>";
    static final String[] dfa_82s = {
            "\1\1\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\2\1\3\1\34\1\35\1\36\1\37\11\uffff\1\1\2\uffff\1\1\1\40\1\41\3\uffff\2\1\1\uffff\1\4",
            "",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final char[] dfa_78 = DFA.unpackEncodedStringToUnsignedChars(dfa_78s);
    static final char[] dfa_79 = DFA.unpackEncodedStringToUnsignedChars(dfa_79s);
    static final short[] dfa_80 = DFA.unpackEncodedString(dfa_80s);
    static final short[] dfa_81 = DFA.unpackEncodedString(dfa_81s);
    static final short[][] dfa_82 = unpackEncodedStringArray(dfa_82s);

    class DFA113 extends DFA {

        public DFA113(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 113;
            this.eot = dfa_76;
            this.eof = dfa_77;
            this.min = dfa_78;
            this.max = dfa_79;
            this.accept = dfa_80;
            this.special = dfa_81;
            this.transition = dfa_82;
        }
        public String getDescription() {
            return "()+ loopback of 7703:2: (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA113_4 = input.LA(1);

                         
                        int index113_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred193_InternalEtlParser()) ) {s = 35;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA113_2 = input.LA(1);

                         
                        int index113_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA113_5 = input.LA(1);

                         
                        int index113_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA113_9 = input.LA(1);

                         
                        int index113_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA113_13 = input.LA(1);

                         
                        int index113_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_13);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA113_17 = input.LA(1);

                         
                        int index113_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA113_21 = input.LA(1);

                         
                        int index113_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_21);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA113_25 = input.LA(1);

                         
                        int index113_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_25);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA113_3 = input.LA(1);

                         
                        int index113_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_3);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA113_32 = input.LA(1);

                         
                        int index113_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred195_InternalEtlParser()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_32);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA113_33 = input.LA(1);

                         
                        int index113_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred196_InternalEtlParser()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_33);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA113_8 = input.LA(1);

                         
                        int index113_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_8);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA113_12 = input.LA(1);

                         
                        int index113_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_12);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA113_16 = input.LA(1);

                         
                        int index113_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_16);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA113_20 = input.LA(1);

                         
                        int index113_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_20);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA113_24 = input.LA(1);

                         
                        int index113_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_24);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA113_30 = input.LA(1);

                         
                        int index113_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_30);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA113_7 = input.LA(1);

                         
                        int index113_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_7);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA113_11 = input.LA(1);

                         
                        int index113_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_11);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA113_15 = input.LA(1);

                         
                        int index113_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_15);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA113_19 = input.LA(1);

                         
                        int index113_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_19);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA113_23 = input.LA(1);

                         
                        int index113_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_23);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA113_27 = input.LA(1);

                         
                        int index113_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_27);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA113_29 = input.LA(1);

                         
                        int index113_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_29);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA113_6 = input.LA(1);

                         
                        int index113_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_6);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA113_10 = input.LA(1);

                         
                        int index113_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_10);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA113_14 = input.LA(1);

                         
                        int index113_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_14);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA113_18 = input.LA(1);

                         
                        int index113_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_18);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA113_22 = input.LA(1);

                         
                        int index113_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_22);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA113_26 = input.LA(1);

                         
                        int index113_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_26);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA113_28 = input.LA(1);

                         
                        int index113_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_28);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA113_31 = input.LA(1);

                         
                        int index113_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalEtlParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_31);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 113, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x8000000000000010L,0x0000000000000001L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000042L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x8000000000000010L,0x0000000000000005L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xC000000000000012L,0x0000000000000005L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x8000000000010010L,0x0000000000008011L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000010L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x80FC000000000010L,0x0000000000006511L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100020L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100220L,0x0000000000000010L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x43F070080000C000L,0x0000000000007900L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x43F070080000C000L,0x0000000000007920L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x8000000000100060L,0x0000000000000001L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000020L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x2000000000000000L,0x000000000000C000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2000000000000000L,0x000000000000C020L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x8000000000000040L,0x0000000000000001L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x8000000000000040L,0x0000000000000401L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x8000000000000040L,0x00000000000000C1L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000002L,0x000000000000A000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x000000000000A000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x4000100000000002L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x80FC400000040010L,0x0000000000006515L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000000010L,0x0000000000000021L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x80FC400000040010L,0x0000000000006511L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x80FC400000000010L,0x0000000000006511L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0300000000000002L,0x0000000000007800L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000022000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00018507FFE00000L,0x0000000000000010L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000008D000010000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000008D000010000L,0x0000000000000020L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0003FFFFFFE00000L,0x0000000000000010L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0003FFFFFFE00000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0003FFFFFFE00000L,0x0000000000000020L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x80FC000000000010L,0x0000000000006531L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8003FFFFFFE00000L,0x0000000000000091L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8003FFFFFFE00000L,0x0000000000000081L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x8003FFFFFFE00000L,0x00000000000000A1L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x80FC000000000012L,0x0000000000006511L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x80FC000000020012L,0x0000000000006511L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0300000000000000L,0x0000000000007800L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x8000022000000040L,0x0000000000000001L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x8003FFFFFFE00002L,0x0000000000000081L});
    }


}