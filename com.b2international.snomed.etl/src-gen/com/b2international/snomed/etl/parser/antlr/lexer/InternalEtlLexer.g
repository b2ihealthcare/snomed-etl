/*
 * Copyright 2020-2022 B2i Healthcare Pte Ltd, http://b2i.sg
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
lexer grammar InternalEtlLexer;

@header {
package com.b2international.snomed.etl.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

RULE_DOUBLE_SQUARE_OPEN : '[[';

RULE_DOUBLE_SQUARE_CLOSE : ']]';

RULE_TILDE : '~';

fragment RULE_AT : '@';

RULE_ID : 'id';

RULE_SCG : 'scg';

RULE_TOK : 'tok';

RULE_STR : 'str';

RULE_INT : 'int';

RULE_DEC : 'dec';

RULE_EQUIVALENT_TO : '===';

RULE_SUBTYPE_OF : '<<<';

RULE_SLOTNAME_STRING : RULE_AT (RULE_STRING|~(('\\'|'"'|'\''|RULE_WS|RULE_AT|RULE_SQUARE_OPEN|RULE_SQUARE_CLOSE))*);

RULE_HISTORY_KEYWORD : ('HISTORY'|('h'|'H') ('i'|'I') ('s'|'S') ('t'|'T') ('o'|'O') ('r'|'R') ('y'|'Y'));

RULE_CASE_SIGNIFICANCE_ID_KEYWORD : ('caseSignificanceId'|('C'|'c') ('A'|'a') ('S'|'s') ('E'|'e') ('S'|'s') ('I'|'i') ('G'|'g') ('N'|'n') ('I'|'i') ('F'|'f') ('I'|'i') ('C'|'c') ('A'|'a') ('N'|'n') ('C'|'c') ('E'|'e') ('I'|'i') ('D'|'d'));

RULE_DEFINITION_STATUS_ID_KEYWORD : ('definitionStatusId'|('d'|'D') ('e'|'E') ('f'|'F') ('i'|'I') ('n'|'N') ('i'|'I') ('t'|'T') ('i'|'I') ('o'|'O') ('n'|'N') ('s'|'S') ('t'|'T') ('a'|'A') ('t'|'T') ('u'|'U') ('s'|'S') ('i'|'I') ('d'|'D'));

RULE_DEFINITION_STATUS_TOKEN_KEYWORD : ('definitionStatus'|('d'|'D') ('e'|'E') ('f'|'F') ('i'|'I') ('n'|'N') ('i'|'I') ('t'|'T') ('i'|'I') ('o'|'O') ('n'|'N') ('s'|'S') ('t'|'T') ('a'|'A') ('t'|'T') ('u'|'U') ('s'|'S'));

RULE_LANGUAGE_REFSET_ID_KEYWORD : ('languageRefsetId'|('L'|'l') ('A'|'a') ('N'|'n') ('G'|'g') ('U'|'u') ('A'|'a') ('G'|'g') ('E'|'e') ('R'|'r') ('E'|'e') ('F'|'f') ('S'|'s') ('E'|'e') ('T'|'t') ('I'|'i') ('D'|'d'));

RULE_EFFECTIVE_TIME_KEYWORD : ('effectiveTime'|('E'|'e') ('F'|'f') ('F'|'f') ('E'|'e') ('C'|'c') ('T'|'t') ('I'|'i') ('V'|'v') ('E'|'e') ('T'|'t') ('I'|'i') ('M'|'m') ('E'|'e'));

RULE_ACCEPTABLE_IN_KEYWORD : ('acceptableIn'|('A'|'a') ('C'|'c') ('C'|'c') ('E'|'e') ('P'|'p') ('T'|'t') ('A'|'a') ('B'|'b') ('L'|'l') ('E'|'e') ('I'|'i') ('N'|'n'));

RULE_PREFERRED_IN_KEYWORD : ('preferredIn'|('P'|'p') ('R'|'r') ('E'|'e') ('F'|'f') ('E'|'e') ('R'|'r') ('R'|'r') ('E'|'e') ('D'|'d') ('I'|'i') ('N'|'n'));

RULE_SEMANTIC_TAG_KEYWORD : ('semanticTag'|('S'|'s') ('E'|'e') ('M'|'m') ('A'|'a') ('N'|'n') ('T'|'t') ('I'|'i') ('C'|'c') ('T'|'t') ('A'|'a') ('G'|'g'));

RULE_DIALECTID_KEYWORD : ('dialectId'|('D'|'d') ('I'|'i') ('A'|'a') ('L'|'l') ('E'|'e') ('C'|'c') ('T'|'t') ('I'|'i') ('D'|'d'));

RULE_LANGUAGE_KEYWORD : ('language'|('L'|'l') ('A'|'a') ('N'|'n') ('G'|'g') ('U'|'u') ('A'|'a') ('G'|'g') ('E'|'e'));

RULE_MODULEID_KEYWORD : ('moduleId'|('M'|'m') ('O'|'o') ('D'|'d') ('U'|'u') ('L'|'l') ('E'|'e') ('I'|'i') ('D'|'d'));

RULE_DIALECT_KEYWORD : ('dialect'|('D'|'d') ('I'|'i') ('A'|'a') ('L'|'l') ('E'|'e') ('C'|'c') ('T'|'t'));

RULE_ACTIVE_KEYWORD : ('active'|('A'|'a') ('C'|'c') ('T'|'t') ('I'|'i') ('V'|'v') ('E'|'e'));

RULE_TYPEID_KEYWORD : ('typeId'|('T'|'t') ('Y'|'y') ('P'|'p') ('E'|'e') ('I'|'i') ('D'|'d'));

RULE_EXCLUSION_KEYWORD : ('MINUS'|('M'|'m') ('I'|'i') ('N'|'n') ('U'|'u') ('S'|'s'));

RULE_EXACT_KEYWORD : ('exact'|('E'|'e') ('X'|'x') ('A'|'a') ('C'|'c') ('T'|'t'));

RULE_FALSE_KEYWORD : ('false'|('F'|'f') ('A'|'a') ('L'|'l') ('S'|'s') ('E'|'e'));

RULE_MATCH_KEYWORD : ('match'|('M'|'m') ('A'|'a') ('T'|'t') ('C'|'c') ('H'|'h'));

RULE_REGEX_KEYWORD : ('regex'|('R'|'r') ('E'|'e') ('G'|'g') ('E'|'e') ('X'|'x'));

RULE_TERM_KEYWORD : ('term'|('T'|'t') ('E'|'e') ('R'|'r') ('M'|'m'));

RULE_TRUE_KEYWORD : ('true'|('T'|'t') ('R'|'r') ('U'|'u') ('E'|'e'));

RULE_TYPE_KEYWORD : ('type'|('T'|'t') ('Y'|'y') ('P'|'p') ('E'|'e'));

RULE_WILD_KEYWORD : ('wild'|('W'|'w') ('I'|'i') ('L'|'l') ('D'|'d'));

RULE_MIN_KEYWORD : ('MIN'|('M'|'m') ('I'|'i') ('N'|'n'));

RULE_MOD_KEYWORD : ('MOD'|('M'|'m') ('O'|'o') ('D'|'d'));

RULE_MAX_KEYWORD : ('MAX'|('M'|'m') ('A'|'a') ('X'|'x'));

RULE_CONJUNCTION_KEYWORD : ('AND'|('A'|'a') ('N'|'n') ('D'|'d'));

RULE_DISJUNCTION_KEYWORD : ('OR'|('O'|'o') ('R'|'r'));

RULE_ID_KEYWORD : ('ID'|('I'|'i') ('D'|'d'));

RULE_REVERSED : 'R';

RULE_MEMBER_SHORT_KEYWORD : ('M'|'m');

RULE_DESCRIPTION_SHORT_KEYWORD : ('D'|'d');

RULE_CONCEPT_SHORT_KEYWORD : ('C'|'c');

RULE_ALPHA : ('a'..'z'|'A'..'Z');

RULE_KEYWORD : RULE_ALPHA RULE_ALPHA+;

RULE_DBL_LT_EM : '<<!';

RULE_DBL_GT_EM : '>>!';

RULE_DBL_LT : '<<';

RULE_DBL_GT : '>>';

RULE_LT_EM : '<!';

RULE_GT_EM : '>!';

RULE_DBL_EM_LT : '!!<';

RULE_DBL_EM_GT : '!!>';

RULE_GTE : '>=';

RULE_LTE : '<=';

RULE_DOUBLE_CURLY_OPEN : '{{';

RULE_DOUBLE_CURLY_CLOSE : '}}';

RULE_PIPE_DELIMITED_STRING : '|' ( options {greedy=false;} : . )*'|';

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_TO : '..';

RULE_COMMA : ',';

RULE_DIGIT : '0'..'9';

RULE_COLON : ':';

RULE_CURLY_OPEN : '{';

RULE_CURLY_CLOSE : '}';

RULE_ROUND_OPEN : '(';

RULE_ROUND_CLOSE : ')';

RULE_SQUARE_OPEN : '[';

RULE_SQUARE_CLOSE : ']';

RULE_PLUS : '+';

RULE_DASH : '-';

RULE_UNDERSCORE : '_';

RULE_CARET : '^';

RULE_DOT : '.';

RULE_WILDCARD : '*';

RULE_EQUAL : '=';

RULE_NOT_EQUAL : '!=';

RULE_LT : '<';

RULE_GT : '>';

RULE_HASH : '#';

RULE_WS : (' '|'\t'|'\n'|'\r');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;
