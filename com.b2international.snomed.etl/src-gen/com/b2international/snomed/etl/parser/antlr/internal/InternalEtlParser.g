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
parser grammar InternalEtlParser;

options {
	tokenVocab=InternalEtlLexer;
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@header {
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

}

@members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleExpressionTemplate
entryRuleExpressionTemplate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionTemplateRule()); }
	iv_ruleExpressionTemplate=ruleExpressionTemplate
	{ $current=$iv_ruleExpressionTemplate.current; }
	EOF;

// Rule ExpressionTemplate
ruleExpressionTemplate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getExpressionTemplateAccess().getExpressionTemplateAction_0(),
					$current);
			}
		)
		(
			(
				(
					(
						(
							lv_primitive_1_0=RULE_SUBTYPE_OF
							{
								newLeafNode(lv_primitive_1_0, grammarAccess.getExpressionTemplateAccess().getPrimitiveSUBTYPE_OFTerminalRuleCall_1_0_0_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getExpressionTemplateRule());
								}
								setWithLastConsumed(
									$current,
									"primitive",
									lv_primitive_1_0 != null,
									"com.b2international.snomed.etl.Etl.SUBTYPE_OF");
							}
						)
					)
					    |
					this_EQUIVALENT_TO_2=RULE_EQUIVALENT_TO
					{
						newLeafNode(this_EQUIVALENT_TO_2, grammarAccess.getExpressionTemplateAccess().getEQUIVALENT_TOTerminalRuleCall_1_0_0_1());
					}
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getExpressionTemplateAccess().getSlotTokenReplacementSlotParserRuleCall_1_0_1_0());
						}
						lv_slot_3_0=ruleTokenReplacementSlot
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getExpressionTemplateRule());
							}
							set(
								$current,
								"slot",
								lv_slot_3_0,
								"com.b2international.snomed.etl.Etl.TokenReplacementSlot");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionTemplateAccess().getExpressionSubExpressionParserRuleCall_1_1_0());
					}
					lv_expression_4_0=ruleSubExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionTemplateRule());
						}
						set(
							$current,
							"expression",
							lv_expression_4_0,
							"com.b2international.snomed.etl.Etl.SubExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleSubExpression
entryRuleSubExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubExpressionRule()); }
	iv_ruleSubExpression=ruleSubExpression
	{ $current=$iv_ruleSubExpression.current; }
	EOF;

// Rule SubExpression
ruleSubExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSubExpressionAccess().getFocusConceptsFocusConceptParserRuleCall_0_0());
				}
				lv_focusConcepts_0_0=ruleFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSubExpressionRule());
					}
					add(
						$current,
						"focusConcepts",
						lv_focusConcepts_0_0,
						"com.b2international.snomed.etl.Etl.FocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_PLUS_1=RULE_PLUS
			{
				newLeafNode(this_PLUS_1, grammarAccess.getSubExpressionAccess().getPLUSTerminalRuleCall_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSubExpressionAccess().getFocusConceptsFocusConceptParserRuleCall_1_1_0());
					}
					lv_focusConcepts_2_0=ruleFocusConcept
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSubExpressionRule());
						}
						add(
							$current,
							"focusConcepts",
							lv_focusConcepts_2_0,
							"com.b2international.snomed.etl.Etl.FocusConcept");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			this_COLON_3=RULE_COLON
			{
				newLeafNode(this_COLON_3, grammarAccess.getSubExpressionAccess().getCOLONTerminalRuleCall_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSubExpressionAccess().getRefinementRefinementParserRuleCall_2_1_0());
					}
					lv_refinement_4_0=ruleRefinement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSubExpressionRule());
						}
						set(
							$current,
							"refinement",
							lv_refinement_4_0,
							"com.b2international.snomed.etl.Etl.Refinement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleFocusConcept
entryRuleFocusConcept returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFocusConceptRule()); }
	iv_ruleFocusConcept=ruleFocusConcept
	{ $current=$iv_ruleFocusConcept.current; }
	EOF;

// Rule FocusConcept
ruleFocusConcept returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFocusConceptAccess().getSlotTemplateInformationSlotParserRuleCall_0_0());
				}
				lv_slot_0_0=ruleTemplateInformationSlot
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFocusConceptRule());
					}
					set(
						$current,
						"slot",
						lv_slot_0_0,
						"com.b2international.snomed.etl.Etl.TemplateInformationSlot");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFocusConceptAccess().getConceptConceptReferenceParserRuleCall_1_0());
				}
				lv_concept_1_0=ruleConceptReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFocusConceptRule());
					}
					set(
						$current,
						"concept",
						lv_concept_1_0,
						"com.b2international.snomed.etl.Etl.ConceptReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRefinement
entryRuleRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefinementRule()); }
	iv_ruleRefinement=ruleRefinement
	{ $current=$iv_ruleRefinement.current; }
	EOF;

// Rule Refinement
ruleRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_0_0());
						}
						lv_attributes_0_0=ruleAttribute
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRefinementRule());
							}
							add(
								$current,
								"attributes",
								lv_attributes_0_0,
								"com.b2international.snomed.etl.Etl.Attribute");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					this_COMMA_1=RULE_COMMA
					{
						newLeafNode(this_COMMA_1, grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_0_0_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_1_1_0());
							}
							lv_attributes_2_0=ruleAttribute
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getRefinementRule());
								}
								add(
									$current,
									"attributes",
									lv_attributes_2_0,
									"com.b2international.snomed.etl.Etl.Attribute");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_0_1_0());
					}
					lv_groups_3_0=ruleAttributeGroup
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRefinementRule());
						}
						add(
							$current,
							"groups",
							lv_groups_3_0,
							"com.b2international.snomed.etl.Etl.AttributeGroup");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			(
				this_COMMA_4=RULE_COMMA
				{
					newLeafNode(this_COMMA_4, grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_1_0());
				}
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_1_1_0());
					}
					lv_groups_5_0=ruleAttributeGroup
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRefinementRule());
						}
						add(
							$current,
							"groups",
							lv_groups_5_0,
							"com.b2international.snomed.etl.Etl.AttributeGroup");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAttributeGroup
entryRuleAttributeGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeGroupRule()); }
	iv_ruleAttributeGroup=ruleAttributeGroup
	{ $current=$iv_ruleAttributeGroup.current; }
	EOF;

// Rule AttributeGroup
ruleAttributeGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeGroupAccess().getSlotTemplateInformationSlotParserRuleCall_0_0());
				}
				lv_slot_0_0=ruleTemplateInformationSlot
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeGroupRule());
					}
					set(
						$current,
						"slot",
						lv_slot_0_0,
						"com.b2international.snomed.etl.Etl.TemplateInformationSlot");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		this_CURLY_OPEN_1=RULE_CURLY_OPEN
		{
			newLeafNode(this_CURLY_OPEN_1, grammarAccess.getAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_2_0());
				}
				lv_attributes_2_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeGroupRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_2_0,
						"com.b2international.snomed.etl.Etl.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_COMMA_3=RULE_COMMA
			{
				newLeafNode(this_COMMA_3, grammarAccess.getAttributeGroupAccess().getCOMMATerminalRuleCall_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_3_1_0());
					}
					lv_attributes_4_0=ruleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAttributeGroupRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_4_0,
							"com.b2international.snomed.etl.Etl.Attribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		this_CURLY_CLOSE_5=RULE_CURLY_CLOSE
		{
			newLeafNode(this_CURLY_CLOSE_5, grammarAccess.getAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getSlotTemplateInformationSlotParserRuleCall_0_0());
				}
				lv_slot_0_0=ruleTemplateInformationSlot
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"slot",
						lv_slot_0_0,
						"com.b2international.snomed.etl.Etl.TemplateInformationSlot");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getNameConceptReferenceParserRuleCall_1_0());
				}
				lv_name_1_0=ruleConceptReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"com.b2international.snomed.etl.Etl.ConceptReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EQUAL_2=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_2, grammarAccess.getAttributeAccess().getEQUALTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_3_0());
				}
				lv_value_3_0=ruleAttributeValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"com.b2international.snomed.etl.Etl.AttributeValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAttributeValue
entryRuleAttributeValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeValueRule()); }
	iv_ruleAttributeValue=ruleAttributeValue
	{ $current=$iv_ruleAttributeValue.current; }
	EOF;

// Rule AttributeValue
ruleAttributeValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAttributeValueAccess().getConceptReferenceParserRuleCall_0());
		}
		this_ConceptReference_0=ruleConceptReference
		{
			$current = $this_ConceptReference_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			this_ROUND_OPEN_1=RULE_ROUND_OPEN
			{
				newLeafNode(this_ROUND_OPEN_1, grammarAccess.getAttributeValueAccess().getROUND_OPENTerminalRuleCall_1_0());
			}
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getAttributeValueAccess().getSubExpressionParserRuleCall_1_1());
			}
			this_SubExpression_2=ruleSubExpression
			{
				$current = $this_SubExpression_2.current;
				afterParserOrEnumRuleCall();
			}
			this_ROUND_CLOSE_3=RULE_ROUND_CLOSE
			{
				newLeafNode(this_ROUND_CLOSE_3, grammarAccess.getAttributeValueAccess().getROUND_CLOSETerminalRuleCall_1_2());
			}
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAttributeValueAccess().getStringValueParserRuleCall_2());
		}
		this_StringValue_4=ruleStringValue
		{
			$current = $this_StringValue_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAttributeValueAccess().getIntegerValueParserRuleCall_3());
		}
		this_IntegerValue_5=ruleIntegerValue
		{
			$current = $this_IntegerValue_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAttributeValueAccess().getDecimalValueParserRuleCall_4());
		}
		this_DecimalValue_6=ruleDecimalValue
		{
			$current = $this_DecimalValue_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAttributeValueAccess().getConcreteValueReplacementSlotParserRuleCall_5());
		}
		this_ConcreteValueReplacementSlot_7=ruleConcreteValueReplacementSlot
		{
			$current = $this_ConcreteValueReplacementSlot_7.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleConceptIdReplacementSlot
entryRuleConceptIdReplacementSlot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConceptIdReplacementSlotRule()); }
	iv_ruleConceptIdReplacementSlot=ruleConceptIdReplacementSlot
	{ $current=$iv_ruleConceptIdReplacementSlot.current; }
	EOF;

// Rule ConceptIdReplacementSlot
ruleConceptIdReplacementSlot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getConceptIdReplacementSlotAccess().getConceptIdReplacementSlotAction_0(),
					$current);
			}
		)
		this_DOUBLE_SQUARE_OPEN_1=RULE_DOUBLE_SQUARE_OPEN
		{
			newLeafNode(this_DOUBLE_SQUARE_OPEN_1, grammarAccess.getConceptIdReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1());
		}
		this_PLUS_2=RULE_PLUS
		{
			newLeafNode(this_PLUS_2, grammarAccess.getConceptIdReplacementSlotAccess().getPLUSTerminalRuleCall_2());
		}
		this_ID_3=RULE_ID
		{
			newLeafNode(this_ID_3, grammarAccess.getConceptIdReplacementSlotAccess().getIDTerminalRuleCall_3());
		}
		(
			this_ROUND_OPEN_4=RULE_ROUND_OPEN
			{
				newLeafNode(this_ROUND_OPEN_4, grammarAccess.getConceptIdReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConceptIdReplacementSlotAccess().getConstraintExpressionConstraintParserRuleCall_4_1_0());
					}
					lv_constraint_5_0=ruleExpressionConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConceptIdReplacementSlotRule());
						}
						set(
							$current,
							"constraint",
							lv_constraint_5_0,
							"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_ROUND_CLOSE_6=RULE_ROUND_CLOSE
			{
				newLeafNode(this_ROUND_CLOSE_6, grammarAccess.getConceptIdReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_2());
			}
		)?
		(
			(
				lv_name_7_0=RULE_SLOTNAME_STRING
				{
					newLeafNode(lv_name_7_0, grammarAccess.getConceptIdReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConceptIdReplacementSlotRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_7_0,
						"com.b2international.snomed.etl.Etl.SLOTNAME_STRING");
				}
			)
		)?
		this_DOUBLE_SQUARE_CLOSE_8=RULE_DOUBLE_SQUARE_CLOSE
		{
			newLeafNode(this_DOUBLE_SQUARE_CLOSE_8, grammarAccess.getConceptIdReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleExpressionReplacementSlot
entryRuleExpressionReplacementSlot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionReplacementSlotRule()); }
	iv_ruleExpressionReplacementSlot=ruleExpressionReplacementSlot
	{ $current=$iv_ruleExpressionReplacementSlot.current; }
	EOF;

// Rule ExpressionReplacementSlot
ruleExpressionReplacementSlot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getExpressionReplacementSlotAccess().getExpressionReplacementSlotAction_0(),
					$current);
			}
		)
		this_DOUBLE_SQUARE_OPEN_1=RULE_DOUBLE_SQUARE_OPEN
		{
			newLeafNode(this_DOUBLE_SQUARE_OPEN_1, grammarAccess.getExpressionReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1());
		}
		this_PLUS_2=RULE_PLUS
		{
			newLeafNode(this_PLUS_2, grammarAccess.getExpressionReplacementSlotAccess().getPLUSTerminalRuleCall_2());
		}
		(
			this_SCG_3=RULE_SCG
			{
				newLeafNode(this_SCG_3, grammarAccess.getExpressionReplacementSlotAccess().getSCGTerminalRuleCall_3());
			}
		)?
		(
			this_ROUND_OPEN_4=RULE_ROUND_OPEN
			{
				newLeafNode(this_ROUND_OPEN_4, grammarAccess.getExpressionReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionReplacementSlotAccess().getConstraintExpressionConstraintParserRuleCall_4_1_0());
					}
					lv_constraint_5_0=ruleExpressionConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionReplacementSlotRule());
						}
						set(
							$current,
							"constraint",
							lv_constraint_5_0,
							"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_ROUND_CLOSE_6=RULE_ROUND_CLOSE
			{
				newLeafNode(this_ROUND_CLOSE_6, grammarAccess.getExpressionReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_2());
			}
		)?
		(
			(
				lv_name_7_0=RULE_SLOTNAME_STRING
				{
					newLeafNode(lv_name_7_0, grammarAccess.getExpressionReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExpressionReplacementSlotRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_7_0,
						"com.b2international.snomed.etl.Etl.SLOTNAME_STRING");
				}
			)
		)?
		this_DOUBLE_SQUARE_CLOSE_8=RULE_DOUBLE_SQUARE_CLOSE
		{
			newLeafNode(this_DOUBLE_SQUARE_CLOSE_8, grammarAccess.getExpressionReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleTokenReplacementSlot
entryRuleTokenReplacementSlot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTokenReplacementSlotRule()); }
	iv_ruleTokenReplacementSlot=ruleTokenReplacementSlot
	{ $current=$iv_ruleTokenReplacementSlot.current; }
	EOF;

// Rule TokenReplacementSlot
ruleTokenReplacementSlot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getTokenReplacementSlotAccess().getTokenReplacementSlotAction_0(),
					$current);
			}
		)
		this_DOUBLE_SQUARE_OPEN_1=RULE_DOUBLE_SQUARE_OPEN
		{
			newLeafNode(this_DOUBLE_SQUARE_OPEN_1, grammarAccess.getTokenReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1());
		}
		this_PLUS_2=RULE_PLUS
		{
			newLeafNode(this_PLUS_2, grammarAccess.getTokenReplacementSlotAccess().getPLUSTerminalRuleCall_2());
		}
		this_TOK_3=RULE_TOK
		{
			newLeafNode(this_TOK_3, grammarAccess.getTokenReplacementSlotAccess().getTOKTerminalRuleCall_3());
		}
		(
			this_ROUND_OPEN_4=RULE_ROUND_OPEN
			{
				newLeafNode(this_ROUND_OPEN_4, grammarAccess.getTokenReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTokenReplacementSlotAccess().getTokensSlotTokenParserRuleCall_4_1_0());
					}
					lv_tokens_5_0=ruleSlotToken
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTokenReplacementSlotRule());
						}
						add(
							$current,
							"tokens",
							lv_tokens_5_0,
							"com.b2international.snomed.etl.Etl.SlotToken");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTokenReplacementSlotAccess().getTokensSlotTokenParserRuleCall_4_2_0());
					}
					lv_tokens_6_0=ruleSlotToken
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTokenReplacementSlotRule());
						}
						add(
							$current,
							"tokens",
							lv_tokens_6_0,
							"com.b2international.snomed.etl.Etl.SlotToken");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			this_ROUND_CLOSE_7=RULE_ROUND_CLOSE
			{
				newLeafNode(this_ROUND_CLOSE_7, grammarAccess.getTokenReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3());
			}
		)?
		(
			(
				lv_name_8_0=RULE_SLOTNAME_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getTokenReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTokenReplacementSlotRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"com.b2international.snomed.etl.Etl.SLOTNAME_STRING");
				}
			)
		)?
		this_DOUBLE_SQUARE_CLOSE_9=RULE_DOUBLE_SQUARE_CLOSE
		{
			newLeafNode(this_DOUBLE_SQUARE_CLOSE_9, grammarAccess.getTokenReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleTemplateInformationSlot
entryRuleTemplateInformationSlot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTemplateInformationSlotRule()); }
	iv_ruleTemplateInformationSlot=ruleTemplateInformationSlot
	{ $current=$iv_ruleTemplateInformationSlot.current; }
	EOF;

// Rule TemplateInformationSlot
ruleTemplateInformationSlot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getTemplateInformationSlotAccess().getTemplateInformationSlotAction_0(),
					$current);
			}
		)
		this_DOUBLE_SQUARE_OPEN_1=RULE_DOUBLE_SQUARE_OPEN
		{
			newLeafNode(this_DOUBLE_SQUARE_OPEN_1, grammarAccess.getTemplateInformationSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTemplateInformationSlotAccess().getCardinalityEtlCardinalityParserRuleCall_2_0());
				}
				lv_cardinality_2_0=ruleEtlCardinality
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTemplateInformationSlotRule());
					}
					set(
						$current,
						"cardinality",
						lv_cardinality_2_0,
						"com.b2international.snomed.etl.Etl.EtlCardinality");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_name_3_0=RULE_SLOTNAME_STRING
				{
					newLeafNode(lv_name_3_0, grammarAccess.getTemplateInformationSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTemplateInformationSlotRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"com.b2international.snomed.etl.Etl.SLOTNAME_STRING");
				}
			)
		)?
		this_DOUBLE_SQUARE_CLOSE_4=RULE_DOUBLE_SQUARE_CLOSE
		{
			newLeafNode(this_DOUBLE_SQUARE_CLOSE_4, grammarAccess.getTemplateInformationSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleConcreteValueReplacementSlot
entryRuleConcreteValueReplacementSlot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConcreteValueReplacementSlotRule()); }
	iv_ruleConcreteValueReplacementSlot=ruleConcreteValueReplacementSlot
	{ $current=$iv_ruleConcreteValueReplacementSlot.current; }
	EOF;

// Rule ConcreteValueReplacementSlot
ruleConcreteValueReplacementSlot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getConcreteValueReplacementSlotAccess().getStringReplacementSlotParserRuleCall_0());
		}
		this_StringReplacementSlot_0=ruleStringReplacementSlot
		{
			$current = $this_StringReplacementSlot_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getConcreteValueReplacementSlotAccess().getIntegerReplacementSlotParserRuleCall_1());
		}
		this_IntegerReplacementSlot_1=ruleIntegerReplacementSlot
		{
			$current = $this_IntegerReplacementSlot_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getConcreteValueReplacementSlotAccess().getDecimalReplacementSlotParserRuleCall_2());
		}
		this_DecimalReplacementSlot_2=ruleDecimalReplacementSlot
		{
			$current = $this_DecimalReplacementSlot_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleStringReplacementSlot
entryRuleStringReplacementSlot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringReplacementSlotRule()); }
	iv_ruleStringReplacementSlot=ruleStringReplacementSlot
	{ $current=$iv_ruleStringReplacementSlot.current; }
	EOF;

// Rule StringReplacementSlot
ruleStringReplacementSlot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getStringReplacementSlotAccess().getStringReplacementSlotAction_0(),
					$current);
			}
		)
		this_DOUBLE_SQUARE_OPEN_1=RULE_DOUBLE_SQUARE_OPEN
		{
			newLeafNode(this_DOUBLE_SQUARE_OPEN_1, grammarAccess.getStringReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1());
		}
		this_PLUS_2=RULE_PLUS
		{
			newLeafNode(this_PLUS_2, grammarAccess.getStringReplacementSlotAccess().getPLUSTerminalRuleCall_2());
		}
		this_STR_3=RULE_STR
		{
			newLeafNode(this_STR_3, grammarAccess.getStringReplacementSlotAccess().getSTRTerminalRuleCall_3());
		}
		(
			this_ROUND_OPEN_4=RULE_ROUND_OPEN
			{
				newLeafNode(this_ROUND_OPEN_4, grammarAccess.getStringReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0());
			}
			(
				(
					lv_values_5_0=RULE_STRING
					{
						newLeafNode(lv_values_5_0, grammarAccess.getStringReplacementSlotAccess().getValuesSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStringReplacementSlotRule());
						}
						addWithLastConsumed(
							$current,
							"values",
							lv_values_5_0,
							"com.b2international.snomed.ecl.Ecl.STRING");
					}
				)
			)
			(
				(
					lv_values_6_0=RULE_STRING
					{
						newLeafNode(lv_values_6_0, grammarAccess.getStringReplacementSlotAccess().getValuesSTRINGTerminalRuleCall_4_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStringReplacementSlotRule());
						}
						addWithLastConsumed(
							$current,
							"values",
							lv_values_6_0,
							"com.b2international.snomed.ecl.Ecl.STRING");
					}
				)
			)*
			this_ROUND_CLOSE_7=RULE_ROUND_CLOSE
			{
				newLeafNode(this_ROUND_CLOSE_7, grammarAccess.getStringReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3());
			}
		)?
		(
			(
				lv_name_8_0=RULE_SLOTNAME_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getStringReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStringReplacementSlotRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"com.b2international.snomed.etl.Etl.SLOTNAME_STRING");
				}
			)
		)?
		this_DOUBLE_SQUARE_CLOSE_9=RULE_DOUBLE_SQUARE_CLOSE
		{
			newLeafNode(this_DOUBLE_SQUARE_CLOSE_9, grammarAccess.getStringReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleIntegerReplacementSlot
entryRuleIntegerReplacementSlot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerReplacementSlotRule()); }
	iv_ruleIntegerReplacementSlot=ruleIntegerReplacementSlot
	{ $current=$iv_ruleIntegerReplacementSlot.current; }
	EOF;

// Rule IntegerReplacementSlot
ruleIntegerReplacementSlot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getIntegerReplacementSlotAccess().getIntegerReplacementSlotAction_0(),
					$current);
			}
		)
		this_DOUBLE_SQUARE_OPEN_1=RULE_DOUBLE_SQUARE_OPEN
		{
			newLeafNode(this_DOUBLE_SQUARE_OPEN_1, grammarAccess.getIntegerReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1());
		}
		this_PLUS_2=RULE_PLUS
		{
			newLeafNode(this_PLUS_2, grammarAccess.getIntegerReplacementSlotAccess().getPLUSTerminalRuleCall_2());
		}
		this_INT_3=RULE_INT
		{
			newLeafNode(this_INT_3, grammarAccess.getIntegerReplacementSlotAccess().getINTTerminalRuleCall_3());
		}
		(
			this_ROUND_OPEN_4=RULE_ROUND_OPEN
			{
				newLeafNode(this_ROUND_OPEN_4, grammarAccess.getIntegerReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIntegerReplacementSlotAccess().getValuesSlotIntegerParserRuleCall_4_1_0());
					}
					lv_values_5_0=ruleSlotInteger
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIntegerReplacementSlotRule());
						}
						add(
							$current,
							"values",
							lv_values_5_0,
							"com.b2international.snomed.etl.Etl.SlotInteger");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getIntegerReplacementSlotAccess().getValuesSlotIntegerParserRuleCall_4_2_0());
					}
					lv_values_6_0=ruleSlotInteger
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIntegerReplacementSlotRule());
						}
						add(
							$current,
							"values",
							lv_values_6_0,
							"com.b2international.snomed.etl.Etl.SlotInteger");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			this_ROUND_CLOSE_7=RULE_ROUND_CLOSE
			{
				newLeafNode(this_ROUND_CLOSE_7, grammarAccess.getIntegerReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3());
			}
		)?
		(
			(
				lv_name_8_0=RULE_SLOTNAME_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getIntegerReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIntegerReplacementSlotRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"com.b2international.snomed.etl.Etl.SLOTNAME_STRING");
				}
			)
		)?
		this_DOUBLE_SQUARE_CLOSE_9=RULE_DOUBLE_SQUARE_CLOSE
		{
			newLeafNode(this_DOUBLE_SQUARE_CLOSE_9, grammarAccess.getIntegerReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleDecimalReplacementSlot
entryRuleDecimalReplacementSlot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDecimalReplacementSlotRule()); }
	iv_ruleDecimalReplacementSlot=ruleDecimalReplacementSlot
	{ $current=$iv_ruleDecimalReplacementSlot.current; }
	EOF;

// Rule DecimalReplacementSlot
ruleDecimalReplacementSlot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getDecimalReplacementSlotAccess().getDecimalReplacementSlotAction_0(),
					$current);
			}
		)
		this_DOUBLE_SQUARE_OPEN_1=RULE_DOUBLE_SQUARE_OPEN
		{
			newLeafNode(this_DOUBLE_SQUARE_OPEN_1, grammarAccess.getDecimalReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1());
		}
		this_PLUS_2=RULE_PLUS
		{
			newLeafNode(this_PLUS_2, grammarAccess.getDecimalReplacementSlotAccess().getPLUSTerminalRuleCall_2());
		}
		this_DEC_3=RULE_DEC
		{
			newLeafNode(this_DEC_3, grammarAccess.getDecimalReplacementSlotAccess().getDECTerminalRuleCall_3());
		}
		(
			this_ROUND_OPEN_4=RULE_ROUND_OPEN
			{
				newLeafNode(this_ROUND_OPEN_4, grammarAccess.getDecimalReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecimalReplacementSlotAccess().getValuesSlotDecimalParserRuleCall_4_1_0());
					}
					lv_values_5_0=ruleSlotDecimal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecimalReplacementSlotRule());
						}
						add(
							$current,
							"values",
							lv_values_5_0,
							"com.b2international.snomed.etl.Etl.SlotDecimal");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getDecimalReplacementSlotAccess().getValuesSlotDecimalParserRuleCall_4_2_0());
					}
					lv_values_6_0=ruleSlotDecimal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecimalReplacementSlotRule());
						}
						add(
							$current,
							"values",
							lv_values_6_0,
							"com.b2international.snomed.etl.Etl.SlotDecimal");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			this_ROUND_CLOSE_7=RULE_ROUND_CLOSE
			{
				newLeafNode(this_ROUND_CLOSE_7, grammarAccess.getDecimalReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3());
			}
		)?
		(
			(
				lv_name_8_0=RULE_SLOTNAME_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getDecimalReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDecimalReplacementSlotRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"com.b2international.snomed.etl.Etl.SLOTNAME_STRING");
				}
			)
		)?
		this_DOUBLE_SQUARE_CLOSE_9=RULE_DOUBLE_SQUARE_CLOSE
		{
			newLeafNode(this_DOUBLE_SQUARE_CLOSE_9, grammarAccess.getDecimalReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleEtlCardinality
entryRuleEtlCardinality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEtlCardinalityRule()); }
	iv_ruleEtlCardinality=ruleEtlCardinality
	{ $current=$iv_ruleEtlCardinality.current; }
	EOF;

// Rule EtlCardinality
ruleEtlCardinality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_TILDE_0=RULE_TILDE
			{
				newLeafNode(this_TILDE_0, grammarAccess.getEtlCardinalityAccess().getTILDETerminalRuleCall_0());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getEtlCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0());
				}
				lv_min_1_0=ruleNonNegativeInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEtlCardinalityRule());
					}
					set(
						$current,
						"min",
						lv_min_1_0,
						"com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_TO_2=RULE_TO
		{
			newLeafNode(this_TO_2, grammarAccess.getEtlCardinalityAccess().getTOTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEtlCardinalityAccess().getMaxMaxValueParserRuleCall_3_0());
				}
				lv_max_3_0=ruleMaxValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEtlCardinalityRule());
					}
					set(
						$current,
						"max",
						lv_max_3_0,
						"com.b2international.snomed.ecl.Ecl.MaxValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleConceptReplacementSlot
entryRuleConceptReplacementSlot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConceptReplacementSlotRule()); }
	iv_ruleConceptReplacementSlot=ruleConceptReplacementSlot
	{ $current=$iv_ruleConceptReplacementSlot.current; }
	EOF;

// Rule ConceptReplacementSlot
ruleConceptReplacementSlot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getConceptReplacementSlotAccess().getConceptIdReplacementSlotParserRuleCall_0());
		}
		this_ConceptIdReplacementSlot_0=ruleConceptIdReplacementSlot
		{
			$current = $this_ConceptIdReplacementSlot_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getConceptReplacementSlotAccess().getExpressionReplacementSlotParserRuleCall_1());
		}
		this_ExpressionReplacementSlot_1=ruleExpressionReplacementSlot
		{
			$current = $this_ExpressionReplacementSlot_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleConceptReference
entryRuleConceptReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConceptReferenceRule()); }
	iv_ruleConceptReference=ruleConceptReference
	{ $current=$iv_ruleConceptReference.current; }
	EOF;

// Rule ConceptReference
ruleConceptReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getConceptReferenceAccess().getSlotConceptReplacementSlotParserRuleCall_0_0());
				}
				lv_slot_0_0=ruleConceptReplacementSlot
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConceptReferenceRule());
					}
					set(
						$current,
						"slot",
						lv_slot_0_0,
						"com.b2international.snomed.etl.Etl.ConceptReplacementSlot");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getConceptReferenceAccess().getIdIdentifierParserRuleCall_1_0_0());
					}
					lv_id_1_0=ruleIdentifier
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConceptReferenceRule());
						}
						set(
							$current,
							"id",
							lv_id_1_0,
							"com.b2international.snomed.ecl.Ecl.Identifier");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_term_2_0=RULE_PIPE_DELIMITED_STRING
					{
						newLeafNode(lv_term_2_0, grammarAccess.getConceptReferenceAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConceptReferenceRule());
						}
						setWithLastConsumed(
							$current,
							"term",
							lv_term_2_0,
							"com.b2international.snomed.ecl.Ecl.PIPE_DELIMITED_STRING");
					}
				)
			)?
		)
	)
;

// Entry rule entryRuleSlotToken
entryRuleSlotToken returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSlotTokenRule()); }
	iv_ruleSlotToken=ruleSlotToken
	{ $current=$iv_ruleSlotToken.current.getText(); }
	EOF;

// Rule SlotToken
ruleSlotToken returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_EQUIVALENT_TO_0=RULE_EQUIVALENT_TO
		{
			$current.merge(this_EQUIVALENT_TO_0);
		}
		{
			newLeafNode(this_EQUIVALENT_TO_0, grammarAccess.getSlotTokenAccess().getEQUIVALENT_TOTerminalRuleCall_0());
		}
		    |
		this_SUBTYPE_OF_1=RULE_SUBTYPE_OF
		{
			$current.merge(this_SUBTYPE_OF_1);
		}
		{
			newLeafNode(this_SUBTYPE_OF_1, grammarAccess.getSlotTokenAccess().getSUBTYPE_OFTerminalRuleCall_1());
		}
		    |
		this_COMMA_2=RULE_COMMA
		{
			$current.merge(this_COMMA_2);
		}
		{
			newLeafNode(this_COMMA_2, grammarAccess.getSlotTokenAccess().getCOMMATerminalRuleCall_2());
		}
		    |
		this_CONJUNCTION_KEYWORD_3=RULE_CONJUNCTION_KEYWORD
		{
			$current.merge(this_CONJUNCTION_KEYWORD_3);
		}
		{
			newLeafNode(this_CONJUNCTION_KEYWORD_3, grammarAccess.getSlotTokenAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_3());
		}
		    |
		this_DISJUNCTION_KEYWORD_4=RULE_DISJUNCTION_KEYWORD
		{
			$current.merge(this_DISJUNCTION_KEYWORD_4);
		}
		{
			newLeafNode(this_DISJUNCTION_KEYWORD_4, grammarAccess.getSlotTokenAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_4());
		}
		    |
		this_EXCLUSION_KEYWORD_5=RULE_EXCLUSION_KEYWORD
		{
			$current.merge(this_EXCLUSION_KEYWORD_5);
		}
		{
			newLeafNode(this_EXCLUSION_KEYWORD_5, grammarAccess.getSlotTokenAccess().getEXCLUSION_KEYWORDTerminalRuleCall_5());
		}
		    |
		this_REVERSED_6=RULE_REVERSED
		{
			$current.merge(this_REVERSED_6);
		}
		{
			newLeafNode(this_REVERSED_6, grammarAccess.getSlotTokenAccess().getREVERSEDTerminalRuleCall_6());
		}
		    |
		this_CARET_7=RULE_CARET
		{
			$current.merge(this_CARET_7);
		}
		{
			newLeafNode(this_CARET_7, grammarAccess.getSlotTokenAccess().getCARETTerminalRuleCall_7());
		}
		    |
		this_LT_8=RULE_LT
		{
			$current.merge(this_LT_8);
		}
		{
			newLeafNode(this_LT_8, grammarAccess.getSlotTokenAccess().getLTTerminalRuleCall_8());
		}
		    |
		this_LTE_9=RULE_LTE
		{
			$current.merge(this_LTE_9);
		}
		{
			newLeafNode(this_LTE_9, grammarAccess.getSlotTokenAccess().getLTETerminalRuleCall_9());
		}
		    |
		this_DBL_LT_10=RULE_DBL_LT
		{
			$current.merge(this_DBL_LT_10);
		}
		{
			newLeafNode(this_DBL_LT_10, grammarAccess.getSlotTokenAccess().getDBL_LTTerminalRuleCall_10());
		}
		    |
		this_LT_EM_11=RULE_LT_EM
		{
			$current.merge(this_LT_EM_11);
		}
		{
			newLeafNode(this_LT_EM_11, grammarAccess.getSlotTokenAccess().getLT_EMTerminalRuleCall_11());
		}
		    |
		this_GT_12=RULE_GT
		{
			$current.merge(this_GT_12);
		}
		{
			newLeafNode(this_GT_12, grammarAccess.getSlotTokenAccess().getGTTerminalRuleCall_12());
		}
		    |
		this_GTE_13=RULE_GTE
		{
			$current.merge(this_GTE_13);
		}
		{
			newLeafNode(this_GTE_13, grammarAccess.getSlotTokenAccess().getGTETerminalRuleCall_13());
		}
		    |
		this_DBL_GT_14=RULE_DBL_GT
		{
			$current.merge(this_DBL_GT_14);
		}
		{
			newLeafNode(this_DBL_GT_14, grammarAccess.getSlotTokenAccess().getDBL_GTTerminalRuleCall_14());
		}
		    |
		this_GT_EM_15=RULE_GT_EM
		{
			$current.merge(this_GT_EM_15);
		}
		{
			newLeafNode(this_GT_EM_15, grammarAccess.getSlotTokenAccess().getGT_EMTerminalRuleCall_15());
		}
		    |
		this_EQUAL_16=RULE_EQUAL
		{
			$current.merge(this_EQUAL_16);
		}
		{
			newLeafNode(this_EQUAL_16, grammarAccess.getSlotTokenAccess().getEQUALTerminalRuleCall_16());
		}
		    |
		this_NOT_EQUAL_17=RULE_NOT_EQUAL
		{
			$current.merge(this_NOT_EQUAL_17);
		}
		{
			newLeafNode(this_NOT_EQUAL_17, grammarAccess.getSlotTokenAccess().getNOT_EQUALTerminalRuleCall_17());
		}
	)
;

// Entry rule entryRuleStringValue
entryRuleStringValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringValueRule()); }
	iv_ruleStringValue=ruleStringValue
	{ $current=$iv_ruleStringValue.current; }
	EOF;

// Rule StringValue
ruleStringValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_STRING
			{
				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStringValueRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"com.b2international.snomed.ecl.Ecl.STRING");
			}
		)
	)
;

// Entry rule entryRuleIntegerValue
entryRuleIntegerValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerValueRule()); }
	iv_ruleIntegerValue=ruleIntegerValue
	{ $current=$iv_ruleIntegerValue.current; }
	EOF;

// Rule IntegerValue
ruleIntegerValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_HASH_0=RULE_HASH
		{
			newLeafNode(this_HASH_0, grammarAccess.getIntegerValueAccess().getHASHTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIntegerValueAccess().getValueIntegerParserRuleCall_1_0());
				}
				lv_value_1_0=ruleInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntegerValueRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"com.b2international.snomed.ecl.Ecl.Integer");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDecimalValue
entryRuleDecimalValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDecimalValueRule()); }
	iv_ruleDecimalValue=ruleDecimalValue
	{ $current=$iv_ruleDecimalValue.current; }
	EOF;

// Rule DecimalValue
ruleDecimalValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_HASH_0=RULE_HASH
		{
			newLeafNode(this_HASH_0, grammarAccess.getDecimalValueAccess().getHASHTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDecimalValueAccess().getValueDecimalParserRuleCall_1_0());
				}
				lv_value_1_0=ruleDecimal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDecimalValueRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"com.b2international.snomed.ecl.Ecl.Decimal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSlotInteger
entryRuleSlotInteger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlotIntegerRule()); }
	iv_ruleSlotInteger=ruleSlotInteger
	{ $current=$iv_ruleSlotInteger.current; }
	EOF;

// Rule SlotInteger
ruleSlotInteger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSlotIntegerAccess().getSlotIntegerRangeParserRuleCall_0());
		}
		this_SlotIntegerRange_0=ruleSlotIntegerRange
		{
			$current = $this_SlotIntegerRange_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSlotIntegerAccess().getSlotIntegerValueParserRuleCall_1());
		}
		this_SlotIntegerValue_1=ruleSlotIntegerValue
		{
			$current = $this_SlotIntegerValue_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSlotIntegerValue
entryRuleSlotIntegerValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlotIntegerValueRule()); }
	iv_ruleSlotIntegerValue=ruleSlotIntegerValue
	{ $current=$iv_ruleSlotIntegerValue.current; }
	EOF;

// Rule SlotIntegerValue
ruleSlotIntegerValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_HASH_0=RULE_HASH
		{
			newLeafNode(this_HASH_0, grammarAccess.getSlotIntegerValueAccess().getHASHTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlotIntegerValueAccess().getValueNonNegativeIntegerParserRuleCall_1_0());
				}
				lv_value_1_0=ruleNonNegativeInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlotIntegerValueRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSlotIntegerRange
entryRuleSlotIntegerRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlotIntegerRangeRule()); }
	iv_ruleSlotIntegerRange=ruleSlotIntegerRange
	{ $current=$iv_ruleSlotIntegerRange.current; }
	EOF;

// Rule SlotIntegerRange
ruleSlotIntegerRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSlotIntegerRangeAccess().getMinimumSlotIntegerMinimumValueParserRuleCall_0_0_0());
					}
					lv_minimum_0_0=ruleSlotIntegerMinimumValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlotIntegerRangeRule());
						}
						set(
							$current,
							"minimum",
							lv_minimum_0_0,
							"com.b2international.snomed.etl.Etl.SlotIntegerMinimumValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_TO_1=RULE_TO
			{
				newLeafNode(this_TO_1, grammarAccess.getSlotIntegerRangeAccess().getTOTerminalRuleCall_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlotIntegerRangeAccess().getMaximumSlotIntegerMaximumValueParserRuleCall_0_2_0());
					}
					lv_maximum_2_0=ruleSlotIntegerMaximumValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlotIntegerRangeRule());
						}
						set(
							$current,
							"maximum",
							lv_maximum_2_0,
							"com.b2international.snomed.etl.Etl.SlotIntegerMaximumValue");
						afterParserOrEnumRuleCall();
					}
				)
			)?
		)
		    |
		(
			this_TO_3=RULE_TO
			{
				newLeafNode(this_TO_3, grammarAccess.getSlotIntegerRangeAccess().getTOTerminalRuleCall_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlotIntegerRangeAccess().getMaximumSlotIntegerMaximumValueParserRuleCall_1_1_0());
					}
					lv_maximum_4_0=ruleSlotIntegerMaximumValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlotIntegerRangeRule());
						}
						set(
							$current,
							"maximum",
							lv_maximum_4_0,
							"com.b2international.snomed.etl.Etl.SlotIntegerMaximumValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSlotIntegerMinimumValue
entryRuleSlotIntegerMinimumValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlotIntegerMinimumValueRule()); }
	iv_ruleSlotIntegerMinimumValue=ruleSlotIntegerMinimumValue
	{ $current=$iv_ruleSlotIntegerMinimumValue.current; }
	EOF;

// Rule SlotIntegerMinimumValue
ruleSlotIntegerMinimumValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_exclusive_0_0=RULE_GT
				{
					newLeafNode(lv_exclusive_0_0, grammarAccess.getSlotIntegerMinimumValueAccess().getExclusiveGTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlotIntegerMinimumValueRule());
					}
					setWithLastConsumed(
						$current,
						"exclusive",
						lv_exclusive_0_0 != null,
						"com.b2international.snomed.ecl.Ecl.GT");
				}
			)
		)?
		this_HASH_1=RULE_HASH
		{
			newLeafNode(this_HASH_1, grammarAccess.getSlotIntegerMinimumValueAccess().getHASHTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlotIntegerMinimumValueAccess().getValueNonNegativeIntegerParserRuleCall_2_0());
				}
				lv_value_2_0=ruleNonNegativeInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlotIntegerMinimumValueRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSlotIntegerMaximumValue
entryRuleSlotIntegerMaximumValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlotIntegerMaximumValueRule()); }
	iv_ruleSlotIntegerMaximumValue=ruleSlotIntegerMaximumValue
	{ $current=$iv_ruleSlotIntegerMaximumValue.current; }
	EOF;

// Rule SlotIntegerMaximumValue
ruleSlotIntegerMaximumValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_exclusive_0_0=RULE_LT
				{
					newLeafNode(lv_exclusive_0_0, grammarAccess.getSlotIntegerMaximumValueAccess().getExclusiveLTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlotIntegerMaximumValueRule());
					}
					setWithLastConsumed(
						$current,
						"exclusive",
						lv_exclusive_0_0 != null,
						"com.b2international.snomed.ecl.Ecl.LT");
				}
			)
		)?
		this_HASH_1=RULE_HASH
		{
			newLeafNode(this_HASH_1, grammarAccess.getSlotIntegerMaximumValueAccess().getHASHTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlotIntegerMaximumValueAccess().getValueNonNegativeIntegerParserRuleCall_2_0());
				}
				lv_value_2_0=ruleNonNegativeInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlotIntegerMaximumValueRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSlotDecimal
entryRuleSlotDecimal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlotDecimalRule()); }
	iv_ruleSlotDecimal=ruleSlotDecimal
	{ $current=$iv_ruleSlotDecimal.current; }
	EOF;

// Rule SlotDecimal
ruleSlotDecimal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSlotDecimalAccess().getSlotDecimalRangeParserRuleCall_0());
		}
		this_SlotDecimalRange_0=ruleSlotDecimalRange
		{
			$current = $this_SlotDecimalRange_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSlotDecimalAccess().getSlotDecimalValueParserRuleCall_1());
		}
		this_SlotDecimalValue_1=ruleSlotDecimalValue
		{
			$current = $this_SlotDecimalValue_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSlotDecimalValue
entryRuleSlotDecimalValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlotDecimalValueRule()); }
	iv_ruleSlotDecimalValue=ruleSlotDecimalValue
	{ $current=$iv_ruleSlotDecimalValue.current; }
	EOF;

// Rule SlotDecimalValue
ruleSlotDecimalValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_HASH_0=RULE_HASH
		{
			newLeafNode(this_HASH_0, grammarAccess.getSlotDecimalValueAccess().getHASHTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlotDecimalValueAccess().getValueNonNegativeDecimalParserRuleCall_1_0());
				}
				lv_value_1_0=ruleNonNegativeDecimal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlotDecimalValueRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"com.b2international.snomed.ecl.Ecl.NonNegativeDecimal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSlotDecimalRange
entryRuleSlotDecimalRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlotDecimalRangeRule()); }
	iv_ruleSlotDecimalRange=ruleSlotDecimalRange
	{ $current=$iv_ruleSlotDecimalRange.current; }
	EOF;

// Rule SlotDecimalRange
ruleSlotDecimalRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSlotDecimalRangeAccess().getMinimumSlotDecimalMinimumValueParserRuleCall_0_0_0());
					}
					lv_minimum_0_0=ruleSlotDecimalMinimumValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlotDecimalRangeRule());
						}
						set(
							$current,
							"minimum",
							lv_minimum_0_0,
							"com.b2international.snomed.etl.Etl.SlotDecimalMinimumValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_TO_1=RULE_TO
			{
				newLeafNode(this_TO_1, grammarAccess.getSlotDecimalRangeAccess().getTOTerminalRuleCall_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlotDecimalRangeAccess().getMaximumSlotDecimalMaximumValueParserRuleCall_0_2_0());
					}
					lv_maximum_2_0=ruleSlotDecimalMaximumValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlotDecimalRangeRule());
						}
						set(
							$current,
							"maximum",
							lv_maximum_2_0,
							"com.b2international.snomed.etl.Etl.SlotDecimalMaximumValue");
						afterParserOrEnumRuleCall();
					}
				)
			)?
		)
		    |
		(
			this_TO_3=RULE_TO
			{
				newLeafNode(this_TO_3, grammarAccess.getSlotDecimalRangeAccess().getTOTerminalRuleCall_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlotDecimalRangeAccess().getMaximumSlotDecimalMaximumValueParserRuleCall_1_1_0());
					}
					lv_maximum_4_0=ruleSlotDecimalMaximumValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlotDecimalRangeRule());
						}
						set(
							$current,
							"maximum",
							lv_maximum_4_0,
							"com.b2international.snomed.etl.Etl.SlotDecimalMaximumValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSlotDecimalMinimumValue
entryRuleSlotDecimalMinimumValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlotDecimalMinimumValueRule()); }
	iv_ruleSlotDecimalMinimumValue=ruleSlotDecimalMinimumValue
	{ $current=$iv_ruleSlotDecimalMinimumValue.current; }
	EOF;

// Rule SlotDecimalMinimumValue
ruleSlotDecimalMinimumValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_exclusive_0_0=RULE_GT
				{
					newLeafNode(lv_exclusive_0_0, grammarAccess.getSlotDecimalMinimumValueAccess().getExclusiveGTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlotDecimalMinimumValueRule());
					}
					setWithLastConsumed(
						$current,
						"exclusive",
						lv_exclusive_0_0 != null,
						"com.b2international.snomed.ecl.Ecl.GT");
				}
			)
		)?
		this_HASH_1=RULE_HASH
		{
			newLeafNode(this_HASH_1, grammarAccess.getSlotDecimalMinimumValueAccess().getHASHTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlotDecimalMinimumValueAccess().getValueNonNegativeDecimalParserRuleCall_2_0());
				}
				lv_value_2_0=ruleNonNegativeDecimal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlotDecimalMinimumValueRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"com.b2international.snomed.ecl.Ecl.NonNegativeDecimal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSlotDecimalMaximumValue
entryRuleSlotDecimalMaximumValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlotDecimalMaximumValueRule()); }
	iv_ruleSlotDecimalMaximumValue=ruleSlotDecimalMaximumValue
	{ $current=$iv_ruleSlotDecimalMaximumValue.current; }
	EOF;

// Rule SlotDecimalMaximumValue
ruleSlotDecimalMaximumValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_exclusive_0_0=RULE_LT
				{
					newLeafNode(lv_exclusive_0_0, grammarAccess.getSlotDecimalMaximumValueAccess().getExclusiveLTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlotDecimalMaximumValueRule());
					}
					setWithLastConsumed(
						$current,
						"exclusive",
						lv_exclusive_0_0 != null,
						"com.b2international.snomed.ecl.Ecl.LT");
				}
			)
		)?
		this_HASH_1=RULE_HASH
		{
			newLeafNode(this_HASH_1, grammarAccess.getSlotDecimalMaximumValueAccess().getHASHTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlotDecimalMaximumValueAccess().getValueNonNegativeDecimalParserRuleCall_2_0());
				}
				lv_value_2_0=ruleNonNegativeDecimal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlotDecimalMaximumValueRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"com.b2international.snomed.ecl.Ecl.NonNegativeDecimal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExpressionConstraint
entryRuleExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionConstraintRule()); }
	iv_ruleExpressionConstraint=ruleExpressionConstraint
	{ $current=$iv_ruleExpressionConstraint.current; }
	EOF;

// Rule ExpressionConstraint
ruleExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getExpressionConstraintAccess().getOrExpressionConstraintParserRuleCall());
	}
	this_OrExpressionConstraint_0=ruleOrExpressionConstraint
	{
		$current = $this_OrExpressionConstraint_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOrExpressionConstraint
entryRuleOrExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrExpressionConstraintRule()); }
	iv_ruleOrExpressionConstraint=ruleOrExpressionConstraint
	{ $current=$iv_ruleOrExpressionConstraint.current; }
	EOF;

// Rule OrExpressionConstraint
ruleOrExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getAndExpressionConstraintParserRuleCall_0());
		}
		this_AndExpressionConstraint_0=ruleAndExpressionConstraint
		{
			$current = $this_AndExpressionConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0(),
						$current);
				}
			)
			this_DISJUNCTION_KEYWORD_2=RULE_DISJUNCTION_KEYWORD
			{
				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAndExpressionConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrExpressionConstraintRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.b2international.snomed.ecl.Ecl.AndExpressionConstraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndExpressionConstraint
entryRuleAndExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndExpressionConstraintRule()); }
	iv_ruleAndExpressionConstraint=ruleAndExpressionConstraint
	{ $current=$iv_ruleAndExpressionConstraint.current; }
	EOF;

// Rule AndExpressionConstraint
ruleAndExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall_0());
		}
		this_ExclusionExpressionConstraint_0=ruleExclusionExpressionConstraint
		{
			$current = $this_ExclusionExpressionConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0(),
						$current);
				}
			)
			(
				this_CONJUNCTION_KEYWORD_2=RULE_CONJUNCTION_KEYWORD
				{
					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
				}
				    |
				this_COMMA_3=RULE_COMMA
				{
					newLeafNode(this_COMMA_3, grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0());
					}
					lv_right_4_0=ruleExclusionExpressionConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndExpressionConstraintRule());
						}
						set(
							$current,
							"right",
							lv_right_4_0,
							"com.b2international.snomed.ecl.Ecl.ExclusionExpressionConstraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleExclusionExpressionConstraint
entryRuleExclusionExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExclusionExpressionConstraintRule()); }
	iv_ruleExclusionExpressionConstraint=ruleExclusionExpressionConstraint
	{ $current=$iv_ruleExclusionExpressionConstraint.current; }
	EOF;

// Rule ExclusionExpressionConstraint
ruleExclusionExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0());
		}
		this_RefinedExpressionConstraint_0=ruleRefinedExpressionConstraint
		{
			$current = $this_RefinedExpressionConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0(),
						$current);
				}
			)
			this_EXCLUSION_KEYWORD_2=RULE_EXCLUSION_KEYWORD
			{
				newLeafNode(this_EXCLUSION_KEYWORD_2, grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSION_KEYWORDTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleRefinedExpressionConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExclusionExpressionConstraintRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.b2international.snomed.ecl.Ecl.RefinedExpressionConstraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleRefinedExpressionConstraint
entryRuleRefinedExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefinedExpressionConstraintRule()); }
	iv_ruleRefinedExpressionConstraint=ruleRefinedExpressionConstraint
	{ $current=$iv_ruleRefinedExpressionConstraint.current; }
	EOF;

// Rule RefinedExpressionConstraint
ruleRefinedExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getRefinedExpressionConstraintAccess().getDottedExpressionConstraintParserRuleCall_0());
		}
		this_DottedExpressionConstraint_0=ruleDottedExpressionConstraint
		{
			$current = $this_DottedExpressionConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0(),
						$current);
				}
			)
			this_COLON_2=RULE_COLON
			{
				newLeafNode(this_COLON_2, grammarAccess.getRefinedExpressionConstraintAccess().getCOLONTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementEclRefinementParserRuleCall_1_2_0());
					}
					lv_refinement_3_0=ruleEclRefinement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRefinedExpressionConstraintRule());
						}
						set(
							$current,
							"refinement",
							lv_refinement_3_0,
							"com.b2international.snomed.ecl.Ecl.EclRefinement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleDottedExpressionConstraint
entryRuleDottedExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDottedExpressionConstraintRule()); }
	iv_ruleDottedExpressionConstraint=ruleDottedExpressionConstraint
	{ $current=$iv_ruleDottedExpressionConstraint.current; }
	EOF;

// Rule DottedExpressionConstraint
ruleDottedExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getSupplementExpressionConstraintParserRuleCall_0());
		}
		this_SupplementExpressionConstraint_0=ruleSupplementExpressionConstraint
		{
			$current = $this_SupplementExpressionConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0(),
						$current);
				}
			)
			this_DOT_2=RULE_DOT
			{
				newLeafNode(this_DOT_2, grammarAccess.getDottedExpressionConstraintAccess().getDOTTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSupplementExpressionConstraintParserRuleCall_1_2_0());
					}
					lv_attribute_3_0=ruleSupplementExpressionConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDottedExpressionConstraintRule());
						}
						set(
							$current,
							"attribute",
							lv_attribute_3_0,
							"com.b2international.snomed.ecl.Ecl.SupplementExpressionConstraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSupplementExpressionConstraint
entryRuleSupplementExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSupplementExpressionConstraintRule()); }
	iv_ruleSupplementExpressionConstraint=ruleSupplementExpressionConstraint
	{ $current=$iv_ruleSupplementExpressionConstraint.current; }
	EOF;

// Rule SupplementExpressionConstraint
ruleSupplementExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSupplementExpressionConstraintAccess().getFilteredExpressionConstraintParserRuleCall_0());
		}
		this_FilteredExpressionConstraint_0=ruleFilteredExpressionConstraint
		{
			$current = $this_FilteredExpressionConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getSupplementExpressionConstraintAccess().getSupplementExpressionConstraintConstraintAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSupplementExpressionConstraintAccess().getSupplementSupplementParserRuleCall_1_1_0());
					}
					lv_supplement_2_0=ruleSupplement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSupplementExpressionConstraintRule());
						}
						set(
							$current,
							"supplement",
							lv_supplement_2_0,
							"com.b2international.snomed.ecl.Ecl.Supplement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleFilteredExpressionConstraint
entryRuleFilteredExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilteredExpressionConstraintRule()); }
	iv_ruleFilteredExpressionConstraint=ruleFilteredExpressionConstraint
	{ $current=$iv_ruleFilteredExpressionConstraint.current; }
	EOF;

// Rule FilteredExpressionConstraint
ruleFilteredExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFilteredExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0());
		}
		this_SubExpressionConstraint_0=ruleSubExpressionConstraint
		{
			$current = $this_SubExpressionConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getFilteredExpressionConstraintAccess().getFilteredExpressionConstraintConstraintAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getFilteredExpressionConstraintAccess().getFilterFilterConstraintParserRuleCall_1_1_0());
					}
					lv_filter_2_0=ruleFilterConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFilteredExpressionConstraintRule());
						}
						set(
							$current,
							"filter",
							lv_filter_2_0,
							"com.b2international.snomed.ecl.Ecl.FilterConstraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSubExpressionConstraint
entryRuleSubExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubExpressionConstraintRule()); }
	iv_ruleSubExpressionConstraint=ruleSubExpressionConstraint
	{ $current=$iv_ruleSubExpressionConstraint.current; }
	EOF;

// Rule SubExpressionConstraint
ruleSubExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getChildOfParserRuleCall_0());
		}
		this_ChildOf_0=ruleChildOf
		{
			$current = $this_ChildOf_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getChildOrSelfOfParserRuleCall_1());
		}
		this_ChildOrSelfOf_1=ruleChildOrSelfOf
		{
			$current = $this_ChildOrSelfOf_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_2());
		}
		this_DescendantOf_2=ruleDescendantOf
		{
			$current = $this_DescendantOf_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_3());
		}
		this_DescendantOrSelfOf_3=ruleDescendantOrSelfOf
		{
			$current = $this_DescendantOrSelfOf_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_4());
		}
		this_ParentOf_4=ruleParentOf
		{
			$current = $this_ParentOf_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getParentOrSelfOfParserRuleCall_5());
		}
		this_ParentOrSelfOf_5=ruleParentOrSelfOf
		{
			$current = $this_ParentOrSelfOf_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_6());
		}
		this_AncestorOf_6=ruleAncestorOf
		{
			$current = $this_AncestorOf_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_7());
		}
		this_AncestorOrSelfOf_7=ruleAncestorOrSelfOf
		{
			$current = $this_AncestorOrSelfOf_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_8());
		}
		this_EclFocusConcept_8=ruleEclFocusConcept
		{
			$current = $this_EclFocusConcept_8.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEclFocusConcept
entryRuleEclFocusConcept returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEclFocusConceptRule()); }
	iv_ruleEclFocusConcept=ruleEclFocusConcept
	{ $current=$iv_ruleEclFocusConcept.current; }
	EOF;

// Rule EclFocusConcept
ruleEclFocusConcept returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getMemberOfParserRuleCall_0());
		}
		this_MemberOf_0=ruleMemberOf
		{
			$current = $this_MemberOf_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getEclConceptReferenceParserRuleCall_1());
		}
		this_EclConceptReference_1=ruleEclConceptReference
		{
			$current = $this_EclConceptReference_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getAnyParserRuleCall_2());
		}
		this_Any_2=ruleAny
		{
			$current = $this_Any_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_3());
		}
		this_NestedExpression_3=ruleNestedExpression
		{
			$current = $this_NestedExpression_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleChildOf
entryRuleChildOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChildOfRule()); }
	iv_ruleChildOf=ruleChildOf
	{ $current=$iv_ruleChildOf.current; }
	EOF;

// Rule ChildOf
ruleChildOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_LT_EM_0=RULE_LT_EM
		{
			newLeafNode(this_LT_EM_0, grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChildOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChildOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleChildOrSelfOf
entryRuleChildOrSelfOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChildOrSelfOfRule()); }
	iv_ruleChildOrSelfOf=ruleChildOrSelfOf
	{ $current=$iv_ruleChildOrSelfOf.current; }
	EOF;

// Rule ChildOrSelfOf
ruleChildOrSelfOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DBL_LT_EM_0=RULE_DBL_LT_EM
		{
			newLeafNode(this_DBL_LT_EM_0, grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChildOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChildOrSelfOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDescendantOf
entryRuleDescendantOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDescendantOfRule()); }
	iv_ruleDescendantOf=ruleDescendantOf
	{ $current=$iv_ruleDescendantOf.current; }
	EOF;

// Rule DescendantOf
ruleDescendantOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_LT_0=RULE_LT
		{
			newLeafNode(this_LT_0, grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDescendantOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDescendantOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDescendantOrSelfOf
entryRuleDescendantOrSelfOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDescendantOrSelfOfRule()); }
	iv_ruleDescendantOrSelfOf=ruleDescendantOrSelfOf
	{ $current=$iv_ruleDescendantOrSelfOf.current; }
	EOF;

// Rule DescendantOrSelfOf
ruleDescendantOrSelfOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DBL_LT_0=RULE_DBL_LT
		{
			newLeafNode(this_DBL_LT_0, grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDescendantOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDescendantOrSelfOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleParentOf
entryRuleParentOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParentOfRule()); }
	iv_ruleParentOf=ruleParentOf
	{ $current=$iv_ruleParentOf.current; }
	EOF;

// Rule ParentOf
ruleParentOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_GT_EM_0=RULE_GT_EM
		{
			newLeafNode(this_GT_EM_0, grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParentOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParentOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleParentOrSelfOf
entryRuleParentOrSelfOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParentOrSelfOfRule()); }
	iv_ruleParentOrSelfOf=ruleParentOrSelfOf
	{ $current=$iv_ruleParentOrSelfOf.current; }
	EOF;

// Rule ParentOrSelfOf
ruleParentOrSelfOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DBL_GT_EM_0=RULE_DBL_GT_EM
		{
			newLeafNode(this_DBL_GT_EM_0, grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParentOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParentOrSelfOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAncestorOf
entryRuleAncestorOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAncestorOfRule()); }
	iv_ruleAncestorOf=ruleAncestorOf
	{ $current=$iv_ruleAncestorOf.current; }
	EOF;

// Rule AncestorOf
ruleAncestorOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_GT_0=RULE_GT
		{
			newLeafNode(this_GT_0, grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAncestorOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAncestorOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAncestorOrSelfOf
entryRuleAncestorOrSelfOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAncestorOrSelfOfRule()); }
	iv_ruleAncestorOrSelfOf=ruleAncestorOrSelfOf
	{ $current=$iv_ruleAncestorOrSelfOf.current; }
	EOF;

// Rule AncestorOrSelfOf
ruleAncestorOrSelfOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DBL_GT_0=RULE_DBL_GT
		{
			newLeafNode(this_DBL_GT_0, grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAncestorOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAncestorOrSelfOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMemberOf
entryRuleMemberOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMemberOfRule()); }
	iv_ruleMemberOf=ruleMemberOf
	{ $current=$iv_ruleMemberOf.current; }
	EOF;

// Rule MemberOf
ruleMemberOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_CARET_0=RULE_CARET
		{
			newLeafNode(this_CARET_0, grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0());
		}
		(
			this_SQUARE_OPEN_1=RULE_SQUARE_OPEN
			{
				newLeafNode(this_SQUARE_OPEN_1, grammarAccess.getMemberOfAccess().getSQUARE_OPENTerminalRuleCall_1_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getMemberOfAccess().getRefsetFieldsUnquotedStringParserRuleCall_1_1_0_0());
						}
						lv_refsetFields_2_0=ruleUnquotedString
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMemberOfRule());
							}
							add(
								$current,
								"refsetFields",
								lv_refsetFields_2_0,
								"com.b2international.snomed.ecl.Ecl.UnquotedString");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					this_COMMA_3=RULE_COMMA
					{
						newLeafNode(this_COMMA_3, grammarAccess.getMemberOfAccess().getCOMMATerminalRuleCall_1_1_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getMemberOfAccess().getRefsetFieldsUnquotedStringParserRuleCall_1_1_1_1_0());
							}
							lv_refsetFields_4_0=ruleUnquotedString
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getMemberOfRule());
								}
								add(
									$current,
									"refsetFields",
									lv_refsetFields_4_0,
									"com.b2international.snomed.ecl.Ecl.UnquotedString");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
			this_SQUARE_CLOSE_5=RULE_SQUARE_CLOSE
			{
				newLeafNode(this_SQUARE_CLOSE_5, grammarAccess.getMemberOfAccess().getSQUARE_CLOSETerminalRuleCall_1_2());
			}
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_2_0_0());
					}
					lv_constraint_6_1=ruleEclConceptReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMemberOfRule());
						}
						set(
							$current,
							"constraint",
							lv_constraint_6_1,
							"com.b2international.snomed.ecl.Ecl.EclConceptReference");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_2_0_1());
					}
					lv_constraint_6_2=ruleAny
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMemberOfRule());
						}
						set(
							$current,
							"constraint",
							lv_constraint_6_2,
							"com.b2international.snomed.ecl.Ecl.Any");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_2_0_2());
					}
					lv_constraint_6_3=ruleNestedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMemberOfRule());
						}
						set(
							$current,
							"constraint",
							lv_constraint_6_3,
							"com.b2international.snomed.ecl.Ecl.NestedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleEclConceptReference
entryRuleEclConceptReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEclConceptReferenceRule()); }
	iv_ruleEclConceptReference=ruleEclConceptReference
	{ $current=$iv_ruleEclConceptReference.current; }
	EOF;

// Rule EclConceptReference
ruleEclConceptReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getEclConceptReferenceAccess().getIdIdentifierParserRuleCall_0_0());
				}
				lv_id_0_0=ruleIdentifier
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEclConceptReferenceRule());
					}
					set(
						$current,
						"id",
						lv_id_0_0,
						"com.b2international.snomed.ecl.Ecl.Identifier");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_WS_1=RULE_WS
			{
				newLeafNode(this_WS_1, grammarAccess.getEclConceptReferenceAccess().getWSTerminalRuleCall_1());
			}
		)*
		(
			(
				lv_term_2_0=RULE_PIPE_DELIMITED_STRING
				{
					newLeafNode(lv_term_2_0, grammarAccess.getEclConceptReferenceAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEclConceptReferenceRule());
					}
					setWithLastConsumed(
						$current,
						"term",
						lv_term_2_0,
						"com.b2international.snomed.ecl.Ecl.PIPE_DELIMITED_STRING");
				}
			)
		)?
	)
;

// Entry rule entryRuleEclConceptReferenceSet
entryRuleEclConceptReferenceSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEclConceptReferenceSetRule()); }
	iv_ruleEclConceptReferenceSet=ruleEclConceptReferenceSet
	{ $current=$iv_ruleEclConceptReferenceSet.current; }
	EOF;

// Rule EclConceptReferenceSet
ruleEclConceptReferenceSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ROUND_OPEN_0=RULE_ROUND_OPEN
		{
			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getEclConceptReferenceSetAccess().getROUND_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEclConceptReferenceSetAccess().getConceptsEclConceptReferenceParserRuleCall_1_0());
				}
				lv_concepts_1_0=ruleEclConceptReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEclConceptReferenceSetRule());
					}
					add(
						$current,
						"concepts",
						lv_concepts_1_0,
						"com.b2international.snomed.ecl.Ecl.EclConceptReference");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_ROUND_CLOSE_2=RULE_ROUND_CLOSE
		{
			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getEclConceptReferenceSetAccess().getROUND_CLOSETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleAny
entryRuleAny returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnyRule()); }
	iv_ruleAny=ruleAny
	{ $current=$iv_ruleAny.current; }
	EOF;

// Rule Any
ruleAny returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_WILDCARD_0=RULE_WILDCARD
		{
			newLeafNode(this_WILDCARD_0, grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0());
		}
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getAnyAccess().getAnyAction_1(),
					$current);
			}
		)
	)
;

// Entry rule entryRuleEclRefinement
entryRuleEclRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEclRefinementRule()); }
	iv_ruleEclRefinement=ruleEclRefinement
	{ $current=$iv_ruleEclRefinement.current; }
	EOF;

// Rule EclRefinement
ruleEclRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getEclRefinementAccess().getOrRefinementParserRuleCall());
	}
	this_OrRefinement_0=ruleOrRefinement
	{
		$current = $this_OrRefinement_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOrRefinement
entryRuleOrRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrRefinementRule()); }
	iv_ruleOrRefinement=ruleOrRefinement
	{ $current=$iv_ruleOrRefinement.current; }
	EOF;

// Rule OrRefinement
ruleOrRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getOrRefinementAccess().getAndRefinementParserRuleCall_0());
		}
		this_AndRefinement_0=ruleAndRefinement
		{
			$current = $this_AndRefinement_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(RULE_DISJUNCTION_KEYWORD)=>
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0(),
							$current);
					}
				)
				this_DISJUNCTION_KEYWORD_2=RULE_DISJUNCTION_KEYWORD
				{
					newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getOrRefinementAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0());
						}
						lv_right_3_0=ruleAndRefinement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getOrRefinementRule());
							}
							set(
								$current,
								"right",
								lv_right_3_0,
								"com.b2international.snomed.ecl.Ecl.AndRefinement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleAndRefinement
entryRuleAndRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndRefinementRule()); }
	iv_ruleAndRefinement=ruleAndRefinement
	{ $current=$iv_ruleAndRefinement.current; }
	EOF;

// Rule AndRefinement
ruleAndRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAndRefinementAccess().getSubRefinementParserRuleCall_0());
		}
		this_SubRefinement_0=ruleSubRefinement
		{
			$current = $this_SubRefinement_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(RULE_CONJUNCTION_KEYWORD | RULE_COMMA)=>
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0(),
							$current);
					}
				)
				(
					this_CONJUNCTION_KEYWORD_2=RULE_CONJUNCTION_KEYWORD
					{
						newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndRefinementAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0());
					}
					    |
					this_COMMA_3=RULE_COMMA
					{
						newLeafNode(this_COMMA_3, grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1());
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0());
						}
						lv_right_4_0=ruleSubRefinement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAndRefinementRule());
							}
							set(
								$current,
								"right",
								lv_right_4_0,
								"com.b2international.snomed.ecl.Ecl.SubRefinement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleSubRefinement
entryRuleSubRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubRefinementRule()); }
	iv_ruleSubRefinement=ruleSubRefinement
	{ $current=$iv_ruleSubRefinement.current; }
	EOF;

// Rule SubRefinement
ruleSubRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0());
		}
		this_AttributeConstraint_0=ruleAttributeConstraint
		{
			$current = $this_AttributeConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubRefinementAccess().getEclAttributeGroupParserRuleCall_1());
		}
		this_EclAttributeGroup_1=ruleEclAttributeGroup
		{
			$current = $this_EclAttributeGroup_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubRefinementAccess().getNestedRefinementParserRuleCall_2());
		}
		this_NestedRefinement_2=ruleNestedRefinement
		{
			$current = $this_NestedRefinement_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNestedRefinement
entryRuleNestedRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedRefinementRule()); }
	iv_ruleNestedRefinement=ruleNestedRefinement
	{ $current=$iv_ruleNestedRefinement.current; }
	EOF;

// Rule NestedRefinement
ruleNestedRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ROUND_OPEN_0=RULE_ROUND_OPEN
		{
			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0());
				}
				lv_nested_1_0=ruleEclRefinement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedRefinementRule());
					}
					set(
						$current,
						"nested",
						lv_nested_1_0,
						"com.b2international.snomed.ecl.Ecl.EclRefinement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_ROUND_CLOSE_2=RULE_ROUND_CLOSE
		{
			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedRefinementAccess().getROUND_CLOSETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleEclAttributeGroup
entryRuleEclAttributeGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEclAttributeGroupRule()); }
	iv_ruleEclAttributeGroup=ruleEclAttributeGroup
	{ $current=$iv_ruleEclAttributeGroup.current; }
	EOF;

// Rule EclAttributeGroup
ruleEclAttributeGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getEclAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0());
				}
				lv_cardinality_0_0=ruleCardinality
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEclAttributeGroupRule());
					}
					set(
						$current,
						"cardinality",
						lv_cardinality_0_0,
						"com.b2international.snomed.ecl.Ecl.Cardinality");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		this_CURLY_OPEN_1=RULE_CURLY_OPEN
		{
			newLeafNode(this_CURLY_OPEN_1, grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0());
				}
				lv_refinement_2_0=ruleEclAttributeSet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEclAttributeGroupRule());
					}
					set(
						$current,
						"refinement",
						lv_refinement_2_0,
						"com.b2international.snomed.ecl.Ecl.EclAttributeSet");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_CURLY_CLOSE_3=RULE_CURLY_CLOSE
		{
			newLeafNode(this_CURLY_CLOSE_3, grammarAccess.getEclAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3());
		}
	)
;

// Entry rule entryRuleEclAttributeSet
entryRuleEclAttributeSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEclAttributeSetRule()); }
	iv_ruleEclAttributeSet=ruleEclAttributeSet
	{ $current=$iv_ruleEclAttributeSet.current; }
	EOF;

// Rule EclAttributeSet
ruleEclAttributeSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getEclAttributeSetAccess().getOrAttributeSetParserRuleCall());
	}
	this_OrAttributeSet_0=ruleOrAttributeSet
	{
		$current = $this_OrAttributeSet_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOrAttributeSet
entryRuleOrAttributeSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrAttributeSetRule()); }
	iv_ruleOrAttributeSet=ruleOrAttributeSet
	{ $current=$iv_ruleOrAttributeSet.current; }
	EOF;

// Rule OrAttributeSet
ruleOrAttributeSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getOrAttributeSetAccess().getAndAttributeSetParserRuleCall_0());
		}
		this_AndAttributeSet_0=ruleAndAttributeSet
		{
			$current = $this_AndAttributeSet_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0(),
						$current);
				}
			)
			this_DISJUNCTION_KEYWORD_2=RULE_DISJUNCTION_KEYWORD
			{
				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getOrAttributeSetAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAndAttributeSet
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrAttributeSetRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.b2international.snomed.ecl.Ecl.AndAttributeSet");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndAttributeSet
entryRuleAndAttributeSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndAttributeSetRule()); }
	iv_ruleAndAttributeSet=ruleAndAttributeSet
	{ $current=$iv_ruleAndAttributeSet.current; }
	EOF;

// Rule AndAttributeSet
ruleAndAttributeSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAndAttributeSetAccess().getSubAttributeSetParserRuleCall_0());
		}
		this_SubAttributeSet_0=ruleSubAttributeSet
		{
			$current = $this_SubAttributeSet_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0(),
						$current);
				}
			)
			(
				this_CONJUNCTION_KEYWORD_2=RULE_CONJUNCTION_KEYWORD
				{
					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndAttributeSetAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
				}
				    |
				this_COMMA_3=RULE_COMMA
				{
					newLeafNode(this_COMMA_3, grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0());
					}
					lv_right_4_0=ruleSubAttributeSet
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndAttributeSetRule());
						}
						set(
							$current,
							"right",
							lv_right_4_0,
							"com.b2international.snomed.ecl.Ecl.SubAttributeSet");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSubAttributeSet
entryRuleSubAttributeSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubAttributeSetRule()); }
	iv_ruleSubAttributeSet=ruleSubAttributeSet
	{ $current=$iv_ruleSubAttributeSet.current; }
	EOF;

// Rule SubAttributeSet
ruleSubAttributeSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0());
		}
		this_AttributeConstraint_0=ruleAttributeConstraint
		{
			$current = $this_AttributeConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubAttributeSetAccess().getNestedAttributeSetParserRuleCall_1());
		}
		this_NestedAttributeSet_1=ruleNestedAttributeSet
		{
			$current = $this_NestedAttributeSet_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNestedAttributeSet
entryRuleNestedAttributeSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedAttributeSetRule()); }
	iv_ruleNestedAttributeSet=ruleNestedAttributeSet
	{ $current=$iv_ruleNestedAttributeSet.current; }
	EOF;

// Rule NestedAttributeSet
ruleNestedAttributeSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ROUND_OPEN_0=RULE_ROUND_OPEN
		{
			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0());
				}
				lv_nested_1_0=ruleEclAttributeSet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedAttributeSetRule());
					}
					set(
						$current,
						"nested",
						lv_nested_1_0,
						"com.b2international.snomed.ecl.Ecl.EclAttributeSet");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_ROUND_CLOSE_2=RULE_ROUND_CLOSE
		{
			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedAttributeSetAccess().getROUND_CLOSETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleAttributeConstraint
entryRuleAttributeConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeConstraintRule()); }
	iv_ruleAttributeConstraint=ruleAttributeConstraint
	{ $current=$iv_ruleAttributeConstraint.current; }
	EOF;

// Rule AttributeConstraint
ruleAttributeConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0());
				}
				lv_cardinality_0_0=ruleCardinality
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
					}
					set(
						$current,
						"cardinality",
						lv_cardinality_0_0,
						"com.b2international.snomed.ecl.Ecl.Cardinality");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_reversed_1_0=RULE_REVERSED
				{
					newLeafNode(lv_reversed_1_0, grammarAccess.getAttributeConstraintAccess().getReversedREVERSEDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeConstraintRule());
					}
					setWithLastConsumed(
						$current,
						"reversed",
						lv_reversed_1_0 != null,
						"com.b2international.snomed.ecl.Ecl.REVERSED");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_2_0());
				}
				lv_attribute_2_0=ruleFilteredExpressionConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
					}
					set(
						$current,
						"attribute",
						lv_attribute_2_0,
						"com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getComparisonComparisonParserRuleCall_3_0());
				}
				lv_comparison_3_0=ruleComparison
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
					}
					set(
						$current,
						"comparison",
						lv_comparison_3_0,
						"com.b2international.snomed.ecl.Ecl.Comparison");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleCardinality
entryRuleCardinality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCardinalityRule()); }
	iv_ruleCardinality=ruleCardinality
	{ $current=$iv_ruleCardinality.current; }
	EOF;

// Rule Cardinality
ruleCardinality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_SQUARE_OPEN_0=RULE_SQUARE_OPEN
		{
			newLeafNode(this_SQUARE_OPEN_0, grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0());
				}
				lv_min_1_0=ruleNonNegativeInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardinalityRule());
					}
					set(
						$current,
						"min",
						lv_min_1_0,
						"com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_TO_2=RULE_TO
		{
			newLeafNode(this_TO_2, grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0());
				}
				lv_max_3_0=ruleMaxValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardinalityRule());
					}
					set(
						$current,
						"max",
						lv_max_3_0,
						"com.b2international.snomed.ecl.Ecl.MaxValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_SQUARE_CLOSE_4=RULE_SQUARE_CLOSE
		{
			newLeafNode(this_SQUARE_CLOSE_4, grammarAccess.getCardinalityAccess().getSQUARE_CLOSETerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleComparison
entryRuleComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparisonRule()); }
	iv_ruleComparison=ruleComparison
	{ $current=$iv_ruleComparison.current; }
	EOF;

// Rule Comparison
ruleComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getComparisonAccess().getAttributeComparisonParserRuleCall_0());
		}
		this_AttributeComparison_0=ruleAttributeComparison
		{
			$current = $this_AttributeComparison_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getComparisonAccess().getDataTypeComparisonParserRuleCall_1());
		}
		this_DataTypeComparison_1=ruleDataTypeComparison
		{
			$current = $this_DataTypeComparison_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAttributeComparison
entryRuleAttributeComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeComparisonRule()); }
	iv_ruleAttributeComparison=ruleAttributeComparison
	{ $current=$iv_ruleAttributeComparison.current; }
	EOF;

// Rule AttributeComparison
ruleAttributeComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
				}
				lv_op_0_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeComparisonRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeComparisonAccess().getValueFilteredExpressionConstraintParserRuleCall_1_0());
				}
				lv_value_1_0=ruleFilteredExpressionConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeComparisonRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDataTypeComparison
entryRuleDataTypeComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeComparisonRule()); }
	iv_ruleDataTypeComparison=ruleDataTypeComparison
	{ $current=$iv_ruleDataTypeComparison.current; }
	EOF;

// Rule DataTypeComparison
ruleDataTypeComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getBooleanValueComparisonParserRuleCall_0());
		}
		this_BooleanValueComparison_0=ruleBooleanValueComparison
		{
			$current = $this_BooleanValueComparison_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getStringValueComparisonParserRuleCall_1());
		}
		this_StringValueComparison_1=ruleStringValueComparison
		{
			$current = $this_StringValueComparison_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueComparisonParserRuleCall_2());
		}
		this_IntegerValueComparison_2=ruleIntegerValueComparison
		{
			$current = $this_IntegerValueComparison_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueComparisonParserRuleCall_3());
		}
		this_DecimalValueComparison_3=ruleDecimalValueComparison
		{
			$current = $this_DecimalValueComparison_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBooleanValueComparison
entryRuleBooleanValueComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanValueComparisonRule()); }
	iv_ruleBooleanValueComparison=ruleBooleanValueComparison
	{ $current=$iv_ruleBooleanValueComparison.current; }
	EOF;

// Rule BooleanValueComparison
ruleBooleanValueComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBooleanValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
				}
				lv_op_0_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBooleanValueComparisonRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBooleanValueComparisonAccess().getValueBooleanParserRuleCall_1_0());
				}
				lv_value_1_0=ruleBoolean
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBooleanValueComparisonRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"com.b2international.snomed.ecl.Ecl.Boolean");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStringValueComparison
entryRuleStringValueComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringValueComparisonRule()); }
	iv_ruleStringValueComparison=ruleStringValueComparison
	{ $current=$iv_ruleStringValueComparison.current; }
	EOF;

// Rule StringValueComparison
ruleStringValueComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStringValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
				}
				lv_op_0_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStringValueComparisonRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStringValueComparisonAccess().getValueSearchTermParserRuleCall_1_0());
				}
				lv_value_1_0=ruleSearchTerm
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStringValueComparisonRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"com.b2international.snomed.ecl.Ecl.SearchTerm");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleIntegerValueComparison
entryRuleIntegerValueComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerValueComparisonRule()); }
	iv_ruleIntegerValueComparison=ruleIntegerValueComparison
	{ $current=$iv_ruleIntegerValueComparison.current; }
	EOF;

// Rule IntegerValueComparison
ruleIntegerValueComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getIntegerValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0());
				}
				lv_op_0_0=ruleNUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntegerValueComparisonRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"com.b2international.snomed.ecl.Ecl.NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_HASH_1=RULE_HASH
		{
			newLeafNode(this_HASH_1, grammarAccess.getIntegerValueComparisonAccess().getHASHTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIntegerValueComparisonAccess().getValueIntegerParserRuleCall_2_0());
				}
				lv_value_2_0=ruleInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntegerValueComparisonRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"com.b2international.snomed.ecl.Ecl.Integer");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDecimalValueComparison
entryRuleDecimalValueComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDecimalValueComparisonRule()); }
	iv_ruleDecimalValueComparison=ruleDecimalValueComparison
	{ $current=$iv_ruleDecimalValueComparison.current; }
	EOF;

// Rule DecimalValueComparison
ruleDecimalValueComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDecimalValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0());
				}
				lv_op_0_0=ruleNUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDecimalValueComparisonRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"com.b2international.snomed.ecl.Ecl.NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_HASH_1=RULE_HASH
		{
			newLeafNode(this_HASH_1, grammarAccess.getDecimalValueComparisonAccess().getHASHTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDecimalValueComparisonAccess().getValueDecimalParserRuleCall_2_0());
				}
				lv_value_2_0=ruleDecimal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDecimalValueComparisonRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"com.b2international.snomed.ecl.Ecl.Decimal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNestedExpression
entryRuleNestedExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedExpressionRule()); }
	iv_ruleNestedExpression=ruleNestedExpression
	{ $current=$iv_ruleNestedExpression.current; }
	EOF;

// Rule NestedExpression
ruleNestedExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ROUND_OPEN_0=RULE_ROUND_OPEN
		{
			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0());
				}
				lv_nested_1_0=ruleExpressionConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedExpressionRule());
					}
					set(
						$current,
						"nested",
						lv_nested_1_0,
						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_ROUND_CLOSE_2=RULE_ROUND_CLOSE
		{
			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedExpressionAccess().getROUND_CLOSETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleFilterConstraint
entryRuleFilterConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterConstraintRule()); }
	iv_ruleFilterConstraint=ruleFilterConstraint
	{ $current=$iv_ruleFilterConstraint.current; }
	EOF;

// Rule FilterConstraint
ruleFilterConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DOUBLE_CURLY_OPEN_0=RULE_DOUBLE_CURLY_OPEN
		{
			newLeafNode(this_DOUBLE_CURLY_OPEN_0, grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFilterConstraintAccess().getDomainSHORT_DOMAINParserRuleCall_1_0());
				}
				lv_domain_1_0=ruleSHORT_DOMAIN
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFilterConstraintRule());
					}
					set(
						$current,
						"domain",
						lv_domain_1_0,
						"com.b2international.snomed.ecl.Ecl.SHORT_DOMAIN");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFilterConstraintAccess().getFilterFilterParserRuleCall_2_0());
				}
				lv_filter_2_0=ruleFilter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFilterConstraintRule());
					}
					set(
						$current,
						"filter",
						lv_filter_2_0,
						"com.b2international.snomed.ecl.Ecl.Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_DOUBLE_CURLY_CLOSE_3=RULE_DOUBLE_CURLY_CLOSE
		{
			newLeafNode(this_DOUBLE_CURLY_CLOSE_3, grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_3());
		}
	)
;

// Entry rule entryRuleFilter
entryRuleFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterRule()); }
	iv_ruleFilter=ruleFilter
	{ $current=$iv_ruleFilter.current; }
	EOF;

// Rule Filter
ruleFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getFilterAccess().getDisjunctionFilterParserRuleCall());
	}
	this_DisjunctionFilter_0=ruleDisjunctionFilter
	{
		$current = $this_DisjunctionFilter_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleDisjunctionFilter
entryRuleDisjunctionFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDisjunctionFilterRule()); }
	iv_ruleDisjunctionFilter=ruleDisjunctionFilter
	{ $current=$iv_ruleDisjunctionFilter.current; }
	EOF;

// Rule DisjunctionFilter
ruleDisjunctionFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDisjunctionFilterAccess().getConjunctionFilterParserRuleCall_0());
		}
		this_ConjunctionFilter_0=ruleConjunctionFilter
		{
			$current = $this_ConjunctionFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getDisjunctionFilterAccess().getDisjunctionFilterLeftAction_1_0(),
						$current);
				}
			)
			this_DISJUNCTION_KEYWORD_2=RULE_DISJUNCTION_KEYWORD
			{
				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getDisjunctionFilterAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDisjunctionFilterAccess().getRightConjunctionFilterParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleConjunctionFilter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDisjunctionFilterRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.b2international.snomed.ecl.Ecl.ConjunctionFilter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleConjunctionFilter
entryRuleConjunctionFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConjunctionFilterRule()); }
	iv_ruleConjunctionFilter=ruleConjunctionFilter
	{ $current=$iv_ruleConjunctionFilter.current; }
	EOF;

// Rule ConjunctionFilter
ruleConjunctionFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getConjunctionFilterAccess().getPropertyFilterParserRuleCall_0());
		}
		this_PropertyFilter_0=rulePropertyFilter
		{
			$current = $this_PropertyFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getConjunctionFilterAccess().getConjunctionFilterLeftAction_1_0(),
						$current);
				}
			)
			(
				this_CONJUNCTION_KEYWORD_2=RULE_CONJUNCTION_KEYWORD
				{
					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getConjunctionFilterAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
				}
				    |
				this_COMMA_3=RULE_COMMA
				{
					newLeafNode(this_COMMA_3, grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getConjunctionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0());
					}
					lv_right_4_0=rulePropertyFilter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConjunctionFilterRule());
						}
						set(
							$current,
							"right",
							lv_right_4_0,
							"com.b2international.snomed.ecl.Ecl.PropertyFilter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleNestedFilter
entryRuleNestedFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedFilterRule()); }
	iv_ruleNestedFilter=ruleNestedFilter
	{ $current=$iv_ruleNestedFilter.current; }
	EOF;

// Rule NestedFilter
ruleNestedFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ROUND_OPEN_0=RULE_ROUND_OPEN
		{
			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNestedFilterAccess().getNestedFilterParserRuleCall_1_0());
				}
				lv_nested_1_0=ruleFilter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedFilterRule());
					}
					set(
						$current,
						"nested",
						lv_nested_1_0,
						"com.b2international.snomed.ecl.Ecl.Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_ROUND_CLOSE_2=RULE_ROUND_CLOSE
		{
			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedFilterAccess().getROUND_CLOSETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRulePropertyFilter
entryRulePropertyFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyFilterRule()); }
	iv_rulePropertyFilter=rulePropertyFilter
	{ $current=$iv_rulePropertyFilter.current; }
	EOF;

// Rule PropertyFilter
rulePropertyFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getTermFilterParserRuleCall_0());
		}
		this_TermFilter_0=ruleTermFilter
		{
			$current = $this_TermFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getLanguageFilterParserRuleCall_1());
		}
		this_LanguageFilter_1=ruleLanguageFilter
		{
			$current = $this_LanguageFilter_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getTypeFilterParserRuleCall_2());
		}
		this_TypeFilter_2=ruleTypeFilter
		{
			$current = $this_TypeFilter_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getDialectFilterParserRuleCall_3());
		}
		this_DialectFilter_3=ruleDialectFilter
		{
			$current = $this_DialectFilter_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getIdFilterParserRuleCall_4());
		}
		this_IdFilter_4=ruleIdFilter
		{
			$current = $this_IdFilter_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getDefinitionStatusFilterParserRuleCall_5());
		}
		this_DefinitionStatusFilter_5=ruleDefinitionStatusFilter
		{
			$current = $this_DefinitionStatusFilter_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getModuleFilterParserRuleCall_6());
		}
		this_ModuleFilter_6=ruleModuleFilter
		{
			$current = $this_ModuleFilter_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getEffectiveTimeFilterParserRuleCall_7());
		}
		this_EffectiveTimeFilter_7=ruleEffectiveTimeFilter
		{
			$current = $this_EffectiveTimeFilter_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getActiveFilterParserRuleCall_8());
		}
		this_ActiveFilter_8=ruleActiveFilter
		{
			$current = $this_ActiveFilter_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getSemanticTagFilterParserRuleCall_9());
		}
		this_SemanticTagFilter_9=ruleSemanticTagFilter
		{
			$current = $this_SemanticTagFilter_9.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getPreferredInFilterParserRuleCall_10());
		}
		this_PreferredInFilter_10=rulePreferredInFilter
		{
			$current = $this_PreferredInFilter_10.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getAcceptableInFilterParserRuleCall_11());
		}
		this_AcceptableInFilter_11=ruleAcceptableInFilter
		{
			$current = $this_AcceptableInFilter_11.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getLanguageRefSetFilterParserRuleCall_12());
		}
		this_LanguageRefSetFilter_12=ruleLanguageRefSetFilter
		{
			$current = $this_LanguageRefSetFilter_12.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getCaseSignificanceFilterParserRuleCall_13());
		}
		this_CaseSignificanceFilter_13=ruleCaseSignificanceFilter
		{
			$current = $this_CaseSignificanceFilter_13.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getMemberFieldFilterParserRuleCall_14());
		}
		this_MemberFieldFilter_14=ruleMemberFieldFilter
		{
			$current = $this_MemberFieldFilter_14.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_15());
		}
		this_NestedFilter_15=ruleNestedFilter
		{
			$current = $this_NestedFilter_15.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMemberFieldFilter
entryRuleMemberFieldFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMemberFieldFilterRule()); }
	iv_ruleMemberFieldFilter=ruleMemberFieldFilter
	{ $current=$iv_ruleMemberFieldFilter.current; }
	EOF;

// Rule MemberFieldFilter
ruleMemberFieldFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMemberFieldFilterAccess().getRefsetFieldNameUnquotedStringParserRuleCall_0_0());
				}
				lv_refsetFieldName_0_0=ruleUnquotedString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMemberFieldFilterRule());
					}
					set(
						$current,
						"refsetFieldName",
						lv_refsetFieldName_0_0,
						"com.b2international.snomed.ecl.Ecl.UnquotedString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMemberFieldFilterAccess().getComparisonComparisonParserRuleCall_1_0());
				}
				lv_comparison_1_0=ruleComparison
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMemberFieldFilterRule());
					}
					set(
						$current,
						"comparison",
						lv_comparison_1_0,
						"com.b2international.snomed.ecl.Ecl.Comparison");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleIdFilter
entryRuleIdFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIdFilterRule()); }
	iv_ruleIdFilter=ruleIdFilter
	{ $current=$iv_ruleIdFilter.current; }
	EOF;

// Rule IdFilter
ruleIdFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_KEYWORD_0=RULE_ID_KEYWORD
		{
			newLeafNode(this_ID_KEYWORD_0, grammarAccess.getIdFilterAccess().getID_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIdFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getIdFilterAccess().getIdsIdentifierParserRuleCall_2_0_0());
					}
					lv_ids_2_0=ruleIdentifier
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIdFilterRule());
						}
						add(
							$current,
							"ids",
							lv_ids_2_0,
							"com.b2international.snomed.ecl.Ecl.Identifier");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				this_ROUND_OPEN_3=RULE_ROUND_OPEN
				{
					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getIdFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getIdFilterAccess().getIdsIdentifierParserRuleCall_2_1_1_0());
						}
						lv_ids_4_0=ruleIdentifier
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getIdFilterRule());
							}
							add(
								$current,
								"ids",
								lv_ids_4_0,
								"com.b2international.snomed.ecl.Ecl.Identifier");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				this_ROUND_CLOSE_5=RULE_ROUND_CLOSE
				{
					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getIdFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
				}
			)
		)
	)
;

// Entry rule entryRuleTermFilter
entryRuleTermFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTermFilterRule()); }
	iv_ruleTermFilter=ruleTermFilter
	{ $current=$iv_ruleTermFilter.current; }
	EOF;

// Rule TermFilter
ruleTermFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_TERM_KEYWORD_0=RULE_TERM_KEYWORD
		{
			newLeafNode(this_TERM_KEYWORD_0, grammarAccess.getTermFilterAccess().getTERM_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTermFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTermFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTermFilterAccess().getSearchTermSearchTermParserRuleCall_2_0());
				}
				lv_searchTerm_2_0=ruleSearchTerm
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTermFilterRule());
					}
					set(
						$current,
						"searchTerm",
						lv_searchTerm_2_0,
						"com.b2international.snomed.ecl.Ecl.SearchTerm");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSearchTerm
entryRuleSearchTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSearchTermRule()); }
	iv_ruleSearchTerm=ruleSearchTerm
	{ $current=$iv_ruleSearchTerm.current; }
	EOF;

// Rule SearchTerm
ruleSearchTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSearchTermAccess().getTypedSearchTermParserRuleCall_0());
		}
		this_TypedSearchTerm_0=ruleTypedSearchTerm
		{
			$current = $this_TypedSearchTerm_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSearchTermAccess().getTypedSearchTermSetParserRuleCall_1());
		}
		this_TypedSearchTermSet_1=ruleTypedSearchTermSet
		{
			$current = $this_TypedSearchTermSet_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTypedSearchTerm
entryRuleTypedSearchTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypedSearchTermRule()); }
	iv_ruleTypedSearchTerm=ruleTypedSearchTerm
	{ $current=$iv_ruleTypedSearchTerm.current; }
	EOF;

// Rule TypedSearchTerm
ruleTypedSearchTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getTypedSearchTermAccess().getClauseTypedSearchTermClauseParserRuleCall_0());
			}
			lv_clause_0_0=ruleTypedSearchTermClause
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getTypedSearchTermRule());
				}
				set(
					$current,
					"clause",
					lv_clause_0_0,
					"com.b2international.snomed.ecl.Ecl.TypedSearchTermClause");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleTypedSearchTermSet
entryRuleTypedSearchTermSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypedSearchTermSetRule()); }
	iv_ruleTypedSearchTermSet=ruleTypedSearchTermSet
	{ $current=$iv_ruleTypedSearchTermSet.current; }
	EOF;

// Rule TypedSearchTermSet
ruleTypedSearchTermSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ROUND_OPEN_0=RULE_ROUND_OPEN
		{
			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getTypedSearchTermSetAccess().getROUND_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTypedSearchTermSetAccess().getClausesTypedSearchTermClauseParserRuleCall_1_0());
				}
				lv_clauses_1_0=ruleTypedSearchTermClause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypedSearchTermSetRule());
					}
					add(
						$current,
						"clauses",
						lv_clauses_1_0,
						"com.b2international.snomed.ecl.Ecl.TypedSearchTermClause");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_ROUND_CLOSE_2=RULE_ROUND_CLOSE
		{
			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getTypedSearchTermSetAccess().getROUND_CLOSETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleTypedSearchTermClause
entryRuleTypedSearchTermClause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypedSearchTermClauseRule()); }
	iv_ruleTypedSearchTermClause=ruleTypedSearchTermClause
	{ $current=$iv_ruleTypedSearchTermClause.current; }
	EOF;

// Rule TypedSearchTermClause
ruleTypedSearchTermClause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getTypedSearchTermClauseAccess().getLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_0_0_0_0());
						}
						lv_lexicalSearchType_0_0=ruleLEXICAL_SEARCH_TYPE
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTypedSearchTermClauseRule());
							}
							set(
								$current,
								"lexicalSearchType",
								lv_lexicalSearchType_0_0,
								"com.b2international.snomed.ecl.Ecl.LEXICAL_SEARCH_TYPE");
							afterParserOrEnumRuleCall();
						}
					)
				)
				this_COLON_1=RULE_COLON
				{
					newLeafNode(this_COLON_1, grammarAccess.getTypedSearchTermClauseAccess().getCOLONTerminalRuleCall_0_0_1());
				}
			)?
			(
				(
					lv_term_2_0=RULE_STRING
					{
						newLeafNode(lv_term_2_0, grammarAccess.getTypedSearchTermClauseAccess().getTermSTRINGTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypedSearchTermClauseRule());
						}
						setWithLastConsumed(
							$current,
							"term",
							lv_term_2_0,
							"com.b2international.snomed.ecl.Ecl.STRING");
					}
				)
			)
		)
		    |
		(
			(
				(
					lv_lexicalSearchType_3_0=RULE_REGEX_KEYWORD
					{
						newLeafNode(lv_lexicalSearchType_3_0, grammarAccess.getTypedSearchTermClauseAccess().getLexicalSearchTypeREGEX_KEYWORDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypedSearchTermClauseRule());
						}
						setWithLastConsumed(
							$current,
							"lexicalSearchType",
							lv_lexicalSearchType_3_0,
							"com.b2international.snomed.ecl.Ecl.REGEX_KEYWORD");
					}
				)
			)
			this_COLON_4=RULE_COLON
			{
				newLeafNode(this_COLON_4, grammarAccess.getTypedSearchTermClauseAccess().getCOLONTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTypedSearchTermClauseAccess().getTermRegularExpressionParserRuleCall_1_2_0());
					}
					lv_term_5_0=ruleRegularExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypedSearchTermClauseRule());
						}
						set(
							$current,
							"term",
							lv_term_5_0,
							"com.b2international.snomed.ecl.Ecl.RegularExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleRegularExpression
entryRuleRegularExpression returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRegularExpressionRule()); }
	iv_ruleRegularExpression=ruleRegularExpression
	{ $current=$iv_ruleRegularExpression.current.getText(); }
	EOF;

// Rule RegularExpression
ruleRegularExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getRegularExpressionAccess().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleLanguageFilter
entryRuleLanguageFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLanguageFilterRule()); }
	iv_ruleLanguageFilter=ruleLanguageFilter
	{ $current=$iv_ruleLanguageFilter.current; }
	EOF;

// Rule LanguageFilter
ruleLanguageFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_LANGUAGE_KEYWORD_0=RULE_LANGUAGE_KEYWORD
		{
			newLeafNode(this_LANGUAGE_KEYWORD_0, grammarAccess.getLanguageFilterAccess().getLANGUAGE_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLanguageFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLanguageFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_0_0());
					}
					lv_languageCodes_2_0=ruleUnquotedString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLanguageFilterRule());
						}
						add(
							$current,
							"languageCodes",
							lv_languageCodes_2_0,
							"com.b2international.snomed.ecl.Ecl.UnquotedString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				this_ROUND_OPEN_3=RULE_ROUND_OPEN
				{
					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getLanguageFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_1_1_0());
						}
						lv_languageCodes_4_0=ruleUnquotedString
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getLanguageFilterRule());
							}
							add(
								$current,
								"languageCodes",
								lv_languageCodes_4_0,
								"com.b2international.snomed.ecl.Ecl.UnquotedString");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				this_ROUND_CLOSE_5=RULE_ROUND_CLOSE
				{
					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getLanguageFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
				}
			)
		)
	)
;

// Entry rule entryRuleTypeFilter
entryRuleTypeFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeFilterRule()); }
	iv_ruleTypeFilter=ruleTypeFilter
	{ $current=$iv_ruleTypeFilter.current; }
	EOF;

// Rule TypeFilter
ruleTypeFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeFilterAccess().getTypeIdFilterParserRuleCall_0());
		}
		this_TypeIdFilter_0=ruleTypeIdFilter
		{
			$current = $this_TypeIdFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeFilterAccess().getTypeTokenFilterParserRuleCall_1());
		}
		this_TypeTokenFilter_1=ruleTypeTokenFilter
		{
			$current = $this_TypeTokenFilter_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTypeIdFilter
entryRuleTypeIdFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeIdFilterRule()); }
	iv_ruleTypeIdFilter=ruleTypeIdFilter
	{ $current=$iv_ruleTypeIdFilter.current; }
	EOF;

// Rule TypeIdFilter
ruleTypeIdFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_TYPEID_KEYWORD_0=RULE_TYPEID_KEYWORD
		{
			newLeafNode(this_TYPEID_KEYWORD_0, grammarAccess.getTypeIdFilterAccess().getTYPEID_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeIdFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeIdFilterAccess().getTypeFilterValueParserRuleCall_2_0());
				}
				lv_type_2_0=ruleFilterValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeIdFilterRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"com.b2international.snomed.ecl.Ecl.FilterValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTypeTokenFilter
entryRuleTypeTokenFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeTokenFilterRule()); }
	iv_ruleTypeTokenFilter=ruleTypeTokenFilter
	{ $current=$iv_ruleTypeTokenFilter.current; }
	EOF;

// Rule TypeTokenFilter
ruleTypeTokenFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_TYPE_KEYWORD_0=RULE_TYPE_KEYWORD
		{
			newLeafNode(this_TYPE_KEYWORD_0, grammarAccess.getTypeTokenFilterAccess().getTYPE_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeTokenFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_0_0());
					}
					lv_tokens_2_0=ruleUnquotedString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypeTokenFilterRule());
						}
						add(
							$current,
							"tokens",
							lv_tokens_2_0,
							"com.b2international.snomed.ecl.Ecl.UnquotedString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				this_ROUND_OPEN_3=RULE_ROUND_OPEN
				{
					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getTypeTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_1_1_0());
						}
						lv_tokens_4_0=ruleUnquotedString
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTypeTokenFilterRule());
							}
							add(
								$current,
								"tokens",
								lv_tokens_4_0,
								"com.b2international.snomed.ecl.Ecl.UnquotedString");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				this_ROUND_CLOSE_5=RULE_ROUND_CLOSE
				{
					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getTypeTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
				}
			)
		)
	)
;

// Entry rule entryRuleDialectFilter
entryRuleDialectFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDialectFilterRule()); }
	iv_ruleDialectFilter=ruleDialectFilter
	{ $current=$iv_ruleDialectFilter.current; }
	EOF;

// Rule DialectFilter
ruleDialectFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDialectFilterAccess().getDialectIdFilterParserRuleCall_0());
		}
		this_DialectIdFilter_0=ruleDialectIdFilter
		{
			$current = $this_DialectIdFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDialectFilterAccess().getDialectAliasFilterParserRuleCall_1());
		}
		this_DialectAliasFilter_1=ruleDialectAliasFilter
		{
			$current = $this_DialectAliasFilter_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDialectIdFilter
entryRuleDialectIdFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDialectIdFilterRule()); }
	iv_ruleDialectIdFilter=ruleDialectIdFilter
	{ $current=$iv_ruleDialectIdFilter.current; }
	EOF;

// Rule DialectIdFilter
ruleDialectIdFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DIALECTID_KEYWORD_0=RULE_DIALECTID_KEYWORD
		{
			newLeafNode(this_DIALECTID_KEYWORD_0, grammarAccess.getDialectIdFilterAccess().getDIALECTID_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDialectIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDialectIdFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_0_0());
					}
					lv_dialects_2_0=ruleDialect
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDialectIdFilterRule());
						}
						add(
							$current,
							"dialects",
							lv_dialects_2_0,
							"com.b2international.snomed.ecl.Ecl.Dialect");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				this_ROUND_OPEN_3=RULE_ROUND_OPEN
				{
					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectIdFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_1_1_0());
						}
						lv_dialects_4_0=ruleDialect
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDialectIdFilterRule());
							}
							add(
								$current,
								"dialects",
								lv_dialects_4_0,
								"com.b2international.snomed.ecl.Ecl.Dialect");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				this_ROUND_CLOSE_5=RULE_ROUND_CLOSE
				{
					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getDialectIdFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
				}
			)
		)
	)
;

// Entry rule entryRuleDialectAliasFilter
entryRuleDialectAliasFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDialectAliasFilterRule()); }
	iv_ruleDialectAliasFilter=ruleDialectAliasFilter
	{ $current=$iv_ruleDialectAliasFilter.current; }
	EOF;

// Rule DialectAliasFilter
ruleDialectAliasFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DIALECT_KEYWORD_0=RULE_DIALECT_KEYWORD
		{
			newLeafNode(this_DIALECT_KEYWORD_0, grammarAccess.getDialectAliasFilterAccess().getDIALECT_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDialectAliasFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_0_0());
					}
					lv_dialects_2_0=ruleDialectAlias
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDialectAliasFilterRule());
						}
						add(
							$current,
							"dialects",
							lv_dialects_2_0,
							"com.b2international.snomed.ecl.Ecl.DialectAlias");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				this_ROUND_OPEN_3=RULE_ROUND_OPEN
				{
					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectAliasFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_1_0());
						}
						lv_dialects_4_0=ruleDialectAlias
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDialectAliasFilterRule());
							}
							add(
								$current,
								"dialects",
								lv_dialects_4_0,
								"com.b2international.snomed.ecl.Ecl.DialectAlias");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				this_ROUND_CLOSE_5=RULE_ROUND_CLOSE
				{
					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getDialectAliasFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
				}
			)
		)
	)
;

// Entry rule entryRuleDialect
entryRuleDialect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDialectRule()); }
	iv_ruleDialect=ruleDialect
	{ $current=$iv_ruleDialect.current; }
	EOF;

// Rule Dialect
ruleDialect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDialectAccess().getLanguageRefSetIdFilteredExpressionConstraintParserRuleCall_0_0());
				}
				lv_languageRefSetId_0_0=ruleFilteredExpressionConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDialectRule());
					}
					set(
						$current,
						"languageRefSetId",
						lv_languageRefSetId_0_0,
						"com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDialectAccess().getAcceptabilityAcceptabilityParserRuleCall_1_0());
				}
				lv_acceptability_1_0=ruleAcceptability
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDialectRule());
					}
					set(
						$current,
						"acceptability",
						lv_acceptability_1_0,
						"com.b2international.snomed.ecl.Ecl.Acceptability");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleDialectAlias
entryRuleDialectAlias returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDialectAliasRule()); }
	iv_ruleDialectAlias=ruleDialectAlias
	{ $current=$iv_ruleDialectAlias.current; }
	EOF;

// Rule DialectAlias
ruleDialectAlias returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDialectAliasAccess().getAliasDialectAliasValueParserRuleCall_0_0());
				}
				lv_alias_0_0=ruleDialectAliasValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDialectAliasRule());
					}
					set(
						$current,
						"alias",
						lv_alias_0_0,
						"com.b2international.snomed.ecl.Ecl.DialectAliasValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDialectAliasAccess().getAcceptabilityAcceptabilityParserRuleCall_1_0());
				}
				lv_acceptability_1_0=ruleAcceptability
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDialectAliasRule());
					}
					set(
						$current,
						"acceptability",
						lv_acceptability_1_0,
						"com.b2international.snomed.ecl.Ecl.Acceptability");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleAcceptability
entryRuleAcceptability returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAcceptabilityRule()); }
	iv_ruleAcceptability=ruleAcceptability
	{ $current=$iv_ruleAcceptability.current; }
	EOF;

// Rule Acceptability
ruleAcceptability returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getAcceptabilityAccess().getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0());
			}
			lv_acceptabilities_0_0=ruleEclConceptReferenceSet
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getAcceptabilityRule());
				}
				set(
					$current,
					"acceptabilities",
					lv_acceptabilities_0_0,
					"com.b2international.snomed.ecl.Ecl.EclConceptReferenceSet");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleDefinitionStatusFilter
entryRuleDefinitionStatusFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionStatusFilterRule()); }
	iv_ruleDefinitionStatusFilter=ruleDefinitionStatusFilter
	{ $current=$iv_ruleDefinitionStatusFilter.current; }
	EOF;

// Rule DefinitionStatusFilter
ruleDefinitionStatusFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDefinitionStatusFilterAccess().getDefinitionStatusIdFilterParserRuleCall_0());
		}
		this_DefinitionStatusIdFilter_0=ruleDefinitionStatusIdFilter
		{
			$current = $this_DefinitionStatusIdFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDefinitionStatusFilterAccess().getDefinitionStatusTokenFilterParserRuleCall_1());
		}
		this_DefinitionStatusTokenFilter_1=ruleDefinitionStatusTokenFilter
		{
			$current = $this_DefinitionStatusTokenFilter_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDefinitionStatusIdFilter
entryRuleDefinitionStatusIdFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionStatusIdFilterRule()); }
	iv_ruleDefinitionStatusIdFilter=ruleDefinitionStatusIdFilter
	{ $current=$iv_ruleDefinitionStatusIdFilter.current; }
	EOF;

// Rule DefinitionStatusIdFilter
ruleDefinitionStatusIdFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DEFINITION_STATUS_ID_KEYWORD_0=RULE_DEFINITION_STATUS_ID_KEYWORD
		{
			newLeafNode(this_DEFINITION_STATUS_ID_KEYWORD_0, grammarAccess.getDefinitionStatusIdFilterAccess().getDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionStatusIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionStatusIdFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionStatusIdFilterAccess().getDefinitionStatusFilterValueParserRuleCall_2_0());
				}
				lv_definitionStatus_2_0=ruleFilterValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionStatusIdFilterRule());
					}
					set(
						$current,
						"definitionStatus",
						lv_definitionStatus_2_0,
						"com.b2international.snomed.ecl.Ecl.FilterValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDefinitionStatusTokenFilter
entryRuleDefinitionStatusTokenFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterRule()); }
	iv_ruleDefinitionStatusTokenFilter=ruleDefinitionStatusTokenFilter
	{ $current=$iv_ruleDefinitionStatusTokenFilter.current; }
	EOF;

// Rule DefinitionStatusTokenFilter
ruleDefinitionStatusTokenFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DEFINITION_STATUS_TOKEN_KEYWORD_0=RULE_DEFINITION_STATUS_TOKEN_KEYWORD
		{
			newLeafNode(this_DEFINITION_STATUS_TOKEN_KEYWORD_0, grammarAccess.getDefinitionStatusTokenFilterAccess().getDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionStatusTokenFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensUnquotedStringParserRuleCall_2_0_0());
					}
					lv_definitionStatusTokens_2_0=ruleUnquotedString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionStatusTokenFilterRule());
						}
						add(
							$current,
							"definitionStatusTokens",
							lv_definitionStatusTokens_2_0,
							"com.b2international.snomed.ecl.Ecl.UnquotedString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				this_ROUND_OPEN_3=RULE_ROUND_OPEN
				{
					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDefinitionStatusTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensUnquotedStringParserRuleCall_2_1_1_0());
						}
						lv_definitionStatusTokens_4_0=ruleUnquotedString
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDefinitionStatusTokenFilterRule());
							}
							add(
								$current,
								"definitionStatusTokens",
								lv_definitionStatusTokens_4_0,
								"com.b2international.snomed.ecl.Ecl.UnquotedString");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				this_ROUND_CLOSE_5=RULE_ROUND_CLOSE
				{
					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getDefinitionStatusTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
				}
			)
		)
	)
;

// Entry rule entryRuleModuleFilter
entryRuleModuleFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModuleFilterRule()); }
	iv_ruleModuleFilter=ruleModuleFilter
	{ $current=$iv_ruleModuleFilter.current; }
	EOF;

// Rule ModuleFilter
ruleModuleFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_MODULEID_KEYWORD_0=RULE_MODULEID_KEYWORD
		{
			newLeafNode(this_MODULEID_KEYWORD_0, grammarAccess.getModuleFilterAccess().getMODULEID_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModuleFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModuleFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModuleFilterAccess().getModuleIdFilterValueParserRuleCall_2_0());
				}
				lv_moduleId_2_0=ruleFilterValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModuleFilterRule());
					}
					set(
						$current,
						"moduleId",
						lv_moduleId_2_0,
						"com.b2international.snomed.ecl.Ecl.FilterValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEffectiveTimeFilter
entryRuleEffectiveTimeFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEffectiveTimeFilterRule()); }
	iv_ruleEffectiveTimeFilter=ruleEffectiveTimeFilter
	{ $current=$iv_ruleEffectiveTimeFilter.current; }
	EOF;

// Rule EffectiveTimeFilter
ruleEffectiveTimeFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_EFFECTIVE_TIME_KEYWORD_0=RULE_EFFECTIVE_TIME_KEYWORD
		{
			newLeafNode(this_EFFECTIVE_TIME_KEYWORD_0, grammarAccess.getEffectiveTimeFilterAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEffectiveTimeFilterAccess().getOpNUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEffectiveTimeFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_effectiveTime_2_0=RULE_STRING
				{
					newLeafNode(lv_effectiveTime_2_0, grammarAccess.getEffectiveTimeFilterAccess().getEffectiveTimeSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEffectiveTimeFilterRule());
					}
					setWithLastConsumed(
						$current,
						"effectiveTime",
						lv_effectiveTime_2_0,
						"com.b2international.snomed.ecl.Ecl.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleActiveFilter
entryRuleActiveFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActiveFilterRule()); }
	iv_ruleActiveFilter=ruleActiveFilter
	{ $current=$iv_ruleActiveFilter.current; }
	EOF;

// Rule ActiveFilter
ruleActiveFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ACTIVE_KEYWORD_0=RULE_ACTIVE_KEYWORD
		{
			newLeafNode(this_ACTIVE_KEYWORD_0, grammarAccess.getActiveFilterAccess().getACTIVE_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActiveFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActiveFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getActiveFilterAccess().getActiveActiveBooleanParserRuleCall_2_0());
				}
				lv_active_2_0=ruleActiveBoolean
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActiveFilterRule());
					}
					set(
						$current,
						"active",
						lv_active_2_0,
						"com.b2international.snomed.ecl.Ecl.ActiveBoolean");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSemanticTagFilter
entryRuleSemanticTagFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSemanticTagFilterRule()); }
	iv_ruleSemanticTagFilter=ruleSemanticTagFilter
	{ $current=$iv_ruleSemanticTagFilter.current; }
	EOF;

// Rule SemanticTagFilter
ruleSemanticTagFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_SEMANTIC_TAG_KEYWORD_0=RULE_SEMANTIC_TAG_KEYWORD
		{
			newLeafNode(this_SEMANTIC_TAG_KEYWORD_0, grammarAccess.getSemanticTagFilterAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSemanticTagFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSemanticTagFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_semanticTag_2_0=RULE_STRING
				{
					newLeafNode(lv_semanticTag_2_0, grammarAccess.getSemanticTagFilterAccess().getSemanticTagSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSemanticTagFilterRule());
					}
					setWithLastConsumed(
						$current,
						"semanticTag",
						lv_semanticTag_2_0,
						"com.b2international.snomed.ecl.Ecl.STRING");
				}
			)
		)
	)
;

// Entry rule entryRulePreferredInFilter
entryRulePreferredInFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPreferredInFilterRule()); }
	iv_rulePreferredInFilter=rulePreferredInFilter
	{ $current=$iv_rulePreferredInFilter.current; }
	EOF;

// Rule PreferredInFilter
rulePreferredInFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_PREFERRED_IN_KEYWORD_0=RULE_PREFERRED_IN_KEYWORD
		{
			newLeafNode(this_PREFERRED_IN_KEYWORD_0, grammarAccess.getPreferredInFilterAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_0());
		}
		this_EQUAL_1=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_1, grammarAccess.getPreferredInFilterAccess().getEQUALTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0());
				}
				lv_languageRefSetId_2_0=ruleFilterValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPreferredInFilterRule());
					}
					set(
						$current,
						"languageRefSetId",
						lv_languageRefSetId_2_0,
						"com.b2international.snomed.ecl.Ecl.FilterValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAcceptableInFilter
entryRuleAcceptableInFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAcceptableInFilterRule()); }
	iv_ruleAcceptableInFilter=ruleAcceptableInFilter
	{ $current=$iv_ruleAcceptableInFilter.current; }
	EOF;

// Rule AcceptableInFilter
ruleAcceptableInFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ACCEPTABLE_IN_KEYWORD_0=RULE_ACCEPTABLE_IN_KEYWORD
		{
			newLeafNode(this_ACCEPTABLE_IN_KEYWORD_0, grammarAccess.getAcceptableInFilterAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_0());
		}
		this_EQUAL_1=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_1, grammarAccess.getAcceptableInFilterAccess().getEQUALTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0());
				}
				lv_languageRefSetId_2_0=ruleFilterValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAcceptableInFilterRule());
					}
					set(
						$current,
						"languageRefSetId",
						lv_languageRefSetId_2_0,
						"com.b2international.snomed.ecl.Ecl.FilterValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLanguageRefSetFilter
entryRuleLanguageRefSetFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLanguageRefSetFilterRule()); }
	iv_ruleLanguageRefSetFilter=ruleLanguageRefSetFilter
	{ $current=$iv_ruleLanguageRefSetFilter.current; }
	EOF;

// Rule LanguageRefSetFilter
ruleLanguageRefSetFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_LANGUAGE_REFSET_ID_KEYWORD_0=RULE_LANGUAGE_REFSET_ID_KEYWORD
		{
			newLeafNode(this_LANGUAGE_REFSET_ID_KEYWORD_0, grammarAccess.getLanguageRefSetFilterAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0());
		}
		this_EQUAL_1=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_1, grammarAccess.getLanguageRefSetFilterAccess().getEQUALTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0());
				}
				lv_languageRefSetId_2_0=ruleFilterValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLanguageRefSetFilterRule());
					}
					set(
						$current,
						"languageRefSetId",
						lv_languageRefSetId_2_0,
						"com.b2international.snomed.ecl.Ecl.FilterValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCaseSignificanceFilter
entryRuleCaseSignificanceFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCaseSignificanceFilterRule()); }
	iv_ruleCaseSignificanceFilter=ruleCaseSignificanceFilter
	{ $current=$iv_ruleCaseSignificanceFilter.current; }
	EOF;

// Rule CaseSignificanceFilter
ruleCaseSignificanceFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_CASE_SIGNIFICANCE_ID_KEYWORD_0=RULE_CASE_SIGNIFICANCE_ID_KEYWORD
		{
			newLeafNode(this_CASE_SIGNIFICANCE_ID_KEYWORD_0, grammarAccess.getCaseSignificanceFilterAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0());
		}
		this_EQUAL_1=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_1, grammarAccess.getCaseSignificanceFilterAccess().getEQUALTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdFilterValueParserRuleCall_2_0());
				}
				lv_caseSignificanceId_2_0=ruleFilterValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCaseSignificanceFilterRule());
					}
					set(
						$current,
						"caseSignificanceId",
						lv_caseSignificanceId_2_0,
						"com.b2international.snomed.ecl.Ecl.FilterValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFilterValue
entryRuleFilterValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterValueRule()); }
	iv_ruleFilterValue=ruleFilterValue
	{ $current=$iv_ruleFilterValue.current; }
	EOF;

// Rule FilterValue
ruleFilterValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFilterValueAccess().getFilteredExpressionConstraintParserRuleCall_0());
		}
		this_FilteredExpressionConstraint_0=ruleFilteredExpressionConstraint
		{
			$current = $this_FilteredExpressionConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFilterValueAccess().getEclConceptReferenceSetParserRuleCall_1());
		}
		this_EclConceptReferenceSet_1=ruleEclConceptReferenceSet
		{
			$current = $this_EclConceptReferenceSet_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSupplement
entryRuleSupplement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSupplementRule()); }
	iv_ruleSupplement=ruleSupplement
	{ $current=$iv_ruleSupplement.current; }
	EOF;

// Rule Supplement
ruleSupplement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getSupplementAccess().getHistorySupplementParserRuleCall());
	}
	this_HistorySupplement_0=ruleHistorySupplement
	{
		$current = $this_HistorySupplement_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleHistorySupplement
entryRuleHistorySupplement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHistorySupplementRule()); }
	iv_ruleHistorySupplement=ruleHistorySupplement
	{ $current=$iv_ruleHistorySupplement.current; }
	EOF;

// Rule HistorySupplement
ruleHistorySupplement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DOUBLE_CURLY_OPEN_0=RULE_DOUBLE_CURLY_OPEN
		{
			newLeafNode(this_DOUBLE_CURLY_OPEN_0, grammarAccess.getHistorySupplementAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0());
		}
		this_PLUS_1=RULE_PLUS
		{
			newLeafNode(this_PLUS_1, grammarAccess.getHistorySupplementAccess().getPLUSTerminalRuleCall_1());
		}
		this_HISTORY_KEYWORD_2=RULE_HISTORY_KEYWORD
		{
			newLeafNode(this_HISTORY_KEYWORD_2, grammarAccess.getHistorySupplementAccess().getHISTORY_KEYWORDTerminalRuleCall_2());
		}
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getHistorySupplementAccess().getHistorySupplementAction_3(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getHistorySupplementAccess().getHistoryHistoryProfileParserRuleCall_4_0_0());
					}
					lv_history_4_1=ruleHistoryProfile
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHistorySupplementRule());
						}
						set(
							$current,
							"history",
							lv_history_4_1,
							"com.b2international.snomed.ecl.Ecl.HistoryProfile");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getHistorySupplementAccess().getHistoryNestedExpressionParserRuleCall_4_0_1());
					}
					lv_history_4_2=ruleNestedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHistorySupplementRule());
						}
						set(
							$current,
							"history",
							lv_history_4_2,
							"com.b2international.snomed.ecl.Ecl.NestedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		this_DOUBLE_CURLY_CLOSE_5=RULE_DOUBLE_CURLY_CLOSE
		{
			newLeafNode(this_DOUBLE_CURLY_CLOSE_5, grammarAccess.getHistorySupplementAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleHistoryProfile
entryRuleHistoryProfile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHistoryProfileRule()); }
	iv_ruleHistoryProfile=ruleHistoryProfile
	{ $current=$iv_ruleHistoryProfile.current; }
	EOF;

// Rule HistoryProfile
ruleHistoryProfile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_DASH_0=RULE_DASH
			{
				newLeafNode(this_DASH_0, grammarAccess.getHistoryProfileAccess().getDASHTerminalRuleCall_0_0());
			}
			    |
			this_UNDERSCORE_1=RULE_UNDERSCORE
			{
				newLeafNode(this_UNDERSCORE_1, grammarAccess.getHistoryProfileAccess().getUNDERSCORETerminalRuleCall_0_1());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getHistoryProfileAccess().getProfileHISTORY_PROFILE_TYPEParserRuleCall_1_0());
				}
				lv_profile_2_0=ruleHISTORY_PROFILE_TYPE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHistoryProfileRule());
					}
					set(
						$current,
						"profile",
						lv_profile_2_0,
						"com.b2international.snomed.ecl.Ecl.HISTORY_PROFILE_TYPE");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleIdentifier
entryRuleIdentifier returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getIdentifierRule()); }
	iv_ruleIdentifier=ruleIdentifier
	{ $current=$iv_ruleIdentifier.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Identifier
ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			this_DIGIT_0=RULE_DIGIT
			{
				$current.merge(this_DIGIT_0);
			}
			{
				newLeafNode(this_DIGIT_0, grammarAccess.getIdentifierAccess().getDIGITTerminalRuleCall_0_0());
			}
			    |
			this_ALPHA_1=RULE_ALPHA
			{
				$current.merge(this_ALPHA_1);
			}
			{
				newLeafNode(this_ALPHA_1, grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_0_1());
			}
			    |
			this_CONCEPT_SHORT_KEYWORD_2=RULE_CONCEPT_SHORT_KEYWORD
			{
				$current.merge(this_CONCEPT_SHORT_KEYWORD_2);
			}
			{
				newLeafNode(this_CONCEPT_SHORT_KEYWORD_2, grammarAccess.getIdentifierAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0_2());
			}
			    |
			this_DESCRIPTION_SHORT_KEYWORD_3=RULE_DESCRIPTION_SHORT_KEYWORD
			{
				$current.merge(this_DESCRIPTION_SHORT_KEYWORD_3);
			}
			{
				newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_3, grammarAccess.getIdentifierAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_0_3());
			}
			    |
			this_MEMBER_SHORT_KEYWORD_4=RULE_MEMBER_SHORT_KEYWORD
			{
				$current.merge(this_MEMBER_SHORT_KEYWORD_4);
			}
			{
				newLeafNode(this_MEMBER_SHORT_KEYWORD_4, grammarAccess.getIdentifierAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_0_4());
			}
			    |
			this_REVERSED_5=RULE_REVERSED
			{
				$current.merge(this_REVERSED_5);
			}
			{
				newLeafNode(this_REVERSED_5, grammarAccess.getIdentifierAccess().getREVERSEDTerminalRuleCall_0_5());
			}
			    |
			this_ID_KEYWORD_6=RULE_ID_KEYWORD
			{
				$current.merge(this_ID_KEYWORD_6);
			}
			{
				newLeafNode(this_ID_KEYWORD_6, grammarAccess.getIdentifierAccess().getID_KEYWORDTerminalRuleCall_0_6());
			}
			    |
			this_KEYWORD_7=RULE_KEYWORD
			{
				$current.merge(this_KEYWORD_7);
			}
			{
				newLeafNode(this_KEYWORD_7, grammarAccess.getIdentifierAccess().getKEYWORDTerminalRuleCall_0_7());
			}
		)
		(
			this_DIGIT_8=RULE_DIGIT
			{
				$current.merge(this_DIGIT_8);
			}
			{
				newLeafNode(this_DIGIT_8, grammarAccess.getIdentifierAccess().getDIGITTerminalRuleCall_1_0());
			}
			    |
			this_ALPHA_9=RULE_ALPHA
			{
				$current.merge(this_ALPHA_9);
			}
			{
				newLeafNode(this_ALPHA_9, grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_1_1());
			}
			    |
			this_CONCEPT_SHORT_KEYWORD_10=RULE_CONCEPT_SHORT_KEYWORD
			{
				$current.merge(this_CONCEPT_SHORT_KEYWORD_10);
			}
			{
				newLeafNode(this_CONCEPT_SHORT_KEYWORD_10, grammarAccess.getIdentifierAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_1_2());
			}
			    |
			this_DESCRIPTION_SHORT_KEYWORD_11=RULE_DESCRIPTION_SHORT_KEYWORD
			{
				$current.merge(this_DESCRIPTION_SHORT_KEYWORD_11);
			}
			{
				newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_11, grammarAccess.getIdentifierAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1_3());
			}
			    |
			this_MEMBER_SHORT_KEYWORD_12=RULE_MEMBER_SHORT_KEYWORD
			{
				$current.merge(this_MEMBER_SHORT_KEYWORD_12);
			}
			{
				newLeafNode(this_MEMBER_SHORT_KEYWORD_12, grammarAccess.getIdentifierAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_1_4());
			}
			    |
			this_REVERSED_13=RULE_REVERSED
			{
				$current.merge(this_REVERSED_13);
			}
			{
				newLeafNode(this_REVERSED_13, grammarAccess.getIdentifierAccess().getREVERSEDTerminalRuleCall_1_5());
			}
			    |
			this_ID_KEYWORD_14=RULE_ID_KEYWORD
			{
				$current.merge(this_ID_KEYWORD_14);
			}
			{
				newLeafNode(this_ID_KEYWORD_14, grammarAccess.getIdentifierAccess().getID_KEYWORDTerminalRuleCall_1_6());
			}
			    |
			this_KEYWORD_15=RULE_KEYWORD
			{
				$current.merge(this_KEYWORD_15);
			}
			{
				newLeafNode(this_KEYWORD_15, grammarAccess.getIdentifierAccess().getKEYWORDTerminalRuleCall_1_7());
			}
			    |
			this_DASH_16=RULE_DASH
			{
				$current.merge(this_DASH_16);
			}
			{
				newLeafNode(this_DASH_16, grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_1_8());
			}
			    |
			this_UNDERSCORE_17=RULE_UNDERSCORE
			{
				$current.merge(this_UNDERSCORE_17);
			}
			{
				newLeafNode(this_UNDERSCORE_17, grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_1_9());
			}
		)*
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNonNegativeInteger
entryRuleNonNegativeInteger returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getNonNegativeIntegerRule()); }
	iv_ruleNonNegativeInteger=ruleNonNegativeInteger
	{ $current=$iv_ruleNonNegativeInteger.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule NonNegativeInteger
ruleNonNegativeInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		this_DIGIT_0=RULE_DIGIT
		{
			$current.merge(this_DIGIT_0);
		}
		{
			newLeafNode(this_DIGIT_0, grammarAccess.getNonNegativeIntegerAccess().getDIGITTerminalRuleCall());
		}
	)+
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNonNegativeDecimal
entryRuleNonNegativeDecimal returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getNonNegativeDecimalRule()); }
	iv_ruleNonNegativeDecimal=ruleNonNegativeDecimal
	{ $current=$iv_ruleNonNegativeDecimal.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule NonNegativeDecimal
ruleNonNegativeDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0());
		}
		this_NonNegativeInteger_0=ruleNonNegativeInteger
		{
			$current.merge(this_NonNegativeInteger_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		this_DOT_1=RULE_DOT
		{
			$current.merge(this_DOT_1);
		}
		{
			newLeafNode(this_DOT_1, grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1());
		}
		(
			this_DIGIT_2=RULE_DIGIT
			{
				$current.merge(this_DIGIT_2);
			}
			{
				newLeafNode(this_DIGIT_2, grammarAccess.getNonNegativeDecimalAccess().getDIGITTerminalRuleCall_2());
			}
		)*
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleMaxValue
entryRuleMaxValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMaxValueRule()); }
	iv_ruleMaxValue=ruleMaxValue
	{ $current=$iv_ruleMaxValue.current.getText(); }
	EOF;

// Rule MaxValue
ruleMaxValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMaxValueAccess().getNonNegativeIntegerParserRuleCall_0());
		}
		this_NonNegativeInteger_0=ruleNonNegativeInteger
		{
			$current.merge(this_NonNegativeInteger_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		this_WILDCARD_1=RULE_WILDCARD
		{
			$current.merge(this_WILDCARD_1);
		}
		{
			newLeafNode(this_WILDCARD_1, grammarAccess.getMaxValueAccess().getWILDCARDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleInteger
entryRuleInteger returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getIntegerRule()); }
	iv_ruleInteger=ruleInteger
	{ $current=$iv_ruleInteger.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Integer
ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			this_PLUS_0=RULE_PLUS
			{
				$current.merge(this_PLUS_0);
			}
			{
				newLeafNode(this_PLUS_0, grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0());
			}
			    |
			this_DASH_1=RULE_DASH
			{
				$current.merge(this_DASH_1);
			}
			{
				newLeafNode(this_DASH_1, grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1());
			}
		)?
		{
			newCompositeNode(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1());
		}
		this_NonNegativeInteger_2=ruleNonNegativeInteger
		{
			$current.merge(this_NonNegativeInteger_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleDecimal
entryRuleDecimal returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getDecimalRule()); }
	iv_ruleDecimal=ruleDecimal
	{ $current=$iv_ruleDecimal.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Decimal
ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			this_PLUS_0=RULE_PLUS
			{
				$current.merge(this_PLUS_0);
			}
			{
				newLeafNode(this_PLUS_0, grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0());
			}
			    |
			this_DASH_1=RULE_DASH
			{
				$current.merge(this_DASH_1);
			}
			{
				newLeafNode(this_DASH_1, grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1());
			}
		)?
		{
			newCompositeNode(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1());
		}
		this_NonNegativeDecimal_2=ruleNonNegativeDecimal
		{
			$current.merge(this_NonNegativeDecimal_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleBoolean
entryRuleBoolean returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBooleanRule()); }
	iv_ruleBoolean=ruleBoolean
	{ $current=$iv_ruleBoolean.current.getText(); }
	EOF;

// Rule Boolean
ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_TRUE_KEYWORD_0=RULE_TRUE_KEYWORD
		{
			$current.merge(this_TRUE_KEYWORD_0);
		}
		{
			newLeafNode(this_TRUE_KEYWORD_0, grammarAccess.getBooleanAccess().getTRUE_KEYWORDTerminalRuleCall_0());
		}
		    |
		this_FALSE_KEYWORD_1=RULE_FALSE_KEYWORD
		{
			$current.merge(this_FALSE_KEYWORD_1);
		}
		{
			newLeafNode(this_FALSE_KEYWORD_1, grammarAccess.getBooleanAccess().getFALSE_KEYWORDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleActiveBoolean
entryRuleActiveBoolean returns [String current=null]:
	{ newCompositeNode(grammarAccess.getActiveBooleanRule()); }
	iv_ruleActiveBoolean=ruleActiveBoolean
	{ $current=$iv_ruleActiveBoolean.current.getText(); }
	EOF;

// Rule ActiveBoolean
ruleActiveBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActiveBooleanAccess().getNonNegativeIntegerParserRuleCall_0());
		}
		this_NonNegativeInteger_0=ruleNonNegativeInteger
		{
			$current.merge(this_NonNegativeInteger_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActiveBooleanAccess().getBooleanParserRuleCall_1());
		}
		this_Boolean_1=ruleBoolean
		{
			$current.merge(this_Boolean_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleUnquotedString
entryRuleUnquotedString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUnquotedStringRule()); }
	iv_ruleUnquotedString=ruleUnquotedString
	{ $current=$iv_ruleUnquotedString.current.getText(); }
	EOF;

// Rule UnquotedString
ruleUnquotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_HISTORY_KEYWORD_0=RULE_HISTORY_KEYWORD
		{
			$current.merge(this_HISTORY_KEYWORD_0);
		}
		{
			newLeafNode(this_HISTORY_KEYWORD_0, grammarAccess.getUnquotedStringAccess().getHISTORY_KEYWORDTerminalRuleCall_0());
		}
		    |
		this_CASE_SIGNIFICANCE_ID_KEYWORD_1=RULE_CASE_SIGNIFICANCE_ID_KEYWORD
		{
			$current.merge(this_CASE_SIGNIFICANCE_ID_KEYWORD_1);
		}
		{
			newLeafNode(this_CASE_SIGNIFICANCE_ID_KEYWORD_1, grammarAccess.getUnquotedStringAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_1());
		}
		    |
		this_DEFINITION_STATUS_ID_KEYWORD_2=RULE_DEFINITION_STATUS_ID_KEYWORD
		{
			$current.merge(this_DEFINITION_STATUS_ID_KEYWORD_2);
		}
		{
			newLeafNode(this_DEFINITION_STATUS_ID_KEYWORD_2, grammarAccess.getUnquotedStringAccess().getDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_2());
		}
		    |
		this_DEFINITION_STATUS_TOKEN_KEYWORD_3=RULE_DEFINITION_STATUS_TOKEN_KEYWORD
		{
			$current.merge(this_DEFINITION_STATUS_TOKEN_KEYWORD_3);
		}
		{
			newLeafNode(this_DEFINITION_STATUS_TOKEN_KEYWORD_3, grammarAccess.getUnquotedStringAccess().getDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_3());
		}
		    |
		this_LANGUAGE_REFSET_ID_KEYWORD_4=RULE_LANGUAGE_REFSET_ID_KEYWORD
		{
			$current.merge(this_LANGUAGE_REFSET_ID_KEYWORD_4);
		}
		{
			newLeafNode(this_LANGUAGE_REFSET_ID_KEYWORD_4, grammarAccess.getUnquotedStringAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_4());
		}
		    |
		this_EFFECTIVE_TIME_KEYWORD_5=RULE_EFFECTIVE_TIME_KEYWORD
		{
			$current.merge(this_EFFECTIVE_TIME_KEYWORD_5);
		}
		{
			newLeafNode(this_EFFECTIVE_TIME_KEYWORD_5, grammarAccess.getUnquotedStringAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_5());
		}
		    |
		this_ACCEPTABLE_IN_KEYWORD_6=RULE_ACCEPTABLE_IN_KEYWORD
		{
			$current.merge(this_ACCEPTABLE_IN_KEYWORD_6);
		}
		{
			newLeafNode(this_ACCEPTABLE_IN_KEYWORD_6, grammarAccess.getUnquotedStringAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_6());
		}
		    |
		this_PREFERRED_IN_KEYWORD_7=RULE_PREFERRED_IN_KEYWORD
		{
			$current.merge(this_PREFERRED_IN_KEYWORD_7);
		}
		{
			newLeafNode(this_PREFERRED_IN_KEYWORD_7, grammarAccess.getUnquotedStringAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_7());
		}
		    |
		this_SEMANTIC_TAG_KEYWORD_8=RULE_SEMANTIC_TAG_KEYWORD
		{
			$current.merge(this_SEMANTIC_TAG_KEYWORD_8);
		}
		{
			newLeafNode(this_SEMANTIC_TAG_KEYWORD_8, grammarAccess.getUnquotedStringAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_8());
		}
		    |
		this_DIALECTID_KEYWORD_9=RULE_DIALECTID_KEYWORD
		{
			$current.merge(this_DIALECTID_KEYWORD_9);
		}
		{
			newLeafNode(this_DIALECTID_KEYWORD_9, grammarAccess.getUnquotedStringAccess().getDIALECTID_KEYWORDTerminalRuleCall_9());
		}
		    |
		this_LANGUAGE_KEYWORD_10=RULE_LANGUAGE_KEYWORD
		{
			$current.merge(this_LANGUAGE_KEYWORD_10);
		}
		{
			newLeafNode(this_LANGUAGE_KEYWORD_10, grammarAccess.getUnquotedStringAccess().getLANGUAGE_KEYWORDTerminalRuleCall_10());
		}
		    |
		this_MODULEID_KEYWORD_11=RULE_MODULEID_KEYWORD
		{
			$current.merge(this_MODULEID_KEYWORD_11);
		}
		{
			newLeafNode(this_MODULEID_KEYWORD_11, grammarAccess.getUnquotedStringAccess().getMODULEID_KEYWORDTerminalRuleCall_11());
		}
		    |
		this_DIALECT_KEYWORD_12=RULE_DIALECT_KEYWORD
		{
			$current.merge(this_DIALECT_KEYWORD_12);
		}
		{
			newLeafNode(this_DIALECT_KEYWORD_12, grammarAccess.getUnquotedStringAccess().getDIALECT_KEYWORDTerminalRuleCall_12());
		}
		    |
		this_ACTIVE_KEYWORD_13=RULE_ACTIVE_KEYWORD
		{
			$current.merge(this_ACTIVE_KEYWORD_13);
		}
		{
			newLeafNode(this_ACTIVE_KEYWORD_13, grammarAccess.getUnquotedStringAccess().getACTIVE_KEYWORDTerminalRuleCall_13());
		}
		    |
		this_TYPEID_KEYWORD_14=RULE_TYPEID_KEYWORD
		{
			$current.merge(this_TYPEID_KEYWORD_14);
		}
		{
			newLeafNode(this_TYPEID_KEYWORD_14, grammarAccess.getUnquotedStringAccess().getTYPEID_KEYWORDTerminalRuleCall_14());
		}
		    |
		this_EXCLUSION_KEYWORD_15=RULE_EXCLUSION_KEYWORD
		{
			$current.merge(this_EXCLUSION_KEYWORD_15);
		}
		{
			newLeafNode(this_EXCLUSION_KEYWORD_15, grammarAccess.getUnquotedStringAccess().getEXCLUSION_KEYWORDTerminalRuleCall_15());
		}
		    |
		this_EXACT_KEYWORD_16=RULE_EXACT_KEYWORD
		{
			$current.merge(this_EXACT_KEYWORD_16);
		}
		{
			newLeafNode(this_EXACT_KEYWORD_16, grammarAccess.getUnquotedStringAccess().getEXACT_KEYWORDTerminalRuleCall_16());
		}
		    |
		this_FALSE_KEYWORD_17=RULE_FALSE_KEYWORD
		{
			$current.merge(this_FALSE_KEYWORD_17);
		}
		{
			newLeafNode(this_FALSE_KEYWORD_17, grammarAccess.getUnquotedStringAccess().getFALSE_KEYWORDTerminalRuleCall_17());
		}
		    |
		this_MATCH_KEYWORD_18=RULE_MATCH_KEYWORD
		{
			$current.merge(this_MATCH_KEYWORD_18);
		}
		{
			newLeafNode(this_MATCH_KEYWORD_18, grammarAccess.getUnquotedStringAccess().getMATCH_KEYWORDTerminalRuleCall_18());
		}
		    |
		this_REGEX_KEYWORD_19=RULE_REGEX_KEYWORD
		{
			$current.merge(this_REGEX_KEYWORD_19);
		}
		{
			newLeafNode(this_REGEX_KEYWORD_19, grammarAccess.getUnquotedStringAccess().getREGEX_KEYWORDTerminalRuleCall_19());
		}
		    |
		this_TERM_KEYWORD_20=RULE_TERM_KEYWORD
		{
			$current.merge(this_TERM_KEYWORD_20);
		}
		{
			newLeafNode(this_TERM_KEYWORD_20, grammarAccess.getUnquotedStringAccess().getTERM_KEYWORDTerminalRuleCall_20());
		}
		    |
		this_TRUE_KEYWORD_21=RULE_TRUE_KEYWORD
		{
			$current.merge(this_TRUE_KEYWORD_21);
		}
		{
			newLeafNode(this_TRUE_KEYWORD_21, grammarAccess.getUnquotedStringAccess().getTRUE_KEYWORDTerminalRuleCall_21());
		}
		    |
		this_TYPE_KEYWORD_22=RULE_TYPE_KEYWORD
		{
			$current.merge(this_TYPE_KEYWORD_22);
		}
		{
			newLeafNode(this_TYPE_KEYWORD_22, grammarAccess.getUnquotedStringAccess().getTYPE_KEYWORDTerminalRuleCall_22());
		}
		    |
		this_WILD_KEYWORD_23=RULE_WILD_KEYWORD
		{
			$current.merge(this_WILD_KEYWORD_23);
		}
		{
			newLeafNode(this_WILD_KEYWORD_23, grammarAccess.getUnquotedStringAccess().getWILD_KEYWORDTerminalRuleCall_23());
		}
		    |
		this_MIN_KEYWORD_24=RULE_MIN_KEYWORD
		{
			$current.merge(this_MIN_KEYWORD_24);
		}
		{
			newLeafNode(this_MIN_KEYWORD_24, grammarAccess.getUnquotedStringAccess().getMIN_KEYWORDTerminalRuleCall_24());
		}
		    |
		this_MOD_KEYWORD_25=RULE_MOD_KEYWORD
		{
			$current.merge(this_MOD_KEYWORD_25);
		}
		{
			newLeafNode(this_MOD_KEYWORD_25, grammarAccess.getUnquotedStringAccess().getMOD_KEYWORDTerminalRuleCall_25());
		}
		    |
		this_MAX_KEYWORD_26=RULE_MAX_KEYWORD
		{
			$current.merge(this_MAX_KEYWORD_26);
		}
		{
			newLeafNode(this_MAX_KEYWORD_26, grammarAccess.getUnquotedStringAccess().getMAX_KEYWORDTerminalRuleCall_26());
		}
		    |
		this_CONJUNCTION_KEYWORD_27=RULE_CONJUNCTION_KEYWORD
		{
			$current.merge(this_CONJUNCTION_KEYWORD_27);
		}
		{
			newLeafNode(this_CONJUNCTION_KEYWORD_27, grammarAccess.getUnquotedStringAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_27());
		}
		    |
		this_DISJUNCTION_KEYWORD_28=RULE_DISJUNCTION_KEYWORD
		{
			$current.merge(this_DISJUNCTION_KEYWORD_28);
		}
		{
			newLeafNode(this_DISJUNCTION_KEYWORD_28, grammarAccess.getUnquotedStringAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_28());
		}
		    |
		this_ID_KEYWORD_29=RULE_ID_KEYWORD
		{
			$current.merge(this_ID_KEYWORD_29);
		}
		{
			newLeafNode(this_ID_KEYWORD_29, grammarAccess.getUnquotedStringAccess().getID_KEYWORDTerminalRuleCall_29());
		}
		    |
		this_REVERSED_30=RULE_REVERSED
		{
			$current.merge(this_REVERSED_30);
		}
		{
			newLeafNode(this_REVERSED_30, grammarAccess.getUnquotedStringAccess().getREVERSEDTerminalRuleCall_30());
		}
		    |
		this_MEMBER_SHORT_KEYWORD_31=RULE_MEMBER_SHORT_KEYWORD
		{
			$current.merge(this_MEMBER_SHORT_KEYWORD_31);
		}
		{
			newLeafNode(this_MEMBER_SHORT_KEYWORD_31, grammarAccess.getUnquotedStringAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_31());
		}
		    |
		this_DESCRIPTION_SHORT_KEYWORD_32=RULE_DESCRIPTION_SHORT_KEYWORD
		{
			$current.merge(this_DESCRIPTION_SHORT_KEYWORD_32);
		}
		{
			newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_32, grammarAccess.getUnquotedStringAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_32());
		}
		    |
		this_CONCEPT_SHORT_KEYWORD_33=RULE_CONCEPT_SHORT_KEYWORD
		{
			$current.merge(this_CONCEPT_SHORT_KEYWORD_33);
		}
		{
			newLeafNode(this_CONCEPT_SHORT_KEYWORD_33, grammarAccess.getUnquotedStringAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_33());
		}
		    |
		this_WILDCARD_34=RULE_WILDCARD
		{
			$current.merge(this_WILDCARD_34);
		}
		{
			newLeafNode(this_WILDCARD_34, grammarAccess.getUnquotedStringAccess().getWILDCARDTerminalRuleCall_34());
		}
		    |
		this_KEYWORD_35=RULE_KEYWORD
		{
			$current.merge(this_KEYWORD_35);
		}
		{
			newLeafNode(this_KEYWORD_35, grammarAccess.getUnquotedStringAccess().getKEYWORDTerminalRuleCall_35());
		}
	)
;

// Entry rule entryRuleDialectAliasValue
entryRuleDialectAliasValue returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getDialectAliasValueRule()); }
	iv_ruleDialectAliasValue=ruleDialectAliasValue
	{ $current=$iv_ruleDialectAliasValue.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule DialectAliasValue
ruleDialectAliasValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		this_DASH_0=RULE_DASH
		{
			$current.merge(this_DASH_0);
		}
		{
			newLeafNode(this_DASH_0, grammarAccess.getDialectAliasValueAccess().getDASHTerminalRuleCall_0());
		}
		    |
		this_KEYWORD_1=RULE_KEYWORD
		{
			$current.merge(this_KEYWORD_1);
		}
		{
			newLeafNode(this_KEYWORD_1, grammarAccess.getDialectAliasValueAccess().getKEYWORDTerminalRuleCall_1());
		}
		    |
		this_DIGIT_2=RULE_DIGIT
		{
			$current.merge(this_DIGIT_2);
		}
		{
			newLeafNode(this_DIGIT_2, grammarAccess.getDialectAliasValueAccess().getDIGITTerminalRuleCall_2());
		}
	)+
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleLEXICAL_SEARCH_TYPE
entryRuleLEXICAL_SEARCH_TYPE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLEXICAL_SEARCH_TYPERule()); }
	iv_ruleLEXICAL_SEARCH_TYPE=ruleLEXICAL_SEARCH_TYPE
	{ $current=$iv_ruleLEXICAL_SEARCH_TYPE.current.getText(); }
	EOF;

// Rule LEXICAL_SEARCH_TYPE
ruleLEXICAL_SEARCH_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_MATCH_KEYWORD_0=RULE_MATCH_KEYWORD
		{
			$current.merge(this_MATCH_KEYWORD_0);
		}
		{
			newLeafNode(this_MATCH_KEYWORD_0, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getMATCH_KEYWORDTerminalRuleCall_0());
		}
		    |
		this_WILD_KEYWORD_1=RULE_WILD_KEYWORD
		{
			$current.merge(this_WILD_KEYWORD_1);
		}
		{
			newLeafNode(this_WILD_KEYWORD_1, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getWILD_KEYWORDTerminalRuleCall_1());
		}
		    |
		this_EXACT_KEYWORD_2=RULE_EXACT_KEYWORD
		{
			$current.merge(this_EXACT_KEYWORD_2);
		}
		{
			newLeafNode(this_EXACT_KEYWORD_2, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getEXACT_KEYWORDTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleHISTORY_PROFILE_TYPE
entryRuleHISTORY_PROFILE_TYPE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getHISTORY_PROFILE_TYPERule()); }
	iv_ruleHISTORY_PROFILE_TYPE=ruleHISTORY_PROFILE_TYPE
	{ $current=$iv_ruleHISTORY_PROFILE_TYPE.current.getText(); }
	EOF;

// Rule HISTORY_PROFILE_TYPE
ruleHISTORY_PROFILE_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_MIN_KEYWORD_0=RULE_MIN_KEYWORD
		{
			$current.merge(this_MIN_KEYWORD_0);
		}
		{
			newLeafNode(this_MIN_KEYWORD_0, grammarAccess.getHISTORY_PROFILE_TYPEAccess().getMIN_KEYWORDTerminalRuleCall_0());
		}
		    |
		this_MOD_KEYWORD_1=RULE_MOD_KEYWORD
		{
			$current.merge(this_MOD_KEYWORD_1);
		}
		{
			newLeafNode(this_MOD_KEYWORD_1, grammarAccess.getHISTORY_PROFILE_TYPEAccess().getMOD_KEYWORDTerminalRuleCall_1());
		}
		    |
		this_MAX_KEYWORD_2=RULE_MAX_KEYWORD
		{
			$current.merge(this_MAX_KEYWORD_2);
		}
		{
			newLeafNode(this_MAX_KEYWORD_2, grammarAccess.getHISTORY_PROFILE_TYPEAccess().getMAX_KEYWORDTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleSHORT_DOMAIN
entryRuleSHORT_DOMAIN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSHORT_DOMAINRule()); }
	iv_ruleSHORT_DOMAIN=ruleSHORT_DOMAIN
	{ $current=$iv_ruleSHORT_DOMAIN.current.getText(); }
	EOF;

// Rule SHORT_DOMAIN
ruleSHORT_DOMAIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_CONCEPT_SHORT_KEYWORD_0=RULE_CONCEPT_SHORT_KEYWORD
		{
			$current.merge(this_CONCEPT_SHORT_KEYWORD_0);
		}
		{
			newLeafNode(this_CONCEPT_SHORT_KEYWORD_0, grammarAccess.getSHORT_DOMAINAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0());
		}
		    |
		this_DESCRIPTION_SHORT_KEYWORD_1=RULE_DESCRIPTION_SHORT_KEYWORD
		{
			$current.merge(this_DESCRIPTION_SHORT_KEYWORD_1);
		}
		{
			newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_1, grammarAccess.getSHORT_DOMAINAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1());
		}
		    |
		this_MEMBER_SHORT_KEYWORD_2=RULE_MEMBER_SHORT_KEYWORD
		{
			$current.merge(this_MEMBER_SHORT_KEYWORD_2);
		}
		{
			newLeafNode(this_MEMBER_SHORT_KEYWORD_2, grammarAccess.getSHORT_DOMAINAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleNON_NUMERIC_OPERATOR
entryRuleNON_NUMERIC_OPERATOR returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNON_NUMERIC_OPERATORRule()); }
	iv_ruleNON_NUMERIC_OPERATOR=ruleNON_NUMERIC_OPERATOR
	{ $current=$iv_ruleNON_NUMERIC_OPERATOR.current.getText(); }
	EOF;

// Rule NON_NUMERIC_OPERATOR
ruleNON_NUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_EQUAL_0=RULE_EQUAL
		{
			$current.merge(this_EQUAL_0);
		}
		{
			newLeafNode(this_EQUAL_0, grammarAccess.getNON_NUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0());
		}
		    |
		this_NOT_EQUAL_1=RULE_NOT_EQUAL
		{
			$current.merge(this_NOT_EQUAL_1);
		}
		{
			newLeafNode(this_NOT_EQUAL_1, grammarAccess.getNON_NUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleNUMERIC_OPERATOR
entryRuleNUMERIC_OPERATOR returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNUMERIC_OPERATORRule()); }
	iv_ruleNUMERIC_OPERATOR=ruleNUMERIC_OPERATOR
	{ $current=$iv_ruleNUMERIC_OPERATOR.current.getText(); }
	EOF;

// Rule NUMERIC_OPERATOR
ruleNUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_EQUAL_0=RULE_EQUAL
		{
			$current.merge(this_EQUAL_0);
		}
		{
			newLeafNode(this_EQUAL_0, grammarAccess.getNUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0());
		}
		    |
		this_NOT_EQUAL_1=RULE_NOT_EQUAL
		{
			$current.merge(this_NOT_EQUAL_1);
		}
		{
			newLeafNode(this_NOT_EQUAL_1, grammarAccess.getNUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1());
		}
		    |
		this_GT_2=RULE_GT
		{
			$current.merge(this_GT_2);
		}
		{
			newLeafNode(this_GT_2, grammarAccess.getNUMERIC_OPERATORAccess().getGTTerminalRuleCall_2());
		}
		    |
		this_LT_3=RULE_LT
		{
			$current.merge(this_LT_3);
		}
		{
			newLeafNode(this_LT_3, grammarAccess.getNUMERIC_OPERATORAccess().getLTTerminalRuleCall_3());
		}
		    |
		this_GTE_4=RULE_GTE
		{
			$current.merge(this_GTE_4);
		}
		{
			newLeafNode(this_GTE_4, grammarAccess.getNUMERIC_OPERATORAccess().getGTETerminalRuleCall_4());
		}
		    |
		this_LTE_5=RULE_LTE
		{
			$current.merge(this_LTE_5);
		}
		{
			newLeafNode(this_LTE_5, grammarAccess.getNUMERIC_OPERATORAccess().getLTETerminalRuleCall_5());
		}
	)
;
