// Generated from /Users/yashbhalla/Documents/GitHub/Delphi-Pascal_Interpreter/src/delphi.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link delphiParser}.
 */
public interface delphiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link delphiParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(delphiParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(delphiParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(delphiParser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(delphiParser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#typeSection}.
	 * @param ctx the parse tree
	 */
	void enterTypeSection(delphiParser.TypeSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#typeSection}.
	 * @param ctx the parse tree
	 */
	void exitTypeSection(delphiParser.TypeSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(delphiParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(delphiParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(delphiParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(delphiParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(delphiParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(delphiParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void enterClassBlock(delphiParser.ClassBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void exitClassBlock(delphiParser.ClassBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#variablesSection}.
	 * @param ctx the parse tree
	 */
	void enterVariablesSection(delphiParser.VariablesSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#variablesSection}.
	 * @param ctx the parse tree
	 */
	void exitVariablesSection(delphiParser.VariablesSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(delphiParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(delphiParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(delphiParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(delphiParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#methodList}.
	 * @param ctx the parse tree
	 */
	void enterMethodList(delphiParser.MethodListContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#methodList}.
	 * @param ctx the parse tree
	 */
	void exitMethodList(delphiParser.MethodListContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(delphiParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(delphiParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(delphiParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(delphiParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#destructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDestructorDeclaration(delphiParser.DestructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#destructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDestructorDeclaration(delphiParser.DestructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#objectInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterObjectInstantiation(delphiParser.ObjectInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#objectInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitObjectInstantiation(delphiParser.ObjectInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(delphiParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(delphiParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(delphiParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(delphiParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(delphiParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(delphiParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(delphiParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(delphiParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#procedureAndFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclaration(delphiParser.ProcedureAndFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#procedureAndFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclaration(delphiParser.ProcedureAndFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(delphiParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(delphiParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(delphiParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(delphiParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void enterActualParameterList(delphiParser.ActualParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void exitActualParameterList(delphiParser.ActualParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(delphiParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(delphiParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(delphiParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(delphiParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(delphiParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(delphiParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(delphiParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(delphiParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(delphiParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(delphiParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#statementSequence}.
	 * @param ctx the parse tree
	 */
	void enterStatementSequence(delphiParser.StatementSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#statementSequence}.
	 * @param ctx the parse tree
	 */
	void exitStatementSequence(delphiParser.StatementSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(delphiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(delphiParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(delphiParser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(delphiParser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(delphiParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(delphiParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(delphiParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(delphiParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(delphiParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(delphiParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(delphiParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(delphiParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#writeParameter}.
	 * @param ctx the parse tree
	 */
	void enterWriteParameter(delphiParser.WriteParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#writeParameter}.
	 * @param ctx the parse tree
	 */
	void exitWriteParameter(delphiParser.WriteParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(delphiParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(delphiParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(delphiParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(delphiParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(delphiParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(delphiParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(delphiParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(delphiParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(delphiParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(delphiParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(delphiParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(delphiParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(delphiParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(delphiParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(delphiParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(delphiParser.BlockContext ctx);
}