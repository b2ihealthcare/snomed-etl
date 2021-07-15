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

// Entry rule entryRuleFilteredExpressionConstraint
entryRuleFilteredExpressionConstraint
:
{ before(grammarAccess.getFilteredExpressionConstraintRule()); }
	 ruleFilteredExpressionConstraint
{ after(grammarAccess.getFilteredExpressionConstraintRule()); } 
	 EOF 
;

// Rule FilteredExpressionConstraint
ruleFilteredExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFilteredExpressionConstraintAccess().getGroup()); }
		(rule__FilteredExpressionConstraint__Group__0)
		{ after(grammarAccess.getFilteredExpressionConstraintAccess().getGroup()); }
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

// Entry rule entryRuleEclConceptReferenceSet
entryRuleEclConceptReferenceSet
:
{ before(grammarAccess.getEclConceptReferenceSetRule()); }
	 ruleEclConceptReferenceSet
{ after(grammarAccess.getEclConceptReferenceSetRule()); } 
	 EOF 
;

// Rule EclConceptReferenceSet
ruleEclConceptReferenceSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclConceptReferenceSetAccess().getGroup()); }
		(rule__EclConceptReferenceSet__Group__0)
		{ after(grammarAccess.getEclConceptReferenceSetAccess().getGroup()); }
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
		{ before(grammarAccess.getAttributeComparisonAccess().getGroup()); }
		(rule__AttributeComparison__Group__0)
		{ after(grammarAccess.getAttributeComparisonAccess().getGroup()); }
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

// Entry rule entryRuleBooleanValueComparison
entryRuleBooleanValueComparison
:
{ before(grammarAccess.getBooleanValueComparisonRule()); }
	 ruleBooleanValueComparison
{ after(grammarAccess.getBooleanValueComparisonRule()); } 
	 EOF 
;

// Rule BooleanValueComparison
ruleBooleanValueComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanValueComparisonAccess().getGroup()); }
		(rule__BooleanValueComparison__Group__0)
		{ after(grammarAccess.getBooleanValueComparisonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringValueComparison
entryRuleStringValueComparison
:
{ before(grammarAccess.getStringValueComparisonRule()); }
	 ruleStringValueComparison
{ after(grammarAccess.getStringValueComparisonRule()); } 
	 EOF 
;

// Rule StringValueComparison
ruleStringValueComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringValueComparisonAccess().getGroup()); }
		(rule__StringValueComparison__Group__0)
		{ after(grammarAccess.getStringValueComparisonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValueComparison
entryRuleIntegerValueComparison
:
{ before(grammarAccess.getIntegerValueComparisonRule()); }
	 ruleIntegerValueComparison
{ after(grammarAccess.getIntegerValueComparisonRule()); } 
	 EOF 
;

// Rule IntegerValueComparison
ruleIntegerValueComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueComparisonAccess().getGroup()); }
		(rule__IntegerValueComparison__Group__0)
		{ after(grammarAccess.getIntegerValueComparisonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValueComparison
entryRuleDecimalValueComparison
:
{ before(grammarAccess.getDecimalValueComparisonRule()); }
	 ruleDecimalValueComparison
{ after(grammarAccess.getDecimalValueComparisonRule()); } 
	 EOF 
;

// Rule DecimalValueComparison
ruleDecimalValueComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueComparisonAccess().getGroup()); }
		(rule__DecimalValueComparison__Group__0)
		{ after(grammarAccess.getDecimalValueComparisonAccess().getGroup()); }
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

// Entry rule entryRuleFilterConstraint
entryRuleFilterConstraint
:
{ before(grammarAccess.getFilterConstraintRule()); }
	 ruleFilterConstraint
{ after(grammarAccess.getFilterConstraintRule()); } 
	 EOF 
;

// Rule FilterConstraint
ruleFilterConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFilterConstraintAccess().getGroup()); }
		(rule__FilterConstraint__Group__0)
		{ after(grammarAccess.getFilterConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFilter
entryRuleFilter
:
{ before(grammarAccess.getFilterRule()); }
	 ruleFilter
{ after(grammarAccess.getFilterRule()); } 
	 EOF 
;

// Rule Filter
ruleFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFilterAccess().getDisjunctionFilterParserRuleCall()); }
		ruleDisjunctionFilter
		{ after(grammarAccess.getFilterAccess().getDisjunctionFilterParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDisjunctionFilter
entryRuleDisjunctionFilter
:
{ before(grammarAccess.getDisjunctionFilterRule()); }
	 ruleDisjunctionFilter
{ after(grammarAccess.getDisjunctionFilterRule()); } 
	 EOF 
;

// Rule DisjunctionFilter
ruleDisjunctionFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDisjunctionFilterAccess().getGroup()); }
		(rule__DisjunctionFilter__Group__0)
		{ after(grammarAccess.getDisjunctionFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConjunctionFilter
entryRuleConjunctionFilter
:
{ before(grammarAccess.getConjunctionFilterRule()); }
	 ruleConjunctionFilter
{ after(grammarAccess.getConjunctionFilterRule()); } 
	 EOF 
;

// Rule ConjunctionFilter
ruleConjunctionFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConjunctionFilterAccess().getGroup()); }
		(rule__ConjunctionFilter__Group__0)
		{ after(grammarAccess.getConjunctionFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedFilter
entryRuleNestedFilter
:
{ before(grammarAccess.getNestedFilterRule()); }
	 ruleNestedFilter
{ after(grammarAccess.getNestedFilterRule()); } 
	 EOF 
;

// Rule NestedFilter
ruleNestedFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedFilterAccess().getGroup()); }
		(rule__NestedFilter__Group__0)
		{ after(grammarAccess.getNestedFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyFilter
entryRulePropertyFilter
:
{ before(grammarAccess.getPropertyFilterRule()); }
	 rulePropertyFilter
{ after(grammarAccess.getPropertyFilterRule()); } 
	 EOF 
;

// Rule PropertyFilter
rulePropertyFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyFilterAccess().getAlternatives()); }
		(rule__PropertyFilter__Alternatives)
		{ after(grammarAccess.getPropertyFilterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTermFilter
entryRuleTermFilter
:
{ before(grammarAccess.getTermFilterRule()); }
	 ruleTermFilter
{ after(grammarAccess.getTermFilterRule()); } 
	 EOF 
;

// Rule TermFilter
ruleTermFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTermFilterAccess().getGroup()); }
		(rule__TermFilter__Group__0)
		{ after(grammarAccess.getTermFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypedTermFilter
entryRuleTypedTermFilter
:
{ before(grammarAccess.getTypedTermFilterRule()); }
	 ruleTypedTermFilter
{ after(grammarAccess.getTypedTermFilterRule()); } 
	 EOF 
;

// Rule TypedTermFilter
ruleTypedTermFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypedTermFilterAccess().getGroup()); }
		(rule__TypedTermFilter__Group__0)
		{ after(grammarAccess.getTypedTermFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypedTermFilterSet
entryRuleTypedTermFilterSet
:
{ before(grammarAccess.getTypedTermFilterSetRule()); }
	 ruleTypedTermFilterSet
{ after(grammarAccess.getTypedTermFilterSetRule()); } 
	 EOF 
;

// Rule TypedTermFilterSet
ruleTypedTermFilterSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypedTermFilterSetAccess().getGroup()); }
		(rule__TypedTermFilterSet__Group__0)
		{ after(grammarAccess.getTypedTermFilterSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLanguageFilter
entryRuleLanguageFilter
:
{ before(grammarAccess.getLanguageFilterRule()); }
	 ruleLanguageFilter
{ after(grammarAccess.getLanguageFilterRule()); } 
	 EOF 
;

// Rule LanguageFilter
ruleLanguageFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLanguageFilterAccess().getGroup()); }
		(rule__LanguageFilter__Group__0)
		{ after(grammarAccess.getLanguageFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeFilter
entryRuleTypeFilter
:
{ before(grammarAccess.getTypeFilterRule()); }
	 ruleTypeFilter
{ after(grammarAccess.getTypeFilterRule()); } 
	 EOF 
;

// Rule TypeFilter
ruleTypeFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeFilterAccess().getAlternatives()); }
		(rule__TypeFilter__Alternatives)
		{ after(grammarAccess.getTypeFilterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeIdFilter
entryRuleTypeIdFilter
:
{ before(grammarAccess.getTypeIdFilterRule()); }
	 ruleTypeIdFilter
{ after(grammarAccess.getTypeIdFilterRule()); } 
	 EOF 
;

// Rule TypeIdFilter
ruleTypeIdFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeIdFilterAccess().getGroup()); }
		(rule__TypeIdFilter__Group__0)
		{ after(grammarAccess.getTypeIdFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeTokenFilter
entryRuleTypeTokenFilter
:
{ before(grammarAccess.getTypeTokenFilterRule()); }
	 ruleTypeTokenFilter
{ after(grammarAccess.getTypeTokenFilterRule()); } 
	 EOF 
;

// Rule TypeTokenFilter
ruleTypeTokenFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getGroup()); }
		(rule__TypeTokenFilter__Group__0)
		{ after(grammarAccess.getTypeTokenFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDialectFilter
entryRuleDialectFilter
:
{ before(grammarAccess.getDialectFilterRule()); }
	 ruleDialectFilter
{ after(grammarAccess.getDialectFilterRule()); } 
	 EOF 
;

// Rule DialectFilter
ruleDialectFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDialectFilterAccess().getAlternatives()); }
		(rule__DialectFilter__Alternatives)
		{ after(grammarAccess.getDialectFilterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDialectIdFilter
entryRuleDialectIdFilter
:
{ before(grammarAccess.getDialectIdFilterRule()); }
	 ruleDialectIdFilter
{ after(grammarAccess.getDialectIdFilterRule()); } 
	 EOF 
;

// Rule DialectIdFilter
ruleDialectIdFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getGroup()); }
		(rule__DialectIdFilter__Group__0)
		{ after(grammarAccess.getDialectIdFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDialectAliasFilter
entryRuleDialectAliasFilter
:
{ before(grammarAccess.getDialectAliasFilterRule()); }
	 ruleDialectAliasFilter
{ after(grammarAccess.getDialectAliasFilterRule()); } 
	 EOF 
;

// Rule DialectAliasFilter
ruleDialectAliasFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getGroup()); }
		(rule__DialectAliasFilter__Group__0)
		{ after(grammarAccess.getDialectAliasFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDialect
entryRuleDialect
:
{ before(grammarAccess.getDialectRule()); }
	 ruleDialect
{ after(grammarAccess.getDialectRule()); } 
	 EOF 
;

// Rule Dialect
ruleDialect 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDialectAccess().getGroup()); }
		(rule__Dialect__Group__0)
		{ after(grammarAccess.getDialectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDialectAlias
entryRuleDialectAlias
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getDialectAliasRule()); }
	 ruleDialectAlias
{ after(grammarAccess.getDialectAliasRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule DialectAlias
ruleDialectAlias 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDialectAliasAccess().getGroup()); }
		(rule__DialectAlias__Group__0)
		{ after(grammarAccess.getDialectAliasAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleAcceptability
entryRuleAcceptability
:
{ before(grammarAccess.getAcceptabilityRule()); }
	 ruleAcceptability
{ after(grammarAccess.getAcceptabilityRule()); } 
	 EOF 
;

// Rule Acceptability
ruleAcceptability 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAcceptabilityAccess().getAlternatives()); }
		(rule__Acceptability__Alternatives)
		{ after(grammarAccess.getAcceptabilityAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAcceptabilityIdSet
entryRuleAcceptabilityIdSet
:
{ before(grammarAccess.getAcceptabilityIdSetRule()); }
	 ruleAcceptabilityIdSet
{ after(grammarAccess.getAcceptabilityIdSetRule()); } 
	 EOF 
;

// Rule AcceptabilityIdSet
ruleAcceptabilityIdSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAcceptabilityIdSetAccess().getAcceptabilitiesAssignment()); }
		(rule__AcceptabilityIdSet__AcceptabilitiesAssignment)
		{ after(grammarAccess.getAcceptabilityIdSetAccess().getAcceptabilitiesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAcceptabilityTokenSet
entryRuleAcceptabilityTokenSet
:
{ before(grammarAccess.getAcceptabilityTokenSetRule()); }
	 ruleAcceptabilityTokenSet
{ after(grammarAccess.getAcceptabilityTokenSetRule()); } 
	 EOF 
;

// Rule AcceptabilityTokenSet
ruleAcceptabilityTokenSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAcceptabilityTokenSetAccess().getGroup()); }
		(rule__AcceptabilityTokenSet__Group__0)
		{ after(grammarAccess.getAcceptabilityTokenSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleActiveFilter
entryRuleActiveFilter
:
{ before(grammarAccess.getActiveFilterRule()); }
	 ruleActiveFilter
{ after(grammarAccess.getActiveFilterRule()); } 
	 EOF 
;

// Rule ActiveFilter
ruleActiveFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActiveFilterAccess().getGroup()); }
		(rule__ActiveFilter__Group__0)
		{ after(grammarAccess.getActiveFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModuleFilter
entryRuleModuleFilter
:
{ before(grammarAccess.getModuleFilterRule()); }
	 ruleModuleFilter
{ after(grammarAccess.getModuleFilterRule()); } 
	 EOF 
;

// Rule ModuleFilter
ruleModuleFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModuleFilterAccess().getGroup()); }
		(rule__ModuleFilter__Group__0)
		{ after(grammarAccess.getModuleFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSemanticTagFilter
entryRuleSemanticTagFilter
:
{ before(grammarAccess.getSemanticTagFilterRule()); }
	 ruleSemanticTagFilter
{ after(grammarAccess.getSemanticTagFilterRule()); } 
	 EOF 
;

// Rule SemanticTagFilter
ruleSemanticTagFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSemanticTagFilterAccess().getGroup()); }
		(rule__SemanticTagFilter__Group__0)
		{ after(grammarAccess.getSemanticTagFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEffectiveTimeFilter
entryRuleEffectiveTimeFilter
:
{ before(grammarAccess.getEffectiveTimeFilterRule()); }
	 ruleEffectiveTimeFilter
{ after(grammarAccess.getEffectiveTimeFilterRule()); } 
	 EOF 
;

// Rule EffectiveTimeFilter
ruleEffectiveTimeFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEffectiveTimeFilterAccess().getGroup()); }
		(rule__EffectiveTimeFilter__Group__0)
		{ after(grammarAccess.getEffectiveTimeFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePreferredInFilter
entryRulePreferredInFilter
:
{ before(grammarAccess.getPreferredInFilterRule()); }
	 rulePreferredInFilter
{ after(grammarAccess.getPreferredInFilterRule()); } 
	 EOF 
;

// Rule PreferredInFilter
rulePreferredInFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPreferredInFilterAccess().getGroup()); }
		(rule__PreferredInFilter__Group__0)
		{ after(grammarAccess.getPreferredInFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAcceptableInFilter
entryRuleAcceptableInFilter
:
{ before(grammarAccess.getAcceptableInFilterRule()); }
	 ruleAcceptableInFilter
{ after(grammarAccess.getAcceptableInFilterRule()); } 
	 EOF 
;

// Rule AcceptableInFilter
ruleAcceptableInFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAcceptableInFilterAccess().getGroup()); }
		(rule__AcceptableInFilter__Group__0)
		{ after(grammarAccess.getAcceptableInFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLanguageRefSetFilter
entryRuleLanguageRefSetFilter
:
{ before(grammarAccess.getLanguageRefSetFilterRule()); }
	 ruleLanguageRefSetFilter
{ after(grammarAccess.getLanguageRefSetFilterRule()); } 
	 EOF 
;

// Rule LanguageRefSetFilter
ruleLanguageRefSetFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLanguageRefSetFilterAccess().getGroup()); }
		(rule__LanguageRefSetFilter__Group__0)
		{ after(grammarAccess.getLanguageRefSetFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCaseSignificanceFilter
entryRuleCaseSignificanceFilter
:
{ before(grammarAccess.getCaseSignificanceFilterRule()); }
	 ruleCaseSignificanceFilter
{ after(grammarAccess.getCaseSignificanceFilterRule()); } 
	 EOF 
;

// Rule CaseSignificanceFilter
ruleCaseSignificanceFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCaseSignificanceFilterAccess().getGroup()); }
		(rule__CaseSignificanceFilter__Group__0)
		{ after(grammarAccess.getCaseSignificanceFilterAccess().getGroup()); }
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
		(
			{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives()); }
			(rule__SnomedIdentifier__Alternatives)
			{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives()); }
		)
		(
			{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives()); }
			(rule__SnomedIdentifier__Alternatives)*
			{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives()); }
		)
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
		(
			{ before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); }
			(rule__NonNegativeInteger__Alternatives)
			{ after(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); }
		)
		(
			{ before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); }
			(rule__NonNegativeInteger__Alternatives)*
			{ after(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); }
		)
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

// Entry rule entryRuleUnquotedString
entryRuleUnquotedString
:
{ before(grammarAccess.getUnquotedStringRule()); }
	 ruleUnquotedString
{ after(grammarAccess.getUnquotedStringRule()); } 
	 EOF 
;

// Rule UnquotedString
ruleUnquotedString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnquotedStringAccess().getAlternatives()); }
		(rule__UnquotedString__Alternatives)
		{ after(grammarAccess.getUnquotedStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDialectAliasValue
entryRuleDialectAliasValue
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getDialectAliasValueRule()); }
	 ruleDialectAliasValue
{ after(grammarAccess.getDialectAliasValueRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule DialectAliasValue
ruleDialectAliasValue 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getDialectAliasValueAccess().getAlternatives()); }
			(rule__DialectAliasValue__Alternatives)
			{ after(grammarAccess.getDialectAliasValueAccess().getAlternatives()); }
		)
		(
			{ before(grammarAccess.getDialectAliasValueAccess().getAlternatives()); }
			(rule__DialectAliasValue__Alternatives)*
			{ after(grammarAccess.getDialectAliasValueAccess().getAlternatives()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleLEXICAL_SEARCH_TYPE
entryRuleLEXICAL_SEARCH_TYPE
:
{ before(grammarAccess.getLEXICAL_SEARCH_TYPERule()); }
	 ruleLEXICAL_SEARCH_TYPE
{ after(grammarAccess.getLEXICAL_SEARCH_TYPERule()); } 
	 EOF 
;

// Rule LEXICAL_SEARCH_TYPE
ruleLEXICAL_SEARCH_TYPE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getAlternatives()); }
		(rule__LEXICAL_SEARCH_TYPE__Alternatives)
		{ after(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDOMAIN
entryRuleDOMAIN
:
{ before(grammarAccess.getDOMAINRule()); }
	 ruleDOMAIN
{ after(grammarAccess.getDOMAINRule()); } 
	 EOF 
;

// Rule DOMAIN
ruleDOMAIN 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDOMAINAccess().getAlternatives()); }
		(rule__DOMAIN__Alternatives)
		{ after(grammarAccess.getDOMAINAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNON_NUMERIC_OPERATOR
entryRuleNON_NUMERIC_OPERATOR
:
{ before(grammarAccess.getNON_NUMERIC_OPERATORRule()); }
	 ruleNON_NUMERIC_OPERATOR
{ after(grammarAccess.getNON_NUMERIC_OPERATORRule()); } 
	 EOF 
;

// Rule NON_NUMERIC_OPERATOR
ruleNON_NUMERIC_OPERATOR 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNON_NUMERIC_OPERATORAccess().getAlternatives()); }
		(rule__NON_NUMERIC_OPERATOR__Alternatives)
		{ after(grammarAccess.getNON_NUMERIC_OPERATORAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNUMERIC_OPERATOR
entryRuleNUMERIC_OPERATOR
:
{ before(grammarAccess.getNUMERIC_OPERATORRule()); }
	 ruleNUMERIC_OPERATOR
{ after(grammarAccess.getNUMERIC_OPERATORRule()); } 
	 EOF 
;

// Rule NUMERIC_OPERATOR
ruleNUMERIC_OPERATOR 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNUMERIC_OPERATORAccess().getAlternatives()); }
		(rule__NUMERIC_OPERATOR__Alternatives)
		{ after(grammarAccess.getNUMERIC_OPERATORAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
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
		{ before(grammarAccess.getSlotTokenAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_3()); }
		RULE_CONJUNCTION_KEYWORD
		{ after(grammarAccess.getSlotTokenAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_4()); }
		RULE_DISJUNCTION_KEYWORD
		{ after(grammarAccess.getSlotTokenAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getSlotTokenAccess().getEXCLUSION_KEYWORDTerminalRuleCall_5()); }
		RULE_EXCLUSION_KEYWORD
		{ after(grammarAccess.getSlotTokenAccess().getEXCLUSION_KEYWORDTerminalRuleCall_5()); }
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
		{ before(grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION_KEYWORD
		{ after(grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()); }
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
		{ before(grammarAccess.getAndRefinementAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0()); }
		RULE_CONJUNCTION_KEYWORD
		{ after(grammarAccess.getAndRefinementAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0()); }
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
		{ before(grammarAccess.getAndAttributeSetAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION_KEYWORD
		{ after(grammarAccess.getAndAttributeSetAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()); }
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

rule__DataTypeComparison__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getBooleanValueComparisonParserRuleCall_0()); }
		ruleBooleanValueComparison
		{ after(grammarAccess.getDataTypeComparisonAccess().getBooleanValueComparisonParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getStringValueComparisonParserRuleCall_1()); }
		ruleStringValueComparison
		{ after(grammarAccess.getDataTypeComparisonAccess().getStringValueComparisonParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueComparisonParserRuleCall_2()); }
		ruleIntegerValueComparison
		{ after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueComparisonParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueComparisonParserRuleCall_3()); }
		ruleDecimalValueComparison
		{ after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueComparisonParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConjunctionFilterAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION_KEYWORD
		{ after(grammarAccess.getConjunctionFilterAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1()); }
		RULE_COMMA
		{ after(grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyFilter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyFilterAccess().getTermFilterParserRuleCall_0()); }
		ruleTermFilter
		{ after(grammarAccess.getPropertyFilterAccess().getTermFilterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getLanguageFilterParserRuleCall_1()); }
		ruleLanguageFilter
		{ after(grammarAccess.getPropertyFilterAccess().getLanguageFilterParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getTypeFilterParserRuleCall_2()); }
		ruleTypeFilter
		{ after(grammarAccess.getPropertyFilterAccess().getTypeFilterParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getDialectFilterParserRuleCall_3()); }
		ruleDialectFilter
		{ after(grammarAccess.getPropertyFilterAccess().getDialectFilterParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getActiveFilterParserRuleCall_4()); }
		ruleActiveFilter
		{ after(grammarAccess.getPropertyFilterAccess().getActiveFilterParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getPreferredInFilterParserRuleCall_5()); }
		rulePreferredInFilter
		{ after(grammarAccess.getPropertyFilterAccess().getPreferredInFilterParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getAcceptableInFilterParserRuleCall_6()); }
		ruleAcceptableInFilter
		{ after(grammarAccess.getPropertyFilterAccess().getAcceptableInFilterParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getLanguageRefSetFilterParserRuleCall_7()); }
		ruleLanguageRefSetFilter
		{ after(grammarAccess.getPropertyFilterAccess().getLanguageRefSetFilterParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getModuleFilterParserRuleCall_8()); }
		ruleModuleFilter
		{ after(grammarAccess.getPropertyFilterAccess().getModuleFilterParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getSemanticTagFilterParserRuleCall_9()); }
		ruleSemanticTagFilter
		{ after(grammarAccess.getPropertyFilterAccess().getSemanticTagFilterParserRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getEffectiveTimeFilterParserRuleCall_10()); }
		ruleEffectiveTimeFilter
		{ after(grammarAccess.getPropertyFilterAccess().getEffectiveTimeFilterParserRuleCall_10()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getCaseSignificanceFilterParserRuleCall_11()); }
		ruleCaseSignificanceFilter
		{ after(grammarAccess.getPropertyFilterAccess().getCaseSignificanceFilterParserRuleCall_11()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_12()); }
		ruleNestedFilter
		{ after(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_12()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTermFilterAccess().getTypedTermFilterParserRuleCall_1_0()); }
		ruleTypedTermFilter
		{ after(grammarAccess.getTermFilterAccess().getTypedTermFilterParserRuleCall_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getTermFilterAccess().getTypedTermFilterSetParserRuleCall_1_1()); }
		ruleTypedTermFilterSet
		{ after(grammarAccess.getTermFilterAccess().getTypedTermFilterSetParserRuleCall_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageFilterAccess().getLanguageCodesAssignment_2_0()); }
		(rule__LanguageFilter__LanguageCodesAssignment_2_0)
		{ after(grammarAccess.getLanguageFilterAccess().getLanguageCodesAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getLanguageFilterAccess().getGroup_2_1()); }
		(rule__LanguageFilter__Group_2_1__0)
		{ after(grammarAccess.getLanguageFilterAccess().getGroup_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeFilter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeFilterAccess().getTypeIdFilterParserRuleCall_0()); }
		ruleTypeIdFilter
		{ after(grammarAccess.getTypeFilterAccess().getTypeIdFilterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeFilterAccess().getTypeTokenFilterParserRuleCall_1()); }
		ruleTypeTokenFilter
		{ after(grammarAccess.getTypeFilterAccess().getTypeTokenFilterParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__TypeAlternatives_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeIdFilterAccess().getTypeEclConceptReferenceParserRuleCall_2_0_0()); }
		ruleEclConceptReference
		{ after(grammarAccess.getTypeIdFilterAccess().getTypeEclConceptReferenceParserRuleCall_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeIdFilterAccess().getTypeEclConceptReferenceSetParserRuleCall_2_0_1()); }
		ruleEclConceptReferenceSet
		{ after(grammarAccess.getTypeIdFilterAccess().getTypeEclConceptReferenceSetParserRuleCall_2_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_0()); }
		(rule__TypeTokenFilter__TokensAssignment_2_0)
		{ after(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getGroup_2_1()); }
		(rule__TypeTokenFilter__Group_2_1__0)
		{ after(grammarAccess.getTypeTokenFilterAccess().getGroup_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectFilter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectFilterAccess().getDialectIdFilterParserRuleCall_0()); }
		ruleDialectIdFilter
		{ after(grammarAccess.getDialectFilterAccess().getDialectIdFilterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDialectFilterAccess().getDialectAliasFilterParserRuleCall_1()); }
		ruleDialectAliasFilter
		{ after(grammarAccess.getDialectFilterAccess().getDialectAliasFilterParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_0()); }
		(rule__DialectIdFilter__DialectsAssignment_2_0)
		{ after(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getGroup_2_1()); }
		(rule__DialectIdFilter__Group_2_1__0)
		{ after(grammarAccess.getDialectIdFilterAccess().getGroup_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_0()); }
		(rule__DialectAliasFilter__DialectsAssignment_2_0)
		{ after(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getGroup_2_1()); }
		(rule__DialectAliasFilter__Group_2_1__0)
		{ after(grammarAccess.getDialectAliasFilterAccess().getGroup_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Acceptability__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAcceptabilityAccess().getAcceptabilityIdSetParserRuleCall_0()); }
		ruleAcceptabilityIdSet
		{ after(grammarAccess.getAcceptabilityAccess().getAcceptabilityIdSetParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAcceptabilityAccess().getAcceptabilityTokenSetParserRuleCall_1()); }
		ruleAcceptabilityTokenSet
		{ after(grammarAccess.getAcceptabilityAccess().getAcceptabilityTokenSetParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_ZEROTerminalRuleCall_1()); }
		RULE_DIGIT_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_ZEROTerminalRuleCall_1()); }
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
		{ before(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_ZEROTerminalRuleCall_1()); }
		RULE_DIGIT_ZERO
		{ after(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_ZEROTerminalRuleCall_1()); }
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
		{ before(grammarAccess.getNonNegativeDecimalAccess().getDIGIT_ZEROTerminalRuleCall_2_1()); }
		RULE_DIGIT_ZERO
		{ after(grammarAccess.getNonNegativeDecimalAccess().getDIGIT_ZEROTerminalRuleCall_2_1()); }
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

rule__Boolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanAccess().getTRUE_KEYWORDTerminalRuleCall_0()); }
		RULE_TRUE_KEYWORD
		{ after(grammarAccess.getBooleanAccess().getTRUE_KEYWORDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanAccess().getFALSE_KEYWORDTerminalRuleCall_1()); }
		RULE_FALSE_KEYWORD
		{ after(grammarAccess.getBooleanAccess().getFALSE_KEYWORDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnquotedString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnquotedStringAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0()); }
		RULE_CASE_SIGNIFICANCE_ID_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_1()); }
		RULE_LANGUAGE_REFSET_ID_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_2()); }
		RULE_EFFECTIVE_TIME_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_3()); }
		RULE_ACCEPTABLE_IN_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getDESCRIPTION_KEYWORDTerminalRuleCall_4()); }
		RULE_DESCRIPTION_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getDESCRIPTION_KEYWORDTerminalRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_5()); }
		RULE_PREFERRED_IN_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_6()); }
		RULE_SEMANTIC_TAG_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getDIALECTID_KEYWORDTerminalRuleCall_7()); }
		RULE_DIALECTID_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getDIALECTID_KEYWORDTerminalRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getLANGUAGE_KEYWORDTerminalRuleCall_8()); }
		RULE_LANGUAGE_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getLANGUAGE_KEYWORDTerminalRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getMODULEID_KEYWORDTerminalRuleCall_9()); }
		RULE_MODULEID_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getMODULEID_KEYWORDTerminalRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getCONCEPT_KEYWORDTerminalRuleCall_10()); }
		RULE_CONCEPT_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getCONCEPT_KEYWORDTerminalRuleCall_10()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getDIALECT_KEYWORDTerminalRuleCall_11()); }
		RULE_DIALECT_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getDIALECT_KEYWORDTerminalRuleCall_11()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getACTIVE_KEYWORDTerminalRuleCall_12()); }
		RULE_ACTIVE_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getACTIVE_KEYWORDTerminalRuleCall_12()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getTYPEID_KEYWORDTerminalRuleCall_13()); }
		RULE_TYPEID_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getTYPEID_KEYWORDTerminalRuleCall_13()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getEXCLUSION_KEYWORDTerminalRuleCall_14()); }
		RULE_EXCLUSION_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getEXCLUSION_KEYWORDTerminalRuleCall_14()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getEXACT_KEYWORDTerminalRuleCall_15()); }
		RULE_EXACT_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getEXACT_KEYWORDTerminalRuleCall_15()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getFALSE_KEYWORDTerminalRuleCall_16()); }
		RULE_FALSE_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getFALSE_KEYWORDTerminalRuleCall_16()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getMATCH_KEYWORDTerminalRuleCall_17()); }
		RULE_MATCH_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getMATCH_KEYWORDTerminalRuleCall_17()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getREGEX_KEYWORDTerminalRuleCall_18()); }
		RULE_REGEX_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getREGEX_KEYWORDTerminalRuleCall_18()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getTERM_KEYWORDTerminalRuleCall_19()); }
		RULE_TERM_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getTERM_KEYWORDTerminalRuleCall_19()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getTRUE_KEYWORDTerminalRuleCall_20()); }
		RULE_TRUE_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getTRUE_KEYWORDTerminalRuleCall_20()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getTYPE_KEYWORDTerminalRuleCall_21()); }
		RULE_TYPE_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getTYPE_KEYWORDTerminalRuleCall_21()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getWILD_KEYWORDTerminalRuleCall_22()); }
		RULE_WILD_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getWILD_KEYWORDTerminalRuleCall_22()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_23()); }
		RULE_CONJUNCTION_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_23()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_24()); }
		RULE_DISJUNCTION_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_24()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getREVERSEDTerminalRuleCall_25()); }
		RULE_REVERSED
		{ after(grammarAccess.getUnquotedStringAccess().getREVERSEDTerminalRuleCall_25()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getKEYWORDTerminalRuleCall_26()); }
		RULE_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getKEYWORDTerminalRuleCall_26()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasValueAccess().getDASHTerminalRuleCall_0()); }
		RULE_DASH
		{ after(grammarAccess.getDialectAliasValueAccess().getDASHTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDialectAliasValueAccess().getUnquotedStringParserRuleCall_1()); }
		ruleUnquotedString
		{ after(grammarAccess.getDialectAliasValueAccess().getUnquotedStringParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getDialectAliasValueAccess().getDIGIT_ZEROTerminalRuleCall_2()); }
		RULE_DIGIT_ZERO
		{ after(grammarAccess.getDialectAliasValueAccess().getDIGIT_ZEROTerminalRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getDialectAliasValueAccess().getDIGIT_NONZEROTerminalRuleCall_3()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getDialectAliasValueAccess().getDIGIT_NONZEROTerminalRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LEXICAL_SEARCH_TYPE__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getMATCH_KEYWORDTerminalRuleCall_0()); }
		RULE_MATCH_KEYWORD
		{ after(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getMATCH_KEYWORDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getWILD_KEYWORDTerminalRuleCall_1()); }
		RULE_WILD_KEYWORD
		{ after(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getWILD_KEYWORDTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getREGEX_KEYWORDTerminalRuleCall_2()); }
		RULE_REGEX_KEYWORD
		{ after(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getREGEX_KEYWORDTerminalRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getEXACT_KEYWORDTerminalRuleCall_3()); }
		RULE_EXACT_KEYWORD
		{ after(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getEXACT_KEYWORDTerminalRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DOMAIN__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDOMAINAccess().getCONCEPT_KEYWORDTerminalRuleCall_0()); }
		RULE_CONCEPT_KEYWORD
		{ after(grammarAccess.getDOMAINAccess().getCONCEPT_KEYWORDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDOMAINAccess().getDESCRIPTION_KEYWORDTerminalRuleCall_1()); }
		RULE_DESCRIPTION_KEYWORD
		{ after(grammarAccess.getDOMAINAccess().getDESCRIPTION_KEYWORDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NON_NUMERIC_OPERATOR__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNON_NUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getNON_NUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNON_NUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getNON_NUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NUMERIC_OPERATOR__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getNUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getNUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getNUMERIC_OPERATORAccess().getGTTerminalRuleCall_2()); }
		RULE_GT
		{ after(grammarAccess.getNUMERIC_OPERATORAccess().getGTTerminalRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getNUMERIC_OPERATORAccess().getLTTerminalRuleCall_3()); }
		RULE_LT
		{ after(grammarAccess.getNUMERIC_OPERATORAccess().getLTTerminalRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getNUMERIC_OPERATORAccess().getGTETerminalRuleCall_4()); }
		RULE_GTE
		{ after(grammarAccess.getNUMERIC_OPERATORAccess().getGTETerminalRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getNUMERIC_OPERATORAccess().getLTETerminalRuleCall_5()); }
		RULE_LTE
		{ after(grammarAccess.getNUMERIC_OPERATORAccess().getLTETerminalRuleCall_5()); }
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
	{ before(grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION_KEYWORD
	{ after(grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1()); }
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
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSION_KEYWORDTerminalRuleCall_1_1()); }
	RULE_EXCLUSION_KEYWORD
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSION_KEYWORDTerminalRuleCall_1_1()); }
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
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getFilteredExpressionConstraintParserRuleCall_0()); }
	ruleFilteredExpressionConstraint
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getFilteredExpressionConstraintParserRuleCall_0()); }
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


rule__FilteredExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilteredExpressionConstraint__Group__0__Impl
	rule__FilteredExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FilteredExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilteredExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0()); }
	ruleSubExpressionConstraint
	{ after(grammarAccess.getFilteredExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilteredExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilteredExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FilteredExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilteredExpressionConstraintAccess().getGroup_1()); }
	(rule__FilteredExpressionConstraint__Group_1__0)*
	{ after(grammarAccess.getFilteredExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FilteredExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilteredExpressionConstraint__Group_1__0__Impl
	rule__FilteredExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FilteredExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilteredExpressionConstraintAccess().getFilteredExpressionConstraintConstraintAction_1_0()); }
	()
	{ after(grammarAccess.getFilteredExpressionConstraintAccess().getFilteredExpressionConstraintConstraintAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilteredExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilteredExpressionConstraint__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FilteredExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilteredExpressionConstraintAccess().getFilterAssignment_1_1()); }
	(rule__FilteredExpressionConstraint__FilterAssignment_1_1)
	{ after(grammarAccess.getFilteredExpressionConstraintAccess().getFilterAssignment_1_1()); }
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


rule__EclConceptReferenceSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclConceptReferenceSet__Group__0__Impl
	rule__EclConceptReferenceSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclConceptReferenceSetAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getEclConceptReferenceSetAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclConceptReferenceSet__Group__1__Impl
	rule__EclConceptReferenceSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getEclConceptReferenceSetAccess().getConceptsAssignment_1()); }
		(rule__EclConceptReferenceSet__ConceptsAssignment_1)
		{ after(grammarAccess.getEclConceptReferenceSetAccess().getConceptsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getEclConceptReferenceSetAccess().getConceptsAssignment_1()); }
		(rule__EclConceptReferenceSet__ConceptsAssignment_1)*
		{ after(grammarAccess.getEclConceptReferenceSetAccess().getConceptsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclConceptReferenceSet__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclConceptReferenceSetAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getEclConceptReferenceSetAccess().getROUND_CLOSETerminalRuleCall_2()); }
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
	{ before(grammarAccess.getOrRefinementAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_0_1()); }
	RULE_DISJUNCTION_KEYWORD
	{ after(grammarAccess.getOrRefinementAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_0_1()); }
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
	{ before(grammarAccess.getOrAttributeSetAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION_KEYWORD
	{ after(grammarAccess.getOrAttributeSetAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1()); }
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
	(rule__AttributeConstraint__ComparisonAssignment_3)?
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


rule__AttributeComparison__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeComparison__Group__0__Impl
	rule__AttributeComparison__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeComparison__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeComparisonAccess().getOpAssignment_0()); }
	(rule__AttributeComparison__OpAssignment_0)
	{ after(grammarAccess.getAttributeComparisonAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeComparison__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeComparison__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeComparison__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeComparisonAccess().getValueAssignment_1()); }
	(rule__AttributeComparison__ValueAssignment_1)
	{ after(grammarAccess.getAttributeComparisonAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BooleanValueComparison__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanValueComparison__Group__0__Impl
	rule__BooleanValueComparison__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueComparison__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanValueComparisonAccess().getOpAssignment_0()); }
	(rule__BooleanValueComparison__OpAssignment_0)
	{ after(grammarAccess.getBooleanValueComparisonAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueComparison__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanValueComparison__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueComparison__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanValueComparisonAccess().getValueAssignment_1()); }
	(rule__BooleanValueComparison__ValueAssignment_1)
	{ after(grammarAccess.getBooleanValueComparisonAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringValueComparison__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringValueComparison__Group__0__Impl
	rule__StringValueComparison__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueComparison__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringValueComparisonAccess().getOpAssignment_0()); }
	(rule__StringValueComparison__OpAssignment_0)
	{ after(grammarAccess.getStringValueComparisonAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueComparison__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringValueComparison__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueComparison__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringValueComparisonAccess().getValueAssignment_1()); }
	(rule__StringValueComparison__ValueAssignment_1)
	{ after(grammarAccess.getStringValueComparisonAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValueComparison__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueComparison__Group__0__Impl
	rule__IntegerValueComparison__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueComparisonAccess().getOpAssignment_0()); }
	(rule__IntegerValueComparison__OpAssignment_0)
	{ after(grammarAccess.getIntegerValueComparisonAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueComparison__Group__1__Impl
	rule__IntegerValueComparison__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueComparisonAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueComparisonAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueComparison__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueComparisonAccess().getValueAssignment_2()); }
	(rule__IntegerValueComparison__ValueAssignment_2)
	{ after(grammarAccess.getIntegerValueComparisonAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValueComparison__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueComparison__Group__0__Impl
	rule__DecimalValueComparison__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueComparisonAccess().getOpAssignment_0()); }
	(rule__DecimalValueComparison__OpAssignment_0)
	{ after(grammarAccess.getDecimalValueComparisonAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueComparison__Group__1__Impl
	rule__DecimalValueComparison__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueComparisonAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueComparisonAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueComparison__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueComparisonAccess().getValueAssignment_2()); }
	(rule__DecimalValueComparison__ValueAssignment_2)
	{ after(grammarAccess.getDecimalValueComparisonAccess().getValueAssignment_2()); }
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


rule__FilterConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilterConstraint__Group__0__Impl
	rule__FilterConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0()); }
	RULE_DOUBLE_CURLY_OPEN
	{ after(grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilterConstraint__Group__1__Impl
	rule__FilterConstraint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilterConstraintAccess().getFilterParserRuleCall_1()); }
	ruleFilter
	{ after(grammarAccess.getFilterConstraintAccess().getFilterParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterConstraint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilterConstraint__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterConstraint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_2()); }
	RULE_DOUBLE_CURLY_CLOSE
	{ after(grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DisjunctionFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group__0__Impl
	rule__DisjunctionFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getConjunctionFilterParserRuleCall_0()); }
	ruleConjunctionFilter
	{ after(grammarAccess.getDisjunctionFilterAccess().getConjunctionFilterParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getGroup_1()); }
	(rule__DisjunctionFilter__Group_1__0)*
	{ after(grammarAccess.getDisjunctionFilterAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DisjunctionFilter__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group_1__0__Impl
	rule__DisjunctionFilter__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getDisjunctionFilterLeftAction_1_0()); }
	()
	{ after(grammarAccess.getDisjunctionFilterAccess().getDisjunctionFilterLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group_1__1__Impl
	rule__DisjunctionFilter__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION_KEYWORD
	{ after(grammarAccess.getDisjunctionFilterAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getRightAssignment_1_2()); }
	(rule__DisjunctionFilter__RightAssignment_1_2)
	{ after(grammarAccess.getDisjunctionFilterAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConjunctionFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group__0__Impl
	rule__ConjunctionFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getPropertyFilterParserRuleCall_0()); }
	rulePropertyFilter
	{ after(grammarAccess.getConjunctionFilterAccess().getPropertyFilterParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getGroup_1()); }
	(rule__ConjunctionFilter__Group_1__0)*
	{ after(grammarAccess.getConjunctionFilterAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConjunctionFilter__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group_1__0__Impl
	rule__ConjunctionFilter__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getConjunctionFilterLeftAction_1_0()); }
	()
	{ after(grammarAccess.getConjunctionFilterAccess().getConjunctionFilterLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group_1__1__Impl
	rule__ConjunctionFilter__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getAlternatives_1_1()); }
	(rule__ConjunctionFilter__Alternatives_1_1)
	{ after(grammarAccess.getConjunctionFilterAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getRightAssignment_1_2()); }
	(rule__ConjunctionFilter__RightAssignment_1_2)
	{ after(grammarAccess.getConjunctionFilterAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFilter__Group__0__Impl
	rule__NestedFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFilter__Group__1__Impl
	rule__NestedFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFilterAccess().getNestedAssignment_1()); }
	(rule__NestedFilter__NestedAssignment_1)
	{ after(grammarAccess.getNestedFilterAccess().getNestedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFilterAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getNestedFilterAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TermFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TermFilter__Group__0__Impl
	rule__TermFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermFilterAccess().getTERM_KEYWORDTerminalRuleCall_0()); }
	RULE_TERM_KEYWORD
	{ after(grammarAccess.getTermFilterAccess().getTERM_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TermFilter__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermFilterAccess().getAlternatives_1()); }
	(rule__TermFilter__Alternatives_1)
	{ after(grammarAccess.getTermFilterAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypedTermFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilter__Group__0__Impl
	rule__TypedTermFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterAccess().getOpAssignment_0()); }
	(rule__TypedTermFilter__OpAssignment_0)
	{ after(grammarAccess.getTypedTermFilterAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilter__Group__1__Impl
	rule__TypedTermFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterAccess().getGroup_1()); }
	(rule__TypedTermFilter__Group_1__0)?
	{ after(grammarAccess.getTypedTermFilterAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterAccess().getTermAssignment_2()); }
	(rule__TypedTermFilter__TermAssignment_2)
	{ after(grammarAccess.getTypedTermFilterAccess().getTermAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypedTermFilter__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilter__Group_1__0__Impl
	rule__TypedTermFilter__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterAccess().getLexicalSearchTypeAssignment_1_0()); }
	(rule__TypedTermFilter__LexicalSearchTypeAssignment_1_0)
	{ after(grammarAccess.getTypedTermFilterAccess().getLexicalSearchTypeAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilter__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterAccess().getCOLONTerminalRuleCall_1_1()); }
	RULE_COLON
	{ after(grammarAccess.getTypedTermFilterAccess().getCOLONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypedTermFilterSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilterSet__Group__0__Impl
	rule__TypedTermFilterSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterSetAccess().getOpAssignment_0()); }
	(rule__TypedTermFilterSet__OpAssignment_0)
	{ after(grammarAccess.getTypedTermFilterSetAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilterSet__Group__1__Impl
	rule__TypedTermFilterSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterSetAccess().getROUND_OPENTerminalRuleCall_1()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getTypedTermFilterSetAccess().getROUND_OPENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilterSet__Group__2__Impl
	rule__TypedTermFilterSet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTypedTermFilterSetAccess().getTermsAssignment_2()); }
		(rule__TypedTermFilterSet__TermsAssignment_2)
		{ after(grammarAccess.getTypedTermFilterSetAccess().getTermsAssignment_2()); }
	)
	(
		{ before(grammarAccess.getTypedTermFilterSetAccess().getTermsAssignment_2()); }
		(rule__TypedTermFilterSet__TermsAssignment_2)*
		{ after(grammarAccess.getTypedTermFilterSetAccess().getTermsAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilterSet__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterSetAccess().getROUND_CLOSETerminalRuleCall_3()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getTypedTermFilterSetAccess().getROUND_CLOSETerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LanguageFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageFilter__Group__0__Impl
	rule__LanguageFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageFilterAccess().getLANGUAGE_KEYWORDTerminalRuleCall_0()); }
	RULE_LANGUAGE_KEYWORD
	{ after(grammarAccess.getLanguageFilterAccess().getLANGUAGE_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageFilter__Group__1__Impl
	rule__LanguageFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageFilterAccess().getOpAssignment_1()); }
	(rule__LanguageFilter__OpAssignment_1)
	{ after(grammarAccess.getLanguageFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageFilterAccess().getAlternatives_2()); }
	(rule__LanguageFilter__Alternatives_2)
	{ after(grammarAccess.getLanguageFilterAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LanguageFilter__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageFilter__Group_2_1__0__Impl
	rule__LanguageFilter__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getLanguageFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageFilter__Group_2_1__1__Impl
	rule__LanguageFilter__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getLanguageFilterAccess().getLanguageCodesAssignment_2_1_1()); }
		(rule__LanguageFilter__LanguageCodesAssignment_2_1_1)
		{ after(grammarAccess.getLanguageFilterAccess().getLanguageCodesAssignment_2_1_1()); }
	)
	(
		{ before(grammarAccess.getLanguageFilterAccess().getLanguageCodesAssignment_2_1_1()); }
		(rule__LanguageFilter__LanguageCodesAssignment_2_1_1)*
		{ after(grammarAccess.getLanguageFilterAccess().getLanguageCodesAssignment_2_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageFilter__Group_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getLanguageFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeIdFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeIdFilter__Group__0__Impl
	rule__TypeIdFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeIdFilterAccess().getTYPEID_KEYWORDTerminalRuleCall_0()); }
	RULE_TYPEID_KEYWORD
	{ after(grammarAccess.getTypeIdFilterAccess().getTYPEID_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeIdFilter__Group__1__Impl
	rule__TypeIdFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeIdFilterAccess().getOpAssignment_1()); }
	(rule__TypeIdFilter__OpAssignment_1)
	{ after(grammarAccess.getTypeIdFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeIdFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeIdFilterAccess().getTypeAssignment_2()); }
	(rule__TypeIdFilter__TypeAssignment_2)
	{ after(grammarAccess.getTypeIdFilterAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeTokenFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTokenFilter__Group__0__Impl
	rule__TypeTokenFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTokenFilterAccess().getTYPE_KEYWORDTerminalRuleCall_0()); }
	RULE_TYPE_KEYWORD
	{ after(grammarAccess.getTypeTokenFilterAccess().getTYPE_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTokenFilter__Group__1__Impl
	rule__TypeTokenFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTokenFilterAccess().getOpAssignment_1()); }
	(rule__TypeTokenFilter__OpAssignment_1)
	{ after(grammarAccess.getTypeTokenFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTokenFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTokenFilterAccess().getAlternatives_2()); }
	(rule__TypeTokenFilter__Alternatives_2)
	{ after(grammarAccess.getTypeTokenFilterAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeTokenFilter__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTokenFilter__Group_2_1__0__Impl
	rule__TypeTokenFilter__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getTypeTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTokenFilter__Group_2_1__1__Impl
	rule__TypeTokenFilter__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_1_1()); }
		(rule__TypeTokenFilter__TokensAssignment_2_1_1)
		{ after(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_1_1()); }
	)
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_1_1()); }
		(rule__TypeTokenFilter__TokensAssignment_2_1_1)*
		{ after(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTokenFilter__Group_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getTypeTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DialectIdFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectIdFilter__Group__0__Impl
	rule__DialectIdFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectIdFilterAccess().getDIALECTID_KEYWORDTerminalRuleCall_0()); }
	RULE_DIALECTID_KEYWORD
	{ after(grammarAccess.getDialectIdFilterAccess().getDIALECTID_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectIdFilter__Group__1__Impl
	rule__DialectIdFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectIdFilterAccess().getOpAssignment_1()); }
	(rule__DialectIdFilter__OpAssignment_1)
	{ after(grammarAccess.getDialectIdFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectIdFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectIdFilterAccess().getAlternatives_2()); }
	(rule__DialectIdFilter__Alternatives_2)
	{ after(grammarAccess.getDialectIdFilterAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DialectIdFilter__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectIdFilter__Group_2_1__0__Impl
	rule__DialectIdFilter__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectIdFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getDialectIdFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectIdFilter__Group_2_1__1__Impl
	rule__DialectIdFilter__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_1_1()); }
		(rule__DialectIdFilter__DialectsAssignment_2_1_1)
		{ after(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_1_1()); }
	)
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_1_1()); }
		(rule__DialectIdFilter__DialectsAssignment_2_1_1)*
		{ after(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectIdFilter__Group_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectIdFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getDialectIdFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DialectAliasFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasFilter__Group__0__Impl
	rule__DialectAliasFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasFilterAccess().getDIALECT_KEYWORDTerminalRuleCall_0()); }
	RULE_DIALECT_KEYWORD
	{ after(grammarAccess.getDialectAliasFilterAccess().getDIALECT_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasFilter__Group__1__Impl
	rule__DialectAliasFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasFilterAccess().getOpAssignment_1()); }
	(rule__DialectAliasFilter__OpAssignment_1)
	{ after(grammarAccess.getDialectAliasFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasFilterAccess().getAlternatives_2()); }
	(rule__DialectAliasFilter__Alternatives_2)
	{ after(grammarAccess.getDialectAliasFilterAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DialectAliasFilter__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasFilter__Group_2_1__0__Impl
	rule__DialectAliasFilter__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getDialectAliasFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasFilter__Group_2_1__1__Impl
	rule__DialectAliasFilter__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_1_1()); }
		(rule__DialectAliasFilter__DialectsAssignment_2_1_1)
		{ after(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_1_1()); }
	)
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_1_1()); }
		(rule__DialectAliasFilter__DialectsAssignment_2_1_1)*
		{ after(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasFilter__Group_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getDialectAliasFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Dialect__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dialect__Group__0__Impl
	rule__Dialect__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Dialect__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAccess().getLanguageRefSetIdAssignment_0()); }
	(rule__Dialect__LanguageRefSetIdAssignment_0)
	{ after(grammarAccess.getDialectAccess().getLanguageRefSetIdAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dialect__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dialect__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Dialect__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAccess().getAcceptabilityAssignment_1()); }
	(rule__Dialect__AcceptabilityAssignment_1)?
	{ after(grammarAccess.getDialectAccess().getAcceptabilityAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DialectAlias__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAlias__Group__0__Impl
	rule__DialectAlias__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAlias__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasAccess().getAliasAssignment_0()); }
	(rule__DialectAlias__AliasAssignment_0)
	{ after(grammarAccess.getDialectAliasAccess().getAliasAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAlias__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAlias__Group__1__Impl
	rule__DialectAlias__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAlias__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasAccess().getWSTerminalRuleCall_1()); }
	(RULE_WS)*
	{ after(grammarAccess.getDialectAliasAccess().getWSTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAlias__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAlias__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAlias__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasAccess().getAcceptabilityAssignment_2()); }
	(rule__DialectAlias__AcceptabilityAssignment_2)?
	{ after(grammarAccess.getDialectAliasAccess().getAcceptabilityAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AcceptabilityTokenSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptabilityTokenSet__Group__0__Impl
	rule__AcceptabilityTokenSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptabilityTokenSetAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getAcceptabilityTokenSetAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptabilityTokenSet__Group__1__Impl
	rule__AcceptabilityTokenSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAssignment_1()); }
		(rule__AcceptabilityTokenSet__AcceptabilitiesAssignment_1)
		{ after(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAssignment_1()); }
	)
	(
		{ before(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAssignment_1()); }
		(rule__AcceptabilityTokenSet__AcceptabilitiesAssignment_1)*
		{ after(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptabilityTokenSet__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptabilityTokenSetAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getAcceptabilityTokenSetAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActiveFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group__0__Impl
	rule__ActiveFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getGroup_0()); }
	(rule__ActiveFilter__Group_0__0)?
	{ after(grammarAccess.getActiveFilterAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group__1__Impl
	rule__ActiveFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getACTIVE_KEYWORDTerminalRuleCall_1()); }
	RULE_ACTIVE_KEYWORD
	{ after(grammarAccess.getActiveFilterAccess().getACTIVE_KEYWORDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group__2__Impl
	rule__ActiveFilter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getEQUALTerminalRuleCall_2()); }
	RULE_EQUAL
	{ after(grammarAccess.getActiveFilterAccess().getEQUALTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getActiveAssignment_3()); }
	(rule__ActiveFilter__ActiveAssignment_3)
	{ after(grammarAccess.getActiveFilterAccess().getActiveAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActiveFilter__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group_0__0__Impl
	rule__ActiveFilter__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getDomainAssignment_0_0()); }
	(rule__ActiveFilter__DomainAssignment_0_0)
	{ after(grammarAccess.getActiveFilterAccess().getDomainAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getDOTTerminalRuleCall_0_1()); }
	RULE_DOT
	{ after(grammarAccess.getActiveFilterAccess().getDOTTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModuleFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group__0__Impl
	rule__ModuleFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getGroup_0()); }
	(rule__ModuleFilter__Group_0__0)?
	{ after(grammarAccess.getModuleFilterAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group__1__Impl
	rule__ModuleFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getMODULEID_KEYWORDTerminalRuleCall_1()); }
	RULE_MODULEID_KEYWORD
	{ after(grammarAccess.getModuleFilterAccess().getMODULEID_KEYWORDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group__2__Impl
	rule__ModuleFilter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getEQUALTerminalRuleCall_2()); }
	RULE_EQUAL
	{ after(grammarAccess.getModuleFilterAccess().getEQUALTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getModuleIdAssignment_3()); }
	(rule__ModuleFilter__ModuleIdAssignment_3)
	{ after(grammarAccess.getModuleFilterAccess().getModuleIdAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModuleFilter__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group_0__0__Impl
	rule__ModuleFilter__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getDomainAssignment_0_0()); }
	(rule__ModuleFilter__DomainAssignment_0_0)
	{ after(grammarAccess.getModuleFilterAccess().getDomainAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getDOTTerminalRuleCall_0_1()); }
	RULE_DOT
	{ after(grammarAccess.getModuleFilterAccess().getDOTTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SemanticTagFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SemanticTagFilter__Group__0__Impl
	rule__SemanticTagFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSemanticTagFilterAccess().getGroup_0()); }
	(rule__SemanticTagFilter__Group_0__0)?
	{ after(grammarAccess.getSemanticTagFilterAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SemanticTagFilter__Group__1__Impl
	rule__SemanticTagFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSemanticTagFilterAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_1()); }
	RULE_SEMANTIC_TAG_KEYWORD
	{ after(grammarAccess.getSemanticTagFilterAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SemanticTagFilter__Group__2__Impl
	rule__SemanticTagFilter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSemanticTagFilterAccess().getOpAssignment_2()); }
	(rule__SemanticTagFilter__OpAssignment_2)
	{ after(grammarAccess.getSemanticTagFilterAccess().getOpAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SemanticTagFilter__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSemanticTagFilterAccess().getSemanticTagAssignment_3()); }
	(rule__SemanticTagFilter__SemanticTagAssignment_3)
	{ after(grammarAccess.getSemanticTagFilterAccess().getSemanticTagAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SemanticTagFilter__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SemanticTagFilter__Group_0__0__Impl
	rule__SemanticTagFilter__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSemanticTagFilterAccess().getDomainAssignment_0_0()); }
	(rule__SemanticTagFilter__DomainAssignment_0_0)
	{ after(grammarAccess.getSemanticTagFilterAccess().getDomainAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SemanticTagFilter__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSemanticTagFilterAccess().getDOTTerminalRuleCall_0_1()); }
	RULE_DOT
	{ after(grammarAccess.getSemanticTagFilterAccess().getDOTTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EffectiveTimeFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EffectiveTimeFilter__Group__0__Impl
	rule__EffectiveTimeFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEffectiveTimeFilterAccess().getGroup_0()); }
	(rule__EffectiveTimeFilter__Group_0__0)?
	{ after(grammarAccess.getEffectiveTimeFilterAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EffectiveTimeFilter__Group__1__Impl
	rule__EffectiveTimeFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEffectiveTimeFilterAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_1()); }
	RULE_EFFECTIVE_TIME_KEYWORD
	{ after(grammarAccess.getEffectiveTimeFilterAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EffectiveTimeFilter__Group__2__Impl
	rule__EffectiveTimeFilter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEffectiveTimeFilterAccess().getOpAssignment_2()); }
	(rule__EffectiveTimeFilter__OpAssignment_2)
	{ after(grammarAccess.getEffectiveTimeFilterAccess().getOpAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EffectiveTimeFilter__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEffectiveTimeFilterAccess().getEffectiveTimeAssignment_3()); }
	(rule__EffectiveTimeFilter__EffectiveTimeAssignment_3)
	{ after(grammarAccess.getEffectiveTimeFilterAccess().getEffectiveTimeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EffectiveTimeFilter__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EffectiveTimeFilter__Group_0__0__Impl
	rule__EffectiveTimeFilter__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEffectiveTimeFilterAccess().getDomainAssignment_0_0()); }
	(rule__EffectiveTimeFilter__DomainAssignment_0_0)
	{ after(grammarAccess.getEffectiveTimeFilterAccess().getDomainAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EffectiveTimeFilter__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEffectiveTimeFilterAccess().getDOTTerminalRuleCall_0_1()); }
	RULE_DOT
	{ after(grammarAccess.getEffectiveTimeFilterAccess().getDOTTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PreferredInFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PreferredInFilter__Group__0__Impl
	rule__PreferredInFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPreferredInFilterAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_0()); }
	RULE_PREFERRED_IN_KEYWORD
	{ after(grammarAccess.getPreferredInFilterAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PreferredInFilter__Group__1__Impl
	rule__PreferredInFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPreferredInFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getPreferredInFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PreferredInFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdAssignment_2()); }
	(rule__PreferredInFilter__LanguageRefSetIdAssignment_2)
	{ after(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AcceptableInFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptableInFilter__Group__0__Impl
	rule__AcceptableInFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptableInFilterAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_0()); }
	RULE_ACCEPTABLE_IN_KEYWORD
	{ after(grammarAccess.getAcceptableInFilterAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptableInFilter__Group__1__Impl
	rule__AcceptableInFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptableInFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getAcceptableInFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptableInFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdAssignment_2()); }
	(rule__AcceptableInFilter__LanguageRefSetIdAssignment_2)
	{ after(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LanguageRefSetFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageRefSetFilter__Group__0__Impl
	rule__LanguageRefSetFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageRefSetFilterAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0()); }
	RULE_LANGUAGE_REFSET_ID_KEYWORD
	{ after(grammarAccess.getLanguageRefSetFilterAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageRefSetFilter__Group__1__Impl
	rule__LanguageRefSetFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageRefSetFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getLanguageRefSetFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageRefSetFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdAssignment_2()); }
	(rule__LanguageRefSetFilter__LanguageRefSetIdAssignment_2)
	{ after(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CaseSignificanceFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseSignificanceFilter__Group__0__Impl
	rule__CaseSignificanceFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseSignificanceFilterAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0()); }
	RULE_CASE_SIGNIFICANCE_ID_KEYWORD
	{ after(grammarAccess.getCaseSignificanceFilterAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseSignificanceFilter__Group__1__Impl
	rule__CaseSignificanceFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseSignificanceFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getCaseSignificanceFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseSignificanceFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdAssignment_2()); }
	(rule__CaseSignificanceFilter__CaseSignificanceIdAssignment_2)
	{ after(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdAssignment_2()); }
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
		{ before(grammarAccess.getConceptReferenceAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_1_1_0()); }
		RULE_PIPE_DELIMITED_STRING
		{ after(grammarAccess.getConceptReferenceAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_1_1_0()); }
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
		{ before(grammarAccess.getDottedExpressionConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_1_2_0()); }
		ruleFilteredExpressionConstraint
		{ after(grammarAccess.getDottedExpressionConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilteredExpressionConstraint__FilterAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFilteredExpressionConstraintAccess().getFilterFilterConstraintParserRuleCall_1_1_0()); }
		ruleFilterConstraint
		{ after(grammarAccess.getFilteredExpressionConstraintAccess().getFilterFilterConstraintParserRuleCall_1_1_0()); }
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
		{ before(grammarAccess.getEclConceptReferenceAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_1_0()); }
		RULE_PIPE_DELIMITED_STRING
		{ after(grammarAccess.getEclConceptReferenceAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__ConceptsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclConceptReferenceSetAccess().getConceptsEclConceptReferenceParserRuleCall_1_0()); }
		ruleEclConceptReference
		{ after(grammarAccess.getEclConceptReferenceSetAccess().getConceptsEclConceptReferenceParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getAttributeConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_2_0()); }
		ruleFilteredExpressionConstraint
		{ after(grammarAccess.getAttributeConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_2_0()); }
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

rule__AttributeComparison__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getAttributeComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeComparison__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeComparisonAccess().getValueFilteredExpressionConstraintParserRuleCall_1_0()); }
		ruleFilteredExpressionConstraint
		{ after(grammarAccess.getAttributeComparisonAccess().getValueFilteredExpressionConstraintParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueComparison__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getBooleanValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueComparison__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanValueComparisonAccess().getValueBooleanParserRuleCall_1_0()); }
		ruleBoolean
		{ after(grammarAccess.getBooleanValueComparisonAccess().getValueBooleanParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueComparison__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getStringValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueComparison__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringValueComparisonAccess().getValueSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringValueComparisonAccess().getValueSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0()); }
		ruleNUMERIC_OPERATOR
		{ after(grammarAccess.getIntegerValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueComparisonAccess().getValueIntegerParserRuleCall_2_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueComparisonAccess().getValueIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0()); }
		ruleNUMERIC_OPERATOR
		{ after(grammarAccess.getDecimalValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueComparisonAccess().getValueDecimalParserRuleCall_2_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueComparisonAccess().getValueDecimalParserRuleCall_2_0()); }
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

rule__DisjunctionFilter__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDisjunctionFilterAccess().getRightConjunctionFilterParserRuleCall_1_2_0()); }
		ruleConjunctionFilter
		{ after(grammarAccess.getDisjunctionFilterAccess().getRightConjunctionFilterParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConjunctionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0()); }
		rulePropertyFilter
		{ after(grammarAccess.getConjunctionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__NestedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedFilterAccess().getNestedFilterParserRuleCall_1_0()); }
		ruleFilter
		{ after(grammarAccess.getNestedFilterAccess().getNestedFilterParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedTermFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getTypedTermFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__LexicalSearchTypeAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedTermFilterAccess().getLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_1_0_0()); }
		ruleLEXICAL_SEARCH_TYPE
		{ after(grammarAccess.getTypedTermFilterAccess().getLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__TermAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedTermFilterAccess().getTermSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getTypedTermFilterAccess().getTermSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedTermFilterSetAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getTypedTermFilterSetAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__TermsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedTermFilterSetAccess().getTermsTypedTermFilterParserRuleCall_2_0()); }
		ruleTypedTermFilter
		{ after(grammarAccess.getTypedTermFilterSetAccess().getTermsTypedTermFilterParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getLanguageFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__LanguageCodesAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_0_0()); }
		ruleUnquotedString
		{ after(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__LanguageCodesAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_1_1_0()); }
		ruleUnquotedString
		{ after(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getTypeIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeIdFilterAccess().getTypeAlternatives_2_0()); }
		(rule__TypeIdFilter__TypeAlternatives_2_0)
		{ after(grammarAccess.getTypeIdFilterAccess().getTypeAlternatives_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getTypeTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__TokensAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_0_0()); }
		ruleUnquotedString
		{ after(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__TokensAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_1_1_0()); }
		ruleUnquotedString
		{ after(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getDialectIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__DialectsAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_0_0()); }
		ruleDialect
		{ after(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__DialectsAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_1_1_0()); }
		ruleDialect
		{ after(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getDialectAliasFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__DialectsAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_0_0()); }
		ruleDialectAlias
		{ after(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__DialectsAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_1_0()); }
		ruleDialectAlias
		{ after(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dialect__LanguageRefSetIdAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAccess().getLanguageRefSetIdEclConceptReferenceParserRuleCall_0_0()); }
		ruleEclConceptReference
		{ after(grammarAccess.getDialectAccess().getLanguageRefSetIdEclConceptReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dialect__AcceptabilityAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAccess().getAcceptabilityAcceptabilityParserRuleCall_1_0()); }
		ruleAcceptability
		{ after(grammarAccess.getDialectAccess().getAcceptabilityAcceptabilityParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAlias__AliasAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasAccess().getAliasDialectAliasValueParserRuleCall_0_0()); }
		ruleDialectAliasValue
		{ after(grammarAccess.getDialectAliasAccess().getAliasDialectAliasValueParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAlias__AcceptabilityAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasAccess().getAcceptabilityAcceptabilityParserRuleCall_2_0()); }
		ruleAcceptability
		{ after(grammarAccess.getDialectAliasAccess().getAcceptabilityAcceptabilityParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityIdSet__AcceptabilitiesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAcceptabilityIdSetAccess().getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0()); }
		ruleEclConceptReferenceSet
		{ after(grammarAccess.getAcceptabilityIdSetAccess().getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__AcceptabilitiesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesUnquotedStringParserRuleCall_1_0()); }
		ruleUnquotedString
		{ after(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesUnquotedStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__DomainAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActiveFilterAccess().getDomainDOMAINParserRuleCall_0_0_0()); }
		ruleDOMAIN
		{ after(grammarAccess.getActiveFilterAccess().getDomainDOMAINParserRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__ActiveAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActiveFilterAccess().getActiveBooleanParserRuleCall_3_0()); }
		ruleBoolean
		{ after(grammarAccess.getActiveFilterAccess().getActiveBooleanParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__DomainAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModuleFilterAccess().getDomainDOMAINParserRuleCall_0_0_0()); }
		ruleDOMAIN
		{ after(grammarAccess.getModuleFilterAccess().getDomainDOMAINParserRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__ModuleIdAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModuleFilterAccess().getModuleIdExpressionConstraintParserRuleCall_3_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getModuleFilterAccess().getModuleIdExpressionConstraintParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__DomainAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSemanticTagFilterAccess().getDomainDOMAINParserRuleCall_0_0_0()); }
		ruleDOMAIN
		{ after(grammarAccess.getSemanticTagFilterAccess().getDomainDOMAINParserRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__OpAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSemanticTagFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_2_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getSemanticTagFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__SemanticTagAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSemanticTagFilterAccess().getSemanticTagSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getSemanticTagFilterAccess().getSemanticTagSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__DomainAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEffectiveTimeFilterAccess().getDomainDOMAINParserRuleCall_0_0_0()); }
		ruleDOMAIN
		{ after(grammarAccess.getEffectiveTimeFilterAccess().getDomainDOMAINParserRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__OpAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEffectiveTimeFilterAccess().getOpNUMERIC_OPERATORParserRuleCall_2_0()); }
		ruleNUMERIC_OPERATOR
		{ after(grammarAccess.getEffectiveTimeFilterAccess().getOpNUMERIC_OPERATORParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__EffectiveTimeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEffectiveTimeFilterAccess().getEffectiveTimeSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getEffectiveTimeFilterAccess().getEffectiveTimeSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__LanguageRefSetIdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__LanguageRefSetIdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__LanguageRefSetIdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__CaseSignificanceIdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdExpressionConstraintParserRuleCall_2_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdExpressionConstraintParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
