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
package com.b2international.snomed.etl.ide.contentassist.antlr;

import com.b2international.snomed.etl.ide.contentassist.antlr.internal.InternalEtlParser;
import com.b2international.snomed.etl.services.EtlGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class EtlParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(EtlGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, EtlGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExpressionTemplateAccess().getAlternatives_1_0(), "rule__ExpressionTemplate__Alternatives_1_0");
			builder.put(grammarAccess.getExpressionTemplateAccess().getAlternatives_1_0_0(), "rule__ExpressionTemplate__Alternatives_1_0_0");
			builder.put(grammarAccess.getRefinementAccess().getAlternatives_0(), "rule__Refinement__Alternatives_0");
			builder.put(grammarAccess.getAttributeValueAccess().getAlternatives(), "rule__AttributeValue__Alternatives");
			builder.put(grammarAccess.getConcreteValueReplacementSlotAccess().getAlternatives(), "rule__ConcreteValueReplacementSlot__Alternatives");
			builder.put(grammarAccess.getConceptReplacementSlotAccess().getAlternatives(), "rule__ConceptReplacementSlot__Alternatives");
			builder.put(grammarAccess.getConceptReferenceAccess().getAlternatives(), "rule__ConceptReference__Alternatives");
			builder.put(grammarAccess.getSlotTokenAccess().getAlternatives(), "rule__SlotToken__Alternatives");
			builder.put(grammarAccess.getSlotIntegerAccess().getAlternatives(), "rule__SlotInteger__Alternatives");
			builder.put(grammarAccess.getSlotIntegerRangeAccess().getAlternatives(), "rule__SlotIntegerRange__Alternatives");
			builder.put(grammarAccess.getSlotDecimalAccess().getAlternatives(), "rule__SlotDecimal__Alternatives");
			builder.put(grammarAccess.getSlotDecimalRangeAccess().getAlternatives(), "rule__SlotDecimalRange__Alternatives");
			builder.put(grammarAccess.getAndExpressionConstraintAccess().getAlternatives_1_1(), "rule__AndExpressionConstraint__Alternatives_1_1");
			builder.put(grammarAccess.getSubExpressionConstraintAccess().getAlternatives(), "rule__SubExpressionConstraint__Alternatives");
			builder.put(grammarAccess.getEclFocusConceptAccess().getAlternatives(), "rule__EclFocusConcept__Alternatives");
			builder.put(grammarAccess.getMemberOfAccess().getConstraintAlternatives_1_0(), "rule__MemberOf__ConstraintAlternatives_1_0");
			builder.put(grammarAccess.getAndRefinementAccess().getAlternatives_1_0_1(), "rule__AndRefinement__Alternatives_1_0_1");
			builder.put(grammarAccess.getSubRefinementAccess().getAlternatives(), "rule__SubRefinement__Alternatives");
			builder.put(grammarAccess.getAndAttributeSetAccess().getAlternatives_1_1(), "rule__AndAttributeSet__Alternatives_1_1");
			builder.put(grammarAccess.getSubAttributeSetAccess().getAlternatives(), "rule__SubAttributeSet__Alternatives");
			builder.put(grammarAccess.getComparisonAccess().getAlternatives(), "rule__Comparison__Alternatives");
			builder.put(grammarAccess.getAttributeComparisonAccess().getAlternatives(), "rule__AttributeComparison__Alternatives");
			builder.put(grammarAccess.getDataTypeComparisonAccess().getAlternatives(), "rule__DataTypeComparison__Alternatives");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1(), "rule__SnomedIdentifier__Alternatives_1");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2(), "rule__SnomedIdentifier__Alternatives_2");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3(), "rule__SnomedIdentifier__Alternatives_3");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4(), "rule__SnomedIdentifier__Alternatives_4");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5(), "rule__SnomedIdentifier__Alternatives_5");
			builder.put(grammarAccess.getNonNegativeIntegerAccess().getAlternatives(), "rule__NonNegativeInteger__Alternatives");
			builder.put(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1(), "rule__NonNegativeInteger__Alternatives_1_1");
			builder.put(grammarAccess.getMaxValueAccess().getAlternatives(), "rule__MaxValue__Alternatives");
			builder.put(grammarAccess.getIntegerAccess().getAlternatives_0(), "rule__Integer__Alternatives_0");
			builder.put(grammarAccess.getDecimalAccess().getAlternatives_0(), "rule__Decimal__Alternatives_0");
			builder.put(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2(), "rule__NonNegativeDecimal__Alternatives_2");
			builder.put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
			builder.put(grammarAccess.getExpressionTemplateAccess().getGroup(), "rule__ExpressionTemplate__Group__0");
			builder.put(grammarAccess.getExpressionTemplateAccess().getGroup_1(), "rule__ExpressionTemplate__Group_1__0");
			builder.put(grammarAccess.getSubExpressionAccess().getGroup(), "rule__SubExpression__Group__0");
			builder.put(grammarAccess.getSubExpressionAccess().getGroup_1(), "rule__SubExpression__Group_1__0");
			builder.put(grammarAccess.getSubExpressionAccess().getGroup_2(), "rule__SubExpression__Group_2__0");
			builder.put(grammarAccess.getFocusConceptAccess().getGroup(), "rule__FocusConcept__Group__0");
			builder.put(grammarAccess.getRefinementAccess().getGroup(), "rule__Refinement__Group__0");
			builder.put(grammarAccess.getRefinementAccess().getGroup_0_0(), "rule__Refinement__Group_0_0__0");
			builder.put(grammarAccess.getRefinementAccess().getGroup_0_0_1(), "rule__Refinement__Group_0_0_1__0");
			builder.put(grammarAccess.getRefinementAccess().getGroup_1(), "rule__Refinement__Group_1__0");
			builder.put(grammarAccess.getAttributeGroupAccess().getGroup(), "rule__AttributeGroup__Group__0");
			builder.put(grammarAccess.getAttributeGroupAccess().getGroup_3(), "rule__AttributeGroup__Group_3__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getAttributeValueAccess().getGroup_1(), "rule__AttributeValue__Group_1__0");
			builder.put(grammarAccess.getConceptIdReplacementSlotAccess().getGroup(), "rule__ConceptIdReplacementSlot__Group__0");
			builder.put(grammarAccess.getConceptIdReplacementSlotAccess().getGroup_4(), "rule__ConceptIdReplacementSlot__Group_4__0");
			builder.put(grammarAccess.getExpressionReplacementSlotAccess().getGroup(), "rule__ExpressionReplacementSlot__Group__0");
			builder.put(grammarAccess.getExpressionReplacementSlotAccess().getGroup_4(), "rule__ExpressionReplacementSlot__Group_4__0");
			builder.put(grammarAccess.getTokenReplacementSlotAccess().getGroup(), "rule__TokenReplacementSlot__Group__0");
			builder.put(grammarAccess.getTokenReplacementSlotAccess().getGroup_4(), "rule__TokenReplacementSlot__Group_4__0");
			builder.put(grammarAccess.getTemplateInformationSlotAccess().getGroup(), "rule__TemplateInformationSlot__Group__0");
			builder.put(grammarAccess.getStringReplacementSlotAccess().getGroup(), "rule__StringReplacementSlot__Group__0");
			builder.put(grammarAccess.getStringReplacementSlotAccess().getGroup_4(), "rule__StringReplacementSlot__Group_4__0");
			builder.put(grammarAccess.getIntegerReplacementSlotAccess().getGroup(), "rule__IntegerReplacementSlot__Group__0");
			builder.put(grammarAccess.getIntegerReplacementSlotAccess().getGroup_4(), "rule__IntegerReplacementSlot__Group_4__0");
			builder.put(grammarAccess.getDecimalReplacementSlotAccess().getGroup(), "rule__DecimalReplacementSlot__Group__0");
			builder.put(grammarAccess.getDecimalReplacementSlotAccess().getGroup_4(), "rule__DecimalReplacementSlot__Group_4__0");
			builder.put(grammarAccess.getEtlCardinalityAccess().getGroup(), "rule__EtlCardinality__Group__0");
			builder.put(grammarAccess.getConceptReferenceAccess().getGroup_1(), "rule__ConceptReference__Group_1__0");
			builder.put(grammarAccess.getIntegerValueAccess().getGroup(), "rule__IntegerValue__Group__0");
			builder.put(grammarAccess.getDecimalValueAccess().getGroup(), "rule__DecimalValue__Group__0");
			builder.put(grammarAccess.getSlotIntegerValueAccess().getGroup(), "rule__SlotIntegerValue__Group__0");
			builder.put(grammarAccess.getSlotIntegerRangeAccess().getGroup_0(), "rule__SlotIntegerRange__Group_0__0");
			builder.put(grammarAccess.getSlotIntegerRangeAccess().getGroup_1(), "rule__SlotIntegerRange__Group_1__0");
			builder.put(grammarAccess.getSlotIntegerMinimumValueAccess().getGroup(), "rule__SlotIntegerMinimumValue__Group__0");
			builder.put(grammarAccess.getSlotIntegerMaximumValueAccess().getGroup(), "rule__SlotIntegerMaximumValue__Group__0");
			builder.put(grammarAccess.getSlotDecimalValueAccess().getGroup(), "rule__SlotDecimalValue__Group__0");
			builder.put(grammarAccess.getSlotDecimalRangeAccess().getGroup_0(), "rule__SlotDecimalRange__Group_0__0");
			builder.put(grammarAccess.getSlotDecimalRangeAccess().getGroup_1(), "rule__SlotDecimalRange__Group_1__0");
			builder.put(grammarAccess.getSlotDecimalMinimumValueAccess().getGroup(), "rule__SlotDecimalMinimumValue__Group__0");
			builder.put(grammarAccess.getSlotDecimalMaximumValueAccess().getGroup(), "rule__SlotDecimalMaximumValue__Group__0");
			builder.put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
			builder.put(grammarAccess.getOrExpressionConstraintAccess().getGroup(), "rule__OrExpressionConstraint__Group__0");
			builder.put(grammarAccess.getOrExpressionConstraintAccess().getGroup_1(), "rule__OrExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getAndExpressionConstraintAccess().getGroup(), "rule__AndExpressionConstraint__Group__0");
			builder.put(grammarAccess.getAndExpressionConstraintAccess().getGroup_1(), "rule__AndExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getExclusionExpressionConstraintAccess().getGroup(), "rule__ExclusionExpressionConstraint__Group__0");
			builder.put(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1(), "rule__ExclusionExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getRefinedExpressionConstraintAccess().getGroup(), "rule__RefinedExpressionConstraint__Group__0");
			builder.put(grammarAccess.getRefinedExpressionConstraintAccess().getGroup_1(), "rule__RefinedExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getDottedExpressionConstraintAccess().getGroup(), "rule__DottedExpressionConstraint__Group__0");
			builder.put(grammarAccess.getDottedExpressionConstraintAccess().getGroup_1(), "rule__DottedExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getChildOfAccess().getGroup(), "rule__ChildOf__Group__0");
			builder.put(grammarAccess.getChildOrSelfOfAccess().getGroup(), "rule__ChildOrSelfOf__Group__0");
			builder.put(grammarAccess.getDescendantOfAccess().getGroup(), "rule__DescendantOf__Group__0");
			builder.put(grammarAccess.getDescendantOrSelfOfAccess().getGroup(), "rule__DescendantOrSelfOf__Group__0");
			builder.put(grammarAccess.getParentOfAccess().getGroup(), "rule__ParentOf__Group__0");
			builder.put(grammarAccess.getParentOrSelfOfAccess().getGroup(), "rule__ParentOrSelfOf__Group__0");
			builder.put(grammarAccess.getAncestorOfAccess().getGroup(), "rule__AncestorOf__Group__0");
			builder.put(grammarAccess.getAncestorOrSelfOfAccess().getGroup(), "rule__AncestorOrSelfOf__Group__0");
			builder.put(grammarAccess.getMemberOfAccess().getGroup(), "rule__MemberOf__Group__0");
			builder.put(grammarAccess.getEclConceptReferenceAccess().getGroup(), "rule__EclConceptReference__Group__0");
			builder.put(grammarAccess.getAnyAccess().getGroup(), "rule__Any__Group__0");
			builder.put(grammarAccess.getOrRefinementAccess().getGroup(), "rule__OrRefinement__Group__0");
			builder.put(grammarAccess.getOrRefinementAccess().getGroup_1(), "rule__OrRefinement__Group_1__0");
			builder.put(grammarAccess.getOrRefinementAccess().getGroup_1_0(), "rule__OrRefinement__Group_1_0__0");
			builder.put(grammarAccess.getAndRefinementAccess().getGroup(), "rule__AndRefinement__Group__0");
			builder.put(grammarAccess.getAndRefinementAccess().getGroup_1(), "rule__AndRefinement__Group_1__0");
			builder.put(grammarAccess.getAndRefinementAccess().getGroup_1_0(), "rule__AndRefinement__Group_1_0__0");
			builder.put(grammarAccess.getNestedRefinementAccess().getGroup(), "rule__NestedRefinement__Group__0");
			builder.put(grammarAccess.getEclAttributeGroupAccess().getGroup(), "rule__EclAttributeGroup__Group__0");
			builder.put(grammarAccess.getOrAttributeSetAccess().getGroup(), "rule__OrAttributeSet__Group__0");
			builder.put(grammarAccess.getOrAttributeSetAccess().getGroup_1(), "rule__OrAttributeSet__Group_1__0");
			builder.put(grammarAccess.getAndAttributeSetAccess().getGroup(), "rule__AndAttributeSet__Group__0");
			builder.put(grammarAccess.getAndAttributeSetAccess().getGroup_1(), "rule__AndAttributeSet__Group_1__0");
			builder.put(grammarAccess.getNestedAttributeSetAccess().getGroup(), "rule__NestedAttributeSet__Group__0");
			builder.put(grammarAccess.getAttributeConstraintAccess().getGroup(), "rule__AttributeConstraint__Group__0");
			builder.put(grammarAccess.getCardinalityAccess().getGroup(), "rule__Cardinality__Group__0");
			builder.put(grammarAccess.getAttributeValueEqualsAccess().getGroup(), "rule__AttributeValueEquals__Group__0");
			builder.put(grammarAccess.getAttributeValueNotEqualsAccess().getGroup(), "rule__AttributeValueNotEquals__Group__0");
			builder.put(grammarAccess.getBooleanValueEqualsAccess().getGroup(), "rule__BooleanValueEquals__Group__0");
			builder.put(grammarAccess.getBooleanValueNotEqualsAccess().getGroup(), "rule__BooleanValueNotEquals__Group__0");
			builder.put(grammarAccess.getStringValueEqualsAccess().getGroup(), "rule__StringValueEquals__Group__0");
			builder.put(grammarAccess.getStringValueNotEqualsAccess().getGroup(), "rule__StringValueNotEquals__Group__0");
			builder.put(grammarAccess.getIntegerValueEqualsAccess().getGroup(), "rule__IntegerValueEquals__Group__0");
			builder.put(grammarAccess.getIntegerValueNotEqualsAccess().getGroup(), "rule__IntegerValueNotEquals__Group__0");
			builder.put(grammarAccess.getIntegerValueGreaterThanAccess().getGroup(), "rule__IntegerValueGreaterThan__Group__0");
			builder.put(grammarAccess.getIntegerValueLessThanAccess().getGroup(), "rule__IntegerValueLessThan__Group__0");
			builder.put(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGroup(), "rule__IntegerValueGreaterThanEquals__Group__0");
			builder.put(grammarAccess.getIntegerValueLessThanEqualsAccess().getGroup(), "rule__IntegerValueLessThanEquals__Group__0");
			builder.put(grammarAccess.getDecimalValueEqualsAccess().getGroup(), "rule__DecimalValueEquals__Group__0");
			builder.put(grammarAccess.getDecimalValueNotEqualsAccess().getGroup(), "rule__DecimalValueNotEquals__Group__0");
			builder.put(grammarAccess.getDecimalValueGreaterThanAccess().getGroup(), "rule__DecimalValueGreaterThan__Group__0");
			builder.put(grammarAccess.getDecimalValueLessThanAccess().getGroup(), "rule__DecimalValueLessThan__Group__0");
			builder.put(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGroup(), "rule__DecimalValueGreaterThanEquals__Group__0");
			builder.put(grammarAccess.getDecimalValueLessThanEqualsAccess().getGroup(), "rule__DecimalValueLessThanEquals__Group__0");
			builder.put(grammarAccess.getNestedExpressionAccess().getGroup(), "rule__NestedExpression__Group__0");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getGroup(), "rule__SnomedIdentifier__Group__0");
			builder.put(grammarAccess.getNonNegativeIntegerAccess().getGroup_1(), "rule__NonNegativeInteger__Group_1__0");
			builder.put(grammarAccess.getIntegerAccess().getGroup(), "rule__Integer__Group__0");
			builder.put(grammarAccess.getDecimalAccess().getGroup(), "rule__Decimal__Group__0");
			builder.put(grammarAccess.getNonNegativeDecimalAccess().getGroup(), "rule__NonNegativeDecimal__Group__0");
			builder.put(grammarAccess.getExpressionTemplateAccess().getPrimitiveAssignment_1_0_0_0(), "rule__ExpressionTemplate__PrimitiveAssignment_1_0_0_0");
			builder.put(grammarAccess.getExpressionTemplateAccess().getSlotAssignment_1_0_1(), "rule__ExpressionTemplate__SlotAssignment_1_0_1");
			builder.put(grammarAccess.getExpressionTemplateAccess().getExpressionAssignment_1_1(), "rule__ExpressionTemplate__ExpressionAssignment_1_1");
			builder.put(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_0(), "rule__SubExpression__FocusConceptsAssignment_0");
			builder.put(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_1_1(), "rule__SubExpression__FocusConceptsAssignment_1_1");
			builder.put(grammarAccess.getSubExpressionAccess().getRefinementAssignment_2_1(), "rule__SubExpression__RefinementAssignment_2_1");
			builder.put(grammarAccess.getFocusConceptAccess().getSlotAssignment_0(), "rule__FocusConcept__SlotAssignment_0");
			builder.put(grammarAccess.getFocusConceptAccess().getConceptAssignment_1(), "rule__FocusConcept__ConceptAssignment_1");
			builder.put(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_0(), "rule__Refinement__AttributesAssignment_0_0_0");
			builder.put(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_1_1(), "rule__Refinement__AttributesAssignment_0_0_1_1");
			builder.put(grammarAccess.getRefinementAccess().getGroupsAssignment_0_1(), "rule__Refinement__GroupsAssignment_0_1");
			builder.put(grammarAccess.getRefinementAccess().getGroupsAssignment_1_1(), "rule__Refinement__GroupsAssignment_1_1");
			builder.put(grammarAccess.getAttributeGroupAccess().getSlotAssignment_0(), "rule__AttributeGroup__SlotAssignment_0");
			builder.put(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_2(), "rule__AttributeGroup__AttributesAssignment_2");
			builder.put(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_3_1(), "rule__AttributeGroup__AttributesAssignment_3_1");
			builder.put(grammarAccess.getAttributeAccess().getSlotAssignment_0(), "rule__Attribute__SlotAssignment_0");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getValueAssignment_3(), "rule__Attribute__ValueAssignment_3");
			builder.put(grammarAccess.getConceptIdReplacementSlotAccess().getConstraintAssignment_4_1(), "rule__ConceptIdReplacementSlot__ConstraintAssignment_4_1");
			builder.put(grammarAccess.getConceptIdReplacementSlotAccess().getNameAssignment_5(), "rule__ConceptIdReplacementSlot__NameAssignment_5");
			builder.put(grammarAccess.getExpressionReplacementSlotAccess().getConstraintAssignment_4_1(), "rule__ExpressionReplacementSlot__ConstraintAssignment_4_1");
			builder.put(grammarAccess.getExpressionReplacementSlotAccess().getNameAssignment_5(), "rule__ExpressionReplacementSlot__NameAssignment_5");
			builder.put(grammarAccess.getTokenReplacementSlotAccess().getTokensAssignment_4_1(), "rule__TokenReplacementSlot__TokensAssignment_4_1");
			builder.put(grammarAccess.getTokenReplacementSlotAccess().getTokensAssignment_4_2(), "rule__TokenReplacementSlot__TokensAssignment_4_2");
			builder.put(grammarAccess.getTokenReplacementSlotAccess().getNameAssignment_5(), "rule__TokenReplacementSlot__NameAssignment_5");
			builder.put(grammarAccess.getTemplateInformationSlotAccess().getCardinalityAssignment_2(), "rule__TemplateInformationSlot__CardinalityAssignment_2");
			builder.put(grammarAccess.getTemplateInformationSlotAccess().getNameAssignment_3(), "rule__TemplateInformationSlot__NameAssignment_3");
			builder.put(grammarAccess.getStringReplacementSlotAccess().getValuesAssignment_4_1(), "rule__StringReplacementSlot__ValuesAssignment_4_1");
			builder.put(grammarAccess.getStringReplacementSlotAccess().getValuesAssignment_4_2(), "rule__StringReplacementSlot__ValuesAssignment_4_2");
			builder.put(grammarAccess.getStringReplacementSlotAccess().getNameAssignment_5(), "rule__StringReplacementSlot__NameAssignment_5");
			builder.put(grammarAccess.getIntegerReplacementSlotAccess().getValuesAssignment_4_1(), "rule__IntegerReplacementSlot__ValuesAssignment_4_1");
			builder.put(grammarAccess.getIntegerReplacementSlotAccess().getValuesAssignment_4_2(), "rule__IntegerReplacementSlot__ValuesAssignment_4_2");
			builder.put(grammarAccess.getIntegerReplacementSlotAccess().getNameAssignment_5(), "rule__IntegerReplacementSlot__NameAssignment_5");
			builder.put(grammarAccess.getDecimalReplacementSlotAccess().getValuesAssignment_4_1(), "rule__DecimalReplacementSlot__ValuesAssignment_4_1");
			builder.put(grammarAccess.getDecimalReplacementSlotAccess().getValuesAssignment_4_2(), "rule__DecimalReplacementSlot__ValuesAssignment_4_2");
			builder.put(grammarAccess.getDecimalReplacementSlotAccess().getNameAssignment_5(), "rule__DecimalReplacementSlot__NameAssignment_5");
			builder.put(grammarAccess.getEtlCardinalityAccess().getMinAssignment_1(), "rule__EtlCardinality__MinAssignment_1");
			builder.put(grammarAccess.getEtlCardinalityAccess().getMaxAssignment_3(), "rule__EtlCardinality__MaxAssignment_3");
			builder.put(grammarAccess.getConceptReferenceAccess().getSlotAssignment_0(), "rule__ConceptReference__SlotAssignment_0");
			builder.put(grammarAccess.getConceptReferenceAccess().getIdAssignment_1_0(), "rule__ConceptReference__IdAssignment_1_0");
			builder.put(grammarAccess.getConceptReferenceAccess().getTermAssignment_1_1(), "rule__ConceptReference__TermAssignment_1_1");
			builder.put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
			builder.put(grammarAccess.getIntegerValueAccess().getValueAssignment_1(), "rule__IntegerValue__ValueAssignment_1");
			builder.put(grammarAccess.getDecimalValueAccess().getValueAssignment_1(), "rule__DecimalValue__ValueAssignment_1");
			builder.put(grammarAccess.getSlotIntegerValueAccess().getValueAssignment_1(), "rule__SlotIntegerValue__ValueAssignment_1");
			builder.put(grammarAccess.getSlotIntegerRangeAccess().getMinimumAssignment_0_0(), "rule__SlotIntegerRange__MinimumAssignment_0_0");
			builder.put(grammarAccess.getSlotIntegerRangeAccess().getMaximumAssignment_0_2(), "rule__SlotIntegerRange__MaximumAssignment_0_2");
			builder.put(grammarAccess.getSlotIntegerRangeAccess().getMaximumAssignment_1_1(), "rule__SlotIntegerRange__MaximumAssignment_1_1");
			builder.put(grammarAccess.getSlotIntegerMinimumValueAccess().getExclusiveAssignment_0(), "rule__SlotIntegerMinimumValue__ExclusiveAssignment_0");
			builder.put(grammarAccess.getSlotIntegerMinimumValueAccess().getValueAssignment_2(), "rule__SlotIntegerMinimumValue__ValueAssignment_2");
			builder.put(grammarAccess.getSlotIntegerMaximumValueAccess().getExclusiveAssignment_0(), "rule__SlotIntegerMaximumValue__ExclusiveAssignment_0");
			builder.put(grammarAccess.getSlotIntegerMaximumValueAccess().getValueAssignment_2(), "rule__SlotIntegerMaximumValue__ValueAssignment_2");
			builder.put(grammarAccess.getSlotDecimalValueAccess().getValueAssignment_1(), "rule__SlotDecimalValue__ValueAssignment_1");
			builder.put(grammarAccess.getSlotDecimalRangeAccess().getMinimumAssignment_0_0(), "rule__SlotDecimalRange__MinimumAssignment_0_0");
			builder.put(grammarAccess.getSlotDecimalRangeAccess().getMaximumAssignment_0_2(), "rule__SlotDecimalRange__MaximumAssignment_0_2");
			builder.put(grammarAccess.getSlotDecimalRangeAccess().getMaximumAssignment_1_1(), "rule__SlotDecimalRange__MaximumAssignment_1_1");
			builder.put(grammarAccess.getSlotDecimalMinimumValueAccess().getExclusiveAssignment_0(), "rule__SlotDecimalMinimumValue__ExclusiveAssignment_0");
			builder.put(grammarAccess.getSlotDecimalMinimumValueAccess().getValueAssignment_2(), "rule__SlotDecimalMinimumValue__ValueAssignment_2");
			builder.put(grammarAccess.getSlotDecimalMaximumValueAccess().getExclusiveAssignment_0(), "rule__SlotDecimalMaximumValue__ExclusiveAssignment_0");
			builder.put(grammarAccess.getSlotDecimalMaximumValueAccess().getValueAssignment_2(), "rule__SlotDecimalMaximumValue__ValueAssignment_2");
			builder.put(grammarAccess.getScriptAccess().getConstraintAssignment_1(), "rule__Script__ConstraintAssignment_1");
			builder.put(grammarAccess.getOrExpressionConstraintAccess().getRightAssignment_1_2(), "rule__OrExpressionConstraint__RightAssignment_1_2");
			builder.put(grammarAccess.getAndExpressionConstraintAccess().getRightAssignment_1_2(), "rule__AndExpressionConstraint__RightAssignment_1_2");
			builder.put(grammarAccess.getExclusionExpressionConstraintAccess().getRightAssignment_1_2(), "rule__ExclusionExpressionConstraint__RightAssignment_1_2");
			builder.put(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementAssignment_1_2(), "rule__RefinedExpressionConstraint__RefinementAssignment_1_2");
			builder.put(grammarAccess.getDottedExpressionConstraintAccess().getAttributeAssignment_1_2(), "rule__DottedExpressionConstraint__AttributeAssignment_1_2");
			builder.put(grammarAccess.getChildOfAccess().getConstraintAssignment_1(), "rule__ChildOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getChildOrSelfOfAccess().getConstraintAssignment_1(), "rule__ChildOrSelfOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getDescendantOfAccess().getConstraintAssignment_1(), "rule__DescendantOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getDescendantOrSelfOfAccess().getConstraintAssignment_1(), "rule__DescendantOrSelfOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getParentOfAccess().getConstraintAssignment_1(), "rule__ParentOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getParentOrSelfOfAccess().getConstraintAssignment_1(), "rule__ParentOrSelfOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getAncestorOfAccess().getConstraintAssignment_1(), "rule__AncestorOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getAncestorOrSelfOfAccess().getConstraintAssignment_1(), "rule__AncestorOrSelfOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getMemberOfAccess().getConstraintAssignment_1(), "rule__MemberOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getEclConceptReferenceAccess().getIdAssignment_0(), "rule__EclConceptReference__IdAssignment_0");
			builder.put(grammarAccess.getEclConceptReferenceAccess().getTermAssignment_1(), "rule__EclConceptReference__TermAssignment_1");
			builder.put(grammarAccess.getOrRefinementAccess().getRightAssignment_1_0_2(), "rule__OrRefinement__RightAssignment_1_0_2");
			builder.put(grammarAccess.getAndRefinementAccess().getRightAssignment_1_0_2(), "rule__AndRefinement__RightAssignment_1_0_2");
			builder.put(grammarAccess.getNestedRefinementAccess().getNestedAssignment_1(), "rule__NestedRefinement__NestedAssignment_1");
			builder.put(grammarAccess.getEclAttributeGroupAccess().getCardinalityAssignment_0(), "rule__EclAttributeGroup__CardinalityAssignment_0");
			builder.put(grammarAccess.getEclAttributeGroupAccess().getRefinementAssignment_2(), "rule__EclAttributeGroup__RefinementAssignment_2");
			builder.put(grammarAccess.getOrAttributeSetAccess().getRightAssignment_1_2(), "rule__OrAttributeSet__RightAssignment_1_2");
			builder.put(grammarAccess.getAndAttributeSetAccess().getRightAssignment_1_2(), "rule__AndAttributeSet__RightAssignment_1_2");
			builder.put(grammarAccess.getNestedAttributeSetAccess().getNestedAssignment_1(), "rule__NestedAttributeSet__NestedAssignment_1");
			builder.put(grammarAccess.getAttributeConstraintAccess().getCardinalityAssignment_0(), "rule__AttributeConstraint__CardinalityAssignment_0");
			builder.put(grammarAccess.getAttributeConstraintAccess().getReversedAssignment_1(), "rule__AttributeConstraint__ReversedAssignment_1");
			builder.put(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment_2(), "rule__AttributeConstraint__AttributeAssignment_2");
			builder.put(grammarAccess.getAttributeConstraintAccess().getComparisonAssignment_3(), "rule__AttributeConstraint__ComparisonAssignment_3");
			builder.put(grammarAccess.getCardinalityAccess().getMinAssignment_1(), "rule__Cardinality__MinAssignment_1");
			builder.put(grammarAccess.getCardinalityAccess().getMaxAssignment_3(), "rule__Cardinality__MaxAssignment_3");
			builder.put(grammarAccess.getAttributeValueEqualsAccess().getConstraintAssignment_1(), "rule__AttributeValueEquals__ConstraintAssignment_1");
			builder.put(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintAssignment_1(), "rule__AttributeValueNotEquals__ConstraintAssignment_1");
			builder.put(grammarAccess.getBooleanValueEqualsAccess().getValueAssignment_1(), "rule__BooleanValueEquals__ValueAssignment_1");
			builder.put(grammarAccess.getBooleanValueNotEqualsAccess().getValueAssignment_1(), "rule__BooleanValueNotEquals__ValueAssignment_1");
			builder.put(grammarAccess.getStringValueEqualsAccess().getValueAssignment_1(), "rule__StringValueEquals__ValueAssignment_1");
			builder.put(grammarAccess.getStringValueNotEqualsAccess().getValueAssignment_1(), "rule__StringValueNotEquals__ValueAssignment_1");
			builder.put(grammarAccess.getIntegerValueEqualsAccess().getValueAssignment_2(), "rule__IntegerValueEquals__ValueAssignment_2");
			builder.put(grammarAccess.getIntegerValueNotEqualsAccess().getValueAssignment_2(), "rule__IntegerValueNotEquals__ValueAssignment_2");
			builder.put(grammarAccess.getIntegerValueGreaterThanAccess().getValueAssignment_2(), "rule__IntegerValueGreaterThan__ValueAssignment_2");
			builder.put(grammarAccess.getIntegerValueLessThanAccess().getValueAssignment_2(), "rule__IntegerValueLessThan__ValueAssignment_2");
			builder.put(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueAssignment_2(), "rule__IntegerValueGreaterThanEquals__ValueAssignment_2");
			builder.put(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueAssignment_2(), "rule__IntegerValueLessThanEquals__ValueAssignment_2");
			builder.put(grammarAccess.getDecimalValueEqualsAccess().getValueAssignment_2(), "rule__DecimalValueEquals__ValueAssignment_2");
			builder.put(grammarAccess.getDecimalValueNotEqualsAccess().getValueAssignment_2(), "rule__DecimalValueNotEquals__ValueAssignment_2");
			builder.put(grammarAccess.getDecimalValueGreaterThanAccess().getValueAssignment_2(), "rule__DecimalValueGreaterThan__ValueAssignment_2");
			builder.put(grammarAccess.getDecimalValueLessThanAccess().getValueAssignment_2(), "rule__DecimalValueLessThan__ValueAssignment_2");
			builder.put(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueAssignment_2(), "rule__DecimalValueGreaterThanEquals__ValueAssignment_2");
			builder.put(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueAssignment_2(), "rule__DecimalValueLessThanEquals__ValueAssignment_2");
			builder.put(grammarAccess.getNestedExpressionAccess().getNestedAssignment_1(), "rule__NestedExpression__NestedAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private EtlGrammarAccess grammarAccess;

	@Override
	protected InternalEtlParser createParser() {
		InternalEtlParser result = new InternalEtlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public EtlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EtlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
