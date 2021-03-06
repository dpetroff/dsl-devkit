/*
 * generated by Xtext
 */
package com.avaloq.tools.ddk.xtext.scope.serializer;

import com.avaloq.tools.ddk.xtext.expression.expression.BooleanLiteral;
import com.avaloq.tools.ddk.xtext.expression.expression.BooleanOperation;
import com.avaloq.tools.ddk.xtext.expression.expression.Case;
import com.avaloq.tools.ddk.xtext.expression.expression.CastedExpression;
import com.avaloq.tools.ddk.xtext.expression.expression.ChainExpression;
import com.avaloq.tools.ddk.xtext.expression.expression.CollectionExpression;
import com.avaloq.tools.ddk.xtext.expression.expression.ConstructorCallExpression;
import com.avaloq.tools.ddk.xtext.expression.expression.ExpressionPackage;
import com.avaloq.tools.ddk.xtext.expression.expression.FeatureCall;
import com.avaloq.tools.ddk.xtext.expression.expression.GlobalVarExpression;
import com.avaloq.tools.ddk.xtext.expression.expression.Identifier;
import com.avaloq.tools.ddk.xtext.expression.expression.IfExpression;
import com.avaloq.tools.ddk.xtext.expression.expression.IntegerLiteral;
import com.avaloq.tools.ddk.xtext.expression.expression.LetExpression;
import com.avaloq.tools.ddk.xtext.expression.expression.ListLiteral;
import com.avaloq.tools.ddk.xtext.expression.expression.NullLiteral;
import com.avaloq.tools.ddk.xtext.expression.expression.OperationCall;
import com.avaloq.tools.ddk.xtext.expression.expression.RealLiteral;
import com.avaloq.tools.ddk.xtext.expression.expression.StringLiteral;
import com.avaloq.tools.ddk.xtext.expression.expression.SwitchExpression;
import com.avaloq.tools.ddk.xtext.expression.expression.TypeSelectExpression;
import com.avaloq.tools.ddk.xtext.expression.serializer.ExpressionSemanticSequencer;
import com.avaloq.tools.ddk.xtext.scope.scope.Extension;
import com.avaloq.tools.ddk.xtext.scope.scope.FactoryExpression;
import com.avaloq.tools.ddk.xtext.scope.scope.GlobalScopeExpression;
import com.avaloq.tools.ddk.xtext.scope.scope.Import;
import com.avaloq.tools.ddk.xtext.scope.scope.Injection;
import com.avaloq.tools.ddk.xtext.scope.scope.LambdaDataExpression;
import com.avaloq.tools.ddk.xtext.scope.scope.MatchDataExpression;
import com.avaloq.tools.ddk.xtext.scope.scope.Naming;
import com.avaloq.tools.ddk.xtext.scope.scope.NamingDefinition;
import com.avaloq.tools.ddk.xtext.scope.scope.NamingExpression;
import com.avaloq.tools.ddk.xtext.scope.scope.NamingSection;
import com.avaloq.tools.ddk.xtext.scope.scope.ScopeContext;
import com.avaloq.tools.ddk.xtext.scope.scope.ScopeDefinition;
import com.avaloq.tools.ddk.xtext.scope.scope.ScopeDelegation;
import com.avaloq.tools.ddk.xtext.scope.scope.ScopeModel;
import com.avaloq.tools.ddk.xtext.scope.scope.ScopePackage;
import com.avaloq.tools.ddk.xtext.scope.scope.ScopeRule;
import com.avaloq.tools.ddk.xtext.scope.scope.SimpleScopeExpression;
import com.avaloq.tools.ddk.xtext.scope.services.ScopeGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractScopeSemanticSequencer extends ExpressionSemanticSequencer {

	@Inject
	private ScopeGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExpressionPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExpressionPackage.BOOLEAN_LITERAL:
				sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
				return; 
			case ExpressionPackage.BOOLEAN_OPERATION:
				sequence_AndExpression_ImpliesExpression_OrExpression_RelationalExpression(context, (BooleanOperation) semanticObject); 
				return; 
			case ExpressionPackage.CASE:
				sequence_Case(context, (Case) semanticObject); 
				return; 
			case ExpressionPackage.CASTED_EXPRESSION:
				sequence_CastedExpression(context, (CastedExpression) semanticObject); 
				return; 
			case ExpressionPackage.CHAIN_EXPRESSION:
				sequence_ChainExpression(context, (ChainExpression) semanticObject); 
				return; 
			case ExpressionPackage.COLLECTION_EXPRESSION:
				if(context == grammarAccess.getCollectionExpressionRule() ||
				   context == grammarAccess.getFeatureCallRule()) {
					sequence_CollectionExpression(context, (CollectionExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getOperationCallParamsAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getChainExpressionRule() ||
				   context == grammarAccess.getChainExpressionAccess().getChainExpressionFirstAction_1_0() ||
				   context == grammarAccess.getChainedExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfExpressionTriRule() ||
				   context == grammarAccess.getIfExpressionTriAccess().getIfExpressionConditionAction_1_0() ||
				   context == grammarAccess.getImpliesExpressionRule() ||
				   context == grammarAccess.getImpliesExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getInfixExpressionRule() ||
				   context == grammarAccess.getInfixExpressionAccess().getCollectionExpressionTargetAction_1_3_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getFeatureCallTargetAction_1_1_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getOperationCallTargetAction_1_0_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getTypeSelectExpressionTargetAction_1_2_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getOperationCallParamsAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getParanthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getSyntaxElementRule() ||
				   context == grammarAccess.getUnaryOrInfixExpressionRule()) {
					sequence_CollectionExpression_InfixExpression(context, (CollectionExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.CONSTRUCTOR_CALL_EXPRESSION:
				sequence_ConstructorCallExpression(context, (ConstructorCallExpression) semanticObject); 
				return; 
			case ExpressionPackage.FEATURE_CALL:
				if(context == grammarAccess.getFeatureCallRule()) {
					sequence_FeatureCall(context, (FeatureCall) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getOperationCallParamsAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getChainExpressionRule() ||
				   context == grammarAccess.getChainExpressionAccess().getChainExpressionFirstAction_1_0() ||
				   context == grammarAccess.getChainedExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfExpressionTriRule() ||
				   context == grammarAccess.getIfExpressionTriAccess().getIfExpressionConditionAction_1_0() ||
				   context == grammarAccess.getImpliesExpressionRule() ||
				   context == grammarAccess.getImpliesExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getInfixExpressionRule() ||
				   context == grammarAccess.getInfixExpressionAccess().getCollectionExpressionTargetAction_1_3_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getFeatureCallTargetAction_1_1_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getOperationCallTargetAction_1_0_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getTypeSelectExpressionTargetAction_1_2_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getOperationCallParamsAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getParanthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getSyntaxElementRule() ||
				   context == grammarAccess.getUnaryOrInfixExpressionRule()) {
					sequence_FeatureCall_InfixExpression(context, (FeatureCall) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.GLOBAL_VAR_EXPRESSION:
				sequence_GlobalVarExpression(context, (GlobalVarExpression) semanticObject); 
				return; 
			case ExpressionPackage.IDENTIFIER:
				if(context == grammarAccess.getCollectionTypeRule()) {
					sequence_CollectionType(context, (Identifier) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSyntaxElementRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_CollectionType_SimpleType_Type(context, (Identifier) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimpleTypeRule()) {
					sequence_SimpleType(context, (Identifier) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.IF_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getOperationCallParamsAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getChainExpressionRule() ||
				   context == grammarAccess.getChainExpressionAccess().getChainExpressionFirstAction_1_0() ||
				   context == grammarAccess.getChainedExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfExpressionTriRule() ||
				   context == grammarAccess.getIfExpressionTriAccess().getIfExpressionConditionAction_1_0() ||
				   context == grammarAccess.getImpliesExpressionRule() ||
				   context == grammarAccess.getImpliesExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getInfixExpressionRule() ||
				   context == grammarAccess.getInfixExpressionAccess().getCollectionExpressionTargetAction_1_3_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getFeatureCallTargetAction_1_1_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getOperationCallTargetAction_1_0_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getTypeSelectExpressionTargetAction_1_2_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getOperationCallParamsAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getParanthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getSyntaxElementRule() ||
				   context == grammarAccess.getUnaryOrInfixExpressionRule()) {
					sequence_ChainedExpression_IfExpressionKw_IfExpressionTri(context, (IfExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getIfExpressionKwRule()) {
					sequence_IfExpressionKw(context, (IfExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.INTEGER_LITERAL:
				sequence_IntegerLiteral(context, (IntegerLiteral) semanticObject); 
				return; 
			case ExpressionPackage.LET_EXPRESSION:
				sequence_LetExpression(context, (LetExpression) semanticObject); 
				return; 
			case ExpressionPackage.LIST_LITERAL:
				sequence_ListLiteral(context, (ListLiteral) semanticObject); 
				return; 
			case ExpressionPackage.NULL_LITERAL:
				sequence_NullLiteral(context, (NullLiteral) semanticObject); 
				return; 
			case ExpressionPackage.OPERATION_CALL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getOperationCallParamsAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getChainExpressionRule() ||
				   context == grammarAccess.getChainExpressionAccess().getChainExpressionFirstAction_1_0() ||
				   context == grammarAccess.getChainedExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfExpressionTriRule() ||
				   context == grammarAccess.getIfExpressionTriAccess().getIfExpressionConditionAction_1_0() ||
				   context == grammarAccess.getImpliesExpressionRule() ||
				   context == grammarAccess.getImpliesExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getInfixExpressionRule() ||
				   context == grammarAccess.getInfixExpressionAccess().getCollectionExpressionTargetAction_1_3_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getFeatureCallTargetAction_1_1_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getOperationCallTargetAction_1_0_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getTypeSelectExpressionTargetAction_1_2_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getOperationCallParamsAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getParanthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getSyntaxElementRule() ||
				   context == grammarAccess.getUnaryOrInfixExpressionRule()) {
					sequence_AdditiveExpression_InfixExpression_MultiplicativeExpression_OperationCall_UnaryExpression_UnaryOrInfixExpression(context, (OperationCall) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureCallRule() ||
				   context == grammarAccess.getOperationCallRule()) {
					sequence_OperationCall(context, (OperationCall) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getUnaryExpressionRule()) {
					sequence_UnaryExpression(context, (OperationCall) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.REAL_LITERAL:
				sequence_RealLiteral(context, (RealLiteral) semanticObject); 
				return; 
			case ExpressionPackage.STRING_LITERAL:
				sequence_StringLiteral(context, (StringLiteral) semanticObject); 
				return; 
			case ExpressionPackage.SWITCH_EXPRESSION:
				sequence_SwitchExpression(context, (SwitchExpression) semanticObject); 
				return; 
			case ExpressionPackage.TYPE_SELECT_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getOperationCallParamsAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getChainExpressionRule() ||
				   context == grammarAccess.getChainExpressionAccess().getChainExpressionFirstAction_1_0() ||
				   context == grammarAccess.getChainedExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfExpressionTriRule() ||
				   context == grammarAccess.getIfExpressionTriAccess().getIfExpressionConditionAction_1_0() ||
				   context == grammarAccess.getImpliesExpressionRule() ||
				   context == grammarAccess.getImpliesExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getInfixExpressionRule() ||
				   context == grammarAccess.getInfixExpressionAccess().getCollectionExpressionTargetAction_1_3_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getFeatureCallTargetAction_1_1_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getOperationCallTargetAction_1_0_0() ||
				   context == grammarAccess.getInfixExpressionAccess().getTypeSelectExpressionTargetAction_1_2_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getOperationCallParamsAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getParanthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getSyntaxElementRule() ||
				   context == grammarAccess.getUnaryOrInfixExpressionRule()) {
					sequence_InfixExpression_TypeSelectExpression(context, (TypeSelectExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureCallRule() ||
				   context == grammarAccess.getTypeSelectExpressionRule()) {
					sequence_TypeSelectExpression(context, (TypeSelectExpression) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ScopePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ScopePackage.EXTENSION:
				sequence_Extension(context, (Extension) semanticObject); 
				return; 
			case ScopePackage.FACTORY_EXPRESSION:
				if(context == grammarAccess.getFactoryExpressionRule()) {
					sequence_FactoryExpression(context, (FactoryExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScopeExpressionRule()) {
					sequence_FactoryExpression_ScopeExpression(context, (FactoryExpression) semanticObject); 
					return; 
				}
				else break;
			case ScopePackage.GLOBAL_SCOPE_EXPRESSION:
				if(context == grammarAccess.getGlobalScopeExpressionRule()) {
					sequence_GlobalScopeExpression(context, (GlobalScopeExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNamedScopeExpressionRule()) {
					sequence_GlobalScopeExpression_NamedScopeExpression(context, (GlobalScopeExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScopeExpressionRule()) {
					sequence_GlobalScopeExpression_NamedScopeExpression_ScopeExpression(context, (GlobalScopeExpression) semanticObject); 
					return; 
				}
				else break;
			case ScopePackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case ScopePackage.INJECTION:
				sequence_Injection(context, (Injection) semanticObject); 
				return; 
			case ScopePackage.LAMBDA_DATA_EXPRESSION:
				sequence_LambdaDataExpression(context, (LambdaDataExpression) semanticObject); 
				return; 
			case ScopePackage.MATCH_DATA_EXPRESSION:
				sequence_MatchDataExpression(context, (MatchDataExpression) semanticObject); 
				return; 
			case ScopePackage.NAMING:
				sequence_Naming(context, (Naming) semanticObject); 
				return; 
			case ScopePackage.NAMING_DEFINITION:
				sequence_NamingDefinition(context, (NamingDefinition) semanticObject); 
				return; 
			case ScopePackage.NAMING_EXPRESSION:
				sequence_NamingExpression(context, (NamingExpression) semanticObject); 
				return; 
			case ScopePackage.NAMING_SECTION:
				sequence_NamingSection(context, (NamingSection) semanticObject); 
				return; 
			case ScopePackage.SCOPE_CONTEXT:
				sequence_ScopeContext(context, (ScopeContext) semanticObject); 
				return; 
			case ScopePackage.SCOPE_DEFINITION:
				sequence_ScopeDefinition(context, (ScopeDefinition) semanticObject); 
				return; 
			case ScopePackage.SCOPE_DELEGATION:
				if(context == grammarAccess.getScopeDelegationRule()) {
					sequence_ScopeDelegation(context, (ScopeDelegation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScopeExpressionRule()) {
					sequence_ScopeDelegation_ScopeExpression(context, (ScopeDelegation) semanticObject); 
					return; 
				}
				else break;
			case ScopePackage.SCOPE_MODEL:
				sequence_ScopeModel(context, (ScopeModel) semanticObject); 
				return; 
			case ScopePackage.SCOPE_RULE:
				sequence_ScopeRule(context, (ScopeRule) semanticObject); 
				return; 
			case ScopePackage.SIMPLE_SCOPE_EXPRESSION:
				if(context == grammarAccess.getScopeExpressionRule()) {
					sequence_NamedScopeExpression_ScopeExpression_SimpleScopeExpression(context, (SimpleScopeExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNamedScopeExpressionRule()) {
					sequence_NamedScopeExpression_SimpleScopeExpression(context, (SimpleScopeExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimpleScopeExpressionRule()) {
					sequence_SimpleScopeExpression(context, (SimpleScopeExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     extension=QualifiedID
	 */
	protected void sequence_Extension(EObject context, Extension semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScopePackage.Literals.EXTENSION__EXTENSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScopePackage.Literals.EXTENSION__EXTENSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExtensionAccess().getExtensionQualifiedIDParserRuleCall_1_0(), semanticObject.getExtension());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_FactoryExpression(EObject context, FactoryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expression prune=Expression?)
	 */
	protected void sequence_FactoryExpression_ScopeExpression(EObject context, FactoryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type=[EClass|QualifiedID] 
	 *         (name=Expression | (recursivePrefix?='recursive'? prefix=Expression))? 
	 *         (data+=DataExpression data+=DataExpression*)? 
	 *         (domains+='*' | domains+=Identifier | (domains+=Identifier domains+=Identifier*))?
	 *     )
	 */
	protected void sequence_GlobalScopeExpression(EObject context, GlobalScopeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type=[EClass|QualifiedID] 
	 *         (name=Expression | (recursivePrefix?='recursive'? prefix=Expression))? 
	 *         (data+=DataExpression data+=DataExpression*)? 
	 *         (domains+='*' | domains+=Identifier | (domains+=Identifier domains+=Identifier*))? 
	 *         (caseDef?='case' casing=Casing)? 
	 *         naming=Naming?
	 *     )
	 */
	protected void sequence_GlobalScopeExpression_NamedScopeExpression(EObject context, GlobalScopeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type=[EClass|QualifiedID] 
	 *         (name=Expression | (recursivePrefix?='recursive'? prefix=Expression))? 
	 *         (data+=DataExpression data+=DataExpression*)? 
	 *         (domains+='*' | domains+=Identifier | (domains+=Identifier domains+=Identifier*))? 
	 *         (caseDef?='case' casing=Casing)? 
	 *         naming=Naming? 
	 *         prune=Expression?
	 *     )
	 */
	protected void sequence_GlobalScopeExpression_NamedScopeExpression_ScopeExpression(EObject context, GlobalScopeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (package=[EPackage|STRING] name=Identifier?)
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=DottedID name=Identifier)
	 */
	protected void sequence_Injection(EObject context, Injection semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScopePackage.Literals.INJECTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScopePackage.Literals.INJECTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, ScopePackage.Literals.INJECTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScopePackage.Literals.INJECTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInjectionAccess().getTypeDottedIDParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInjectionAccess().getNameIdentifierParserRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (desc=Identifier value=Expression)
	 */
	protected void sequence_LambdaDataExpression(EObject context, LambdaDataExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScopePackage.Literals.DATA_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScopePackage.Literals.DATA_EXPRESSION__VALUE));
			if(transientValues.isValueTransient(semanticObject, ScopePackage.Literals.LAMBDA_DATA_EXPRESSION__DESC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScopePackage.Literals.LAMBDA_DATA_EXPRESSION__DESC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLambdaDataExpressionAccess().getDescIdentifierParserRuleCall_1_0(), semanticObject.getDesc());
		feeder.accept(grammarAccess.getLambdaDataExpressionAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (key=Identifier value=Expression)
	 */
	protected void sequence_MatchDataExpression(EObject context, MatchDataExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScopePackage.Literals.DATA_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScopePackage.Literals.DATA_EXPRESSION__VALUE));
			if(transientValues.isValueTransient(semanticObject, ScopePackage.Literals.MATCH_DATA_EXPRESSION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScopePackage.Literals.MATCH_DATA_EXPRESSION__KEY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatchDataExpressionAccess().getKeyIdentifierParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getMatchDataExpressionAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expression (caseDef?='case' casing=Casing)? naming=Naming? prune=Expression?)
	 */
	protected void sequence_NamedScopeExpression_ScopeExpression_SimpleScopeExpression(EObject context, SimpleScopeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expression (caseDef?='case' casing=Casing)? naming=Naming?)
	 */
	protected void sequence_NamedScopeExpression_SimpleScopeExpression(EObject context, SimpleScopeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[EClass|QualifiedID] naming=Naming)
	 */
	protected void sequence_NamingDefinition(EObject context, NamingDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScopePackage.Literals.NAMING_DEFINITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScopePackage.Literals.NAMING_DEFINITION__TYPE));
			if(transientValues.isValueTransient(semanticObject, ScopePackage.Literals.NAMING_DEFINITION__NAMING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScopePackage.Literals.NAMING_DEFINITION__NAMING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamingDefinitionAccess().getTypeEClassQualifiedIDParserRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getNamingDefinitionAccess().getNamingNamingParserRuleCall_2_0(), semanticObject.getNaming());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (export?='export' | (factory?='factory'? expression=Expression))
	 */
	protected void sequence_NamingExpression(EObject context, NamingExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (casing=Casing? namings+=NamingDefinition*)
	 */
	protected void sequence_NamingSection(EObject context, NamingSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((names+=NamingExpression names+=NamingExpression*) | names+=NamingExpression)
	 */
	protected void sequence_Naming(EObject context, Naming semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((global?='*' | contextType=[EClass|QualifiedID]) guard=Expression?)
	 */
	protected void sequence_ScopeContext(EObject context, ScopeContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier? (targetType=[EClass|QualifiedID] | (contextType=[EClass|QualifiedID] reference=[EReference|Identifier])) rules+=ScopeRule+)
	 */
	protected void sequence_ScopeDefinition(EObject context, ScopeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((delegate=Expression | external=GlobalScopeExpression) scope=[ScopeDefinition|Identifier]?)
	 */
	protected void sequence_ScopeDelegation(EObject context, ScopeDelegation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((delegate=Expression | external=GlobalScopeExpression) scope=[ScopeDefinition|Identifier]? prune=Expression?)
	 */
	protected void sequence_ScopeDelegation_ScopeExpression(EObject context, ScopeDelegation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=DottedID 
	 *         includedScopes+=[ScopeModel|DottedID]? 
	 *         imports+=Import* 
	 *         extensions+=Extension* 
	 *         injections+=Injection* 
	 *         naming=NamingSection? 
	 *         scopes+=ScopeDefinition*
	 *     )
	 */
	protected void sequence_ScopeModel(EObject context, ScopeModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (context=ScopeContext exprs+=ScopeExpression exprs+=ScopeExpression*)
	 */
	protected void sequence_ScopeRule(EObject context, ScopeRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_SimpleScopeExpression(EObject context, SimpleScopeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
