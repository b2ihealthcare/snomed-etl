package com.b2international.snomed.etl.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEtlLexer extends Lexer {
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

    // $ANTLR start "RULE_CASE_SIGNIFICANCE_ID_KEYWORD"
    public final void mRULE_CASE_SIGNIFICANCE_ID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_CASE_SIGNIFICANCE_ID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:52:35: ( ( 'caseSignificanceId' | ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:52:37: ( 'caseSignificanceId' | ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:52:37: ( 'caseSignificanceId' | ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalEtlLexer.g:52:38: 'caseSignificanceId'
                    {
                    match("caseSignificanceId"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:52:59: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' )
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
            // InternalEtlLexer.g:54:35: ( ( 'definitionStatusId' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' ) ) )
            // InternalEtlLexer.g:54:37: ( 'definitionStatusId' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' ) )
            {
            // InternalEtlLexer.g:54:37: ( 'definitionStatusId' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalEtlLexer.g:54:38: 'definitionStatusId'
                    {
                    match("definitionStatusId"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:54:59: ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' )
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
            // InternalEtlLexer.g:56:38: ( ( 'definitionStatus' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ) )
            // InternalEtlLexer.g:56:40: ( 'definitionStatus' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) )
            {
            // InternalEtlLexer.g:56:40: ( 'definitionStatus' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalEtlLexer.g:56:41: 'definitionStatus'
                    {
                    match("definitionStatus"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:56:60: ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' )
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
            // InternalEtlLexer.g:58:33: ( ( 'languageRefsetId' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:58:35: ( 'languageRefsetId' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:58:35: ( 'languageRefsetId' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalEtlLexer.g:58:36: 'languageRefsetId'
                    {
                    match("languageRefsetId"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:58:55: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' )
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
            // InternalEtlLexer.g:60:29: ( ( 'effectiveTime' | ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ) )
            // InternalEtlLexer.g:60:31: ( 'effectiveTime' | ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            {
            // InternalEtlLexer.g:60:31: ( 'effectiveTime' | ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalEtlLexer.g:60:32: 'effectiveTime'
                    {
                    match("effectiveTime"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:60:48: ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' )
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
            // InternalEtlLexer.g:62:28: ( ( 'acceptableIn' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ) )
            // InternalEtlLexer.g:62:30: ( 'acceptableIn' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            {
            // InternalEtlLexer.g:62:30: ( 'acceptableIn' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalEtlLexer.g:62:31: 'acceptableIn'
                    {
                    match("acceptableIn"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:62:46: ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' )
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
            // InternalEtlLexer.g:64:27: ( ( 'preferredIn' | ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ) )
            // InternalEtlLexer.g:64:29: ( 'preferredIn' | ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            {
            // InternalEtlLexer.g:64:29: ( 'preferredIn' | ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalEtlLexer.g:64:30: 'preferredIn'
                    {
                    match("preferredIn"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:64:44: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' )
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
            // InternalEtlLexer.g:66:27: ( ( 'semanticTag' | ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ) )
            // InternalEtlLexer.g:66:29: ( 'semanticTag' | ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' ) )
            {
            // InternalEtlLexer.g:66:29: ( 'semanticTag' | ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalEtlLexer.g:66:30: 'semanticTag'
                    {
                    match("semanticTag"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:66:44: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' )
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
            // InternalEtlLexer.g:68:24: ( ( 'dialectId' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:68:26: ( 'dialectId' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:68:26: ( 'dialectId' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalEtlLexer.g:68:27: 'dialectId'
                    {
                    match("dialectId"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:68:39: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' )
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
            // InternalEtlLexer.g:70:23: ( ( 'language' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ) )
            // InternalEtlLexer.g:70:25: ( 'language' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            {
            // InternalEtlLexer.g:70:25: ( 'language' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalEtlLexer.g:70:26: 'language'
                    {
                    match("language"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:70:37: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' )
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
            // InternalEtlLexer.g:72:23: ( ( 'moduleId' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:72:25: ( 'moduleId' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:72:25: ( 'moduleId' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalEtlLexer.g:72:26: 'moduleId'
                    {
                    match("moduleId"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:72:37: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' )
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
            // InternalEtlLexer.g:74:22: ( ( 'dialect' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ) )
            // InternalEtlLexer.g:74:24: ( 'dialect' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            {
            // InternalEtlLexer.g:74:24: ( 'dialect' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='d') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='i') ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3=='a') ) {
                        int LA14_4 = input.LA(4);

                        if ( (LA14_4=='l') ) {
                            int LA14_5 = input.LA(5);

                            if ( (LA14_5=='e') ) {
                                int LA14_6 = input.LA(6);

                                if ( (LA14_6=='c') ) {
                                    int LA14_7 = input.LA(7);

                                    if ( (LA14_7=='t') ) {
                                        alt14=1;
                                    }
                                    else if ( (LA14_7=='T') ) {
                                        alt14=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 14, 7, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA14_6=='C') ) {
                                    alt14=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 14, 6, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA14_5=='E') ) {
                                alt14=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 14, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA14_4=='L') ) {
                            alt14=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA14_3=='A') ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA14_1=='I') ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0=='D') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalEtlLexer.g:74:25: 'dialect'
                    {
                    match("dialect"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:74:35: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
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
            // InternalEtlLexer.g:76:21: ( ( 'active' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ) )
            // InternalEtlLexer.g:76:23: ( 'active' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            {
            // InternalEtlLexer.g:76:23: ( 'active' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='a') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='c') ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3=='t') ) {
                        int LA15_4 = input.LA(4);

                        if ( (LA15_4=='i') ) {
                            int LA15_5 = input.LA(5);

                            if ( (LA15_5=='v') ) {
                                int LA15_6 = input.LA(6);

                                if ( (LA15_6=='e') ) {
                                    alt15=1;
                                }
                                else if ( (LA15_6=='E') ) {
                                    alt15=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 15, 6, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA15_5=='V') ) {
                                alt15=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA15_4=='I') ) {
                            alt15=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA15_3=='T') ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA15_1=='C') ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0=='A') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalEtlLexer.g:76:24: 'active'
                    {
                    match("active"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:76:33: ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' )
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
            // InternalEtlLexer.g:78:21: ( ( 'typeId' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:78:23: ( 'typeId' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:78:23: ( 'typeId' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='t') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='y') ) {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3=='p') ) {
                        int LA16_4 = input.LA(4);

                        if ( (LA16_4=='e') ) {
                            int LA16_5 = input.LA(5);

                            if ( (LA16_5=='I') ) {
                                int LA16_6 = input.LA(6);

                                if ( (LA16_6=='d') ) {
                                    alt16=1;
                                }
                                else if ( (LA16_6=='D') ) {
                                    alt16=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 16, 6, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA16_5=='i') ) {
                                alt16=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA16_4=='E') ) {
                            alt16=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA16_3=='P') ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA16_1=='Y') ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA16_0=='T') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalEtlLexer.g:78:24: 'typeId'
                    {
                    match("typeId"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:78:33: ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' )
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
            // InternalEtlLexer.g:80:24: ( ( 'MINUS' | ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' ) ) )
            // InternalEtlLexer.g:80:26: ( 'MINUS' | ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' ) )
            {
            // InternalEtlLexer.g:80:26: ( 'MINUS' | ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='M') ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='I') ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3=='N') ) {
                        int LA17_4 = input.LA(4);

                        if ( (LA17_4=='U') ) {
                            int LA17_5 = input.LA(5);

                            if ( (LA17_5=='S') ) {
                                alt17=1;
                            }
                            else if ( (LA17_5=='s') ) {
                                alt17=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA17_4=='u') ) {
                            alt17=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA17_3=='n') ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA17_1=='i') ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0=='m') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalEtlLexer.g:80:27: 'MINUS'
                    {
                    match("MINUS"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:80:35: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' )
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
            // InternalEtlLexer.g:82:20: ( ( 'exact' | ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ) )
            // InternalEtlLexer.g:82:22: ( 'exact' | ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            {
            // InternalEtlLexer.g:82:22: ( 'exact' | ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='e') ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='x') ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3=='a') ) {
                        int LA18_4 = input.LA(4);

                        if ( (LA18_4=='c') ) {
                            int LA18_5 = input.LA(5);

                            if ( (LA18_5=='t') ) {
                                alt18=1;
                            }
                            else if ( (LA18_5=='T') ) {
                                alt18=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA18_4=='C') ) {
                            alt18=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA18_3=='A') ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA18_1=='X') ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0=='E') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalEtlLexer.g:82:23: 'exact'
                    {
                    match("exact"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:82:31: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' )
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
            // InternalEtlLexer.g:84:20: ( ( 'false' | ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) ) )
            // InternalEtlLexer.g:84:22: ( 'false' | ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            {
            // InternalEtlLexer.g:84:22: ( 'false' | ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='f') ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='a') ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3=='l') ) {
                        int LA19_4 = input.LA(4);

                        if ( (LA19_4=='s') ) {
                            int LA19_5 = input.LA(5);

                            if ( (LA19_5=='e') ) {
                                alt19=1;
                            }
                            else if ( (LA19_5=='E') ) {
                                alt19=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 19, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA19_4=='S') ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA19_3=='L') ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA19_1=='A') ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0=='F') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalEtlLexer.g:84:23: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:84:31: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
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
            // InternalEtlLexer.g:86:20: ( ( 'match' | ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ) )
            // InternalEtlLexer.g:86:22: ( 'match' | ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            {
            // InternalEtlLexer.g:86:22: ( 'match' | ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='m') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='a') ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3=='t') ) {
                        int LA20_4 = input.LA(4);

                        if ( (LA20_4=='c') ) {
                            int LA20_5 = input.LA(5);

                            if ( (LA20_5=='h') ) {
                                alt20=1;
                            }
                            else if ( (LA20_5=='H') ) {
                                alt20=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA20_4=='C') ) {
                            alt20=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA20_3=='T') ) {
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
            else if ( (LA20_0=='M') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalEtlLexer.g:86:23: 'match'
                    {
                    match("match"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:86:31: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )
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
            // InternalEtlLexer.g:88:20: ( ( 'regex' | ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ) )
            // InternalEtlLexer.g:88:22: ( 'regex' | ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' ) )
            {
            // InternalEtlLexer.g:88:22: ( 'regex' | ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='r') ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1=='e') ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3=='g') ) {
                        int LA21_4 = input.LA(4);

                        if ( (LA21_4=='e') ) {
                            int LA21_5 = input.LA(5);

                            if ( (LA21_5=='x') ) {
                                alt21=1;
                            }
                            else if ( (LA21_5=='X') ) {
                                alt21=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 21, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA21_4=='E') ) {
                            alt21=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA21_3=='G') ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA21_1=='E') ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0=='R') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalEtlLexer.g:88:23: 'regex'
                    {
                    match("regex"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:88:31: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' )
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
            // InternalEtlLexer.g:90:19: ( ( 'term' | ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ) )
            // InternalEtlLexer.g:90:21: ( 'term' | ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) )
            {
            // InternalEtlLexer.g:90:21: ( 'term' | ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='t') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='e') ) {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3=='r') ) {
                        int LA22_4 = input.LA(4);

                        if ( (LA22_4=='m') ) {
                            alt22=1;
                        }
                        else if ( (LA22_4=='M') ) {
                            alt22=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA22_3=='R') ) {
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
            else if ( (LA22_0=='T') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalEtlLexer.g:90:22: 'term'
                    {
                    match("term"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:90:29: ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' )
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
            // InternalEtlLexer.g:92:19: ( ( 'true' | ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ) )
            // InternalEtlLexer.g:92:21: ( 'true' | ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            {
            // InternalEtlLexer.g:92:21: ( 'true' | ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='t') ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1=='r') ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3=='u') ) {
                        int LA23_4 = input.LA(4);

                        if ( (LA23_4=='e') ) {
                            alt23=1;
                        }
                        else if ( (LA23_4=='E') ) {
                            alt23=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA23_3=='U') ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA23_1=='R') ) {
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
                    // InternalEtlLexer.g:92:22: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:92:29: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
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
            // InternalEtlLexer.g:94:19: ( ( 'type' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ) )
            // InternalEtlLexer.g:94:21: ( 'type' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            {
            // InternalEtlLexer.g:94:21: ( 'type' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='t') ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1=='y') ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3=='p') ) {
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
                    else if ( (LA24_3=='P') ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA24_1=='Y') ) {
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
                    // InternalEtlLexer.g:94:22: 'type'
                    {
                    match("type"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:94:29: ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
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
            // InternalEtlLexer.g:96:19: ( ( 'wild' | ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:96:21: ( 'wild' | ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:96:21: ( 'wild' | ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='w') ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1=='i') ) {
                    int LA25_3 = input.LA(3);

                    if ( (LA25_3=='l') ) {
                        int LA25_4 = input.LA(4);

                        if ( (LA25_4=='d') ) {
                            alt25=1;
                        }
                        else if ( (LA25_4=='D') ) {
                            alt25=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA25_3=='L') ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA25_1=='I') ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA25_0=='W') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalEtlLexer.g:96:22: 'wild'
                    {
                    match("wild"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:96:29: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' )
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

    // $ANTLR start "RULE_CONJUNCTION_KEYWORD"
    public final void mRULE_CONJUNCTION_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_CONJUNCTION_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:98:26: ( ( 'AND' | ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ) )
            // InternalEtlLexer.g:98:28: ( 'AND' | ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            {
            // InternalEtlLexer.g:98:28: ( 'AND' | ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='A') ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1=='N') ) {
                    int LA26_3 = input.LA(3);

                    if ( (LA26_3=='D') ) {
                        alt26=1;
                    }
                    else if ( (LA26_3=='d') ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA26_1=='n') ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA26_0=='a') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalEtlLexer.g:98:29: 'AND'
                    {
                    match("AND"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:98:35: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
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
            // InternalEtlLexer.g:100:26: ( ( 'OR' | ( 'O' | 'o' ) ( 'R' | 'r' ) ) )
            // InternalEtlLexer.g:100:28: ( 'OR' | ( 'O' | 'o' ) ( 'R' | 'r' ) )
            {
            // InternalEtlLexer.g:100:28: ( 'OR' | ( 'O' | 'o' ) ( 'R' | 'r' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='O') ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1=='R') ) {
                    alt27=1;
                }
                else if ( (LA27_1=='r') ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0=='o') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalEtlLexer.g:100:29: 'OR'
                    {
                    match("OR"); 


                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:100:34: ( 'O' | 'o' ) ( 'R' | 'r' )
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
            // InternalEtlLexer.g:102:15: ( 'R' )
            // InternalEtlLexer.g:102:17: 'R'
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

    // $ANTLR start "RULE_DESCRIPTION_SHORT_KEYWORD"
    public final void mRULE_DESCRIPTION_SHORT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DESCRIPTION_SHORT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:104:32: ( ( 'D' | 'd' ) )
            // InternalEtlLexer.g:104:34: ( 'D' | 'd' )
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
            // InternalEtlLexer.g:106:28: ( ( 'C' | 'c' ) )
            // InternalEtlLexer.g:106:30: ( 'C' | 'c' )
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

    // $ANTLR start "RULE_KEYWORD"
    public final void mRULE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:108:14: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // InternalEtlLexer.g:108:16: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // InternalEtlLexer.g:108:16: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='A' && LA28_0<='Z')||(LA28_0>='a' && LA28_0<='z')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEtlLexer.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
            // InternalEtlLexer.g:110:16: ( '<<!' )
            // InternalEtlLexer.g:110:18: '<<!'
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
            // InternalEtlLexer.g:112:16: ( '>>!' )
            // InternalEtlLexer.g:112:18: '>>!'
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
            // InternalEtlLexer.g:114:13: ( '<<' )
            // InternalEtlLexer.g:114:15: '<<'
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
            // InternalEtlLexer.g:116:13: ( '>>' )
            // InternalEtlLexer.g:116:15: '>>'
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
            // InternalEtlLexer.g:118:12: ( '<!' )
            // InternalEtlLexer.g:118:14: '<!'
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
            // InternalEtlLexer.g:120:12: ( '>!' )
            // InternalEtlLexer.g:120:14: '>!'
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
            // InternalEtlLexer.g:122:10: ( '>=' )
            // InternalEtlLexer.g:122:12: '>='
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
            // InternalEtlLexer.g:124:10: ( '<=' )
            // InternalEtlLexer.g:124:12: '<='
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
            // InternalEtlLexer.g:126:24: ( '{{' )
            // InternalEtlLexer.g:126:26: '{{'
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
            // InternalEtlLexer.g:128:25: ( '}}' )
            // InternalEtlLexer.g:128:27: '}}'
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
            // InternalEtlLexer.g:130:28: ( '|' ( options {greedy=false; } : . )* '|' )
            // InternalEtlLexer.g:130:30: '|' ( options {greedy=false; } : . )* '|'
            {
            match('|'); 
            // InternalEtlLexer.g:130:34: ( options {greedy=false; } : . )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='|') ) {
                    alt29=2;
                }
                else if ( ((LA29_0>='\u0000' && LA29_0<='{')||(LA29_0>='}' && LA29_0<='\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalEtlLexer.g:130:62: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop29;
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
            // InternalEtlLexer.g:132:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEtlLexer.g:132:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEtlLexer.g:132:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\"') ) {
                alt32=1;
            }
            else if ( (LA32_0=='\'') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalEtlLexer.g:132:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEtlLexer.g:132:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop30:
                    do {
                        int alt30=3;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0=='\\') ) {
                            alt30=1;
                        }
                        else if ( ((LA30_0>='\u0000' && LA30_0<='!')||(LA30_0>='#' && LA30_0<='[')||(LA30_0>=']' && LA30_0<='\uFFFF')) ) {
                            alt30=2;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalEtlLexer.g:132:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEtlLexer.g:132:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop30;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEtlLexer.g:132:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEtlLexer.g:132:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop31:
                    do {
                        int alt31=3;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0=='\\') ) {
                            alt31=1;
                        }
                        else if ( ((LA31_0>='\u0000' && LA31_0<='&')||(LA31_0>='(' && LA31_0<='[')||(LA31_0>=']' && LA31_0<='\uFFFF')) ) {
                            alt31=2;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalEtlLexer.g:132:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEtlLexer.g:132:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop31;
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
            // InternalEtlLexer.g:134:9: ( '..' )
            // InternalEtlLexer.g:134:11: '..'
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
            // InternalEtlLexer.g:136:12: ( ',' )
            // InternalEtlLexer.g:136:14: ','
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

    // $ANTLR start "RULE_DIGIT_ZERO"
    public final void mRULE_DIGIT_ZERO() throws RecognitionException {
        try {
            int _type = RULE_DIGIT_ZERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:138:17: ( '0' )
            // InternalEtlLexer.g:138:19: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT_ZERO"

    // $ANTLR start "RULE_DIGIT_NONZERO"
    public final void mRULE_DIGIT_NONZERO() throws RecognitionException {
        try {
            int _type = RULE_DIGIT_NONZERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:140:20: ( '1' .. '9' )
            // InternalEtlLexer.g:140:22: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT_NONZERO"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:142:12: ( ':' )
            // InternalEtlLexer.g:142:14: ':'
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
            // InternalEtlLexer.g:144:17: ( '{' )
            // InternalEtlLexer.g:144:19: '{'
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
            // InternalEtlLexer.g:146:18: ( '}' )
            // InternalEtlLexer.g:146:20: '}'
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
            // InternalEtlLexer.g:148:17: ( '(' )
            // InternalEtlLexer.g:148:19: '('
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
            // InternalEtlLexer.g:150:18: ( ')' )
            // InternalEtlLexer.g:150:20: ')'
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
            // InternalEtlLexer.g:152:18: ( '[' )
            // InternalEtlLexer.g:152:20: '['
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
            // InternalEtlLexer.g:154:19: ( ']' )
            // InternalEtlLexer.g:154:21: ']'
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
            // InternalEtlLexer.g:156:11: ( '+' )
            // InternalEtlLexer.g:156:13: '+'
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
            // InternalEtlLexer.g:158:11: ( '-' )
            // InternalEtlLexer.g:158:13: '-'
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

    // $ANTLR start "RULE_CARET"
    public final void mRULE_CARET() throws RecognitionException {
        try {
            int _type = RULE_CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEtlLexer.g:160:12: ( '^' )
            // InternalEtlLexer.g:160:14: '^'
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
            // InternalEtlLexer.g:162:10: ( '.' )
            // InternalEtlLexer.g:162:12: '.'
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
            // InternalEtlLexer.g:164:15: ( '*' )
            // InternalEtlLexer.g:164:17: '*'
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
            // InternalEtlLexer.g:166:12: ( '=' )
            // InternalEtlLexer.g:166:14: '='
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
            // InternalEtlLexer.g:168:16: ( '!=' )
            // InternalEtlLexer.g:168:18: '!='
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
            // InternalEtlLexer.g:170:9: ( '<' )
            // InternalEtlLexer.g:170:11: '<'
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
            // InternalEtlLexer.g:172:9: ( '>' )
            // InternalEtlLexer.g:172:11: '>'
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
            // InternalEtlLexer.g:174:11: ( '#' )
            // InternalEtlLexer.g:174:13: '#'
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
            // InternalEtlLexer.g:176:9: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // InternalEtlLexer.g:176:11: ( ' ' | '\\t' | '\\n' | '\\r' )
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
            // InternalEtlLexer.g:178:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEtlLexer.g:178:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEtlLexer.g:178:24: ( options {greedy=false; } : . )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0=='*') ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1=='/') ) {
                        alt33=2;
                    }
                    else if ( ((LA33_1>='\u0000' && LA33_1<='.')||(LA33_1>='0' && LA33_1<='\uFFFF')) ) {
                        alt33=1;
                    }


                }
                else if ( ((LA33_0>='\u0000' && LA33_0<=')')||(LA33_0>='+' && LA33_0<='\uFFFF')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalEtlLexer.g:178:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop33;
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
            // InternalEtlLexer.g:180:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEtlLexer.g:180:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEtlLexer.g:180:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='\u0000' && LA34_0<='\t')||(LA34_0>='\u000B' && LA34_0<='\f')||(LA34_0>='\u000E' && LA34_0<='\uFFFF')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalEtlLexer.g:180:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop34;
                }
            } while (true);

            // InternalEtlLexer.g:180:40: ( ( '\\r' )? '\\n' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='\n'||LA36_0=='\r') ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalEtlLexer.g:180:41: ( '\\r' )? '\\n'
                    {
                    // InternalEtlLexer.g:180:41: ( '\\r' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0=='\r') ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalEtlLexer.g:180:41: '\\r'
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
        // InternalEtlLexer.g:1:8: ( RULE_DOUBLE_SQUARE_OPEN | RULE_DOUBLE_SQUARE_CLOSE | RULE_TILDE | RULE_ID | RULE_SCG | RULE_TOK | RULE_STR | RULE_INT | RULE_DEC | RULE_EQUIVALENT_TO | RULE_SUBTYPE_OF | RULE_SLOTNAME_STRING | RULE_CASE_SIGNIFICANCE_ID_KEYWORD | RULE_DEFINITION_STATUS_ID_KEYWORD | RULE_DEFINITION_STATUS_TOKEN_KEYWORD | RULE_LANGUAGE_REFSET_ID_KEYWORD | RULE_EFFECTIVE_TIME_KEYWORD | RULE_ACCEPTABLE_IN_KEYWORD | RULE_PREFERRED_IN_KEYWORD | RULE_SEMANTIC_TAG_KEYWORD | RULE_DIALECTID_KEYWORD | RULE_LANGUAGE_KEYWORD | RULE_MODULEID_KEYWORD | RULE_DIALECT_KEYWORD | RULE_ACTIVE_KEYWORD | RULE_TYPEID_KEYWORD | RULE_EXCLUSION_KEYWORD | RULE_EXACT_KEYWORD | RULE_FALSE_KEYWORD | RULE_MATCH_KEYWORD | RULE_REGEX_KEYWORD | RULE_TERM_KEYWORD | RULE_TRUE_KEYWORD | RULE_TYPE_KEYWORD | RULE_WILD_KEYWORD | RULE_CONJUNCTION_KEYWORD | RULE_DISJUNCTION_KEYWORD | RULE_REVERSED | RULE_DESCRIPTION_SHORT_KEYWORD | RULE_CONCEPT_SHORT_KEYWORD | RULE_KEYWORD | RULE_DBL_LT_EM | RULE_DBL_GT_EM | RULE_DBL_LT | RULE_DBL_GT | RULE_LT_EM | RULE_GT_EM | RULE_GTE | RULE_LTE | RULE_DOUBLE_CURLY_OPEN | RULE_DOUBLE_CURLY_CLOSE | RULE_PIPE_DELIMITED_STRING | RULE_STRING | RULE_TO | RULE_COMMA | RULE_DIGIT_ZERO | RULE_DIGIT_NONZERO | RULE_COLON | RULE_CURLY_OPEN | RULE_CURLY_CLOSE | RULE_ROUND_OPEN | RULE_ROUND_CLOSE | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE | RULE_PLUS | RULE_DASH | RULE_CARET | RULE_DOT | RULE_WILDCARD | RULE_EQUAL | RULE_NOT_EQUAL | RULE_LT | RULE_GT | RULE_HASH | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt37=77;
        alt37 = dfa37.predict(input);
        switch (alt37) {
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
                // InternalEtlLexer.g:1:179: RULE_CASE_SIGNIFICANCE_ID_KEYWORD
                {
                mRULE_CASE_SIGNIFICANCE_ID_KEYWORD(); 

                }
                break;
            case 14 :
                // InternalEtlLexer.g:1:213: RULE_DEFINITION_STATUS_ID_KEYWORD
                {
                mRULE_DEFINITION_STATUS_ID_KEYWORD(); 

                }
                break;
            case 15 :
                // InternalEtlLexer.g:1:247: RULE_DEFINITION_STATUS_TOKEN_KEYWORD
                {
                mRULE_DEFINITION_STATUS_TOKEN_KEYWORD(); 

                }
                break;
            case 16 :
                // InternalEtlLexer.g:1:284: RULE_LANGUAGE_REFSET_ID_KEYWORD
                {
                mRULE_LANGUAGE_REFSET_ID_KEYWORD(); 

                }
                break;
            case 17 :
                // InternalEtlLexer.g:1:316: RULE_EFFECTIVE_TIME_KEYWORD
                {
                mRULE_EFFECTIVE_TIME_KEYWORD(); 

                }
                break;
            case 18 :
                // InternalEtlLexer.g:1:344: RULE_ACCEPTABLE_IN_KEYWORD
                {
                mRULE_ACCEPTABLE_IN_KEYWORD(); 

                }
                break;
            case 19 :
                // InternalEtlLexer.g:1:371: RULE_PREFERRED_IN_KEYWORD
                {
                mRULE_PREFERRED_IN_KEYWORD(); 

                }
                break;
            case 20 :
                // InternalEtlLexer.g:1:397: RULE_SEMANTIC_TAG_KEYWORD
                {
                mRULE_SEMANTIC_TAG_KEYWORD(); 

                }
                break;
            case 21 :
                // InternalEtlLexer.g:1:423: RULE_DIALECTID_KEYWORD
                {
                mRULE_DIALECTID_KEYWORD(); 

                }
                break;
            case 22 :
                // InternalEtlLexer.g:1:446: RULE_LANGUAGE_KEYWORD
                {
                mRULE_LANGUAGE_KEYWORD(); 

                }
                break;
            case 23 :
                // InternalEtlLexer.g:1:468: RULE_MODULEID_KEYWORD
                {
                mRULE_MODULEID_KEYWORD(); 

                }
                break;
            case 24 :
                // InternalEtlLexer.g:1:490: RULE_DIALECT_KEYWORD
                {
                mRULE_DIALECT_KEYWORD(); 

                }
                break;
            case 25 :
                // InternalEtlLexer.g:1:511: RULE_ACTIVE_KEYWORD
                {
                mRULE_ACTIVE_KEYWORD(); 

                }
                break;
            case 26 :
                // InternalEtlLexer.g:1:531: RULE_TYPEID_KEYWORD
                {
                mRULE_TYPEID_KEYWORD(); 

                }
                break;
            case 27 :
                // InternalEtlLexer.g:1:551: RULE_EXCLUSION_KEYWORD
                {
                mRULE_EXCLUSION_KEYWORD(); 

                }
                break;
            case 28 :
                // InternalEtlLexer.g:1:574: RULE_EXACT_KEYWORD
                {
                mRULE_EXACT_KEYWORD(); 

                }
                break;
            case 29 :
                // InternalEtlLexer.g:1:593: RULE_FALSE_KEYWORD
                {
                mRULE_FALSE_KEYWORD(); 

                }
                break;
            case 30 :
                // InternalEtlLexer.g:1:612: RULE_MATCH_KEYWORD
                {
                mRULE_MATCH_KEYWORD(); 

                }
                break;
            case 31 :
                // InternalEtlLexer.g:1:631: RULE_REGEX_KEYWORD
                {
                mRULE_REGEX_KEYWORD(); 

                }
                break;
            case 32 :
                // InternalEtlLexer.g:1:650: RULE_TERM_KEYWORD
                {
                mRULE_TERM_KEYWORD(); 

                }
                break;
            case 33 :
                // InternalEtlLexer.g:1:668: RULE_TRUE_KEYWORD
                {
                mRULE_TRUE_KEYWORD(); 

                }
                break;
            case 34 :
                // InternalEtlLexer.g:1:686: RULE_TYPE_KEYWORD
                {
                mRULE_TYPE_KEYWORD(); 

                }
                break;
            case 35 :
                // InternalEtlLexer.g:1:704: RULE_WILD_KEYWORD
                {
                mRULE_WILD_KEYWORD(); 

                }
                break;
            case 36 :
                // InternalEtlLexer.g:1:722: RULE_CONJUNCTION_KEYWORD
                {
                mRULE_CONJUNCTION_KEYWORD(); 

                }
                break;
            case 37 :
                // InternalEtlLexer.g:1:747: RULE_DISJUNCTION_KEYWORD
                {
                mRULE_DISJUNCTION_KEYWORD(); 

                }
                break;
            case 38 :
                // InternalEtlLexer.g:1:772: RULE_REVERSED
                {
                mRULE_REVERSED(); 

                }
                break;
            case 39 :
                // InternalEtlLexer.g:1:786: RULE_DESCRIPTION_SHORT_KEYWORD
                {
                mRULE_DESCRIPTION_SHORT_KEYWORD(); 

                }
                break;
            case 40 :
                // InternalEtlLexer.g:1:817: RULE_CONCEPT_SHORT_KEYWORD
                {
                mRULE_CONCEPT_SHORT_KEYWORD(); 

                }
                break;
            case 41 :
                // InternalEtlLexer.g:1:844: RULE_KEYWORD
                {
                mRULE_KEYWORD(); 

                }
                break;
            case 42 :
                // InternalEtlLexer.g:1:857: RULE_DBL_LT_EM
                {
                mRULE_DBL_LT_EM(); 

                }
                break;
            case 43 :
                // InternalEtlLexer.g:1:872: RULE_DBL_GT_EM
                {
                mRULE_DBL_GT_EM(); 

                }
                break;
            case 44 :
                // InternalEtlLexer.g:1:887: RULE_DBL_LT
                {
                mRULE_DBL_LT(); 

                }
                break;
            case 45 :
                // InternalEtlLexer.g:1:899: RULE_DBL_GT
                {
                mRULE_DBL_GT(); 

                }
                break;
            case 46 :
                // InternalEtlLexer.g:1:911: RULE_LT_EM
                {
                mRULE_LT_EM(); 

                }
                break;
            case 47 :
                // InternalEtlLexer.g:1:922: RULE_GT_EM
                {
                mRULE_GT_EM(); 

                }
                break;
            case 48 :
                // InternalEtlLexer.g:1:933: RULE_GTE
                {
                mRULE_GTE(); 

                }
                break;
            case 49 :
                // InternalEtlLexer.g:1:942: RULE_LTE
                {
                mRULE_LTE(); 

                }
                break;
            case 50 :
                // InternalEtlLexer.g:1:951: RULE_DOUBLE_CURLY_OPEN
                {
                mRULE_DOUBLE_CURLY_OPEN(); 

                }
                break;
            case 51 :
                // InternalEtlLexer.g:1:974: RULE_DOUBLE_CURLY_CLOSE
                {
                mRULE_DOUBLE_CURLY_CLOSE(); 

                }
                break;
            case 52 :
                // InternalEtlLexer.g:1:998: RULE_PIPE_DELIMITED_STRING
                {
                mRULE_PIPE_DELIMITED_STRING(); 

                }
                break;
            case 53 :
                // InternalEtlLexer.g:1:1025: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 54 :
                // InternalEtlLexer.g:1:1037: RULE_TO
                {
                mRULE_TO(); 

                }
                break;
            case 55 :
                // InternalEtlLexer.g:1:1045: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 56 :
                // InternalEtlLexer.g:1:1056: RULE_DIGIT_ZERO
                {
                mRULE_DIGIT_ZERO(); 

                }
                break;
            case 57 :
                // InternalEtlLexer.g:1:1072: RULE_DIGIT_NONZERO
                {
                mRULE_DIGIT_NONZERO(); 

                }
                break;
            case 58 :
                // InternalEtlLexer.g:1:1091: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 59 :
                // InternalEtlLexer.g:1:1102: RULE_CURLY_OPEN
                {
                mRULE_CURLY_OPEN(); 

                }
                break;
            case 60 :
                // InternalEtlLexer.g:1:1118: RULE_CURLY_CLOSE
                {
                mRULE_CURLY_CLOSE(); 

                }
                break;
            case 61 :
                // InternalEtlLexer.g:1:1135: RULE_ROUND_OPEN
                {
                mRULE_ROUND_OPEN(); 

                }
                break;
            case 62 :
                // InternalEtlLexer.g:1:1151: RULE_ROUND_CLOSE
                {
                mRULE_ROUND_CLOSE(); 

                }
                break;
            case 63 :
                // InternalEtlLexer.g:1:1168: RULE_SQUARE_OPEN
                {
                mRULE_SQUARE_OPEN(); 

                }
                break;
            case 64 :
                // InternalEtlLexer.g:1:1185: RULE_SQUARE_CLOSE
                {
                mRULE_SQUARE_CLOSE(); 

                }
                break;
            case 65 :
                // InternalEtlLexer.g:1:1203: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 66 :
                // InternalEtlLexer.g:1:1213: RULE_DASH
                {
                mRULE_DASH(); 

                }
                break;
            case 67 :
                // InternalEtlLexer.g:1:1223: RULE_CARET
                {
                mRULE_CARET(); 

                }
                break;
            case 68 :
                // InternalEtlLexer.g:1:1234: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 69 :
                // InternalEtlLexer.g:1:1243: RULE_WILDCARD
                {
                mRULE_WILDCARD(); 

                }
                break;
            case 70 :
                // InternalEtlLexer.g:1:1257: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 71 :
                // InternalEtlLexer.g:1:1268: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 72 :
                // InternalEtlLexer.g:1:1283: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 73 :
                // InternalEtlLexer.g:1:1291: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 74 :
                // InternalEtlLexer.g:1:1299: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 75 :
                // InternalEtlLexer.g:1:1309: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 76 :
                // InternalEtlLexer.g:1:1317: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 77 :
                // InternalEtlLexer.g:1:1333: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
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
    protected DFA37 dfa37 = new DFA37(this);
    static final String DFA3_eotS =
        "\24\uffff";
    static final String DFA3_eofS =
        "\24\uffff";
    static final String DFA3_minS =
        "\1\103\1\101\1\uffff\1\123\1\105\1\123\1\111\1\107\1\116\1\111\1\106\1\111\1\103\1\101\1\116\1\103\1\105\1\111\1\104\1\uffff";
    static final String DFA3_maxS =
        "\1\143\1\141\1\uffff\1\163\1\145\1\163\1\151\1\147\1\156\1\151\1\146\1\151\1\143\1\141\1\156\1\143\1\145\1\151\1\144\1\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\20\uffff\1\1";
    static final String DFA3_specialS =
        "\24\uffff}>";
    static final String[] DFA3_transitionS = DFA3_transitionS_.DFA3_transitionS;
    private static final class DFA3_transitionS_ {
        static final String[] DFA3_transitionS = {
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "52:37: ( 'caseSignificanceId' | ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )";
        }
    }
    static final String DFA4_eotS =
        "\24\uffff";
    static final String DFA4_eofS =
        "\24\uffff";
    static final String DFA4_minS =
        "\1\104\1\105\1\uffff\1\106\1\111\1\116\1\111\1\124\1\111\1\117\1\116\1\123\1\124\1\101\1\124\1\125\1\123\1\111\1\104\1\uffff";
    static final String DFA4_maxS =
        "\1\144\1\145\1\uffff\1\146\1\151\1\156\1\151\1\164\1\151\1\157\1\156\1\163\1\164\1\141\1\164\1\165\1\163\1\151\1\144\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\20\uffff\1\1";
    static final String DFA4_specialS =
        "\24\uffff}>";
    static final String[] DFA4_transitionS = {
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
            return "54:37: ( 'definitionStatusId' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' ) )";
        }
    }
    static final String DFA5_eotS =
        "\22\uffff";
    static final String DFA5_eofS =
        "\22\uffff";
    static final String DFA5_minS =
        "\1\104\1\105\1\uffff\1\106\1\111\1\116\1\111\1\124\1\111\1\117\1\116\1\123\1\124\1\101\1\124\1\125\1\123\1\uffff";
    static final String DFA5_maxS =
        "\1\144\1\145\1\uffff\1\146\1\151\1\156\1\151\1\164\1\151\1\157\1\156\1\163\1\164\1\141\1\164\1\165\1\163\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\16\uffff\1\1";
    static final String DFA5_specialS =
        "\22\uffff}>";
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
            return "56:40: ( 'definitionStatus' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) )";
        }
    }
    static final String DFA6_eotS =
        "\22\uffff";
    static final String DFA6_eofS =
        "\22\uffff";
    static final String DFA6_minS =
        "\1\114\1\101\1\uffff\1\116\1\107\1\125\1\101\1\107\1\105\1\122\1\105\1\106\1\123\1\105\1\124\1\111\1\104\1\uffff";
    static final String DFA6_maxS =
        "\1\154\1\141\1\uffff\1\156\1\147\1\165\1\141\1\147\1\145\1\162\1\145\1\146\1\163\1\145\1\164\1\151\1\144\1\uffff";
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
            return "58:35: ( 'languageRefsetId' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )";
        }
    }
    static final String DFA7_eotS =
        "\17\uffff";
    static final String DFA7_eofS =
        "\17\uffff";
    static final String DFA7_minS =
        "\1\105\1\106\1\uffff\1\106\1\105\1\103\1\124\1\111\1\126\1\105\1\124\1\111\1\115\1\105\1\uffff";
    static final String DFA7_maxS =
        "\1\145\1\146\1\uffff\1\146\1\145\1\143\1\164\1\151\1\166\1\145\1\164\1\151\1\155\1\145\1\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\13\uffff\1\1";
    static final String DFA7_specialS =
        "\17\uffff}>";
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
            "\1\2\37\uffff\1\12",
            "\1\13\37\uffff\1\2",
            "\1\2\37\uffff\1\14",
            "\1\2\37\uffff\1\15",
            "\1\2\37\uffff\1\16",
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
            return "60:31: ( 'effectiveTime' | ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )";
        }
    }
    static final String DFA8_eotS =
        "\16\uffff";
    static final String DFA8_eofS =
        "\16\uffff";
    static final String DFA8_minS =
        "\1\101\1\103\1\uffff\1\103\1\105\1\120\1\124\1\101\1\102\1\114\1\105\1\111\1\116\1\uffff";
    static final String DFA8_maxS =
        "\1\141\1\143\1\uffff\1\143\1\145\1\160\1\164\1\141\1\142\1\154\1\145\1\151\1\156\1\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\12\uffff\1\1";
    static final String DFA8_specialS =
        "\16\uffff}>";
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
            "\1\2\37\uffff\1\13",
            "\1\14\37\uffff\1\2",
            "\1\2\37\uffff\1\15",
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
            return "62:30: ( 'acceptableIn' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )";
        }
    }
    static final String DFA9_eotS =
        "\15\uffff";
    static final String DFA9_eofS =
        "\15\uffff";
    static final String DFA9_minS =
        "\1\120\1\122\1\uffff\1\105\1\106\1\105\2\122\1\105\1\104\1\111\1\116\1\uffff";
    static final String DFA9_maxS =
        "\1\160\1\162\1\uffff\1\145\1\146\1\145\2\162\1\145\1\144\1\151\1\156\1\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\11\uffff\1\1";
    static final String DFA9_specialS =
        "\15\uffff}>";
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
            "\1\13\37\uffff\1\2",
            "\1\2\37\uffff\1\14",
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
            return "64:29: ( 'preferredIn' | ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )";
        }
    }
    static final String DFA10_eotS =
        "\15\uffff";
    static final String DFA10_eofS =
        "\15\uffff";
    static final String DFA10_minS =
        "\1\123\1\105\1\uffff\1\115\1\101\1\116\1\124\1\111\1\103\1\124\1\101\1\107\1\uffff";
    static final String DFA10_maxS =
        "\1\163\1\145\1\uffff\1\155\1\141\1\156\1\164\1\151\1\143\1\164\1\141\1\147\1\uffff";
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
            "\1\12\37\uffff\1\2",
            "\1\2\37\uffff\1\13",
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
            return "66:29: ( 'semanticTag' | ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' ) )";
        }
    }
    static final String DFA11_eotS =
        "\13\uffff";
    static final String DFA11_eofS =
        "\13\uffff";
    static final String DFA11_minS =
        "\1\104\1\111\1\uffff\1\101\1\114\1\105\1\103\1\124\1\111\1\104\1\uffff";
    static final String DFA11_maxS =
        "\1\144\1\151\1\uffff\1\141\1\154\1\145\1\143\1\164\1\151\1\144\1\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\7\uffff\1\1";
    static final String DFA11_specialS =
        "\13\uffff}>";
    static final String[] DFA11_transitionS = {
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
            return "68:26: ( 'dialectId' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )";
        }
    }
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\12\uffff";
    static final String DFA12_minS =
        "\1\114\1\101\1\uffff\1\116\1\107\1\125\1\101\1\107\1\105\1\uffff";
    static final String DFA12_maxS =
        "\1\154\1\141\1\uffff\1\156\1\147\1\165\1\141\1\147\1\145\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\6\uffff\1\1";
    static final String DFA12_specialS =
        "\12\uffff}>";
    static final String[] DFA12_transitionS = {
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
            return "70:25: ( 'language' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )";
        }
    }
    static final String DFA13_eotS =
        "\12\uffff";
    static final String DFA13_eofS =
        "\12\uffff";
    static final String DFA13_minS =
        "\1\115\1\117\1\uffff\1\104\1\125\1\114\1\105\1\111\1\104\1\uffff";
    static final String DFA13_maxS =
        "\1\155\1\157\1\uffff\1\144\1\165\1\154\1\145\1\151\1\144\1\uffff";
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
            "\1\10\37\uffff\1\2",
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
            return "72:25: ( 'moduleId' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )";
        }
    }
    static final String DFA37_eotS =
        "\1\uffff\1\70\1\72\1\uffff\3\42\1\114\1\116\1\122\1\uffff\2\125\1\114\17\42\1\154\4\42\1\uffff\1\164\1\166\1\170\2\uffff\1\172\22\uffff\1\175\20\42\3\uffff\1\u0091\3\uffff\2\42\1\uffff\26\42\1\uffff\2\42\2\u00ae\1\u00b0\14\uffff\1\u00b1\1\u00b2\1\u00b3\2\42\1\u00b6\6\42\1\u00bd\4\42\3\uffff\14\42\2\u00ce\16\42\6\uffff\2\42\1\uffff\2\u00e1\2\u00e2\2\u00e3\1\uffff\20\42\1\uffff\14\42\2\u0100\4\42\3\uffff\12\42\2\u010f\10\42\1\u0118\2\u0119\1\u0118\2\u011a\2\u011b\1\uffff\2\42\2\u011e\12\42\1\uffff\2\42\2\u012b\4\42\4\uffff\2\42\1\uffff\2\42\2\u0136\10\42\1\uffff\12\42\1\uffff\2\42\2\u014d\6\42\2\u0154\4\42\2\u0159\4\42\1\uffff\6\42\1\uffff\4\42\1\uffff\12\42\2\u0172\12\42\2\u017d\1\uffff\10\42\2\u0186\1\uffff\6\42\2\u018d\1\uffff\6\42\1\uffff\6\42\2\u019c\2\42\2\u019f\2\42\1\uffff\2\42\1\uffff\2\u01a4\2\u01a5\2\uffff";
    static final String DFA37_eofS =
        "\u01a6\uffff";
    static final String DFA37_minS =
        "\1\11\1\133\1\135\1\uffff\1\144\2\105\1\101\1\75\1\41\1\uffff\5\101\2\106\2\103\2\122\1\105\2\101\1\105\2\101\1\105\1\101\2\111\2\122\1\uffff\1\41\1\173\1\175\2\uffff\1\56\15\uffff\1\52\4\uffff\1\101\1\164\1\147\1\162\2\115\1\153\2\120\2\122\2\125\2\106\2\101\3\uffff\1\41\3\uffff\2\123\1\uffff\2\116\2\106\2\101\2\103\2\104\2\105\2\104\1\116\2\124\1\116\2\114\2\107\1\uffff\2\114\2\101\1\41\14\uffff\6\101\2\105\2\115\2\105\1\101\2\111\2\114\3\uffff\2\105\2\107\2\105\2\103\2\105\2\111\2\101\2\106\3\125\2\103\1\125\2\123\2\105\2\104\6\uffff\2\116\1\uffff\6\101\1\uffff\2\116\2\105\2\123\2\125\2\103\2\124\2\120\2\126\1\uffff\2\105\2\114\1\123\2\110\1\123\2\105\2\130\2\101\2\124\2\104\3\uffff\2\111\2\103\2\111\2\101\2\124\2\101\2\124\2\105\2\122\2\105\10\101\1\uffff\2\111\2\101\4\124\4\107\2\111\1\uffff\4\101\2\122\2\111\4\uffff\2\103\1\uffff\2\111\2\101\2\116\2\105\2\126\2\102\1\uffff\2\105\2\104\2\124\2\117\2\104\1\uffff\2\111\2\101\2\105\2\114\2\104\4\101\2\116\2\101\2\106\2\105\1\uffff\2\124\2\105\2\111\1\uffff\2\107\2\123\1\uffff\2\111\2\106\4\111\2\116\2\101\2\124\2\103\2\123\2\115\2\116\2\101\1\uffff\4\101\4\105\2\101\1\uffff\2\124\2\116\2\124\2\101\1\uffff\2\125\2\103\2\111\1\uffff\2\123\2\105\2\104\2\101\2\111\2\101\2\104\1\uffff\2\104\1\uffff\4\101\2\uffff";
    static final String DFA37_maxS =
        "\1\176\1\133\1\135\1\uffff\1\156\1\164\1\171\1\172\2\75\1\uffff\3\172\2\141\2\170\2\156\2\162\1\145\2\157\1\171\2\141\1\145\1\172\2\151\2\162\1\uffff\1\76\1\173\1\175\2\uffff\1\56\15\uffff\1\57\4\uffff\1\172\1\164\1\147\1\162\2\155\1\153\2\160\2\162\2\165\2\146\2\141\3\uffff\1\74\3\uffff\2\163\1\uffff\2\156\2\146\2\141\2\164\2\144\2\145\2\144\1\156\2\164\1\156\2\154\2\147\1\uffff\2\154\2\172\1\41\14\uffff\3\172\2\141\1\172\2\145\2\155\2\145\1\172\2\151\2\154\3\uffff\2\145\2\147\2\145\2\143\2\145\2\151\2\172\2\146\3\165\2\143\1\165\2\163\2\145\2\144\6\uffff\2\156\1\uffff\6\172\1\uffff\2\156\2\145\2\163\2\165\2\143\2\164\2\160\2\166\1\uffff\2\145\2\154\1\163\2\150\1\163\2\145\2\170\2\172\2\164\2\144\3\uffff\2\151\2\143\2\151\2\141\2\164\2\172\2\164\2\145\2\162\2\145\10\172\1\uffff\2\151\2\172\4\164\4\147\2\151\1\uffff\2\141\2\172\2\162\2\151\4\uffff\2\143\1\uffff\2\151\2\172\2\156\2\145\2\166\2\142\1\uffff\2\145\2\144\2\164\2\157\2\144\1\uffff\2\151\2\172\2\145\2\154\2\144\2\172\2\141\2\156\2\172\2\146\2\145\1\uffff\2\164\2\145\2\151\1\uffff\2\147\2\163\1\uffff\2\151\2\146\4\151\2\156\2\172\2\164\2\143\2\163\2\155\2\156\2\172\1\uffff\4\141\4\145\2\172\1\uffff\2\164\2\156\2\164\2\172\1\uffff\2\165\2\143\2\151\1\uffff\2\163\2\145\2\144\2\172\2\151\2\172\2\144\1\uffff\2\144\1\uffff\4\172\2\uffff";
    static final String DFA37_acceptS =
        "\3\uffff\1\3\6\uffff\1\14\27\uffff\1\51\3\uffff\1\64\1\65\1\uffff\1\67\1\70\1\71\1\72\1\75\1\76\1\101\1\102\1\103\1\105\1\107\1\112\1\113\1\uffff\1\1\1\77\1\2\1\100\21\uffff\1\47\1\12\1\106\1\uffff\1\56\1\61\1\110\2\uffff\1\50\26\uffff\1\46\5\uffff\1\57\1\60\1\111\1\62\1\73\1\63\1\74\1\66\1\104\1\114\1\115\1\4\21\uffff\1\13\1\52\1\54\34\uffff\1\45\1\53\1\55\1\10\1\5\1\7\2\uffff\1\6\6\uffff\1\11\20\uffff\1\44\22\uffff\1\42\1\40\1\41\34\uffff\1\43\16\uffff\1\34\10\uffff\1\33\1\36\1\35\1\37\2\uffff\1\32\14\uffff\1\31\12\uffff\1\30\26\uffff\1\26\6\uffff\1\27\4\uffff\1\25\30\uffff\1\24\12\uffff\1\23\10\uffff\1\22\6\uffff\1\21\16\uffff\1\17\2\uffff\1\20\4\uffff\1\16\1\15";
    static final String DFA37_specialS =
        "\u01a6\uffff}>";
    static final String[] DFA37_transitionS = {
            "\2\65\2\uffff\1\65\22\uffff\1\65\1\63\1\47\1\64\3\uffff\1\47\1\55\1\56\1\62\1\57\1\51\1\60\1\50\1\66\1\52\11\53\1\54\1\uffff\1\11\1\10\1\43\1\uffff\1\12\1\23\1\42\1\14\1\15\1\21\1\33\5\42\1\17\1\30\1\42\1\40\1\25\1\42\1\35\1\26\1\31\2\42\1\37\3\42\1\1\1\uffff\1\2\1\61\2\uffff\1\22\1\42\1\13\1\7\1\20\1\32\2\42\1\4\2\42\1\16\1\27\1\42\1\41\1\24\1\42\1\34\1\5\1\6\2\42\1\36\3\42\1\44\1\46\1\45\1\3",
            "\1\67",
            "\1\71",
            "",
            "\1\73\11\uffff\1\74",
            "\1\100\35\uffff\1\75\1\uffff\1\77\16\uffff\1\76",
            "\1\105\14\uffff\1\107\6\uffff\1\103\13\uffff\1\104\11\uffff\1\101\2\uffff\1\106\6\uffff\1\102",
            "\4\42\1\111\3\42\1\113\21\42\6\uffff\4\42\1\110\3\42\1\112\21\42",
            "\1\115",
            "\1\120\32\uffff\1\117\1\121",
            "",
            "\1\124\31\42\6\uffff\1\123\31\42",
            "\1\124\31\42\6\uffff\1\124\31\42",
            "\4\42\1\111\3\42\1\113\21\42\6\uffff\4\42\1\111\3\42\1\113\21\42",
            "\1\127\37\uffff\1\126",
            "\1\127\37\uffff\1\127",
            "\1\131\21\uffff\1\133\15\uffff\1\130\21\uffff\1\132",
            "\1\131\21\uffff\1\133\15\uffff\1\131\21\uffff\1\133",
            "\1\135\12\uffff\1\136\24\uffff\1\134\12\uffff\1\136",
            "\1\135\12\uffff\1\137\24\uffff\1\135\12\uffff\1\136",
            "\1\141\37\uffff\1\140",
            "\1\141\37\uffff\1\141",
            "\1\100\37\uffff\1\100",
            "\1\146\7\uffff\1\144\5\uffff\1\143\21\uffff\1\145\7\uffff\1\144\5\uffff\1\142",
            "\1\146\7\uffff\1\147\5\uffff\1\143\21\uffff\1\146\7\uffff\1\144\5\uffff\1\143",
            "\1\105\14\uffff\1\107\6\uffff\1\103\13\uffff\1\105\14\uffff\1\107\6\uffff\1\103",
            "\1\151\37\uffff\1\150",
            "\1\151\37\uffff\1\151",
            "\1\153\37\uffff\1\152",
            "\4\42\1\153\25\42\6\uffff\4\42\1\153\25\42",
            "\1\156\37\uffff\1\155",
            "\1\156\37\uffff\1\156",
            "\1\157\37\uffff\1\160",
            "\1\160\37\uffff\1\160",
            "",
            "\1\162\33\uffff\1\163\1\161",
            "\1\165",
            "\1\167",
            "",
            "",
            "\1\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\173\4\uffff\1\174",
            "",
            "",
            "",
            "",
            "\32\42\6\uffff\32\42",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0082\37\uffff\1\u0081",
            "\1\u0082\37\uffff\1\u0082",
            "\1\u0083",
            "\1\u0085\37\uffff\1\u0084",
            "\1\u0085\37\uffff\1\u0085",
            "\1\u0087\37\uffff\1\u0086",
            "\1\u0087\37\uffff\1\u0087",
            "\1\u0089\37\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008c\34\uffff\1\u008a\2\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008e\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "",
            "",
            "",
            "\1\u0090\32\uffff\1\u008f",
            "",
            "",
            "",
            "\1\u0093\37\uffff\1\u0092",
            "\1\u0093\37\uffff\1\u0093",
            "",
            "\1\u0095\37\uffff\1\u0094",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0097\37\uffff\1\u0096",
            "\1\u0097\37\uffff\1\u0097",
            "\1\u0099\37\uffff\1\u0098",
            "\1\u0099\37\uffff\1\u0099",
            "\1\u009b\20\uffff\1\u009d\16\uffff\1\u009a\20\uffff\1\u009c",
            "\1\u009b\20\uffff\1\u009d\16\uffff\1\u009b\20\uffff\1\u009d",
            "\1\u009e\37\uffff\1\u009e",
            "\1\u009f\37\uffff\1\u009e",
            "\1\u00a1\37\uffff\1\u00a0",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a3\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a4\37\uffff\1\u00a4",
            "\1\u00a6\37\uffff\1\u00a5",
            "\1\u00a6\37\uffff\1\u00a6",
            "\1\u00a7\37\uffff\1\u00a4",
            "\1\u00a9\37\uffff\1\u00a8",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00ab\37\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "",
            "\1\u00ad\37\uffff\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\1\u00af",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\1\u00b5\37\uffff\1\u00b4",
            "\1\u00b5\37\uffff\1\u00b5",
            "\32\42\6\uffff\32\42",
            "\1\u00b8\37\uffff\1\u00b7",
            "\1\u00b8\37\uffff\1\u00b8",
            "\1\u00ba\37\uffff\1\u00b9",
            "\1\u00ba\37\uffff\1\u00ba",
            "\1\u00bc\37\uffff\1\u00bb",
            "\1\u00bc\37\uffff\1\u00bc",
            "\32\42\6\uffff\32\42",
            "\1\u00bf\37\uffff\1\u00be",
            "\1\u00bf\37\uffff\1\u00bf",
            "\1\u00c1\37\uffff\1\u00c0",
            "\1\u00c1\37\uffff\1\u00c1",
            "",
            "",
            "",
            "\1\u00c3\37\uffff\1\u00c2",
            "\1\u00c3\37\uffff\1\u00c3",
            "\1\u00c5\37\uffff\1\u00c4",
            "\1\u00c5\37\uffff\1\u00c5",
            "\1\u00c7\37\uffff\1\u00c6",
            "\1\u00c7\37\uffff\1\u00c7",
            "\1\u00c9\37\uffff\1\u00c8",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00cb\37\uffff\1\u00ca",
            "\1\u00cb\37\uffff\1\u00cb",
            "\1\u00cd\37\uffff\1\u00cc",
            "\1\u00cd\37\uffff\1\u00cd",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\1\u00d0\37\uffff\1\u00cf",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d2\37\uffff\1\u00d1",
            "\1\u00d2\37\uffff\1\u00d2",
            "\1\u00d3\37\uffff\1\u00d3",
            "\1\u00d5\37\uffff\1\u00d4",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d6\37\uffff\1\u00d3",
            "\1\u00d8\37\uffff\1\u00d7",
            "\1\u00d8\37\uffff\1\u00d8",
            "\1\u00da\37\uffff\1\u00d9",
            "\1\u00da\37\uffff\1\u00da",
            "\1\u00dc\37\uffff\1\u00db",
            "\1\u00dc\37\uffff\1\u00dc",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00de\37\uffff\1\u00dd",
            "\1\u00de\37\uffff\1\u00de",
            "",
            "\10\42\1\u00df\21\42\6\uffff\10\42\1\u00e0\21\42",
            "\10\42\1\u00e0\21\42\6\uffff\10\42\1\u00e0\21\42",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "",
            "\1\u00e5\37\uffff\1\u00e4",
            "\1\u00e5\37\uffff\1\u00e5",
            "\1\u00e7\37\uffff\1\u00e6",
            "\1\u00e7\37\uffff\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e9",
            "\1\u00e9\37\uffff\1\u00e9",
            "\1\u00eb\37\uffff\1\u00ea",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ed\37\uffff\1\u00ec",
            "\1\u00ed\37\uffff\1\u00ed",
            "\1\u00ef\37\uffff\1\u00ee",
            "\1\u00ef\37\uffff\1\u00ef",
            "\1\u00f1\37\uffff\1\u00f0",
            "\1\u00f1\37\uffff\1\u00f1",
            "\1\u00f3\37\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f3",
            "",
            "\1\u00f5\37\uffff\1\u00f4",
            "\1\u00f5\37\uffff\1\u00f5",
            "\1\u00f7\37\uffff\1\u00f6",
            "\1\u00f7\37\uffff\1\u00f7",
            "\1\u00f8\37\uffff\1\u00f8",
            "\1\u00fa\37\uffff\1\u00f9",
            "\1\u00fa\37\uffff\1\u00fa",
            "\1\u00fb\37\uffff\1\u00f8",
            "\1\u00fd\37\uffff\1\u00fc",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00ff\37\uffff\1\u00fe",
            "\1\u00ff\37\uffff\1\u00ff",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\1\u0102\37\uffff\1\u0101",
            "\1\u0102\37\uffff\1\u0102",
            "\1\u0104\37\uffff\1\u0103",
            "\1\u0104\37\uffff\1\u0104",
            "",
            "",
            "",
            "\1\u0106\37\uffff\1\u0105",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0108\37\uffff\1\u0107",
            "\1\u0108\37\uffff\1\u0108",
            "\1\u010a\37\uffff\1\u0109",
            "\1\u010a\37\uffff\1\u010a",
            "\1\u010c\37\uffff\1\u010b",
            "\1\u010c\37\uffff\1\u010c",
            "\1\u010e\37\uffff\1\u010d",
            "\1\u010e\37\uffff\1\u010e",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\1\u0111\37\uffff\1\u0110",
            "\1\u0111\37\uffff\1\u0111",
            "\1\u0113\37\uffff\1\u0112",
            "\1\u0113\37\uffff\1\u0113",
            "\1\u0115\37\uffff\1\u0114",
            "\1\u0115\37\uffff\1\u0115",
            "\1\u0117\37\uffff\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "",
            "\1\u011d\37\uffff\1\u011c",
            "\1\u011d\37\uffff\1\u011d",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\1\u0120\37\uffff\1\u011f",
            "\1\u0120\37\uffff\1\u0120",
            "\1\u0122\37\uffff\1\u0121",
            "\1\u0122\37\uffff\1\u0122",
            "\1\u0124\37\uffff\1\u0123",
            "\1\u0124\37\uffff\1\u0124",
            "\1\u0126\37\uffff\1\u0125",
            "\1\u0126\37\uffff\1\u0126",
            "\1\u0128\37\uffff\1\u0127",
            "\1\u0128\37\uffff\1\u0128",
            "",
            "\1\u012a\37\uffff\1\u0129",
            "\1\u012a\37\uffff\1\u012a",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\1\u012d\37\uffff\1\u012c",
            "\1\u012d\37\uffff\1\u012d",
            "\1\u012e\37\uffff\1\u012f",
            "\1\u012f\37\uffff\1\u012f",
            "",
            "",
            "",
            "",
            "\1\u0131\37\uffff\1\u0130",
            "\1\u0131\37\uffff\1\u0131",
            "",
            "\1\u0133\37\uffff\1\u0132",
            "\1\u0133\37\uffff\1\u0133",
            "\10\42\1\u0134\21\42\6\uffff\10\42\1\u0135\21\42",
            "\10\42\1\u0135\21\42\6\uffff\10\42\1\u0135\21\42",
            "\1\u0138\37\uffff\1\u0137",
            "\1\u0138\37\uffff\1\u0138",
            "\1\u013a\37\uffff\1\u0139",
            "\1\u013a\37\uffff\1\u013a",
            "\1\u013c\37\uffff\1\u013b",
            "\1\u013c\37\uffff\1\u013c",
            "\1\u013e\37\uffff\1\u013d",
            "\1\u013e\37\uffff\1\u013e",
            "",
            "\1\u0140\37\uffff\1\u013f",
            "\1\u0140\37\uffff\1\u0140",
            "\1\u0142\37\uffff\1\u0141",
            "\1\u0142\37\uffff\1\u0142",
            "\1\u0143\37\uffff\1\u0144",
            "\1\u0144\37\uffff\1\u0144",
            "\1\u0146\37\uffff\1\u0145",
            "\1\u0146\37\uffff\1\u0146",
            "\1\u0148\37\uffff\1\u0147",
            "\1\u0148\37\uffff\1\u0148",
            "",
            "\1\u014a\37\uffff\1\u0149",
            "\1\u014a\37\uffff\1\u014a",
            "\21\42\1\u014b\10\42\6\uffff\21\42\1\u014c\10\42",
            "\21\42\1\u014c\10\42\6\uffff\21\42\1\u014c\10\42",
            "\1\u014f\37\uffff\1\u014e",
            "\1\u014f\37\uffff\1\u014f",
            "\1\u0151\37\uffff\1\u0150",
            "\1\u0151\37\uffff\1\u0151",
            "\1\u0153\37\uffff\1\u0152",
            "\1\u0153\37\uffff\1\u0153",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\1\u0156\37\uffff\1\u0155",
            "\1\u0156\37\uffff\1\u0156",
            "\1\u0158\37\uffff\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\1\u015b\37\uffff\1\u015a",
            "\1\u015b\37\uffff\1\u015b",
            "\1\u015d\37\uffff\1\u015c",
            "\1\u015d\37\uffff\1\u015d",
            "",
            "\1\u015e\37\uffff\1\u015f",
            "\1\u015f\37\uffff\1\u015f",
            "\1\u0161\37\uffff\1\u0160",
            "\1\u0161\37\uffff\1\u0161",
            "\1\u0162\37\uffff\1\u0163",
            "\1\u0163\37\uffff\1\u0163",
            "",
            "\1\u0165\37\uffff\1\u0164",
            "\1\u0165\37\uffff\1\u0165",
            "\1\u0166\37\uffff\1\u0167",
            "\1\u0167\37\uffff\1\u0167",
            "",
            "\1\u0169\37\uffff\1\u0168",
            "\1\u0169\37\uffff\1\u0169",
            "\1\u016b\37\uffff\1\u016a",
            "\1\u016b\37\uffff\1\u016b",
            "\1\u016d\37\uffff\1\u016c",
            "\1\u016d\37\uffff\1\u016d",
            "\1\u016e\37\uffff\1\u016f",
            "\1\u016f\37\uffff\1\u016f",
            "\1\u0171\37\uffff\1\u0170",
            "\1\u0171\37\uffff\1\u0171",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\1\u0174\37\uffff\1\u0173",
            "\1\u0174\37\uffff\1\u0174",
            "\1\u0176\37\uffff\1\u0175",
            "\1\u0176\37\uffff\1\u0176",
            "\1\u0178\37\uffff\1\u0177",
            "\1\u0178\37\uffff\1\u0178",
            "\1\u017a\37\uffff\1\u0179",
            "\1\u017a\37\uffff\1\u017a",
            "\1\u017c\37\uffff\1\u017b",
            "\1\u017c\37\uffff\1\u017c",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "",
            "\1\u017f\37\uffff\1\u017e",
            "\1\u017f\37\uffff\1\u017f",
            "\1\u0181\37\uffff\1\u0180",
            "\1\u0181\37\uffff\1\u0181",
            "\1\u0183\37\uffff\1\u0182",
            "\1\u0183\37\uffff\1\u0183",
            "\1\u0185\37\uffff\1\u0184",
            "\1\u0185\37\uffff\1\u0185",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "",
            "\1\u0188\37\uffff\1\u0187",
            "\1\u0188\37\uffff\1\u0188",
            "\1\u018a\37\uffff\1\u0189",
            "\1\u018a\37\uffff\1\u018a",
            "\1\u018c\37\uffff\1\u018b",
            "\1\u018c\37\uffff\1\u018c",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "",
            "\1\u018f\37\uffff\1\u018e",
            "\1\u018f\37\uffff\1\u018f",
            "\1\u0191\37\uffff\1\u0190",
            "\1\u0191\37\uffff\1\u0191",
            "\1\u0192\37\uffff\1\u0193",
            "\1\u0193\37\uffff\1\u0193",
            "",
            "\1\u0195\37\uffff\1\u0194",
            "\1\u0195\37\uffff\1\u0195",
            "\1\u0197\37\uffff\1\u0196",
            "\1\u0197\37\uffff\1\u0197",
            "\1\u0199\37\uffff\1\u0198",
            "\1\u0199\37\uffff\1\u0199",
            "\10\42\1\u019a\21\42\6\uffff\10\42\1\u019b\21\42",
            "\10\42\1\u019b\21\42\6\uffff\10\42\1\u019b\21\42",
            "\1\u019d\37\uffff\1\u019e",
            "\1\u019e\37\uffff\1\u019e",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\1\u01a1\37\uffff\1\u01a0",
            "\1\u01a1\37\uffff\1\u01a1",
            "",
            "\1\u01a3\37\uffff\1\u01a2",
            "\1\u01a3\37\uffff\1\u01a3",
            "",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "\32\42\6\uffff\32\42",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_DOUBLE_SQUARE_OPEN | RULE_DOUBLE_SQUARE_CLOSE | RULE_TILDE | RULE_ID | RULE_SCG | RULE_TOK | RULE_STR | RULE_INT | RULE_DEC | RULE_EQUIVALENT_TO | RULE_SUBTYPE_OF | RULE_SLOTNAME_STRING | RULE_CASE_SIGNIFICANCE_ID_KEYWORD | RULE_DEFINITION_STATUS_ID_KEYWORD | RULE_DEFINITION_STATUS_TOKEN_KEYWORD | RULE_LANGUAGE_REFSET_ID_KEYWORD | RULE_EFFECTIVE_TIME_KEYWORD | RULE_ACCEPTABLE_IN_KEYWORD | RULE_PREFERRED_IN_KEYWORD | RULE_SEMANTIC_TAG_KEYWORD | RULE_DIALECTID_KEYWORD | RULE_LANGUAGE_KEYWORD | RULE_MODULEID_KEYWORD | RULE_DIALECT_KEYWORD | RULE_ACTIVE_KEYWORD | RULE_TYPEID_KEYWORD | RULE_EXCLUSION_KEYWORD | RULE_EXACT_KEYWORD | RULE_FALSE_KEYWORD | RULE_MATCH_KEYWORD | RULE_REGEX_KEYWORD | RULE_TERM_KEYWORD | RULE_TRUE_KEYWORD | RULE_TYPE_KEYWORD | RULE_WILD_KEYWORD | RULE_CONJUNCTION_KEYWORD | RULE_DISJUNCTION_KEYWORD | RULE_REVERSED | RULE_DESCRIPTION_SHORT_KEYWORD | RULE_CONCEPT_SHORT_KEYWORD | RULE_KEYWORD | RULE_DBL_LT_EM | RULE_DBL_GT_EM | RULE_DBL_LT | RULE_DBL_GT | RULE_LT_EM | RULE_GT_EM | RULE_GTE | RULE_LTE | RULE_DOUBLE_CURLY_OPEN | RULE_DOUBLE_CURLY_CLOSE | RULE_PIPE_DELIMITED_STRING | RULE_STRING | RULE_TO | RULE_COMMA | RULE_DIGIT_ZERO | RULE_DIGIT_NONZERO | RULE_COLON | RULE_CURLY_OPEN | RULE_CURLY_CLOSE | RULE_ROUND_OPEN | RULE_ROUND_CLOSE | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE | RULE_PLUS | RULE_DASH | RULE_CARET | RULE_DOT | RULE_WILDCARD | RULE_EQUAL | RULE_NOT_EQUAL | RULE_LT | RULE_GT | RULE_HASH | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );";
        }
    }
 

}