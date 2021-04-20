/*
 * Copyright 2020-2021 B2i Healthcare Pte Ltd, http://b2i.sg
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
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@header {
package com.b2international.snomed.etl.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.b2international.snomed.etl.services.EtlGrammarAccess;

}
@members {
	private EtlGrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("True", "'true'");
		tokenNameToValue.put("False", "'false'");
	}

	public void setGrammarAccess(EtlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		String result = tokenNameToValue.get(tokenName);
		if (result == null)
			result = tokenName;
		return result;
	}
}

// Entry rule entryRuleExpressionTemplate
entryRuleExpressionTemplate
:
{ before(grammarAccess.getExpressionTemplateRule()); }
	 ruleExpressionTemplate
{ after(grammarAccess.getExpressionTemplateRule()); } 
	 EOF 
;

// Rule ExpressionTemplate
ruleExpressionTemplate 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionTemplateAccess().getGroup()); }
		(rule__ExpressionTemplate__Group__0)
		{ after(grammarAccess.getExpressionTemplateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubExpression
entryRuleSubExpression
:
{ before(grammarAccess.getSubExpressionRule()); }
	 ruleSubExpression
{ after(grammarAccess.getSubExpressionRule()); } 
	 EOF 
;

// Rule SubExpression
ruleSubExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubExpressionAccess().getGroup()); }
		(rule__SubExpression__Group__0)
		{ after(grammarAccess.getSubExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFocusConcept
entryRuleFocusConcept
:
{ before(grammarAccess.getFocusConceptRule()); }
	 ruleFocusConcept
{ after(grammarAccess.getFocusConceptRule()); } 
	 EOF 
;

// Rule FocusConcept
ruleFocusConcept 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFocusConceptAccess().getGroup()); }
		(rule__FocusConcept__Group__0)
		{ after(grammarAccess.getFocusConceptAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRefinement
entryRuleRefinement
:
{ before(grammarAccess.getRefinementRule()); }
	 ruleRefinement
{ after(grammarAccess.getRefinementRule()); } 
	 EOF 
;

// Rule Refinement
ruleRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRefinementAccess().getGroup()); }
		(rule__Refinement__Group__0)
		{ after(grammarAccess.getRefinementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeGroup
entryRuleAttributeGroup
:
{ before(grammarAccess.getAttributeGroupRule()); }
	 ruleAttributeGroup
{ after(grammarAccess.getAttributeGroupRule()); } 
	 EOF 
;

// Rule AttributeGroup
ruleAttributeGroup 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeGroupAccess().getGroup()); }
		(rule__AttributeGroup__Group__0)
		{ after(grammarAccess.getAttributeGroupAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getGroup()); }
		(rule__Attribute__Group__0)
		{ after(grammarAccess.getAttributeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeValue
entryRuleAttributeValue
:
{ before(grammarAccess.getAttributeValueRule()); }
	 ruleAttributeValue
{ after(grammarAccess.getAttributeValueRule()); } 
	 EOF 
;

// Rule AttributeValue
ruleAttributeValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeValueAccess().getAlternatives()); }
		(rule__AttributeValue__Alternatives)
		{ after(grammarAccess.getAttributeValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConceptIdReplacementSlot
entryRuleConceptIdReplacementSlot
:
{ before(grammarAccess.getConceptIdReplacementSlotRule()); }
	 ruleConceptIdReplacementSlot
{ after(grammarAccess.getConceptIdReplacementSlotRule()); } 
	 EOF 
;

// Rule ConceptIdReplacementSlot
ruleConceptIdReplacementSlot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConceptIdReplacementSlotAccess().getGroup()); }
		(rule__ConceptIdReplacementSlot__Group__0)
		{ after(grammarAccess.getConceptIdReplacementSlotAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpressionReplacementSlot
entryRuleExpressionReplacementSlot
:
{ before(grammarAccess.getExpressionReplacementSlotRule()); }
	 ruleExpressionReplacementSlot
{ after(grammarAccess.getExpressionReplacementSlotRule()); } 
	 EOF 
;

// Rule ExpressionReplacementSlot
ruleExpressionReplacementSlot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionReplacementSlotAccess().getGroup()); }
		(rule__ExpressionReplacementSlot__Group__0)
		{ after(grammarAccess.getExpressionReplacementSlotAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTokenReplacementSlot
entryRuleTokenReplacementSlot
:
{ before(grammarAccess.getTokenReplacementSlotRule()); }
	 ruleTokenReplacementSlot
{ after(grammarAccess.getTokenReplacementSlotRule()); } 
	 EOF 
;

// Rule TokenReplacementSlot
ruleTokenReplacementSlot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTokenReplacementSlotAccess().getGroup()); }
		(rule__TokenReplacementSlot__Group__0)
		{ after(grammarAccess.getTokenReplacementSlotAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTemplateInformationSlot
entryRuleTemplateInformationSlot
:
{ before(grammarAccess.getTemplateInformationSlotRule()); }
	 ruleTemplateInformationSlot
{ after(grammarAccess.getTemplateInformationSlotRule()); } 
	 EOF 
;

// Rule TemplateInformationSlot
ruleTemplateInformationSlot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTemplateInformationSlotAccess().getGroup()); }
		(rule__TemplateInformationSlot__Group__0)
		{ after(grammarAccess.getTemplateInformationSlotAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConcreteValueReplacementSlot
entryRuleConcreteValueReplacementSlot
:
{ before(grammarAccess.getConcreteValueReplacementSlotRule()); }
	 ruleConcreteValueReplacementSlot
{ after(grammarAccess.getConcreteValueReplacementSlotRule()); } 
	 EOF 
;

// Rule ConcreteValueReplacementSlot
ruleConcreteValueReplacementSlot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConcreteValueReplacementSlotAccess().getAlternatives()); }
		(rule__ConcreteValueReplacementSlot__Alternatives)
		{ after(grammarAccess.getConcreteValueReplacementSlotAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringReplacementSlot
entryRuleStringReplacementSlot
:
{ before(grammarAccess.getStringReplacementSlotRule()); }
	 ruleStringReplacementSlot
{ after(grammarAccess.getStringReplacementSlotRule()); } 
	 EOF 
;

// Rule StringReplacementSlot
ruleStringReplacementSlot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringReplacementSlotAccess().getGroup()); }
		(rule__StringReplacementSlot__Group__0)
		{ after(grammarAccess.getStringReplacementSlotAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerReplacementSlot
entryRuleIntegerReplacementSlot
:
{ before(grammarAccess.getIntegerReplacementSlotRule()); }
	 ruleIntegerReplacementSlot
{ after(grammarAccess.getIntegerReplacementSlotRule()); } 
	 EOF 
;

// Rule IntegerReplacementSlot
ruleIntegerReplacementSlot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerReplacementSlotAccess().getGroup()); }
		(rule__IntegerReplacementSlot__Group__0)
		{ after(grammarAccess.getIntegerReplacementSlotAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalReplacementSlot
entryRuleDecimalReplacementSlot
:
{ before(grammarAccess.getDecimalReplacementSlotRule()); }
	 ruleDecimalReplacementSlot
{ after(grammarAccess.getDecimalReplacementSlotRule()); } 
	 EOF 
;

// Rule DecimalReplacementSlot
ruleDecimalReplacementSlot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalReplacementSlotAccess().getGroup()); }
		(rule__DecimalReplacementSlot__Group__0)
		{ after(grammarAccess.getDecimalReplacementSlotAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEtlCardinality
entryRuleEtlCardinality
:
{ before(grammarAccess.getEtlCardinalityRule()); }
	 ruleEtlCardinality
{ after(grammarAccess.getEtlCardinalityRule()); } 
	 EOF 
;

// Rule EtlCardinality
ruleEtlCardinality 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEtlCardinalityAccess().getGroup()); }
		(rule__EtlCardinality__Group__0)
		{ after(grammarAccess.getEtlCardinalityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConceptReplacementSlot
entryRuleConceptReplacementSlot
:
{ before(grammarAccess.getConceptReplacementSlotRule()); }
	 ruleConceptReplacementSlot
{ after(grammarAccess.getConceptReplacementSlotRule()); } 
	 EOF 
;

// Rule ConceptReplacementSlot
ruleConceptReplacementSlot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConceptReplacementSlotAccess().getAlternatives()); }
		(rule__ConceptReplacementSlot__Alternatives)
		{ after(grammarAccess.getConceptReplacementSlotAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConceptReference
entryRuleConceptReference
:
{ before(grammarAccess.getConceptReferenceRule()); }
	 ruleConceptReference
{ after(grammarAccess.getConceptReferenceRule()); } 
	 EOF 
;

// Rule ConceptReference
ruleConceptReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConceptReferenceAccess().getAlternatives()); }
		(rule__ConceptReference__Alternatives)
		{ after(grammarAccess.getConceptReferenceAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlotToken
entryRuleSlotToken
:
{ before(grammarAccess.getSlotTokenRule()); }
	 ruleSlotToken
{ after(grammarAccess.getSlotTokenRule()); } 
	 EOF 
;

// Rule SlotToken
ruleSlotToken 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlotTokenAccess().getAlternatives()); }
		(rule__SlotToken__Alternatives)
		{ after(grammarAccess.getSlotTokenAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringValue
entryRuleStringValue
:
{ before(grammarAccess.getStringValueRule()); }
	 ruleStringValue
{ after(grammarAccess.getStringValueRule()); } 
	 EOF 
;

// Rule StringValue
ruleStringValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringValueAccess().getValueAssignment()); }
		(rule__StringValue__ValueAssignment)
		{ after(grammarAccess.getStringValueAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValue
entryRuleIntegerValue
:
{ before(grammarAccess.getIntegerValueRule()); }
	 ruleIntegerValue
{ after(grammarAccess.getIntegerValueRule()); } 
	 EOF 
;

// Rule IntegerValue
ruleIntegerValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueAccess().getGroup()); }
		(rule__IntegerValue__Group__0)
		{ after(grammarAccess.getIntegerValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValue
entryRuleDecimalValue
:
{ before(grammarAccess.getDecimalValueRule()); }
	 ruleDecimalValue
{ after(grammarAccess.getDecimalValueRule()); } 
	 EOF 
;

// Rule DecimalValue
ruleDecimalValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueAccess().getGroup()); }
		(rule__DecimalValue__Group__0)
		{ after(grammarAccess.getDecimalValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlotInteger
entryRuleSlotInteger
:
{ before(grammarAccess.getSlotIntegerRule()); }
	 ruleSlotInteger
{ after(grammarAccess.getSlotIntegerRule()); } 
	 EOF 
;

// Rule SlotInteger
ruleSlotInteger 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlotIntegerAccess().getAlternatives()); }
		(rule__SlotInteger__Alternatives)
		{ after(grammarAccess.getSlotIntegerAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlotIntegerValue
entryRuleSlotIntegerValue
:
{ before(grammarAccess.getSlotIntegerValueRule()); }
	 ruleSlotIntegerValue
{ after(grammarAccess.getSlotIntegerValueRule()); } 
	 EOF 
;

// Rule SlotIntegerValue
ruleSlotIntegerValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlotIntegerValueAccess().getGroup()); }
		(rule__SlotIntegerValue__Group__0)
		{ after(grammarAccess.getSlotIntegerValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlotIntegerRange
entryRuleSlotIntegerRange
:
{ before(grammarAccess.getSlotIntegerRangeRule()); }
	 ruleSlotIntegerRange
{ after(grammarAccess.getSlotIntegerRangeRule()); } 
	 EOF 
;

// Rule SlotIntegerRange
ruleSlotIntegerRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlotIntegerRangeAccess().getAlternatives()); }
		(rule__SlotIntegerRange__Alternatives)
		{ after(grammarAccess.getSlotIntegerRangeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlotIntegerMinimumValue
entryRuleSlotIntegerMinimumValue
:
{ before(grammarAccess.getSlotIntegerMinimumValueRule()); }
	 ruleSlotIntegerMinimumValue
{ after(grammarAccess.getSlotIntegerMinimumValueRule()); } 
	 EOF 
;

// Rule SlotIntegerMinimumValue
ruleSlotIntegerMinimumValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlotIntegerMinimumValueAccess().getGroup()); }
		(rule__SlotIntegerMinimumValue__Group__0)
		{ after(grammarAccess.getSlotIntegerMinimumValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlotIntegerMaximumValue
entryRuleSlotIntegerMaximumValue
:
{ before(grammarAccess.getSlotIntegerMaximumValueRule()); }
	 ruleSlotIntegerMaximumValue
{ after(grammarAccess.getSlotIntegerMaximumValueRule()); } 
	 EOF 
;

// Rule SlotIntegerMaximumValue
ruleSlotIntegerMaximumValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlotIntegerMaximumValueAccess().getGroup()); }
		(rule__SlotIntegerMaximumValue__Group__0)
		{ after(grammarAccess.getSlotIntegerMaximumValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlotDecimal
entryRuleSlotDecimal
:
{ before(grammarAccess.getSlotDecimalRule()); }
	 ruleSlotDecimal
{ after(grammarAccess.getSlotDecimalRule()); } 
	 EOF 
;

// Rule SlotDecimal
ruleSlotDecimal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlotDecimalAccess().getAlternatives()); }
		(rule__SlotDecimal__Alternatives)
		{ after(grammarAccess.getSlotDecimalAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlotDecimalValue
entryRuleSlotDecimalValue
:
{ before(grammarAccess.getSlotDecimalValueRule()); }
	 ruleSlotDecimalValue
{ after(grammarAccess.getSlotDecimalValueRule()); } 
	 EOF 
;

// Rule SlotDecimalValue
ruleSlotDecimalValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlotDecimalValueAccess().getGroup()); }
		(rule__SlotDecimalValue__Group__0)
		{ after(grammarAccess.getSlotDecimalValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlotDecimalRange
entryRuleSlotDecimalRange
:
{ before(grammarAccess.getSlotDecimalRangeRule()); }
	 ruleSlotDecimalRange
{ after(grammarAccess.getSlotDecimalRangeRule()); } 
	 EOF 
;

// Rule SlotDecimalRange
ruleSlotDecimalRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlotDecimalRangeAccess().getAlternatives()); }
		(rule__SlotDecimalRange__Alternatives)
		{ after(grammarAccess.getSlotDecimalRangeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlotDecimalMinimumValue
entryRuleSlotDecimalMinimumValue
:
{ before(grammarAccess.getSlotDecimalMinimumValueRule()); }
	 ruleSlotDecimalMinimumValue
{ after(grammarAccess.getSlotDecimalMinimumValueRule()); } 
	 EOF 
;

// Rule SlotDecimalMinimumValue
ruleSlotDecimalMinimumValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlotDecimalMinimumValueAccess().getGroup()); }
		(rule__SlotDecimalMinimumValue__Group__0)
		{ after(grammarAccess.getSlotDecimalMinimumValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlotDecimalMaximumValue
entryRuleSlotDecimalMaximumValue
:
{ before(grammarAccess.getSlotDecimalMaximumValueRule()); }
	 ruleSlotDecimalMaximumValue
{ after(grammarAccess.getSlotDecimalMaximumValueRule()); } 
	 EOF 
;

// Rule SlotDecimalMaximumValue
ruleSlotDecimalMaximumValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlotDecimalMaximumValueAccess().getGroup()); }
		(rule__SlotDecimalMaximumValue__Group__0)
		{ after(grammarAccess.getSlotDecimalMaximumValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpressionConstraint
entryRuleExpressionConstraint
:
{ before(grammarAccess.getExpressionConstraintRule()); }
	 ruleExpressionConstraint
{ after(grammarAccess.getExpressionConstraintRule()); } 
	 EOF 
;

// Rule ExpressionConstraint
ruleExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionConstraintAccess().getOrExpressionConstraintParserRuleCall()); }
		ruleOrExpressionConstraint
		{ after(grammarAccess.getExpressionConstraintAccess().getOrExpressionConstraintParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrExpressionConstraint
entryRuleOrExpressionConstraint
:
{ before(grammarAccess.getOrExpressionConstraintRule()); }
	 ruleOrExpressionConstraint
{ after(grammarAccess.getOrExpressionConstraintRule()); } 
	 EOF 
;

// Rule OrExpressionConstraint
ruleOrExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrExpressionConstraintAccess().getGroup()); }
		(rule__OrExpressionConstraint__Group__0)
		{ after(grammarAccess.getOrExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndExpressionConstraint
entryRuleAndExpressionConstraint
:
{ before(grammarAccess.getAndExpressionConstraintRule()); }
	 ruleAndExpressionConstraint
{ after(grammarAccess.getAndExpressionConstraintRule()); } 
	 EOF 
;

// Rule AndExpressionConstraint
ruleAndExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndExpressionConstraintAccess().getGroup()); }
		(rule__AndExpressionConstraint__Group__0)
		{ after(grammarAccess.getAndExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExclusionExpressionConstraint
entryRuleExclusionExpressionConstraint
:
{ before(grammarAccess.getExclusionExpressionConstraintRule()); }
	 ruleExclusionExpressionConstraint
{ after(grammarAccess.getExclusionExpressionConstraintRule()); } 
	 EOF 
;

// Rule ExclusionExpressionConstraint
ruleExclusionExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExclusionExpressionConstraintAccess().getGroup()); }
		(rule__ExclusionExpressionConstraint__Group__0)
		{ after(grammarAccess.getExclusionExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRefinedExpressionConstraint
entryRuleRefinedExpressionConstraint
:
{ before(grammarAccess.getRefinedExpressionConstraintRule()); }
	 ruleRefinedExpressionConstraint
{ after(grammarAccess.getRefinedExpressionConstraintRule()); } 
	 EOF 
;

// Rule RefinedExpressionConstraint
ruleRefinedExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRefinedExpressionConstraintAccess().getGroup()); }
		(rule__RefinedExpressionConstraint__Group__0)
		{ after(grammarAccess.getRefinedExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDottedExpressionConstraint
entryRuleDottedExpressionConstraint
:
{ before(grammarAccess.getDottedExpressionConstraintRule()); }
	 ruleDottedExpressionConstraint
{ after(grammarAccess.getDottedExpressionConstraintRule()); } 
	 EOF 
;

// Rule DottedExpressionConstraint
ruleDottedExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDottedExpressionConstraintAccess().getGroup()); }
		(rule__DottedExpressionConstraint__Group__0)
		{ after(grammarAccess.getDottedExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubExpressionConstraint
entryRuleSubExpressionConstraint
:
{ before(grammarAccess.getSubExpressionConstraintRule()); }
	 ruleSubExpressionConstraint
{ after(grammarAccess.getSubExpressionConstraintRule()); } 
	 EOF 
;

// Rule SubExpressionConstraint
ruleSubExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getAlternatives()); }
		(rule__SubExpressionConstraint__Alternatives)
		{ after(grammarAccess.getSubExpressionConstraintAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclFocusConcept
entryRuleEclFocusConcept
:
{ before(grammarAccess.getEclFocusConceptRule()); }
	 ruleEclFocusConcept
{ after(grammarAccess.getEclFocusConceptRule()); } 
	 EOF 
;

// Rule EclFocusConcept
ruleEclFocusConcept 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getAlternatives()); }
		(rule__EclFocusConcept__Alternatives)
		{ after(grammarAccess.getEclFocusConceptAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChildOf
entryRuleChildOf
:
{ before(grammarAccess.getChildOfRule()); }
	 ruleChildOf
{ after(grammarAccess.getChildOfRule()); } 
	 EOF 
;

// Rule ChildOf
ruleChildOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChildOfAccess().getGroup()); }
		(rule__ChildOf__Group__0)
		{ after(grammarAccess.getChildOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChildOrSelfOf
entryRuleChildOrSelfOf
:
{ before(grammarAccess.getChildOrSelfOfRule()); }
	 ruleChildOrSelfOf
{ after(grammarAccess.getChildOrSelfOfRule()); } 
	 EOF 
;

// Rule ChildOrSelfOf
ruleChildOrSelfOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChildOrSelfOfAccess().getGroup()); }
		(rule__ChildOrSelfOf__Group__0)
		{ after(grammarAccess.getChildOrSelfOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDescendantOf
entryRuleDescendantOf
:
{ before(grammarAccess.getDescendantOfRule()); }
	 ruleDescendantOf
{ after(grammarAccess.getDescendantOfRule()); } 
	 EOF 
;

// Rule DescendantOf
ruleDescendantOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDescendantOfAccess().getGroup()); }
		(rule__DescendantOf__Group__0)
		{ after(grammarAccess.getDescendantOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDescendantOrSelfOf
entryRuleDescendantOrSelfOf
:
{ before(grammarAccess.getDescendantOrSelfOfRule()); }
	 ruleDescendantOrSelfOf
{ after(grammarAccess.getDescendantOrSelfOfRule()); } 
	 EOF 
;

// Rule DescendantOrSelfOf
ruleDescendantOrSelfOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDescendantOrSelfOfAccess().getGroup()); }
		(rule__DescendantOrSelfOf__Group__0)
		{ after(grammarAccess.getDescendantOrSelfOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParentOf
entryRuleParentOf
:
{ before(grammarAccess.getParentOfRule()); }
	 ruleParentOf
{ after(grammarAccess.getParentOfRule()); } 
	 EOF 
;

// Rule ParentOf
ruleParentOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParentOfAccess().getGroup()); }
		(rule__ParentOf__Group__0)
		{ after(grammarAccess.getParentOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParentOrSelfOf
entryRuleParentOrSelfOf
:
{ before(grammarAccess.getParentOrSelfOfRule()); }
	 ruleParentOrSelfOf
{ after(grammarAccess.getParentOrSelfOfRule()); } 
	 EOF 
;

// Rule ParentOrSelfOf
ruleParentOrSelfOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParentOrSelfOfAccess().getGroup()); }
		(rule__ParentOrSelfOf__Group__0)
		{ after(grammarAccess.getParentOrSelfOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAncestorOf
entryRuleAncestorOf
:
{ before(grammarAccess.getAncestorOfRule()); }
	 ruleAncestorOf
{ after(grammarAccess.getAncestorOfRule()); } 
	 EOF 
;

// Rule AncestorOf
ruleAncestorOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAncestorOfAccess().getGroup()); }
		(rule__AncestorOf__Group__0)
		{ after(grammarAccess.getAncestorOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAncestorOrSelfOf
entryRuleAncestorOrSelfOf
:
{ before(grammarAccess.getAncestorOrSelfOfRule()); }
	 ruleAncestorOrSelfOf
{ after(grammarAccess.getAncestorOrSelfOfRule()); } 
	 EOF 
;

// Rule AncestorOrSelfOf
ruleAncestorOrSelfOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAncestorOrSelfOfAccess().getGroup()); }
		(rule__AncestorOrSelfOf__Group__0)
		{ after(grammarAccess.getAncestorOrSelfOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMemberOf
entryRuleMemberOf
:
{ before(grammarAccess.getMemberOfRule()); }
	 ruleMemberOf
{ after(grammarAccess.getMemberOfRule()); } 
	 EOF 
;

// Rule MemberOf
ruleMemberOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMemberOfAccess().getGroup()); }
		(rule__MemberOf__Group__0)
		{ after(grammarAccess.getMemberOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclConceptReference
entryRuleEclConceptReference
:
{ before(grammarAccess.getEclConceptReferenceRule()); }
	 ruleEclConceptReference
{ after(grammarAccess.getEclConceptReferenceRule()); } 
	 EOF 
;

// Rule EclConceptReference
ruleEclConceptReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclConceptReferenceAccess().getGroup()); }
		(rule__EclConceptReference__Group__0)
		{ after(grammarAccess.getEclConceptReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAny
entryRuleAny
:
{ before(grammarAccess.getAnyRule()); }
	 ruleAny
{ after(grammarAccess.getAnyRule()); } 
	 EOF 
;

// Rule Any
ruleAny 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnyAccess().getGroup()); }
		(rule__Any__Group__0)
		{ after(grammarAccess.getAnyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclRefinement
entryRuleEclRefinement
:
{ before(grammarAccess.getEclRefinementRule()); }
	 ruleEclRefinement
{ after(grammarAccess.getEclRefinementRule()); } 
	 EOF 
;

// Rule EclRefinement
ruleEclRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclRefinementAccess().getOrRefinementParserRuleCall()); }
		ruleOrRefinement
		{ after(grammarAccess.getEclRefinementAccess().getOrRefinementParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrRefinement
entryRuleOrRefinement
:
{ before(grammarAccess.getOrRefinementRule()); }
	 ruleOrRefinement
{ after(grammarAccess.getOrRefinementRule()); } 
	 EOF 
;

// Rule OrRefinement
ruleOrRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrRefinementAccess().getGroup()); }
		(rule__OrRefinement__Group__0)
		{ after(grammarAccess.getOrRefinementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndRefinement
entryRuleAndRefinement
:
{ before(grammarAccess.getAndRefinementRule()); }
	 ruleAndRefinement
{ after(grammarAccess.getAndRefinementRule()); } 
	 EOF 
;

// Rule AndRefinement
ruleAndRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndRefinementAccess().getGroup()); }
		(rule__AndRefinement__Group__0)
		{ after(grammarAccess.getAndRefinementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubRefinement
entryRuleSubRefinement
:
{ before(grammarAccess.getSubRefinementRule()); }
	 ruleSubRefinement
{ after(grammarAccess.getSubRefinementRule()); } 
	 EOF 
;

// Rule SubRefinement
ruleSubRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubRefinementAccess().getAlternatives()); }
		(rule__SubRefinement__Alternatives)
		{ after(grammarAccess.getSubRefinementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedRefinement
entryRuleNestedRefinement
:
{ before(grammarAccess.getNestedRefinementRule()); }
	 ruleNestedRefinement
{ after(grammarAccess.getNestedRefinementRule()); } 
	 EOF 
;

// Rule NestedRefinement
ruleNestedRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedRefinementAccess().getGroup()); }
		(rule__NestedRefinement__Group__0)
		{ after(grammarAccess.getNestedRefinementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclAttributeGroup
entryRuleEclAttributeGroup
:
{ before(grammarAccess.getEclAttributeGroupRule()); }
	 ruleEclAttributeGroup
{ after(grammarAccess.getEclAttributeGroupRule()); } 
	 EOF 
;

// Rule EclAttributeGroup
ruleEclAttributeGroup 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclAttributeGroupAccess().getGroup()); }
		(rule__EclAttributeGroup__Group__0)
		{ after(grammarAccess.getEclAttributeGroupAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclAttributeSet
entryRuleEclAttributeSet
:
{ before(grammarAccess.getEclAttributeSetRule()); }
	 ruleEclAttributeSet
{ after(grammarAccess.getEclAttributeSetRule()); } 
	 EOF 
;

// Rule EclAttributeSet
ruleEclAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclAttributeSetAccess().getOrAttributeSetParserRuleCall()); }
		ruleOrAttributeSet
		{ after(grammarAccess.getEclAttributeSetAccess().getOrAttributeSetParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrAttributeSet
entryRuleOrAttributeSet
:
{ before(grammarAccess.getOrAttributeSetRule()); }
	 ruleOrAttributeSet
{ after(grammarAccess.getOrAttributeSetRule()); } 
	 EOF 
;

// Rule OrAttributeSet
ruleOrAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrAttributeSetAccess().getGroup()); }
		(rule__OrAttributeSet__Group__0)
		{ after(grammarAccess.getOrAttributeSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndAttributeSet
entryRuleAndAttributeSet
:
{ before(grammarAccess.getAndAttributeSetRule()); }
	 ruleAndAttributeSet
{ after(grammarAccess.getAndAttributeSetRule()); } 
	 EOF 
;

// Rule AndAttributeSet
ruleAndAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndAttributeSetAccess().getGroup()); }
		(rule__AndAttributeSet__Group__0)
		{ after(grammarAccess.getAndAttributeSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubAttributeSet
entryRuleSubAttributeSet
:
{ before(grammarAccess.getSubAttributeSetRule()); }
	 ruleSubAttributeSet
{ after(grammarAccess.getSubAttributeSetRule()); } 
	 EOF 
;

// Rule SubAttributeSet
ruleSubAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubAttributeSetAccess().getAlternatives()); }
		(rule__SubAttributeSet__Alternatives)
		{ after(grammarAccess.getSubAttributeSetAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedAttributeSet
entryRuleNestedAttributeSet
:
{ before(grammarAccess.getNestedAttributeSetRule()); }
	 ruleNestedAttributeSet
{ after(grammarAccess.getNestedAttributeSetRule()); } 
	 EOF 
;

// Rule NestedAttributeSet
ruleNestedAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedAttributeSetAccess().getGroup()); }
		(rule__NestedAttributeSet__Group__0)
		{ after(grammarAccess.getNestedAttributeSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeConstraint
entryRuleAttributeConstraint
:
{ before(grammarAccess.getAttributeConstraintRule()); }
	 ruleAttributeConstraint
{ after(grammarAccess.getAttributeConstraintRule()); } 
	 EOF 
;

// Rule AttributeConstraint
ruleAttributeConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getGroup()); }
		(rule__AttributeConstraint__Group__0)
		{ after(grammarAccess.getAttributeConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCardinality
entryRuleCardinality
:
{ before(grammarAccess.getCardinalityRule()); }
	 ruleCardinality
{ after(grammarAccess.getCardinalityRule()); } 
	 EOF 
;

// Rule Cardinality
ruleCardinality 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCardinalityAccess().getGroup()); }
		(rule__Cardinality__Group__0)
		{ after(grammarAccess.getCardinalityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComparison
entryRuleComparison
:
{ before(grammarAccess.getComparisonRule()); }
	 ruleComparison
{ after(grammarAccess.getComparisonRule()); } 
	 EOF 
;

// Rule Comparison
ruleComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComparisonAccess().getAlternatives()); }
		(rule__Comparison__Alternatives)
		{ after(grammarAccess.getComparisonAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeComparison
entryRuleAttributeComparison
:
{ before(grammarAccess.getAttributeComparisonRule()); }
	 ruleAttributeComparison
{ after(grammarAccess.getAttributeComparisonRule()); } 
	 EOF 
;

// Rule AttributeComparison
ruleAttributeComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeComparisonAccess().getAlternatives()); }
		(rule__AttributeComparison__Alternatives)
		{ after(grammarAccess.getAttributeComparisonAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataTypeComparison
entryRuleDataTypeComparison
:
{ before(grammarAccess.getDataTypeComparisonRule()); }
	 ruleDataTypeComparison
{ after(grammarAccess.getDataTypeComparisonRule()); } 
	 EOF 
;

// Rule DataTypeComparison
ruleDataTypeComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getAlternatives()); }
		(rule__DataTypeComparison__Alternatives)
		{ after(grammarAccess.getDataTypeComparisonAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeValueEquals
entryRuleAttributeValueEquals
:
{ before(grammarAccess.getAttributeValueEqualsRule()); }
	 ruleAttributeValueEquals
{ after(grammarAccess.getAttributeValueEqualsRule()); } 
	 EOF 
;

// Rule AttributeValueEquals
ruleAttributeValueEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeValueEqualsAccess().getGroup()); }
		(rule__AttributeValueEquals__Group__0)
		{ after(grammarAccess.getAttributeValueEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeValueNotEquals
entryRuleAttributeValueNotEquals
:
{ before(grammarAccess.getAttributeValueNotEqualsRule()); }
	 ruleAttributeValueNotEquals
{ after(grammarAccess.getAttributeValueNotEqualsRule()); } 
	 EOF 
;

// Rule AttributeValueNotEquals
ruleAttributeValueNotEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeValueNotEqualsAccess().getGroup()); }
		(rule__AttributeValueNotEquals__Group__0)
		{ after(grammarAccess.getAttributeValueNotEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBooleanValueEquals
entryRuleBooleanValueEquals
:
{ before(grammarAccess.getBooleanValueEqualsRule()); }
	 ruleBooleanValueEquals
{ after(grammarAccess.getBooleanValueEqualsRule()); } 
	 EOF 
;

// Rule BooleanValueEquals
ruleBooleanValueEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanValueEqualsAccess().getGroup()); }
		(rule__BooleanValueEquals__Group__0)
		{ after(grammarAccess.getBooleanValueEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBooleanValueNotEquals
entryRuleBooleanValueNotEquals
:
{ before(grammarAccess.getBooleanValueNotEqualsRule()); }
	 ruleBooleanValueNotEquals
{ after(grammarAccess.getBooleanValueNotEqualsRule()); } 
	 EOF 
;

// Rule BooleanValueNotEquals
ruleBooleanValueNotEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanValueNotEqualsAccess().getGroup()); }
		(rule__BooleanValueNotEquals__Group__0)
		{ after(grammarAccess.getBooleanValueNotEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringValueEquals
entryRuleStringValueEquals
:
{ before(grammarAccess.getStringValueEqualsRule()); }
	 ruleStringValueEquals
{ after(grammarAccess.getStringValueEqualsRule()); } 
	 EOF 
;

// Rule StringValueEquals
ruleStringValueEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringValueEqualsAccess().getGroup()); }
		(rule__StringValueEquals__Group__0)
		{ after(grammarAccess.getStringValueEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringValueNotEquals
entryRuleStringValueNotEquals
:
{ before(grammarAccess.getStringValueNotEqualsRule()); }
	 ruleStringValueNotEquals
{ after(grammarAccess.getStringValueNotEqualsRule()); } 
	 EOF 
;

// Rule StringValueNotEquals
ruleStringValueNotEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringValueNotEqualsAccess().getGroup()); }
		(rule__StringValueNotEquals__Group__0)
		{ after(grammarAccess.getStringValueNotEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValueEquals
entryRuleIntegerValueEquals
:
{ before(grammarAccess.getIntegerValueEqualsRule()); }
	 ruleIntegerValueEquals
{ after(grammarAccess.getIntegerValueEqualsRule()); } 
	 EOF 
;

// Rule IntegerValueEquals
ruleIntegerValueEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueEqualsAccess().getGroup()); }
		(rule__IntegerValueEquals__Group__0)
		{ after(grammarAccess.getIntegerValueEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValueNotEquals
entryRuleIntegerValueNotEquals
:
{ before(grammarAccess.getIntegerValueNotEqualsRule()); }
	 ruleIntegerValueNotEquals
{ after(grammarAccess.getIntegerValueNotEqualsRule()); } 
	 EOF 
;

// Rule IntegerValueNotEquals
ruleIntegerValueNotEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueNotEqualsAccess().getGroup()); }
		(rule__IntegerValueNotEquals__Group__0)
		{ after(grammarAccess.getIntegerValueNotEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValueGreaterThan
entryRuleIntegerValueGreaterThan
:
{ before(grammarAccess.getIntegerValueGreaterThanRule()); }
	 ruleIntegerValueGreaterThan
{ after(grammarAccess.getIntegerValueGreaterThanRule()); } 
	 EOF 
;

// Rule IntegerValueGreaterThan
ruleIntegerValueGreaterThan 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueGreaterThanAccess().getGroup()); }
		(rule__IntegerValueGreaterThan__Group__0)
		{ after(grammarAccess.getIntegerValueGreaterThanAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValueLessThan
entryRuleIntegerValueLessThan
:
{ before(grammarAccess.getIntegerValueLessThanRule()); }
	 ruleIntegerValueLessThan
{ after(grammarAccess.getIntegerValueLessThanRule()); } 
	 EOF 
;

// Rule IntegerValueLessThan
ruleIntegerValueLessThan 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueLessThanAccess().getGroup()); }
		(rule__IntegerValueLessThan__Group__0)
		{ after(grammarAccess.getIntegerValueLessThanAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValueGreaterThanEquals
entryRuleIntegerValueGreaterThanEquals
:
{ before(grammarAccess.getIntegerValueGreaterThanEqualsRule()); }
	 ruleIntegerValueGreaterThanEquals
{ after(grammarAccess.getIntegerValueGreaterThanEqualsRule()); } 
	 EOF 
;

// Rule IntegerValueGreaterThanEquals
ruleIntegerValueGreaterThanEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGroup()); }
		(rule__IntegerValueGreaterThanEquals__Group__0)
		{ after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValueLessThanEquals
entryRuleIntegerValueLessThanEquals
:
{ before(grammarAccess.getIntegerValueLessThanEqualsRule()); }
	 ruleIntegerValueLessThanEquals
{ after(grammarAccess.getIntegerValueLessThanEqualsRule()); } 
	 EOF 
;

// Rule IntegerValueLessThanEquals
ruleIntegerValueLessThanEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueLessThanEqualsAccess().getGroup()); }
		(rule__IntegerValueLessThanEquals__Group__0)
		{ after(grammarAccess.getIntegerValueLessThanEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValueEquals
entryRuleDecimalValueEquals
:
{ before(grammarAccess.getDecimalValueEqualsRule()); }
	 ruleDecimalValueEquals
{ after(grammarAccess.getDecimalValueEqualsRule()); } 
	 EOF 
;

// Rule DecimalValueEquals
ruleDecimalValueEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueEqualsAccess().getGroup()); }
		(rule__DecimalValueEquals__Group__0)
		{ after(grammarAccess.getDecimalValueEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValueNotEquals
entryRuleDecimalValueNotEquals
:
{ before(grammarAccess.getDecimalValueNotEqualsRule()); }
	 ruleDecimalValueNotEquals
{ after(grammarAccess.getDecimalValueNotEqualsRule()); } 
	 EOF 
;

// Rule DecimalValueNotEquals
ruleDecimalValueNotEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueNotEqualsAccess().getGroup()); }
		(rule__DecimalValueNotEquals__Group__0)
		{ after(grammarAccess.getDecimalValueNotEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValueGreaterThan
entryRuleDecimalValueGreaterThan
:
{ before(grammarAccess.getDecimalValueGreaterThanRule()); }
	 ruleDecimalValueGreaterThan
{ after(grammarAccess.getDecimalValueGreaterThanRule()); } 
	 EOF 
;

// Rule DecimalValueGreaterThan
ruleDecimalValueGreaterThan 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueGreaterThanAccess().getGroup()); }
		(rule__DecimalValueGreaterThan__Group__0)
		{ after(grammarAccess.getDecimalValueGreaterThanAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValueLessThan
entryRuleDecimalValueLessThan
:
{ before(grammarAccess.getDecimalValueLessThanRule()); }
	 ruleDecimalValueLessThan
{ after(grammarAccess.getDecimalValueLessThanRule()); } 
	 EOF 
;

// Rule DecimalValueLessThan
ruleDecimalValueLessThan 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueLessThanAccess().getGroup()); }
		(rule__DecimalValueLessThan__Group__0)
		{ after(grammarAccess.getDecimalValueLessThanAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValueGreaterThanEquals
entryRuleDecimalValueGreaterThanEquals
:
{ before(grammarAccess.getDecimalValueGreaterThanEqualsRule()); }
	 ruleDecimalValueGreaterThanEquals
{ after(grammarAccess.getDecimalValueGreaterThanEqualsRule()); } 
	 EOF 
;

// Rule DecimalValueGreaterThanEquals
ruleDecimalValueGreaterThanEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGroup()); }
		(rule__DecimalValueGreaterThanEquals__Group__0)
		{ after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValueLessThanEquals
entryRuleDecimalValueLessThanEquals
:
{ before(grammarAccess.getDecimalValueLessThanEqualsRule()); }
	 ruleDecimalValueLessThanEquals
{ after(grammarAccess.getDecimalValueLessThanEqualsRule()); } 
	 EOF 
;

// Rule DecimalValueLessThanEquals
ruleDecimalValueLessThanEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueLessThanEqualsAccess().getGroup()); }
		(rule__DecimalValueLessThanEquals__Group__0)
		{ after(grammarAccess.getDecimalValueLessThanEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedExpression
entryRuleNestedExpression
:
{ before(grammarAccess.getNestedExpressionRule()); }
	 ruleNestedExpression
{ after(grammarAccess.getNestedExpressionRule()); } 
	 EOF 
;

// Rule NestedExpression
ruleNestedExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedExpressionAccess().getGroup()); }
		(rule__NestedExpression__Group__0)
		{ after(grammarAccess.getNestedExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSnomedIdentifier
entryRuleSnomedIdentifier
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getSnomedIdentifierRule()); }
	 ruleSnomedIdentifier
{ after(grammarAccess.getSnomedIdentifierRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule SnomedIdentifier
ruleSnomedIdentifier 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getGroup()); }
		(rule__SnomedIdentifier__Group__0)
		{ after(grammarAccess.getSnomedIdentifierAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNonNegativeInteger
entryRuleNonNegativeInteger
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getNonNegativeIntegerRule()); }
	 ruleNonNegativeInteger
{ after(grammarAccess.getNonNegativeIntegerRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule NonNegativeInteger
ruleNonNegativeInteger 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); }
		(rule__NonNegativeInteger__Alternatives)
		{ after(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleMaxValue
entryRuleMaxValue
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getMaxValueRule()); }
	 ruleMaxValue
{ after(grammarAccess.getMaxValueRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule MaxValue
ruleMaxValue 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMaxValueAccess().getAlternatives()); }
		(rule__MaxValue__Alternatives)
		{ after(grammarAccess.getMaxValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInteger
entryRuleInteger
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getIntegerRule()); }
	 ruleInteger
{ after(grammarAccess.getIntegerRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Integer
ruleInteger 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerAccess().getGroup()); }
		(rule__Integer__Group__0)
		{ after(grammarAccess.getIntegerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleDecimal
entryRuleDecimal
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getDecimalRule()); }
	 ruleDecimal
{ after(grammarAccess.getDecimalRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Decimal
ruleDecimal 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalAccess().getGroup()); }
		(rule__Decimal__Group__0)
		{ after(grammarAccess.getDecimalAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNonNegativeDecimal
entryRuleNonNegativeDecimal
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getNonNegativeDecimalRule()); }
	 ruleNonNegativeDecimal
{ after(grammarAccess.getNonNegativeDecimalRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule NonNegativeDecimal
ruleNonNegativeDecimal 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNonNegativeDecimalAccess().getGroup()); }
		(rule__NonNegativeDecimal__Group__0)
		{ after(grammarAccess.getNonNegativeDecimalAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleBoolean
entryRuleBoolean
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getBooleanRule()); }
	 ruleBoolean
{ after(grammarAccess.getBooleanRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Boolean
ruleBoolean 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanAccess().getAlternatives()); }
		(rule__Boolean__Alternatives)
		{ after(grammarAccess.getBooleanAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

rule__ExpressionTemplate__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionTemplateAccess().getAlternatives_1_0_0()); }
		(rule__ExpressionTemplate__Alternatives_1_0_0)
		{ after(grammarAccess.getExpressionTemplateAccess().getAlternatives_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionTemplateAccess().getSlotAssignment_1_0_1()); }
		(rule__ExpressionTemplate__SlotAssignment_1_0_1)
		{ after(grammarAccess.getExpressionTemplateAccess().getSlotAssignment_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionTemplate__Alternatives_1_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionTemplateAccess().getPrimitiveAssignment_1_0_0_0()); }
		(rule__ExpressionTemplate__PrimitiveAssignment_1_0_0_0)
		{ after(grammarAccess.getExpressionTemplateAccess().getPrimitiveAssignment_1_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionTemplateAccess().getEQUIVALENT_TOTerminalRuleCall_1_0_0_1()); }
		RULE_EQUIVALENT_TO
		{ after(grammarAccess.getExpressionTemplateAccess().getEQUIVALENT_TOTerminalRuleCall_1_0_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRefinementAccess().getGroup_0_0()); }
		(rule__Refinement__Group_0_0__0)
		{ after(grammarAccess.getRefinementAccess().getGroup_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getRefinementAccess().getGroupsAssignment_0_1()); }
		(rule__Refinement__GroupsAssignment_0_1)
		{ after(grammarAccess.getRefinementAccess().getGroupsAssignment_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeValueAccess().getConceptReferenceParserRuleCall_0()); }
		ruleConceptReference
		{ after(grammarAccess.getAttributeValueAccess().getConceptReferenceParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeValueAccess().getGroup_1()); }
		(rule__AttributeValue__Group_1__0)
		{ after(grammarAccess.getAttributeValueAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeValueAccess().getStringValueParserRuleCall_2()); }
		ruleStringValue
		{ after(grammarAccess.getAttributeValueAccess().getStringValueParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeValueAccess().getIntegerValueParserRuleCall_3()); }
		ruleIntegerValue
		{ after(grammarAccess.getAttributeValueAccess().getIntegerValueParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeValueAccess().getDecimalValueParserRuleCall_4()); }
		ruleDecimalValue
		{ after(grammarAccess.getAttributeValueAccess().getDecimalValueParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeValueAccess().getConcreteValueReplacementSlotParserRuleCall_5()); }
		ruleConcreteValueReplacementSlot
		{ after(grammarAccess.getAttributeValueAccess().getConcreteValueReplacementSlotParserRuleCall_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConcreteValueReplacementSlot__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConcreteValueReplacementSlotAccess().getStringReplacementSlotParserRuleCall_0()); }
		ruleStringReplacementSlot
		{ after(grammarAccess.getConcreteValueReplacementSlotAccess().getStringReplacementSlotParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getConcreteValueReplacementSlotAccess().getIntegerReplacementSlotParserRuleCall_1()); }
		ruleIntegerReplacementSlot
		{ after(grammarAccess.getConcreteValueReplacementSlotAccess().getIntegerReplacementSlotParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getConcreteValueReplacementSlotAccess().getDecimalReplacementSlotParserRuleCall_2()); }
		ruleDecimalReplacementSlot
		{ after(grammarAccess.getConcreteValueReplacementSlotAccess().getDecimalReplacementSlotParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptReplacementSlot__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptReplacementSlotAccess().getConceptIdReplacementSlotParserRuleCall_0()); }
		ruleConceptIdReplacementSlot
		{ after(grammarAccess.getConceptReplacementSlotAccess().getConceptIdReplacementSlotParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getConceptReplacementSlotAccess().getExpressionReplacementSlotParserRuleCall_1()); }
		ruleExpressionReplacementSlot
		{ after(grammarAccess.getConceptReplacementSlotAccess().getExpressionReplacementSlotParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptReference__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptReferenceAccess().getSlotAssignment_0()); }
		(rule__ConceptReference__SlotAssignment_0)
		{ after(grammarAccess.getConceptReferenceAccess().getSlotAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getConceptReferenceAccess().getGroup_1()); }
		(rule__ConceptReference__Group_1__0)
		{ after(grammarAccess.getConceptReferenceAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotToken__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotTokenAccess().getEQUIVALENT_TOTerminalRuleCall_0()); }
		RULE_EQUIVALENT_TO
		{ after(grammarAccess.getSlotTokenAccess().getEQUIVALENT_TOTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getSUBTYPE_OFTerminalRuleCall_1()); }
		RULE_SUBTYPE_OF
		{ after(grammarAccess.getSlotTokenAccess().getSUBTYPE_OFTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getCOMMATerminalRuleCall_2()); }
		RULE_COMMA
		{ after(grammarAccess.getSlotTokenAccess().getCOMMATerminalRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getCONJUNCTIONTerminalRuleCall_3()); }
		RULE_CONJUNCTION
		{ after(grammarAccess.getSlotTokenAccess().getCONJUNCTIONTerminalRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getDISJUNCTIONTerminalRuleCall_4()); }
		RULE_DISJUNCTION
		{ after(grammarAccess.getSlotTokenAccess().getDISJUNCTIONTerminalRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getEXCLUSIONTerminalRuleCall_5()); }
		RULE_EXCLUSION
		{ after(grammarAccess.getSlotTokenAccess().getEXCLUSIONTerminalRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getREVERSEDTerminalRuleCall_6()); }
		RULE_REVERSED
		{ after(grammarAccess.getSlotTokenAccess().getREVERSEDTerminalRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getCARETTerminalRuleCall_7()); }
		RULE_CARET
		{ after(grammarAccess.getSlotTokenAccess().getCARETTerminalRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getLTTerminalRuleCall_8()); }
		RULE_LT
		{ after(grammarAccess.getSlotTokenAccess().getLTTerminalRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getLTETerminalRuleCall_9()); }
		RULE_LTE
		{ after(grammarAccess.getSlotTokenAccess().getLTETerminalRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getDBL_LTTerminalRuleCall_10()); }
		RULE_DBL_LT
		{ after(grammarAccess.getSlotTokenAccess().getDBL_LTTerminalRuleCall_10()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getLT_EMTerminalRuleCall_11()); }
		RULE_LT_EM
		{ after(grammarAccess.getSlotTokenAccess().getLT_EMTerminalRuleCall_11()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getGTTerminalRuleCall_12()); }
		RULE_GT
		{ after(grammarAccess.getSlotTokenAccess().getGTTerminalRuleCall_12()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getGTETerminalRuleCall_13()); }
		RULE_GTE
		{ after(grammarAccess.getSlotTokenAccess().getGTETerminalRuleCall_13()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getDBL_GTTerminalRuleCall_14()); }
		RULE_DBL_GT
		{ after(grammarAccess.getSlotTokenAccess().getDBL_GTTerminalRuleCall_14()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getGT_EMTerminalRuleCall_15()); }
		RULE_GT_EM
		{ after(grammarAccess.getSlotTokenAccess().getGT_EMTerminalRuleCall_15()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getEQUALTerminalRuleCall_16()); }
		RULE_EQUAL
		{ after(grammarAccess.getSlotTokenAccess().getEQUALTerminalRuleCall_16()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getNOT_EQUALTerminalRuleCall_17()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getSlotTokenAccess().getNOT_EQUALTerminalRuleCall_17()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotInteger__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotIntegerAccess().getSlotIntegerRangeParserRuleCall_0()); }
		ruleSlotIntegerRange
		{ after(grammarAccess.getSlotIntegerAccess().getSlotIntegerRangeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlotIntegerAccess().getSlotIntegerValueParserRuleCall_1()); }
		ruleSlotIntegerValue
		{ after(grammarAccess.getSlotIntegerAccess().getSlotIntegerValueParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerRange__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotIntegerRangeAccess().getGroup_0()); }
		(rule__SlotIntegerRange__Group_0__0)
		{ after(grammarAccess.getSlotIntegerRangeAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlotIntegerRangeAccess().getGroup_1()); }
		(rule__SlotIntegerRange__Group_1__0)
		{ after(grammarAccess.getSlotIntegerRangeAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimal__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotDecimalAccess().getSlotDecimalRangeParserRuleCall_0()); }
		ruleSlotDecimalRange
		{ after(grammarAccess.getSlotDecimalAccess().getSlotDecimalRangeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlotDecimalAccess().getSlotDecimalValueParserRuleCall_1()); }
		ruleSlotDecimalValue
		{ after(grammarAccess.getSlotDecimalAccess().getSlotDecimalValueParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalRange__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotDecimalRangeAccess().getGroup_0()); }
		(rule__SlotDecimalRange__Group_0__0)
		{ after(grammarAccess.getSlotDecimalRangeAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlotDecimalRangeAccess().getGroup_1()); }
		(rule__SlotDecimalRange__Group_1__0)
		{ after(grammarAccess.getSlotDecimalRangeAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION
		{ after(grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1()); }
		RULE_COMMA
		{ after(grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpressionConstraint__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getChildOfParserRuleCall_0()); }
		ruleChildOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getChildOfParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getChildOrSelfOfParserRuleCall_1()); }
		ruleChildOrSelfOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getChildOrSelfOfParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_2()); }
		ruleDescendantOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_3()); }
		ruleDescendantOrSelfOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_4()); }
		ruleParentOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getParentOrSelfOfParserRuleCall_5()); }
		ruleParentOrSelfOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getParentOrSelfOfParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_6()); }
		ruleAncestorOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_7()); }
		ruleAncestorOrSelfOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_8()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_8()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclFocusConcept__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getMemberOfParserRuleCall_0()); }
		ruleMemberOf
		{ after(grammarAccess.getEclFocusConceptAccess().getMemberOfParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getEclConceptReferenceParserRuleCall_1()); }
		ruleEclConceptReference
		{ after(grammarAccess.getEclFocusConceptAccess().getEclConceptReferenceParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getAnyParserRuleCall_2()); }
		ruleAny
		{ after(grammarAccess.getEclFocusConceptAccess().getAnyParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_3()); }
		ruleNestedExpression
		{ after(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__ConstraintAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_1_0_0()); }
		ruleEclConceptReference
		{ after(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_1_0_1()); }
		ruleAny
		{ after(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_1_0_2()); }
		ruleNestedExpression
		{ after(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_1_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Alternatives_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndRefinementAccess().getCONJUNCTIONTerminalRuleCall_1_0_1_0()); }
		RULE_CONJUNCTION
		{ after(grammarAccess.getAndRefinementAccess().getCONJUNCTIONTerminalRuleCall_1_0_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1()); }
		RULE_COMMA
		{ after(grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubRefinement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0()); }
		ruleAttributeConstraint
		{ after(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSubRefinementAccess().getEclAttributeGroupParserRuleCall_1()); }
		ruleEclAttributeGroup
		{ after(grammarAccess.getSubRefinementAccess().getEclAttributeGroupParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getSubRefinementAccess().getNestedRefinementParserRuleCall_2()); }
		ruleNestedRefinement
		{ after(grammarAccess.getSubRefinementAccess().getNestedRefinementParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndAttributeSetAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION
		{ after(grammarAccess.getAndAttributeSetAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1()); }
		RULE_COMMA
		{ after(grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAttributeSet__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0()); }
		ruleAttributeConstraint
		{ after(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSubAttributeSetAccess().getNestedAttributeSetParserRuleCall_1()); }
		ruleNestedAttributeSet
		{ after(grammarAccess.getSubAttributeSetAccess().getNestedAttributeSetParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparisonAccess().getAttributeComparisonParserRuleCall_0()); }
		ruleAttributeComparison
		{ after(grammarAccess.getComparisonAccess().getAttributeComparisonParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getComparisonAccess().getDataTypeComparisonParserRuleCall_1()); }
		ruleDataTypeComparison
		{ after(grammarAccess.getComparisonAccess().getDataTypeComparisonParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeComparison__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeComparisonAccess().getAttributeValueEqualsParserRuleCall_0()); }
		ruleAttributeValueEquals
		{ after(grammarAccess.getAttributeComparisonAccess().getAttributeValueEqualsParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeComparisonAccess().getAttributeValueNotEqualsParserRuleCall_1()); }
		ruleAttributeValueNotEquals
		{ after(grammarAccess.getAttributeComparisonAccess().getAttributeValueNotEqualsParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTypeComparison__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getBooleanValueEqualsParserRuleCall_0()); }
		ruleBooleanValueEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getBooleanValueEqualsParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getBooleanValueNotEqualsParserRuleCall_1()); }
		ruleBooleanValueNotEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getBooleanValueNotEqualsParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getStringValueEqualsParserRuleCall_2()); }
		ruleStringValueEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getStringValueEqualsParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getStringValueNotEqualsParserRuleCall_3()); }
		ruleStringValueNotEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getStringValueNotEqualsParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueEqualsParserRuleCall_4()); }
		ruleIntegerValueEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueEqualsParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueNotEqualsParserRuleCall_5()); }
		ruleIntegerValueNotEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueNotEqualsParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanParserRuleCall_6()); }
		ruleIntegerValueGreaterThan
		{ after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanEqualsParserRuleCall_7()); }
		ruleIntegerValueGreaterThanEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanEqualsParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanParserRuleCall_8()); }
		ruleIntegerValueLessThan
		{ after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanEqualsParserRuleCall_9()); }
		ruleIntegerValueLessThanEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanEqualsParserRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueEqualsParserRuleCall_10()); }
		ruleDecimalValueEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueEqualsParserRuleCall_10()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueNotEqualsParserRuleCall_11()); }
		ruleDecimalValueNotEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueNotEqualsParserRuleCall_11()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanParserRuleCall_12()); }
		ruleDecimalValueGreaterThan
		{ after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanParserRuleCall_12()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanEqualsParserRuleCall_13()); }
		ruleDecimalValueGreaterThanEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanEqualsParserRuleCall_13()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanParserRuleCall_14()); }
		ruleDecimalValueLessThan
		{ after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanParserRuleCall_14()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanEqualsParserRuleCall_15()); }
		ruleDecimalValueLessThanEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanEqualsParserRuleCall_15()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0()); }
		RULE_ZERO
		{ after(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getGroup_1()); }
		(rule__NonNegativeInteger__Group_1__0)
		{ after(grammarAccess.getNonNegativeIntegerAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1()); }
		RULE_ZERO
		{ after(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMaxValueAccess().getNonNegativeIntegerParserRuleCall_0()); }
		ruleNonNegativeInteger
		{ after(grammarAccess.getMaxValueAccess().getNonNegativeIntegerParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getMaxValueAccess().getWILDCARDTerminalRuleCall_1()); }
		RULE_WILDCARD
		{ after(grammarAccess.getMaxValueAccess().getWILDCARDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0()); }
		RULE_PLUS
		{ after(grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1()); }
		RULE_DASH
		{ after(grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0()); }
		RULE_PLUS
		{ after(grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1()); }
		RULE_DASH
		{ after(grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1()); }
		RULE_ZERO
		{ after(grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Boolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); }
		True
		{ after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); }
		False
		{ after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionTemplate__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionTemplate__Group__0__Impl
	rule__ExpressionTemplate__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionTemplate__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionTemplateAccess().getExpressionTemplateAction_0()); }
	()
	{ after(grammarAccess.getExpressionTemplateAccess().getExpressionTemplateAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionTemplate__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionTemplate__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionTemplate__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionTemplateAccess().getGroup_1()); }
	(rule__ExpressionTemplate__Group_1__0)?
	{ after(grammarAccess.getExpressionTemplateAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpressionTemplate__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionTemplate__Group_1__0__Impl
	rule__ExpressionTemplate__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionTemplate__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionTemplateAccess().getAlternatives_1_0()); }
	(rule__ExpressionTemplate__Alternatives_1_0)?
	{ after(grammarAccess.getExpressionTemplateAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionTemplate__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionTemplate__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionTemplate__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionTemplateAccess().getExpressionAssignment_1_1()); }
	(rule__ExpressionTemplate__ExpressionAssignment_1_1)
	{ after(grammarAccess.getExpressionTemplateAccess().getExpressionAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubExpression__Group__0__Impl
	rule__SubExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_0()); }
	(rule__SubExpression__FocusConceptsAssignment_0)
	{ after(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubExpression__Group__1__Impl
	rule__SubExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubExpressionAccess().getGroup_1()); }
	(rule__SubExpression__Group_1__0)*
	{ after(grammarAccess.getSubExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubExpression__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubExpressionAccess().getGroup_2()); }
	(rule__SubExpression__Group_2__0)?
	{ after(grammarAccess.getSubExpressionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubExpression__Group_1__0__Impl
	rule__SubExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubExpressionAccess().getPLUSTerminalRuleCall_1_0()); }
	RULE_PLUS
	{ after(grammarAccess.getSubExpressionAccess().getPLUSTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_1_1()); }
	(rule__SubExpression__FocusConceptsAssignment_1_1)
	{ after(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubExpression__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubExpression__Group_2__0__Impl
	rule__SubExpression__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubExpressionAccess().getCOLONTerminalRuleCall_2_0()); }
	RULE_COLON
	{ after(grammarAccess.getSubExpressionAccess().getCOLONTerminalRuleCall_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubExpression__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubExpressionAccess().getRefinementAssignment_2_1()); }
	(rule__SubExpression__RefinementAssignment_2_1)
	{ after(grammarAccess.getSubExpressionAccess().getRefinementAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FocusConcept__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FocusConcept__Group__0__Impl
	rule__FocusConcept__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FocusConcept__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFocusConceptAccess().getSlotAssignment_0()); }
	(rule__FocusConcept__SlotAssignment_0)?
	{ after(grammarAccess.getFocusConceptAccess().getSlotAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FocusConcept__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FocusConcept__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FocusConcept__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFocusConceptAccess().getConceptAssignment_1()); }
	(rule__FocusConcept__ConceptAssignment_1)
	{ after(grammarAccess.getFocusConceptAccess().getConceptAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Refinement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group__0__Impl
	rule__Refinement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getAlternatives_0()); }
	(rule__Refinement__Alternatives_0)
	{ after(grammarAccess.getRefinementAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getGroup_1()); }
	(rule__Refinement__Group_1__0)*
	{ after(grammarAccess.getRefinementAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Refinement__Group_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group_0_0__0__Impl
	rule__Refinement__Group_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_0()); }
	(rule__Refinement__AttributesAssignment_0_0_0)
	{ after(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getGroup_0_0_1()); }
	(rule__Refinement__Group_0_0_1__0)*
	{ after(grammarAccess.getRefinementAccess().getGroup_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Refinement__Group_0_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group_0_0_1__0__Impl
	rule__Refinement__Group_0_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_0_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_0_0_1_0()); }
	RULE_COMMA
	{ after(grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_0_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_0_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group_0_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_0_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_1_1()); }
	(rule__Refinement__AttributesAssignment_0_0_1_1)
	{ after(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Refinement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group_1__0__Impl
	rule__Refinement__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_1_0()); }
	(RULE_COMMA)?
	{ after(grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getGroupsAssignment_1_1()); }
	(rule__Refinement__GroupsAssignment_1_1)
	{ after(grammarAccess.getRefinementAccess().getGroupsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeGroup__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeGroup__Group__0__Impl
	rule__AttributeGroup__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeGroupAccess().getSlotAssignment_0()); }
	(rule__AttributeGroup__SlotAssignment_0)?
	{ after(grammarAccess.getAttributeGroupAccess().getSlotAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeGroup__Group__1__Impl
	rule__AttributeGroup__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1()); }
	RULE_CURLY_OPEN
	{ after(grammarAccess.getAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeGroup__Group__2__Impl
	rule__AttributeGroup__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_2()); }
	(rule__AttributeGroup__AttributesAssignment_2)
	{ after(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeGroup__Group__3__Impl
	rule__AttributeGroup__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeGroupAccess().getGroup_3()); }
	(rule__AttributeGroup__Group_3__0)*
	{ after(grammarAccess.getAttributeGroupAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeGroup__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_4()); }
	RULE_CURLY_CLOSE
	{ after(grammarAccess.getAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeGroup__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeGroup__Group_3__0__Impl
	rule__AttributeGroup__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeGroupAccess().getCOMMATerminalRuleCall_3_0()); }
	RULE_COMMA
	{ after(grammarAccess.getAttributeGroupAccess().getCOMMATerminalRuleCall_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeGroup__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_3_1()); }
	(rule__AttributeGroup__AttributesAssignment_3_1)
	{ after(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getSlotAssignment_0()); }
	(rule__Attribute__SlotAssignment_0)?
	{ after(grammarAccess.getAttributeAccess().getSlotAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
	(rule__Attribute__NameAssignment_1)
	{ after(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__2__Impl
	rule__Attribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getEQUALTerminalRuleCall_2()); }
	RULE_EQUAL
	{ after(grammarAccess.getAttributeAccess().getEQUALTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getValueAssignment_3()); }
	(rule__Attribute__ValueAssignment_3)
	{ after(grammarAccess.getAttributeAccess().getValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeValue__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeValue__Group_1__0__Impl
	rule__AttributeValue__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValue__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeValueAccess().getROUND_OPENTerminalRuleCall_1_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getAttributeValueAccess().getROUND_OPENTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValue__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeValue__Group_1__1__Impl
	rule__AttributeValue__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValue__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeValueAccess().getSubExpressionParserRuleCall_1_1()); }
	ruleSubExpression
	{ after(grammarAccess.getAttributeValueAccess().getSubExpressionParserRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValue__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeValue__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValue__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeValueAccess().getROUND_CLOSETerminalRuleCall_1_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getAttributeValueAccess().getROUND_CLOSETerminalRuleCall_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConceptIdReplacementSlot__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptIdReplacementSlot__Group__0__Impl
	rule__ConceptIdReplacementSlot__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptIdReplacementSlotAccess().getConceptIdReplacementSlotAction_0()); }
	()
	{ after(grammarAccess.getConceptIdReplacementSlotAccess().getConceptIdReplacementSlotAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptIdReplacementSlot__Group__1__Impl
	rule__ConceptIdReplacementSlot__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptIdReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1()); }
	RULE_DOUBLE_SQUARE_OPEN
	{ after(grammarAccess.getConceptIdReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptIdReplacementSlot__Group__2__Impl
	rule__ConceptIdReplacementSlot__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptIdReplacementSlotAccess().getPLUSTerminalRuleCall_2()); }
	RULE_PLUS
	{ after(grammarAccess.getConceptIdReplacementSlotAccess().getPLUSTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptIdReplacementSlot__Group__3__Impl
	rule__ConceptIdReplacementSlot__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptIdReplacementSlotAccess().getIDTerminalRuleCall_3()); }
	RULE_ID
	{ after(grammarAccess.getConceptIdReplacementSlotAccess().getIDTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptIdReplacementSlot__Group__4__Impl
	rule__ConceptIdReplacementSlot__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptIdReplacementSlotAccess().getGroup_4()); }
	(rule__ConceptIdReplacementSlot__Group_4__0)?
	{ after(grammarAccess.getConceptIdReplacementSlotAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptIdReplacementSlot__Group__5__Impl
	rule__ConceptIdReplacementSlot__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptIdReplacementSlotAccess().getNameAssignment_5()); }
	(rule__ConceptIdReplacementSlot__NameAssignment_5)?
	{ after(grammarAccess.getConceptIdReplacementSlotAccess().getNameAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptIdReplacementSlot__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptIdReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6()); }
	RULE_DOUBLE_SQUARE_CLOSE
	{ after(grammarAccess.getConceptIdReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConceptIdReplacementSlot__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptIdReplacementSlot__Group_4__0__Impl
	rule__ConceptIdReplacementSlot__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptIdReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getConceptIdReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptIdReplacementSlot__Group_4__1__Impl
	rule__ConceptIdReplacementSlot__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptIdReplacementSlotAccess().getConstraintAssignment_4_1()); }
	(rule__ConceptIdReplacementSlot__ConstraintAssignment_4_1)
	{ after(grammarAccess.getConceptIdReplacementSlotAccess().getConstraintAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptIdReplacementSlot__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptIdReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getConceptIdReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpressionReplacementSlot__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionReplacementSlot__Group__0__Impl
	rule__ExpressionReplacementSlot__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionReplacementSlotAccess().getExpressionReplacementSlotAction_0()); }
	()
	{ after(grammarAccess.getExpressionReplacementSlotAccess().getExpressionReplacementSlotAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionReplacementSlot__Group__1__Impl
	rule__ExpressionReplacementSlot__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1()); }
	RULE_DOUBLE_SQUARE_OPEN
	{ after(grammarAccess.getExpressionReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionReplacementSlot__Group__2__Impl
	rule__ExpressionReplacementSlot__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionReplacementSlotAccess().getPLUSTerminalRuleCall_2()); }
	RULE_PLUS
	{ after(grammarAccess.getExpressionReplacementSlotAccess().getPLUSTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionReplacementSlot__Group__3__Impl
	rule__ExpressionReplacementSlot__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionReplacementSlotAccess().getSCGTerminalRuleCall_3()); }
	(RULE_SCG)?
	{ after(grammarAccess.getExpressionReplacementSlotAccess().getSCGTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionReplacementSlot__Group__4__Impl
	rule__ExpressionReplacementSlot__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionReplacementSlotAccess().getGroup_4()); }
	(rule__ExpressionReplacementSlot__Group_4__0)?
	{ after(grammarAccess.getExpressionReplacementSlotAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionReplacementSlot__Group__5__Impl
	rule__ExpressionReplacementSlot__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionReplacementSlotAccess().getNameAssignment_5()); }
	(rule__ExpressionReplacementSlot__NameAssignment_5)?
	{ after(grammarAccess.getExpressionReplacementSlotAccess().getNameAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionReplacementSlot__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6()); }
	RULE_DOUBLE_SQUARE_CLOSE
	{ after(grammarAccess.getExpressionReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpressionReplacementSlot__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionReplacementSlot__Group_4__0__Impl
	rule__ExpressionReplacementSlot__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getExpressionReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionReplacementSlot__Group_4__1__Impl
	rule__ExpressionReplacementSlot__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionReplacementSlotAccess().getConstraintAssignment_4_1()); }
	(rule__ExpressionReplacementSlot__ConstraintAssignment_4_1)
	{ after(grammarAccess.getExpressionReplacementSlotAccess().getConstraintAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionReplacementSlot__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getExpressionReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TokenReplacementSlot__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenReplacementSlot__Group__0__Impl
	rule__TokenReplacementSlot__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenReplacementSlotAccess().getTokenReplacementSlotAction_0()); }
	()
	{ after(grammarAccess.getTokenReplacementSlotAccess().getTokenReplacementSlotAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenReplacementSlot__Group__1__Impl
	rule__TokenReplacementSlot__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1()); }
	RULE_DOUBLE_SQUARE_OPEN
	{ after(grammarAccess.getTokenReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenReplacementSlot__Group__2__Impl
	rule__TokenReplacementSlot__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenReplacementSlotAccess().getPLUSTerminalRuleCall_2()); }
	RULE_PLUS
	{ after(grammarAccess.getTokenReplacementSlotAccess().getPLUSTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenReplacementSlot__Group__3__Impl
	rule__TokenReplacementSlot__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenReplacementSlotAccess().getTOKTerminalRuleCall_3()); }
	RULE_TOK
	{ after(grammarAccess.getTokenReplacementSlotAccess().getTOKTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenReplacementSlot__Group__4__Impl
	rule__TokenReplacementSlot__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenReplacementSlotAccess().getGroup_4()); }
	(rule__TokenReplacementSlot__Group_4__0)?
	{ after(grammarAccess.getTokenReplacementSlotAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenReplacementSlot__Group__5__Impl
	rule__TokenReplacementSlot__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenReplacementSlotAccess().getNameAssignment_5()); }
	(rule__TokenReplacementSlot__NameAssignment_5)?
	{ after(grammarAccess.getTokenReplacementSlotAccess().getNameAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenReplacementSlot__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6()); }
	RULE_DOUBLE_SQUARE_CLOSE
	{ after(grammarAccess.getTokenReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TokenReplacementSlot__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenReplacementSlot__Group_4__0__Impl
	rule__TokenReplacementSlot__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getTokenReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenReplacementSlot__Group_4__1__Impl
	rule__TokenReplacementSlot__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenReplacementSlotAccess().getTokensAssignment_4_1()); }
	(rule__TokenReplacementSlot__TokensAssignment_4_1)
	{ after(grammarAccess.getTokenReplacementSlotAccess().getTokensAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenReplacementSlot__Group_4__2__Impl
	rule__TokenReplacementSlot__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenReplacementSlotAccess().getTokensAssignment_4_2()); }
	(rule__TokenReplacementSlot__TokensAssignment_4_2)*
	{ after(grammarAccess.getTokenReplacementSlotAccess().getTokensAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenReplacementSlot__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getTokenReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TemplateInformationSlot__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TemplateInformationSlot__Group__0__Impl
	rule__TemplateInformationSlot__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TemplateInformationSlot__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTemplateInformationSlotAccess().getTemplateInformationSlotAction_0()); }
	()
	{ after(grammarAccess.getTemplateInformationSlotAccess().getTemplateInformationSlotAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TemplateInformationSlot__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TemplateInformationSlot__Group__1__Impl
	rule__TemplateInformationSlot__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TemplateInformationSlot__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTemplateInformationSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1()); }
	RULE_DOUBLE_SQUARE_OPEN
	{ after(grammarAccess.getTemplateInformationSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TemplateInformationSlot__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TemplateInformationSlot__Group__2__Impl
	rule__TemplateInformationSlot__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TemplateInformationSlot__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTemplateInformationSlotAccess().getCardinalityAssignment_2()); }
	(rule__TemplateInformationSlot__CardinalityAssignment_2)?
	{ after(grammarAccess.getTemplateInformationSlotAccess().getCardinalityAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TemplateInformationSlot__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TemplateInformationSlot__Group__3__Impl
	rule__TemplateInformationSlot__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TemplateInformationSlot__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTemplateInformationSlotAccess().getNameAssignment_3()); }
	(rule__TemplateInformationSlot__NameAssignment_3)?
	{ after(grammarAccess.getTemplateInformationSlotAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TemplateInformationSlot__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TemplateInformationSlot__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TemplateInformationSlot__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTemplateInformationSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_4()); }
	RULE_DOUBLE_SQUARE_CLOSE
	{ after(grammarAccess.getTemplateInformationSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringReplacementSlot__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringReplacementSlot__Group__0__Impl
	rule__StringReplacementSlot__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringReplacementSlotAccess().getStringReplacementSlotAction_0()); }
	()
	{ after(grammarAccess.getStringReplacementSlotAccess().getStringReplacementSlotAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringReplacementSlot__Group__1__Impl
	rule__StringReplacementSlot__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1()); }
	RULE_DOUBLE_SQUARE_OPEN
	{ after(grammarAccess.getStringReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringReplacementSlot__Group__2__Impl
	rule__StringReplacementSlot__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringReplacementSlotAccess().getPLUSTerminalRuleCall_2()); }
	RULE_PLUS
	{ after(grammarAccess.getStringReplacementSlotAccess().getPLUSTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringReplacementSlot__Group__3__Impl
	rule__StringReplacementSlot__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringReplacementSlotAccess().getSTRTerminalRuleCall_3()); }
	RULE_STR
	{ after(grammarAccess.getStringReplacementSlotAccess().getSTRTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringReplacementSlot__Group__4__Impl
	rule__StringReplacementSlot__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringReplacementSlotAccess().getGroup_4()); }
	(rule__StringReplacementSlot__Group_4__0)?
	{ after(grammarAccess.getStringReplacementSlotAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringReplacementSlot__Group__5__Impl
	rule__StringReplacementSlot__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringReplacementSlotAccess().getNameAssignment_5()); }
	(rule__StringReplacementSlot__NameAssignment_5)?
	{ after(grammarAccess.getStringReplacementSlotAccess().getNameAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringReplacementSlot__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6()); }
	RULE_DOUBLE_SQUARE_CLOSE
	{ after(grammarAccess.getStringReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringReplacementSlot__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringReplacementSlot__Group_4__0__Impl
	rule__StringReplacementSlot__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getStringReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringReplacementSlot__Group_4__1__Impl
	rule__StringReplacementSlot__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringReplacementSlotAccess().getValuesAssignment_4_1()); }
	(rule__StringReplacementSlot__ValuesAssignment_4_1)
	{ after(grammarAccess.getStringReplacementSlotAccess().getValuesAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringReplacementSlot__Group_4__2__Impl
	rule__StringReplacementSlot__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringReplacementSlotAccess().getValuesAssignment_4_2()); }
	(rule__StringReplacementSlot__ValuesAssignment_4_2)*
	{ after(grammarAccess.getStringReplacementSlotAccess().getValuesAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringReplacementSlot__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getStringReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerReplacementSlot__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerReplacementSlot__Group__0__Impl
	rule__IntegerReplacementSlot__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerReplacementSlotAccess().getIntegerReplacementSlotAction_0()); }
	()
	{ after(grammarAccess.getIntegerReplacementSlotAccess().getIntegerReplacementSlotAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerReplacementSlot__Group__1__Impl
	rule__IntegerReplacementSlot__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1()); }
	RULE_DOUBLE_SQUARE_OPEN
	{ after(grammarAccess.getIntegerReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerReplacementSlot__Group__2__Impl
	rule__IntegerReplacementSlot__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerReplacementSlotAccess().getPLUSTerminalRuleCall_2()); }
	RULE_PLUS
	{ after(grammarAccess.getIntegerReplacementSlotAccess().getPLUSTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerReplacementSlot__Group__3__Impl
	rule__IntegerReplacementSlot__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerReplacementSlotAccess().getINTTerminalRuleCall_3()); }
	RULE_INT
	{ after(grammarAccess.getIntegerReplacementSlotAccess().getINTTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerReplacementSlot__Group__4__Impl
	rule__IntegerReplacementSlot__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerReplacementSlotAccess().getGroup_4()); }
	(rule__IntegerReplacementSlot__Group_4__0)?
	{ after(grammarAccess.getIntegerReplacementSlotAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerReplacementSlot__Group__5__Impl
	rule__IntegerReplacementSlot__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerReplacementSlotAccess().getNameAssignment_5()); }
	(rule__IntegerReplacementSlot__NameAssignment_5)?
	{ after(grammarAccess.getIntegerReplacementSlotAccess().getNameAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerReplacementSlot__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6()); }
	RULE_DOUBLE_SQUARE_CLOSE
	{ after(grammarAccess.getIntegerReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerReplacementSlot__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerReplacementSlot__Group_4__0__Impl
	rule__IntegerReplacementSlot__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getIntegerReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerReplacementSlot__Group_4__1__Impl
	rule__IntegerReplacementSlot__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerReplacementSlotAccess().getValuesAssignment_4_1()); }
	(rule__IntegerReplacementSlot__ValuesAssignment_4_1)
	{ after(grammarAccess.getIntegerReplacementSlotAccess().getValuesAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerReplacementSlot__Group_4__2__Impl
	rule__IntegerReplacementSlot__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerReplacementSlotAccess().getValuesAssignment_4_2()); }
	(rule__IntegerReplacementSlot__ValuesAssignment_4_2)*
	{ after(grammarAccess.getIntegerReplacementSlotAccess().getValuesAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerReplacementSlot__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getIntegerReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalReplacementSlot__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalReplacementSlot__Group__0__Impl
	rule__DecimalReplacementSlot__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalReplacementSlotAccess().getDecimalReplacementSlotAction_0()); }
	()
	{ after(grammarAccess.getDecimalReplacementSlotAccess().getDecimalReplacementSlotAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalReplacementSlot__Group__1__Impl
	rule__DecimalReplacementSlot__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1()); }
	RULE_DOUBLE_SQUARE_OPEN
	{ after(grammarAccess.getDecimalReplacementSlotAccess().getDOUBLE_SQUARE_OPENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalReplacementSlot__Group__2__Impl
	rule__DecimalReplacementSlot__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalReplacementSlotAccess().getPLUSTerminalRuleCall_2()); }
	RULE_PLUS
	{ after(grammarAccess.getDecimalReplacementSlotAccess().getPLUSTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalReplacementSlot__Group__3__Impl
	rule__DecimalReplacementSlot__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalReplacementSlotAccess().getDECTerminalRuleCall_3()); }
	RULE_DEC
	{ after(grammarAccess.getDecimalReplacementSlotAccess().getDECTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalReplacementSlot__Group__4__Impl
	rule__DecimalReplacementSlot__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalReplacementSlotAccess().getGroup_4()); }
	(rule__DecimalReplacementSlot__Group_4__0)?
	{ after(grammarAccess.getDecimalReplacementSlotAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalReplacementSlot__Group__5__Impl
	rule__DecimalReplacementSlot__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalReplacementSlotAccess().getNameAssignment_5()); }
	(rule__DecimalReplacementSlot__NameAssignment_5)?
	{ after(grammarAccess.getDecimalReplacementSlotAccess().getNameAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalReplacementSlot__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6()); }
	RULE_DOUBLE_SQUARE_CLOSE
	{ after(grammarAccess.getDecimalReplacementSlotAccess().getDOUBLE_SQUARE_CLOSETerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalReplacementSlot__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalReplacementSlot__Group_4__0__Impl
	rule__DecimalReplacementSlot__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getDecimalReplacementSlotAccess().getROUND_OPENTerminalRuleCall_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalReplacementSlot__Group_4__1__Impl
	rule__DecimalReplacementSlot__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalReplacementSlotAccess().getValuesAssignment_4_1()); }
	(rule__DecimalReplacementSlot__ValuesAssignment_4_1)
	{ after(grammarAccess.getDecimalReplacementSlotAccess().getValuesAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalReplacementSlot__Group_4__2__Impl
	rule__DecimalReplacementSlot__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalReplacementSlotAccess().getValuesAssignment_4_2()); }
	(rule__DecimalReplacementSlot__ValuesAssignment_4_2)*
	{ after(grammarAccess.getDecimalReplacementSlotAccess().getValuesAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalReplacementSlot__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getDecimalReplacementSlotAccess().getROUND_CLOSETerminalRuleCall_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EtlCardinality__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EtlCardinality__Group__0__Impl
	rule__EtlCardinality__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EtlCardinality__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEtlCardinalityAccess().getTILDETerminalRuleCall_0()); }
	(RULE_TILDE)?
	{ after(grammarAccess.getEtlCardinalityAccess().getTILDETerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EtlCardinality__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EtlCardinality__Group__1__Impl
	rule__EtlCardinality__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EtlCardinality__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEtlCardinalityAccess().getMinAssignment_1()); }
	(rule__EtlCardinality__MinAssignment_1)
	{ after(grammarAccess.getEtlCardinalityAccess().getMinAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EtlCardinality__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EtlCardinality__Group__2__Impl
	rule__EtlCardinality__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EtlCardinality__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEtlCardinalityAccess().getTOTerminalRuleCall_2()); }
	RULE_TO
	{ after(grammarAccess.getEtlCardinalityAccess().getTOTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EtlCardinality__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EtlCardinality__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EtlCardinality__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEtlCardinalityAccess().getMaxAssignment_3()); }
	(rule__EtlCardinality__MaxAssignment_3)
	{ after(grammarAccess.getEtlCardinalityAccess().getMaxAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConceptReference__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptReference__Group_1__0__Impl
	rule__ConceptReference__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptReference__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptReferenceAccess().getIdAssignment_1_0()); }
	(rule__ConceptReference__IdAssignment_1_0)
	{ after(grammarAccess.getConceptReferenceAccess().getIdAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptReference__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptReference__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptReference__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptReferenceAccess().getTermAssignment_1_1()); }
	(rule__ConceptReference__TermAssignment_1_1)?
	{ after(grammarAccess.getConceptReferenceAccess().getTermAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValue__Group__0__Impl
	rule__IntegerValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueAccess().getHASHTerminalRuleCall_0()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueAccess().getHASHTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValue__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueAccess().getValueAssignment_1()); }
	(rule__IntegerValue__ValueAssignment_1)
	{ after(grammarAccess.getIntegerValueAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValue__Group__0__Impl
	rule__DecimalValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueAccess().getHASHTerminalRuleCall_0()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueAccess().getHASHTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValue__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueAccess().getValueAssignment_1()); }
	(rule__DecimalValue__ValueAssignment_1)
	{ after(grammarAccess.getDecimalValueAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlotIntegerValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotIntegerValue__Group__0__Impl
	rule__SlotIntegerValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotIntegerValueAccess().getHASHTerminalRuleCall_0()); }
	RULE_HASH
	{ after(grammarAccess.getSlotIntegerValueAccess().getHASHTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotIntegerValue__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotIntegerValueAccess().getValueAssignment_1()); }
	(rule__SlotIntegerValue__ValueAssignment_1)
	{ after(grammarAccess.getSlotIntegerValueAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlotIntegerRange__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotIntegerRange__Group_0__0__Impl
	rule__SlotIntegerRange__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerRange__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotIntegerRangeAccess().getMinimumAssignment_0_0()); }
	(rule__SlotIntegerRange__MinimumAssignment_0_0)
	{ after(grammarAccess.getSlotIntegerRangeAccess().getMinimumAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerRange__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotIntegerRange__Group_0__1__Impl
	rule__SlotIntegerRange__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerRange__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotIntegerRangeAccess().getTOTerminalRuleCall_0_1()); }
	RULE_TO
	{ after(grammarAccess.getSlotIntegerRangeAccess().getTOTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerRange__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotIntegerRange__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerRange__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotIntegerRangeAccess().getMaximumAssignment_0_2()); }
	(rule__SlotIntegerRange__MaximumAssignment_0_2)?
	{ after(grammarAccess.getSlotIntegerRangeAccess().getMaximumAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlotIntegerRange__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotIntegerRange__Group_1__0__Impl
	rule__SlotIntegerRange__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerRange__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotIntegerRangeAccess().getTOTerminalRuleCall_1_0()); }
	RULE_TO
	{ after(grammarAccess.getSlotIntegerRangeAccess().getTOTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerRange__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotIntegerRange__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerRange__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotIntegerRangeAccess().getMaximumAssignment_1_1()); }
	(rule__SlotIntegerRange__MaximumAssignment_1_1)
	{ after(grammarAccess.getSlotIntegerRangeAccess().getMaximumAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlotIntegerMinimumValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotIntegerMinimumValue__Group__0__Impl
	rule__SlotIntegerMinimumValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerMinimumValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotIntegerMinimumValueAccess().getExclusiveAssignment_0()); }
	(rule__SlotIntegerMinimumValue__ExclusiveAssignment_0)?
	{ after(grammarAccess.getSlotIntegerMinimumValueAccess().getExclusiveAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerMinimumValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotIntegerMinimumValue__Group__1__Impl
	rule__SlotIntegerMinimumValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerMinimumValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotIntegerMinimumValueAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getSlotIntegerMinimumValueAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerMinimumValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotIntegerMinimumValue__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerMinimumValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotIntegerMinimumValueAccess().getValueAssignment_2()); }
	(rule__SlotIntegerMinimumValue__ValueAssignment_2)
	{ after(grammarAccess.getSlotIntegerMinimumValueAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlotIntegerMaximumValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotIntegerMaximumValue__Group__0__Impl
	rule__SlotIntegerMaximumValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerMaximumValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotIntegerMaximumValueAccess().getExclusiveAssignment_0()); }
	(rule__SlotIntegerMaximumValue__ExclusiveAssignment_0)?
	{ after(grammarAccess.getSlotIntegerMaximumValueAccess().getExclusiveAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerMaximumValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotIntegerMaximumValue__Group__1__Impl
	rule__SlotIntegerMaximumValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerMaximumValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotIntegerMaximumValueAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getSlotIntegerMaximumValueAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerMaximumValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotIntegerMaximumValue__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerMaximumValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotIntegerMaximumValueAccess().getValueAssignment_2()); }
	(rule__SlotIntegerMaximumValue__ValueAssignment_2)
	{ after(grammarAccess.getSlotIntegerMaximumValueAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlotDecimalValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotDecimalValue__Group__0__Impl
	rule__SlotDecimalValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotDecimalValueAccess().getHASHTerminalRuleCall_0()); }
	RULE_HASH
	{ after(grammarAccess.getSlotDecimalValueAccess().getHASHTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotDecimalValue__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotDecimalValueAccess().getValueAssignment_1()); }
	(rule__SlotDecimalValue__ValueAssignment_1)
	{ after(grammarAccess.getSlotDecimalValueAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlotDecimalRange__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotDecimalRange__Group_0__0__Impl
	rule__SlotDecimalRange__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalRange__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotDecimalRangeAccess().getMinimumAssignment_0_0()); }
	(rule__SlotDecimalRange__MinimumAssignment_0_0)
	{ after(grammarAccess.getSlotDecimalRangeAccess().getMinimumAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalRange__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotDecimalRange__Group_0__1__Impl
	rule__SlotDecimalRange__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalRange__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotDecimalRangeAccess().getTOTerminalRuleCall_0_1()); }
	RULE_TO
	{ after(grammarAccess.getSlotDecimalRangeAccess().getTOTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalRange__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotDecimalRange__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalRange__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotDecimalRangeAccess().getMaximumAssignment_0_2()); }
	(rule__SlotDecimalRange__MaximumAssignment_0_2)?
	{ after(grammarAccess.getSlotDecimalRangeAccess().getMaximumAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlotDecimalRange__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotDecimalRange__Group_1__0__Impl
	rule__SlotDecimalRange__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalRange__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotDecimalRangeAccess().getTOTerminalRuleCall_1_0()); }
	RULE_TO
	{ after(grammarAccess.getSlotDecimalRangeAccess().getTOTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalRange__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotDecimalRange__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalRange__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotDecimalRangeAccess().getMaximumAssignment_1_1()); }
	(rule__SlotDecimalRange__MaximumAssignment_1_1)
	{ after(grammarAccess.getSlotDecimalRangeAccess().getMaximumAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlotDecimalMinimumValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotDecimalMinimumValue__Group__0__Impl
	rule__SlotDecimalMinimumValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalMinimumValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotDecimalMinimumValueAccess().getExclusiveAssignment_0()); }
	(rule__SlotDecimalMinimumValue__ExclusiveAssignment_0)?
	{ after(grammarAccess.getSlotDecimalMinimumValueAccess().getExclusiveAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalMinimumValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotDecimalMinimumValue__Group__1__Impl
	rule__SlotDecimalMinimumValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalMinimumValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotDecimalMinimumValueAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getSlotDecimalMinimumValueAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalMinimumValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotDecimalMinimumValue__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalMinimumValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotDecimalMinimumValueAccess().getValueAssignment_2()); }
	(rule__SlotDecimalMinimumValue__ValueAssignment_2)
	{ after(grammarAccess.getSlotDecimalMinimumValueAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlotDecimalMaximumValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotDecimalMaximumValue__Group__0__Impl
	rule__SlotDecimalMaximumValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalMaximumValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotDecimalMaximumValueAccess().getExclusiveAssignment_0()); }
	(rule__SlotDecimalMaximumValue__ExclusiveAssignment_0)?
	{ after(grammarAccess.getSlotDecimalMaximumValueAccess().getExclusiveAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalMaximumValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotDecimalMaximumValue__Group__1__Impl
	rule__SlotDecimalMaximumValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalMaximumValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotDecimalMaximumValueAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getSlotDecimalMaximumValueAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalMaximumValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlotDecimalMaximumValue__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalMaximumValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlotDecimalMaximumValueAccess().getValueAssignment_2()); }
	(rule__SlotDecimalMaximumValue__ValueAssignment_2)
	{ after(grammarAccess.getSlotDecimalMaximumValueAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group__0__Impl
	rule__OrExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getAndExpressionConstraintParserRuleCall_0()); }
	ruleAndExpressionConstraint
	{ after(grammarAccess.getOrExpressionConstraintAccess().getAndExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getGroup_1()); }
	(rule__OrExpressionConstraint__Group_1__0)*
	{ after(grammarAccess.getOrExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group_1__0__Impl
	rule__OrExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0()); }
	()
	{ after(grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group_1__1__Impl
	rule__OrExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION
	{ after(grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getRightAssignment_1_2()); }
	(rule__OrExpressionConstraint__RightAssignment_1_2)
	{ after(grammarAccess.getOrExpressionConstraintAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group__0__Impl
	rule__AndExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall_0()); }
	ruleExclusionExpressionConstraint
	{ after(grammarAccess.getAndExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getGroup_1()); }
	(rule__AndExpressionConstraint__Group_1__0)*
	{ after(grammarAccess.getAndExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group_1__0__Impl
	rule__AndExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group_1__1__Impl
	rule__AndExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getAlternatives_1_1()); }
	(rule__AndExpressionConstraint__Alternatives_1_1)
	{ after(grammarAccess.getAndExpressionConstraintAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getRightAssignment_1_2()); }
	(rule__AndExpressionConstraint__RightAssignment_1_2)
	{ after(grammarAccess.getAndExpressionConstraintAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExclusionExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group__0__Impl
	rule__ExclusionExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0()); }
	ruleRefinedExpressionConstraint
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1()); }
	(rule__ExclusionExpressionConstraint__Group_1__0)?
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExclusionExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group_1__0__Impl
	rule__ExclusionExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0()); }
	()
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group_1__1__Impl
	rule__ExclusionExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSIONTerminalRuleCall_1_1()); }
	RULE_EXCLUSION
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getRightAssignment_1_2()); }
	(rule__ExclusionExpressionConstraint__RightAssignment_1_2)
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RefinedExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group__0__Impl
	rule__RefinedExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getDottedExpressionConstraintParserRuleCall_0()); }
	ruleDottedExpressionConstraint
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getDottedExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getGroup_1()); }
	(rule__RefinedExpressionConstraint__Group_1__0)?
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RefinedExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group_1__0__Impl
	rule__RefinedExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0()); }
	()
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group_1__1__Impl
	rule__RefinedExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getCOLONTerminalRuleCall_1_1()); }
	RULE_COLON
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getCOLONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementAssignment_1_2()); }
	(rule__RefinedExpressionConstraint__RefinementAssignment_1_2)
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DottedExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group__0__Impl
	rule__DottedExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0()); }
	ruleSubExpressionConstraint
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getGroup_1()); }
	(rule__DottedExpressionConstraint__Group_1__0)*
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DottedExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group_1__0__Impl
	rule__DottedExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0()); }
	()
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group_1__1__Impl
	rule__DottedExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getDOTTerminalRuleCall_1_1()); }
	RULE_DOT
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getDOTTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getAttributeAssignment_1_2()); }
	(rule__DottedExpressionConstraint__AttributeAssignment_1_2)
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getAttributeAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ChildOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChildOf__Group__0__Impl
	rule__ChildOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0()); }
	RULE_LT_EM
	{ after(grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChildOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChildOfAccess().getConstraintAssignment_1()); }
	(rule__ChildOf__ConstraintAssignment_1)
	{ after(grammarAccess.getChildOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ChildOrSelfOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChildOrSelfOf__Group__0__Impl
	rule__ChildOrSelfOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOrSelfOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0()); }
	RULE_DBL_LT_EM
	{ after(grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOrSelfOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChildOrSelfOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOrSelfOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChildOrSelfOfAccess().getConstraintAssignment_1()); }
	(rule__ChildOrSelfOf__ConstraintAssignment_1)
	{ after(grammarAccess.getChildOrSelfOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DescendantOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescendantOf__Group__0__Impl
	rule__DescendantOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0()); }
	RULE_LT
	{ after(grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescendantOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescendantOfAccess().getConstraintAssignment_1()); }
	(rule__DescendantOf__ConstraintAssignment_1)
	{ after(grammarAccess.getDescendantOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DescendantOrSelfOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescendantOrSelfOf__Group__0__Impl
	rule__DescendantOrSelfOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOrSelfOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0()); }
	RULE_DBL_LT
	{ after(grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOrSelfOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescendantOrSelfOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOrSelfOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescendantOrSelfOfAccess().getConstraintAssignment_1()); }
	(rule__DescendantOrSelfOf__ConstraintAssignment_1)
	{ after(grammarAccess.getDescendantOrSelfOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParentOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParentOf__Group__0__Impl
	rule__ParentOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0()); }
	RULE_GT_EM
	{ after(grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParentOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParentOfAccess().getConstraintAssignment_1()); }
	(rule__ParentOf__ConstraintAssignment_1)
	{ after(grammarAccess.getParentOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParentOrSelfOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParentOrSelfOf__Group__0__Impl
	rule__ParentOrSelfOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOrSelfOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0()); }
	RULE_DBL_GT_EM
	{ after(grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOrSelfOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParentOrSelfOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOrSelfOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParentOrSelfOfAccess().getConstraintAssignment_1()); }
	(rule__ParentOrSelfOf__ConstraintAssignment_1)
	{ after(grammarAccess.getParentOrSelfOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AncestorOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AncestorOf__Group__0__Impl
	rule__AncestorOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0()); }
	RULE_GT
	{ after(grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AncestorOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAncestorOfAccess().getConstraintAssignment_1()); }
	(rule__AncestorOf__ConstraintAssignment_1)
	{ after(grammarAccess.getAncestorOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AncestorOrSelfOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AncestorOrSelfOf__Group__0__Impl
	rule__AncestorOrSelfOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOrSelfOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0()); }
	RULE_DBL_GT
	{ after(grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOrSelfOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AncestorOrSelfOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOrSelfOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAncestorOrSelfOfAccess().getConstraintAssignment_1()); }
	(rule__AncestorOrSelfOf__ConstraintAssignment_1)
	{ after(grammarAccess.getAncestorOrSelfOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MemberOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberOf__Group__0__Impl
	rule__MemberOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0()); }
	RULE_CARET
	{ after(grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberOfAccess().getConstraintAssignment_1()); }
	(rule__MemberOf__ConstraintAssignment_1)
	{ after(grammarAccess.getMemberOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EclConceptReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclConceptReference__Group__0__Impl
	rule__EclConceptReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclConceptReferenceAccess().getIdAssignment_0()); }
	(rule__EclConceptReference__IdAssignment_0)
	{ after(grammarAccess.getEclConceptReferenceAccess().getIdAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclConceptReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclConceptReferenceAccess().getTermAssignment_1()); }
	(rule__EclConceptReference__TermAssignment_1)?
	{ after(grammarAccess.getEclConceptReferenceAccess().getTermAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Any__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Any__Group__0__Impl
	rule__Any__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Any__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0()); }
	RULE_WILDCARD
	{ after(grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Any__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Any__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Any__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnyAccess().getAnyAction_1()); }
	()
	{ after(grammarAccess.getAnyAccess().getAnyAction_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrRefinement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group__0__Impl
	rule__OrRefinement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getAndRefinementParserRuleCall_0()); }
	ruleAndRefinement
	{ after(grammarAccess.getOrRefinementAccess().getAndRefinementParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getGroup_1()); }
	(rule__OrRefinement__Group_1__0)*
	{ after(grammarAccess.getOrRefinementAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrRefinement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group_1__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getGroup_1_0()); }
	(rule__OrRefinement__Group_1_0__0)
	{ after(grammarAccess.getOrRefinementAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrRefinement__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group_1_0__0__Impl
	rule__OrRefinement__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0()); }
	()
	{ after(grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group_1_0__1__Impl
	rule__OrRefinement__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getDISJUNCTIONTerminalRuleCall_1_0_1()); }
	RULE_DISJUNCTION
	{ after(grammarAccess.getOrRefinementAccess().getDISJUNCTIONTerminalRuleCall_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getRightAssignment_1_0_2()); }
	(rule__OrRefinement__RightAssignment_1_0_2)
	{ after(grammarAccess.getOrRefinementAccess().getRightAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndRefinement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group__0__Impl
	rule__AndRefinement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getSubRefinementParserRuleCall_0()); }
	ruleSubRefinement
	{ after(grammarAccess.getAndRefinementAccess().getSubRefinementParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getGroup_1()); }
	(rule__AndRefinement__Group_1__0)*
	{ after(grammarAccess.getAndRefinementAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndRefinement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group_1__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getGroup_1_0()); }
	(rule__AndRefinement__Group_1_0__0)
	{ after(grammarAccess.getAndRefinementAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndRefinement__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group_1_0__0__Impl
	rule__AndRefinement__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0()); }
	()
	{ after(grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group_1_0__1__Impl
	rule__AndRefinement__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getAlternatives_1_0_1()); }
	(rule__AndRefinement__Alternatives_1_0_1)
	{ after(grammarAccess.getAndRefinementAccess().getAlternatives_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getRightAssignment_1_0_2()); }
	(rule__AndRefinement__RightAssignment_1_0_2)
	{ after(grammarAccess.getAndRefinementAccess().getRightAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedRefinement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedRefinement__Group__0__Impl
	rule__NestedRefinement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedRefinement__Group__1__Impl
	rule__NestedRefinement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedRefinementAccess().getNestedAssignment_1()); }
	(rule__NestedRefinement__NestedAssignment_1)
	{ after(grammarAccess.getNestedRefinementAccess().getNestedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedRefinement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedRefinementAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getNestedRefinementAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EclAttributeGroup__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclAttributeGroup__Group__0__Impl
	rule__EclAttributeGroup__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclAttributeGroupAccess().getCardinalityAssignment_0()); }
	(rule__EclAttributeGroup__CardinalityAssignment_0)?
	{ after(grammarAccess.getEclAttributeGroupAccess().getCardinalityAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclAttributeGroup__Group__1__Impl
	rule__EclAttributeGroup__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1()); }
	RULE_CURLY_OPEN
	{ after(grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclAttributeGroup__Group__2__Impl
	rule__EclAttributeGroup__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclAttributeGroupAccess().getRefinementAssignment_2()); }
	(rule__EclAttributeGroup__RefinementAssignment_2)
	{ after(grammarAccess.getEclAttributeGroupAccess().getRefinementAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclAttributeGroup__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3()); }
	RULE_CURLY_CLOSE
	{ after(grammarAccess.getEclAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrAttributeSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group__0__Impl
	rule__OrAttributeSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getAndAttributeSetParserRuleCall_0()); }
	ruleAndAttributeSet
	{ after(grammarAccess.getOrAttributeSetAccess().getAndAttributeSetParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getGroup_1()); }
	(rule__OrAttributeSet__Group_1__0)*
	{ after(grammarAccess.getOrAttributeSetAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrAttributeSet__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group_1__0__Impl
	rule__OrAttributeSet__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0()); }
	()
	{ after(grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group_1__1__Impl
	rule__OrAttributeSet__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION
	{ after(grammarAccess.getOrAttributeSetAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getRightAssignment_1_2()); }
	(rule__OrAttributeSet__RightAssignment_1_2)
	{ after(grammarAccess.getOrAttributeSetAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndAttributeSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group__0__Impl
	rule__AndAttributeSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getSubAttributeSetParserRuleCall_0()); }
	ruleSubAttributeSet
	{ after(grammarAccess.getAndAttributeSetAccess().getSubAttributeSetParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getGroup_1()); }
	(rule__AndAttributeSet__Group_1__0)*
	{ after(grammarAccess.getAndAttributeSetAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndAttributeSet__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group_1__0__Impl
	rule__AndAttributeSet__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group_1__1__Impl
	rule__AndAttributeSet__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getAlternatives_1_1()); }
	(rule__AndAttributeSet__Alternatives_1_1)
	{ after(grammarAccess.getAndAttributeSetAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getRightAssignment_1_2()); }
	(rule__AndAttributeSet__RightAssignment_1_2)
	{ after(grammarAccess.getAndAttributeSetAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedAttributeSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedAttributeSet__Group__0__Impl
	rule__NestedAttributeSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedAttributeSet__Group__1__Impl
	rule__NestedAttributeSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedAttributeSetAccess().getNestedAssignment_1()); }
	(rule__NestedAttributeSet__NestedAssignment_1)
	{ after(grammarAccess.getNestedAttributeSetAccess().getNestedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedAttributeSet__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedAttributeSetAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getNestedAttributeSetAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeConstraint__Group__0__Impl
	rule__AttributeConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeConstraintAccess().getCardinalityAssignment_0()); }
	(rule__AttributeConstraint__CardinalityAssignment_0)?
	{ after(grammarAccess.getAttributeConstraintAccess().getCardinalityAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeConstraint__Group__1__Impl
	rule__AttributeConstraint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeConstraintAccess().getReversedAssignment_1()); }
	(rule__AttributeConstraint__ReversedAssignment_1)?
	{ after(grammarAccess.getAttributeConstraintAccess().getReversedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeConstraint__Group__2__Impl
	rule__AttributeConstraint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment_2()); }
	(rule__AttributeConstraint__AttributeAssignment_2)
	{ after(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeConstraint__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeConstraintAccess().getComparisonAssignment_3()); }
	(rule__AttributeConstraint__ComparisonAssignment_3)
	{ after(grammarAccess.getAttributeConstraintAccess().getComparisonAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cardinality__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__0__Impl
	rule__Cardinality__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0()); }
	RULE_SQUARE_OPEN
	{ after(grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__1__Impl
	rule__Cardinality__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getMinAssignment_1()); }
	(rule__Cardinality__MinAssignment_1)
	{ after(grammarAccess.getCardinalityAccess().getMinAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__2__Impl
	rule__Cardinality__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2()); }
	RULE_TO
	{ after(grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__3__Impl
	rule__Cardinality__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getMaxAssignment_3()); }
	(rule__Cardinality__MaxAssignment_3)
	{ after(grammarAccess.getCardinalityAccess().getMaxAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getSQUARE_CLOSETerminalRuleCall_4()); }
	RULE_SQUARE_CLOSE
	{ after(grammarAccess.getCardinalityAccess().getSQUARE_CLOSETerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeValueEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeValueEquals__Group__0__Impl
	rule__AttributeValueEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
	RULE_EQUAL
	{ after(grammarAccess.getAttributeValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeValueEquals__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeValueEqualsAccess().getConstraintAssignment_1()); }
	(rule__AttributeValueEquals__ConstraintAssignment_1)
	{ after(grammarAccess.getAttributeValueEqualsAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeValueNotEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeValueNotEquals__Group__0__Impl
	rule__AttributeValueNotEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueNotEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
	RULE_NOT_EQUAL
	{ after(grammarAccess.getAttributeValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueNotEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeValueNotEquals__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueNotEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintAssignment_1()); }
	(rule__AttributeValueNotEquals__ConstraintAssignment_1)
	{ after(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BooleanValueEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanValueEquals__Group__0__Impl
	rule__BooleanValueEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
	RULE_EQUAL
	{ after(grammarAccess.getBooleanValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanValueEquals__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanValueEqualsAccess().getValueAssignment_1()); }
	(rule__BooleanValueEquals__ValueAssignment_1)
	{ after(grammarAccess.getBooleanValueEqualsAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BooleanValueNotEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanValueNotEquals__Group__0__Impl
	rule__BooleanValueNotEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueNotEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
	RULE_NOT_EQUAL
	{ after(grammarAccess.getBooleanValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueNotEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanValueNotEquals__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueNotEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanValueNotEqualsAccess().getValueAssignment_1()); }
	(rule__BooleanValueNotEquals__ValueAssignment_1)
	{ after(grammarAccess.getBooleanValueNotEqualsAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringValueEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringValueEquals__Group__0__Impl
	rule__StringValueEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
	RULE_EQUAL
	{ after(grammarAccess.getStringValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringValueEquals__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringValueEqualsAccess().getValueAssignment_1()); }
	(rule__StringValueEquals__ValueAssignment_1)
	{ after(grammarAccess.getStringValueEqualsAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringValueNotEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringValueNotEquals__Group__0__Impl
	rule__StringValueNotEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueNotEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
	RULE_NOT_EQUAL
	{ after(grammarAccess.getStringValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueNotEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringValueNotEquals__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueNotEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringValueNotEqualsAccess().getValueAssignment_1()); }
	(rule__StringValueNotEquals__ValueAssignment_1)
	{ after(grammarAccess.getStringValueNotEqualsAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValueEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueEquals__Group__0__Impl
	rule__IntegerValueEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
	RULE_EQUAL
	{ after(grammarAccess.getIntegerValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueEquals__Group__1__Impl
	rule__IntegerValueEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueEqualsAccess().getValueAssignment_2()); }
	(rule__IntegerValueEquals__ValueAssignment_2)
	{ after(grammarAccess.getIntegerValueEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValueNotEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueNotEquals__Group__0__Impl
	rule__IntegerValueNotEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueNotEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
	RULE_NOT_EQUAL
	{ after(grammarAccess.getIntegerValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueNotEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueNotEquals__Group__1__Impl
	rule__IntegerValueNotEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueNotEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueNotEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueNotEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueNotEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueNotEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueNotEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueNotEqualsAccess().getValueAssignment_2()); }
	(rule__IntegerValueNotEquals__ValueAssignment_2)
	{ after(grammarAccess.getIntegerValueNotEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValueGreaterThan__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueGreaterThan__Group__0__Impl
	rule__IntegerValueGreaterThan__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThan__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueGreaterThanAccess().getGTTerminalRuleCall_0()); }
	RULE_GT
	{ after(grammarAccess.getIntegerValueGreaterThanAccess().getGTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThan__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueGreaterThan__Group__1__Impl
	rule__IntegerValueGreaterThan__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThan__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueGreaterThanAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueGreaterThanAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThan__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueGreaterThan__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThan__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueGreaterThanAccess().getValueAssignment_2()); }
	(rule__IntegerValueGreaterThan__ValueAssignment_2)
	{ after(grammarAccess.getIntegerValueGreaterThanAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValueLessThan__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueLessThan__Group__0__Impl
	rule__IntegerValueLessThan__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThan__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueLessThanAccess().getLTTerminalRuleCall_0()); }
	RULE_LT
	{ after(grammarAccess.getIntegerValueLessThanAccess().getLTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThan__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueLessThan__Group__1__Impl
	rule__IntegerValueLessThan__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThan__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueLessThanAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueLessThanAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThan__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueLessThan__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThan__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueLessThanAccess().getValueAssignment_2()); }
	(rule__IntegerValueLessThan__ValueAssignment_2)
	{ after(grammarAccess.getIntegerValueLessThanAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValueGreaterThanEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueGreaterThanEquals__Group__0__Impl
	rule__IntegerValueGreaterThanEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThanEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0()); }
	RULE_GTE
	{ after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThanEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueGreaterThanEquals__Group__1__Impl
	rule__IntegerValueGreaterThanEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThanEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThanEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueGreaterThanEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThanEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueAssignment_2()); }
	(rule__IntegerValueGreaterThanEquals__ValueAssignment_2)
	{ after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValueLessThanEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueLessThanEquals__Group__0__Impl
	rule__IntegerValueLessThanEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThanEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueLessThanEqualsAccess().getLTETerminalRuleCall_0()); }
	RULE_LTE
	{ after(grammarAccess.getIntegerValueLessThanEqualsAccess().getLTETerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThanEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueLessThanEquals__Group__1__Impl
	rule__IntegerValueLessThanEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThanEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueLessThanEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueLessThanEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThanEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueLessThanEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThanEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueAssignment_2()); }
	(rule__IntegerValueLessThanEquals__ValueAssignment_2)
	{ after(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValueEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueEquals__Group__0__Impl
	rule__DecimalValueEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
	RULE_EQUAL
	{ after(grammarAccess.getDecimalValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueEquals__Group__1__Impl
	rule__DecimalValueEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueEqualsAccess().getValueAssignment_2()); }
	(rule__DecimalValueEquals__ValueAssignment_2)
	{ after(grammarAccess.getDecimalValueEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValueNotEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueNotEquals__Group__0__Impl
	rule__DecimalValueNotEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueNotEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
	RULE_NOT_EQUAL
	{ after(grammarAccess.getDecimalValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueNotEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueNotEquals__Group__1__Impl
	rule__DecimalValueNotEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueNotEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueNotEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueNotEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueNotEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueNotEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueNotEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueNotEqualsAccess().getValueAssignment_2()); }
	(rule__DecimalValueNotEquals__ValueAssignment_2)
	{ after(grammarAccess.getDecimalValueNotEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValueGreaterThan__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueGreaterThan__Group__0__Impl
	rule__DecimalValueGreaterThan__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThan__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueGreaterThanAccess().getGTTerminalRuleCall_0()); }
	RULE_GT
	{ after(grammarAccess.getDecimalValueGreaterThanAccess().getGTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThan__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueGreaterThan__Group__1__Impl
	rule__DecimalValueGreaterThan__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThan__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueGreaterThanAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueGreaterThanAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThan__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueGreaterThan__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThan__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueGreaterThanAccess().getValueAssignment_2()); }
	(rule__DecimalValueGreaterThan__ValueAssignment_2)
	{ after(grammarAccess.getDecimalValueGreaterThanAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValueLessThan__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueLessThan__Group__0__Impl
	rule__DecimalValueLessThan__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThan__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueLessThanAccess().getLTTerminalRuleCall_0()); }
	RULE_LT
	{ after(grammarAccess.getDecimalValueLessThanAccess().getLTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThan__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueLessThan__Group__1__Impl
	rule__DecimalValueLessThan__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThan__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueLessThanAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueLessThanAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThan__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueLessThan__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThan__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueLessThanAccess().getValueAssignment_2()); }
	(rule__DecimalValueLessThan__ValueAssignment_2)
	{ after(grammarAccess.getDecimalValueLessThanAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValueGreaterThanEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueGreaterThanEquals__Group__0__Impl
	rule__DecimalValueGreaterThanEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThanEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0()); }
	RULE_GTE
	{ after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThanEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueGreaterThanEquals__Group__1__Impl
	rule__DecimalValueGreaterThanEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThanEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThanEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueGreaterThanEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThanEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueAssignment_2()); }
	(rule__DecimalValueGreaterThanEquals__ValueAssignment_2)
	{ after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValueLessThanEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueLessThanEquals__Group__0__Impl
	rule__DecimalValueLessThanEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThanEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueLessThanEqualsAccess().getLTETerminalRuleCall_0()); }
	RULE_LTE
	{ after(grammarAccess.getDecimalValueLessThanEqualsAccess().getLTETerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThanEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueLessThanEquals__Group__1__Impl
	rule__DecimalValueLessThanEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThanEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueLessThanEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueLessThanEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThanEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueLessThanEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThanEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueAssignment_2()); }
	(rule__DecimalValueLessThanEquals__ValueAssignment_2)
	{ after(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedExpression__Group__0__Impl
	rule__NestedExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedExpression__Group__1__Impl
	rule__NestedExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedExpressionAccess().getNestedAssignment_1()); }
	(rule__NestedExpression__NestedAssignment_1)
	{ after(grammarAccess.getNestedExpressionAccess().getNestedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedExpression__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedExpressionAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getNestedExpressionAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SnomedIdentifier__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__0__Impl
	rule__SnomedIdentifier__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); }
	RULE_DIGIT_NONZERO
	{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__1__Impl
	rule__SnomedIdentifier__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1()); }
	(rule__SnomedIdentifier__Alternatives_1)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__2__Impl
	rule__SnomedIdentifier__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2()); }
	(rule__SnomedIdentifier__Alternatives_2)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__3__Impl
	rule__SnomedIdentifier__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3()); }
	(rule__SnomedIdentifier__Alternatives_3)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__4__Impl
	rule__SnomedIdentifier__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4()); }
	(rule__SnomedIdentifier__Alternatives_4)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
		(rule__SnomedIdentifier__Alternatives_5)
		{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
	)
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
		(rule__SnomedIdentifier__Alternatives_5)*
		{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NonNegativeInteger__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeInteger__Group_1__0__Impl
	rule__NonNegativeInteger__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
	RULE_DIGIT_NONZERO
	{ after(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeInteger__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1()); }
	(rule__NonNegativeInteger__Alternatives_1_1)*
	{ after(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Integer__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Integer__Group__0__Impl
	rule__Integer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerAccess().getAlternatives_0()); }
	(rule__Integer__Alternatives_0)?
	{ after(grammarAccess.getIntegerAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Integer__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1()); }
	ruleNonNegativeInteger
	{ after(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Decimal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Decimal__Group__0__Impl
	rule__Decimal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalAccess().getAlternatives_0()); }
	(rule__Decimal__Alternatives_0)?
	{ after(grammarAccess.getDecimalAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Decimal__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1()); }
	ruleNonNegativeDecimal
	{ after(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NonNegativeDecimal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeDecimal__Group__0__Impl
	rule__NonNegativeDecimal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0()); }
	ruleNonNegativeInteger
	{ after(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeDecimal__Group__1__Impl
	rule__NonNegativeDecimal__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1()); }
	RULE_DOT
	{ after(grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeDecimal__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2()); }
	(rule__NonNegativeDecimal__Alternatives_2)*
	{ after(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpressionTemplate__PrimitiveAssignment_1_0_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionTemplateAccess().getPrimitiveSUBTYPE_OFTerminalRuleCall_1_0_0_0_0()); }
		RULE_SUBTYPE_OF
		{ after(grammarAccess.getExpressionTemplateAccess().getPrimitiveSUBTYPE_OFTerminalRuleCall_1_0_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionTemplate__SlotAssignment_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionTemplateAccess().getSlotTokenReplacementSlotParserRuleCall_1_0_1_0()); }
		ruleTokenReplacementSlot
		{ after(grammarAccess.getExpressionTemplateAccess().getSlotTokenReplacementSlotParserRuleCall_1_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionTemplate__ExpressionAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionTemplateAccess().getExpressionSubExpressionParserRuleCall_1_1_0()); }
		ruleSubExpression
		{ after(grammarAccess.getExpressionTemplateAccess().getExpressionSubExpressionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__FocusConceptsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubExpressionAccess().getFocusConceptsFocusConceptParserRuleCall_0_0()); }
		ruleFocusConcept
		{ after(grammarAccess.getSubExpressionAccess().getFocusConceptsFocusConceptParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__FocusConceptsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubExpressionAccess().getFocusConceptsFocusConceptParserRuleCall_1_1_0()); }
		ruleFocusConcept
		{ after(grammarAccess.getSubExpressionAccess().getFocusConceptsFocusConceptParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__RefinementAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubExpressionAccess().getRefinementRefinementParserRuleCall_2_1_0()); }
		ruleRefinement
		{ after(grammarAccess.getSubExpressionAccess().getRefinementRefinementParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FocusConcept__SlotAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFocusConceptAccess().getSlotTemplateInformationSlotParserRuleCall_0_0()); }
		ruleTemplateInformationSlot
		{ after(grammarAccess.getFocusConceptAccess().getSlotTemplateInformationSlotParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FocusConcept__ConceptAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFocusConceptAccess().getConceptConceptReferenceParserRuleCall_1_0()); }
		ruleConceptReference
		{ after(grammarAccess.getFocusConceptAccess().getConceptConceptReferenceParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__AttributesAssignment_0_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_0_0()); }
		ruleAttribute
		{ after(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__AttributesAssignment_0_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_1_1_0()); }
		ruleAttribute
		{ after(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__GroupsAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_0_1_0()); }
		ruleAttributeGroup
		{ after(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__GroupsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_1_1_0()); }
		ruleAttributeGroup
		{ after(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__SlotAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeGroupAccess().getSlotTemplateInformationSlotParserRuleCall_0_0()); }
		ruleTemplateInformationSlot
		{ after(grammarAccess.getAttributeGroupAccess().getSlotTemplateInformationSlotParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__AttributesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_2_0()); }
		ruleAttribute
		{ after(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__AttributesAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_3_1_0()); }
		ruleAttribute
		{ after(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__SlotAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getSlotTemplateInformationSlotParserRuleCall_0_0()); }
		ruleTemplateInformationSlot
		{ after(grammarAccess.getAttributeAccess().getSlotTemplateInformationSlotParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getNameConceptReferenceParserRuleCall_1_0()); }
		ruleConceptReference
		{ after(grammarAccess.getAttributeAccess().getNameConceptReferenceParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__ValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_3_0()); }
		ruleAttributeValue
		{ after(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__ConstraintAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptIdReplacementSlotAccess().getConstraintExpressionConstraintParserRuleCall_4_1_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getConceptIdReplacementSlotAccess().getConstraintExpressionConstraintParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptIdReplacementSlot__NameAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptIdReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0()); }
		RULE_SLOTNAME_STRING
		{ after(grammarAccess.getConceptIdReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__ConstraintAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionReplacementSlotAccess().getConstraintExpressionConstraintParserRuleCall_4_1_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getExpressionReplacementSlotAccess().getConstraintExpressionConstraintParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionReplacementSlot__NameAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0()); }
		RULE_SLOTNAME_STRING
		{ after(grammarAccess.getExpressionReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__TokensAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenReplacementSlotAccess().getTokensSlotTokenParserRuleCall_4_1_0()); }
		ruleSlotToken
		{ after(grammarAccess.getTokenReplacementSlotAccess().getTokensSlotTokenParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__TokensAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenReplacementSlotAccess().getTokensSlotTokenParserRuleCall_4_2_0()); }
		ruleSlotToken
		{ after(grammarAccess.getTokenReplacementSlotAccess().getTokensSlotTokenParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenReplacementSlot__NameAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0()); }
		RULE_SLOTNAME_STRING
		{ after(grammarAccess.getTokenReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TemplateInformationSlot__CardinalityAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTemplateInformationSlotAccess().getCardinalityEtlCardinalityParserRuleCall_2_0()); }
		ruleEtlCardinality
		{ after(grammarAccess.getTemplateInformationSlotAccess().getCardinalityEtlCardinalityParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TemplateInformationSlot__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTemplateInformationSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_3_0()); }
		RULE_SLOTNAME_STRING
		{ after(grammarAccess.getTemplateInformationSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__ValuesAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringReplacementSlotAccess().getValuesSTRINGTerminalRuleCall_4_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringReplacementSlotAccess().getValuesSTRINGTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__ValuesAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringReplacementSlotAccess().getValuesSTRINGTerminalRuleCall_4_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringReplacementSlotAccess().getValuesSTRINGTerminalRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringReplacementSlot__NameAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0()); }
		RULE_SLOTNAME_STRING
		{ after(grammarAccess.getStringReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__ValuesAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerReplacementSlotAccess().getValuesSlotIntegerParserRuleCall_4_1_0()); }
		ruleSlotInteger
		{ after(grammarAccess.getIntegerReplacementSlotAccess().getValuesSlotIntegerParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__ValuesAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerReplacementSlotAccess().getValuesSlotIntegerParserRuleCall_4_2_0()); }
		ruleSlotInteger
		{ after(grammarAccess.getIntegerReplacementSlotAccess().getValuesSlotIntegerParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerReplacementSlot__NameAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0()); }
		RULE_SLOTNAME_STRING
		{ after(grammarAccess.getIntegerReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__ValuesAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalReplacementSlotAccess().getValuesSlotDecimalParserRuleCall_4_1_0()); }
		ruleSlotDecimal
		{ after(grammarAccess.getDecimalReplacementSlotAccess().getValuesSlotDecimalParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__ValuesAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalReplacementSlotAccess().getValuesSlotDecimalParserRuleCall_4_2_0()); }
		ruleSlotDecimal
		{ after(grammarAccess.getDecimalReplacementSlotAccess().getValuesSlotDecimalParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalReplacementSlot__NameAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0()); }
		RULE_SLOTNAME_STRING
		{ after(grammarAccess.getDecimalReplacementSlotAccess().getNameSLOTNAME_STRINGTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EtlCardinality__MinAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEtlCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0()); }
		ruleNonNegativeInteger
		{ after(grammarAccess.getEtlCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EtlCardinality__MaxAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEtlCardinalityAccess().getMaxMaxValueParserRuleCall_3_0()); }
		ruleMaxValue
		{ after(grammarAccess.getEtlCardinalityAccess().getMaxMaxValueParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptReference__SlotAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptReferenceAccess().getSlotConceptReplacementSlotParserRuleCall_0_0()); }
		ruleConceptReplacementSlot
		{ after(grammarAccess.getConceptReferenceAccess().getSlotConceptReplacementSlotParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptReference__IdAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_1_0_0()); }
		ruleSnomedIdentifier
		{ after(grammarAccess.getConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptReference__TermAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_1_0()); }
		RULE_TERM_STRING
		{ after(grammarAccess.getConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValue__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValue__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueAccess().getValueIntegerParserRuleCall_1_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueAccess().getValueIntegerParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValue__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueAccess().getValueDecimalParserRuleCall_1_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueAccess().getValueDecimalParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerValue__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotIntegerValueAccess().getValueNonNegativeIntegerParserRuleCall_1_0()); }
		ruleNonNegativeInteger
		{ after(grammarAccess.getSlotIntegerValueAccess().getValueNonNegativeIntegerParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerRange__MinimumAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotIntegerRangeAccess().getMinimumSlotIntegerMinimumValueParserRuleCall_0_0_0()); }
		ruleSlotIntegerMinimumValue
		{ after(grammarAccess.getSlotIntegerRangeAccess().getMinimumSlotIntegerMinimumValueParserRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerRange__MaximumAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotIntegerRangeAccess().getMaximumSlotIntegerMaximumValueParserRuleCall_0_2_0()); }
		ruleSlotIntegerMaximumValue
		{ after(grammarAccess.getSlotIntegerRangeAccess().getMaximumSlotIntegerMaximumValueParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerRange__MaximumAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotIntegerRangeAccess().getMaximumSlotIntegerMaximumValueParserRuleCall_1_1_0()); }
		ruleSlotIntegerMaximumValue
		{ after(grammarAccess.getSlotIntegerRangeAccess().getMaximumSlotIntegerMaximumValueParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerMinimumValue__ExclusiveAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotIntegerMinimumValueAccess().getExclusiveGTTerminalRuleCall_0_0()); }
		RULE_GT
		{ after(grammarAccess.getSlotIntegerMinimumValueAccess().getExclusiveGTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerMinimumValue__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotIntegerMinimumValueAccess().getValueNonNegativeIntegerParserRuleCall_2_0()); }
		ruleNonNegativeInteger
		{ after(grammarAccess.getSlotIntegerMinimumValueAccess().getValueNonNegativeIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerMaximumValue__ExclusiveAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotIntegerMaximumValueAccess().getExclusiveLTTerminalRuleCall_0_0()); }
		RULE_LT
		{ after(grammarAccess.getSlotIntegerMaximumValueAccess().getExclusiveLTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotIntegerMaximumValue__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotIntegerMaximumValueAccess().getValueNonNegativeIntegerParserRuleCall_2_0()); }
		ruleNonNegativeInteger
		{ after(grammarAccess.getSlotIntegerMaximumValueAccess().getValueNonNegativeIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalValue__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotDecimalValueAccess().getValueNonNegativeDecimalParserRuleCall_1_0()); }
		ruleNonNegativeDecimal
		{ after(grammarAccess.getSlotDecimalValueAccess().getValueNonNegativeDecimalParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalRange__MinimumAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotDecimalRangeAccess().getMinimumSlotDecimalMinimumValueParserRuleCall_0_0_0()); }
		ruleSlotDecimalMinimumValue
		{ after(grammarAccess.getSlotDecimalRangeAccess().getMinimumSlotDecimalMinimumValueParserRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalRange__MaximumAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotDecimalRangeAccess().getMaximumSlotDecimalMaximumValueParserRuleCall_0_2_0()); }
		ruleSlotDecimalMaximumValue
		{ after(grammarAccess.getSlotDecimalRangeAccess().getMaximumSlotDecimalMaximumValueParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalRange__MaximumAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotDecimalRangeAccess().getMaximumSlotDecimalMaximumValueParserRuleCall_1_1_0()); }
		ruleSlotDecimalMaximumValue
		{ after(grammarAccess.getSlotDecimalRangeAccess().getMaximumSlotDecimalMaximumValueParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalMinimumValue__ExclusiveAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotDecimalMinimumValueAccess().getExclusiveGTTerminalRuleCall_0_0()); }
		RULE_GT
		{ after(grammarAccess.getSlotDecimalMinimumValueAccess().getExclusiveGTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalMinimumValue__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotDecimalMinimumValueAccess().getValueNonNegativeDecimalParserRuleCall_2_0()); }
		ruleNonNegativeDecimal
		{ after(grammarAccess.getSlotDecimalMinimumValueAccess().getValueNonNegativeDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalMaximumValue__ExclusiveAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotDecimalMaximumValueAccess().getExclusiveLTTerminalRuleCall_0_0()); }
		RULE_LT
		{ after(grammarAccess.getSlotDecimalMaximumValueAccess().getExclusiveLTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlotDecimalMaximumValue__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlotDecimalMaximumValueAccess().getValueNonNegativeDecimalParserRuleCall_2_0()); }
		ruleNonNegativeDecimal
		{ after(grammarAccess.getSlotDecimalMaximumValueAccess().getValueNonNegativeDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0()); }
		ruleAndExpressionConstraint
		{ after(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0()); }
		ruleExclusionExpressionConstraint
		{ after(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0()); }
		ruleRefinedExpressionConstraint
		{ after(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__RefinementAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementEclRefinementParserRuleCall_1_2_0()); }
		ruleEclRefinement
		{ after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementEclRefinementParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__AttributeAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_1_2_0()); }
		ruleSubExpressionConstraint
		{ after(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChildOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getChildOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOrSelfOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChildOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getChildOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescendantOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getDescendantOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOrSelfOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescendantOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getDescendantOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParentOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getParentOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOrSelfOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParentOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getParentOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAncestorOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getAncestorOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOrSelfOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAncestorOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getAncestorOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintAlternatives_1_0()); }
		(rule__MemberOf__ConstraintAlternatives_1_0)
		{ after(grammarAccess.getMemberOfAccess().getConstraintAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__IdAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0()); }
		ruleSnomedIdentifier
		{ after(grammarAccess.getEclConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__TermAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0()); }
		RULE_TERM_STRING
		{ after(grammarAccess.getEclConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__RightAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0()); }
		ruleAndRefinement
		{ after(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__RightAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0()); }
		ruleSubRefinement
		{ after(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__NestedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0()); }
		ruleEclRefinement
		{ after(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__CardinalityAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0()); }
		ruleCardinality
		{ after(grammarAccess.getEclAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__RefinementAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0()); }
		ruleEclAttributeSet
		{ after(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0()); }
		ruleAndAttributeSet
		{ after(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0()); }
		ruleSubAttributeSet
		{ after(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__NestedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0()); }
		ruleEclAttributeSet
		{ after(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__CardinalityAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0()); }
		ruleCardinality
		{ after(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__ReversedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getReversedREVERSEDTerminalRuleCall_1_0()); }
		RULE_REVERSED
		{ after(grammarAccess.getAttributeConstraintAccess().getReversedREVERSEDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__AttributeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_2_0()); }
		ruleSubExpressionConstraint
		{ after(grammarAccess.getAttributeConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__ComparisonAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getComparisonComparisonParserRuleCall_3_0()); }
		ruleComparison
		{ after(grammarAccess.getAttributeConstraintAccess().getComparisonComparisonParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__MinAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0()); }
		ruleNonNegativeInteger
		{ after(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__MaxAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0()); }
		ruleMaxValue
		{ after(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueEquals__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeValueEqualsAccess().getConstraintSubExpressionConstraintParserRuleCall_1_0()); }
		ruleSubExpressionConstraint
		{ after(grammarAccess.getAttributeValueEqualsAccess().getConstraintSubExpressionConstraintParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueNotEquals__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintSubExpressionConstraintParserRuleCall_1_0()); }
		ruleSubExpressionConstraint
		{ after(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintSubExpressionConstraintParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueEquals__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanValueEqualsAccess().getValueBooleanParserRuleCall_1_0()); }
		ruleBoolean
		{ after(grammarAccess.getBooleanValueEqualsAccess().getValueBooleanParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueNotEquals__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanValueNotEqualsAccess().getValueBooleanParserRuleCall_1_0()); }
		ruleBoolean
		{ after(grammarAccess.getBooleanValueNotEqualsAccess().getValueBooleanParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueEquals__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringValueEqualsAccess().getValueSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringValueEqualsAccess().getValueSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueNotEquals__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringValueNotEqualsAccess().getValueSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringValueNotEqualsAccess().getValueSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueNotEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueNotEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueNotEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThan__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueGreaterThanAccess().getValueIntegerParserRuleCall_2_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueGreaterThanAccess().getValueIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThan__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueLessThanAccess().getValueIntegerParserRuleCall_2_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueLessThanAccess().getValueIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThanEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThanEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueNotEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueNotEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueNotEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThan__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueGreaterThanAccess().getValueDecimalParserRuleCall_2_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueGreaterThanAccess().getValueDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThan__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueLessThanAccess().getValueDecimalParserRuleCall_2_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueLessThanAccess().getValueDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThanEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThanEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__NestedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
