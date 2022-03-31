package com.b2international.snomed.etl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEtlLexer extends Lexer {
    public static final int RULE_DIALECT_KEYWORD=33;
    public static final int RULE_LANGUAGE_KEYWORD=31;
    public static final int RULE_CURLY_OPEN=71;
    public static final int RULE_DBL_GT=59;
    public static final int RULE_TO=67;
    public static final int RULE_ROUND_CLOSE=74;
    public static final int RULE_GT=84;
    public static final int RULE_ACTIVE_KEYWORD=34;
    public static final int RULE_CONCEPT_SHORT_KEYWORD=53;
    public static final int RULE_SLOTNAME_STRING=20;
    public static final int RULE_SCG=9;
    public static final int RULE_MODULEID_KEYWORD=32;
    public static final int RULE_GTE=62;
    public static final int RULE_DOUBLE_SQUARE_OPEN=4;
    public static final int RULE_DISJUNCTION_KEYWORD=49;
    public static final int RULE_EQUIVALENT_TO=14;
    public static final int RULE_ROUND_OPEN=73;
    public static final int RULE_UNDERSCORE=77;
    public static final int RULE_DBL_LT=58;
    public static final int RULE_TYPEID_KEYWORD=35;
    public static final int RULE_MATCH_KEYWORD=39;
    public static final int RULE_NOT_EQUAL=82;
    public static final int RULE_SQUARE_CLOSE=19;
    public static final int RULE_SEMANTIC_TAG_KEYWORD=29;
    public static final int RULE_ID=8;
    public static final int RULE_SQUARE_OPEN=18;
    public static final int RULE_EQUAL=81;
    public static final int RULE_DEC=13;
    public static final int RULE_CASE_SIGNIFICANCE_ID_KEYWORD=22;
    public static final int RULE_EXCLUSION_KEYWORD=36;
    public static final int RULE_DESCRIPTION_SHORT_KEYWORD=52;
    public static final int RULE_LT_EM=60;
    public static final int RULE_COMMA=68;
    public static final int RULE_CURLY_CLOSE=72;
    public static final int RULE_DBL_GT_EM=57;
    public static final int RULE_DIGIT=69;
    public static final int RULE_HISTORY_KEYWORD=21;
    public static final int RULE_COLON=70;
    public static final int RULE_MOD_KEYWORD=46;
    public static final int RULE_TILDE=6;
    public static final int RULE_LT=83;
    public static final int RULE_DOUBLE_CURLY_CLOSE=65;
    public static final int RULE_LANGUAGE_REFSET_ID_KEYWORD=25;
    public static final int RULE_INT=12;
    public static final int RULE_EXACT_KEYWORD=37;
    public static final int RULE_ML_COMMENT=86;
    public static final int RULE_DOUBLE_SQUARE_CLOSE=5;
    public static final int RULE_PREFERRED_IN_KEYWORD=28;
    public static final int RULE_PIPE_DELIMITED_STRING=66;
    public static final int RULE_ALPHA=54;
    public static final int RULE_LTE=63;
    public static final int RULE_TYPE_KEYWORD=43;
    public static final int RULE_STRING=16;
    public static final int RULE_AT=7;
    public static final int RULE_FALSE_KEYWORD=38;
    public static final int RULE_REVERSED=50;
    public static final int RULE_SL_COMMENT=87;
    public static final int RULE_HASH=85;
    public static final int RULE_TOK=10;
    public static final int RULE_DASH=76;
    public static final int RULE_PLUS=75;
    public static final int RULE_DOT=79;
    public static final int EOF=-1;
    public static final int RULE_DIALECTID_KEYWORD=30;
    public static final int RULE_KEYWORD=55;
    public static final int RULE_DEFINITION_STATUS_ID_KEYWORD=23;
    public static final int RULE_DEFINITION_STATUS_TOKEN_KEYWORD=24;
    public static final int RULE_ACCEPTABLE_IN_KEYWORD=27;
    public static final int RULE_SUBTYPE_OF=15;
    public static final int RULE_WS=17;
    public static final int RULE_TERM_KEYWORD=41;
    public static final int RULE_MAX_KEYWORD=47;
    public static final int RULE_MEMBER_SHORT_KEYWORD=51;
    public static final int RULE_GT_EM=61;
    public static final int RULE_REGEX_KEYWORD=40;
    public static final int RULE_TRUE_KEYWORD=42;
    public static final int RULE_CARET=78;
    public static final int RULE_DOUBLE_CURLY_OPEN=64;
    public static final int RULE_WILD_KEYWORD=44;
    public static final int RULE_MIN_KEYWORD=45;
    public static final int RULE_CONJUNCTION_KEYWORD=48;
    public static final int RULE_STR=11;
    public static final int RULE_WILDCARD=80;
    public static final int RULE_EFFECTIVE_TIME_KEYWORD=26;
    public static final int RULE_DBL_LT_EM=56;

    // delegates
    // delegators

    public InternalEtlLexer() {;} 
    public InternalEtlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEtlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEtlLexer.g"; }

    // $ANTLR start "RULE_DOUBLE_SQUARE_OPEN"
    public final void mRULE_DOUBLE_SQUARE_OPEN() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_SQUARE_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:26:25: ( '[[' )
            // InternalEtlLexer.g:26:27: '[['
            {
            match("[["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_SQUARE_OPEN"

    // $ANTLR start "RULE_DOUBLE_SQUARE_CLOSE"
    public final void mRULE_DOUBLE_SQUARE_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_SQUARE_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:28:26: ( ']]' )
            // InternalEtlLexer.g:28:28: ']]'
            {
            match("]]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_SQUARE_CLOSE"

    // $ANTLR start "RULE_TILDE"
    public final void mRULE_TILDE() throws RecognitionException {
        try {
            int _type = RULE_TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:30:12: ( '~' )
            // InternalEtlLexer.g:30:14: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TILDE"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            // InternalEtlLexer.g:32:18: ( '@' )
            // InternalEtlLexer.g:32:20: '@'
            {
            match('@'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:34:9: ( 'id' )
            // InternalEtlLexer.g:34:11: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_SCG"
    public final void mRULE_SCG() throws RecognitionException {
        try {
            int _type = RULE_SCG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:36:10: ( 'scg' )
            // InternalEtlLexer.g:36:12: 'scg'
            {
            match("scg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCG"

    // $ANTLR start "RULE_TOK"
    public final void mRULE_TOK() throws RecognitionException {
        try {
            int _type = RULE_TOK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:38:10: ( 'tok' )
            // InternalEtlLexer.g:38:12: 'tok'
            {
            match("tok"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TOK"

    // $ANTLR start "RULE_STR"
    public final void mRULE_STR() throws RecognitionException {
        try {
            int _type = RULE_STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:40:10: ( 'str' )
            // InternalEtlLexer.g:40:12: 'str'
            {
            match("str"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STR"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:42:10: ( 'int' )
            // InternalEtlLexer.g:42:12: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DEC"
    public final void mRULE_DEC() throws RecognitionException {
        try {
            int _type = RULE_DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:44:10: ( 'dec' )
            // InternalEtlLexer.g:44:12: 'dec'
            {
            match("dec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC"

    // $ANTLR start "RULE_EQUIVALENT_TO"
    public final void mRULE_EQUIVALENT_TO() throws RecognitionException {
        try {
            int _type = RULE_EQUIVALENT_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:46:20: ( '===' )
            // InternalEtlLexer.g:46:22: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUIVALENT_TO"

    // $ANTLR start "RULE_SUBTYPE_OF"
    public final void mRULE_SUBTYPE_OF() throws RecognitionException {
        try {
            int _type = RULE_SUBTYPE_OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:48:17: ( '<<<' )
            // InternalEtlLexer.g:48:19: '<<<'
            {
            match("<<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUBTYPE_OF"

    // $ANTLR start "RULE_SLOTNAME_STRING"
    public final void mRULE_SLOTNAME_STRING() throws RecognitionException {
        try {
            int _type = RULE_SLOTNAME_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:50:22: ( RULE_AT ( RULE_STRING | (~ ( ( '\\\\' | '\"' | '\\'' | RULE_WS | RULE_AT | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE ) ) )* ) )
            // InternalEtlLexer.g:50:24: RULE_AT ( RULE_STRING | (~ ( ( '\\\\' | '\"' | '\\'' | RULE_WS | RULE_AT | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE ) ) )* )
            {
            mRULE_AT(); 
            // InternalEtlLexer.g:50:32: ( RULE_STRING | (~ ( ( '\\\\' | '\"' | '\\'' | RULE_WS | RULE_AT | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE ) ) )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\"'||LA2_0=='\'') ) {
                alt2=1;
            }
            else {
                alt2=2;}
            switch (alt2) {
                case 1 :
                    // InternalEtlLexer.g:50:33: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:50:45: (~ ( ( '\\\\' | '\"' | '\\'' | RULE_WS | RULE_AT | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE ) ) )*
                    {
                    // InternalEtlLexer.g:50:45: (~ ( ( '\\\\' | '\"' | '\\'' | RULE_WS | RULE_AT | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\u001F')||LA1_0=='!'||(LA1_0>='#' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='?')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='^' && LA1_0<='\uFFFF')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalEtlLexer.g:50:45: ~ ( ( '\\\\' | '\"' | '\\'' | RULE_WS | RULE_AT | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLOTNAME_STRING"

    // $ANTLR start "RULE_HISTORY_KEYWORD"
    public final void mRULE_HISTORY_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_HISTORY_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:52:22: ( ( 'HISTORY' | ( 'h' | 'H' ) ( 'i' | 'I' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'o' | 'O' ) ( 'r' | 'R' ) ( 'y' | 'Y' ) ) )
            // InternalEtlLexer.g:52:24: ( 'HISTORY' | ( 'h' | 'H' ) ( 'i' | 'I' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'o' | 'O' ) ( 'r' | 'R' ) ( 'y' | 'Y' ) )
            {
            // InternalEtlLexer.g:52:24: ( 'HISTORY' | ( 'h' | 'H' ) ( 'i' | 'I' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'o' | 'O' ) ( 'r' | 'R' ) ( 'y' | 'Y' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='H') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='I') ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3=='S') ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4=='T') ) {
                            int LA3_5 = input.LA(5);

                            if ( (LA3_5=='O') ) {
                                int LA3_6 = input.LA(6);

                                if ( (LA3_6=='R') ) {
                                    int LA3_7 = input.LA(7);

                                    if ( (LA3_7=='Y') ) {
                                        alt3=1;
                                    }
                                    else if ( (LA3_7=='y') ) {
                                        alt3=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 3, 7, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA3_6=='r') ) {
                                    alt3=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 6, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA3_5=='o') ) {
                                alt3=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA3_4=='t') ) {
                            alt3=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA3_3=='s') ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_1=='i') ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0=='h') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEtlLexer.g:52:25: 'HISTORY'
                    {
                    match("HISTORY"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:52:35: ( 'h' | 'H' ) ( 'i' | 'I' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'o' | 'O' ) ( 'r' | 'R' ) ( 'y' | 'Y' )
                    {
                    if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HISTORY_KEYWORD"

    // $ANTLR start "RULE_CASE_SIGNIFICANCE_ID_KEYWORD"
    public final void mRULE_CASE_SIGNIFICANCE_ID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_CASE_SIGNIFICANCE_ID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:54:35: ( ( 'caseSignificanceId' | ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:54:37: ( 'caseSignificanceId' | ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:54:37: ( 'caseSignificanceId' | ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalEtlLexer.g:54:38: 'caseSignificanceId'
                    {
                    match("caseSignificanceId"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:54:59: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CASE_SIGNIFICANCE_ID_KEYWORD"

    // $ANTLR start "RULE_DEFINITION_STATUS_ID_KEYWORD"
    public final void mRULE_DEFINITION_STATUS_ID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DEFINITION_STATUS_ID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:56:35: ( ( 'definitionStatusId' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' ) ) )
            // InternalEtlLexer.g:56:37: ( 'definitionStatusId' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' ) )
            {
            // InternalEtlLexer.g:56:37: ( 'definitionStatusId' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalEtlLexer.g:56:38: 'definitionStatusId'
                    {
                    match("definitionStatusId"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:56:59: ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFINITION_STATUS_ID_KEYWORD"

    // $ANTLR start "RULE_DEFINITION_STATUS_TOKEN_KEYWORD"
    public final void mRULE_DEFINITION_STATUS_TOKEN_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DEFINITION_STATUS_TOKEN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:58:38: ( ( 'definitionStatus' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ) )
            // InternalEtlLexer.g:58:40: ( 'definitionStatus' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) )
            {
            // InternalEtlLexer.g:58:40: ( 'definitionStatus' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalEtlLexer.g:58:41: 'definitionStatus'
                    {
                    match("definitionStatus"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:58:60: ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFINITION_STATUS_TOKEN_KEYWORD"

    // $ANTLR start "RULE_LANGUAGE_REFSET_ID_KEYWORD"
    public final void mRULE_LANGUAGE_REFSET_ID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_LANGUAGE_REFSET_ID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:60:33: ( ( 'languageRefsetId' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:60:35: ( 'languageRefsetId' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:60:35: ( 'languageRefsetId' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalEtlLexer.g:60:36: 'languageRefsetId'
                    {
                    match("languageRefsetId"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:60:55: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LANGUAGE_REFSET_ID_KEYWORD"

    // $ANTLR start "RULE_EFFECTIVE_TIME_KEYWORD"
    public final void mRULE_EFFECTIVE_TIME_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_EFFECTIVE_TIME_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:62:29: ( ( 'effectiveTime' | ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ) )
            // InternalEtlLexer.g:62:31: ( 'effectiveTime' | ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            {
            // InternalEtlLexer.g:62:31: ( 'effectiveTime' | ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalEtlLexer.g:62:32: 'effectiveTime'
                    {
                    match("effectiveTime"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:62:48: ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' )
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EFFECTIVE_TIME_KEYWORD"

    // $ANTLR start "RULE_ACCEPTABLE_IN_KEYWORD"
    public final void mRULE_ACCEPTABLE_IN_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_ACCEPTABLE_IN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:64:28: ( ( 'acceptableIn' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ) )
            // InternalEtlLexer.g:64:30: ( 'acceptableIn' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            {
            // InternalEtlLexer.g:64:30: ( 'acceptableIn' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalEtlLexer.g:64:31: 'acceptableIn'
                    {
                    match("acceptableIn"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:64:46: ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' )
                    {
                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACCEPTABLE_IN_KEYWORD"

    // $ANTLR start "RULE_PREFERRED_IN_KEYWORD"
    public final void mRULE_PREFERRED_IN_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_PREFERRED_IN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:66:27: ( ( 'preferredIn' | ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ) )
            // InternalEtlLexer.g:66:29: ( 'preferredIn' | ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            {
            // InternalEtlLexer.g:66:29: ( 'preferredIn' | ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalEtlLexer.g:66:30: 'preferredIn'
                    {
                    match("preferredIn"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:66:44: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' )
                    {
                    if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PREFERRED_IN_KEYWORD"

    // $ANTLR start "RULE_SEMANTIC_TAG_KEYWORD"
    public final void mRULE_SEMANTIC_TAG_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_SEMANTIC_TAG_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:68:27: ( ( 'semanticTag' | ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ) )
            // InternalEtlLexer.g:68:29: ( 'semanticTag' | ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' ) )
            {
            // InternalEtlLexer.g:68:29: ( 'semanticTag' | ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalEtlLexer.g:68:30: 'semanticTag'
                    {
                    match("semanticTag"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:68:44: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' )
                    {
                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMANTIC_TAG_KEYWORD"

    // $ANTLR start "RULE_DIALECTID_KEYWORD"
    public final void mRULE_DIALECTID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DIALECTID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:70:24: ( ( 'dialectId' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:70:26: ( 'dialectId' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:70:26: ( 'dialectId' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalEtlLexer.g:70:27: 'dialectId'
                    {
                    match("dialectId"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:70:39: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIALECTID_KEYWORD"

    // $ANTLR start "RULE_LANGUAGE_KEYWORD"
    public final void mRULE_LANGUAGE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_LANGUAGE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:72:23: ( ( 'language' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ) )
            // InternalEtlLexer.g:72:25: ( 'language' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            {
            // InternalEtlLexer.g:72:25: ( 'language' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalEtlLexer.g:72:26: 'language'
                    {
                    match("language"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:72:37: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' )
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LANGUAGE_KEYWORD"

    // $ANTLR start "RULE_MODULEID_KEYWORD"
    public final void mRULE_MODULEID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_MODULEID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:74:23: ( ( 'moduleId' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:74:25: ( 'moduleId' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:74:25: ( 'moduleId' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalEtlLexer.g:74:26: 'moduleId'
                    {
                    match("moduleId"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:74:37: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MODULEID_KEYWORD"

    // $ANTLR start "RULE_DIALECT_KEYWORD"
    public final void mRULE_DIALECT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DIALECT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:76:22: ( ( 'dialect' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ) )
            // InternalEtlLexer.g:76:24: ( 'dialect' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            {
            // InternalEtlLexer.g:76:24: ( 'dialect' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='d') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='i') ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3=='a') ) {
                        int LA15_4 = input.LA(4);

                        if ( (LA15_4=='l') ) {
                            int LA15_5 = input.LA(5);

                            if ( (LA15_5=='e') ) {
                                int LA15_6 = input.LA(6);

                                if ( (LA15_6=='c') ) {
                                    int LA15_7 = input.LA(7);

                                    if ( (LA15_7=='t') ) {
                                        alt15=1;
                                    }
                                    else if ( (LA15_7=='T') ) {
                                        alt15=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 15, 7, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA15_6=='C') ) {
                                    alt15=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 15, 6, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA15_5=='E') ) {
                                alt15=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA15_4=='L') ) {
                            alt15=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA15_3=='A') ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA15_1=='I') ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0=='D') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalEtlLexer.g:76:25: 'dialect'
                    {
                    match("dialect"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:76:35: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIALECT_KEYWORD"

    // $ANTLR start "RULE_ACTIVE_KEYWORD"
    public final void mRULE_ACTIVE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_ACTIVE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:78:21: ( ( 'active' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ) )
            // InternalEtlLexer.g:78:23: ( 'active' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            {
            // InternalEtlLexer.g:78:23: ( 'active' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='a') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='c') ) {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3=='t') ) {
                        int LA16_4 = input.LA(4);

                        if ( (LA16_4=='i') ) {
                            int LA16_5 = input.LA(5);

                            if ( (LA16_5=='v') ) {
                                int LA16_6 = input.LA(6);

                                if ( (LA16_6=='e') ) {
                                    alt16=1;
                                }
                                else if ( (LA16_6=='E') ) {
                                    alt16=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 16, 6, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA16_5=='V') ) {
                                alt16=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA16_4=='I') ) {
                            alt16=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA16_3=='T') ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA16_1=='C') ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA16_0=='A') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalEtlLexer.g:78:24: 'active'
                    {
                    match("active"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:78:33: ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' )
                    {
                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACTIVE_KEYWORD"

    // $ANTLR start "RULE_TYPEID_KEYWORD"
    public final void mRULE_TYPEID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_TYPEID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:80:21: ( ( 'typeId' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:80:23: ( 'typeId' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:80:23: ( 'typeId' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='t') ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='y') ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3=='p') ) {
                        int LA17_4 = input.LA(4);

                        if ( (LA17_4=='e') ) {
                            int LA17_5 = input.LA(5);

                            if ( (LA17_5=='I') ) {
                                int LA17_6 = input.LA(6);

                                if ( (LA17_6=='d') ) {
                                    alt17=1;
                                }
                                else if ( (LA17_6=='D') ) {
                                    alt17=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 17, 6, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA17_5=='i') ) {
                                alt17=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA17_4=='E') ) {
                            alt17=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA17_3=='P') ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA17_1=='Y') ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0=='T') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalEtlLexer.g:80:24: 'typeId'
                    {
                    match("typeId"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:80:33: ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPEID_KEYWORD"

    // $ANTLR start "RULE_EXCLUSION_KEYWORD"
    public final void mRULE_EXCLUSION_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_EXCLUSION_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:82:24: ( ( 'MINUS' | ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' ) ) )
            // InternalEtlLexer.g:82:26: ( 'MINUS' | ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' ) )
            {
            // InternalEtlLexer.g:82:26: ( 'MINUS' | ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='M') ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='I') ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3=='N') ) {
                        int LA18_4 = input.LA(4);

                        if ( (LA18_4=='U') ) {
                            int LA18_5 = input.LA(5);

                            if ( (LA18_5=='S') ) {
                                alt18=1;
                            }
                            else if ( (LA18_5=='s') ) {
                                alt18=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA18_4=='u') ) {
                            alt18=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA18_3=='n') ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA18_1=='i') ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0=='m') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalEtlLexer.g:82:27: 'MINUS'
                    {
                    match("MINUS"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:82:35: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' )
                    {
                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXCLUSION_KEYWORD"

    // $ANTLR start "RULE_EXACT_KEYWORD"
    public final void mRULE_EXACT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_EXACT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:84:20: ( ( 'exact' | ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ) )
            // InternalEtlLexer.g:84:22: ( 'exact' | ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            {
            // InternalEtlLexer.g:84:22: ( 'exact' | ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='e') ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='x') ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3=='a') ) {
                        int LA19_4 = input.LA(4);

                        if ( (LA19_4=='c') ) {
                            int LA19_5 = input.LA(5);

                            if ( (LA19_5=='t') ) {
                                alt19=1;
                            }
                            else if ( (LA19_5=='T') ) {
                                alt19=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 19, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA19_4=='C') ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA19_3=='A') ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA19_1=='X') ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0=='E') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalEtlLexer.g:84:23: 'exact'
                    {
                    match("exact"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:84:31: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' )
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXACT_KEYWORD"

    // $ANTLR start "RULE_FALSE_KEYWORD"
    public final void mRULE_FALSE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_FALSE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:86:20: ( ( 'false' | ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) ) )
            // InternalEtlLexer.g:86:22: ( 'false' | ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            {
            // InternalEtlLexer.g:86:22: ( 'false' | ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='f') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='a') ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3=='l') ) {
                        int LA20_4 = input.LA(4);

                        if ( (LA20_4=='s') ) {
                            int LA20_5 = input.LA(5);

                            if ( (LA20_5=='e') ) {
                                alt20=1;
                            }
                            else if ( (LA20_5=='E') ) {
                                alt20=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA20_4=='S') ) {
                            alt20=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA20_3=='L') ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA20_1=='A') ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA20_0=='F') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalEtlLexer.g:86:23: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:86:31: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
                    {
                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALSE_KEYWORD"

    // $ANTLR start "RULE_MATCH_KEYWORD"
    public final void mRULE_MATCH_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_MATCH_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:88:20: ( ( 'match' | ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ) )
            // InternalEtlLexer.g:88:22: ( 'match' | ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            {
            // InternalEtlLexer.g:88:22: ( 'match' | ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='m') ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1=='a') ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3=='t') ) {
                        int LA21_4 = input.LA(4);

                        if ( (LA21_4=='c') ) {
                            int LA21_5 = input.LA(5);

                            if ( (LA21_5=='h') ) {
                                alt21=1;
                            }
                            else if ( (LA21_5=='H') ) {
                                alt21=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 21, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA21_4=='C') ) {
                            alt21=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA21_3=='T') ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA21_1=='A') ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0=='M') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalEtlLexer.g:88:23: 'match'
                    {
                    match("match"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:88:31: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )
                    {
                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MATCH_KEYWORD"

    // $ANTLR start "RULE_REGEX_KEYWORD"
    public final void mRULE_REGEX_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_REGEX_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:90:20: ( ( 'regex' | ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ) )
            // InternalEtlLexer.g:90:22: ( 'regex' | ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' ) )
            {
            // InternalEtlLexer.g:90:22: ( 'regex' | ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='r') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='e') ) {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3=='g') ) {
                        int LA22_4 = input.LA(4);

                        if ( (LA22_4=='e') ) {
                            int LA22_5 = input.LA(5);

                            if ( (LA22_5=='x') ) {
                                alt22=1;
                            }
                            else if ( (LA22_5=='X') ) {
                                alt22=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA22_4=='E') ) {
                            alt22=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA22_3=='G') ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA22_1=='E') ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA22_0=='R') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalEtlLexer.g:90:23: 'regex'
                    {
                    match("regex"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:90:31: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' )
                    {
                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REGEX_KEYWORD"

    // $ANTLR start "RULE_TERM_KEYWORD"
    public final void mRULE_TERM_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_TERM_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:92:19: ( ( 'term' | ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ) )
            // InternalEtlLexer.g:92:21: ( 'term' | ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) )
            {
            // InternalEtlLexer.g:92:21: ( 'term' | ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='t') ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1=='e') ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3=='r') ) {
                        int LA23_4 = input.LA(4);

                        if ( (LA23_4=='m') ) {
                            alt23=1;
                        }
                        else if ( (LA23_4=='M') ) {
                            alt23=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA23_3=='R') ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA23_1=='E') ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0=='T') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalEtlLexer.g:92:22: 'term'
                    {
                    match("term"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:92:29: ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' )
                    {
                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERM_KEYWORD"

    // $ANTLR start "RULE_TRUE_KEYWORD"
    public final void mRULE_TRUE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_TRUE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:94:19: ( ( 'true' | ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ) )
            // InternalEtlLexer.g:94:21: ( 'true' | ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            {
            // InternalEtlLexer.g:94:21: ( 'true' | ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='t') ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1=='r') ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3=='u') ) {
                        int LA24_4 = input.LA(4);

                        if ( (LA24_4=='e') ) {
                            alt24=1;
                        }
                        else if ( (LA24_4=='E') ) {
                            alt24=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA24_3=='U') ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA24_1=='R') ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0=='T') ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalEtlLexer.g:94:22: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:94:29: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
                    {
                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRUE_KEYWORD"

    // $ANTLR start "RULE_TYPE_KEYWORD"
    public final void mRULE_TYPE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_TYPE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:96:19: ( ( 'type' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ) )
            // InternalEtlLexer.g:96:21: ( 'type' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            {
            // InternalEtlLexer.g:96:21: ( 'type' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='t') ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1=='y') ) {
                    int LA25_3 = input.LA(3);

                    if ( (LA25_3=='p') ) {
                        int LA25_4 = input.LA(4);

                        if ( (LA25_4=='e') ) {
                            alt25=1;
                        }
                        else if ( (LA25_4=='E') ) {
                            alt25=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA25_3=='P') ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA25_1=='Y') ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA25_0=='T') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalEtlLexer.g:96:22: 'type'
                    {
                    match("type"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:96:29: ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
                    {
                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE_KEYWORD"

    // $ANTLR start "RULE_WILD_KEYWORD"
    public final void mRULE_WILD_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_WILD_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:98:19: ( ( 'wild' | ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:98:21: ( 'wild' | ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:98:21: ( 'wild' | ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='w') ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1=='i') ) {
                    int LA26_3 = input.LA(3);

                    if ( (LA26_3=='l') ) {
                        int LA26_4 = input.LA(4);

                        if ( (LA26_4=='d') ) {
                            alt26=1;
                        }
                        else if ( (LA26_4=='D') ) {
                            alt26=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA26_3=='L') ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA26_1=='I') ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA26_0=='W') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalEtlLexer.g:98:22: 'wild'
                    {
                    match("wild"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:98:29: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WILD_KEYWORD"

    // $ANTLR start "RULE_MIN_KEYWORD"
    public final void mRULE_MIN_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_MIN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:100:18: ( ( 'MIN' | ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ) )
            // InternalEtlLexer.g:100:20: ( 'MIN' | ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            {
            // InternalEtlLexer.g:100:20: ( 'MIN' | ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='M') ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1=='I') ) {
                    int LA27_3 = input.LA(3);

                    if ( (LA27_3=='N') ) {
                        alt27=1;
                    }
                    else if ( (LA27_3=='n') ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_1=='i') ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0=='m') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalEtlLexer.g:100:21: 'MIN'
                    {
                    match("MIN"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:100:27: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' )
                    {
                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MIN_KEYWORD"

    // $ANTLR start "RULE_MOD_KEYWORD"
    public final void mRULE_MOD_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_MOD_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:102:18: ( ( 'MOD' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:102:20: ( 'MOD' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:102:20: ( 'MOD' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='M') ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1=='O') ) {
                    int LA28_3 = input.LA(3);

                    if ( (LA28_3=='D') ) {
                        alt28=1;
                    }
                    else if ( (LA28_3=='d') ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA28_1=='o') ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA28_0=='m') ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalEtlLexer.g:102:21: 'MOD'
                    {
                    match("MOD"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:102:27: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MOD_KEYWORD"

    // $ANTLR start "RULE_MAX_KEYWORD"
    public final void mRULE_MAX_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_MAX_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:104:18: ( ( 'MAX' | ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' ) ) )
            // InternalEtlLexer.g:104:20: ( 'MAX' | ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' ) )
            {
            // InternalEtlLexer.g:104:20: ( 'MAX' | ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='M') ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1=='A') ) {
                    int LA29_3 = input.LA(3);

                    if ( (LA29_3=='X') ) {
                        alt29=1;
                    }
                    else if ( (LA29_3=='x') ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA29_1=='a') ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA29_0=='m') ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalEtlLexer.g:104:21: 'MAX'
                    {
                    match("MAX"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:104:27: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' )
                    {
                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAX_KEYWORD"

    // $ANTLR start "RULE_CONJUNCTION_KEYWORD"
    public final void mRULE_CONJUNCTION_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_CONJUNCTION_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:106:26: ( ( 'AND' | ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:106:28: ( 'AND' | ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:106:28: ( 'AND' | ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='A') ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1=='N') ) {
                    int LA30_3 = input.LA(3);

                    if ( (LA30_3=='D') ) {
                        alt30=1;
                    }
                    else if ( (LA30_3=='d') ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA30_1=='n') ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA30_0=='a') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalEtlLexer.g:106:29: 'AND'
                    {
                    match("AND"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:106:35: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONJUNCTION_KEYWORD"

    // $ANTLR start "RULE_DISJUNCTION_KEYWORD"
    public final void mRULE_DISJUNCTION_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DISJUNCTION_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:108:26: ( ( 'OR' | ( 'O' | 'o' ) ( 'R' | 'r' ) ) )
            // InternalEtlLexer.g:108:28: ( 'OR' | ( 'O' | 'o' ) ( 'R' | 'r' ) )
            {
            // InternalEtlLexer.g:108:28: ( 'OR' | ( 'O' | 'o' ) ( 'R' | 'r' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='O') ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1=='R') ) {
                    alt31=1;
                }
                else if ( (LA31_1=='r') ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA31_0=='o') ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalEtlLexer.g:108:29: 'OR'
                    {
                    match("OR"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:108:34: ( 'O' | 'o' ) ( 'R' | 'r' )
                    {
                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DISJUNCTION_KEYWORD"

    // $ANTLR start "RULE_REVERSED"
    public final void mRULE_REVERSED() throws RecognitionException {
        try {
            int _type = RULE_REVERSED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:110:15: ( 'R' )
            // InternalEtlLexer.g:110:17: 'R'
            {
            match('R'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REVERSED"

    // $ANTLR start "RULE_MEMBER_SHORT_KEYWORD"
    public final void mRULE_MEMBER_SHORT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_MEMBER_SHORT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:112:27: ( ( 'M' | 'm' ) )
            // InternalEtlLexer.g:112:29: ( 'M' | 'm' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MEMBER_SHORT_KEYWORD"

    // $ANTLR start "RULE_DESCRIPTION_SHORT_KEYWORD"
    public final void mRULE_DESCRIPTION_SHORT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DESCRIPTION_SHORT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:114:32: ( ( 'D' | 'd' ) )
            // InternalEtlLexer.g:114:34: ( 'D' | 'd' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DESCRIPTION_SHORT_KEYWORD"

    // $ANTLR start "RULE_CONCEPT_SHORT_KEYWORD"
    public final void mRULE_CONCEPT_SHORT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_CONCEPT_SHORT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:116:28: ( ( 'C' | 'c' ) )
            // InternalEtlLexer.g:116:30: ( 'C' | 'c' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONCEPT_SHORT_KEYWORD"

    // $ANTLR start "RULE_ALPHA"
    public final void mRULE_ALPHA() throws RecognitionException {
        try {
            int _type = RULE_ALPHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:118:12: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalEtlLexer.g:118:14: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHA"

    // $ANTLR start "RULE_KEYWORD"
    public final void mRULE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:120:14: ( RULE_ALPHA ( RULE_ALPHA )+ )
            // InternalEtlLexer.g:120:16: RULE_ALPHA ( RULE_ALPHA )+
            {
            mRULE_ALPHA(); 
            // InternalEtlLexer.g:120:27: ( RULE_ALPHA )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='A' && LA32_0<='Z')||(LA32_0>='a' && LA32_0<='z')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalEtlLexer.g:120:27: RULE_ALPHA
            	    {
            	    mRULE_ALPHA(); 

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEYWORD"

    // $ANTLR start "RULE_DBL_LT_EM"
    public final void mRULE_DBL_LT_EM() throws RecognitionException {
        try {
            int _type = RULE_DBL_LT_EM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:122:16: ( '<<!' )
            // InternalEtlLexer.g:122:18: '<<!'
            {
            match("<<!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DBL_LT_EM"

    // $ANTLR start "RULE_DBL_GT_EM"
    public final void mRULE_DBL_GT_EM() throws RecognitionException {
        try {
            int _type = RULE_DBL_GT_EM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:124:16: ( '>>!' )
            // InternalEtlLexer.g:124:18: '>>!'
            {
            match(">>!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DBL_GT_EM"

    // $ANTLR start "RULE_DBL_LT"
    public final void mRULE_DBL_LT() throws RecognitionException {
        try {
            int _type = RULE_DBL_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:126:13: ( '<<' )
            // InternalEtlLexer.g:126:15: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DBL_LT"

    // $ANTLR start "RULE_DBL_GT"
    public final void mRULE_DBL_GT() throws RecognitionException {
        try {
            int _type = RULE_DBL_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:128:13: ( '>>' )
            // InternalEtlLexer.g:128:15: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DBL_GT"

    // $ANTLR start "RULE_LT_EM"
    public final void mRULE_LT_EM() throws RecognitionException {
        try {
            int _type = RULE_LT_EM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:130:12: ( '<!' )
            // InternalEtlLexer.g:130:14: '<!'
            {
            match("<!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT_EM"

    // $ANTLR start "RULE_GT_EM"
    public final void mRULE_GT_EM() throws RecognitionException {
        try {
            int _type = RULE_GT_EM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:132:12: ( '>!' )
            // InternalEtlLexer.g:132:14: '>!'
            {
            match(">!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GT_EM"

    // $ANTLR start "RULE_GTE"
    public final void mRULE_GTE() throws RecognitionException {
        try {
            int _type = RULE_GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:134:10: ( '>=' )
            // InternalEtlLexer.g:134:12: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GTE"

    // $ANTLR start "RULE_LTE"
    public final void mRULE_LTE() throws RecognitionException {
        try {
            int _type = RULE_LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:136:10: ( '<=' )
            // InternalEtlLexer.g:136:12: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LTE"

    // $ANTLR start "RULE_DOUBLE_CURLY_OPEN"
    public final void mRULE_DOUBLE_CURLY_OPEN() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_CURLY_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:138:24: ( '{{' )
            // InternalEtlLexer.g:138:26: '{{'
            {
            match("{{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_CURLY_OPEN"

    // $ANTLR start "RULE_DOUBLE_CURLY_CLOSE"
    public final void mRULE_DOUBLE_CURLY_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_CURLY_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:140:25: ( '}}' )
            // InternalEtlLexer.g:140:27: '}}'
            {
            match("}}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_CURLY_CLOSE"

    // $ANTLR start "RULE_PIPE_DELIMITED_STRING"
    public final void mRULE_PIPE_DELIMITED_STRING() throws RecognitionException {
        try {
            int _type = RULE_PIPE_DELIMITED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:142:28: ( '|' ( options {greedy=false; } : . )* '|' )
            // InternalEtlLexer.g:142:30: '|' ( options {greedy=false; } : . )* '|'
            {
            match('|'); 
            // InternalEtlLexer.g:142:34: ( options {greedy=false; } : . )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0=='|') ) {
                    alt33=2;
                }
                else if ( ((LA33_0>='\u0000' && LA33_0<='{')||(LA33_0>='}' && LA33_0<='\uFFFF')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalEtlLexer.g:142:62: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PIPE_DELIMITED_STRING"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:144:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEtlLexer.g:144:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEtlLexer.g:144:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='\"') ) {
                alt36=1;
            }
            else if ( (LA36_0=='\'') ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalEtlLexer.g:144:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEtlLexer.g:144:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop34:
                    do {
                        int alt34=3;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0=='\\') ) {
                            alt34=1;
                        }
                        else if ( ((LA34_0>='\u0000' && LA34_0<='!')||(LA34_0>='#' && LA34_0<='[')||(LA34_0>=']' && LA34_0<='\uFFFF')) ) {
                            alt34=2;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalEtlLexer.g:144:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEtlLexer.g:144:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:144:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEtlLexer.g:144:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop35:
                    do {
                        int alt35=3;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0=='\\') ) {
                            alt35=1;
                        }
                        else if ( ((LA35_0>='\u0000' && LA35_0<='&')||(LA35_0>='(' && LA35_0<='[')||(LA35_0>=']' && LA35_0<='\uFFFF')) ) {
                            alt35=2;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalEtlLexer.g:144:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEtlLexer.g:144:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_TO"
    public final void mRULE_TO() throws RecognitionException {
        try {
            int _type = RULE_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:146:9: ( '..' )
            // InternalEtlLexer.g:146:11: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TO"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:148:12: ( ',' )
            // InternalEtlLexer.g:148:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:150:12: ( '0' .. '9' )
            // InternalEtlLexer.g:150:14: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:152:12: ( ':' )
            // InternalEtlLexer.g:152:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_CURLY_OPEN"
    public final void mRULE_CURLY_OPEN() throws RecognitionException {
        try {
            int _type = RULE_CURLY_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:154:17: ( '{' )
            // InternalEtlLexer.g:154:19: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CURLY_OPEN"

    // $ANTLR start "RULE_CURLY_CLOSE"
    public final void mRULE_CURLY_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_CURLY_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:156:18: ( '}' )
            // InternalEtlLexer.g:156:20: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CURLY_CLOSE"

    // $ANTLR start "RULE_ROUND_OPEN"
    public final void mRULE_ROUND_OPEN() throws RecognitionException {
        try {
            int _type = RULE_ROUND_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:158:17: ( '(' )
            // InternalEtlLexer.g:158:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROUND_OPEN"

    // $ANTLR start "RULE_ROUND_CLOSE"
    public final void mRULE_ROUND_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_ROUND_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:160:18: ( ')' )
            // InternalEtlLexer.g:160:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROUND_CLOSE"

    // $ANTLR start "RULE_SQUARE_OPEN"
    public final void mRULE_SQUARE_OPEN() throws RecognitionException {
        try {
            int _type = RULE_SQUARE_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:162:18: ( '[' )
            // InternalEtlLexer.g:162:20: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SQUARE_OPEN"

    // $ANTLR start "RULE_SQUARE_CLOSE"
    public final void mRULE_SQUARE_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_SQUARE_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:164:19: ( ']' )
            // InternalEtlLexer.g:164:21: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SQUARE_CLOSE"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:166:11: ( '+' )
            // InternalEtlLexer.g:166:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_DASH"
    public final void mRULE_DASH() throws RecognitionException {
        try {
            int _type = RULE_DASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:168:11: ( '-' )
            // InternalEtlLexer.g:168:13: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DASH"

    // $ANTLR start "RULE_UNDERSCORE"
    public final void mRULE_UNDERSCORE() throws RecognitionException {
        try {
            int _type = RULE_UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:170:17: ( '_' )
            // InternalEtlLexer.g:170:19: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNDERSCORE"

    // $ANTLR start "RULE_CARET"
    public final void mRULE_CARET() throws RecognitionException {
        try {
            int _type = RULE_CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:172:12: ( '^' )
            // InternalEtlLexer.g:172:14: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CARET"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:174:10: ( '.' )
            // InternalEtlLexer.g:174:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_WILDCARD"
    public final void mRULE_WILDCARD() throws RecognitionException {
        try {
            int _type = RULE_WILDCARD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:176:15: ( '*' )
            // InternalEtlLexer.g:176:17: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WILDCARD"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:178:12: ( '=' )
            // InternalEtlLexer.g:178:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_NOT_EQUAL"
    public final void mRULE_NOT_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:180:16: ( '!=' )
            // InternalEtlLexer.g:180:18: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT_EQUAL"

    // $ANTLR start "RULE_LT"
    public final void mRULE_LT() throws RecognitionException {
        try {
            int _type = RULE_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:182:9: ( '<' )
            // InternalEtlLexer.g:182:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT"

    // $ANTLR start "RULE_GT"
    public final void mRULE_GT() throws RecognitionException {
        try {
            int _type = RULE_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:184:9: ( '>' )
            // InternalEtlLexer.g:184:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GT"

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:186:11: ( '#' )
            // InternalEtlLexer.g:186:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:188:9: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // InternalEtlLexer.g:188:11: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:190:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEtlLexer.g:190:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEtlLexer.g:190:24: ( options {greedy=false; } : . )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0=='*') ) {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1=='/') ) {
                        alt37=2;
                    }
                    else if ( ((LA37_1>='\u0000' && LA37_1<='.')||(LA37_1>='0' && LA37_1<='\uFFFF')) ) {
                        alt37=1;
                    }


                }
                else if ( ((LA37_0>='\u0000' && LA37_0<=')')||(LA37_0>='+' && LA37_0<='\uFFFF')) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalEtlLexer.g:190:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:192:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEtlLexer.g:192:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEtlLexer.g:192:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>='\u0000' && LA38_0<='\t')||(LA38_0>='\u000B' && LA38_0<='\f')||(LA38_0>='\u000E' && LA38_0<='\uFFFF')) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalEtlLexer.g:192:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // InternalEtlLexer.g:192:40: ( ( '\\r' )? '\\n' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='\n'||LA40_0=='\r') ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalEtlLexer.g:192:41: ( '\\r' )? '\\n'
                    {
                    // InternalEtlLexer.g:192:41: ( '\\r' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0=='\r') ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalEtlLexer.g:192:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    public void mTokens() throws RecognitionException {
        // InternalEtlLexer.g:1:8: ( RULE_DOUBLE_SQUARE_OPEN | RULE_DOUBLE_SQUARE_CLOSE | RULE_TILDE | RULE_ID | RULE_SCG | RULE_TOK | RULE_STR | RULE_INT | RULE_DEC | RULE_EQUIVALENT_TO | RULE_SUBTYPE_OF | RULE_SLOTNAME_STRING | RULE_HISTORY_KEYWORD | RULE_CASE_SIGNIFICANCE_ID_KEYWORD | RULE_DEFINITION_STATUS_ID_KEYWORD | RULE_DEFINITION_STATUS_TOKEN_KEYWORD | RULE_LANGUAGE_REFSET_ID_KEYWORD | RULE_EFFECTIVE_TIME_KEYWORD | RULE_ACCEPTABLE_IN_KEYWORD | RULE_PREFERRED_IN_KEYWORD | RULE_SEMANTIC_TAG_KEYWORD | RULE_DIALECTID_KEYWORD | RULE_LANGUAGE_KEYWORD | RULE_MODULEID_KEYWORD | RULE_DIALECT_KEYWORD | RULE_ACTIVE_KEYWORD | RULE_TYPEID_KEYWORD | RULE_EXCLUSION_KEYWORD | RULE_EXACT_KEYWORD | RULE_FALSE_KEYWORD | RULE_MATCH_KEYWORD | RULE_REGEX_KEYWORD | RULE_TERM_KEYWORD | RULE_TRUE_KEYWORD | RULE_TYPE_KEYWORD | RULE_WILD_KEYWORD | RULE_MIN_KEYWORD | RULE_MOD_KEYWORD | RULE_MAX_KEYWORD | RULE_CONJUNCTION_KEYWORD | RULE_DISJUNCTION_KEYWORD | RULE_REVERSED | RULE_MEMBER_SHORT_KEYWORD | RULE_DESCRIPTION_SHORT_KEYWORD | RULE_CONCEPT_SHORT_KEYWORD | RULE_ALPHA | RULE_KEYWORD | RULE_DBL_LT_EM | RULE_DBL_GT_EM | RULE_DBL_LT | RULE_DBL_GT | RULE_LT_EM | RULE_GT_EM | RULE_GTE | RULE_LTE | RULE_DOUBLE_CURLY_OPEN | RULE_DOUBLE_CURLY_CLOSE | RULE_PIPE_DELIMITED_STRING | RULE_STRING | RULE_TO | RULE_COMMA | RULE_DIGIT | RULE_COLON | RULE_CURLY_OPEN | RULE_CURLY_CLOSE | RULE_ROUND_OPEN | RULE_ROUND_CLOSE | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE | RULE_PLUS | RULE_DASH | RULE_UNDERSCORE | RULE_CARET | RULE_DOT | RULE_WILDCARD | RULE_EQUAL | RULE_NOT_EQUAL | RULE_LT | RULE_GT | RULE_HASH | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt41=83;
        alt41 = dfa41.predict(input);
        switch (alt41) {
            case 1 :
                // InternalEtlLexer.g:1:10: RULE_DOUBLE_SQUARE_OPEN
                {
                mRULE_DOUBLE_SQUARE_OPEN(); 

                }
                break;
            case 2 :
                // InternalEtlLexer.g:1:34: RULE_DOUBLE_SQUARE_CLOSE
                {
                mRULE_DOUBLE_SQUARE_CLOSE(); 

                }
                break;
            case 3 :
                // InternalEtlLexer.g:1:59: RULE_TILDE
                {
                mRULE_TILDE(); 

                }
                break;
            case 4 :
                // InternalEtlLexer.g:1:70: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 5 :
                // InternalEtlLexer.g:1:78: RULE_SCG
                {
                mRULE_SCG(); 

                }
                break;
            case 6 :
                // InternalEtlLexer.g:1:87: RULE_TOK
                {
                mRULE_TOK(); 

                }
                break;
            case 7 :
                // InternalEtlLexer.g:1:96: RULE_STR
                {
                mRULE_STR(); 

                }
                break;
            case 8 :
                // InternalEtlLexer.g:1:105: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // InternalEtlLexer.g:1:114: RULE_DEC
                {
                mRULE_DEC(); 

                }
                break;
            case 10 :
                // InternalEtlLexer.g:1:123: RULE_EQUIVALENT_TO
                {
                mRULE_EQUIVALENT_TO(); 

                }
                break;
            case 11 :
                // InternalEtlLexer.g:1:142: RULE_SUBTYPE_OF
                {
                mRULE_SUBTYPE_OF(); 

                }
                break;
            case 12 :
                // InternalEtlLexer.g:1:158: RULE_SLOTNAME_STRING
                {
                mRULE_SLOTNAME_STRING(); 

                }
                break;
            case 13 :
                // InternalEtlLexer.g:1:179: RULE_HISTORY_KEYWORD
                {
                mRULE_HISTORY_KEYWORD(); 

                }
                break;
            case 14 :
                // InternalEtlLexer.g:1:200: RULE_CASE_SIGNIFICANCE_ID_KEYWORD
                {
                mRULE_CASE_SIGNIFICANCE_ID_KEYWORD(); 

                }
                break;
            case 15 :
                // InternalEtlLexer.g:1:234: RULE_DEFINITION_STATUS_ID_KEYWORD
                {
                mRULE_DEFINITION_STATUS_ID_KEYWORD(); 

                }
                break;
            case 16 :
                // InternalEtlLexer.g:1:268: RULE_DEFINITION_STATUS_TOKEN_KEYWORD
                {
                mRULE_DEFINITION_STATUS_TOKEN_KEYWORD(); 

                }
                break;
            case 17 :
                // InternalEtlLexer.g:1:305: RULE_LANGUAGE_REFSET_ID_KEYWORD
                {
                mRULE_LANGUAGE_REFSET_ID_KEYWORD(); 

                }
                break;
            case 18 :
                // InternalEtlLexer.g:1:337: RULE_EFFECTIVE_TIME_KEYWORD
                {
                mRULE_EFFECTIVE_TIME_KEYWORD(); 

                }
                break;
            case 19 :
                // InternalEtlLexer.g:1:365: RULE_ACCEPTABLE_IN_KEYWORD
                {
                mRULE_ACCEPTABLE_IN_KEYWORD(); 

                }
                break;
            case 20 :
                // InternalEtlLexer.g:1:392: RULE_PREFERRED_IN_KEYWORD
                {
                mRULE_PREFERRED_IN_KEYWORD(); 

                }
                break;
            case 21 :
                // InternalEtlLexer.g:1:418: RULE_SEMANTIC_TAG_KEYWORD
                {
                mRULE_SEMANTIC_TAG_KEYWORD(); 

                }
                break;
            case 22 :
                // InternalEtlLexer.g:1:444: RULE_DIALECTID_KEYWORD
                {
                mRULE_DIALECTID_KEYWORD(); 

                }
                break;
            case 23 :
                // InternalEtlLexer.g:1:467: RULE_LANGUAGE_KEYWORD
                {
                mRULE_LANGUAGE_KEYWORD(); 

                }
                break;
            case 24 :
                // InternalEtlLexer.g:1:489: RULE_MODULEID_KEYWORD
                {
                mRULE_MODULEID_KEYWORD(); 

                }
                break;
            case 25 :
                // InternalEtlLexer.g:1:511: RULE_DIALECT_KEYWORD
                {
                mRULE_DIALECT_KEYWORD(); 

                }
                break;
            case 26 :
                // InternalEtlLexer.g:1:532: RULE_ACTIVE_KEYWORD
                {
                mRULE_ACTIVE_KEYWORD(); 

                }
                break;
            case 27 :
                // InternalEtlLexer.g:1:552: RULE_TYPEID_KEYWORD
                {
                mRULE_TYPEID_KEYWORD(); 

                }
                break;
            case 28 :
                // InternalEtlLexer.g:1:572: RULE_EXCLUSION_KEYWORD
                {
                mRULE_EXCLUSION_KEYWORD(); 

                }
                break;
            case 29 :
                // InternalEtlLexer.g:1:595: RULE_EXACT_KEYWORD
                {
                mRULE_EXACT_KEYWORD(); 

                }
                break;
            case 30 :
                // InternalEtlLexer.g:1:614: RULE_FALSE_KEYWORD
                {
                mRULE_FALSE_KEYWORD(); 

                }
                break;
            case 31 :
                // InternalEtlLexer.g:1:633: RULE_MATCH_KEYWORD
                {
                mRULE_MATCH_KEYWORD(); 

                }
                break;
            case 32 :
                // InternalEtlLexer.g:1:652: RULE_REGEX_KEYWORD
                {
                mRULE_REGEX_KEYWORD(); 

                }
                break;
            case 33 :
                // InternalEtlLexer.g:1:671: RULE_TERM_KEYWORD
                {
                mRULE_TERM_KEYWORD(); 

                }
                break;
            case 34 :
                // InternalEtlLexer.g:1:689: RULE_TRUE_KEYWORD
                {
                mRULE_TRUE_KEYWORD(); 

                }
                break;
            case 35 :
                // InternalEtlLexer.g:1:707: RULE_TYPE_KEYWORD
                {
                mRULE_TYPE_KEYWORD(); 

                }
                break;
            case 36 :
                // InternalEtlLexer.g:1:725: RULE_WILD_KEYWORD
                {
                mRULE_WILD_KEYWORD(); 

                }
                break;
            case 37 :
                // InternalEtlLexer.g:1:743: RULE_MIN_KEYWORD
                {
                mRULE_MIN_KEYWORD(); 

                }
                break;
            case 38 :
                // InternalEtlLexer.g:1:760: RULE_MOD_KEYWORD
                {
                mRULE_MOD_KEYWORD(); 

                }
                break;
            case 39 :
                // InternalEtlLexer.g:1:777: RULE_MAX_KEYWORD
                {
                mRULE_MAX_KEYWORD(); 

                }
                break;
            case 40 :
                // InternalEtlLexer.g:1:794: RULE_CONJUNCTION_KEYWORD
                {
                mRULE_CONJUNCTION_KEYWORD(); 

                }
                break;
            case 41 :
                // InternalEtlLexer.g:1:819: RULE_DISJUNCTION_KEYWORD
                {
                mRULE_DISJUNCTION_KEYWORD(); 

                }
                break;
            case 42 :
                // InternalEtlLexer.g:1:844: RULE_REVERSED
                {
                mRULE_REVERSED(); 

                }
                break;
            case 43 :
                // InternalEtlLexer.g:1:858: RULE_MEMBER_SHORT_KEYWORD
                {
                mRULE_MEMBER_SHORT_KEYWORD(); 

                }
                break;
            case 44 :
                // InternalEtlLexer.g:1:884: RULE_DESCRIPTION_SHORT_KEYWORD
                {
                mRULE_DESCRIPTION_SHORT_KEYWORD(); 

                }
                break;
            case 45 :
                // InternalEtlLexer.g:1:915: RULE_CONCEPT_SHORT_KEYWORD
                {
                mRULE_CONCEPT_SHORT_KEYWORD(); 

                }
                break;
            case 46 :
                // InternalEtlLexer.g:1:942: RULE_ALPHA
                {
                mRULE_ALPHA(); 

                }
                break;
            case 47 :
                // InternalEtlLexer.g:1:953: RULE_KEYWORD
                {
                mRULE_KEYWORD(); 

                }
                break;
            case 48 :
                // InternalEtlLexer.g:1:966: RULE_DBL_LT_EM
                {
                mRULE_DBL_LT_EM(); 

                }
                break;
            case 49 :
                // InternalEtlLexer.g:1:981: RULE_DBL_GT_EM
                {
                mRULE_DBL_GT_EM(); 

                }
                break;
            case 50 :
                // InternalEtlLexer.g:1:996: RULE_DBL_LT
                {
                mRULE_DBL_LT(); 

                }
                break;
            case 51 :
                // InternalEtlLexer.g:1:1008: RULE_DBL_GT
                {
                mRULE_DBL_GT(); 

                }
                break;
            case 52 :
                // InternalEtlLexer.g:1:1020: RULE_LT_EM
                {
                mRULE_LT_EM(); 

                }
                break;
            case 53 :
                // InternalEtlLexer.g:1:1031: RULE_GT_EM
                {
                mRULE_GT_EM(); 

                }
                break;
            case 54 :
                // InternalEtlLexer.g:1:1042: RULE_GTE
                {
                mRULE_GTE(); 

                }
                break;
            case 55 :
                // InternalEtlLexer.g:1:1051: RULE_LTE
                {
                mRULE_LTE(); 

                }
                break;
            case 56 :
                // InternalEtlLexer.g:1:1060: RULE_DOUBLE_CURLY_OPEN
                {
                mRULE_DOUBLE_CURLY_OPEN(); 

                }
                break;
            case 57 :
                // InternalEtlLexer.g:1:1083: RULE_DOUBLE_CURLY_CLOSE
                {
                mRULE_DOUBLE_CURLY_CLOSE(); 

                }
                break;
            case 58 :
                // InternalEtlLexer.g:1:1107: RULE_PIPE_DELIMITED_STRING
                {
                mRULE_PIPE_DELIMITED_STRING(); 

                }
                break;
            case 59 :
                // InternalEtlLexer.g:1:1134: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 60 :
                // InternalEtlLexer.g:1:1146: RULE_TO
                {
                mRULE_TO(); 

                }
                break;
            case 61 :
                // InternalEtlLexer.g:1:1154: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 62 :
                // InternalEtlLexer.g:1:1165: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 63 :
                // InternalEtlLexer.g:1:1176: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 64 :
                // InternalEtlLexer.g:1:1187: RULE_CURLY_OPEN
                {
                mRULE_CURLY_OPEN(); 

                }
                break;
            case 65 :
                // InternalEtlLexer.g:1:1203: RULE_CURLY_CLOSE
                {
                mRULE_CURLY_CLOSE(); 

                }
                break;
            case 66 :
                // InternalEtlLexer.g:1:1220: RULE_ROUND_OPEN
                {
                mRULE_ROUND_OPEN(); 

                }
                break;
            case 67 :
                // InternalEtlLexer.g:1:1236: RULE_ROUND_CLOSE
                {
                mRULE_ROUND_CLOSE(); 

                }
                break;
            case 68 :
                // InternalEtlLexer.g:1:1253: RULE_SQUARE_OPEN
                {
                mRULE_SQUARE_OPEN(); 

                }
                break;
            case 69 :
                // InternalEtlLexer.g:1:1270: RULE_SQUARE_CLOSE
                {
                mRULE_SQUARE_CLOSE(); 

                }
                break;
            case 70 :
                // InternalEtlLexer.g:1:1288: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 71 :
                // InternalEtlLexer.g:1:1298: RULE_DASH
                {
                mRULE_DASH(); 

                }
                break;
            case 72 :
                // InternalEtlLexer.g:1:1308: RULE_UNDERSCORE
                {
                mRULE_UNDERSCORE(); 

                }
                break;
            case 73 :
                // InternalEtlLexer.g:1:1324: RULE_CARET
                {
                mRULE_CARET(); 

                }
                break;
            case 74 :
                // InternalEtlLexer.g:1:1335: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 75 :
                // InternalEtlLexer.g:1:1344: RULE_WILDCARD
                {
                mRULE_WILDCARD(); 

                }
                break;
            case 76 :
                // InternalEtlLexer.g:1:1358: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 77 :
                // InternalEtlLexer.g:1:1369: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 78 :
                // InternalEtlLexer.g:1:1384: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 79 :
                // InternalEtlLexer.g:1:1392: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 80 :
                // InternalEtlLexer.g:1:1400: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 81 :
                // InternalEtlLexer.g:1:1410: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 82 :
                // InternalEtlLexer.g:1:1418: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 83 :
                // InternalEtlLexer.g:1:1434: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA4_eotS =
        "\24\uffff";
    static final String DFA4_eofS =
        "\24\uffff";
    static final String DFA4_minS =
        "\1\103\1\101\1\uffff\1\123\1\105\1\123\1\111\1\107\1\116\1\111\1\106\1\111\1\103\1\101\1\116\1\103\1\105\1\111\1\104\1\uffff";
    static final String DFA4_maxS =
        "\1\143\1\141\1\uffff\1\163\1\145\1\163\1\151\1\147\1\156\1\151\1\146\1\151\1\143\1\141\1\156\1\143\1\145\1\151\1\144\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\20\uffff\1\1";
    static final String DFA4_specialS =
        "\24\uffff}>";
    static final String[] DFA4_transitionS = DFA4_transitionS_.DFA4_transitionS;
    private static final class DFA4_transitionS_ {
        static final String[] DFA4_transitionS = {
                "\1\2\37\uffff\1\1",
                "\1\2\37\uffff\1\3",
                "",
                "\1\2\37\uffff\1\4",
                "\1\2\37\uffff\1\5",
                "\1\6\37\uffff\1\2",
                "\1\2\37\uffff\1\7",
                "\1\2\37\uffff\1\10",
                "\1\2\37\uffff\1\11",
                "\1\2\37\uffff\1\12",
                "\1\2\37\uffff\1\13",
                "\1\2\37\uffff\1\14",
                "\1\2\37\uffff\1\15",
                "\1\2\37\uffff\1\16",
                "\1\2\37\uffff\1\17",
                "\1\2\37\uffff\1\20",
                "\1\2\37\uffff\1\21",
                "\1\22\37\uffff\1\2",
                "\1\2\37\uffff\1\23",
                ""
        };
    }

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "54:37: ( 'caseSignificanceId' | ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )";
        }
    }
    static final String DFA5_eotS =
        "\24\uffff";
    static final String DFA5_eofS =
        "\24\uffff";
    static final String DFA5_minS =
        "\1\104\1\105\1\uffff\1\106\1\111\1\116\1\111\1\124\1\111\1\117\1\116\1\123\1\124\1\101\1\124\1\125\1\123\1\111\1\104\1\uffff";
    static final String DFA5_maxS =
        "\1\144\1\145\1\uffff\1\146\1\151\1\156\1\151\1\164\1\151\1\157\1\156\1\163\1\164\1\141\1\164\1\165\1\163\1\151\1\144\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\20\uffff\1\1";
    static final String DFA5_specialS =
        "\24\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            "\1\2\37\uffff\1\12",
            "\1\2\37\uffff\1\13",
            "\1\14\37\uffff\1\2",
            "\1\2\37\uffff\1\15",
            "\1\2\37\uffff\1\16",
            "\1\2\37\uffff\1\17",
            "\1\2\37\uffff\1\20",
            "\1\2\37\uffff\1\21",
            "\1\22\37\uffff\1\2",
            "\1\2\37\uffff\1\23",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "56:37: ( 'definitionStatusId' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' ) )";
        }
    }
    static final String DFA6_eotS =
        "\22\uffff";
    static final String DFA6_eofS =
        "\22\uffff";
    static final String DFA6_minS =
        "\1\104\1\105\1\uffff\1\106\1\111\1\116\1\111\1\124\1\111\1\117\1\116\1\123\1\124\1\101\1\124\1\125\1\123\1\uffff";
    static final String DFA6_maxS =
        "\1\144\1\145\1\uffff\1\146\1\151\1\156\1\151\1\164\1\151\1\157\1\156\1\163\1\164\1\141\1\164\1\165\1\163\1\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\16\uffff\1\1";
    static final String DFA6_specialS =
        "\22\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            "\1\2\37\uffff\1\12",
            "\1\2\37\uffff\1\13",
            "\1\14\37\uffff\1\2",
            "\1\2\37\uffff\1\15",
            "\1\2\37\uffff\1\16",
            "\1\2\37\uffff\1\17",
            "\1\2\37\uffff\1\20",
            "\1\2\37\uffff\1\21",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "58:40: ( 'definitionStatus' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) )";
        }
    }
    static final String DFA7_eotS =
        "\22\uffff";
    static final String DFA7_eofS =
        "\22\uffff";
    static final String DFA7_minS =
        "\1\114\1\101\1\uffff\1\116\1\107\1\125\1\101\1\107\1\105\1\122\1\105\1\106\1\123\1\105\1\124\1\111\1\104\1\uffff";
    static final String DFA7_maxS =
        "\1\154\1\141\1\uffff\1\156\1\147\1\165\1\141\1\147\1\145\1\162\1\145\1\146\1\163\1\145\1\164\1\151\1\144\1\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\16\uffff\1\1";
    static final String DFA7_specialS =
        "\22\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            "\1\12\37\uffff\1\2",
            "\1\2\37\uffff\1\13",
            "\1\2\37\uffff\1\14",
            "\1\2\37\uffff\1\15",
            "\1\2\37\uffff\1\16",
            "\1\2\37\uffff\1\17",
            "\1\20\37\uffff\1\2",
            "\1\2\37\uffff\1\21",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "60:35: ( 'languageRefsetId' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )";
        }
    }
    static final String DFA8_eotS =
        "\17\uffff";
    static final String DFA8_eofS =
        "\17\uffff";
    static final String DFA8_minS =
        "\1\105\1\106\1\uffff\1\106\1\105\1\103\1\124\1\111\1\126\1\105\1\124\1\111\1\115\1\105\1\uffff";
    static final String DFA8_maxS =
        "\1\145\1\146\1\uffff\1\146\1\145\1\143\1\164\1\151\1\166\1\145\1\164\1\151\1\155\1\145\1\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\13\uffff\1\1";
    static final String DFA8_specialS =
        "\17\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            "\1\2\37\uffff\1\12",
            "\1\13\37\uffff\1\2",
            "\1\2\37\uffff\1\14",
            "\1\2\37\uffff\1\15",
            "\1\2\37\uffff\1\16",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "62:31: ( 'effectiveTime' | ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )";
        }
    }
    static final String DFA9_eotS =
        "\16\uffff";
    static final String DFA9_eofS =
        "\16\uffff";
    static final String DFA9_minS =
        "\1\101\1\103\1\uffff\1\103\1\105\1\120\1\124\1\101\1\102\1\114\1\105\1\111\1\116\1\uffff";
    static final String DFA9_maxS =
        "\1\141\1\143\1\uffff\1\143\1\145\1\160\1\164\1\141\1\142\1\154\1\145\1\151\1\156\1\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\12\uffff\1\1";
    static final String DFA9_specialS =
        "\16\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            "\1\2\37\uffff\1\12",
            "\1\2\37\uffff\1\13",
            "\1\14\37\uffff\1\2",
            "\1\2\37\uffff\1\15",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "64:30: ( 'acceptableIn' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )";
        }
    }
    static final String DFA10_eotS =
        "\15\uffff";
    static final String DFA10_eofS =
        "\15\uffff";
    static final String DFA10_minS =
        "\1\120\1\122\1\uffff\1\105\1\106\1\105\2\122\1\105\1\104\1\111\1\116\1\uffff";
    static final String DFA10_maxS =
        "\1\160\1\162\1\uffff\1\145\1\146\1\145\2\162\1\145\1\144\1\151\1\156\1\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\11\uffff\1\1";
    static final String DFA10_specialS =
        "\15\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            "\1\2\37\uffff\1\12",
            "\1\13\37\uffff\1\2",
            "\1\2\37\uffff\1\14",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "66:29: ( 'preferredIn' | ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )";
        }
    }
    static final String DFA11_eotS =
        "\15\uffff";
    static final String DFA11_eofS =
        "\15\uffff";
    static final String DFA11_minS =
        "\1\123\1\105\1\uffff\1\115\1\101\1\116\1\124\1\111\1\103\1\124\1\101\1\107\1\uffff";
    static final String DFA11_maxS =
        "\1\163\1\145\1\uffff\1\155\1\141\1\156\1\164\1\151\1\143\1\164\1\141\1\147\1\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\11\uffff\1\1";
    static final String DFA11_specialS =
        "\15\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            "\1\12\37\uffff\1\2",
            "\1\2\37\uffff\1\13",
            "\1\2\37\uffff\1\14",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "68:29: ( 'semanticTag' | ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' ) )";
        }
    }
    static final String DFA12_eotS =
        "\13\uffff";
    static final String DFA12_eofS =
        "\13\uffff";
    static final String DFA12_minS =
        "\1\104\1\111\1\uffff\1\101\1\114\1\105\1\103\1\124\1\111\1\104\1\uffff";
    static final String DFA12_maxS =
        "\1\144\1\151\1\uffff\1\141\1\154\1\145\1\143\1\164\1\151\1\144\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\7\uffff\1\1";
    static final String DFA12_specialS =
        "\13\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\11\37\uffff\1\2",
            "\1\2\37\uffff\1\12",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "70:26: ( 'dialectId' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )";
        }
    }
    static final String DFA13_eotS =
        "\12\uffff";
    static final String DFA13_eofS =
        "\12\uffff";
    static final String DFA13_minS =
        "\1\114\1\101\1\uffff\1\116\1\107\1\125\1\101\1\107\1\105\1\uffff";
    static final String DFA13_maxS =
        "\1\154\1\141\1\uffff\1\156\1\147\1\165\1\141\1\147\1\145\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\6\uffff\1\1";
    static final String DFA13_specialS =
        "\12\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
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
            return "72:25: ( 'language' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )";
        }
    }
    static final String DFA14_eotS =
        "\12\uffff";
    static final String DFA14_eofS =
        "\12\uffff";
    static final String DFA14_minS =
        "\1\115\1\117\1\uffff\1\104\1\125\1\114\1\105\1\111\1\104\1\uffff";
    static final String DFA14_maxS =
        "\1\155\1\157\1\uffff\1\144\1\165\1\154\1\145\1\151\1\144\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\6\uffff\1\1";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\10\37\uffff\1\2",
            "\1\2\37\uffff\1\11",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "74:25: ( 'moduleId' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )";
        }
    }
    static final String DFA41_eotS =
        "\1\uffff\1\72\1\74\1\uffff\3\77\1\120\1\122\1\126\1\uffff\2\77\2\133\1\120\11\77\2\155\4\77\1\165\5\77\1\175\1\177\1\u0081\2\uffff\1\u0083\22\uffff\1\u0086\1\100\2\uffff\17\100\3\uffff\1\u009a\3\uffff\4\100\1\uffff\21\100\1\uffff\7\100\1\uffff\2\100\2\u00bc\1\u00be\14\uffff\1\u00bf\1\u00c0\1\u00c1\2\100\1\u00c4\6\100\1\u00cb\4\100\3\uffff\16\100\2\u00de\2\100\2\u00e3\1\u00e5\2\100\1\u00e8\1\u00e3\1\u00e5\1\u00e8\6\100\6\uffff\2\100\1\uffff\2\u00f4\2\u00f5\2\u00f6\1\uffff\22\100\1\uffff\4\100\1\uffff\1\100\1\uffff\2\100\1\uffff\5\100\2\u0115\4\100\3\uffff\14\100\2\u0126\10\100\1\u012f\2\u0130\1\u012f\2\u0131\2\u0132\1\uffff\2\100\2\u0135\14\100\1\uffff\2\100\2\u0144\4\100\4\uffff\2\100\1\uffff\2\100\2\u014f\2\u0150\10\100\1\uffff\12\100\2\uffff\2\100\2\u0167\6\100\2\u016e\4\100\2\u0173\4\100\1\uffff\6\100\1\uffff\4\100\1\uffff\12\100\2\u018c\12\100\2\u0197\1\uffff\10\100\2\u01a0\1\uffff\6\100\2\u01a7\1\uffff\6\100\1\uffff\6\100\2\u01b6\2\100\2\u01b9\2\100\1\uffff\2\100\1\uffff\2\u01be\2\u01bf\2\uffff";
    static final String DFA41_eofS =
        "\u01c0\uffff";
    static final String DFA41_minS =
        "\1\11\1\133\1\135\1\uffff\4\101\1\75\1\41\1\uffff\32\101\1\41\1\173\1\175\2\uffff\1\56\15\uffff\1\52\4\uffff\1\101\1\164\2\uffff\1\147\1\162\2\115\1\153\2\120\2\122\2\125\2\106\2\101\3\uffff\1\41\3\uffff\4\123\1\uffff\2\116\2\106\2\101\2\103\2\104\2\105\2\104\1\116\2\124\1\uffff\1\104\1\116\1\124\2\114\2\107\1\uffff\2\114\2\101\1\41\14\uffff\6\101\2\105\2\115\2\105\1\101\2\111\2\114\3\uffff\2\124\2\105\2\107\2\105\2\103\2\105\2\111\2\101\2\106\3\101\2\103\4\101\2\123\2\105\2\104\6\uffff\2\116\1\uffff\6\101\1\uffff\2\116\2\105\2\117\2\123\2\125\2\103\2\124\2\120\2\126\1\uffff\2\105\2\114\1\uffff\1\123\1\uffff\2\110\1\uffff\1\123\2\105\2\130\2\101\2\124\2\104\3\uffff\2\111\2\103\2\122\2\111\2\101\2\124\2\101\2\124\2\105\2\122\2\105\10\101\1\uffff\2\111\2\101\4\124\2\131\4\107\2\111\1\uffff\4\101\2\122\2\111\4\uffff\2\103\1\uffff\2\111\4\101\2\116\2\105\2\126\2\102\1\uffff\2\105\2\104\2\124\2\117\2\104\2\uffff\2\111\2\101\2\105\2\114\2\104\4\101\2\116\2\101\2\106\2\105\1\uffff\2\124\2\105\2\111\1\uffff\2\107\2\123\1\uffff\2\111\2\106\4\111\2\116\2\101\2\124\2\103\2\123\2\115\2\116\2\101\1\uffff\4\101\4\105\2\101\1\uffff\2\124\2\116\2\124\2\101\1\uffff\2\125\2\103\2\111\1\uffff\2\123\2\105\2\104\2\101\2\111\2\101\2\104\1\uffff\2\104\1\uffff\4\101\2\uffff";
    static final String DFA41_maxS =
        "\1\176\1\133\1\135\1\uffff\4\172\2\75\1\uffff\32\172\1\76\1\173\1\175\2\uffff\1\56\15\uffff\1\57\4\uffff\1\172\1\164\2\uffff\1\147\1\162\2\155\1\153\2\160\2\162\2\165\2\146\2\141\3\uffff\1\74\3\uffff\4\163\1\uffff\2\156\2\146\2\141\2\164\2\144\2\145\2\144\1\156\2\170\1\uffff\1\144\1\156\1\170\2\154\2\147\1\uffff\2\154\2\172\1\41\14\uffff\3\172\2\141\1\172\2\145\2\155\2\145\1\172\2\151\2\154\3\uffff\2\164\2\145\2\147\2\145\2\143\2\145\2\151\2\172\2\146\3\172\2\143\4\172\2\163\2\145\2\144\6\uffff\2\156\1\uffff\6\172\1\uffff\2\156\2\145\2\157\2\163\2\165\2\143\2\164\2\160\2\166\1\uffff\2\145\2\154\1\uffff\1\163\1\uffff\2\150\1\uffff\1\163\2\145\2\170\2\172\2\164\2\144\3\uffff\2\151\2\143\2\162\2\151\2\141\2\164\2\172\2\164\2\145\2\162\2\145\10\172\1\uffff\2\151\2\172\4\164\2\171\4\147\2\151\1\uffff\2\141\2\172\2\162\2\151\4\uffff\2\143\1\uffff\2\151\4\172\2\156\2\145\2\166\2\142\1\uffff\2\145\2\144\2\164\2\157\2\144\2\uffff\2\151\2\172\2\145\2\154\2\144\2\172\2\141\2\156\2\172\2\146\2\145\1\uffff\2\164\2\145\2\151\1\uffff\2\147\2\163\1\uffff\2\151\2\146\4\151\2\156\2\172\2\164\2\143\2\163\2\155\2\156\2\172\1\uffff\4\141\4\145\2\172\1\uffff\2\164\2\156\2\164\2\172\1\uffff\2\165\2\143\2\151\1\uffff\2\163\2\145\2\144\2\172\2\151\2\172\2\144\1\uffff\2\144\1\uffff\4\172\2\uffff";
    static final String DFA41_acceptS =
        "\3\uffff\1\3\6\uffff\1\14\35\uffff\1\72\1\73\1\uffff\1\75\1\76\1\77\1\102\1\103\1\106\1\107\1\110\1\111\1\113\1\115\1\120\1\121\1\uffff\1\1\1\104\1\2\1\105\2\uffff\1\56\1\57\17\uffff\1\54\1\12\1\114\1\uffff\1\64\1\67\1\116\4\uffff\1\55\21\uffff\1\53\7\uffff\1\52\5\uffff\1\65\1\66\1\117\1\70\1\100\1\71\1\101\1\74\1\112\1\122\1\123\1\4\21\uffff\1\13\1\60\1\62\41\uffff\1\51\1\61\1\63\1\10\1\5\1\7\2\uffff\1\6\6\uffff\1\11\22\uffff\1\50\4\uffff\1\46\1\uffff\1\45\2\uffff\1\47\13\uffff\1\43\1\41\1\42\36\uffff\1\44\20\uffff\1\35\10\uffff\1\34\1\37\1\36\1\40\2\uffff\1\33\16\uffff\1\32\12\uffff\1\31\1\15\26\uffff\1\27\6\uffff\1\30\4\uffff\1\26\30\uffff\1\25\12\uffff\1\24\10\uffff\1\23\6\uffff\1\22\16\uffff\1\20\2\uffff\1\21\4\uffff\1\17\1\16";
    static final String DFA41_specialS =
        "\u01c0\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\67\2\uffff\1\67\22\uffff\1\67\1\65\1\51\1\66\3\uffff\1\51\1\56\1\57\1\64\1\60\1\53\1\61\1\52\1\70\12\54\1\55\1\uffff\1\11\1\10\1\45\1\uffff\1\12\1\25\1\44\1\16\1\17\1\23\1\35\1\44\1\13\3\44\1\21\1\32\1\44\1\42\1\27\1\44\1\37\1\30\1\33\2\44\1\41\3\44\1\1\1\uffff\1\2\1\63\1\62\1\uffff\1\24\1\44\1\15\1\7\1\22\1\34\1\44\1\14\1\4\2\44\1\20\1\31\1\44\1\43\1\26\1\44\1\36\1\5\1\6\2\44\1\40\3\44\1\46\1\50\1\47\1\3",
            "\1\71",
            "\1\73",
            "",
            "\32\100\6\uffff\3\100\1\75\11\100\1\76\14\100",
            "\4\100\1\104\25\100\6\uffff\2\100\1\101\1\100\1\103\16\100\1\102\6\100",
            "\4\100\1\111\14\100\1\113\6\100\1\107\1\100\6\uffff\4\100\1\110\11\100\1\105\2\100\1\112\6\100\1\106\1\100",
            "\4\100\1\115\3\100\1\117\21\100\6\uffff\4\100\1\114\3\100\1\116\21\100",
            "\1\121",
            "\1\124\32\uffff\1\123\1\125",
            "",
            "\10\100\1\127\21\100\6\uffff\10\100\1\130\21\100",
            "\10\100\1\130\21\100\6\uffff\10\100\1\130\21\100",
            "\1\132\31\100\6\uffff\1\131\31\100",
            "\1\132\31\100\6\uffff\1\132\31\100",
            "\4\100\1\115\3\100\1\117\21\100\6\uffff\4\100\1\115\3\100\1\117\21\100",
            "\1\135\31\100\6\uffff\1\134\31\100",
            "\1\135\31\100\6\uffff\1\135\31\100",
            "\5\100\1\137\21\100\1\141\2\100\6\uffff\5\100\1\136\21\100\1\140\2\100",
            "\5\100\1\137\21\100\1\141\2\100\6\uffff\5\100\1\137\21\100\1\141\2\100",
            "\2\100\1\143\12\100\1\144\14\100\6\uffff\2\100\1\142\12\100\1\144\14\100",
            "\2\100\1\143\12\100\1\145\14\100\6\uffff\2\100\1\143\12\100\1\144\14\100",
            "\21\100\1\147\10\100\6\uffff\21\100\1\146\10\100",
            "\21\100\1\147\10\100\6\uffff\21\100\1\147\10\100",
            "\4\100\1\104\25\100\6\uffff\4\100\1\104\25\100",
            "\1\154\7\100\1\152\5\100\1\151\13\100\6\uffff\1\153\7\100\1\152\5\100\1\150\13\100",
            "\1\160\7\100\1\157\5\100\1\156\13\100\6\uffff\1\154\7\100\1\152\5\100\1\151\13\100",
            "\4\100\1\111\14\100\1\113\6\100\1\107\1\100\6\uffff\4\100\1\111\14\100\1\113\6\100\1\107\1\100",
            "\1\162\31\100\6\uffff\1\161\31\100",
            "\1\162\31\100\6\uffff\1\162\31\100",
            "\4\100\1\164\25\100\6\uffff\4\100\1\163\25\100",
            "\4\100\1\164\25\100\6\uffff\4\100\1\164\25\100",
            "\10\100\1\167\21\100\6\uffff\10\100\1\166\21\100",
            "\10\100\1\167\21\100\6\uffff\10\100\1\167\21\100",
            "\21\100\1\170\10\100\6\uffff\21\100\1\171\10\100",
            "\21\100\1\171\10\100\6\uffff\21\100\1\171\10\100",
            "\32\100\6\uffff\32\100",
            "\1\173\33\uffff\1\174\1\172",
            "\1\176",
            "\1\u0080",
            "",
            "",
            "\1\u0082",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0084\4\uffff\1\u0085",
            "",
            "",
            "",
            "",
            "\32\100\6\uffff\32\100",
            "\1\u0087",
            "",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008b\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c",
            "\1\u008e\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u0090\37\uffff\1\u008f",
            "\1\u0090\37\uffff\1\u0090",
            "\1\u0092\37\uffff\1\u0091",
            "\1\u0092\37\uffff\1\u0092",
            "\1\u0095\34\uffff\1\u0093\2\uffff\1\u0094",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0097\37\uffff\1\u0096",
            "\1\u0097\37\uffff\1\u0097",
            "",
            "",
            "",
            "\1\u0099\32\uffff\1\u0098",
            "",
            "",
            "",
            "\1\u009b\37\uffff\1\u009c",
            "\1\u009c\37\uffff\1\u009c",
            "\1\u009e\37\uffff\1\u009d",
            "\1\u009e\37\uffff\1\u009e",
            "",
            "\1\u00a0\37\uffff\1\u009f",
            "\1\u00a0\37\uffff\1\u00a0",
            "\1\u00a2\37\uffff\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a4\37\uffff\1\u00a3",
            "\1\u00a4\37\uffff\1\u00a4",
            "\1\u00a6\20\uffff\1\u00a8\16\uffff\1\u00a5\20\uffff\1\u00a7",
            "\1\u00a6\20\uffff\1\u00a8\16\uffff\1\u00a6\20\uffff\1\u00a8",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00aa\37\uffff\1\u00a9",
            "\1\u00ac\37\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\u00ae\37\uffff\1\u00ad",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00b1\3\uffff\1\u00b2\33\uffff\1\u00b0\3\uffff\1\u00b2",
            "\1\u00b1\3\uffff\1\u00b2\33\uffff\1\u00b1\3\uffff\1\u00b2",
            "",
            "\1\u00b3\37\uffff\1\u00ae",
            "\1\u00b4\37\uffff\1\u00af",
            "\1\u00b1\3\uffff\1\u00b5\33\uffff\1\u00b1\3\uffff\1\u00b2",
            "\1\u00b7\37\uffff\1\u00b6",
            "\1\u00b7\37\uffff\1\u00b7",
            "\1\u00b9\37\uffff\1\u00b8",
            "\1\u00b9\37\uffff\1\u00b9",
            "",
            "\1\u00bb\37\uffff\1\u00ba",
            "\1\u00bb\37\uffff\1\u00bb",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\1\u00bd",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\1\u00c3\37\uffff\1\u00c2",
            "\1\u00c3\37\uffff\1\u00c3",
            "\32\100\6\uffff\32\100",
            "\1\u00c6\37\uffff\1\u00c5",
            "\1\u00c6\37\uffff\1\u00c6",
            "\1\u00c8\37\uffff\1\u00c7",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00ca\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\32\100\6\uffff\32\100",
            "\1\u00cd\37\uffff\1\u00cc",
            "\1\u00cd\37\uffff\1\u00cd",
            "\1\u00cf\37\uffff\1\u00ce",
            "\1\u00cf\37\uffff\1\u00cf",
            "",
            "",
            "",
            "\1\u00d0\37\uffff\1\u00d1",
            "\1\u00d1\37\uffff\1\u00d1",
            "\1\u00d3\37\uffff\1\u00d2",
            "\1\u00d3\37\uffff\1\u00d3",
            "\1\u00d5\37\uffff\1\u00d4",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d7\37\uffff\1\u00d6",
            "\1\u00d7\37\uffff\1\u00d7",
            "\1\u00d9\37\uffff\1\u00d8",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00db\37\uffff\1\u00da",
            "\1\u00db\37\uffff\1\u00db",
            "\1\u00dd\37\uffff\1\u00dc",
            "\1\u00dd\37\uffff\1\u00dd",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\1\u00e0\37\uffff\1\u00df",
            "\1\u00e0\37\uffff\1\u00e0",
            "\24\100\1\u00e2\5\100\6\uffff\24\100\1\u00e1\5\100",
            "\24\100\1\u00e2\5\100\6\uffff\24\100\1\u00e2\5\100",
            "\24\100\1\u00e4\5\100\6\uffff\24\100\1\u00e4\5\100",
            "\1\u00e7\37\uffff\1\u00e6",
            "\1\u00e7\37\uffff\1\u00e7",
            "\32\100\6\uffff\32\100",
            "\24\100\1\u00e2\5\100\6\uffff\24\100\1\u00e2\5\100",
            "\24\100\1\u00e9\5\100\6\uffff\24\100\1\u00e4\5\100",
            "\32\100\6\uffff\32\100",
            "\1\u00eb\37\uffff\1\u00ea",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ed\37\uffff\1\u00ec",
            "\1\u00ed\37\uffff\1\u00ed",
            "\1\u00ef\37\uffff\1\u00ee",
            "\1\u00ef\37\uffff\1\u00ef",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f1\37\uffff\1\u00f0",
            "\1\u00f1\37\uffff\1\u00f1",
            "",
            "\10\100\1\u00f2\21\100\6\uffff\10\100\1\u00f3\21\100",
            "\10\100\1\u00f3\21\100\6\uffff\10\100\1\u00f3\21\100",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "",
            "\1\u00f8\37\uffff\1\u00f7",
            "\1\u00f8\37\uffff\1\u00f8",
            "\1\u00fa\37\uffff\1\u00f9",
            "\1\u00fa\37\uffff\1\u00fa",
            "\1\u00fb\37\uffff\1\u00fc",
            "\1\u00fc\37\uffff\1\u00fc",
            "\1\u00fd\37\uffff\1\u00fe",
            "\1\u00fe\37\uffff\1\u00fe",
            "\1\u0100\37\uffff\1\u00ff",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0102\37\uffff\1\u0101",
            "\1\u0102\37\uffff\1\u0102",
            "\1\u0104\37\uffff\1\u0103",
            "\1\u0104\37\uffff\1\u0104",
            "\1\u0106\37\uffff\1\u0105",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0108\37\uffff\1\u0107",
            "\1\u0108\37\uffff\1\u0108",
            "",
            "\1\u010a\37\uffff\1\u0109",
            "\1\u010a\37\uffff\1\u010a",
            "\1\u010c\37\uffff\1\u010b",
            "\1\u010c\37\uffff\1\u010c",
            "",
            "\1\u010d\37\uffff\1\u010d",
            "",
            "\1\u010f\37\uffff\1\u010e",
            "\1\u010f\37\uffff\1\u010f",
            "",
            "\1\u0110\37\uffff\1\u010d",
            "\1\u0112\37\uffff\1\u0111",
            "\1\u0112\37\uffff\1\u0112",
            "\1\u0114\37\uffff\1\u0113",
            "\1\u0114\37\uffff\1\u0114",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\1\u0117\37\uffff\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\1\u0119\37\uffff\1\u0118",
            "\1\u0119\37\uffff\1\u0119",
            "",
            "",
            "",
            "\1\u011b\37\uffff\1\u011a",
            "\1\u011b\37\uffff\1\u011b",
            "\1\u011d\37\uffff\1\u011c",
            "\1\u011d\37\uffff\1\u011d",
            "\1\u011e\37\uffff\1\u011f",
            "\1\u011f\37\uffff\1\u011f",
            "\1\u0121\37\uffff\1\u0120",
            "\1\u0121\37\uffff\1\u0121",
            "\1\u0123\37\uffff\1\u0122",
            "\1\u0123\37\uffff\1\u0123",
            "\1\u0125\37\uffff\1\u0124",
            "\1\u0125\37\uffff\1\u0125",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\1\u0128\37\uffff\1\u0127",
            "\1\u0128\37\uffff\1\u0128",
            "\1\u012a\37\uffff\1\u0129",
            "\1\u012a\37\uffff\1\u012a",
            "\1\u012c\37\uffff\1\u012b",
            "\1\u012c\37\uffff\1\u012c",
            "\1\u012e\37\uffff\1\u012d",
            "\1\u012e\37\uffff\1\u012e",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "",
            "\1\u0134\37\uffff\1\u0133",
            "\1\u0134\37\uffff\1\u0134",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\1\u0137\37\uffff\1\u0136",
            "\1\u0137\37\uffff\1\u0137",
            "\1\u0139\37\uffff\1\u0138",
            "\1\u0139\37\uffff\1\u0139",
            "\1\u013a\37\uffff\1\u013b",
            "\1\u013b\37\uffff\1\u013b",
            "\1\u013d\37\uffff\1\u013c",
            "\1\u013d\37\uffff\1\u013d",
            "\1\u013f\37\uffff\1\u013e",
            "\1\u013f\37\uffff\1\u013f",
            "\1\u0141\37\uffff\1\u0140",
            "\1\u0141\37\uffff\1\u0141",
            "",
            "\1\u0143\37\uffff\1\u0142",
            "\1\u0143\37\uffff\1\u0143",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\1\u0146\37\uffff\1\u0145",
            "\1\u0146\37\uffff\1\u0146",
            "\1\u0147\37\uffff\1\u0148",
            "\1\u0148\37\uffff\1\u0148",
            "",
            "",
            "",
            "",
            "\1\u014a\37\uffff\1\u0149",
            "\1\u014a\37\uffff\1\u014a",
            "",
            "\1\u014c\37\uffff\1\u014b",
            "\1\u014c\37\uffff\1\u014c",
            "\10\100\1\u014d\21\100\6\uffff\10\100\1\u014e\21\100",
            "\10\100\1\u014e\21\100\6\uffff\10\100\1\u014e\21\100",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\1\u0152\37\uffff\1\u0151",
            "\1\u0152\37\uffff\1\u0152",
            "\1\u0154\37\uffff\1\u0153",
            "\1\u0154\37\uffff\1\u0154",
            "\1\u0156\37\uffff\1\u0155",
            "\1\u0156\37\uffff\1\u0156",
            "\1\u0158\37\uffff\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "",
            "\1\u015a\37\uffff\1\u0159",
            "\1\u015a\37\uffff\1\u015a",
            "\1\u015c\37\uffff\1\u015b",
            "\1\u015c\37\uffff\1\u015c",
            "\1\u015d\37\uffff\1\u015e",
            "\1\u015e\37\uffff\1\u015e",
            "\1\u0160\37\uffff\1\u015f",
            "\1\u0160\37\uffff\1\u0160",
            "\1\u0162\37\uffff\1\u0161",
            "\1\u0162\37\uffff\1\u0162",
            "",
            "",
            "\1\u0164\37\uffff\1\u0163",
            "\1\u0164\37\uffff\1\u0164",
            "\21\100\1\u0165\10\100\6\uffff\21\100\1\u0166\10\100",
            "\21\100\1\u0166\10\100\6\uffff\21\100\1\u0166\10\100",
            "\1\u0169\37\uffff\1\u0168",
            "\1\u0169\37\uffff\1\u0169",
            "\1\u016b\37\uffff\1\u016a",
            "\1\u016b\37\uffff\1\u016b",
            "\1\u016d\37\uffff\1\u016c",
            "\1\u016d\37\uffff\1\u016d",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\1\u0170\37\uffff\1\u016f",
            "\1\u0170\37\uffff\1\u0170",
            "\1\u0172\37\uffff\1\u0171",
            "\1\u0172\37\uffff\1\u0172",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\1\u0175\37\uffff\1\u0174",
            "\1\u0175\37\uffff\1\u0175",
            "\1\u0177\37\uffff\1\u0176",
            "\1\u0177\37\uffff\1\u0177",
            "",
            "\1\u0178\37\uffff\1\u0179",
            "\1\u0179\37\uffff\1\u0179",
            "\1\u017b\37\uffff\1\u017a",
            "\1\u017b\37\uffff\1\u017b",
            "\1\u017c\37\uffff\1\u017d",
            "\1\u017d\37\uffff\1\u017d",
            "",
            "\1\u017f\37\uffff\1\u017e",
            "\1\u017f\37\uffff\1\u017f",
            "\1\u0180\37\uffff\1\u0181",
            "\1\u0181\37\uffff\1\u0181",
            "",
            "\1\u0183\37\uffff\1\u0182",
            "\1\u0183\37\uffff\1\u0183",
            "\1\u0185\37\uffff\1\u0184",
            "\1\u0185\37\uffff\1\u0185",
            "\1\u0187\37\uffff\1\u0186",
            "\1\u0187\37\uffff\1\u0187",
            "\1\u0188\37\uffff\1\u0189",
            "\1\u0189\37\uffff\1\u0189",
            "\1\u018b\37\uffff\1\u018a",
            "\1\u018b\37\uffff\1\u018b",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\1\u018e\37\uffff\1\u018d",
            "\1\u018e\37\uffff\1\u018e",
            "\1\u0190\37\uffff\1\u018f",
            "\1\u0190\37\uffff\1\u0190",
            "\1\u0192\37\uffff\1\u0191",
            "\1\u0192\37\uffff\1\u0192",
            "\1\u0194\37\uffff\1\u0193",
            "\1\u0194\37\uffff\1\u0194",
            "\1\u0196\37\uffff\1\u0195",
            "\1\u0196\37\uffff\1\u0196",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "",
            "\1\u0199\37\uffff\1\u0198",
            "\1\u0199\37\uffff\1\u0199",
            "\1\u019b\37\uffff\1\u019a",
            "\1\u019b\37\uffff\1\u019b",
            "\1\u019d\37\uffff\1\u019c",
            "\1\u019d\37\uffff\1\u019d",
            "\1\u019f\37\uffff\1\u019e",
            "\1\u019f\37\uffff\1\u019f",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "",
            "\1\u01a2\37\uffff\1\u01a1",
            "\1\u01a2\37\uffff\1\u01a2",
            "\1\u01a4\37\uffff\1\u01a3",
            "\1\u01a4\37\uffff\1\u01a4",
            "\1\u01a6\37\uffff\1\u01a5",
            "\1\u01a6\37\uffff\1\u01a6",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "",
            "\1\u01a9\37\uffff\1\u01a8",
            "\1\u01a9\37\uffff\1\u01a9",
            "\1\u01ab\37\uffff\1\u01aa",
            "\1\u01ab\37\uffff\1\u01ab",
            "\1\u01ac\37\uffff\1\u01ad",
            "\1\u01ad\37\uffff\1\u01ad",
            "",
            "\1\u01af\37\uffff\1\u01ae",
            "\1\u01af\37\uffff\1\u01af",
            "\1\u01b1\37\uffff\1\u01b0",
            "\1\u01b1\37\uffff\1\u01b1",
            "\1\u01b3\37\uffff\1\u01b2",
            "\1\u01b3\37\uffff\1\u01b3",
            "\10\100\1\u01b4\21\100\6\uffff\10\100\1\u01b5\21\100",
            "\10\100\1\u01b5\21\100\6\uffff\10\100\1\u01b5\21\100",
            "\1\u01b7\37\uffff\1\u01b8",
            "\1\u01b8\37\uffff\1\u01b8",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\1\u01bb\37\uffff\1\u01ba",
            "\1\u01bb\37\uffff\1\u01bb",
            "",
            "\1\u01bd\37\uffff\1\u01bc",
            "\1\u01bd\37\uffff\1\u01bd",
            "",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "\32\100\6\uffff\32\100",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_DOUBLE_SQUARE_OPEN | RULE_DOUBLE_SQUARE_CLOSE | RULE_TILDE | RULE_ID | RULE_SCG | RULE_TOK | RULE_STR | RULE_INT | RULE_DEC | RULE_EQUIVALENT_TO | RULE_SUBTYPE_OF | RULE_SLOTNAME_STRING | RULE_HISTORY_KEYWORD | RULE_CASE_SIGNIFICANCE_ID_KEYWORD | RULE_DEFINITION_STATUS_ID_KEYWORD | RULE_DEFINITION_STATUS_TOKEN_KEYWORD | RULE_LANGUAGE_REFSET_ID_KEYWORD | RULE_EFFECTIVE_TIME_KEYWORD | RULE_ACCEPTABLE_IN_KEYWORD | RULE_PREFERRED_IN_KEYWORD | RULE_SEMANTIC_TAG_KEYWORD | RULE_DIALECTID_KEYWORD | RULE_LANGUAGE_KEYWORD | RULE_MODULEID_KEYWORD | RULE_DIALECT_KEYWORD | RULE_ACTIVE_KEYWORD | RULE_TYPEID_KEYWORD | RULE_EXCLUSION_KEYWORD | RULE_EXACT_KEYWORD | RULE_FALSE_KEYWORD | RULE_MATCH_KEYWORD | RULE_REGEX_KEYWORD | RULE_TERM_KEYWORD | RULE_TRUE_KEYWORD | RULE_TYPE_KEYWORD | RULE_WILD_KEYWORD | RULE_MIN_KEYWORD | RULE_MOD_KEYWORD | RULE_MAX_KEYWORD | RULE_CONJUNCTION_KEYWORD | RULE_DISJUNCTION_KEYWORD | RULE_REVERSED | RULE_MEMBER_SHORT_KEYWORD | RULE_DESCRIPTION_SHORT_KEYWORD | RULE_CONCEPT_SHORT_KEYWORD | RULE_ALPHA | RULE_KEYWORD | RULE_DBL_LT_EM | RULE_DBL_GT_EM | RULE_DBL_LT | RULE_DBL_GT | RULE_LT_EM | RULE_GT_EM | RULE_GTE | RULE_LTE | RULE_DOUBLE_CURLY_OPEN | RULE_DOUBLE_CURLY_CLOSE | RULE_PIPE_DELIMITED_STRING | RULE_STRING | RULE_TO | RULE_COMMA | RULE_DIGIT | RULE_COLON | RULE_CURLY_OPEN | RULE_CURLY_CLOSE | RULE_ROUND_OPEN | RULE_ROUND_CLOSE | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE | RULE_PLUS | RULE_DASH | RULE_UNDERSCORE | RULE_CARET | RULE_DOT | RULE_WILDCARD | RULE_EQUAL | RULE_NOT_EQUAL | RULE_LT | RULE_GT | RULE_HASH | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );";
        }
    }
 

}